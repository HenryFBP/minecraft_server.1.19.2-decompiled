import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aev {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ds.a("clear").executes($$0x -> a((dr)$$0x.getSource(), ImmutableList.of(((dr)$$0x.getSource()).i())))))
            .then(
               ds.a("set")
                  .then(
                     ds.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((dr)$$0x.getSource(), ImmutableList.of(((dr)$$0x.getSource()).i()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(dr $$0, Collection<? extends buc> $$1, int $$2) {
      for(buc $$3 : $$1) {
         $$3.fK().a($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(rq.a("commands.warden_spawn_tracker.set.success.single", ((buc)$$1.iterator().next()).C_()), true);
      } else {
         $$0.a(rq.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dr $$0, Collection<? extends buc> $$1) {
      for(buc $$2 : $$1) {
         $$2.fK().b();
      }

      if ($$1.size() == 1) {
         $$0.a(rq.a("commands.warden_spawn_tracker.clear.success.single", ((buc)$$1.iterator().next()).C_()), true);
      } else {
         $$0.a(rq.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
