public class to implements tc<tf> {
   private final gt a;
   private final int b;
   private final int c;
   private final cjt d;

   public to(gt $$0, cjt $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public to(qx $$0) {
      this.a = $$0.f();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(hm.V);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.writeByte(this.b);
      $$0.writeByte(this.c);
      $$0.a(hm.V, this.d);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public gt b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public cjt e() {
      return this.d;
   }
}
