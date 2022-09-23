public class brp extends brz {
   public brp(bbr<? extends brp> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.d, 0.2F);
   }

   public static boolean b(bbr<brp> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.ag() != bag.a;
   }

   @Override
   public boolean a(cha $$0) {
      return $$0.f(this) && !$$0.d(this.cy());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bdd.i).a((double)($$0 * 3));
   }

   @Override
   public float bg() {
      return 1.0F;
   }

   @Override
   protected im q() {
      return io.C;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   protected int t() {
      return super.t() * 4;
   }

   @Override
   protected void fG() {
      this.d *= 0.9F;
   }

   @Override
   protected void eH() {
      dwq $$0 = this.dd();
      this.n($$0.c, (double)(this.eF() + (float)this.fL() * 0.1F), $$0.e);
      this.af = true;
   }

   @Override
   protected void c(akz<dpu> $$0) {
      if ($$0 == akp.b) {
         dwq $$1 = this.dd();
         this.n($$1.c, (double)(0.22F + (float)this.fL() * 0.05F), $$1.e);
         this.af = true;
      } else {
         super.c($$0);
      }

   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   protected boolean fH() {
      return this.eP();
   }

   @Override
   protected float fI() {
      return super.fI() + 2.0F;
   }

   @Override
   protected ajv c(baw $$0) {
      return this.fM() ? ajw.kQ : ajw.kP;
   }

   @Override
   protected ajv x_() {
      return this.fM() ? ajw.kH : ajw.kO;
   }

   @Override
   protected ajv fJ() {
      return this.fM() ? ajw.kT : ajw.kS;
   }

   @Override
   protected ajv fK() {
      return ajw.kR;
   }
}
