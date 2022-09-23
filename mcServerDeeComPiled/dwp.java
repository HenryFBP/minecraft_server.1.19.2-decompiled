public class dwp {
   public static final dwp a = new dwp(0.0F, 0.0F);
   public static final dwp b = new dwp(1.0F, 1.0F);
   public static final dwp c = new dwp(1.0F, 0.0F);
   public static final dwp d = new dwp(-1.0F, 0.0F);
   public static final dwp e = new dwp(0.0F, 1.0F);
   public static final dwp f = new dwp(0.0F, -1.0F);
   public static final dwp g = new dwp(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final dwp h = new dwp(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public dwp(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public dwp a(float $$0) {
      return new dwp(this.i * $$0, this.j * $$0);
   }

   public float a(dwp $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public dwp b(dwp $$0) {
      return new dwp(this.i + $$0.i, this.j + $$0.j);
   }

   public dwp b(float $$0) {
      return new dwp(this.i + $$0, this.j + $$0);
   }

   public boolean c(dwp $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public dwp a() {
      float $$0 = ami.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new dwp(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ami.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(dwp $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public dwp d() {
      return new dwp(-this.i, -this.j);
   }
}
