public abstract class buo extends buj implements bur {
   private static final aaj<cax> e = aam.a(buo.class, aal.g);

   public buo(bbr<? extends buo> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public buo(bbr<? extends buo> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cgx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public buo(bbr<? extends buo> $$0, bcc $$1, double $$2, double $$3, double $$4, cgx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cax $$0) {
      if (!$$0.a(caz.rW) || $$0.t()) {
         this.ai().b(e, ad.a($$0.o(), $$0x -> $$0x.e(1)));
      }

   }

   protected cax l() {
      return this.ai().a(e);
   }

   @Override
   public cax h() {
      cax $$0 = this.l();
      return $$0.b() ? new cax(caz.rW) : $$0;
   }

   @Override
   protected void a_() {
      this.ai().a(e, cax.b);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      cax $$1 = this.l();
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
