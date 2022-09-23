public class zq implements tc<zp> {
   private static final int a = 1048576;
   private final int b;
   private final abb c;
   private final qx d;

   public zq(int $$0, abb $$1, qx $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public zq(qx $$0) {
      this.b = $$0.k();
      this.c = $$0.r();
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         this.d = new qx($$0.readBytes($$1));
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.b);
      $$0.a(this.c);
      $$0.writeBytes(this.d.copy());
   }

   public void a(zp $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public abb c() {
      return this.c;
   }

   public qx d() {
      return this.d;
   }
}
