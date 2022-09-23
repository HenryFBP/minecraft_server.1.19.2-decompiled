import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dme {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dlb.b> a(dlb.a $$0, hc<dmk> $$1, Optional<abb> $$2, int $$3, gt $$4, boolean $$5, Optional<dar.a> $$6, int $$7) {
      hn $$8 = $$0.a();
      cxk $$9 = $$0.b();
      dou $$10 = $$0.e();
      cgz $$11 = $$0.i();
      dbo $$12 = $$0.f();
      hm<dmk> $$13 = $$8.d(hm.aQ);
      cpw $$14 = cpw.a($$12);
      dmk $$15 = $$1.a();
      dmi $$16 = $$15.a($$12);
      if ($$16 == dmb.b) {
         return Optional.empty();
      } else {
         gt $$19;
         if ($$2.isPresent()) {
            abb $$17 = (abb)$$2.get();
            Optional<gt> $$18 = a($$16, $$17, $$4, $$14, $$10, $$12);
            if ($$18.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$17, ((aba)$$1.e().get()).a());
               return Optional.empty();
            }

            $$19 = (gt)$$18.get();
         } else {
            $$19 = $$4;
         }

         hs $$21 = $$19.b($$4);
         gt $$22 = $$4.b($$21);
         dkx $$23 = new dkx($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         dkt $$24 = $$23.f();
         int $$25 = ($$24.j() + $$24.g()) / 2;
         int $$26 = ($$24.l() + $$24.i()) / 2;
         int $$27;
         if ($$6.isPresent()) {
            $$27 = $$4.v() + $$9.b($$25, $$26, (dar.a)$$6.get(), $$11, $$0.d());
         } else {
            $$27 = $$22.v();
         }

         int $$29 = $$24.h() + $$23.d();
         $$23.a(0, $$27 - $$29, 0);
         int $$30 = $$27 + $$21.v();
         return Optional.of(
            new dlb.b(
               new gt($$25, $$30, $$26),
               (Consumer<dlt>)($$14x -> {
                  List<dkx> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     dwl $$16x = new dwl(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     dxj $$17 = dxg.a(dxg.a($$16x), dxg.a(dwl.a($$24)), dwu.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<gt> a(dmi $$0, abb $$1, gt $$2, cpw $$3, dou $$4, dbo $$5) {
      List<dot.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<gt> $$7 = Optional.empty();

      for(dot.c $$8 : $$6) {
         abb $$9 = abb.a($$8.c.l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a);
            break;
         }
      }

      return $$7;
   }

   private static void a(dbf $$0, int $$1, boolean $$2, cxk $$3, dou $$4, cgz $$5, amn $$6, hm<dmk> $$7, dkx $$8, List<dkx> $$9, dxj $$10) {
      dme.b $$11 = new dme.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dme.a($$8, new MutableObject($$10), 0));

      while(!$$11.g.isEmpty()) {
         dme.a $$12 = (dme.a)$$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }

   }

   public static boolean a(agg $$0, hc<dmk> $$1, abb $$2, int $$3, gt $$4, boolean $$5) {
      cxk $$6 = $$0.k().g();
      dou $$7 = $$0.p();
      cho $$8 = $$0.a();
      amn $$9 = $$0.r_();
      dlb.a $$10 = new dlb.a($$0.s(), $$6, $$6.d(), $$0.k().h(), $$7, $$0.B(), new cge($$4), $$0, $$0x -> true);
      Optional<dlb.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dlt $$12 = ((dlb.b)$$11.get()).a();

         for(dlf $$13 : $$12.a().c()) {
            if ($$13 instanceof dkx $$14) {
               $$14.a($$0, $$8, $$6, $$9, dkt.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final dkx a;
      final MutableObject<dxj> b;
      final int c;

      a(dkx $$0, MutableObject<dxj> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final hm<dmk> a;
      private final int b;
      private final cxk c;
      private final dou d;
      private final List<? super dkx> e;
      private final amn f;
      final Deque<dme.a> g = Queues.newArrayDeque();

      b(hm<dmk> $$0, int $$1, cxk $$2, dou $$3, List<? super dkx> $$4, amn $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dkx $$0, MutableObject<dxj> $$1, int $$2, boolean $$3, cgz $$4, dbf $$5) {
         dmi $$6 = $$0.b();
         gt $$7 = $$0.c();
         cpw $$8 = $$0.a();
         dmk.a $$9 = $$6.e();
         boolean $$10 = $$9 == dmk.a.b;
         MutableObject<dxj> $$11 = new MutableObject();
         dkt $$12 = $$0.f();
         int $$13 = $$12.h();

         label139:
         for(dot.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            gy $$15 = cnl.h($$14.b);
            gt $$16 = $$14.a;
            gt $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            abb $$20 = new abb($$14.c.l("pool"));
            Optional<dmk> $$21 = this.a.b($$20);
            if ($$21.isPresent() && (((dmk)$$21.get()).c() != 0 || Objects.equals($$20, mm.a.a()))) {
               abb $$22 = ((dmk)$$21.get()).a();
               Optional<dmk> $$23 = this.a.b($$22);
               if ($$23.isPresent() && (((dmk)$$23.get()).c() != 0 || Objects.equals($$22, mm.a.a()))) {
                  boolean $$24 = $$12.b($$17);
                  MutableObject<dxj> $$25;
                  if ($$24) {
                     $$25 = $$11;
                     if ($$11.getValue() == null) {
                        $$11.setValue(dxg.a(dwl.a($$12)));
                     }
                  } else {
                     $$25 = $$1;
                  }

                  List<dmi> $$27 = Lists.newArrayList();
                  if ($$2 != this.b) {
                     $$27.addAll(((dmk)$$21.get()).b(this.f));
                  }

                  $$27.addAll(((dmk)$$23.get()).b(this.f));

                  for(dmi $$28 : $$27) {
                     if ($$28 == dmb.b) {
                        break;
                     }

                     for(cpw $$29 : cpw.b(this.f)) {
                        List<dot.c> $$30 = $$28.a(this.d, gt.b, $$29, this.f);
                        dkt $$31 = $$28.a(this.d, gt.b, $$29);
                        int $$33;
                        if ($$3 && $$31.d() <= 16) {
                           $$33 = $$30.stream().mapToInt($$1x -> {
                              if (!$$31.b($$1x.a.a(cnl.h($$1x.b)))) {
                                 return 0;
                              } else {
                                 abb $$2x = new abb($$1x.c.l("pool"));
                                 Optional<dmk> $$3x = this.a.b($$2x);
                                 Optional<dmk> $$4x = $$3x.flatMap($$0xx -> this.a.b($$0xx.a()));
                                 int $$5x = $$3x.map($$0xx -> $$0xx.a(this.d)).orElse(0);
                                 int $$6x = $$4x.map($$0xx -> $$0xx.a(this.d)).orElse(0);
                                 return Math.max($$5x, $$6x);
                              }
                           }).max().orElse(0);
                        } else {
                           $$33 = 0;
                        }

                        for(dot.c $$34 : $$30) {
                           if (cnl.a($$14, $$34)) {
                              gt $$35 = $$34.a;
                              gt $$36 = $$17.b($$35);
                              dkt $$37 = $$28.a(this.d, $$36, $$29);
                              int $$38 = $$37.h();
                              dmk.a $$39 = $$28.e();
                              boolean $$40 = $$39 == dmk.a.b;
                              int $$41 = $$35.v();
                              int $$42 = $$18 - $$41 + cnl.h($$14.b).k();
                              int $$43;
                              if ($$10 && $$40) {
                                 $$43 = $$13 + $$42;
                              } else {
                                 if ($$19 == -1) {
                                    $$19 = this.c.b($$16.u(), $$16.w(), dar.a.a, $$4, $$5);
                                 }

                                 $$43 = $$19 - $$41;
                              }

                              int $$45 = $$43 - $$38;
                              dkt $$46 = $$37.b(0, $$45, 0);
                              gt $$47 = $$36.b(0, $$45, 0);
                              if ($$33 > 0) {
                                 int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                 $$46.a(new gt($$46.g(), $$46.h() + $$48, $$46.i()));
                              }

                              if (!dxg.c((dxj)$$25.getValue(), dxg.a(dwl.a($$46).h(0.25)), dwu.c)) {
                                 $$25.setValue(dxg.b((dxj)$$25.getValue(), dxg.a(dwl.a($$46)), dwu.e));
                                 int $$49 = $$0.d();
                                 int $$50;
                                 if ($$40) {
                                    $$50 = $$49 - $$42;
                                 } else {
                                    $$50 = $$28.f();
                                 }

                                 dkx $$52 = new dkx(this.d, $$28, $$47, $$50, $$29, $$46);
                                 int $$53;
                                 if ($$10) {
                                    $$53 = $$13 + $$18;
                                 } else if ($$40) {
                                    $$53 = $$43 + $$41;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dar.a.a, $$4, $$5);
                                    }

                                    $$53 = $$19 + $$42 / 2;
                                 }

                                 $$0.a(new dmd($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                 $$52.a(new dmd($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                 this.e.add($$52);
                                 if ($$2 + 1 <= this.b) {
                                    this.g.addLast(new dme.a($$52, $$25, $$2 + 1));
                                 }
                                 continue label139;
                              }
                           }
                        }
                     }
                  }
               } else {
                  dme.a.warn("Empty or non-existent fallback pool: {}", $$22);
               }
            } else {
               dme.a.warn("Empty or non-existent pool: {}", $$20);
            }
         }

      }
   }
}
