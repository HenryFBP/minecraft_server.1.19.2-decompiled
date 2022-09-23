import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunction;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.slf4j.Logger;

public final class dal {
   private static final Codec<dak> c = hm.bF.p().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dak> b = Codec.either(d, c)
      .xmap($$0 -> (dak)$$0.map(dal::a, Function.identity()), $$0 -> $$0 instanceof dal.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dak> a(hm<Codec<? extends dak>> $$0) {
      a($$0, "blend_alpha", dal.d.e);
      a($$0, "blend_offset", dal.f.e);
      a($$0, "beardifier", dal.b.e);
      a($$0, "old_blended_noise", dox.a);

      for(dal.l.a $$1 : dal.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dal.o.e);
      a($$0, "end_islands", dal.i.a);
      a($$0, "weird_scaled_sampler", dal.z.a);
      a($$0, "shifted_noise", dal.v.a);
      a($$0, "range_choice", dal.q.e);
      a($$0, "shift_a", dal.s.e);
      a($$0, "shift_b", dal.t.e);
      a($$0, "shift", dal.r.e);
      a($$0, "blend_density", dal.e.e);
      a($$0, "clamp", dal.g.a);

      for(dal.k.a $$2 : dal.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for(dal.y.a $$3 : dal.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dal.w.a);
      a($$0, "constant", dal.h.e);
      return a($$0, "y_clamped_gradient", dal.aa.a);
   }

   private static Codec<? extends dak> a(hm<Codec<? extends dak>> $$0, String $$1, amc<? extends dak> $$2) {
      return hm.a($$0, $$1, $$2.a());
   }

   static <A, O> amc<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return amc.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> amc<O> a(Function<dak, O> $$0, Function<O, dak> $$1) {
      return a(dak.d, $$0, $$1);
   }

   static <O> amc<O> a(BiFunction<dak, dak, O> $$0, Function<O, dak> $$1, Function<O, dak> $$2) {
      return amc.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dak.d.fieldOf("argument1").forGetter($$1), dak.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> amc<O> a(MapCodec<O> $$0) {
      return amc.a($$0);
   }

   private dal() {
   }

   public static dak a(dak $$0) {
      return new dal.l(dal.l.a.a, $$0);
   }

   public static dak b(dak $$0) {
      return new dal.l(dal.l.a.b, $$0);
   }

   public static dak c(dak $$0) {
      return new dal.l(dal.l.a.c, $$0);
   }

   public static dak d(dak $$0) {
      return new dal.l(dal.l.a.d, $$0);
   }

   public static dak e(dak $$0) {
      return new dal.l(dal.l.a.e, $$0);
   }

   public static dak a(hc<dpa.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dal.o(new dak.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dak a(hc<dpa.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dak a(hc<dpa.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dak a(dak $$0, dak $$1, double $$2, hc<dpa.a> $$3) {
      return new dal.v($$0, a(), $$1, $$2, 0.0, new dak.c($$3));
   }

   public static dak a(hc<dpa.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dak b(hc<dpa.a> $$0, double $$1, double $$2) {
      return new dal.o(new dak.c($$0), $$1, $$2);
   }

   public static dak a(hc<dpa.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dak a(dak $$0, double $$1, double $$2, dak $$3, dak $$4) {
      return new dal.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dak b(hc<dpa.a> $$0) {
      return new dal.s(new dak.c($$0));
   }

   public static dak c(hc<dpa.a> $$0) {
      return new dal.t(new dak.c($$0));
   }

   public static dak d(hc<dpa.a> $$0) {
      return new dal.r(new dak.c($$0));
   }

   public static dak f(dak $$0) {
      return new dal.e($$0);
   }

   public static dak a(long $$0) {
      return new dal.i($$0);
   }

   public static dak a(dak $$0, hc<dpa.a> $$1, dal.z.a $$2) {
      return new dal.z($$0, new dak.c($$1), $$2);
   }

   public static dak a(dak $$0, dak $$1) {
      return dal.y.a(dal.y.a.a, $$0, $$1);
   }

   public static dak b(dak $$0, dak $$1) {
      return dal.y.a(dal.y.a.b, $$0, $$1);
   }

   public static dak c(dak $$0, dak $$1) {
      return dal.y.a(dal.y.a.c, $$0, $$1);
   }

   public static dak d(dak $$0, dak $$1) {
      return dal.y.a(dal.y.a.d, $$0, $$1);
   }

   public static dak a(alm<dal.w.b, dal.w.a> $$0) {
      return new dal.w($$0);
   }

   public static dak a() {
      return dal.h.f;
   }

   public static dak a(double $$0) {
      return new dal.h($$0);
   }

   public static dak a(int $$0, int $$1, double $$2, double $$3) {
      return new dal.aa($$0, $$1, $$2, $$3);
   }

   public static dak a(dak $$0, dal.k.a $$1) {
      return dal.k.a($$1, $$0);
   }

   private static dak a(dak $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dak b() {
      return dal.d.a;
   }

   public static dak c() {
      return dal.f.a;
   }

   public static dak a(dak $$0, dak $$1, dak $$2) {
      if ($$1 instanceof dal.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dak $$4 = d($$0);
         dak $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dak a(dak $$0, double $$1, dak $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dal.y.a e, dak f, dak g, double h, double i) implements dal.y {
      @Override
      public double a(dak.b $$0) {
         double $$1 = this.f.a($$0);

         return switch(this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         this.f.a($$0, $$1);
         switch(this.e) {
            case a:
               double[] $$2 = new double[$$0.length];
               this.g.a($$2, $$1);

               for(int $$3 = 0; $$3 < $$0.length; ++$$3) {
                  $$0[$$3] += $$2[$$3];
               }
               break;
            case d:
               double $$9 = this.g.b();

               for(int $$10 = 0; $$10 < $$0.length; ++$$10) {
                  double $$11 = $$0[$$10];
                  $$0[$$10] = $$11 > $$9 ? $$11 : Math.max($$11, this.g.a($$1.a($$10)));
               }
               break;
            case c:
               double $$6 = this.g.a();

               for(int $$7 = 0; $$7 < $$0.length; ++$$7) {
                  double $$8 = $$0[$$7];
                  $$0[$$7] = $$8 < $$6 ? $$8 : Math.min($$8, this.g.a($$1.a($$7)));
               }
               break;
            case b:
               for(int $$4 = 0; $$4 < $$0.length; ++$$4) {
                  double $$5 = $$0[$$4];
                  $$0[$$4] = $$5 == 0.0 ? 0.0 : $$5 * this.g.a($$1.a($$4));
               }
         }

      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(dal.y.a(this.e, this.f.a($$0), this.g.a($$0)));
      }

      @Override
      public double a() {
         return this.h;
      }

      @Override
      public double b() {
         return this.i;
      }

      @Override
      public dal.y.a j() {
         return this.e;
      }

      @Override
      public dak k() {
         return this.f;
      }

      @Override
      public dak l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dak.d {
      private static final MapCodec<dal.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(cyu.e * 2, cyu.d * 2).fieldOf("from_y").forGetter(dal.aa::j),
                  Codec.intRange(cyu.e * 2, cyu.d * 2).fieldOf("to_y").forGetter(dal.aa::k),
                  dal.d.fieldOf("from_value").forGetter(dal.aa::l),
                  dal.d.fieldOf("to_value").forGetter(dal.aa::m)
               )
               .apply($$0, dal.aa::new)
      );
      public static final amc<dal.aa> a = dal.a(i);

      @Override
      public double a(dak.b $$0) {
         return ami.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
      }

      @Override
      public double a() {
         return Math.min(this.g, this.h);
      }

      @Override
      public double b() {
         return Math.max(this.g, this.h);
      }

      @Override
      public amc<? extends dak> c() {
         return a;
      }

      public int j() {
         return this.e;
      }

      public int k() {
         return this.f;
      }

      public double l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }
   }

   protected static enum b implements dal.c {
      a;

      @Override
      public double a(dak.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         Arrays.fill($$0, 0.0);
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return 0.0;
      }
   }

   public interface c extends dak.d {
      amc<dak> e = amc.a(MapCodec.unit(dal.b.a));

      @Override
      default amc<? extends dak> c() {
         return e;
      }
   }

   protected static enum d implements dak.d {
      a;

      public static final amc<dak> e = amc.a(MapCodec.unit(a));

      @Override
      public double a(dak.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         Arrays.fill($$0, 1.0);
      }

      @Override
      public double a() {
         return 1.0;
      }

      @Override
      public double b() {
         return 1.0;
      }

      @Override
      public amc<? extends dak> c() {
         return e;
      }
   }

   static record e(dak a) implements dal.x {
      static final amc<dal.e> e = dal.a(dal.e::new, dal.e::j);

      @Override
      public double a(dak.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.e(this.a.a($$0)));
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
         return e;
      }

      @Override
      public dak j() {
         return this.a;
      }
   }

   protected static enum f implements dak.d {
      a;

      public static final amc<dak> e = amc.a(MapCodec.unit(a));

      @Override
      public double a(dak.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         Arrays.fill($$0, 0.0);
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return 0.0;
      }

      @Override
      public amc<? extends dak> c() {
         return e;
      }
   }

   protected static record g(dak e, double f, double g) implements dal.p {
      private static final MapCodec<dal.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dak.b.fieldOf("input").forGetter(dal.g::ac_), dal.d.fieldOf("min").forGetter(dal.g::a), dal.d.fieldOf("max").forGetter(dal.g::b))
               .apply($$0, dal.g::new)
      );
      public static final amc<dal.g> a = dal.a(h);

      @Override
      public double a(double $$0) {
         return ami.a($$0, this.f, this.g);
      }

      @Override
      public dak a(dak.f $$0) {
         return new dal.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public amc<? extends dak> c() {
         return a;
      }

      @Override
      public dak ac_() {
         return this.e;
      }

      @Override
      public double a() {
         return this.f;
      }

      @Override
      public double b() {
         return this.g;
      }
   }

   static record h(double a) implements dak.d {
      final double a;
      static final amc<dal.h> e = dal.a(dal.d, dal.h::new, dal.h::j);
      static final dal.h f = new dal.h(0.0);

      @Override
      public void a(double[] $$0, dak.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public amc<? extends dak> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dak.d {
      public static final amc<dal.i> a = amc.a(MapCodec.unit(new dal.i(0L)));
      private static final float e = -0.9F;
      private final dpd f;

      public i(long $$0) {
         amn $$1 = new das($$0);
         $$1.b(17292);
         this.f = new dpd($$1);
      }

      private static float a(dpd $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ami.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ami.a($$7, -100.0F, 80.0F);

         for(int $$8 = -12; $$8 <= 12; ++$$8) {
            for(int $$9 = -12; $$9 <= 12; ++$$9) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ami.e((float)$$10) * 3439.0F + ami.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ami.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ami.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dak.b $$0) {
         return ((double)a(this.f, $$0.a() / 8, $$0.c() / 8) - 8.0) / 128.0;
      }

      @Override
      public double a() {
         return -0.84375;
      }

      @Override
      public double b() {
         return 0.5625;
      }

      @Override
      public amc<? extends dak> c() {
         return a;
      }
   }

   @ang
   public static record j(hc<dak> a) implements dak {
      @Override
      public double a(dak.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.j(new hc.a<>(this.a.a().a($$0))));
      }

      @Override
      public double a() {
         return this.a.a().a();
      }

      @Override
      public double b() {
         return this.a.a().b();
      }

      @Override
      public amc<? extends dak> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public hc<dak> j() {
         return this.a;
      }
   }

   protected static record k(dal.k.a a, dak e, double f, double g) implements dal.p {
      public static dal.k a(dal.k.a $$0, dak $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dal.k.a.a && $$0 != dal.k.a.b ? new dal.k($$0, $$1, $$3, $$4) : new dal.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dal.k.a $$0, double $$1) {
         return switch($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ami.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dal.k b(dak.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public amc<? extends dak> c() {
         return this.a.h;
      }

      public dal.k.a k() {
         return this.a;
      }

      @Override
      public dak ac_() {
         return this.e;
      }

      @Override
      public double a() {
         return this.f;
      }

      @Override
      public double b() {
         return this.g;
      }

      static enum a implements amw {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final amc<dal.k> h = dal.a($$0x -> dal.k.a(this, $$0x), dal.k::ac_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dal.l.a a, dak e) implements dal.m {
      @Override
      public double a(dak.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         this.e.a($$0, $$1);
      }

      @Override
      public double a() {
         return this.e.a();
      }

      @Override
      public double b() {
         return this.e.b();
      }

      @Override
      public dal.l.a j() {
         return this.a;
      }

      @Override
      public dak k() {
         return this.e;
      }

      static enum a implements amw {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final amc<dal.m> g = dal.a($$0x -> new dal.l(this, $$0x), dal.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dak {
      dal.l.a j();

      dak k();

      @Override
      default amc<? extends dak> c() {
         return this.j().g;
      }

      @Override
      default dak a(dak.f $$0) {
         return $$0.apply(new dal.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dal.n.a e, dak f, double g, double h, double i) implements dal.p, dal.y {
      @Override
      public dal.y.a j() {
         return this.e == dal.n.a.a ? dal.y.a.b : dal.y.a.a;
      }

      @Override
      public dak k() {
         return dal.a(this.i);
      }

      @Override
      public dak l() {
         return this.f;
      }

      @Override
      public double a(double $$0) {
         return switch(this.e) {
            case a -> $$0 * this.i;
            case b -> $$0 + this.i;
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public dak a(dak.f $$0) {
         dak $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dal.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dal.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dal.n.a m() {
         return this.e;
      }

      @Override
      public dak ac_() {
         return this.f;
      }

      @Override
      public double a() {
         return this.g;
      }

      @Override
      public double b() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      static enum a {
         a,
         b;
      }
   }

   protected static record o(dak.c f, @Deprecated double g, double h) implements dak {
      public static final MapCodec<dal.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dak.c.a.fieldOf("noise").forGetter(dal.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dal.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dal.o::l)
               )
               .apply($$0, dal.o::new)
      );
      public static final amc<dal.o> e = dal.a(a);

      @Override
      public double a(dak.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.o($$0.a(this.f), this.g, this.h));
      }

      @Override
      public double a() {
         return -this.b();
      }

      @Override
      public double b() {
         return this.f.a();
      }

      @Override
      public amc<? extends dak> c() {
         return e;
      }

      public dak.c j() {
         return this.f;
      }

      @Deprecated
      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }
   }

   interface p extends dak {
      dak ac_();

      @Override
      default double a(dak.b $$0) {
         return this.a(this.ac_().a($$0));
      }

      @Override
      default void a(double[] $$0, dak.a $$1) {
         this.ac_().a($$0, $$1);

         for(int $$2 = 0; $$2 < $$0.length; ++$$2) {
            $$0[$$2] = this.a($$0[$$2]);
         }

      }

      double a(double var1);
   }

   static record q(dak f, double g, double h, dak i, dak j) implements dak {
      public static final MapCodec<dal.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dak.d.fieldOf("input").forGetter(dal.q::j),
                  dal.d.fieldOf("min_inclusive").forGetter(dal.q::k),
                  dal.d.fieldOf("max_exclusive").forGetter(dal.q::l),
                  dak.d.fieldOf("when_in_range").forGetter(dal.q::m),
                  dak.d.fieldOf("when_out_of_range").forGetter(dal.q::n)
               )
               .apply($$0, dal.q::new)
      );
      public static final amc<dal.q> e = dal.a(a);

      @Override
      public double a(dak.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         this.f.a($$0, $$1);

         for(int $$2 = 0; $$2 < $$0.length; ++$$2) {
            double $$3 = $$0[$$2];
            if ($$3 >= this.g && $$3 < this.h) {
               $$0[$$2] = this.i.a($$1.a($$2));
            } else {
               $$0[$$2] = this.j.a($$1.a($$2));
            }
         }

      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
      }

      @Override
      public double a() {
         return Math.min(this.i.a(), this.j.a());
      }

      @Override
      public double b() {
         return Math.max(this.i.b(), this.j.b());
      }

      @Override
      public amc<? extends dak> c() {
         return e;
      }

      public dak j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dak m() {
         return this.i;
      }

      public dak n() {
         return this.j;
      }
   }

   protected static record r(dak.c a) implements dal.u {
      static final amc<dal.r> e = dal.a(dak.c.a, dal.r::new, dal.r::j);

      @Override
      public double a(dak.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.r($$0.a(this.a)));
      }

      @Override
      public amc<? extends dak> c() {
         return e;
      }

      @Override
      public dak.c j() {
         return this.a;
      }
   }

   protected static record s(dak.c a) implements dal.u {
      static final amc<dal.s> e = dal.a(dak.c.a, dal.s::new, dal.s::j);

      @Override
      public double a(dak.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.s($$0.a(this.a)));
      }

      @Override
      public amc<? extends dak> c() {
         return e;
      }

      @Override
      public dak.c j() {
         return this.a;
      }
   }

   protected static record t(dak.c a) implements dal.u {
      static final amc<dal.t> e = dal.a(dak.c.a, dal.t::new, dal.t::j);

      @Override
      public double a(dak.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.t($$0.a(this.a)));
      }

      @Override
      public amc<? extends dak> c() {
         return e;
      }

      @Override
      public dak.c j() {
         return this.a;
      }
   }

   interface u extends dak {
      dak.c j();

      @Override
      default double a() {
         return -this.b();
      }

      @Override
      default double b() {
         return this.j().a() * 4.0;
      }

      default double a(double $$0, double $$1, double $$2) {
         return this.j().a($$0 * 0.25, $$1 * 0.25, $$2 * 0.25) * 4.0;
      }

      @Override
      default void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dak e, dak f, dak g, double h, double i, dak.c j) implements dak {
      private static final MapCodec<dal.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dak.d.fieldOf("shift_x").forGetter(dal.v::j),
                  dak.d.fieldOf("shift_y").forGetter(dal.v::k),
                  dak.d.fieldOf("shift_z").forGetter(dal.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dal.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dal.v::n),
                  dak.c.a.fieldOf("noise").forGetter(dal.v::o)
               )
               .apply($$0, dal.v::new)
      );
      public static final amc<dal.v> a = dal.a(k);

      @Override
      public double a(dak.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
      }

      @Override
      public double a() {
         return -this.b();
      }

      @Override
      public double b() {
         return this.j.a();
      }

      @Override
      public amc<? extends dak> c() {
         return a;
      }

      public dak j() {
         return this.e;
      }

      public dak k() {
         return this.f;
      }

      public dak l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dak.c o() {
         return this.j;
      }
   }

   public static record w(alm<dal.w.b, dal.w.a> e) implements dak {
      private static final Codec<alm<dal.w.b, dal.w.a>> f = alm.a(dal.w.a.b);
      private static final MapCodec<dal.w> g = f.fieldOf("spline").xmap(dal.w::new, dal.w::j);
      public static final amc<dal.w> a = dal.a(g);

      @Override
      public double a(dak.b $$0) {
         return (double)this.e.a(new dal.w.b($$0));
      }

      @Override
      public double a() {
         return (double)this.e.b();
      }

      @Override
      public double b() {
         return (double)this.e.c();
      }

      @Override
      public void a(double[] $$0, dak.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.w(this.e.a((alm.d)($$1 -> $$1.a($$0)))));
      }

      @Override
      public amc<? extends dak> c() {
         return a;
      }

      public alm<dal.w.b, dal.w.a> j() {
         return this.e;
      }

      public static record a(hc<dak> c) implements and<dal.w.b> {
         public static final Codec<dal.w.a> b = dak.c.xmap(dal.w.a::new, dal.w.a::a);

         public String toString() {
            Optional<aba<dak>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aba<dak> $$1 = (aba)$$0.get();
               if ($$1 == day.d) {
                  return "continents";
               }

               if ($$1 == day.e) {
                  return "erosion";
               }

               if ($$1 == day.f) {
                  return "weirdness";
               }

               if ($$1 == day.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dal.w.b $$0) {
            return (float)this.c.a().a($$0.a());
         }

         @Override
         public float b() {
            return (float)this.c.a().a();
         }

         @Override
         public float c() {
            return (float)this.c.a().b();
         }

         public dal.w.a a(dak.f $$0) {
            return new dal.w.a(new hc.a<>(this.c.a().a($$0)));
         }

         public hc<dak> a() {
            return this.c;
         }
      }

      public static record b(dak.b a) {
      }
   }

   interface x extends dak {
      dak j();

      @Override
      default double a(dak.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dak.a $$1) {
         this.j().a($$0, $$1);

         for(int $$2 = 0; $$2 < $$0.length; ++$$2) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }

      }

      double a(dak.b var1, double var2);
   }

   interface y extends dak {
      Logger a = LogUtils.getLogger();

      static dal.y a(dal.y.a $$0, dak $$1, dak $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dal.y.a.c || $$0 == dal.y.a.d) {
            boolean $$7 = $$3 >= $$6;
            boolean $$8 = $$4 >= $$5;
            if ($$7 || $$8) {
               a.warn("Creating a " + $$0 + " function between two non-overlapping inputs: " + $$1 + " and " + $$2);
            }
         }

         double $$9 = switch($$0) {
            case a -> $$3 + $$4;
            case d -> Math.max($$3, $$4);
            case c -> Math.min($$3, $$4);
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$3 * $$4 : ($$5 < 0.0 && $$6 < 0.0 ? $$5 * $$6 : Math.min($$3 * $$6, $$5 * $$4));
            default -> throw new IncompatibleClassChangeError();
         };

         double $$10 = switch($$0) {
            case a -> $$5 + $$6;
            case d -> Math.max($$5, $$6);
            case c -> Math.min($$5, $$6);
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$5 * $$6 : ($$5 < 0.0 && $$6 < 0.0 ? $$3 * $$4 : Math.max($$3 * $$4, $$5 * $$6));
            default -> throw new IncompatibleClassChangeError();
         };
         if ($$0 == dal.y.a.b || $$0 == dal.y.a.a) {
            if ($$1 instanceof dal.h $$11) {
               return new dal.n($$0 == dal.y.a.a ? dal.n.a.b : dal.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dal.h $$12) {
               return new dal.n($$0 == dal.y.a.a ? dal.n.a.b : dal.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dal.a($$0, $$1, $$2, $$9, $$10);
      }

      dal.y.a j();

      dak k();

      dak l();

      @Override
      default amc<? extends dak> c() {
         return this.j().e;
      }

      public static enum a implements amw {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final amc<dal.y> e = dal.a((BiFunction<dak, dak, dal.y>)(($$0x, $$1) -> dal.y.a(this, $$0x, $$1)), dal.y::k, dal.y::l);
         private final String f;

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   protected static record z(dak e, dak.c f, dal.z.a g) implements dal.x {
      private static final MapCodec<dal.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dak.d.fieldOf("input").forGetter(dal.z::j),
                  dak.c.a.fieldOf("noise").forGetter(dal.z::k),
                  dal.z.a.c.fieldOf("rarity_value_mapper").forGetter(dal.z::l)
               )
               .apply($$0, dal.z::new)
      );
      public static final amc<dal.z> a = dal.a(h);

      @Override
      public double a(dak.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dak a(dak.f $$0) {
         return $$0.apply(new dal.z(this.e.a($$0), $$0.a(this.f), this.g));
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return this.g.f * this.f.a();
      }

      @Override
      public amc<? extends dak> c() {
         return a;
      }

      @Override
      public dak j() {
         return this.e;
      }

      public dak.c k() {
         return this.f;
      }

      public dal.z.a l() {
         return this.g;
      }

      public static enum a implements amw {
         a("type_1", day.a::b, 2.0),
         b("type_2", day.a::a, 3.0);

         public static final Codec<dal.z.a> c = amw.a(dal.z.a::values);
         private final String d;
         final Double2DoubleFunction e;
         final double f;

         private a(String $$0, Double2DoubleFunction $$1, double $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
         }

         @Override
         public String c() {
            return this.d;
         }
      }
   }
}
