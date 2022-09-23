public class tw implements tc<tf> {
   private final int a;

   public tw(int $$0) {
      this.a = $$0;
   }

   public tw(qx $$0) {
      this.a = $$0.readUnsignedByte();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }
}
