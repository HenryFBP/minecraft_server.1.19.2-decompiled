import java.util.stream.Stream;

public class day {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dak s = dal.a(10.0);
   private static final dak t = dal.a();
   private static final aba<dak> u = a("zero");
   private static final aba<dak> v = a("y");
   private static final aba<dak> w = a("shift_x");
   private static final aba<dak> x = a("shift_z");
   private static final aba<dak> y = a("overworld/base_3d_noise");
   private static final aba<dak> z = a("nether/base_3d_noise");
   private static final aba<dak> A = a("end/base_3d_noise");
   public static final aba<dak> d = a("overworld/continents");
   public static final aba<dak> e = a("overworld/erosion");
   public static final aba<dak> f = a("overworld/ridges");
   public static final aba<dak> g = a("overworld/ridges_folded");
   public static final aba<dak> h = a("overworld/offset");
   public static final aba<dak> i = a("overworld/factor");
   public static final aba<dak> j = a("overworld/jaggedness");
   public static final aba<dak> k = a("overworld/depth");
   private static final aba<dak> B = a("overworld/sloped_cheese");
   public static final aba<dak> l = a("overworld_large_biomes/continents");
   public static final aba<dak> m = a("overworld_large_biomes/erosion");
   private static final aba<dak> C = a("overworld_large_biomes/offset");
   private static final aba<dak> D = a("overworld_large_biomes/factor");
   private static final aba<dak> E = a("overworld_large_biomes/jaggedness");
   private static final aba<dak> F = a("overworld_large_biomes/depth");
   private static final aba<dak> G = a("overworld_large_biomes/sloped_cheese");
   private static final aba<dak> H = a("overworld_amplified/offset");
   private static final aba<dak> I = a("overworld_amplified/factor");
   private static final aba<dak> J = a("overworld_amplified/jaggedness");
   private static final aba<dak> K = a("overworld_amplified/depth");
   private static final aba<dak> L = a("overworld_amplified/sloped_cheese");
   private static final aba<dak> M = a("end/sloped_cheese");
   private static final aba<dak> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aba<dak> O = a("overworld/caves/entrances");
   private static final aba<dak> P = a("overworld/caves/noodle");
   private static final aba<dak> Q = a("overworld/caves/pillars");
   private static final aba<dak> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aba<dak> S = a("overworld/caves/spaghetti_2d");

   private static aba<dak> a(String $$0) {
      return aba.a(hm.aT, new abb($$0));
   }

   public static hc<? extends dak> a(hm<dak> $$0) {
      b($$0, u, dal.a());
      int $$1 = cyu.e * 2;
      int $$2 = cyu.d * 2;
      b($$0, v, dal.a($$1, $$2, (double)$$1, (double)$$2));
      dak $$3 = a($$0, w, dal.b(dal.c(dal.b(a(dba.j)))));
      dak $$4 = a($$0, x, dal.b(dal.c(dal.c(a(dba.j)))));
      b($$0, y, dox.a(0.25, 0.125, 80.0, 160.0, 8.0));
      b($$0, z, dox.a(0.25, 0.375, 80.0, 60.0, 8.0));
      b($$0, A, dox.a(0.25, 0.25, 80.0, 160.0, 4.0));
      hc<dak> $$5 = b($$0, d, dal.b(dal.a($$3, $$4, 0.25, a(dba.c))));
      hc<dak> $$6 = b($$0, e, dal.b(dal.a($$3, $$4, 0.25, a(dba.d))));
      dak $$7 = a($$0, f, dal.b(dal.a($$3, $$4, 0.25, a(dba.i))));
      b($$0, g, a($$7));
      dak $$8 = dal.b(a(dba.M), 1500.0, 0.0);
      a($$0, $$8, $$5, $$6, h, i, j, k, B, false);
      hc<dak> $$9 = b($$0, l, dal.b(dal.a($$3, $$4, 0.25, a(dba.g))));
      hc<dak> $$10 = b($$0, m, dal.b(dal.a($$3, $$4, 0.25, a(dba.h))));
      a($$0, $$8, $$9, $$10, C, D, E, F, G, false);
      a($$0, $$8, $$5, $$6, H, I, J, K, L, true);
      b($$0, M, dal.a(dal.a(0L), a($$0, A)));
      b($$0, N, b());
      b($$0, R, dal.d(dal.a(a(dba.u), 2.0, 1.0, -0.6, -1.3)));
      b($$0, S, h($$0));
      b($$0, O, f($$0));
      b($$0, P, g($$0));
      return b($$0, Q, c());
   }

