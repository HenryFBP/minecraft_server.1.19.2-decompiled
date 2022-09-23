import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aer {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ds.a("targets", eb.d()).then(ds.a("message", dx.a()).executes($$0x -> {
               int $$1 = 0;
      
               for(agh $$2 : eb.f($$0x, "targets")) {
                  $$2.b(rs.a((dr)$$0x.getSource(), dx.a($$0x, "message"), $$2, 0), false);
                  ++$$1;
               }
      
               return $$1;
            })))
      );
   }
}
