public class cmk extends cka {
   protected static final float a = 3.0F;
   protected static final dxj b = cjt.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final bbe c;
   private final int d;

   public cmk(bbe $$0, int $$1, cvn.c $$2) {
      super($$2);
      this.c = $$0;
      if ($$0.a()) {
         this.d = $$1;
      } else {
         this.d = $$1 * 20;
      }

   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      dwq $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   public bbe b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
