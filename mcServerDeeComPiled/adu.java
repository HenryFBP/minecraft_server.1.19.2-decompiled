import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class adu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("recipe").requires($$0x -> $$0x.c(2)))
               .then(
                  ds.a("give")
                     .then(
                        ((RequiredArgumentBuilder)ds.a("targets", eb.d())
                              .then(
                                 ds.a("recipe", eq.a())
                                    .suggests(gj.b)
                                    .executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), Collections.singleton(eq.b($$0x, "recipe"))))
                              ))
                           .then(ds.a("*").executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), ((dr)$$0x.getSource()).m().aE().b())))
                     )
               ))
            .then(
               ds.a("take")
                  .then(
                     ((RequiredArgumentBuilder)ds.a("targets", eb.d())
                           .then(
                              ds.a("recipe", eq.a())
                                 .suggests(gj.b)
                                 .executes($$0x -> b((dr)$$0x.getSource(), eb.f($$0x, "targets"), Collections.singleton(eq.b($$0x, "recipe"))))
                           ))
                        .then(ds.a("*").executes($$0x -> b((dr)$$0x.getSource(), eb.f($$0x, "targets"), ((dr)$$0x.getSource()).m().aE().b())))
                  )
            )
      );
   }

   private static int a(dr $$0, Collection<agh> $$1, Collection<cdp<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for(agh $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(rq.a("commands.recipe.give.success.single", $$2.size(), ((agh)$$1.iterator().next()).C_()), true);
         } else {
            $$0.a(rq.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(dr $$0, Collection<agh> $$1, Collection<cdp<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for(agh $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(rq.a("commands.recipe.take.success.single", $$2.size(), ((agh)$$1.iterator().next()).C_()), true);
         } else {
            $$0.a(rq.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
