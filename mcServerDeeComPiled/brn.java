public class brn extends bsj {
   public brn(bbr<? extends brn> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bbr<brn> $$0, chm $$1, bcg $$2, gt $$3, amn $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bcg.c || $$1.g($$3));
   }

   @Override
   protected boolean K_() {
      return false;
   }

   @Override
   protected ajv r() {
      return ajw.jz;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.jC;
   }

   @Override
   protected ajv x_() {
      return ajw.jB;
   }

   @Override
   protected ajv t() {
      return ajw.jD;
   }

   @Override
   public boolean z(bbn $$0) {
      boolean $$1 = super.z($$0);
      if ($$1 && this.ez().b() && $$0 instanceof bcc) {
         float $$2 = this.s.d_(this.da()).b();
         ((bcc)$$0).b(new bbg(bbi.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean fK() {
      return true;
   }

   @Override
   protected void fM() {
      this.b(bbr.bj);
      if (!this.aM()) {
         this.s.a(null, 1041, this.da(), 0);
      }

   }

   @Override
   protected cax fJ() {
      return cax.b;
   }
}
