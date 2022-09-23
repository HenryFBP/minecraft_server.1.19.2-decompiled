import javax.annotation.Nullable;

public class byz extends cat {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public byz(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      gt $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.y) {
            $$1.c(1505, $$2, 0);
         }

         return baj.a($$1.y);
      } else {
         cvo $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.y) {
               $$1.c(1505, $$3, 0);
            }

            return baj.a($$1.y);
         } else {
            return baj.d;
         }
      }
   }

   public static boolean a(cax $$0, cgx $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cjv $$4 && $$4.a($$1, $$2, $$3, $$1.y)) {
         if ($$1 instanceof agg) {
            if ($$4.a($$1, $$1.w, $$2, $$3)) {
               $$4.a((agg)$$1, $$1.w, $$2, $$3);
            }

            $$0.g(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cax $$0, cgx $$1, gt $$2, @Nullable gy $$3) {
      if ($$1.a_($$2).a(cju.C) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof agg)) {
            return true;
         } else {
            amn $$4 = $$1.r_();

            label78:
            for(int $$5 = 0; $$5 < 128; ++$$5) {
               gt $$6 = $$2;
               cvo $$7 = cju.bj.m();

               for(int $$8 = 0; $$8 < $$5 / 16; ++$$8) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               hc<cht> $$9 = $$1.w($$6);
               if ($$9.a(akk.aa)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = (cvo)hm.V.c(akl.am).flatMap($$1x -> $$1x.a($$1.w)).map($$0x -> ((cjt)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(cjf.a)) {
                        $$7 = $$7.a(cjf.a, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = (cvo)hm.V.c(akl.ak).flatMap($$1x -> $$1x.a($$1.w)).map($$0x -> ((cjt)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(akl.am, $$0x -> $$0x.b(cjf.a))) {
                  for(int $$10 = 0; !$$7.a((cha)$$1, $$6) && $$10 < 4; ++$$10) {
                     $$7 = $$7.a(cjf.a, gy.c.a.a($$4));
                  }
               }

               if ($$7.a((cha)$$1, $$6)) {
                  cvo $$11 = $$1.a_($$6);
                  if ($$11.a(cju.C) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(cju.bj) && $$4.a(10) == 0) {
                     ((cjv)cju.bj).a((agg)$$1, $$4, $$6, $$11);
                  }
               }
            }

            $$0.g(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void a(cgy $$0, gt $$1, int $$2) {
      if ($$2 == 0) {
         $$2 = 15;
      }

      cvo $$3 = $$0.a_($$1);
      if (!$$3.h()) {
         double $$4 = 0.5;
         double $$5;
         if ($$3.a(cju.C)) {
            $$2 *= 3;
            $$5 = 1.0;
            $$4 = 3.0;
         } else if ($$3.i($$0, $$1)) {
            $$1 = $$1.b();
            $$2 *= 3;
            $$4 = 3.0;
            $$5 = 1.0;
         } else {
            $$5 = $$3.j($$0, $$1).c(gy.a.b);
         }

         $$0.a(io.J, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
         amn $$8 = $$0.r_();

         for(int $$9 = 0; $$9 < $$2; ++$$9) {
            double $$10 = $$8.k() * 0.02;
            double $$11 = $$8.k() * 0.02;
            double $$12 = $$8.k() * 0.02;
            double $$13 = 0.5 - $$4;
            double $$14 = (double)$$1.u() + $$13 + $$8.j() * $$4 * 2.0;
            double $$15 = (double)$$1.v() + $$8.j() * $$5;
            double $$16 = (double)$$1.w() + $$13 + $$8.j() * $$4 * 2.0;
            if (!$$0.a_(new gt($$14, $$15, $$16).c()).h()) {
               $$0.a(io.J, $$14, $$15, $$16, $$10, $$11, $$12);
            }
         }

      }
   }
}
