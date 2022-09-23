public class wf implements tc<tf> {
   private final gt a;
   private final float b;

   public wf(gt $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public wf(qx $$0) {
      this.a = $$0.f();
      this.b = $$0.readFloat();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.writeFloat(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public gt b() {
      return this.a;
   }

   public float c() {
      return this.b;
   }
}
