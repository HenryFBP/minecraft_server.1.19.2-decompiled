import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aeg {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dr)$$0x.getSource(), Collections.singleton(((dr)$$0x.getSource()).i()), new gt(((dr)$$0x.getSource()).e()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ds.a("targets", eb.d())
                     .executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), new gt(((dr)$$0x.getSource()).e()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ds.a("pos", fh.a()).executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), fh.b($$0x, "pos"), 0.0F)))
                        .then(ds.a("angle", du.a()).executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), fh.b($$0x, "pos"), du.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(dr $$0, Collection<agh> $$1, gt $$2, float $$3) {
      aba<cgx> $$4 = $$0.f().ab();

      for(agh $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(rq.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, ((agh)$$1.iterator().next()).C_()), true);
      } else {
         $$0.a(rq.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
