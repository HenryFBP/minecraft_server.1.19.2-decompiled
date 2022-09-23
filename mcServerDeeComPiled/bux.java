public class bux extends buo {
   public bux(bbr<? extends bux> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bux(cgx $$0, bcc $$1, double $$2, double $$3, double $$4) {
      super(bbr.aH, $$1, $$2, $$3, $$4, $$0);
   }

   public bux(cgx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bbr.aH, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      if (!this.s.y) {
         bbn $$1 = $$0.a();
         bbn $$2 = this.x();
         int $$3 = $$1.at();
         $$1.f(5);
         if (!$$1.a(baw.a((buo)this, $$2), 5.0F)) {
            $$1.g($$3);
         } else if ($$2 instanceof bcc) {
            this.a((bcc)$$2, $$1);
         }

      }
   }

   @Override
   protected void a(dwm $$0) {
      super.a($$0);
      if (!this.s.y) {
         bbn $$1 = this.x();
         if (!($$1 instanceof bce) || this.s.W().b(cgt.c)) {
            gt $$2 = $$0.a().a($$0.b());
            if (this.s.x($$2)) {
               this.s.b($$2, cjh.a(this.s, $$2));
            }
         }

      }
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);
      if (!this.s.y) {
         this.ah();
      }

   }

   @Override
   public boolean bk() {
      return false;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      return false;
   }
}
