import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class acu {
   private static final int a = 32768;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> rq.a("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(rq.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> rq.a("commands.execute.conditional.fail_count", $$0));
   private static final BinaryOperator<ResultConsumer<dr>> e = ($$0, $$1) -> ($$2, $$3, $$4) -> {
         $$0.onCommandComplete($$2, $$3, $$4);
         $$1.onCommandComplete($$2, $$3, $$4);
      };
   private static final SuggestionProvider<dr> f = ($$0, $$1) -> {
      dsi $$2 = ((dr)$$0.getSource()).m().aI();
      return dt.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      LiteralCommandNode<dr> $$2 = $$0.register((LiteralArgumentBuilder)ds.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a(
                                                   "execute"
                                                )
                                                .requires($$0x -> $$0x.c(2)))
                                             .then(ds.a("run").redirect($$0.getRoot())))
                                          .then(a($$2, ds.a("if"), true, $$1)))
                                       .then(a($$2, ds.a("unless"), false, $$1)))
                                    .then(ds.a("as").then(ds.a("targets", eb.b()).fork($$2, $$0x -> {
                                       List<dr> $$1x = Lists.newArrayList();
                              
                                       for(bbn $$2x : eb.c($$0x, "targets")) {
                                          $$1x.add(((dr)$$0x.getSource()).a($$2x));
                                       }
                              
                                       return $$1x;
                                    }))))
                                 .then(ds.a("at").then(ds.a("targets", eb.b()).fork($$2, $$0x -> {
                                    List<dr> $$1x = Lists.newArrayList();
                           
                                    for(bbn $$2x : eb.c($$0x, "targets")) {
                                       $$1x.add(((dr)$$0x.getSource()).a((agg)$$2x.s).a($$2x.cY()).a($$2x.bz()));
                                    }
                           
                                    return $$1x;
                                 }))))
                              .then(((LiteralArgumentBuilder)ds.a("store").then(a($$2, ds.a("result"), true))).then(a($$2, ds.a("success"), false))))
                           .then(
                              ((LiteralArgumentBuilder)ds.a("positioned")
                                    .then(ds.a("pos", fo.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(fo.a($$0x, "pos")).a(ea.a.a))))
                                 .then(ds.a("as").then(ds.a("targets", eb.b()).fork($$2, $$0x -> {
                                    List<dr> $$1x = Lists.newArrayList();
                           
                                    for(bbn $$2x : eb.c($$0x, "targets")) {
                                       $$1x.add(((dr)$$0x.getSource()).a($$2x.cY()));
                                    }
                           
                                    return $$1x;
                                 })))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)ds.a("rotated")
                                 .then(ds.a("rot", fl.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(fl.a($$0x, "rot").b((dr)$$0x.getSource())))))
                              .then(ds.a("as").then(ds.a("targets", eb.b()).fork($$2, $$0x -> {
                                 List<dr> $$1x = Lists.newArrayList();
                        
                                 for(bbn $$2x : eb.c($$0x, "targets")) {
                                    $$1x.add(((dr)$$0x.getSource()).a($$2x.bz()));
                                 }
                        
                                 return $$1x;
                              })))
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ds.a("facing")
                              .then(ds.a("entity").then(ds.a("targets", eb.b()).then(ds.a("anchor", ea.a()).fork($$2, $$0x -> {
                                 List<dr> $$1x = Lists.newArrayList();
                                 ea.a $$2x = ea.a($$0x, "anchor");
                        
                                 for(bbn $$3 : eb.c($$0x, "targets")) {
                                    $$1x.add(((dr)$$0x.getSource()).a($$3, $$2x));
                                 }
                        
                                 return $$1x;
                              })))))
                           .then(ds.a("pos", fo.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).b(fo.a($$0x, "pos"))))
                     ))
                  .then(
                     ds.a("align")
                        .then(ds.a("axes", fm.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(((dr)$$0x.getSource()).e().a(fm.a($$0x, "axes")))))
                  ))
               .then(ds.a("anchored").then(ds.a("anchor", ea.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(ea.a($$0x, "anchor"))))))
            .then(ds.a("in").then(ds.a("dimension", dz.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(dz.a($$0x, "dimension")))))
      );
   }

   private static ArgumentBuilder<dr, ?> a(LiteralCommandNode<dr> $$0, LiteralArgumentBuilder<dr> $$1, boolean $$2) {
      $$1.then(
         ds.a("score")
            .then(
               ds.a("targets", es.b())
                  .suggests(es.a)
                  .then(ds.a("objective", ej.a()).redirect($$0, $$1x -> a((dr)$$1x.getSource(), es.c($$1x, "targets"), ej.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ds.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ds.a("id", eq.a())
                     .suggests(acg.a)
                     .then(ds.a("value").redirect($$0, $$1x -> a((dr)$$1x.getSource(), acg.a($$1x), true, $$2))))
                  .then(ds.a("max").redirect($$0, $$1x -> a((dr)$$1x.getSource(), acg.a($$1x), false, $$2)))
            )
      );

      for(afb.c $$3 : afb.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a(
                                       "path", eh.a()
                                    )
                                    .then(
                                       ds.a("int")
                                          .then(
                                             ds.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (dr)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         eh.a($$2xx, "path"),
                                                         $$1xxx -> po.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ds.a("float")
                                       .then(
                                          ds.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (dr)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      eh.a($$2xx, "path"),
                                                      $$1xxx -> pm.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ds.a("short")
                                    .then(
                                       ds.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (dr)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   eh.a($$2xx, "path"),
                                                   $$1xxx -> px.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ds.a("long")
                                 .then(
                                    ds.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (dr)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                eh.a($$2xx, "path"),
                                                $$1xxx -> pr.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ds.a("double")
                              .then(
                                 ds.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (dr)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             eh.a($$2xx, "path"),
                                             $$1xxx -> pk.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ds.a("byte")
                           .then(
                              ds.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (dr)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          eh.a($$2xx, "path"),
                                          $$1xxx -> ph.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                          $$2
                                       )
                                 )
                           )
                     )
               )
         );
      }

      return $$1;
   }

   private static dr a(dr $$0, Collection<String> $$1, dxl $$2, boolean $$3) {
      dxo $$4 = $$0.m().aF();
      return $$0.a(($$4x, $$5, $$6) -> {
         for(String $$7 : $$1) {
            dxn $$8 = $$4.c($$7, $$2);
            int $$9 = $$3 ? $$6 : ($$5 ? 1 : 0);
            $$8.b($$9);
         }

      }, e);
   }

   private static dr a(dr $$0, abv $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4, $$5) -> {
         int $$6 = $$3 ? $$5 : ($$4 ? 1 : 0);
         if ($$2) {
            $$1.a($$6);
         } else {
            $$1.b($$6);
         }

      }, e);
   }

   private static dr a(dr $$0, afa $$1, eh.g $$2, IntFunction<qc> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5, $$6) -> {
         try {
            pj $$7 = $$1.a();
            int $$8 = $$4 ? $$6 : ($$5 ? 1 : 0);
            $$2.b($$7, () -> (qc)$$3.apply($$8));
            $$1.a($$7);
         } catch (CommandSyntaxException var9) {
         }

      }, e);
   }

   private static ArgumentBuilder<dr, ?> a(CommandNode<dr> $$0, LiteralArgumentBuilder<dr> $$1, boolean $$2, dl $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     ds.a("block")
                        .then(
                           ds.a("pos", fh.a())
                              .then(
                                 a(
                                    $$0,
                                    ds.a("block", fd.a($$3)),
                                    $$2,
                                    $$0x -> fd.a($$0x, "block").test(new cvs(((dr)$$0x.getSource()).f(), fh.a($$0x, "pos"), true))
                                 )
                              )
                        )
                  ))
                  .then(
                     ds.a("score")
                        .then(
                           ds.a("target", es.a())
                              .suggests(es.a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a(
                                                      "targetObjective", ej.a()
                                                   )
                                                   .then(
                                                      ds.a("=")
                                                         .then(
                                                            ds.a("source", es.a())
                                                               .suggests(es.a)
                                                               .then(a($$0, ds.a("sourceObjective", ej.a()), $$2, $$0x -> a($$0x, Integer::equals)))
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("<")
                                                      .then(
                                                         ds.a("source", es.a())
                                                            .suggests(es.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ds.a("sourceObjective", ej.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ds.a("<=")
                                                   .then(
                                                      ds.a("source", es.a())
                                                         .suggests(es.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ds.a("sourceObjective", ej.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ds.a(">")
                                                .then(
                                                   ds.a("source", es.a())
                                                      .suggests(es.a)
                                                      .then(
                                                         a(
                                                            $$0,
                                                            ds.a("sourceObjective", ej.a()),
                                                            $$2,
                                                            $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ds.a(">=")
                                             .then(
                                                ds.a("source", es.a())
                                                   .suggests(es.a)
                                                   .then(
                                                      a(
                                                         $$0,
                                                         ds.a("sourceObjective", ej.a()),
                                                         $$2,
                                                         $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(ds.a("matches").then(a($$0, ds.a("range", eo.a()), $$2, $$0x -> a($$0x, eo.b.a($$0x, "range")))))
                              )
                        )
                  ))
               .then(
                  ds.a("blocks")
                     .then(
                        ds.a("start", fh.a())
                           .then(
                              ds.a("end", fh.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ds.a("destination", fh.a()).then(a($$0, ds.a("all"), $$2, false)))
                                       .then(a($$0, ds.a("masked"), $$2, true))
                                 )
                           )
                     )
               ))
            .then(
               ds.a("entity")
                  .then(
                     ((RequiredArgumentBuilder)ds.a("entities", eb.b()).fork($$0, $$1x -> a($$1x, $$2, !eb.c($$1x, "entities").isEmpty())))
                        .executes(a($$2, (acu.a)($$0x -> eb.c($$0x, "entities").size())))
                  )
            ))
         .then(ds.a("predicate").then(a($$0, ds.a("predicate", eq.a()).suggests(f), $$2, $$0x -> a((dr)$$0x.getSource(), eq.c($$0x, "predicate")))));

      for(afb.c $$4 : afb.c) {
         $$1.then(
            $$4.a(
               ds.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ds.a("path", eh.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), eh.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (acu.a)($$1xx -> a($$4.a($$1xx), eh.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<dr> a(boolean $$0, acu.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((dr)$$1x.getSource()).a(rq.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw c.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((dr)$$1x.getSource()).a(rq.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create($$2);
         }
      };
   }

   private static int a(afa $$0, eh.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<dr> $$0, BiPredicate<Integer, Integer> $$1) throws CommandSyntaxException {
      String $$2 = es.a($$0, "target");
      dxl $$3 = ej.a($$0, "targetObjective");
      String $$4 = es.a($$0, "source");
      dxl $$5 = ej.a($$0, "sourceObjective");
      dxo $$6 = ((dr)$$0.getSource()).m().aF();
      if ($$6.b($$2, $$3) && $$6.b($$4, $$5)) {
         dxn $$7 = $$6.c($$2, $$3);
         dxn $$8 = $$6.c($$4, $$5);
         return $$1.test($$7.b(), $$8.b());
      } else {
         return false;
      }
   }

   private static boolean a(CommandContext<dr> $$0, cj.d $$1) throws CommandSyntaxException {
      String $$2 = es.a($$0, "target");
      dxl $$3 = ej.a($$0, "targetObjective");
      dxo $$4 = ((dr)$$0.getSource()).m().aF();
      return !$$4.b($$2, $$3) ? false : $$1.d($$4.c($$2, $$3).b());
   }

   private static boolean a(dr $$0, dux $$1) {
      agg $$2 = $$0.f();
      dsd.a $$3 = new dsd.a($$2).a(dul.f, $$0.e()).b(dul.a, $$0.g());
      return $$1.test($$3.a(duk.c));
   }

   private static Collection<dr> a(CommandContext<dr> $$0, boolean $$1, boolean $$2) {
      return (Collection<dr>)($$2 == $$1 ? Collections.singleton((dr)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<dr, ?> a(CommandNode<dr> $$0, ArgumentBuilder<dr, ?> $$1, boolean $$2, acu.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((dr)$$2x.getSource()).a(rq.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw c.create();
         }
      });
   }

   private static ArgumentBuilder<dr, ?> a(CommandNode<dr> $$0, ArgumentBuilder<dr, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<dr> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((dr)$$0.getSource()).a(rq.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw c.create();
      }
   }

   private static int b(CommandContext<dr> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw d.create($$2.getAsInt());
      } else {
         ((dr)$$0.getSource()).a(rq.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<dr> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((dr)$$0.getSource()).f(), fh.a($$0, "start"), fh.a($$0, "end"), fh.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(agg $$0, gt $$1, gt $$2, gt $$3, boolean $$4) throws CommandSyntaxException {
      dkt $$5 = dkt.a($$1, $$2);
      dkt $$6 = dkt.a($$3, $$3.a($$5.b()));
      gt $$7 = new gt($$6.g() - $$5.g(), $$6.h() - $$5.h(), $$6.i() - $$5.i());
      int $$8 = $$5.c() * $$5.d() * $$5.e();
      if ($$8 > 32768) {
         throw b.create(32768, $$8);
      } else {
         int $$9 = 0;

         for(int $$10 = $$5.i(); $$10 <= $$5.l(); ++$$10) {
            for(int $$11 = $$5.h(); $$11 <= $$5.k(); ++$$11) {
               for(int $$12 = $$5.g(); $$12 <= $$5.j(); ++$$12) {
                  gt $$13 = new gt($$12, $$11, $$10);
                  gt $$14 = $$13.a($$7);
                  cvo $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(cju.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     cti $$16 = $$0.c_($$13);
                     cti $$17 = $$0.c_($$14);
                     if ($$16 != null) {
                        if ($$17 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$17.v() != $$16.v()) {
                           return OptionalInt.empty();
                        }

                        pj $$18 = $$16.o();
                        pj $$19 = $$17.o();
                        if (!$$18.equals($$19)) {
                           return OptionalInt.empty();
                        }
                     }

                     ++$$9;
                  }
               }
            }
         }

         return OptionalInt.of($$9);
      }
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<dr> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<dr> var1) throws CommandSyntaxException;
   }
}
