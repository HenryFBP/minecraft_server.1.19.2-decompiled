import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dav implements dak.a, dak.b {
   private final daz a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dav.i> i;
   final List<dav.e> j;
   private final Map<dak, dak> k = new HashMap();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dad m;
   private final dak n;
   private final dav.c o;
   private final dbr p;
   private final dav.g q;
   private final dav.g r;
   private final dal.c s;
   private long t = cge.a;
   private dbr.a u = new dbr.a(1.0, 0.0);
   final int v;
   final int w;
   final int x;
   boolean y;
   boolean z;
   private int A;
   int B;
   private int C;
   int D;
   int E;
   int F;
   long G;
   long H;
   int I;
   private final dak.a J = new dak.a() {
      @Override
      public dak.b a(int $$0) {
         dav.this.B = ($$0 + dav.this.d) * dav.this.x;
         ++dav.this.G;
         dav.this.E = 0;
         dav.this.I = $$0;
         return dav.this;
      }

      @Override
      public void a(double[] $$0, dak $$1) {
         for(int $$2 = 0; $$2 < dav.this.c + 1; ++$$2) {
            dav.this.B = ($$2 + dav.this.d) * dav.this.x;
            ++dav.this.G;
            dav.this.E = 0;
            dav.this.I = $$2;
            $$0[$$2] = $$1.a(dav.this);
         }

      }
   };

   public static dav a(cxj $$0, dbf $$1, dal.c $$2, daw $$3, dad.a $$4, dbr $$5) {
      daz $$6 = $$3.f().a($$0);
      cge $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dav($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dav(int $$0, dbf $$1, int $$2, int $$3, daz $$4, dal.c $$5, daw $$6, dad.a $$7, dbr $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ami.a($$4.d(), this.x);
      this.d = ami.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = hl.a($$2);
      this.h = hl.a($$3);
      this.v = hl.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dav.g(new dav.a(), false);
      this.r = new dav.g(new dav.b(), false);

      for(int $$9 = 0; $$9 <= this.v; ++$$9) {
         int $$10 = this.g + $$9;
         int $$11 = hl.c($$10);

         for(int $$12 = 0; $$12 <= this.v; ++$$12) {
            int $$13 = this.h + $$12;
            int $$14 = hl.c($$13);
            dbr.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dax $$16 = $$1.b();
      dax $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dad.a($$7);
      } else {
         int $$18 = hq.a($$2);
         int $$19 = hq.a($$3);
         this.m = dad.a(this, new cge($$18, $$19), $$17, $$1.e(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dav.c> $$20 = ImmutableList.builder();
      dak $$21 = dal.e(dal.a($$17.l(), dal.b.a)).a(this::a);
      $$20.add((dav.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dbb.a($$17.m(), $$17.n(), $$17.o(), $$1.f()));
      }

      this.o = new djq($$20.build());
      this.n = $$17.k();
   }

   protected cic.f a(dax $$0, List<cic.d> $$1) {
      return new cic.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected cvo e() {
      return this.o.calculate(this);
   }

   @Override
   public int a() {
      return this.A + this.D;
   }

   @Override
   public int b() {
      return this.B + this.E;
   }

   @Override
   public int c() {
      return this.C + this.F;
   }

   public int a(int $$0, int $$1) {
      int $$2 = hl.c(hl.a($$0));
      int $$3 = hl.c(hl.a($$1));
      return this.l.computeIfAbsent(afx.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = afx.a($$0);
      int $$2 = afx.b($$0);
      int $$3 = this.a.c();

      for(int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dak.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dbr d() {
      return this.p;
   }

   private void a(boolean $$0, int $$1) {
      this.A = $$1 * this.w;
      this.D = 0;

      for(int $$2 = 0; $$2 < this.b + 1; ++$$2) {
         int $$3 = this.f + $$2;
         this.C = $$3 * this.w;
         this.F = 0;
         ++this.H;

         for(dav.i $$4 : this.i) {
            double[] $$5 = ($$0 ? $$4.e : $$4.f)[$$2];
            $$4.a($$5, this.J);
         }
      }

      ++this.H;
   }

   public void f() {
      if (this.y) {
         throw new IllegalStateException("Staring interpolation twice");
      } else {
         this.y = true;
         this.G = 0L;
         this.a(true, this.e);
      }
   }

   public void b(int $$0) {
      this.a(false, this.e + $$0 + 1);
      this.A = (this.e + $$0) * this.w;
   }

   public dav c(int $$0) {
      int $$1 = Math.floorMod($$0, this.w);
      int $$2 = Math.floorDiv($$0, this.w);
      int $$3 = Math.floorMod($$2, this.w);
      int $$4 = this.x - 1 - Math.floorDiv($$2, this.w);
      this.D = $$3;
      this.E = $$4;
      this.F = $$1;
      this.I = $$0;
      return this;
   }

   @Override
   public void a(double[] $$0, dak $$1) {
      this.I = 0;

      for(int $$2 = this.x - 1; $$2 >= 0; --$$2) {
         this.E = $$2;

         for(int $$3 = 0; $$3 < this.w; ++$$3) {
            this.D = $$3;

            for(int $$4 = 0; $$4 < this.w; ++$$4) {
               this.F = $$4;
               $$0[this.I++] = $$1.a(this);
            }
         }
      }

   }

   public void b(int $$0, int $$1) {
      this.i.forEach($$2x -> $$2x.b($$0, $$1));
      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      ++this.H;

      for(dav.e $$2 : this.j) {
         $$2.e.a($$2.f, this);
      }

      ++this.H;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;
      this.i.forEach($$1x -> $$1x.a($$1));
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;
      this.i.forEach($$1x -> $$1x.b($$1));
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      ++this.G;
      this.i.forEach($$1x -> $$1x.c($$1));
   }

   public void g() {
      if (!this.y) {
         throw new IllegalStateException("Staring interpolation twice");
      } else {
         this.y = false;
      }
   }

   public void h() {
      this.i.forEach(dav.i::l);
   }

   public dad i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dbr.a c(int $$0, int $$1) {
      long $$2 = cge.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dbr.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dak a(dak $$0) {
      return (dak)this.k.computeIfAbsent($$0, this::b);
   }

   private dak b(dak $$0) {
      if ($$0 instanceof dal.l $$1) {
         return (dak)(switch($$1.j()) {
            case a -> new dav.i($$1.k());
            case b -> new dav.g($$1.k(), true);
            case c -> new dav.d($$1.k());
            case d -> new dav.f($$1.k());
            case e -> new dav.e($$1.k());
            default -> throw new IncompatibleClassChangeError();
         });
      } else {
         if (this.p != dbr.a()) {
            if ($$0 == dal.d.a) {
               return this.q;
            }

            if ($$0 == dal.f.a) {
               return this.r;
            }
         }

         if ($$0 == dal.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dal.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dav.h {
      @Override
      public dak k() {
         return dal.d.a;
      }

      @Override
      public dak a(dak.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dak.b $$0) {
         return dav.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return 1.0;
      }

      @Override
      public amc<? extends dak> c() {
         return dal.d.e;
      }
   }

   class b implements dav.h {
      @Override
      public dak k() {
         return dal.f.a;
      }

      @Override
      public dak a(dak.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dak.b $$0) {
         return dav.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public double a() {
         return Double.NEGATIVE_INFINITY;
      }

      @Override
      public double b() {
         return Double.POSITIVE_INFINITY;
      }

      @Override
      public amc<? extends dak> c() {
         return dal.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      cvo calculate(dak.b var1);
   }

   static class d implements dal.m, dav.h {
      private final dak a;
      private long e = cge.a;
      private double f;

      d(dak $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dak.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cge.c($$1, $$2);
         if (this.e == $$3) {
            return this.f;
         } else {
            this.e = $$3;
            double $$4 = this.a.a($$0);
            this.f = $$4;
            return $$4;
         }
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dak k() {
         return this.a;
      }

      @Override
      public dal.l.a j() {
         return dal.l.a.c;
      }
   }

   class e implements dal.m, dav.h {
      final dak e;
      final double[] f;

      e(dak $$0) {
         this.e = $$0;
         this.f = new double[dav.this.w * dav.this.w * dav.this.x];
         dav.this.j.add(this);
      }

      @Override
      public double a(dak.b $$0) {
         if ($$0 != dav.this) {
            return this.e.a($$0);
         } else if (!dav.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dav.this.D;
            int $$2 = dav.this.E;
            int $$3 = dav.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dav.this.w && $$2 < dav.this.x && $$3 < dav.this.w
               ? this.f[((dav.this.x - 1 - $$2) * dav.this.w + $$1) * dav.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dak k() {
         return this.e;
      }

      @Override
      public dal.l.a j() {
         return dal.l.a.e;
      }
   }

   class f implements dal.m, dav.h {
      private final dak e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dak $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dak.b $$0) {
         if ($$0 != dav.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dav.this.H) {
            return this.i[dav.this.I];
         } else if (this.f == dav.this.G) {
            return this.h;
         } else {
            this.f = dav.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         if (this.i != null && this.g == dav.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dav.this.H;
         }
      }

      @Override
      public dak k() {
         return this.e;
      }

      @Override
      public dal.l.a j() {
         return dal.l.a.d;
      }
   }

   class g implements dal.m, dav.h {
      private final dak e;
      final double[][] f;

      g(dak $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dav.this.v + 1][dav.this.v + 1];
         if ($$1) {
            for(int $$2 = 0; $$2 <= dav.this.v; ++$$2) {
               int $$3 = dav.this.g + $$2;
               int $$4 = hl.c($$3);

               for(int $$5 = 0; $$5 <= dav.this.v; ++$$5) {
                  int $$6 = dav.this.h + $$5;
                  int $$7 = hl.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dak.e($$4, 0, $$7));
               }
            }
         }

      }

      @Override
      public double a(dak.b $$0) {
         int $$1 = hl.a($$0.a());
         int $$2 = hl.a($$0.c());
         int $$3 = $$1 - dav.this.g;
         int $$4 = $$2 - dav.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dak k() {
         return this.e;
      }

      @Override
      public dal.l.a j() {
         return dal.l.a.b;
      }
   }

   interface h extends dak {
      dak k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dal.m, dav.h {
      double[][] e;
      double[][] f;
      private final dak g;
      private double h;
      private double i;
      private double j;
      private double k;
      private double l;
      private double m;
      private double n;
      private double o;
      private double p;
      private double q;
      private double r;
      private double s;
      private double t;
      private double u;
      private double v;

      i(dak $$1) {
         this.g = $$1;
         this.e = this.a(dav.this.c, dav.this.b);
         this.f = this.a(dav.this.c, dav.this.b);
         dav.this.i.add(this);
      }

      private double[][] a(int $$0, int $$1) {
         int $$2 = $$1 + 1;
         int $$3 = $$0 + 1;
         double[][] $$4 = new double[$$2][$$3];

         for(int $$5 = 0; $$5 < $$2; ++$$5) {
            $$4[$$5] = new double[$$3];
         }

         return $$4;
      }

      void b(int $$0, int $$1) {
         this.h = this.e[$$1][$$0];
         this.i = this.e[$$1 + 1][$$0];
         this.j = this.f[$$1][$$0];
         this.k = this.f[$$1 + 1][$$0];
         this.l = this.e[$$1][$$0 + 1];
         this.m = this.e[$$1 + 1][$$0 + 1];
         this.n = this.f[$$1][$$0 + 1];
         this.o = this.f[$$1 + 1][$$0 + 1];
      }

      void a(double $$0) {
         this.p = ami.d($$0, this.h, this.l);
         this.q = ami.d($$0, this.j, this.n);
         this.r = ami.d($$0, this.i, this.m);
         this.s = ami.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ami.d($$0, this.p, this.q);
         this.u = ami.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ami.d($$0, this.t, this.u);
      }

      @Override
      public double a(dak.b $$0) {
         if ($$0 != dav.this) {
            return this.g.a($$0);
         } else if (!dav.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dav.this.z
               ? ami.a(
                  (double)dav.this.D / (double)dav.this.w,
                  (double)dav.this.E / (double)dav.this.x,
                  (double)dav.this.F / (double)dav.this.w,
                  this.h,
                  this.j,
                  this.l,
                  this.n,
                  this.i,
                  this.k,
                  this.m,
                  this.o
               )
               : this.v;
         }
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         if (dav.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dak k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dal.l.a j() {
         return dal.l.a.a;
      }
   }
}
