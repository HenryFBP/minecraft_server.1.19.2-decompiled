import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aet {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a(
                                    "targets", eb.d()
                                 )
                                 .then(ds.a("clear").executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets")))))
                              .then(ds.a("reset").executes($$0x -> b((dr)$$0x.getSource(), eb.f($$0x, "targets")))))
                           .then(
                              ds.a("title")
                                 .then(
                                    ds.a("title", dx.a())
                                       .executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), dx.a($$0x, "title"), "title", wv::new))
                                 )
                           ))
                        .then(
                           ds.a("subtitle")
                              .then(
                                 ds.a("title", dx.a())
                                    .executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), dx.a($$0x, "title"), "subtitle", wt::new))
                              )
                        ))
                     .then(
                        ds.a("actionbar")
                           .then(
                              ds.a("title", dx.a())
                                 .executes($$0x -> a((dr)$$0x.getSource(), eb.f($$0x, "targets"), dx.a($$0x, "title"), "actionbar", vv::new))
                           )
                     ))
                  .then(
                     ds.a("times")
                        .then(
                           ds.a("fadeIn", IntegerArgumentType.integer(0))
                              .then(
                                 ds.a("stay", IntegerArgumentType.integer(0))
                                    .then(
                                       ds.a("fadeOut", IntegerArgumentType.integer(0))
                                          .executes(
                                             $$0x -> a(
                                                   (dr)$$0x.getSource(),
                                                   eb.f($$0x, "targets"),
                                                   IntegerArgumentType.getInteger($$0x, "fadeIn"),
                                                   IntegerArgumentType.getInteger($$0x, "stay"),
                                                   IntegerArgumentType.getInteger($$0x, "fadeOut")
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dr $$0, Collection<agh> $$1) {
      tt $$2 = new tt(false);

      for(agh $$3 : $$1) {
         $$3.b.a($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(rq.a("commands.title.cleared.single", ((agh)$$1.iterator().next()).C_()), true);
      } else {
         $$0.a(rq.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(dr $$0, Collection<agh> $$1) {
      tt $$2 = new tt(true);

      for(agh $$3 : $$1) {
         $$3.b.a($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(rq.a("commands.title.reset.single", ((agh)$$1.iterator().next()).C_()), true);
      } else {
         $$0.a(rq.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dr $$0, Collection<agh> $$1, rq $$2, String $$3, Function<rq, tc<?>> $$4) throws CommandSyntaxException {
      for(agh $$5 : $$1) {
         $$5.b.a((tc<?>)$$4.apply(rs.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(rq.a("commands.title.show." + $$3 + ".single", ((agh)$$1.iterator().next()).C_()), true);
      } else {
         $$0.a(rq.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dr $$0, Collection<agh> $$1, int $$2, int $$3, int $$4) {
      ww $$5 = new ww($$2, $$3, $$4);

      for(agh $$6 : $$1) {
         $$6.b.a($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(rq.a("commands.title.times.single", ((agh)$$1.iterator().next()).C_()), true);
      } else {
         $$0.a(rq.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
