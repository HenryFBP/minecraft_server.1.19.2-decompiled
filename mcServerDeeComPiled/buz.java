public class buz extends bui {
   private int f = 200;

   public buz(bbr<? extends buz> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public buz(cgx $$0, bcc $$1) {
      super(bbr.aK, $$1, $$0);
   }

   public buz(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.aK, $$1, $$2, $$3, $$0);
   }

   @Override
   public void k() {
      super.k();
      if (this.s.y && !this.b) {
         this.s.a(io.M, this.df(), this.dh(), this.dl(), 0.0, 0.0, 0.0);
      }

   }

   @Override
   protected cax l() {
      return new cax(caz.tj);
   }

   @Override
   protected void a(bcc $$0) {
      super.a($$0);
      bbg $$1 = new bbg(bbi.x, this.f, 0);
      $$0.b($$1, this.y());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
