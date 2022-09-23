import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class adf {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ds.a("targets", eb.d())
                     .executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), rq.c("multiplayer.disconnect.kicked"))))
                  .then(ds.a("reason", ef.a()).executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), ef.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dr $$0, Collection<agh> $$1, rq $$2) {
      for(agh $$3 : $$1) {
         $$3.b.b($$2);
         $$0.a(rq.a("commands.kick.success", $$3.C_(), $$2), true);
      }

      return $$1.size();
   }
}
