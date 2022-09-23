public class tm implements tc<tf> {
   private final int a;
   private final gt b;
   private final int c;

   public tm(int $$0, gt $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public tm(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.f();
      this.c = $$0.readUnsignedByte();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
      $$0.writeByte(this.c);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public gt c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }
}
