public class zf implements tc<xm> {
   private static final int a = 384;
   private final gt b;
   private final String[] c;

   public zf(gt $$0, String $$1, String $$2, String $$3, String $$4) {
      this.b = $$0;
      this.c = new String[]{$$1, $$2, $$3, $$4};
   }

   public zf(qx $$0) {
      this.b = $$0.f();
      this.c = new String[4];

      for(int $$1 = 0; $$1 < 4; ++$$1) {
         this.c[$$1] = $$0.e(384);
      }

   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.b);

      for(int $$1 = 0; $$1 < 4; ++$$1) {
         $$0.a(this.c[$$1]);
      }

   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public gt b() {
      return this.b;
   }

   public String[] c() {
      return this.c;
   }
}
