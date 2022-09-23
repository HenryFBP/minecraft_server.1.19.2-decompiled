public class bhp extends bhs {
   private final int l;
   private final boolean m;

   public bhp(bce $$0, int $$1, boolean $$2) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
   }

   @Override
   public void a() {
      if (this.k == bhs.a.b) {
         this.k = bhs.a.a;
         this.d.e(true);
         double $$0 = this.e - this.d.df();
         double $$1 = this.f - this.d.dh();
         double $$2 = this.g - this.d.dl();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.v(0.0F);
            this.d.u(0.0F);
            return;
         }

         float $$4 = (float)(ami.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.o(this.a(this.d.dq(), $$4, 90.0F));
         float $$5;
         if (this.d.aw()) {
            $$5 = (float)(this.h * this.d.b(bdd.d));
         } else {
            $$5 = (float)(this.h * this.d.b(bdd.e));
         }

         this.d.r($$5);
         double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$1) > 1.0E-5F || Math.abs($$7) > 1.0E-5F) {
            float $$8 = (float)(-(ami.d($$1, $$7) * 180.0F / (float)Math.PI));
            this.d.p(this.a(this.d.ds(), $$8, (float)this.l));
            this.d.v($$1 > 0.0 ? $$5 : -$$5);
         }
      } else {
         if (!this.m) {
            this.d.e(false);
         }

         this.d.v(0.0F);
         this.d.u(0.0F);
      }

   }
}
