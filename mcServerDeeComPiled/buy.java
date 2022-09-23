public class buy extends bva {
   public buy(bbr<? extends buy> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public buy(cgx $$0, bcc $$1) {
      super(bbr.aJ, $$1, $$0);
   }

   public buy(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.aJ, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cat i() {
      return caz.oL;
   }

   private im n() {
      cax $$0 = this.j();
      return (im)($$0.b() ? io.Q : new ik(io.N, $$0));
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 3) {
         im $$1 = this.n();

         for(int $$2 = 0; $$2 < 8; ++$$2) {
            this.s.a($$1, this.df(), this.dh(), this.dl(), 0.0, 0.0, 0.0);
         }
      }

   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      bbn $$1 = $$0.a();
      int $$2 = $$1 instanceof bra ? 3 : 0;
      $$1.a(baw.b(this, this.x()), (float)$$2);
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);
      if (!this.s.y) {
         this.s.a(this, (byte)3);
         this.ah();
      }

   }
}
