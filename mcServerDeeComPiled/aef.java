import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aef {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("setidletimeout").requires($$0x -> $$0x.c(3)))
            .then(ds.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(dr $$0, int $$1) {
      $$0.m().c($$1);
      $$0.a(rq.a("commands.setidletimeout.success", $$1), true);
      return $$1;
   }
}
