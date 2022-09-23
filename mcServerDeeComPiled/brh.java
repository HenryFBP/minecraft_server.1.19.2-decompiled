public class brh extends brq {
   private static final int b = 2400;
   private int c;

   public brh(bbr<? extends brh> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void u() {
      this.bS.a(1, new bij(this));
      this.bS.a(1, new bie(this, this.s));
      this.bS.a(2, new biz(this, 1.0, false));
      this.bS.a(3, new bkb(this, 1.0));
      this.bS.a(7, new bix(this, buc.class, 8.0F));
      this.bS.a(8, new bjk(this));
      this.bT.a(1, new bkg(this).a());
      this.bT.a(2, new bkh(this, buc.class, true));
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 0.13F;
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.a, 8.0).a(bdd.d, 0.25).a(bdd.f, 2.0);
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.c;
   }

   @Override
   protected ajv r() {
      return ajw.fJ;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.fL;
   }

   @Override
   protected ajv x_() {
      return ajw.fK;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.fM, 0.15F, 1.0F);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void k() {
      this.aX = this.dq();
      super.k();
   }

   @Override
   public void m(float $$0) {
      this.o($$0);
      super.m($$0);
   }

   @Override
   public double bs() {
      return 0.1;
   }

   @Override
   public void w_() {
      super.w_();
      if (this.s.y) {
         for(int $$0 = 0; $$0 < 2; ++$$0) {
            this.s.a(io.W, this.d(0.5), this.di(), this.g(0.5), (this.R.j() - 0.5) * 2.0, -this.R.j(), (this.R.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fr()) {
            ++this.c;
         }

         if (this.c >= 2400) {
            this.ah();
         }
      }

   }

   public static boolean b(bbr<brh> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         buc $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bch ey() {
      return bch.c;
   }
}