   private static void a(hm<dak> $$0, dak $$1, hc<dak> $$2, hc<dak> $$3, aba<dak> $$4, aba<dak> $$5, aba<dak> $$6, aba<dak> $$7, aba<dak> $$8, boolean $$9) {
      dal.w.a $$10 = new dal.w.a($$2);
      dal.w.a $$11 = new dal.w.a($$3);
      dal.w.a $$12 = new dal.w.a($$0.h(f));
      dal.w.a $$13 = new dal.w.a($$0.h(g));
      dak $$14 = a($$0, $$4, a(dal.a(dal.a(-0.50375F), dal.a(mu.a($$10, $$11, $$13, $$9))), dal.c()));
      dak $$15 = a($$0, $$5, a(dal.a(mu.a($$10, $$11, $$12, $$13, $$9)), s));
      dak $$16 = a($$0, $$7, dal.a(dal.a(-64, 320, 1.5, -1.5), $$14));
      dak $$17 = a($$0, $$6, a(dal.a(mu.b($$10, $$11, $$12, $$13, $$9)), t));
      dak $$18 = dal.b($$17, $$1.g());
      dak $$19 = b($$15, dal.a($$16, $$18));
      b($$0, $$8, dal.a($$19, a($$0, y)));
   }

   private static dak a(hm<dak> $$0, aba<dak> $$1, dak $$2) {
      return new dal.j(iw.a($$0, $$1, $$2));
   }

   private static hc<dak> b(hm<dak> $$0, aba<dak> $$1, dak $$2) {
      return iw.a($$0, $$1, $$2);
   }

   private static hc<dpa.a> a(aba<dpa.a> $$0) {
      return iw.k.h($$0);
   }

   private static dak a(hm<dak> $$0, aba<dak> $$1) {
      return new dal.j($$0.h($$1));
   }

