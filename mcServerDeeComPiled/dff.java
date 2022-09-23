import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;

public class dff extends ddt<dgt> {
   private static final int a = 19;

   public dff(Codec<dgt> $$0) {
      super($$0);
   }

   private static boolean e(chd $$0, gt $$1) {
      return $$0.a($$1, $$0x -> $$0x.a(cju.em));
   }

   public static boolean b(chd $$0, gt $$1) {
      return $$0.a($$1, $$0x -> $$0x.a(cju.C));
   }

   public static boolean c(chd $$0, gt $$1) {
      return $$0.a($$1, $$0x -> $$0x.h() || $$0x.a(akl.K));
   }

   private static boolean f(chd $$0, gt $$1) {
      return $$0.a($$1, $$0x -> {
         dpz $$1x = $$0x.d();
         return $$1x == dpz.g || $$1x == dpz.i || $$1x == dpz.h;
      });
   }

   private static void b(chf $$0, gt $$1, cvo $$2) {
      $$0.a($$1, $$2, 19);
   }

   public static boolean d(chd $$0, gt $$1) {
      return c($$0, $$1) || f($$0, $$1) || b($$0, $$1);
   }

   private boolean a(chp $$0, amn $$1, gt $$2, BiConsumer<gt, cvo> $$3, BiConsumer<gt, cvo> $$4, BiConsumer<gt, cvo> $$5, dgt $$6) {
      int $$7 = $$6.d.a($$1);
      int $$8 = $$6.f.a($$1, $$7, $$6);
      int $$9 = $$7 - $$8;
      int $$10 = $$6.f.a($$1, $$9);
      gt $$11 = (gt)$$6.g.map($$2x -> $$2x.a($$2, $$1)).orElse($$2);
      int $$12 = Math.min($$2.v(), $$11.v());
      int $$13 = Math.max($$2.v(), $$11.v()) + $$7 + 1;
      if ($$12 >= $$0.u_() + 1 && $$13 <= $$0.ah()) {
         OptionalInt $$14 = $$6.h.c();
         int $$15 = this.a($$0, $$7, $$11, $$6);
         if ($$15 >= $$7 || !$$14.isEmpty() && $$15 >= $$14.getAsInt()) {
            if ($$6.g.isPresent() && !((dhu)$$6.g.get()).a($$0, $$3, $$1, $$2, $$11, $$6)) {
               return false;
            } else {
               List<dhi.a> $$16 = $$6.d.a($$0, $$4, $$1, $$15, $$11, $$6);
               $$16.forEach($$7x -> $$6.f.a($$0, $$5, $$1, $$6, $$15, $$7x, $$8, $$10));
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int a(chd $$0, int $$1, gt $$2, dgt $$3) {
      gt.a $$4 = new gt.a();

      for(int $$5 = 0; $$5 <= $$1 + 1; ++$$5) {
         int $$6 = $$3.h.a($$1, $$5);

         for(int $$7 = -$$6; $$7 <= $$6; ++$$7) {
            for(int $$8 = -$$6; $$8 <= $$6; ++$$8) {
               $$4.a($$2, $$7, $$5, $$8);
               if (!$$3.d.b($$0, $$4) || !$$3.j && e($$0, $$4)) {
                  return $$5 - 2;
               }
            }
         }
      }

      return $$1;
   }

   @Override
   protected void a(chf $$0, gt $$1, cvo $$2) {
      b($$0, $$1, $$2);
   }

   @Override
   public final boolean a(ddv<dgt> $$0) {
      chp $$1 = $$0.b();
      amn $$2 = $$0.d();
      gt $$3 = $$0.e();
      dgt $$4 = $$0.f();
      Set<gt> $$5 = Sets.newHashSet();
      Set<gt> $$6 = Sets.newHashSet();
      Set<gt> $$7 = Sets.newHashSet();
      Set<gt> $$8 = Sets.newHashSet();
      BiConsumer<gt, cvo> $$9 = ($$2x, $$3x) -> {
         $$5.add($$2x.h());
         $$1.a($$2x, $$3x, 19);
      };
      BiConsumer<gt, cvo> $$10 = ($$2x, $$3x) -> {
         $$6.add($$2x.h());
         $$1.a($$2x, $$3x, 19);
      };
      BiConsumer<gt, cvo> $$11 = ($$2x, $$3x) -> {
         $$7.add($$2x.h());
         $$1.a($$2x, $$3x, 19);
      };
      BiConsumer<gt, cvo> $$12 = ($$2x, $$3x) -> {
         $$8.add($$2x.h());
         $$1.a($$2x, $$3x, 19);
      };
      boolean $$13 = this.a($$1, $$2, $$3, $$9, $$10, $$11, $$4);
      if ($$13 && (!$$6.isEmpty() || !$$7.isEmpty())) {
         if (!$$4.i.isEmpty()) {
            din.a $$14 = new din.a($$1, $$12, $$2, $$6, $$7, $$5);
            $$4.i.forEach($$1x -> $$1x.a($$14));
         }

         return dkt.a(Iterables.concat($$5, $$6, $$7, $$8)).map($$4x -> {
            dwz $$5x = a($$1, $$4x, $$6, $$8, $$5);
            dot.a($$1, 3, $$5x, $$4x.g(), $$4x.h(), $$4x.i());
            return true;
         }).orElse(false);
      } else {
         return false;
      }
   }

   private static dwz a(cgy $$0, dkt $$1, Set<gt> $$2, Set<gt> $$3, Set<gt> $$4) {
      List<Set<gt>> $$5 = Lists.newArrayList();
      dwz $$6 = new dwt($$1.c(), $$1.d(), $$1.e());
      int $$7 = 6;

      for(int $$8 = 0; $$8 < 6; ++$$8) {
         $$5.add(Sets.newHashSet());
      }

      gt.a $$9 = new gt.a();

      for(gt $$10 : Lists.newArrayList(Sets.union($$3, $$4))) {
         if ($$1.b($$10)) {
            $$6.c($$10.u() - $$1.g(), $$10.v() - $$1.h(), $$10.w() - $$1.i());
         }
      }

      for(gt $$11 : Lists.newArrayList($$2)) {
         if ($$1.b($$11)) {
            $$6.c($$11.u() - $$1.g(), $$11.v() - $$1.h(), $$11.w() - $$1.i());
         }

         for(gy $$12 : gy.values()) {
            $$9.a($$11, $$12);
            if (!$$2.contains($$9)) {
               cvo $$13 = $$0.a_($$9);
               if ($$13.b(cwe.aC)) {
                  ((Set)$$5.get(0)).add($$9.h());
                  b($$0, $$9, $$13.a(cwe.aC, Integer.valueOf(1)));
                  if ($$1.b($$9)) {
                     $$6.c($$9.u() - $$1.g(), $$9.v() - $$1.h(), $$9.w() - $$1.i());
                  }
               }
            }
         }
      }

      for(int $$14 = 1; $$14 < 6; ++$$14) {
         Set<gt> $$15 = (Set)$$5.get($$14 - 1);
         Set<gt> $$16 = (Set)$$5.get($$14);

         for(gt $$17 : $$15) {
            if ($$1.b($$17)) {
               $$6.c($$17.u() - $$1.g(), $$17.v() - $$1.h(), $$17.w() - $$1.i());
            }

            for(gy $$18 : gy.values()) {
               $$9.a($$17, $$18);
               if (!$$15.contains($$9) && !$$16.contains($$9)) {
                  cvo $$19 = $$0.a_($$9);
                  if ($$19.b(cwe.aC)) {
                     int $$20 = $$19.c(cwe.aC);
                     if ($$20 > $$14 + 1) {
                        cvo $$21 = $$19.a(cwe.aC, Integer.valueOf($$14 + 1));
                        b($$0, $$9, $$21);
                        if ($$1.b($$9)) {
                           $$6.c($$9.u() - $$1.g(), $$9.v() - $$1.h(), $$9.w() - $$1.i());
                        }

                        $$16.add($$9.h());
                     }
                  }
               }
            }
         }
      }

      return $$6;
   }
}
