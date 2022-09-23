public class bnl extends bne {
   public bnl(bbr<? extends bnl> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bji(this, 2.0));
      this.bS.a(2, new bib(this, 1.0));
      this.bS.a(3, new bjw(this, 1.25, cdm.a(caz.nS), false));
      this.bS.a(4, new bio(this, 1.25));
      this.bS.a(5, new bkb(this, 1.0));
      this.bS.a(6, new bix(this, buc.class, 6.0F));
      this.bS.a(7, new bjk(this));
   }

   public static bdc.a q() {
      return bce.w().a(bdd.a, 10.0).a(bdd.d, 0.2F);
   }

   @Override
   protected ajv r() {
      return ajw.dG;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.dI;
   }

   @Override
   protected ajv x_() {
      return ajw.dH;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.dK, 0.15F, 1.0F);
   }

   @Override
   protected float eC() {
      return 0.4F;
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.oH) && !this.y_()) {
         $$0.a(ajw.dJ, 1.0F, 1.0F);
         cax $$3 = cay.a($$2, $$0, caz.oN.Q_());
         $$0.a($$1, $$3);
         return baj.a(this.s.y);
      } else {
         return super.b($$0, $$1);
      }
   }

   public bnl b(agg $$0, bbk $$1) {
      return bbr.p.a((cgx)$$0);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return this.y_() ? $$1.b * 0.95F : 1.3F;
   }
}
