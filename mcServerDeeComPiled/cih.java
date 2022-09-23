import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cih {
   private static final float h = 0.05F;
   private static final float i = 0.26666668F;
   public static final float a = 0.4F;
   private static final float j = 0.93333334F;
   private static final float k = 0.1F;
   public static final float b = 0.56666666F;
   private static final float l = 0.7666667F;
   public static final float c = -0.11F;
   public static final float d = 0.03F;
   public static final float e = 0.3F;
   public static final float f = -0.78F;
   public static final float g = -0.375F;
   private static final float m = -0.225F;
   private static final float n = 0.9F;
   private final cic.b o = cic.b.a(-1.0F, 1.0F);
   private final cic.b[] p = new cic.b[]{cic.b.a(-1.0F, -0.45F), cic.b.a(-0.45F, -0.15F), cic.b.a(-0.15F, 0.2F), cic.b.a(0.2F, 0.55F), cic.b.a(0.55F, 1.0F)};
   private final cic.b[] q = new cic.b[]{cic.b.a(-1.0F, -0.35F), cic.b.a(-0.35F, -0.1F), cic.b.a(-0.1F, 0.1F), cic.b.a(0.1F, 0.3F), cic.b.a(0.3F, 1.0F)};
   private final cic.b[] r = new cic.b[]{
      cic.b.a(-1.0F, -0.78F),
      cic.b.a(-0.78F, -0.375F),
      cic.b.a(-0.375F, -0.2225F),
      cic.b.a(-0.2225F, 0.05F),
      cic.b.a(0.05F, 0.45F),
      cic.b.a(0.45F, 0.55F),
      cic.b.a(0.55F, 1.0F)
   };
   private final cic.b s = this.p[0];
   private final cic.b t = cic.b.a(this.p[1], this.p[4]);
   private final cic.b u = cic.b.a(-1.2F, -1.05F);
   private final cic.b v = cic.b.a(-1.05F, -0.455F);
   private final cic.b w = cic.b.a(-0.455F, -0.19F);
   private final cic.b x = cic.b.a(-0.19F, -0.11F);
   private final cic.b y = cic.b.a(-0.11F, 0.55F);
   private final cic.b z = cic.b.a(-0.11F, 0.03F);
   private final cic.b A = cic.b.a(0.03F, 0.3F);
   private final cic.b B = cic.b.a(0.3F, 1.0F);
   private final aba<cht>[][] C = new aba[][]{{cia.W, cia.U, cia.S, cia.Q, cia.O}, {cia.V, cia.T, cia.R, cia.P, cia.O}};
   private final aba<cht>[][] D = new aba[][]{
      {cia.d, cia.d, cia.d, cia.q, cia.p},
      {cia.b, cia.b, cia.i, cia.p, cia.o},
      {cia.j, cia.b, cia.i, cia.k, cia.l},
      {cia.r, cia.r, cia.i, cia.x, cia.x},
      {cia.f, cia.f, cia.f, cia.f, cia.f}
   };
   private final aba<cht>[][] E = new aba[][]{
      {cia.e, null, cia.q, null, null},
      {null, null, null, null, cia.n},
      {cia.c, null, null, cia.m, null},
      {null, null, cia.b, cia.y, cia.z},
      {null, null, null, null, null}
   };
   private final aba<cht>[][] F = new aba[][]{
      {cia.d, cia.d, cia.d, cia.q, cia.q},
      {cia.D, cia.D, cia.i, cia.p, cia.o},
      {cia.D, cia.D, cia.D, cia.D, cia.l},
      {cia.s, cia.s, cia.i, cia.i, cia.x},
      {cia.A, cia.A, cia.A, cia.C, cia.C}
   };
   private final aba<cht>[][] G = new aba[][]{
      {cia.e, null, null, null, null},
      {null, null, cia.D, cia.D, cia.n},
      {null, null, cia.i, cia.k, null},
      {null, null, null, null, null},
      {cia.B, cia.B, null, null, null}
   };
   private final aba<cht>[][] H = new aba[][]{
      {cia.u, cia.u, cia.t, cia.v, cia.v},
      {cia.u, cia.u, cia.t, cia.v, cia.v},
      {cia.t, cia.t, cia.t, cia.v, cia.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cic.d> a() {
      cic.b $$0 = cic.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cic.d(this.o, this.o, cic.b.a(this.y, this.o), this.o, $$0, cic.b.a(-1.0F, -0.16F), 0L),
         new cic.d(this.o, this.o, cic.b.a(this.y, this.o), this.o, $$0, cic.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cic.d, aba<cht>>> $$0) {
      if (!ab.am) {
         this.b($$0);
         this.c($$0);
         this.d($$0);
      } else {
         dal.w.a $$1 = new dal.w.a(iw.l.h(day.d));
         dal.w.a $$2 = new dal.w.a(iw.l.h(day.e));
         dal.w.a $$3 = new dal.w.a(iw.l.h(day.g));
         $$0.accept(Pair.of(cic.a(this.o, this.o, this.o, this.o, cic.b.a(0.0F), this.o, 0.01F), cia.b));
         alm<?, ?> $$4 = mu.a($$2, $$3, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, and.a);
         if ($$4 instanceof alm.e $$5) {
            aba<cht> $$6 = cia.f;

            for(float $$7 : $$5.e()) {
               $$0.accept(Pair.of(cic.a(this.o, this.o, this.o, cic.b.a($$7), cic.b.a(0.0F), this.o, 0.0F), $$6));
               $$6 = $$6 == cia.f ? cia.A : cia.f;
            }
         }

         alm<?, ?> $$8 = mu.a($$1, $$2, $$3, false);
         if ($$8 instanceof alm.e $$9) {
            for(float $$10 : $$9.e()) {
               $$0.accept(Pair.of(cic.a(this.o, this.o, cic.b.a($$10), this.o, cic.b.a(0.0F), this.o, 0.0F), cia.q));
            }
         }

      }
   }

   private void b(Consumer<Pair<cic.d, aba<cht>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cia.X);

      for(int $$1 = 0; $$1 < this.p.length; ++$$1) {
         cic.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }

   }

   private void c(Consumer<Pair<cic.d, aba<cht>>> $$0) {
      this.c($$0, cic.b.a(-1.0F, -0.93333334F));
      this.b($$0, cic.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cic.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cic.b.a(-0.56666666F, -0.4F));
      this.c($$0, cic.b.a(-0.4F, -0.26666668F));
      this.d($$0, cic.b.a(-0.26666668F, -0.05F));
      this.e($$0, cic.b.a(-0.05F, 0.05F));
      this.d($$0, cic.b.a(0.05F, 0.26666668F));
      this.c($$0, cic.b.a(0.26666668F, 0.4F));
      this.b($$0, cic.b.a(0.4F, 0.56666666F));
      this.a($$0, cic.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cic.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cic.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cic.d, aba<cht>>> $$0, cic.b $$1) {
      for(int $$2 = 0; $$2 < this.p.length; ++$$2) {
         cic.b $$3 = this.p[$$2];

         for(int $$4 = 0; $$4 < this.q.length; ++$$4) {
            cic.b $$5 = this.q[$$4];
            aba<cht> $$6 = this.a($$2, $$4, $$1);
            aba<cht> $$7 = this.b($$2, $$4, $$1);
            aba<cht> $$8 = this.c($$2, $$4, $$1);
            aba<cht> $$9 = this.e($$2, $$4, $$1);
            aba<cht> $$10 = this.h($$2, $$4, $$1);
            aba<cht> $$11 = this.a($$2, $$4, $$1, $$10);
            aba<cht> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.z), cic.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }

   }

   private void b(Consumer<Pair<cic.d, aba<cht>>> $$0, cic.b $$1) {
      for(int $$2 = 0; $$2 < this.p.length; ++$$2) {
         cic.b $$3 = this.p[$$2];

         for(int $$4 = 0; $$4 < this.q.length; ++$$4) {
            cic.b $$5 = this.q[$$4];
            aba<cht> $$6 = this.a($$2, $$4, $$1);
            aba<cht> $$7 = this.b($$2, $$4, $$1);
            aba<cht> $$8 = this.c($$2, $$4, $$1);
            aba<cht> $$9 = this.e($$2, $$4, $$1);
            aba<cht> $$10 = this.h($$2, $$4, $$1);
            aba<cht> $$11 = this.a($$2, $$4, $$1, $$6);
            aba<cht> $$12 = this.g($$2, $$4, $$1);
            aba<cht> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cic.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.z), cic.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }

   }

   private void c(Consumer<Pair<cic.d, aba<cht>>> $$0, cic.b $$1) {
      this.a($$0, this.o, this.o, this.x, cic.b.a(this.r[0], this.r[2]), $$1, 0.0F, cia.N);
      this.a($$0, cic.b.a(this.p[1], this.p[2]), this.o, cic.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cia.g);
      this.a($$0, cic.b.a(this.p[3], this.p[4]), this.o, cic.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cia.h);

      for(int $$2 = 0; $$2 < this.p.length; ++$$2) {
         cic.b $$3 = this.p[$$2];

         for(int $$4 = 0; $$4 < this.q.length; ++$$4) {
            cic.b $$5 = this.q[$$4];
            aba<cht> $$6 = this.a($$2, $$4, $$1);
            aba<cht> $$7 = this.b($$2, $$4, $$1);
            aba<cht> $$8 = this.c($$2, $$4, $$1);
            aba<cht> $$9 = this.h($$2, $$4, $$1);
            aba<cht> $$10 = this.e($$2, $$4, $$1);
            aba<cht> $$11 = this.a($$2, $$4);
            aba<cht> $$12 = this.a($$2, $$4, $$1, $$6);
            aba<cht> $$13 = this.d($$2, $$4, $$1);
            aba<cht> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cic.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cic.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cic.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cic.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cic.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cic.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }

   }

   private void d(Consumer<Pair<cic.d, aba<cht>>> $$0, cic.b $$1) {
      this.a($$0, this.o, this.o, this.x, cic.b.a(this.r[0], this.r[2]), $$1, 0.0F, cia.N);
      this.a($$0, cic.b.a(this.p[1], this.p[2]), this.o, cic.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cia.g);
      this.a($$0, cic.b.a(this.p[3], this.p[4]), this.o, cic.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cia.h);

      for(int $$2 = 0; $$2 < this.p.length; ++$$2) {
         cic.b $$3 = this.p[$$2];

         for(int $$4 = 0; $$4 < this.q.length; ++$$4) {
            cic.b $$5 = this.q[$$4];
            aba<cht> $$6 = this.a($$2, $$4, $$1);
            aba<cht> $$7 = this.b($$2, $$4, $$1);
            aba<cht> $$8 = this.c($$2, $$4, $$1);
            aba<cht> $$9 = this.a($$2, $$4);
            aba<cht> $$10 = this.a($$2, $$4, $$1, $$6);
            aba<cht> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cic.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), cic.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cic.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), cic.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cic.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cic.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cic.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }

   }

   private void e(Consumer<Pair<cic.d, aba<cht>>> $$0, cic.b $$1) {
      this.a($$0, this.s, this.o, this.x, cic.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cia.N : cia.K);
      this.a($$0, this.t, this.o, this.x, cic.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cia.N : cia.J);
      this.a($$0, this.s, this.o, this.z, cic.b.a(this.r[0], this.r[1]), $$1, 0.0F, cia.K);
      this.a($$0, this.t, this.o, this.z, cic.b.a(this.r[0], this.r[1]), $$1, 0.0F, cia.J);
      this.a($$0, this.s, this.o, cic.b.a(this.x, this.B), cic.b.a(this.r[2], this.r[5]), $$1, 0.0F, cia.K);
      this.a($$0, this.t, this.o, cic.b.a(this.x, this.B), cic.b.a(this.r[2], this.r[5]), $$1, 0.0F, cia.J);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cia.K);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cia.J);
      this.a($$0, cic.b.a(this.p[1], this.p[2]), this.o, cic.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cia.g);
      this.a($$0, cic.b.a(this.p[3], this.p[4]), this.o, cic.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cia.h);
      this.a($$0, this.s, this.o, cic.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cia.K);

      for(int $$2 = 0; $$2 < this.p.length; ++$$2) {
         cic.b $$3 = this.p[$$2];

         for(int $$4 = 0; $$4 < this.q.length; ++$$4) {
            cic.b $$5 = this.q[$$4];
            aba<cht> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cic.b.a(this.A, this.B), cic.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }

   }

   private void d(Consumer<Pair<cic.d, aba<cht>>> $$0) {
      this.b($$0, this.o, this.o, cic.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cia.Y);
      this.b($$0, this.o, cic.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cia.Z);
      this.c($$0, this.o, this.o, this.o, cic.b.a(this.r[0], this.r[1]), this.o, 0.0F, cia.aa);
   }

   private aba<cht> a(int $$0, int $$1, cic.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aba<cht> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aba<cht> b(int $$0, int $$1, cic.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aba<cht> c(int $$0, int $$1, cic.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aba<cht> a(int $$0, int $$1, cic.b $$2, aba<cht> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cia.w : $$3;
   }

   private aba<cht> d(int $$0, int $$1, cic.b $$2) {
      aba<cht> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aba<cht> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cia.M;
      } else {
         return $$0 == 4 ? cia.f : cia.L;
      }
   }

   private aba<cht> a(int $$0, cic.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cia.A : cia.B;
      } else {
         return $$0 < 3 ? cia.A : cia.C;
      }
   }

   private aba<cht> e(int $$0, int $$1, cic.b $$2) {
      if ($$2.b() < 0L) {
         return this.F[$$0][$$1];
      } else {
         aba<cht> $$3 = this.G[$$0][$$1];
         return $$3 == null ? this.F[$$0][$$1] : $$3;
      }
   }

   private aba<cht> f(int $$0, int $$1, cic.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cia.H : cia.G;
      } else {
         return $$0 == 3 ? cia.I : this.a($$1, $$2);
      }
   }

   private aba<cht> g(int $$0, int $$1, cic.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cia.F : cia.E;
      }
   }

   private aba<cht> h(int $$0, int $$1, cic.b $$2) {
      aba<cht> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cic.d, aba<cht>>> $$0, cic.b $$1, cic.b $$2, cic.b $$3, cic.b $$4, cic.b $$5, float $$6, aba<cht> $$7) {
      $$0.accept(Pair.of(cic.a($$1, $$2, $$3, $$4, cic.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cic.a($$1, $$2, $$3, $$4, cic.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cic.d, aba<cht>>> $$0, cic.b $$1, cic.b $$2, cic.b $$3, cic.b $$4, cic.b $$5, float $$6, aba<cht> $$7) {
      $$0.accept(Pair.of(cic.a($$1, $$2, $$3, $$4, cic.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cic.d, aba<cht>>> $$0, cic.b $$1, cic.b $$2, cic.b $$3, cic.b $$4, cic.b $$5, float $$6, aba<cht> $$7) {
      $$0.accept(Pair.of(cic.a($$1, $$2, $$3, $$4, cic.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(double $$0, double $$1) {
      return $$0 < -0.225F && $$1 > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)day.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)day.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)day.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)day.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cic.a((float)$$0);
      if ($$1 < (double)this.u.b()) {
         return "Mushroom fields";
      } else if ($$1 < (double)this.v.b()) {
         return "Deep ocean";
      } else if ($$1 < (double)this.w.b()) {
         return "Ocean";
      } else if ($$1 < (double)this.x.b()) {
         return "Coast";
      } else if ($$1 < (double)this.z.b()) {
         return "Near inland";
      } else {
         return $$1 < (double)this.A.b() ? "Mid inland" : "Far inland";
      }
   }

   public String c(double $$0) {
      return a($$0, this.r);
   }

   public String d(double $$0) {
      return a($$0, this.p);
   }

   public String e(double $$0) {
      return a($$0, this.q);
   }

   private static String a(double $$0, cic.b[] $$1) {
      double $$2 = (double)cic.a((float)$$0);

      for(int $$3 = 0; $$3 < $$1.length; ++$$3) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @ang
   public cic.b[] b() {
      return this.p;
   }

   @ang
   public cic.b[] c() {
      return this.q;
   }

   @ang
   public cic.b[] d() {
      return this.r;
   }

   @ang
   public cic.b[] e() {
      return new cic.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @ang
   public cic.b[] f() {
      return new cic.b[]{
         cic.b.a(-2.0F, day.a(0.05F)),
         cic.b.a(day.a(0.05F), day.a(0.26666668F)),
         cic.b.a(day.a(0.26666668F), day.a(0.4F)),
         cic.b.a(day.a(0.4F), day.a(0.56666666F)),
         cic.b.a(day.a(0.56666666F), 2.0F)
      };
   }

   @ang
   public cic.b[] g() {
      return new cic.b[]{cic.b.a(-2.0F, 0.0F), cic.b.a(0.0F, 2.0F)};
   }
}
