public class wc implements tc<tf> {
   private final int a;

   public wc(int $$0) {
      this.a = $$0;
   }

   public wc(qx $$0) {
      this.a = $$0.readByte();
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
