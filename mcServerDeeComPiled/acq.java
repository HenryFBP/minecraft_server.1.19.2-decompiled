import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class acq {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> rq.a("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<dr> $$0) {
      LiteralArgumentBuilder<dr> $$1 = ds.a("difficulty");

      for(bag $$2 : bag.values()) {
         $$1.then(ds.a($$2.c()).executes($$1x -> a((dr)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires($$0x -> $$0x.c(2))).executes($$0x -> {
         bag $$1x = ((dr)$$0x.getSource()).f().ag();
         ((dr)$$0x.getSource()).a(rq.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(dr $$0, bag $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.m();
      if ($$2.aW().s() == $$1) {
         throw a.create($$1.c());
      } else {
         $$2.a($$1, true);
         $$0.a(rq.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
