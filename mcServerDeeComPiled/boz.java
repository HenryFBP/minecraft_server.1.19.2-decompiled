public abstract class boz extends bpa {
   private static final aaj<Boolean> cn = aam.a(boz.class, aal.i);
   public static final int bX = 15;

   protected boz(bbr<? extends boz> $$0, cgx $$1) {
      super($$0, $$1);
      this.cl = false;
   }

   @Override
   protected void a(amn $$0) {
      this.a(bdd.a).a((double)this.b($$0));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cn, false);
   }

   public static bdc.a q() {
      return ge().a(bdd.d, 0.175F).a(bdd.m, 0.5);
   }

   public boolean t() {
      return this.Y.a(cn);
   }

   public void v(boolean $$0) {
      this.Y.b(cn, $$0);
   }

   @Override
   protected int fJ() {
      return this.t() ? 17 : super.fJ();
   }

   @Override
   public double bt() {
      return super.bt() - 0.25;
   }

   @Override
   protected void ei() {
      super.ei();
      if (this.t()) {
         if (!this.s.y) {
            this.a(cju.cg);
         }

         this.v(false);
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("ChestedHorse", this.t());
      if (this.t()) {
         pp $$1 = new pp();

         for(int $$2 = 2; $$2 < this.ci.b(); ++$$2) {
            cax $$3 = this.ci.a($$2);
            if (!$$3.b()) {
               pj $$4 = new pj();
               $$4.a("Slot", (byte)$$2);
               $$3.b($$4);
               $$1.add($$4);
            }
         }

         $$0.a("Items", (qc)$$1);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.v($$0.q("ChestedHorse"));
      this.fZ();
      if (this.t()) {
         pp $$1 = $$0.c("Items", 10);

         for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            pj $$3 = $$1.a($$2);
            int $$4 = $$3.f("Slot") & 255;
            if ($$4 >= 2 && $$4 < this.ci.b()) {
               this.ci.a($$4, cax.a($$3));
            }
         }
      }

      this.ga();
   }

   @Override
   public bct k(int $$0) {
      return $$0 == 499 ? new bct() {
         @Override
         public cax a() {
            return boz.this.t() ? new cax(caz.dW) : cax.b;
         }

         @Override
         public boolean a(cax $$0) {
            if ($$0.b()) {
               if (boz.this.t()) {
                  boz.this.v(false);
                  boz.this.fZ();
               }

               return true;
            } else if ($$0.a(caz.dW)) {
               if (!boz.this.t()) {
                  boz.this.v(true);
                  boz.this.fZ();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.k($$0);
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (!this.y_()) {
         if (this.fS() && $$0.fo()) {
            this.b($$0);
            return baj.a(this.s.y);
         }

         if (this.bJ()) {
            return super.b($$0, $$1);
         }
      }

      if (!$$2.b()) {
         if (this.n($$2)) {
            return this.a($$0, $$2);
         }

         if (!this.fS()) {
            this.gi();
            return baj.a(this.s.y);
         }

         if (!this.t() && $$2.a(cju.cg.l())) {
            this.v(true);
            this.fK();
            if (!$$0.fB().d) {
               $$2.g(1);
            }

            this.fZ();
            return baj.a(this.s.y);
         }

         if (!this.y_() && !this.d() && $$2.a(caz.mn)) {
            this.b($$0);
            return baj.a(this.s.y);
         }
      }

      if (this.y_()) {
         return super.b($$0, $$1);
      } else {
         this.e($$0);
         return baj.a(this.s.y);
      }
   }

   @Override
   protected void fK() {
      this.a(ajw.eC, 1.0F, (this.R.i() - this.R.i()) * 0.2F + 1.0F);
   }

   public int fL() {
      return 5;
   }
}
