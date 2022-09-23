import java.util.function.Function;
import javax.annotation.Nullable;

public class bvy {
   public static int[][] a(gy $$0) {
      gy $$1 = $$0.h();
      gy $$2 = $$1.g();
      gy $$3 = $$0.g();
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$2.j(), $$2.l()},
         {$$3.j() + $$1.j(), $$3.l() + $$1.l()},
         {$$3.j() + $$2.j(), $$3.l() + $$2.l()},
         {$$0.j() + $$1.j(), $$0.l() + $$1.l()},
         {$$0.j() + $$2.j(), $$0.l() + $$2.l()},
         {$$3.j(), $$3.l()},
         {$$0.j(), $$0.l()}
      };
   }

   public static boolean a(double $$0) {
      return !Double.isInfinite($$0) && $$0 < 1.0;
   }

   public static boolean a(cgh $$0, bcc $$1, dwl $$2) {
      for(dxj $$4 : $$0.d($$1, $$2)) {
         if (!$$4.b()) {
            return false;
         }
      }

      return $$0.p_().a($$2);
   }

   public static boolean a(cgh $$0, dwq $$1, bcc $$2, bco $$3) {
      return a($$0, $$2, $$2.g($$3).c($$1));
   }

   public static dxj a(cgd $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      return !$$2.a(akl.aG) && (!($$2.b() instanceof crv) || !$$2.c(crv.a)) ? $$2.k($$0, $$1) : dxg.a();
   }

   public static double a(gt $$0, int $$1, Function<gt, dxj> $$2) {
      gt.a $$3 = $$0.i();
      int $$4 = 0;

      while($$4 < $$1) {
         dxj $$5 = (dxj)$$2.apply($$3);
         if (!$$5.b()) {
            return (double)($$0.v() + $$4) + $$5.b(gy.a.b);
         }

         ++$$4;
         $$3.c(gy.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static dwq a(bbr<?> $$0, cgh $$1, gt $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cgd)$$1, $$2), () -> a((cgd)$$1, $$2.c()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.c()))) {
            return null;
         } else {
            dwq $$5 = dwq.a($$2, $$4);
            dwl $$6 = $$0.m().a($$5);

            for(dxj $$8 : $$1.d(null, $$6)) {
               if (!$$8.b()) {
                  return null;
               }
            }

            return !$$1.p_().a($$6) ? null : $$5;
         }
      }
   }
}
