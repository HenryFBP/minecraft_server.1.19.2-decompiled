public class l {
   private float a;
   private float b;
   private float c;
   private float d;

   public l() {
   }

   public l(float $$0, float $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public l(k $$0) {
      this($$0.a(), $$0.b(), $$0.c(), 1.0F);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         l $$1 = (l)$$0;
         if (Float.compare($$1.a, this.a) != 0) {
            return false;
         } else if (Float.compare($$1.b, this.b) != 0) {
            return false;
         } else if (Float.compare($$1.c, this.c) != 0) {
            return false;
         } else {
            return Float.compare($$1.d, this.d) == 0;
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      int $$0 = Float.floatToIntBits(this.a);
      $$0 = 31 * $$0 + Float.floatToIntBits(this.b);
      $$0 = 31 * $$0 + Float.floatToIntBits(this.c);
      return 31 * $$0 + Float.floatToIntBits(this.d);
   }

   public float a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public float c() {
      return this.c;
   }

   public float d() {
      return this.d;
   }

   public void a(float $$0) {
      this.a *= $$0;
      this.b *= $$0;
      this.c *= $$0;
      this.d *= $$0;
   }

   public void a(k $$0) {
      this.a *= $$0.a();
      this.b *= $$0.b();
      this.c *= $$0.c();
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void b(float $$0, float $$1, float $$2, float $$3) {
      this.a += $$0;
      this.b += $$1;
      this.c += $$2;
      this.d += $$3;
   }

   public float a(l $$0) {
      return this.a * $$0.a + this.b * $$0.b + this.c * $$0.c + this.d * $$0.d;
   }

   public boolean e() {
      float $$0 = this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
      if ((double)$$0 < 1.0E-5) {
         return false;
      } else {
         float $$1 = ami.i($$0);
         this.a *= $$1;
         this.b *= $$1;
         this.c *= $$1;
         this.d *= $$1;
         return true;
      }
   }

   public void a(d $$0) {
      float $$1 = this.a;
      float $$2 = this.b;
      float $$3 = this.c;
      float $$4 = this.d;
      this.a = $$0.a * $$1 + $$0.b * $$2 + $$0.c * $$3 + $$0.d * $$4;
      this.b = $$0.e * $$1 + $$0.f * $$2 + $$0.g * $$3 + $$0.h * $$4;
      this.c = $$0.i * $$1 + $$0.j * $$2 + $$0.k * $$3 + $$0.l * $$4;
      this.d = $$0.m * $$1 + $$0.n * $$2 + $$0.o * $$3 + $$0.p * $$4;
   }

   public void a(g $$0) {
      g $$1 = new g($$0);
      $$1.a(new g(this.a(), this.b(), this.c(), 0.0F));
      g $$2 = new g($$0);
      $$2.i();
      $$1.a($$2);
      this.a($$1.e(), $$1.f(), $$1.g(), this.d());
   }

   public void f() {
      this.a /= this.d;
      this.b /= this.d;
      this.c /= this.d;
      this.d = 1.0F;
   }

   public void a(l $$0, float $$1) {
      float $$2 = 1.0F - $$1;
      this.a = this.a * $$2 + $$0.a * $$1;
      this.b = this.b * $$2 + $$0.b * $$1;
      this.c = this.c * $$2 + $$0.c * $$1;
      this.d = this.d * $$2 + $$0.d * $$1;
   }

   public String toString() {
      return "[" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "]";
   }
}
