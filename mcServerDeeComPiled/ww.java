public class ww implements tc<tf> {
   private final int a;
   private final int b;
   private final int c;

   public ww(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ww(qx $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.writeInt(this.b);
      $$0.writeInt(this.c);
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
