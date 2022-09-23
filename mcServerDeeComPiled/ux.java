public class ux implements tc<tf> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;

   public ux(bbn $$0) {
      this.a = $$0.df();
      this.b = $$0.dh();
      this.c = $$0.dl();
      this.d = $$0.dq();
      this.e = $$0.ds();
   }

   public ux(qx $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeFloat(this.d);
      $$0.writeFloat(this.e);
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

   public double d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }

   public float f() {
      return this.e;
   }
}
