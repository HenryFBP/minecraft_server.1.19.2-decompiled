import java.util.function.Consumer;

public class ddp {
   protected static double a(double $$0, double $$1, double $$2, double $$3) {
      if ($$0 < $$3) {
         $$0 = $$3;
      }

      double $$4 = 0.384;
      double $$5 = $$0 / $$1 * 0.384;
      double $$6 = 0.75 * Math.pow($$5, 1.3333333333333333);
      double $$7 = Math.pow($$5, 0.6666666666666666);
      double $$8 = 0.3333333333333333 * Math.log($$5);
      double $$9 = $$2 * ($$6 - $$7 - $$8);
      $$9 = Math.max($$9, 0.0);
      return $$9 / 0.384 * $$1;
   }

   protected static boolean a(chp $$0, gt $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for(float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ami.b($$5) * (float)$$2);
            int $$7 = (int)(ami.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cgy $$0, gt $$1) {
      return $$0.a($$1, ddp::c);
   }

   protected static boolean b(cgy $$0, gt $$1) {
      return $$0.a($$1, ddp::e);
   }

   protected static void a(gy $$0, int $$1, boolean $$2, Consumer<cvo> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, cwl.e));

         for(int $$4 = 0; $$4 < $$1 - 3; ++$$4) {
            $$3.accept(a($$0, cwl.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, cwl.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? cwl.a : cwl.b));
      }

   }

   protected static void a(cgy $$0, gt $$1, gy $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         gt.a $$5 = $$1.i();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cju.qc)) {
               $$3x = $$3x.a(cpa.c, Boolean.valueOf($$0.C($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cgy $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      if ($$2.a(akl.bh)) {
         $$0.a($$1, cju.qd.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static cvo a(gy $$0, cwl $$1) {
      return cju.qc.m().a(cpa.a, $$0).a(cpa.b, $$1);
   }

   public static boolean a(cvo $$0) {
      return b($$0) || $$0.a(cju.D);
   }

   public static boolean b(cvo $$0) {
      return $$0.a(cju.qd) || $$0.a(akl.bh);
   }

   public static boolean c(cvo $$0) {
      return $$0.h() || $$0.a(cju.C);
   }

   public static boolean d(cvo $$0) {
      return !$$0.h() && !$$0.a(cju.C);
   }

   public static boolean e(cvo $$0) {
      return $$0.h() || $$0.a(cju.C) || $$0.a(cju.D);
   }
}
