import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aed {
   public static void a(CommandDispatcher<dr> $$0, boolean $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("seed").requires($$1x -> !$$1 || $$1x.c(2)))
            .executes(
               $$0x -> {
                  long $$1x = ((dr)$$0x.getSource()).f().B();
                  rq $$2 = rs.a(
                     (rq)rq.b(String.valueOf($$1x))
                        .a($$1xx -> $$1xx.a(p.k).a(new ro(ro.a.f, String.valueOf($$1x))).a(new rv(rv.a.a, rq.c("chat.copy.click"))).a(String.valueOf($$1x)))
                  );
                  ((dr)$$0x.getSource()).a(rq.a("commands.seed.success", $$2), false);
                  return (int)$$1x;
               }
            )
      );
   }
}
