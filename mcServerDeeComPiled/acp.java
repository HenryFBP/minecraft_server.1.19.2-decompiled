import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class acp {
   public static void a(CommandDispatcher<dr> $$0) {
      LiteralArgumentBuilder<dr> $$1 = (LiteralArgumentBuilder)ds.a("defaultgamemode").requires($$0x -> $$0x.c(2));

      for(cgu $$2 : cgu.values()) {
         $$1.then(ds.a($$2.b()).executes($$1x -> a((dr)$$1x.getSource(), $$2)));
      }

      $$0.register($$1);
   }

   private static int a(dr $$0, cgu $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.m();
      $$3.a($$1);
      cgu $$4 = $$3.aY();
      if ($$4 != null) {
         for(agh $$5 : $$3.ac().t()) {
            if ($$5.a($$4)) {
               ++$$2;
            }
         }
      }

      $$0.a(rq.a("commands.defaultgamemode.success", $$1.c()), true);
      return $$2;
   }
}
