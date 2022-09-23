public class yn implements tc<xm> {
   private static final int a = 2;
   private final boolean b;

   public yn(btz $$0) {
      this.b = $$0.b;
   }

   public yn(qx $$0) {
      byte $$1 = $$0.readByte();
      this.b = ($$1 & 2) != 0;
   }

   @Override
   public void a(qx $$0) {
      byte $$1 = 0;
      if (this.b) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.writeByte($$1);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.b;
   }
}
