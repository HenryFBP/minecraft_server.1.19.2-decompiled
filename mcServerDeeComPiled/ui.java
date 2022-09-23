public class ui implements tc<tf> {
   private final int a;
   private final int b;

   public ui(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ui(qx $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.writeInt(this.b);
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
}
