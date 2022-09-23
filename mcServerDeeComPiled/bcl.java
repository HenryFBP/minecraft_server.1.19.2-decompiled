public abstract class bcl extends bce {
   protected static final float bW = 0.0F;

   protected bcl(bbr<? extends bcl> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public float f(gt $$0) {
      return this.a($$0, this.s);
   }

   public float a(gt $$0, cha $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cgy $$0, bcg $$1) {
      return this.a(this.da(), $$0) >= 0.0F;
   }

   public boolean fG() {
      return !this.D().l();
   }

   @Override
   protected void fx() {
      super.fx();
      bbn $$0 = this.fz();
      if ($$0 != null && $$0.s == this.s) {
         this.a($$0.da(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bcw && ((bcw)this).fJ()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.x($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bS.a(bip.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.df() - this.df()) / (double)$$1;
            double $$3 = ($$0.dh() - this.dh()) / (double)$$1;
            double $$4 = ($$0.dl() - this.dl()) / (double)$$1;
            this.f(this.dd().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
         } else if (this.fH()) {
            this.bS.b(bip.a.a);
            float $$5 = 2.0F;
            dwq $$6 = new dwq($$0.df() - this.df(), $$0.dh() - this.dh(), $$0.dl() - this.dl()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.D().a(this.df() + $$6.c, this.dh() + $$6.d, this.dl() + $$6.e, this.fI());
         }
      }

   }

   protected boolean fH() {
      return true;
   }

   protected double fI() {
      return 1.0;
   }

   protected void x(float $$0) {
   }
}
