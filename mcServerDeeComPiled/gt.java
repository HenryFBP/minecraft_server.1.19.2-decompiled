import com.google.common.collect.AbstractIterator;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.concurrent.Immutable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

@Immutable
public class gt extends hs {
   public static final Codec<gt> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ad.a($$0, 3).map($$0x -> new gt($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of(new int[]{$$0.u(), $$0.v(), $$0.w()}))
      .stable();
   private static final Logger d = LogUtils.getLogger();
   public static final gt b = new gt(0, 0, 0);
   private static final int e = 1 + ami.f(ami.c(30000000));
   private static final int h = e;
   public static final int c = 64 - e - h;
   private static final long i = (1L << e) - 1L;
   private static final long j = (1L << c) - 1L;
   private static final long k = (1L << h) - 1L;
   private static final int l = 0;
   private static final int m = c;
   private static final int n = c + h;

   public gt(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public gt(double $$0, double $$1, double $$2) {
      super($$0, $$1, $$2);
   }

   public gt(dwq $$0) {
      this($$0.c, $$0.d, $$0.e);
   }

   public gt(hj $$0) {
      this($$0.a(), $$0.b(), $$0.c());
   }

   public gt(hs $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, gy $$1) {
      return a($$0, $$1.j(), $$1.k(), $$1.l());
   }

   public static long a(long $$0, int $$1, int $$2, int $$3) {
      return a(a($$0) + $$1, b($$0) + $$2, c($$0) + $$3);
   }

   public static int a(long $$0) {
      return (int)($$0 << 64 - n - e >> 64 - e);
   }

   public static int b(long $$0) {
      return (int)($$0 << 64 - c >> 64 - c);
   }

   public static int c(long $$0) {
      return (int)($$0 << 64 - m - h >> 64 - h);
   }

   public static gt d(long $$0) {
      return new gt(a($$0), b($$0), c($$0));
   }

   public long a() {
      return a(this.u(), this.v(), this.w());
   }

   public static long a(int $$0, int $$1, int $$2) {
      long $$3 = 0L;
      $$3 |= ((long)$$0 & i) << n;
      $$3 |= ((long)$$1 & j) << 0;
      return $$3 | ((long)$$2 & k) << m;
   }

   public static long e(long $$0) {
      return $$0 & -16L;
   }

   public gt a(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0 ? this : new gt((double)this.u() + $$0, (double)this.v() + $$1, (double)this.w() + $$2);
   }

   public gt b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new gt(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public gt a(hs $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public gt b(hs $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public gt a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? b : new gt(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public gt b() {
      return this.a(gy.b);
   }

   public gt b(int $$0) {
      return this.a(gy.b, $$0);
   }

   public gt c() {
      return this.a(gy.a);
   }

   public gt c(int $$0) {
      return this.a(gy.a, $$0);
   }

   public gt d() {
      return this.a(gy.c);
   }

   public gt d(int $$0) {
      return this.a(gy.c, $$0);
   }

   public gt e() {
      return this.a(gy.d);
   }

   public gt e(int $$0) {
      return this.a(gy.d, $$0);
   }

   public gt f() {
      return this.a(gy.e);
   }

   public gt f(int $$0) {
      return this.a(gy.e, $$0);
   }

   public gt g() {
      return this.a(gy.f);
   }

   public gt g(int $$0) {
      return this.a(gy.f, $$0);
   }

   public gt a(gy $$0) {
      return new gt(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public gt a(gy $$0, int $$1) {
      return $$1 == 0 ? this : new gt(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public gt a(gy.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == gy.a.a ? $$1 : 0;
         int $$3 = $$0 == gy.a.b ? $$1 : 0;
         int $$4 = $$0 == gy.a.c ? $$1 : 0;
         return new gt(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public gt a(cpw $$0) {
      switch($$0) {
         case a:
         default:
            return this;
         case b:
            return new gt(-this.w(), this.v(), this.u());
         case c:
            return new gt(-this.u(), this.v(), -this.w());
         case d:
            return new gt(this.w(), this.v(), -this.u());
      }
   }

   public gt c(hs $$0) {
      return new gt(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public gt h(int $$0) {
      return new gt(this.u(), $$0, this.w());
   }

   public gt h() {
      return this;
   }

   public gt.a i() {
      return new gt.a(this.u(), this.v(), this.w());
   }

   public static Iterable<gt> a(amn $$0, int $$1, gt $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   public static Iterable<gt> a(amn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<gt>() {
            final gt.a a = new gt.a();
            int b = $$1;

            protected gt a() {
               if (this.b <= 0) {
                  return (gt)this.endOfData();
               } else {
                  gt $$0 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                  --this.b;
                  return $$0;
               }
            }
         };
   }

   public static Iterable<gt> a(gt $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<gt>() {
            private final gt.a h = new gt.a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected gt a() {
               if (this.n) {
                  this.n = false;
                  this.h.r($$7 - (this.h.w() - $$7));
                  return this.h;
               } else {
                  gt $$0;
                  for($$0 = null; $$0 == null; ++this.m) {
                     if (this.m > this.k) {
                        ++this.l;
                        if (this.l > this.j) {
                           ++this.i;
                           if (this.i > $$4) {
                              return (gt)this.endOfData();
                           }

                           this.j = Math.min($$1, this.i);
                           this.l = -this.j;
                        }

                        this.k = Math.min($$2, this.i - Math.abs(this.l));
                        this.m = -this.k;
                     }

                     int $$1 = this.l;
                     int $$2 = this.m;
                     int $$3 = this.i - Math.abs($$1) - Math.abs($$2);
                     if ($$3 <= $$3) {
                        this.n = $$3 != 0;
                        $$0 = this.h.d($$5 + $$1, $$6 + $$2, $$7 + $$3);
                     }
                  }

                  return $$0;
               }
            }
         };
   }

   public static Optional<gt> a(gt $$0, int $$1, int $$2, Predicate<gt> $$3) {
      for(gt $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<gt> b(gt $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<gt> a(gt $$0, gt $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<gt> b(gt $$0, gt $$1) {
      return StreamSupport.stream(a($$0, $$1).spliterator(), false);
   }

   public static Stream<gt> a(dkt $$0) {
      return a(
         Math.min($$0.g(), $$0.j()),
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.max($$0.g(), $$0.j()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l())
      );
   }

   public static Stream<gt> a(dwl $$0) {
      return a(ami.b($$0.a), ami.b($$0.b), ami.b($$0.c), ami.b($$0.d), ami.b($$0.e), ami.b($$0.f));
   }

   public static Stream<gt> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<gt> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<gt>() {
            private final gt.a g = new gt.a();
            private int h;

            protected gt a() {
               if (this.h == $$9) {
                  return (gt)this.endOfData();
               } else {
                  int $$0 = this.h % $$6;
                  int $$1 = this.h / $$6;
                  int $$2 = $$1 % $$7;
                  int $$3 = $$1 / $$7;
                  ++this.h;
                  return this.g.d($$0 + $$0, $$1 + $$2, $$2 + $$3);
               }
            }
         };
   }

   public static Iterable<gt.a> a(gt $$0, int $$1, gy $$2, gy $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<gt.a>() {
            private final gy[] e = new gy[]{$$2, $$3, $$2.g(), $$3.g()};
            private final gt.a f = $$0.i().c($$3);
            private final int g = 4 * $$1;
            private int h = -1;
            private int i;
            private int j;
            private int k = this.f.u();
            private int l = this.f.v();
            private int m = this.f.w();

            protected gt.a a() {
               this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
               this.k = this.f.u();
               this.l = this.f.v();
               this.m = this.f.w();
               if (this.j >= this.i) {
                  if (this.h >= this.g) {
                     return (gt.a)this.endOfData();
                  }

                  ++this.h;
                  this.j = 0;
                  this.i = this.h / 2 + 1;
               }

               ++this.j;
               return this.f;
            }
         };
   }

   public static class a extends gt {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(ami.b($$0), ami.b($$1), ami.b($$2));
      }

      @Override
      public gt a(double $$0, double $$1, double $$2) {
         return super.a($$0, $$1, $$2).h();
      }

      @Override
      public gt b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).h();
      }

      @Override
      public gt a(int $$0) {
         return super.a($$0).h();
      }

      @Override
      public gt a(gy $$0, int $$1) {
         return super.a($$0, $$1).h();
      }

      @Override
      public gt a(gy.a $$0, int $$1) {
         return super.a($$0, $$1).h();
      }

      @Override
      public gt a(cpw $$0) {
         return super.a($$0).h();
      }

      public gt.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public gt.a c(double $$0, double $$1, double $$2) {
         return this.d(ami.b($$0), ami.b($$1), ami.b($$2));
      }

      public gt.a g(hs $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public gt.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public gt.a a(gr $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, gy.a.a), $$0.a($$1, $$2, $$3, gy.a.b), $$0.a($$1, $$2, $$3, gy.a.c));
      }

      public gt.a a(hs $$0, gy $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public gt.a a(hs $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public gt.a a(hs $$0, hs $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public gt.a c(gy $$0) {
         return this.c($$0, 1);
      }

      public gt.a c(gy $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public gt.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public gt.a h(hs $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public gt.a a(gy.a $$0, int $$1, int $$2) {
         switch($$0) {
            case a:
               return this.d(ami.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), ami.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), ami.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public gt.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public gt.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public gt.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public gt h() {
         return new gt(this);
      }
   }
}
