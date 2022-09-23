public class bhs implements bho {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bce d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bhs.a k = bhs.a.a;

   public bhs(bce $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bhs.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bhs.a.d) {
         this.k = bhs.a.b;
      }

   }

   public void a(float $$0, float $$1) {
      this.k = bhs.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bhs.a.c) {
         float $$0 = (float)this.d.b(bdd.d);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = ami.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = ami.a(this.d.dq() * (float) (Math.PI / 180.0));
         float $$6 = ami.b(this.d.dq() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.r($$1);
         this.d.u(this.i);
         this.d.w(this.j);
         this.k = bhs.a.a;
      } else if (this.k == bhs.a.b) {
         this.k = bhs.a.a;
         double $$9 = this.e - this.d.df();
         double $$10 = this.g - this.d.dl();
         double $$11 = this.f - this.d.dh();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.u(0.0F);
            return;
         }

         float $$13 = (float)(ami.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.o(this.a(this.d.dq(), $$13, 90.0F));
         this.d.r((float)(this.h * this.d.b(bdd.d)));
         gt $$14 = this.d.da();
         cvo $$15 = this.d.s.a_($$14);
         dxj $$16 = $$15.k(this.d.s, $$14);
         if ($$11 > (double)this.d.P && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.cW())
            || !$$16.b() && this.d.dh() < $$16.c(gy.a.b) + (double)$$14.v() && !$$15.a(akl.o) && !$$15.a(akl.O)) {
            this.d.C().a();
            this.k = bhs.a.d;
         }
      } else if (this.k == bhs.a.d) {
         this.d.r((float)(this.h * this.d.b(bdd.d)));
         if (this.d.aw()) {
            this.k = bhs.a.a;
         }
      } else {
         this.d.u(0.0F);
      }

   }

   private boolean b(float $$0, float $$1) {
      blc $$2 = this.d.D();
      if ($$2 != null) {
         dqk $$3 = $$2.p();
         if ($$3 != null && $$3.a(this.d.s, ami.b(this.d.df() + (double)$$0), this.d.dg(), ami.b(this.d.dl() + (double)$$1)) != dqh.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = ami.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      float $$4 = $$0 + $$3;
      if ($$4 < 0.0F) {
         $$4 += 360.0F;
      } else if ($$4 > 360.0F) {
         $$4 -= 360.0F;
      }

      return $$4;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public double f() {
      return this.g;
   }

   protected static enum a {
      a,
      b,
      c,
      d;
   }
}
