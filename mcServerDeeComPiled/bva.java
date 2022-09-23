public abstract class bva extends bvb implements bur {
   private static final aaj<cax> b = aam.a(bva.class, aal.g);

   public bva(bbr<? extends bva> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bva(bbr<? extends bva> $$0, double $$1, double $$2, double $$3, cgx $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public bva(bbr<? extends bva> $$0, bcc $$1, cgx $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cax $$0) {
      if (!$$0.a(this.i()) || $$0.t()) {
         this.ai().b(b, ad.a($$0.o(), $$0x -> $$0x.e(1)));
      }

   }

   protected abstract cat i();

   protected cax j() {
      return this.ai().a(b);
   }

   @Override
   public cax h() {
      cax $$0 = this.j();
      return $$0.b() ? new cax(this.i()) : $$0;
   }

   @Override
   protected void a_() {
      this.ai().a(b, cax.b);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      cax $$1 = this.j();
      if (!$$1.b()) {
         $$0.a("Item", (qc)$$1.b(new pj()));
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      cax $$1 = cax.a($$0.p("Item"));
      this.a($$1);
   }
}
