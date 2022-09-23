public class bvc extends bva {
   public bvc(bbr<? extends bvc> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bvc(cgx $$0, bcc $$1) {
      super(bbr.aQ, $$1, $$0);
   }

   public bvc(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.aQ, $$1, $$2, $$3, $$0);
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for(int $$2 = 0; $$2 < 8; ++$$2) {
            this.s
               .a(
                  new ik(io.N, this.h()),
                  this.df(),
                  this.dh(),
                  this.dl(),
                  ((double)this.R.i() - 0.5) * 0.08,
                  ((double)this.R.i() - 0.5) * 0.08,
                  ((double)this.R.i() - 0.5) * 0.08
               );
         }
      }

   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      $$0.a().a(baw.b(this, this.x()), 0.0F);
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);
      if (!this.s.y) {
         if (this.R.a(8) == 0) {
            int $$1 = 1;
            if (this.R.a(32) == 0) {
               $$1 = 4;
            }

            for(int $$2 = 0; $$2 < $$1; ++$$2) {
               bnj $$3 = bbr.n.a(this.s);
               $$3.b_(-24000);
               $$3.b(this.df(), this.dh(), this.dl(), this.dq(), 0.0F);
               this.s.b($$3);
            }
         }

         this.s.a(this, (byte)3);
         this.ah();
      }

   }

   @Override
   protected cat i() {
      return caz.pa;
   }
}
