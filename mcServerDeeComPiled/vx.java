public class vx implements tc<tf> {
   private final double a;
   private final double b;
   private final long c;

   public vx(cxe $$0) {
      this.a = $$0.i();
      this.b = $$0.k();
      this.c = $$0.j();
   }

   public vx(qx $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.l();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.b(this.c);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.a;
   }

   public double c() {
      return this.b;
   }

   public long d() {
      return this.c;
   }
}
