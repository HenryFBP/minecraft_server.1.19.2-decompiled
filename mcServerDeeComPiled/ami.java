import java.util.Locale;
import java.util.UUID;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import org.apache.commons.lang3.math.NumberUtils;

public class ami {
   private static final int h = 1024;
   private static final float i = 1024.0F;
   private static final long j = 61440L;
   private static final long k = 16384L;
   private static final long l = -4611686018427387904L;
   private static final long m = Long.MIN_VALUE;
   public static final float a = (float) Math.PI;
   public static final float b = (float) (Math.PI / 2);
   public static final float c = (float) (Math.PI * 2);
   public static final float d = (float) (Math.PI / 180.0);
   public static final float e = 180.0F / (float)Math.PI;
   public static final float f = 1.0E-5F;
   public static final float g = c(2.0F);
   private static final float n = 10430.378F;
   private static final float[] o = ad.a(new float[65536], $$0x -> {
      for(int $$1x = 0; $$1x < $$0x.length; ++$$1x) {
         $$0x[$$1x] = (float)Math.sin((double)$$1x * Math.PI * 2.0 / 65536.0);
      }

   });
   private static final amn p = amn.b();
   private static final int[] q = new int[]{
      0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9
   };
   private static final double r = 0.16666666666666666;
   private static final int s = 8;
   private static final int t = 257;
   private static final double u = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] v = new double[257];
   private static final double[] w = new double[257];

   public static float a(float $$0) {
      return o[(int)($$0 * 10430.378F) & 65535];
   }

   public static float b(float $$0) {
      return o[(int)($$0 * 10430.378F + 16384.0F) & 65535];
   }

   public static float c(float $$0) {
      return (float)Math.sqrt((double)$$0);
   }

   public static int d(float $$0) {
      int $$1 = (int)$$0;
      return $$0 < (float)$$1 ? $$1 - 1 : $$1;
   }

   public static int a(double $$0) {
      return (int)($$0 + 1024.0) - 1024;
   }

   public static int b(double $$0) {
      int $$1 = (int)$$0;
      return $$0 < (double)$$1 ? $$1 - 1 : $$1;
   }

   public static long c(double $$0) {
      long $$1 = (long)$$0;
      return $$0 < (double)$$1 ? $$1 - 1L : $$1;
   }

   public static int d(double $$0) {
      return (int)($$0 >= 0.0 ? $$0 : -$$0 + 1.0);
   }

   public static float e(float $$0) {
      return Math.abs($$0);
   }

   public static int a(int $$0) {
      return Math.abs($$0);
   }

   public static int f(float $$0) {
      int $$1 = (int)$$0;
      return $$0 > (float)$$1 ? $$1 + 1 : $$1;
   }

   public static int e(double $$0) {
      int $$1 = (int)$$0;
      return $$0 > (double)$$1 ? $$1 + 1 : $$1;
   }

   public static byte a(byte $$0, byte $$1, byte $$2) {
      if ($$0 < $$1) {
         return $$1;
      } else {
         return $$0 > $$2 ? $$2 : $$0;
      }
   }

   public static int a(int $$0, int $$1, int $$2) {
      if ($$0 < $$1) {
         return $$1;
      } else {
         return $$0 > $$2 ? $$2 : $$0;
      }
   }

   public static long a(long $$0, long $$1, long $$2) {
      if ($$0 < $$1) {
         return $$1;
      } else {
         return $$0 > $$2 ? $$2 : $$0;
      }
   }

   public static float a(float $$0, float $$1, float $$2) {
      if ($$0 < $$1) {
         return $$1;
      } else {
         return $$0 > $$2 ? $$2 : $$0;
      }
   }

   public static double a(double $$0, double $$1, double $$2) {
      if ($$0 < $$1) {
         return $$1;
      } else {
         return $$0 > $$2 ? $$2 : $$0;
      }
   }

   public static double b(double $$0, double $$1, double $$2) {
      if ($$2 < 0.0) {
         return $$0;
      } else {
         return $$2 > 1.0 ? $$1 : d($$2, $$0, $$1);
      }
   }

   public static float b(float $$0, float $$1, float $$2) {
      if ($$2 < 0.0F) {
         return $$0;
      } else {
         return $$2 > 1.0F ? $$1 : i($$2, $$0, $$1);
      }
   }

   public static double a(double $$0, double $$1) {
      if ($$0 < 0.0) {
         $$0 = -$$0;
      }

      if ($$1 < 0.0) {
         $$1 = -$$1;
      }

      return $$0 > $$1 ? $$0 : $$1;
   }

   public static int a(int $$0, int $$1) {
      return Math.floorDiv($$0, $$1);
   }

   public static int a(amn $$0, int $$1, int $$2) {
      return $$1 >= $$2 ? $$1 : $$0.a($$2 - $$1 + 1) + $$1;
   }

   public static float a(amn $$0, float $$1, float $$2) {
      return $$1 >= $$2 ? $$1 : $$0.i() * ($$2 - $$1) + $$1;
   }

   public static double a(amn $$0, double $$1, double $$2) {
      return $$1 >= $$2 ? $$1 : $$0.j() * ($$2 - $$1) + $$1;
   }

   public static double a(long[] $$0) {
      long $$1 = 0L;

      for(long $$2 : $$0) {
         $$1 += $$2;
      }

      return (double)$$1 / (double)$$0.length;
   }

   public static boolean a(float $$0, float $$1) {
      return Math.abs($$1 - $$0) < 1.0E-5F;
   }

   public static boolean b(double $$0, double $$1) {
      return Math.abs($$1 - $$0) < 1.0E-5F;
   }

   public static int b(int $$0, int $$1) {
      return Math.floorMod($$0, $$1);
   }

   public static float b(float $$0, float $$1) {
      return ($$0 % $$1 + $$1) % $$1;
   }

   public static double c(double $$0, double $$1) {
      return ($$0 % $$1 + $$1) % $$1;
   }

   public static int b(int $$0) {
      int $$1 = $$0 % 360;
      if ($$1 >= 180) {
         $$1 -= 360;
      }

      if ($$1 < -180) {
         $$1 += 360;
      }

      return $$1;
   }

   public static float g(float $$0) {
      float $$1 = $$0 % 360.0F;
      if ($$1 >= 180.0F) {
         $$1 -= 360.0F;
      }

      if ($$1 < -180.0F) {
         $$1 += 360.0F;
      }

      return $$1;
   }

   public static double f(double $$0) {
      double $$1 = $$0 % 360.0;
      if ($$1 >= 180.0) {
         $$1 -= 360.0;
      }

      if ($$1 < -180.0) {
         $$1 += 360.0;
      }

      return $$1;
   }

   public static float c(float $$0, float $$1) {
      return g($$1 - $$0);
   }

   public static float d(float $$0, float $$1) {
      return e(c($$0, $$1));
   }

   public static float c(float $$0, float $$1, float $$2) {
      float $$3 = c($$0, $$1);
      float $$4 = a($$3, -$$2, $$2);
      return $$1 - $$4;
   }

   public static float d(float $$0, float $$1, float $$2) {
      $$2 = e($$2);
      return $$0 < $$1 ? a($$0 + $$2, $$0, $$1) : a($$0 - $$2, $$1, $$0);
   }

   public static float e(float $$0, float $$1, float $$2) {
      float $$3 = c($$0, $$1);
      return d($$0, $$0 + $$3, $$2);
   }

   public static int a(String $$0, int $$1) {
      return NumberUtils.toInt($$0, $$1);
   }

   public static int a(String $$0, int $$1, int $$2) {
      return Math.max($$2, a($$0, $$1));
   }

   public static double a(String $$0, double $$1) {
      try {
         return Double.parseDouble($$0);
      } catch (Throwable var4) {
         return $$1;
      }
   }

   public static double a(String $$0, double $$1, double $$2) {
      return Math.max($$2, a($$0, $$1));
   }

   public static int c(int $$0) {
      int $$1 = $$0 - 1;
      $$1 |= $$1 >> 1;
      $$1 |= $$1 >> 2;
      $$1 |= $$1 >> 4;
      $$1 |= $$1 >> 8;
      $$1 |= $$1 >> 16;
      return $$1 + 1;
   }

   public static boolean d(int $$0) {
      return $$0 != 0 && ($$0 & $$0 - 1) == 0;
   }

   public static int e(int $$0) {
      $$0 = d($$0) ? $$0 : c($$0);
      return q[(int)((long)$$0 * 125613361L >> 27) & 31];
   }

   public static int f(int $$0) {
      return e($$0) - (d($$0) ? 0 : 1);
   }

   public static int f(float $$0, float $$1, float $$2) {
      return b(d($$0 * 255.0F), d($$1 * 255.0F), d($$2 * 255.0F));
   }

   public static int b(int $$0, int $$1, int $$2) {
      int $$3 = ($$0 << 8) + $$1;
      return ($$3 << 8) + $$2;
   }

   public static int c(int $$0, int $$1) {
      int $$2 = ($$0 & 0xFF0000) >> 16;
      int $$3 = ($$1 & 0xFF0000) >> 16;
      int $$4 = ($$0 & 0xFF00) >> 8;
      int $$5 = ($$1 & 0xFF00) >> 8;
      int $$6 = ($$0 & 0xFF) >> 0;
      int $$7 = ($$1 & 0xFF) >> 0;
      int $$8 = (int)((float)$$2 * (float)$$3 / 255.0F);
      int $$9 = (int)((float)$$4 * (float)$$5 / 255.0F);
      int $$10 = (int)((float)$$6 * (float)$$7 / 255.0F);
      return $$0 & 0xFF000000 | $$8 << 16 | $$9 << 8 | $$10;
   }

   public static int a(int $$0, float $$1, float $$2, float $$3) {
      int $$4 = ($$0 & 0xFF0000) >> 16;
      int $$5 = ($$0 & 0xFF00) >> 8;
      int $$6 = ($$0 & 0xFF) >> 0;
      int $$7 = (int)((float)$$4 * $$1);
      int $$8 = (int)((float)$$5 * $$2);
      int $$9 = (int)((float)$$6 * $$3);
      return $$0 & 0xFF000000 | $$7 << 16 | $$8 << 8 | $$9;
   }

   public static float h(float $$0) {
      return $$0 - (float)d($$0);
   }

   public static double g(double $$0) {
      return $$0 - (double)c($$0);
   }

   public static dwq a(dwq $$0, dwq $$1, dwq $$2, dwq $$3, double $$4) {
      double $$5 = ((-$$4 + 2.0) * $$4 - 1.0) * $$4 * 0.5;
      double $$6 = ((3.0 * $$4 - 5.0) * $$4 * $$4 + 2.0) * 0.5;
      double $$7 = ((-3.0 * $$4 + 4.0) * $$4 + 1.0) * $$4 * 0.5;
      double $$8 = ($$4 - 1.0) * $$4 * $$4 * 0.5;
      return new dwq(
         $$0.c * $$5 + $$1.c * $$6 + $$2.c * $$7 + $$3.c * $$8,
         $$0.d * $$5 + $$1.d * $$6 + $$2.d * $$7 + $$3.d * $$8,
         $$0.e * $$5 + $$1.e * $$6 + $$2.e * $$7 + $$3.e * $$8
      );
   }

   public static long a(hs $$0) {
      return c($$0.u(), $$0.v(), $$0.w());
   }

   public static long c(int $$0, int $$1, int $$2) {
      long $$3 = (long)($$0 * 3129871) ^ (long)$$2 * 116129781L ^ (long)$$1;
      $$3 = $$3 * $$3 * 42317861L + $$3 * 11L;
      return $$3 >> 16;
   }

   public static UUID a(amn $$0) {
      long $$1 = $$0.g() & -61441L | 16384L;
      long $$2 = $$0.g() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID($$1, $$2);
   }

   public static UUID a() {
      return a(p);
   }

   public static double c(double $$0, double $$1, double $$2) {
      return ($$0 - $$1) / ($$2 - $$1);
   }

   public static float g(float $$0, float $$1, float $$2) {
      return ($$0 - $$1) / ($$2 - $$1);
   }

   public static boolean a(dwq $$0, dwq $$1, dwl $$2) {
      double $$3 = ($$2.a + $$2.d) * 0.5;
      double $$4 = ($$2.d - $$2.a) * 0.5;
      double $$5 = $$0.c - $$3;
      if (Math.abs($$5) > $$4 && $$5 * $$1.c >= 0.0) {
         return false;
      } else {
         double $$6 = ($$2.b + $$2.e) * 0.5;
         double $$7 = ($$2.e - $$2.b) * 0.5;
         double $$8 = $$0.d - $$6;
         if (Math.abs($$8) > $$7 && $$8 * $$1.d >= 0.0) {
            return false;
         } else {
            double $$9 = ($$2.c + $$2.f) * 0.5;
            double $$10 = ($$2.f - $$2.c) * 0.5;
            double $$11 = $$0.e - $$9;
            if (Math.abs($$11) > $$10 && $$11 * $$1.e >= 0.0) {
               return false;
            } else {
               double $$12 = Math.abs($$1.c);
               double $$13 = Math.abs($$1.d);
               double $$14 = Math.abs($$1.e);
               double $$15 = $$1.d * $$11 - $$1.e * $$8;
               if (Math.abs($$15) > $$7 * $$14 + $$10 * $$13) {
                  return false;
               } else {
                  $$15 = $$1.e * $$5 - $$1.c * $$11;
                  if (Math.abs($$15) > $$4 * $$14 + $$10 * $$12) {
                     return false;
                  } else {
                     $$15 = $$1.c * $$8 - $$1.d * $$5;
                     return Math.abs($$15) < $$4 * $$13 + $$7 * $$12;
                  }
               }
            }
         }
      }
   }

   public static double d(double $$0, double $$1) {
      double $$2 = $$1 * $$1 + $$0 * $$0;
      if (Double.isNaN($$2)) {
         return Double.NaN;
      } else {
         boolean $$3 = $$0 < 0.0;
         if ($$3) {
            $$0 = -$$0;
         }

         boolean $$4 = $$1 < 0.0;
         if ($$4) {
            $$1 = -$$1;
         }

         boolean $$5 = $$0 > $$1;
         if ($$5) {
            double $$6 = $$1;
            $$1 = $$0;
            $$0 = $$6;
         }

         double $$7 = h($$2);
         $$1 *= $$7;
         $$0 *= $$7;
         double $$8 = u + $$0;
         int $$9 = (int)Double.doubleToRawLongBits($$8);
         double $$10 = v[$$9];
         double $$11 = w[$$9];
         double $$12 = $$8 - u;
         double $$13 = $$0 * $$11 - $$1 * $$12;
         double $$14 = (6.0 + $$13 * $$13) * $$13 * 0.16666666666666666;
         double $$15 = $$10 + $$14;
         if ($$5) {
            $$15 = Math.PI / 2 - $$15;
         }

         if ($$4) {
            $$15 = Math.PI - $$15;
         }

         if ($$3) {
            $$15 = -$$15;
         }

         return $$15;
      }
   }

   public static float i(float $$0) {
      float $$1 = 0.5F * $$0;
      int $$2 = Float.floatToIntBits($$0);
      $$2 = 1597463007 - ($$2 >> 1);
      $$0 = Float.intBitsToFloat($$2);
      return $$0 * (1.5F - $$1 * $$0 * $$0);
   }

   public static double h(double $$0) {
      double $$1 = 0.5 * $$0;
      long $$2 = Double.doubleToRawLongBits($$0);
      $$2 = 6910469410427058090L - ($$2 >> 1);
      $$0 = Double.longBitsToDouble($$2);
      return $$0 * (1.5 - $$1 * $$0 * $$0);
   }

   public static float j(float $$0) {
      int $$1 = Float.floatToIntBits($$0);
      $$1 = 1419967116 - $$1 / 3;
      float $$2 = Float.intBitsToFloat($$1);
      $$2 = 0.6666667F * $$2 + 1.0F / (3.0F * $$2 * $$2 * $$0);
      return 0.6666667F * $$2 + 1.0F / (3.0F * $$2 * $$2 * $$0);
   }

   public static int h(float $$0, float $$1, float $$2) {
      int $$3 = (int)($$0 * 6.0F) % 6;
      float $$4 = $$0 * 6.0F - (float)$$3;
      float $$5 = $$2 * (1.0F - $$1);
      float $$6 = $$2 * (1.0F - $$4 * $$1);
      float $$7 = $$2 * (1.0F - (1.0F - $$4) * $$1);
      float $$8;
      float $$9;
      float $$10;
      switch($$3) {
         case 0:
            $$8 = $$2;
            $$9 = $$7;
            $$10 = $$5;
            break;
         case 1:
            $$8 = $$6;
            $$9 = $$2;
            $$10 = $$5;
            break;
         case 2:
            $$8 = $$5;
            $$9 = $$2;
            $$10 = $$7;
            break;
         case 3:
            $$8 = $$5;
            $$9 = $$6;
            $$10 = $$2;
            break;
         case 4:
            $$8 = $$7;
            $$9 = $$5;
            $$10 = $$2;
            break;
         case 5:
            $$8 = $$2;
            $$9 = $$5;
            $$10 = $$6;
            break;
         default:
            throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + $$0 + ", " + $$1 + ", " + $$2);
      }

      int $$29 = a((int)($$8 * 255.0F), 0, 255);
      int $$30 = a((int)($$9 * 255.0F), 0, 255);
      int $$31 = a((int)($$10 * 255.0F), 0, 255);
      return $$29 << 16 | $$30 << 8 | $$31;
   }

   public static int g(int $$0) {
      $$0 ^= $$0 >>> 16;
      $$0 *= -2048144789;
      $$0 ^= $$0 >>> 13;
      $$0 *= -1028477387;
      return $$0 ^ $$0 >>> 16;
   }

   public static long a(long $$0) {
      $$0 ^= $$0 >>> 33;
      $$0 *= -49064778989728563L;
      $$0 ^= $$0 >>> 33;
      $$0 *= -4265267296055464877L;
      return $$0 ^ $$0 >>> 33;
   }

   public static double[] a(double... $$0) {
      double $$1 = 0.0;

      for(double $$2 : $$0) {
         $$1 += $$2;
      }

      for(int $$3 = 0; $$3 < $$0.length; ++$$3) {
         $$0[$$3] /= $$1;
      }

      for(int $$4 = 0; $$4 < $$0.length; ++$$4) {
         $$0[$$4] += $$4 == 0 ? 0.0 : $$0[$$4 - 1];
      }

      return $$0;
   }

   public static int a(amn $$0, double[] $$1) {
      double $$2 = $$0.j();

      for(int $$3 = 0; $$3 < $$1.length; ++$$3) {
         if ($$2 < $$1[$$3]) {
            return $$3;
         }
      }

      return $$1.length;
   }

   public static double[] a(double $$0, double $$1, double $$2, int $$3, int $$4) {
      double[] $$5 = new double[$$4 - $$3 + 1];
      int $$6 = 0;

      for(int $$7 = $$3; $$7 <= $$4; ++$$7) {
         $$5[$$6] = Math.max(0.0, $$0 * StrictMath.exp(-((double)$$7 - $$2) * ((double)$$7 - $$2) / (2.0 * $$1 * $$1)));
         ++$$6;
      }

      return $$5;
   }

   public static double[] a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, int $$6, int $$7) {
      double[] $$8 = new double[$$7 - $$6 + 1];
      int $$9 = 0;

      for(int $$10 = $$6; $$10 <= $$7; ++$$10) {
         $$8[$$9] = Math.max(
            0.0,
            $$0 * StrictMath.exp(-((double)$$10 - $$2) * ((double)$$10 - $$2) / (2.0 * $$1 * $$1))
               + $$3 * StrictMath.exp(-((double)$$10 - $$5) * ((double)$$10 - $$5) / (2.0 * $$4 * $$4))
         );
         ++$$9;
      }

      return $$8;
   }

   public static double[] a(double $$0, double $$1, int $$2, int $$3) {
      double[] $$4 = new double[$$3 - $$2 + 1];
      int $$5 = 0;

      for(int $$6 = $$2; $$6 <= $$3; ++$$6) {
         $$4[$$5] = Math.max($$0 * StrictMath.log((double)$$6) + $$1, 0.0);
         ++$$5;
      }

      return $$4;
   }

   public static int a(int $$0, int $$1, IntPredicate $$2) {
      int $$3 = $$1 - $$0;

      while($$3 > 0) {
         int $$4 = $$3 / 2;
         int $$5 = $$0 + $$4;
         if ($$2.test($$5)) {
            $$3 = $$4;
         } else {
            $$0 = $$5 + 1;
            $$3 -= $$4 + 1;
         }
      }

      return $$0;
   }

   public static float i(float $$0, float $$1, float $$2) {
      return $$1 + $$0 * ($$2 - $$1);
   }

   public static double d(double $$0, double $$1, double $$2) {
      return $$1 + $$0 * ($$2 - $$1);
   }

   public static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return d($$1, d($$0, $$2, $$3), d($$0, $$4, $$5));
   }

   public static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8, double $$9, double $$10) {
      return d($$2, a($$0, $$1, $$3, $$4, $$5, $$6), a($$0, $$1, $$7, $$8, $$9, $$10));
   }

   public static float a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      return 0.5F
         * (
            2.0F * $$2
               + ($$3 - $$1) * $$0
               + (2.0F * $$1 - 5.0F * $$2 + 4.0F * $$3 - $$4) * $$0 * $$0
               + (3.0F * $$2 - $$1 - 3.0F * $$3 + $$4) * $$0 * $$0 * $$0
         );
   }

   public static double i(double $$0) {
      return $$0 * $$0 * $$0 * ($$0 * ($$0 * 6.0 - 15.0) + 10.0);
   }

   public static double j(double $$0) {
      return 30.0 * $$0 * $$0 * ($$0 - 1.0) * ($$0 - 1.0);
   }

   public static int k(double $$0) {
      if ($$0 == 0.0) {
         return 0;
      } else {
         return $$0 > 0.0 ? 1 : -1;
      }
   }

   public static float j(float $$0, float $$1, float $$2) {
      return $$1 + $$0 * g($$2 - $$1);
   }

   public static float k(float $$0, float $$1, float $$2) {
      return Math.min($$0 * $$0 * 0.6F + $$1 * $$1 * ((3.0F + $$1) / 4.0F) + $$2 * $$2 * 0.8F, 1.0F);
   }

   @Deprecated
   public static float l(float $$0, float $$1, float $$2) {
      float $$3 = $$1 - $$0;

      while($$3 < -180.0F) {
         $$3 += 360.0F;
      }

      while($$3 >= 180.0F) {
         $$3 -= 360.0F;
      }

      return $$0 + $$2 * $$3;
   }

   @Deprecated
   public static float l(double $$0) {
      while($$0 >= 180.0) {
         $$0 -= 360.0;
      }

      while($$0 < -180.0) {
         $$0 += 360.0;
      }

      return (float)$$0;
   }

   public static float e(float $$0, float $$1) {
      return (Math.abs($$0 % $$1 - $$1 * 0.5F) - $$1 * 0.25F) / ($$1 * 0.25F);
   }

   public static float k(float $$0) {
      return $$0 * $$0;
   }

   public static double m(double $$0) {
      return $$0 * $$0;
   }

   public static int h(int $$0) {
      return $$0 * $$0;
   }

   public static long b(long $$0) {
      return $$0 * $$0;
   }

   public static float l(float $$0) {
      return $$0 * $$0 * $$0;
   }

   public static double a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      return b($$3, $$4, c($$0, $$1, $$2));
   }

   public static float b(float $$0, float $$1, float $$2, float $$3, float $$4) {
      return b($$3, $$4, g($$0, $$1, $$2));
   }

   public static double b(double $$0, double $$1, double $$2, double $$3, double $$4) {
      return d(c($$0, $$1, $$2), $$3, $$4);
   }

   public static float c(float $$0, float $$1, float $$2, float $$3, float $$4) {
      return i(g($$0, $$1, $$2), $$3, $$4);
   }

   public static double n(double $$0) {
      return $$0 + (2.0 * amn.a((long)b($$0 * 3000.0)).j() - 1.0) * 1.0E-7 / 2.0;
   }

   public static int d(int $$0, int $$1) {
      return e($$0, $$1) * $$1;
   }

   public static int e(int $$0, int $$1) {
      return -Math.floorDiv(-$$0, $$1);
   }

   public static int b(amn $$0, int $$1, int $$2) {
      return $$0.a($$2 - $$1 + 1) + $$1;
   }

   public static float b(amn $$0, float $$1, float $$2) {
      return $$0.i() * ($$2 - $$1) + $$1;
   }

   public static float c(amn $$0, float $$1, float $$2) {
      return $$1 + (float)$$0.k() * $$2;
   }

   public static double e(double $$0, double $$1) {
      return $$0 * $$0 + $$1 * $$1;
   }

   public static double f(double $$0, double $$1) {
      return Math.sqrt(e($$0, $$1));
   }

   public static double e(double $$0, double $$1, double $$2) {
      return $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
   }

   public static double f(double $$0, double $$1, double $$2) {
      return Math.sqrt(e($$0, $$1, $$2));
   }

   public static int a(double $$0, int $$1) {
      return b($$0 / (double)$$1) * $$1;
   }

   public static IntStream d(int $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static IntStream a(int $$0, int $$1, int $$2, int $$3) {
      if ($$1 > $$2) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "upperbound %d expected to be > lowerBound %d", $$2, $$1));
      } else if ($$3 < 1) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "steps expected to be >= 1, was %d", $$3));
      } else {
         return $$0 >= $$1 && $$0 <= $$2 ? IntStream.iterate($$0, $$3x -> {
            int $$4 = Math.abs($$0 - $$3x);
            return $$0 - $$4 >= $$1 || $$0 + $$4 <= $$2;
         }, $$4 -> {
            boolean $$5 = $$4 <= $$0;
            int $$6 = Math.abs($$0 - $$4);
            boolean $$7 = $$0 + $$6 + $$3 <= $$2;
            if (!$$5 || !$$7) {
               int $$8 = $$0 - $$6 - ($$5 ? $$3 : 0);
               if ($$8 >= $$1) {
                  return $$8;
               }
            }

            return $$0 + $$6 + $$3;
         }) : IntStream.empty();
      }
   }

   static {
      for(int $$0 = 0; $$0 < 257; ++$$0) {
         double $$1 = (double)$$0 / 256.0;
         double $$2 = Math.asin($$1);
         w[$$0] = Math.cos($$2);
         v[$$0] = $$2;
      }

   }
}
