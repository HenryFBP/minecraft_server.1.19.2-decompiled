public class bbv extends bod {
   private static final aaj<Integer> cb = aam.a(bbv.class, aal.b);

   public bbv(bbr<? extends bbv> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected im n() {
      return io.aI;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cb, 0);
   }

   @Override
   protected ajv q() {
      return ajw.hT;
   }

   @Override
   protected ajv r() {
      return ajw.hQ;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.hS;
   }

   @Override
   protected ajv x_() {
      return ajw.hR;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.t());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.b($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void w_() {
      super.w_();
      int $$0 = this.t();
      if ($$0 > 0) {
         this.b($$0 - 1);
      }

      this.s.a(io.aJ, this.d(0.6), this.di(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.b(100);
      }

      return $$2;
   }

   private void b(int $$0) {
      this.Y.b(cb, $$0);
   }

   public int t() {
      return this.Y.a(cb);
   }

   public static boolean a(bbr<? extends bcc> $$0, chm $$1, bcg $$2, gt $$3, amn $$4) {
      return $$3.v() <= $$1.m_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cju.C);
   }
}
