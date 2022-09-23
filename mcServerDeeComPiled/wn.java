public class wn implements tc<tf> {
   private final float a;
   private final int b;
   private final float c;

   public wn(float $$0, int $$1, float $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public wn(qx $$0) {
      this.a = $$0.readFloat();
      this.b = $$0.k();
      this.c = $$0.readFloat();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeFloat(this.a);
      $$0.d(this.b);
      $$0.writeFloat(this.c);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
