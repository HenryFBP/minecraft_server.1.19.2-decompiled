public class bwc extends bvt {
   private static final aaj<Boolean> e = aam.a(bwc.class, aal.i);
   private int f;
   public double c;
   public double d;
   private static final cdm ao = cdm.a(caz.mS, caz.mT);

   public bwc(bbr<? extends bwc> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bwc(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.af, $$0, $$1, $$2, $$3);
   }

   @Override
   public bvt.a r() {
      return bvt.a.c;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(e, false);
   }

   @Override
   public void k() {
      super.k();
      if (!this.s.k_()) {
         if (this.f > 0) {
            --this.f;
         }

         if (this.f <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.p(this.f > 0);
      }

      if (this.y() && this.R.a(4) == 0) {
         this.s.a(io.R, this.df(), this.dh() + 0.8, this.dl(), 0.0, 0.0, 0.0);
      }

   }

   @Override
   protected double i() {
      return (this.aR() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cat h() {
      return caz.mq;
   }

   @Override
   protected void c(gt $$0, cvo $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      dwq $$4 = this.dd();
      double $$5 = $$4.i();
      double $$6 = this.c * this.c + this.d * this.d;
      if ($$6 > 1.0E-4 && $$5 > 0.001) {
         double $$7 = Math.sqrt($$5);
         double $$8 = Math.sqrt($$6);
         this.c = $$4.c / $$7 * $$8;
         this.d = $$4.e / $$7 * $$8;
      }

   }

   @Override
   protected void l() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         dwq $$1 = this.dd().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aR()) {
            $$1 = $$1.a(0.1);
         }

         this.f($$1);
      } else {
         this.f(this.dd().d(0.98, 0.0, 0.98));
      }

      super.l();
   }

   @Override
   public baj a(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (ao.a($$2) && this.f + 3600 <= 32000) {
         if (!$$0.fB().d) {
            $$2.g(1);
         }

         this.f += 3600;
      }

      if (this.f > 0) {
         this.c = this.df() - $$0.df();
         this.d = this.dl() - $$0.dl();
      }

      return baj.a(this.s.y);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.f);
   }

   @Override
   protected void a(pj $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.f = $$0.g("Fuel");
   }

   protected boolean y() {
      return this.Y.a(e);
   }

   protected void p(boolean $$0) {
      this.Y.b(e, $$0);
   }

   @Override
   public cvo t() {
      return cju.co.m().a(cmp.a, gy.c).a(cmp.b, Boolean.valueOf(this.y()));
   }
}
