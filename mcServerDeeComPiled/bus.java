public class bus extends buo {
   private int e = 1;

   public bus(bbr<? extends bus> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bus(cgx $$0, bcc $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bbr.V, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);
      if (!this.s.y) {
         boolean $$1 = this.s.W().b(cgt.c);
         this.s.a(null, this.df(), this.dh(), this.dl(), (float)this.e, $$1, $$1 ? cgp.a.c : cgp.a.a);
         this.ah();
      }

   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      if (!this.s.y) {
         bbn $$1 = $$0.a();
         bbn $$2 = this.x();
         $$1.a(baw.a((buo)this, $$2), 6.0F);
         if ($$2 instanceof bcc) {
            this.a((bcc)$$2, $$1);
         }

      }
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }

   }
}