   private static dak a(dak $$0) {
      return dal.b(dal.a(dal.a($$0.d(), dal.a(-0.6666666666666666)).d(), dal.a(-0.3333333333333333)), dal.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dak b() {
      dak $$0 = dal.a(a(dba.z));
      dak $$1 = dal.a(a(dba.A), 0.0, -0.1);
      return dal.d(dal.b($$1, dal.a($$0.d(), dal.a(-0.4))));
   }

   private static dak f(hm<dak> $$0) {
      dak $$1 = dal.d(dal.b(a(dba.x), 2.0, 1.0));
      dak $$2 = dal.a(a(dba.y), -0.065, -0.088);
      dak $$3 = dal.a($$1, a(dba.v), dal.z.a.a);
      dak $$4 = dal.a($$1, a(dba.w), dal.z.a.a);
      dak $$5 = dal.a(dal.d($$3, $$4), $$2).a(-1.0, 1.0);
      dak $$6 = a($$0, N);
      dak $$7 = dal.b(a(dba.B), 0.75, 0.5);
      dak $$8 = dal.a(dal.a($$7, dal.a(0.37)), dal.a(-10, 30, 0.3, 0.0));
      return dal.d(dal.c($$8, dal.a($$6, $$5)));
   }

   private static dak g(hm<dak> $$0) {
      dak $$1 = a($$0, v);
      int $$2 = -64;
      int $$3 = -60;
      int $$4 = 320;
      dak $$5 = a($$1, dal.b(a(dba.I), 1.0, 1.0), -60, 320, -1);
      dak $$6 = a($$1, dal.a(a(dba.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$7 = 2.6666666666666665;
      dak $$8 = a($$1, dal.b(a(dba.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dak $$9 = a($$1, dal.b(a(dba.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dak $$10 = dal.b(dal.a(1.5), dal.d($$8.d(), $$9.d()));
      return dal.a($$5, -1000000.0, 0.0, dal.a(64.0), dal.a($$6, $$10));
   }

   private static dak c() {
      double $$0 = 25.0;
      double $$1 = 0.3;
      dak $$2 = dal.b(a(dba.o), 25.0, 0.3);
      dak $$3 = dal.a(a(dba.p), 0.0, -2.0);
      dak $$4 = dal.a(a(dba.q), 0.0, 1.1);
      dak $$5 = dal.a(dal.b($$2, dal.a(2.0)), $$3);
      return dal.d(dal.b($$5, $$4.f()));
   }

   private static dak h(hm<dak> $$0) {
      dak $$1 = dal.b(a(dba.t), 2.0, 1.0);
      dak $$2 = dal.a($$1, a(dba.r), dal.z.a.b);
      dak $$3 = dal.a(a(dba.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dak $$4 = a($$0, R);
      dak $$5 = dal.a($$3, dal.a(-64, 320, 8.0, -40.0)).d();
      dak $$6 = dal.a($$5, $$4).f();
      double $$7 = 0.083;
      dak $$8 = dal.a($$2, dal.b(dal.a(0.083), $$4));
      return dal.d($$8, $$6).a(-1.0, 1.0);
   }

   private static dak a(hm<dak> $$0, dak $$1) {
      dak $$2 = a($$0, S);
      dak $$3 = a($$0, N);
      dak $$4 = dal.a(a(dba.C), 8.0);
      dak $$5 = dal.b(dal.a(4.0), $$4.e());
      dak $$6 = dal.a(a(dba.D), 0.6666666666666666);
      dak $$7 = dal.a(dal.a(dal.a(0.27), $$6).a(-1.0, 1.0), dal.a(dal.a(1.5), dal.b(dal.a(-0.64), $$1)).a(0.0, 0.5));
      dak $$8 = dal.a($$5, $$7);
      dak $$9 = dal.c(dal.c($$8, a($$0, O)), dal.a($$2, $$3));
      dak $$10 = a($$0, Q);
      dak $$11 = dal.a($$10, -1000000.0, 0.03, dal.a(-1000000.0), $$10);
      return dal.d($$9, $$11);
   }

   private static dak b(dak $$0) {
      dak $$1 = dal.f($$0);
      return dal.b(dal.a($$1), dal.a(0.64)).i();
   }

   protected static dax a(hm<dak> $$0, boolean $$1, boolean $$2) {
      dak $$3 = dal.a(a(dba.k), 0.5);
      dak $$4 = dal.a(a(dba.l), 0.67);
      dak $$5 = dal.a(a(dba.n), 0.7142857142857143);
      dak $$6 = dal.a(a(dba.m));
      dak $$7 = a($$0, w);
      dak $$8 = a($$0, x);
      dak $$9 = dal.a($$7, $$8, 0.25, a($$1 ? dba.e : dba.a));
      dak $$10 = dal.a($$7, $$8, 0.25, a($$1 ? dba.f : dba.b));
      dak $$11 = a($$0, $$1 ? D : ($$2 ? I : i));
      dak $$12 = a($$0, $$1 ? F : ($$2 ? K : k));
      dak $$13 = b(dal.c($$11), $$12);
      dak $$14 = a($$0, $$1 ? G : ($$2 ? L : B));
      dak $$15 = dal.c($$14, dal.b(dal.a(5.0), a($$0, O)));
      dak $$16 = dal.a($$14, -1000000.0, 1.5625, $$15, a($$0, $$14));
      dak $$17 = dal.c(b(a($$2, $$16)), a($$0, P));
      dak $$18 = a($$0, v);
      int $$19 = Stream.of(dbb.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-cyu.e * 2);
      int $$20 = Stream.of(dbb.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-cyu.e * 2);
      dak $$21 = a($$18, dal.b(a(dba.E), 1.5, 1.5), $$19, $$20, 0);
      float $$22 = 4.0F;
      dak $$23 = a($$18, dal.b(a(dba.F), 4.0, 4.0), $$19, $$20, 0).d();
      dak $$24 = a($$18, dal.b(a(dba.G), 4.0, 4.0), $$19, $$20, 0).d();
      dak $$25 = dal.a(dal.a(-0.08F), dal.d($$23, $$24));
      dak $$26 = dal.a(a(dba.H));
      return new dax(
         $$3,
         $$4,
         $$5,
         $$6,
         $$9,
         $$10,
         a($$0, $$1 ? l : d),
         a($$0, $$1 ? m : e),
         $$12,
         a($$0, f),
         a($$2, dal.a($$13, dal.a(-0.703125)).a(-64.0, 64.0)),
         $$17,
         $$21,
         $$25,
         $$26
      );
   }

   private static dax b(hm<dak> $$0, dak $$1) {
      dak $$2 = a($$0, w);
      dak $$3 = a($$0, x);
      dak $$4 = dal.a($$2, $$3, 0.25, a(dba.a));
      dak $$5 = dal.a($$2, $$3, 0.25, a(dba.b));
      dak $$6 = b($$1);
      return new dax(dal.a(), dal.a(), dal.a(), dal.a(), $$4, $$5, dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), $$6, dal.a(), dal.a(), dal.a());
   }

   private static dak a(boolean $$0, dak $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dak a(hm<dak> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dak a(dak $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dax b(hm<dak> $$0) {
      return b($$0, a($$0, 0, 128));
   }

   protected static dax c(hm<dak> $$0) {
      return b($$0, a($$0, -64, 192));
   }

   protected static dax d(hm<dak> $$0) {
      return b($$0, a(a($$0, A), 0, 256));
   }

   private static dak c(dak $$0) {
      return a($$0, 0, 128);
   }

   protected static dax e(hm<dak> $$0) {
      dak $$1 = dal.c(dal.a(0L));
      dak $$2 = b(c(a($$0, M)));
      return new dax(
         dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), $$1, dal.a(), dal.a(), c(dal.a($$1, dal.a(-0.703125))), $$2, dal.a(), dal.a(), dal.a()
      );
   }

   protected static dax a() {
      return new dax(dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a(), dal.a());
   }

   private static dak a(dak $$0, dak $$1) {
      dak $$2 = dal.a(dal.b(), $$1, $$0);
      return dal.b(dal.c($$2));
   }

   private static dak b(dak $$0, dak $$1) {
      dak $$2 = dal.b($$1, $$0);
      return dal.b(dal.a(4.0), $$2.h());
   }

   private static dak a(dak $$0, dak $$1, int $$2, int $$3, int $$4) {
      return dal.a(dal.a($$0, (double)$$2, (double)($$3 + 1), $$1, dal.a((double)$$4)));
   }

   private static dak a(dak $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dak $$10 = dal.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dak $$9 = dal.a($$10, $$5, $$0);
      dak $$11 = dal.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dal.a($$11, $$8, $$9);
   }

   protected static final class a {
      protected static double a(double $$0) {
         if ($$0 < -0.75) {
            return 0.5;
         } else if ($$0 < -0.5) {
            return 0.75;
         } else if ($$0 < 0.5) {
            return 1.0;
         } else {
            return $$0 < 0.75 ? 2.0 : 3.0;
         }
      }

      protected static double b(double $$0) {
         if ($$0 < -0.5) {
            return 0.75;
         } else if ($$0 < 0.0) {
            return 1.0;
         } else {
            return $$0 < 0.5 ? 1.5 : 2.0;
         }
      }
   }
}
