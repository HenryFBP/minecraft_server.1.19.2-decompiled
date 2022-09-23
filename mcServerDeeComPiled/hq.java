import it.unimi.dsi.fastutil.longs.LongConsumer;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class hq extends hs {
   public static final int a = 4;
   public static final int b = 16;
   public static final int c = 15;
   public static final int d = 8;
   public static final int e = 15;
   private static final int h = 22;
   private static final int i = 20;
   private static final int j = 22;
   private static final long k = 4194303L;
   private static final long l = 1048575L;
   private static final long m = 4194303L;
   private static final int n = 0;
   private static final int o = 20;
   private static final int p = 42;
   private static final int q = 8;
   private static final int r = 0;
   private static final int s = 4;

   hq(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public static hq a(int $$0, int $$1, int $$2) {
      return new hq($$0, $$1, $$2);
   }

   public static hq a(gt $$0) {
      return new hq(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   public static hq a(cge $$0, int $$1) {
      return new hq($$0.e, $$1, $$0.f);
   }

   public static hq a(czc $$0) {
      return a($$0.da());
   }

   public static hq a(hj $$0) {
      return new hq(b($$0.a()), b($$0.b()), b($$0.c()));
   }

   public static hq a(long $$0) {
      return new hq(b($$0), c($$0), d($$0));
   }

   public static hq a(cxj $$0) {
      return a($$0.f(), $$0.aj());
   }

   public static long a(long $$0, gy $$1) {
      return a($$0, $$1.j(), $$1.k(), $$1.l());
   }

   public static long a(long $$0, int $$1, int $$2, int $$3) {
      return b(b($$0) + $$1, c($$0) + $$2, d($$0) + $$3);
   }

   public static int a(double $$0) {
      return a(ami.b($$0));
   }

   public static int a(int $$0) {
      return $$0 >> 4;
   }

   public static int b(double $$0) {
      return ami.b($$0) >> 4;
   }

   public static int b(int $$0) {
      return $$0 & 15;
   }

   public static short b(gt $$0) {
      int $$1 = b($$0.u());
      int $$2 = b($$0.v());
      int $$3 = b($$0.w());
      return (short)($$1 << 8 | $$3 << 4 | $$2 << 0);
   }

   public static int a(short $$0) {
      return $$0 >>> 8 & 15;
   }

   public static int b(short $$0) {
      return $$0 >>> 0 & 15;
   }

   public static int c(short $$0) {
      return $$0 >>> 4 & 15;
   }

   public int d(short $$0) {
      return this.d() + a($$0);
   }

   public int e(short $$0) {
      return this.e() + b($$0);
   }

   public int f(short $$0) {
      return this.f() + c($$0);
   }

   public gt g(short $$0) {
      return new gt(this.d($$0), this.e($$0), this.f($$0));
   }

   public static int c(int $$0) {
      return $$0 << 4;
   }

   public static int a(int $$0, int $$1) {
      return c($$0) + $$1;
   }

   public static int b(long $$0) {
      return (int)($$0 << 0 >> 42);
   }

   public static int c(long $$0) {
      return (int)($$0 << 44 >> 44);
   }

   public static int d(long $$0) {
      return (int)($$0 << 22 >> 42);
   }

   public int a() {
      return this.u();
   }

   public int b() {
      return this.v();
   }

   public int c() {
      return this.w();
   }

   public int d() {
      return c(this.a());
   }

   public int e() {
      return c(this.b());
   }

   public int f() {
      return c(this.c());
   }

   public int g() {
      return a(this.a(), 15);
   }

   public int h() {
      return a(this.b(), 15);
   }

   public int i() {
      return a(this.c(), 15);
   }

   public static long e(long $$0) {
      return b(a(gt.a($$0)), a(gt.b($$0)), a(gt.c($$0)));
   }

   public static long f(long $$0) {
      return $$0 & -1048576L;
   }

   public gt p() {
      return new gt(c(this.a()), c(this.b()), c(this.c()));
   }

   public gt q() {
      int $$0 = 8;
      return this.p().b(8, 8, 8);
   }

   public cge r() {
      return new cge(this.a(), this.c());
   }

   public static long c(gt $$0) {
      return b(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   public static long b(int $$0, int $$1, int $$2) {
      long $$3 = 0L;
      $$3 |= ((long)$$0 & 4194303L) << 42;
      $$3 |= ((long)$$1 & 1048575L) << 0;
      return $$3 | ((long)$$2 & 4194303L) << 20;
   }

   public long s() {
      return b(this.a(), this.b(), this.c());
   }

   public hq d(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new hq(this.a() + $$0, this.b() + $$1, this.c() + $$2);
   }

   public Stream<gt> t() {
      return gt.a(this.d(), this.e(), this.f(), this.g(), this.h(), this.i());
   }

   public static Stream<hq> a(hq $$0, int $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      int $$4 = $$0.c();
      return a($$2 - $$1, $$3 - $$1, $$4 - $$1, $$2 + $$1, $$3 + $$1, $$4 + $$1);
   }

   public static Stream<hq> a(cge $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$0.e;
      int $$5 = $$0.f;
      return a($$4 - $$1, $$2, $$5 - $$1, $$4 + $$1, $$3 - 1, $$5 + $$1);
   }

   public static Stream<hq> a(final int $$0, final int $$1, final int $$2, final int $$3, final int $$4, final int $$5) {
      return StreamSupport.stream(new AbstractSpliterator<hq>((long)(($$3 - $$0 + 1) * ($$4 - $$1 + 1) * ($$5 - $$2 + 1)), 64) {
         final gw a = new gw($$0, $$1, $$2, $$3, $$4, $$5);

         public boolean tryAdvance(Consumer<? super hq> $$0x) {
            if (this.a.a()) {
               $$0.accept(new hq(this.a.b(), this.a.c(), this.a.d()));
               return true;
            } else {
               return false;
            }
         }
      }, false);
   }

   public static void a(gt $$0, LongConsumer $$1) {
      a($$0.u(), $$0.v(), $$0.w(), $$1);
   }

   public static void a(long $$0, LongConsumer $$1) {
      a(gt.a($$0), gt.b($$0), gt.c($$0), $$1);
   }

   public static void a(int $$0, int $$1, int $$2, LongConsumer $$3) {
      int $$4 = a($$0 - 1);
      int $$5 = a($$0 + 1);
      int $$6 = a($$1 - 1);
      int $$7 = a($$1 + 1);
      int $$8 = a($$2 - 1);
      int $$9 = a($$2 + 1);
      if ($$4 == $$5 && $$6 == $$7 && $$8 == $$9) {
         $$3.accept(b($$4, $$6, $$8));
      } else {
         for(int $$10 = $$4; $$10 <= $$5; ++$$10) {
            for(int $$11 = $$6; $$11 <= $$7; ++$$11) {
               for(int $$12 = $$8; $$12 <= $$9; ++$$12) {
                  $$3.accept(b($$10, $$11, $$12));
               }
            }
         }
      }

   }
}
