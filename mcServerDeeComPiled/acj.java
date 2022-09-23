import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class acj {
   private static final int b = 32768;
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(rq.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> rq.a("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(rq.c("commands.clone.failed"));
   public static final Predicate<cvs> a = $$0 -> !$$0.a().h();

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("clone").requires($$0x -> $$0x.c(2)))
            .then(
               ds.a("begin", fh.a())
                  .then(
                     ds.a("end", fh.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("destination", fh.a())
                                       .executes(
                                          $$0x -> a(
                                                (dr)$$0x.getSource(),
                                                fh.a($$0x, "begin"),
                                                fh.a($$0x, "end"),
                                                fh.a($$0x, "destination"),
                                                $$0xx -> true,
                                                acj.b.c
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            fh.a($$0x, "begin"),
                                                            fh.a($$0x, "end"),
                                                            fh.a($$0x, "destination"),
                                                            $$0xx -> true,
                                                            acj.b.c
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               fh.a($$0x, "begin"),
                                                               fh.a($$0x, "end"),
                                                               fh.a($$0x, "destination"),
                                                               $$0xx -> true,
                                                               acj.b.a
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ds.a("move")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            fh.a($$0x, "begin"),
                                                            fh.a($$0x, "end"),
                                                            fh.a($$0x, "destination"),
                                                            $$0xx -> true,
                                                            acj.b.b
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ds.a("normal")
                                                .executes(
                                                   $$0x -> a(
                                                         (dr)$$0x.getSource(),
                                                         fh.a($$0x, "begin"),
                                                         fh.a($$0x, "end"),
                                                         fh.a($$0x, "destination"),
                                                         $$0xx -> true,
                                                         acj.b.c
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("masked")
                                                .executes(
                                                   $$0x -> a(
                                                         (dr)$$0x.getSource(), fh.a($$0x, "begin"), fh.a($$0x, "end"), fh.a($$0x, "destination"), a, acj.b.c
                                                      )
                                                ))
                                             .then(
                                                ds.a("force")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            fh.a($$0x, "begin"),
                                                            fh.a($$0x, "end"),
                                                            fh.a($$0x, "destination"),
                                                            a,
                                                            acj.b.a
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ds.a("move")
                                                .executes(
                                                   $$0x -> a(
                                                         (dr)$$0x.getSource(), fh.a($$0x, "begin"), fh.a($$0x, "end"), fh.a($$0x, "destination"), a, acj.b.b
                                                      )
                                                )
                                          ))
                                       .then(
                                          ds.a("normal")
                                             .executes(
                                                $$0x -> a((dr)$$0x.getSource(), fh.a($$0x, "begin"), fh.a($$0x, "end"), fh.a($$0x, "destination"), a, acj.b.c)
                                             )
                                       )
                                 ))
                              .then(
                                 ds.a("filtered")
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("filter", fd.a($$1))
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            fh.a($$0x, "begin"),
                                                            fh.a($$0x, "end"),
                                                            fh.a($$0x, "destination"),
                                                            fd.a($$0x, "filter"),
                                                            acj.b.c
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               fh.a($$0x, "begin"),
                                                               fh.a($$0x, "end"),
                                                               fh.a($$0x, "destination"),
                                                               fd.a($$0x, "filter"),
                                                               acj.b.a
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ds.a("move")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            fh.a($$0x, "begin"),
                                                            fh.a($$0x, "end"),
                                                            fh.a($$0x, "destination"),
                                                            fd.a($$0x, "filter"),
                                                            acj.b.b
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ds.a("normal")
                                                .executes(
                                                   $$0x -> a(
                                                         (dr)$$0x.getSource(),
                                                         fh.a($$0x, "begin"),
                                                         fh.a($$0x, "end"),
                                                         fh.a($$0x, "destination"),
                                                         fd.a($$0x, "filter"),
                                                         acj.b.c
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dr $$0, gt $$1, gt $$2, gt $$3, Predicate<cvs> $$4, acj.b $$5) throws CommandSyntaxException {
      dkt $$6 = dkt.a($$1, $$2);
      gt $$7 = $$3.a($$6.b());
      dkt $$8 = dkt.a($$3, $$7);
      if (!$$5.a() && $$8.a($$6)) {
         throw c.create();
      } else {
         int $$9 = $$6.c() * $$6.d() * $$6.e();
         if ($$9 > 32768) {
            throw d.create(32768, $$9);
         } else {
            agg $$10 = $$0.f();
            if ($$10.a($$1, $$2) && $$10.a($$3, $$7)) {
               List<acj.a> $$11 = Lists.newArrayList();
               List<acj.a> $$12 = Lists.newArrayList();
               List<acj.a> $$13 = Lists.newArrayList();
               Deque<gt> $$14 = Lists.newLinkedList();
               gt $$15 = new gt($$8.g() - $$6.g(), $$8.h() - $$6.h(), $$8.i() - $$6.i());

               for(int $$16 = $$6.i(); $$16 <= $$6.l(); ++$$16) {
                  for(int $$17 = $$6.h(); $$17 <= $$6.k(); ++$$17) {
                     for(int $$18 = $$6.g(); $$18 <= $$6.j(); ++$$18) {
                        gt $$19 = new gt($$18, $$17, $$16);
                        gt $$20 = $$19.a($$15);
                        cvs $$21 = new cvs($$10, $$19, false);
                        cvo $$22 = $$21.a();
                        if ($$4.test($$21)) {
                           cti $$23 = $$10.c_($$19);
                           if ($$23 != null) {
                              pj $$24 = $$23.o();
                              $$12.add(new acj.a($$20, $$22, $$24));
                              $$14.addLast($$19);
                           } else if (!$$22.i($$10, $$19) && !$$22.r($$10, $$19)) {
                              $$13.add(new acj.a($$20, $$22, null));
                              $$14.addFirst($$19);
                           } else {
                              $$11.add(new acj.a($$20, $$22, null));
                              $$14.addLast($$19);
                           }
                        }
                     }
                  }
               }

               if ($$5 == acj.b.b) {
                  for(gt $$25 : $$14) {
                     cti $$26 = $$10.c_($$25);
                     baa.a($$26);
                     $$10.a($$25, cju.gU.m(), 2);
                  }

                  for(gt $$27 : $$14) {
                     $$10.a($$27, cju.a.m(), 3);
                  }
               }

               List<acj.a> $$28 = Lists.newArrayList();
               $$28.addAll($$11);
               $$28.addAll($$12);
               $$28.addAll($$13);
               List<acj.a> $$29 = Lists.reverse($$28);

               for(acj.a $$30 : $$29) {
                  cti $$31 = $$10.c_($$30.a);
                  baa.a($$31);
                  $$10.a($$30.a, cju.gU.m(), 2);
               }

               int $$32 = 0;

               for(acj.a $$33 : $$28) {
                  if ($$10.a($$33.a, $$33.b, 2)) {
                     ++$$32;
                  }
               }

               for(acj.a $$34 : $$12) {
                  cti $$35 = $$10.c_($$34.a);
                  if ($$34.c != null && $$35 != null) {
                     $$35.a($$34.c);
                     $$35.e();
                  }

                  $$10.a($$34.a, $$34.b, 2);
               }

               for(acj.a $$36 : $$29) {
                  $$10.b($$36.a, $$36.b.b());
               }

               $$10.l().a($$6, $$15);
               if ($$32 == 0) {
                  throw e.create();
               } else {
                  $$0.a(rq.a("commands.clone.success", $$32), true);
                  return $$32;
               }
            } else {
               throw fh.a.create();
            }
         }
      }
   }

   static class a {
      public final gt a;
      public final cvo b;
      @Nullable
      public final pj c;

      public a(gt $$0, cvo $$1, @Nullable pj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static enum b {
      a(true),
      b(true),
      c(false);

      private final boolean d;

      private b(boolean $$0) {
         this.d = $$0;
      }

      public boolean a() {
         return this.d;
      }
   }
}
