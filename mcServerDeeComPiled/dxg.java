import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

public final class dxg {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final dxj d = ad.a((Supplier<dxj>)(() -> {
      dwz $$0 = new dwt(1, 1, 1);
      $$0.c(0, 0, 0);
      return new dwx($$0);
   }));
   public static final dxj c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final dxj e = new dws(
      new dwt(0, 0, 0),
      (DoubleList)(new DoubleArrayList(new double[]{0.0})),
      (DoubleList)(new DoubleArrayList(new double[]{0.0})),
      (DoubleList)(new DoubleArrayList(new double[]{0.0}))
   );

   public static dxj a() {
      return e;
   }

   public static dxj b() {
      return d;
   }

   public static dxj a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static dxj b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new dws(
               d.a,
               (DoubleList)DoubleArrayList.wrap(new double[]{$$0, $$3}),
               (DoubleList)DoubleArrayList.wrap(new double[]{$$1, $$4}),
               (DoubleList)DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            dwt $$12 = dwt.a(
               $$9,
               $$10,
               $$11,
               (int)Math.round($$0 * (double)$$9),
               (int)Math.round($$1 * (double)$$10),
               (int)Math.round($$2 * (double)$$11),
               (int)Math.round($$3 * (double)$$9),
               (int)Math.round($$4 * (double)$$10),
               (int)Math.round($$5 * (double)$$11)
            );
            return new dwx($$12);
         }
      } else {
         return a();
      }
   }

   public static dxj a(dwl $$0) {
      return b($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
   }

   @VisibleForTesting
   protected static int a(double $$0, double $$1) {
      if (!($$0 < -1.0E-7) && !($$1 > 1.0000001)) {
         for(int $$2 = 0; $$2 <= 3; ++$$2) {
            int $$3 = 1 << $$2;
            double $$4 = $$0 * (double)$$3;
            double $$5 = $$1 * (double)$$3;
            boolean $$6 = Math.abs($$4 - (double)Math.round($$4)) < 1.0E-7 * (double)$$3;
            boolean $$7 = Math.abs($$5 - (double)Math.round($$5)) < 1.0E-7 * (double)$$3;
            if ($$6 && $$7) {
               return $$2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   protected static long a(int $$0, int $$1) {
      return (long)$$0 * (long)($$1 / IntMath.gcd($$0, $$1));
   }

   public static dxj a(dxj $$0, dxj $$1) {
      return a($$0, $$1, dwu.o);
   }

   public static dxj a(dxj $$0, dxj... $$1) {
      return (dxj)Arrays.stream($$1).reduce($$0, dxg::a);
   }

   public static dxj a(dxj $$0, dxj $$1, dwu $$2) {
      return b($$0, $$1, $$2).c();
   }

   public static dxj b(dxj $$0, dxj $$1, dwu $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ad.c(new IllegalArgumentException());
      } else if ($$0 == $$1) {
         return $$2.apply(true, true) ? $$0 : a();
      } else {
         boolean $$3 = $$2.apply(true, false);
         boolean $$4 = $$2.apply(false, true);
         if ($$0.b()) {
            return $$4 ? $$1 : a();
         } else if ($$1.b()) {
            return $$3 ? $$0 : a();
         } else {
            dxc $$5 = a(1, $$0.a(gy.a.a), $$1.a(gy.a.a), $$3, $$4);
            dxc $$6 = a($$5.size() - 1, $$0.a(gy.a.b), $$1.a(gy.a.b), $$3, $$4);
            dxc $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(gy.a.c), $$1.a(gy.a.c), $$3, $$4);
            dwt $$8 = dwt.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (dxj)($$5 instanceof dwy && $$6 instanceof dwy && $$7 instanceof dwy ? new dwx($$8) : new dws($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(dxj $$0, dxj $$1, dwu $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ad.c(new IllegalArgumentException());
      } else {
         boolean $$3 = $$0.b();
         boolean $$4 = $$1.b();
         if (!$$3 && !$$4) {
            if ($$0 == $$1) {
               return $$2.apply(true, true);
            } else {
               boolean $$5 = $$2.apply(true, false);
               boolean $$6 = $$2.apply(false, true);

               for(gy.a $$7 : gr.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               dxc $$8 = a(1, $$0.a(gy.a.a), $$1.a(gy.a.a), $$5, $$6);
               dxc $$9 = a($$8.size() - 1, $$0.a(gy.a.b), $$1.a(gy.a.b), $$5, $$6);
               dxc $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(gy.a.c), $$1.a(gy.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(dxc $$0, dxc $$1, dxc $$2, dwz $$3, dwz $$4, dwu $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.d($$5x, $$6x, $$7xx), $$4.d($$6, $$7x, $$8x)))));
   }

   public static double a(gy.a $$0, dwl $$1, Iterable<dxj> $$2, double $$3) {
      for(dxj $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(dxj $$0, dxj $$1, gy $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.b()) {
         return false;
      } else {
         gy.a $$3 = $$2.o();
         gy.b $$4 = $$2.f();
         dxj $$5 = $$4 == gy.b.a ? $$0 : $$1;
         dxj $$6 = $$4 == gy.b.a ? $$1 : $$0;
         dwu $$7 = $$4 == gy.b.a ? dwu.e : dwu.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new dxh($$5, $$3, $$5.a.c($$3) - 1), new dxh($$6, $$3, 0), $$7);
      }
   }

   public static dxj a(dxj $$0, gy $$1) {
      if ($$0 == b()) {
         return b();
      } else {
         gy.a $$2 = $$1.o();
         boolean $$3;
         int $$4;
         if ($$1.f() == gy.b.a) {
            $$3 = DoubleMath.fuzzyEquals($$0.c($$2), 1.0, 1.0E-7);
            $$4 = $$0.a.c($$2) - 1;
         } else {
            $$3 = DoubleMath.fuzzyEquals($$0.b($$2), 0.0, 1.0E-7);
            $$4 = 0;
         }

         return (dxj)(!$$3 ? a() : new dxh($$0, $$2, $$4));
      }
   }

   public static boolean b(dxj $$0, dxj $$1, gy $$2) {
      if ($$0 != b() && $$1 != b()) {
         gy.a $$3 = $$2.o();
         gy.b $$4 = $$2.f();
         dxj $$5 = $$4 == gy.b.a ? $$0 : $$1;
         dxj $$6 = $$4 == gy.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new dxh($$5, $$3, $$5.a.c($$3) - 1), new dxh($$6, $$3, 0), dwu.o), dwu.e);
      } else {
         return true;
      }
   }

   public static boolean b(dxj $$0, dxj $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else if ($$0.b() && $$1.b()) {
         return false;
      } else {
         return !c(b(), b($$0, $$1, dwu.o), dwu.e);
      }
   }

   @VisibleForTesting
   protected static dxc a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof dww && $$2 instanceof dww) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new dwy($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new dxe($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new dxe($$2, $$1, true);
      } else {
         return (dxc)($$5 == $$6 && Objects.equals($$1, $$2) ? new dxb($$1) : new dxd($$1, $$2, $$3, $$4));
      }
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
