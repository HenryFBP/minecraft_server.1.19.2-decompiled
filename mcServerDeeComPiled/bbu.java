public abstract class bbu extends bce {
   protected bbu(bbr<? extends bbu> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() || this.cP()) {
         if (this.aR()) {
            this.a(0.02F, $$0);
            this.a(bci.a, this.dd());
            this.f(this.dd().a(0.8F));
         } else if (this.bf()) {
            this.a(0.02F, $$0);
            this.a(bci.a, this.dd());
            this.f(this.dd().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.y) {
               $$1 = this.s.a_(new gt(this.df(), this.dh() - 1.0, this.dl())).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.y) {
               $$1 = this.s.a_(new gt(this.df(), this.dh() - 1.0, this.dl())).b().h() * 0.91F;
            }

            this.a(this.y ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bci.a, this.dd());
            this.f(this.dd().a((double)$$1));
         }
      }

      this.a(this, false);
   }

   @Override
   public boolean b_() {
      return false;
   }
}
