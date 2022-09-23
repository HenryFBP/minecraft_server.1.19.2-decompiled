public class bwe extends bvt {
   private final cfz c = new cfz() {
      @Override
      public void a(cgx $$0, gt $$1, int $$2) {
         $$0.a(bwe.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public bwe(bbr<? extends bwe> $$0, cgx $$1) {
      super($$0, $$1);
      this.d = this.a($$1);
   }

   public bwe(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.ah, $$0, $$1, $$2, $$3);
      this.d = this.a($$0);
   }

   @Override
   protected cat h() {
      return caz.mo;
   }

   private Runnable a(cgx $$0) {
      return $$0 instanceof agg ? () -> this.c.a((agg)$$0, this.da()) : () -> this.c.a($$0, this.da());
   }

   @Override
   public bvt.a r() {
      return bvt.a.e;
   }

   @Override
   public cvo t() {
      return cju.ce.m();
   }

   @Override
   protected void a(pj $$0) {
      super.a($$0);
      this.c.a(this.s, this.da(), $$0);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void a(byte $$0) {
      this.c.a(this.s, $$0);
   }

   @Override
   public void k() {
      super.k();
      this.d.run();
   }

   public cfz y() {
      return this.c;
   }

   @Override
   public boolean cF() {
      return true;
   }
}
