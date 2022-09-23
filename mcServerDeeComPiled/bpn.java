public class bpn extends bbn {
   public final bpp b;
   public final String c;
   private final bbo d;

   public bpn(bpp $$0, String $$1, float $$2, float $$3) {
      super($$0.ad(), $$0.s);
      this.d = bbo.b($$2, $$3);
      this.z_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(pj $$0) {
   }

   @Override
   protected void b(pj $$0) {
   }

   @Override
   public boolean bk() {
      return true;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean q(bbn $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public tc<?> S() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bbo a(bco $$0) {
      return this.d;
   }

   @Override
   public boolean dw() {
      return false;
   }
}
