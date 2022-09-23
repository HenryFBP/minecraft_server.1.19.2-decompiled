import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class acw {
   private static final int a = 32768;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> rq.a("commands.fill.toobig", $$0, $$1));
   static final fc c = new fc(cju.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(rq.c("commands.fill.failed"));

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               ds.a("from", fh.a())
                  .then(
                     ds.a("to", fh.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a(
                                                "block", fe.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a(
                                                      (dr)$$0x.getSource(), dkt.a(fh.a($$0x, "from"), fh.a($$0x, "to")), fe.a($$0x, "block"), acw.a.a, null
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ds.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            dkt.a(fh.a($$0x, "from"), fh.a($$0x, "to")),
                                                            fe.a($$0x, "block"),
                                                            acw.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("filter", fd.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               dkt.a(fh.a($$0x, "from"), fh.a($$0x, "to")),
                                                               fe.a($$0x, "block"),
                                                               acw.a.a,
                                                               fd.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ds.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (dr)$$0x.getSource(),
                                                      dkt.a(fh.a($$0x, "from"), fh.a($$0x, "to")),
                                                      fe.a($$0x, "block"),
                                                      acw.a.a,
                                                      $$0xx -> $$0xx.c().x($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       ds.a("outline")
                                          .executes(
                                             $$0x -> a((dr)$$0x.getSource(), dkt.a(fh.a($$0x, "from"), fh.a($$0x, "to")), fe.a($$0x, "block"), acw.a.b, null)
                                          )
                                    ))
                                 .then(
                                    ds.a("hollow")
                                       .executes(
                                          $$0x -> a((dr)$$0x.getSource(), dkt.a(fh.a($$0x, "from"), fh.a($$0x, "to")), fe.a($$0x, "block"), acw.a.c, null)
                                       )
                                 ))
                              .then(
                                 ds.a("destroy")
                                    .executes($$0x -> a((dr)$$0x.getSource(), dkt.a(fh.a($$0x, "from"), fh.a($$0x, "to")), fe.a($$0x, "block"), acw.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(dr $$0, dkt $$1, fc $$2, acw.a $$3, @Nullable Predicate<cvs> $$4) throws CommandSyntaxException {
      int $$5 = $$1.c() * $$1.d() * $$1.e();
      if ($$5 > 32768) {
         throw b.create(32768, $$5);
      } else {
         List<gt> $$6 = Lists.newArrayList();
         agg $$7 = $$0.f();
         int $$8 = 0;

         for(gt $$9 : gt.b($$1.g(), $$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l())) {
            if ($$4 == null || $$4.test(new cvs($$7, $$9, true))) {
               fc $$10 = $$3.e.filter($$1, $$9, $$2, $$7);
               if ($$10 != null) {
                  cti $$11 = $$7.c_($$9);
                  baa.a($$11);
                  if ($$10.a($$7, $$9, 2)) {
                     $$6.add($$9.h());
                     ++$$8;
                  }
               }
            }
         }

         for(gt $$12 : $$6) {
            cjt $$13 = $$7.a_($$12).b();
            $$7.b($$12, $$13);
         }

         if ($$8 == 0) {
            throw d.create();
         } else {
            $$0.a(rq.a("commands.fill.success", $$8), true);
            return $$8;
         }
      }
   }

   static enum a {
      a(($$0, $$1, $$2, $$3) -> $$2),
      b(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.g()
                  && $$1.u() != $$0.j()
                  && $$1.v() != $$0.h()
                  && $$1.v() != $$0.k()
                  && $$1.w() != $$0.i()
                  && $$1.w() != $$0.l()
               ? null
               : $$2
      ),
      c(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.g()
                  && $$1.u() != $$0.j()
                  && $$1.v() != $$0.h()
                  && $$1.v() != $$0.k()
                  && $$1.w() != $$0.i()
                  && $$1.w() != $$0.l()
               ? acw.c
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aee.a e;

      private a(aee.a $$0) {
         this.e = $$0;
      }
   }
}
