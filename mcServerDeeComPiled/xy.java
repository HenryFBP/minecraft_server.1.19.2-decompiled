public class xy implements tc<xm> {
   private final int a;
   private final int b;

   public xy(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public xy(qx $$0) {
      this.a = $$0.readByte();
      this.b = $$0.readByte();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a);
      $$0.writeByte(this.b);
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
