import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class adg {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dr)$$0x.getSource(), ImmutableList.of(((dr)$$0x.getSource()).h()))))
            .then(ds.a("targets", eb.b()).executes($$0x -> a((dr)$$0x.getSource(), eb.b($$0x, "targets"))))
      );
   }

   private static int a(dr $$0, Collection<? extends bbn> $$1) {
      for(bbn $$2 : $$1) {
         $$2.ag();
      }

      if ($$1.size() == 1) {
         $$0.a(rq.a("commands.kill.success.single", ((bbn)$$1.iterator().next()).C_()), true);
      } else {
         $$0.a(rq.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
