import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dak {
   Codec<dak> b = dal.b;
   Codec<hc<dak>> c = aav.a(hm.aT, b);
   Codec<dak> d = c.xmap(dal.j::new, $$0 -> (hc)($$0 instanceof dal.j $$1 ? $$1.j() : new hc.a<>($$0)));

   double a(dak.b var1);

   void a(double[] var1, dak.a var2);

   dak a(dak.f var1);

   double a();

   double b();

   amc<? extends dak> c();

   default dak a(double $$0, double $$1) {
      return new dal.g(this, $$0, $$1);
   }

   default dak d() {
      return dal.a(this, dal.k.a.a);
   }

   default dak e() {
      return dal.a(this, dal.k.a.b);
   }

   default dak f() {
      return dal.a(this, dal.k.a.c);
   }

   default dak g() {
      return dal.a(this, dal.k.a.d);
   }

   default dak h() {
      return dal.a(this, dal.k.a.e);
   }

   default dak i() {
      return dal.a(this, dal.k.a.f);
   }

   public interface a {
      dak.b a(int var1);

      void a(double[] var1, dak var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dbr d() {
         return dbr.a();
      }
   }

   public static record c(hc<dpa.a> b, @Nullable dpa c) {
      public static final Codec<dak.c> a = dpa.a.b.xmap($$0 -> new dak.c($$0, null), dak.c::b);

      public c(hc<dpa.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dak {
      @Override
      default void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dak a(dak.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dak.b {
   }

   public interface f {
      dak apply(dak var1);

      default dak.c a(dak.c $$0) {
         return $$0;
      }
   }
}
