public class bnj extends bne {
   private static final cdm cf = cdm.a(caz.nR, caz.qh, caz.qg, caz.tf);
   public float bX;
   public float bY;
   public float ca;
   public float cb;
   public float cc = 1.0F;
   private float cg = 1.0F;
   public int cd = this.R.a(6000) + 6000;
   public boolean ce;

   public bnj(bbr<? extends bnj> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.j, 0.0F);
   }

   @Override
   protected void u() {
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bji(this, 1.4));
      this.bS.a(2, new bib(this, 1.0));
      this.bS.a(3, new bjw(this, 1.0, cf, false));
      this.bS.a(4, new bio(this, 1.1));
      this.bS.a(5, new bkb(this, 1.0));
      this.bS.a(6, new bix(this, buc.class, 6.0F));
      this.bS.a(7, new bjk(this));
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return this.y_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bdc.a q() {
      return bce.w().a(bdd.a, 4.0).a(bdd.d, 0.25);
   }

   @Override
   public void w_() {
      super.w_();
      this.cb = this.bX;
      this.ca = this.bY;
      this.bY += (this.y ? -1.0F : 4.0F) * 0.3F;
      this.bY = ami.a(this.bY, 0.0F, 1.0F);
      if (!this.y && this.cc < 1.0F) {
         this.cc = 1.0F;
      }

      this.cc *= 0.9F;
      dwq $$0 = this.dd();
      if (!this.y && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bX += this.cc * 2.0F;
      if (!this.s.y && this.bo() && !this.y_() && !this.t() && --this.cd <= 0) {
         this.a(ajw.dc, 1.0F, (this.R.i() - this.R.i()) * 0.2F + 1.0F);
         this.a(caz.pa);
         this.a(czv.s);
         this.cd = this.R.a(6000) + 6000;
      }

   }

   @Override
   protected boolean aL() {
      return this.K > this.cg;
   }

   @Override
   protected void aK() {
      this.cg = this.K + this.bY / 2.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   protected ajv r() {
      return ajw.da;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.dd;
   }

   @Override
   protected ajv x_() {
      return ajw.db;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.de, 0.15F, 1.0F);
   }

   public bnj b(agg $$0, bbk $$1) {
      return bbr.n.a((cgx)$$0);
   }

   @Override
   public boolean n(cax $$0) {
      return cf.a($$0);
   }

   @Override
   public int dO() {
      return this.t() ? 10 : super.dO();
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.ce = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cd = $$0.h("EggLayTime");
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ce);
      $$0.a("EggLayTime", this.cd);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   public void i(bbn $$0) {
      super.i($$0);
      float $$1 = ami.a(this.aX * (float) (Math.PI / 180.0));
      float $$2 = ami.b(this.aX * (float) (Math.PI / 180.0));
      float $$3 = 0.1F;
      float $$4 = 0.0F;
      $$0.e(this.df() + (double)(0.1F * $$1), this.e(0.5) + $$0.bs() + 0.0, this.dl() - (double)(0.1F * $$2));
      if ($$0 instanceof bcc) {
         ((bcc)$$0).aX = this.aX;
      }

   }

   public boolean t() {
      return this.ce;
   }

   public void v(boolean $$0) {
      this.ce = $$0;
   }
}
