import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dcy extends ddt<dfr> {
   private static final ImmutableList<cjt> a = ImmutableList.of(cju.D, cju.B, cju.jv, cju.dg, cju.eu, cju.ev, cju.ew, cju.ex, cju.cg, cju.ce);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int e = 15;

   public dcy(Codec<dfr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dfr> $$0) {
      int $$1 = $$0.c().f();
      gt $$2 = $$0.e();
      chp $$3 = $$0.b();
      amn $$4 = $$0.d();
      dfr $$5 = $$0.f();
      if (!a($$3, $$1, $$2.i())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for(gt $$11 : gt.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(cgy $$0, int $$1, gt $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for(gt $$6 : gt.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         gt $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.i(), $$7) : a($$0, $$6.i(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for(gt.a $$10 = $$8.i(); $$9 >= 0; --$$9) {
               if (a($$0, $$1, (gt)$$10)) {
                  this.a($$0, $$10, cju.di.m());
                  $$10.c(gy.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(cju.di)) {
                     break;
                  }

                  $$10.c(gy.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static gt a(cgy $$0, int $$1, gt.a $$2, int $$3) {
      while($$2.v() > $$0.u_() + 1 && $$3 > 0) {
         --$$3;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(gy.a);
      }

      return null;
   }

   private static boolean a(cgy $$0, int $$1, gt.a $$2) {
      if (!a($$0, $$1, (gt)$$2)) {
         return false;
      } else {
         cvo $$3 = $$0.a_($$2.c(gy.a));
         $$2.c(gy.b);
         return !$$3.h() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static gt a(cgy $$0, gt.a $$1, int $$2) {
      while($$1.v() < $$0.ah() && $$2 > 0) {
         --$$2;
         cvo $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.h()) {
            return $$1;
         }

         $$1.c(gy.b);
      }

      return null;
   }

   private static boolean a(cgy $$0, int $$1, gt $$2) {
      cvo $$3 = $$0.a_($$2);
      return $$3.h() || $$3.a(cju.D) && $$2.v() <= $$1;
   }
}
