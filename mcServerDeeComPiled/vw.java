public class vw implements tc<tf> {
   private final double a;
   private final double b;

   public vw(cxe $$0) {
      this.a = $$0.a();
      this.b = $$0.b();
   }

   public vw(qx $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double c() {
      return this.a;
   }
}
