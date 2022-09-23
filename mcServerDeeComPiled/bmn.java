import com.google.common.annotations.VisibleForTesting;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bmn {
   private static final int a = 10;

   public static gt a(amn $$0, int $$1, int $$2) {
      int $$3 = $$0.a(2 * $$1 + 1) - $$1;
      int $$4 = $$0.a(2 * $$2 + 1) - $$2;
      int $$5 = $$0.a(2 * $$1 + 1) - $$1;
      return new gt($$3, $$4, $$5);
   }

   @Nullable
   public static gt a(amn $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      double $$7 = ami.d($$5, $$4) - (float) (Math.PI / 2);
      double $$8 = $$7 + (double)(2.0F * $$0.i() - 1.0F) * $$6;
      double $$9 = Math.sqrt($$0.j()) * (double)ami.g * (double)$$1;
      double $$10 = -$$9 * Math.sin($$8);
      double $$11 = $$9 * Math.cos($$8);
      if (!(Math.abs($$10) > (double)$$1) && !(Math.abs($$11) > (double)$$1)) {
         int $$12 = $$0.a(2 * $$2 + 1) - $$2 + $$3;
         return new gt($$10, (double)$$12, $$11);
      } else {
         return null;
      }
   }

   @VisibleForTesting
   public static gt a(gt $$0, int $$1, Predicate<gt> $$2) {
      if (!$$2.test($$0)) {
         return $$0;
      } else {
         gt $$3 = $$0.b();

         while($$3.v() < $$1 && $$2.test($$3)) {
            $$3 = $$3.b();
         }

         return $$3;
      }
   }

   @VisibleForTesting
   public static gt a(gt $$0, int $$1, int $$2, Predicate<gt> $$3) {
      if ($$1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + $$1 + ", expected >= 0");
      } else if (!$$3.test($$0)) {
         return $$0;
      } else {
         gt $$4 = $$0.b();

         while($$4.v() < $$2 && $$3.test($$4)) {
            $$4 = $$4.b();
         }

         gt $$5;
         gt $$6;
         for($$5 = $$4; $$5.v() < $$2 && $$5.v() - $$4.v() < $$1; $$5 = $$6) {
            $$6 = $$5.b();
            if ($$3.test($$6)) {
               break;
            }
         }

         return $$5;
      }
   }

   @Nullable
   public static dwq a(bcl $$0, Supplier<gt> $$1) {
      return a($$1, $$0::f);
   }

   @Nullable
   public static dwq a(Supplier<gt> $$0, ToDoubleFunction<gt> $$1) {
      double $$2 = Double.NEGATIVE_INFINITY;
      gt $$3 = null;

      for(int $$4 = 0; $$4 < 10; ++$$4) {
         gt $$5 = (gt)$$0.get();
         if ($$5 != null) {
            double $$6 = $$1.applyAsDouble($$5);
            if ($$6 > $$2) {
               $$2 = $$6;
               $$3 = $$5;
            }
         }
      }

      return $$3 != null ? dwq.c($$3) : null;
   }

   public static gt a(bcl $$0, int $$1, amn $$2, gt $$3) {
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      if ($$0.fw() && $$1 > 1) {
         gt $$6 = $$0.ft();
         if ($$0.df() > (double)$$6.u()) {
            $$4 -= $$2.a($$1 / 2);
         } else {
            $$4 += $$2.a($$1 / 2);
         }

         if ($$0.dl() > (double)$$6.w()) {
            $$5 -= $$2.a($$1 / 2);
         } else {
            $$5 += $$2.a($$1 / 2);
         }
      }

      return new gt((double)$$4 + $$0.df(), (double)$$3.v() + $$0.dh(), (double)$$5 + $$0.dl());
   }
}
