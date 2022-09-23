import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class acn {
   public static void a(CommandDispatcher<dr> $$0) {
      LiteralArgumentBuilder<dr> $$1 = (LiteralArgumentBuilder)ds.a("debugmobspawning").requires($$0x -> $$0x.c(2));

      for(bcf $$2 : bcf.values()) {
         $$1.then(ds.a($$2.a()).then(ds.a("at", fh.a()).executes($$1x -> a((dr)$$1x.getSource(), $$2, fh.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(dr $$0, bcf $$1, gt $$2) {
      chi.a($$1, $$0.f(), $$2);
      return 1;
   }
}
