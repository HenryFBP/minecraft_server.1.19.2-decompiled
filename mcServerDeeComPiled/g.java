public final class g {
   public static final g a = new g(0.0F, 0.0F, 0.0F, 1.0F);
   private float b;
   private float c;
   private float d;
   private float e;

   public g(float $$0, float $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public g(k $$0, float $$1, boolean $$2) {
      if ($$2) {
         $$1 *= (float) (Math.PI / 180.0);
      }

      float $$3 = c($$1 / 2.0F);
      this.b = $$0.a() * $$3;
      this.c = $$0.b() * $$3;
      this.d = $$0.c() * $$3;
      this.e = b($$1 / 2.0F);
   }

   public g(float $$0, float $$1, float $$2, boolean $$3) {
      if ($$3) {
         $$0 *= (float) (Math.PI / 180.0);
         $$1 *= (float) (Math.PI / 180.0);
         $$2 *= (float) (Math.PI / 180.0);
      }

      float $$4 = c(0.5F * $$0);
      float $$5 = b(0.5F * $$0);
      float $$6 = c(0.5F * $$1);
      float $$7 = b(0.5F * $$1);
      float $$8 = c(0.5F * $$2);
      float $$9 = b(0.5F * $$2);
      this.b = $$4 * $$7 * $$9 + $$5 * $$6 * $$8;
      this.c = $$5 * $$6 * $$9 - $$4 * $$7 * $$8;
      this.d = $$4 * $$6 * $$9 + $$5 * $$7 * $$8;
      this.e = $$5 * $$7 * $$9 - $$4 * $$6 * $$8;
   }

   public g(g $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
   }

   public static g a(float $$0, float $$1, float $$2) {
      g $$3 = a.k();
      $$3.a(new g(0.0F, (float)Math.sin((double)($$0 / 2.0F)), 0.0F, (float)Math.cos((double)($$0 / 2.0F))));
      $$3.a(new g((float)Math.sin((double)($$1 / 2.0F)), 0.0F, 0.0F, (float)Math.cos((double)($$1 / 2.0F))));
      $$3.a(new g(0.0F, 0.0F, (float)Math.sin((double)($$2 / 2.0F)), (float)Math.cos((double)($$2 / 2.0F))));
      return $$3;
   }

   public static g a(k $$0) {
      return b((float)Math.toRadians((double)$$0.a()), (float)Math.toRadians((double)$$0.b()), (float)Math.toRadians((double)$$0.c()));
   }

   public static g b(k $$0) {
      return b($$0.a(), $$0.b(), $$0.c());
   }

   public static g b(float $$0, float $$1, float $$2) {
      g $$3 = a.k();
      $$3.a(new g((float)Math.sin((double)($$0 / 2.0F)), 0.0F, 0.0F, (float)Math.cos((double)($$0 / 2.0F))));
      $$3.a(new g(0.0F, (float)Math.sin((double)($$1 / 2.0F)), 0.0F, (float)Math.cos((double)($$1 / 2.0F))));
      $$3.a(new g(0.0F, 0.0F, (float)Math.sin((double)($$2 / 2.0F)), (float)Math.cos((double)($$2 / 2.0F))));
      return $$3;
   }

   public k a() {
      float $$0 = this.h() * this.h();
      float $$1 = this.e() * this.e();
      float $$2 = this.f() * this.f();
      float $$3 = this.g() * this.g();
      float $$4 = $$0 + $$1 + $$2 + $$3;
      float $$5 = 2.0F * this.h() * this.e() - 2.0F * this.f() * this.g();
      float $$6 = (float)Math.asin((double)($$5 / $$4));
      return Math.abs($$5) > 0.999F * $$4
         ? new k(2.0F * (float)Math.atan2((double)this.e(), (double)this.h()), $$6, 0.0F)
         : new k(
            (float)Math.atan2((double)(2.0F * this.f() * this.g() + 2.0F * this.e() * this.h()), (double)($$0 - $$1 - $$2 + $$3)),
            $$6,
            (float)Math.atan2((double)(2.0F * this.e() * this.f() + 2.0F * this.h() * this.g()), (double)($$0 + $$1 - $$2 - $$3))
         );
   }

   public k b() {
      k $$0 = this.a();
      return new k((float)Math.toDegrees((double)$$0.a()), (float)Math.toDegrees((double)$$0.b()), (float)Math.toDegrees((double)$$0.c()));
   }

   public k c() {
      float $$0 = this.h() * this.h();
      float $$1 = this.e() * this.e();
      float $$2 = this.f() * this.f();
      float $$3 = this.g() * this.g();
      float $$4 = $$0 + $$1 + $$2 + $$3;
      float $$5 = 2.0F * this.h() * this.e() - 2.0F * this.f() * this.g();
      float $$6 = (float)Math.asin((double)($$5 / $$4));
      return Math.abs($$5) > 0.999F * $$4
         ? new k($$6, 2.0F * (float)Math.atan2((double)this.f(), (double)this.h()), 0.0F)
         : new k(
            $$6,
            (float)Math.atan2((double)(2.0F * this.e() * this.g() + 2.0F * this.f() * this.h()), (double)($$0 - $$1 - $$2 + $$3)),
            (float)Math.atan2((double)(2.0F * this.e() * this.f() + 2.0F * this.h() * this.g()), (double)($$0 - $$1 + $$2 - $$3))
         );
   }

   public k d() {
      k $$0 = this.c();
      return new k((float)Math.toDegrees((double)$$0.a()), (float)Math.toDegrees((double)$$0.b()), (float)Math.toDegrees((double)$$0.c()));
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         g $$1 = (g)$$0;
         if (Float.compare($$1.b, this.b) != 0) {
            return false;
         } else if (Float.compare($$1.c, this.c) != 0) {
            return false;
         } else if (Float.compare($$1.d, this.d) != 0) {
            return false;
         } else {
            return Float.compare($$1.e, this.e) == 0;
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      int $$0 = Float.floatToIntBits(this.b);
      $$0 = 31 * $$0 + Float.floatToIntBits(this.c);
      $$0 = 31 * $$0 + Float.floatToIntBits(this.d);
      return 31 * $$0 + Float.floatToIntBits(this.e);
   }

   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("Quaternion[").append(this.h()).append(" + ");
      $$0.append(this.e()).append("i + ");
      $$0.append(this.f()).append("j + ");
      $$0.append(this.g()).append("k]");
      return $$0.toString();
   }

   public float e() {
      return this.b;
   }

   public float f() {
      return this.c;
   }

   public float g() {
      return this.d;
   }

   public float h() {
      return this.e;
   }

   public void a(g $$0) {
      float $$1 = this.e();
      float $$2 = this.f();
      float $$3 = this.g();
      float $$4 = this.h();
      float $$5 = $$0.e();
      float $$6 = $$0.f();
      float $$7 = $$0.g();
      float $$8 = $$0.h();
      this.b = $$4 * $$5 + $$1 * $$8 + $$2 * $$7 - $$3 * $$6;
      this.c = $$4 * $$6 - $$1 * $$7 + $$2 * $$8 + $$3 * $$5;
      this.d = $$4 * $$7 + $$1 * $$6 - $$2 * $$5 + $$3 * $$8;
      this.e = $$4 * $$8 - $$1 * $$5 - $$2 * $$6 - $$3 * $$7;
   }

   public void a(float $$0) {
      this.b *= $$0;
      this.c *= $$0;
      this.d *= $$0;
      this.e *= $$0;
   }

   public void i() {
      this.b = -this.b;
      this.c = -this.c;
      this.d = -this.d;
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private static float b(float $$0) {
      return (float)Math.cos((double)$$0);
   }

   private static float c(float $$0) {
      return (float)Math.sin((double)$$0);
   }

   public void j() {
      float $$0 = this.e() * this.e() + this.f() * this.f() + this.g() * this.g() + this.h() * this.h();
      if ($$0 > 1.0E-6F) {
         float $$1 = ami.i($$0);
         this.b *= $$1;
         this.c *= $$1;
         this.d *= $$1;
         this.e *= $$1;
      } else {
         this.b = 0.0F;
         this.c = 0.0F;
         this.d = 0.0F;
         this.e = 0.0F;
      }

   }

   public void a(g $$0, float $$1) {
      throw new UnsupportedOperationException();
   }

   public g k() {
      return new g(this);
   }
}
