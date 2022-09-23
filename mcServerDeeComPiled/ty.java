public class ty implements tc<tf> {
   private final int a;
   private final int b;
   private final int c;

   public ty(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ty(qx $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.readShort();
      this.c = $$0.readShort();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a);
      $$0.writeShort(this.b);
      $$0.writeShort(this.c);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }
}
