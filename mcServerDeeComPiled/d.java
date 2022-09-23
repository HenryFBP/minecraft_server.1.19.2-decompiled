import java.nio.FloatBuffer;

public final class d {
   private static final int q = 4;
   protected float a;
   protected float b;
   protected float c;
   protected float d;
   protected float e;
   protected float f;
   protected float g;
   protected float h;
   protected float i;
   protected float j;
   protected float k;
   protected float l;
   protected float m;
   protected float n;
   protected float o;
   protected float p;

   public d() {
   }

   public d(d $$0) {
      this.a = $$0.a;
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
      this.m = $$0.m;
      this.n = $$0.n;
      this.o = $$0.o;
      this.p = $$0.p;
   }

   public d(g $$0) {
      float $$1 = $$0.e();
      float $$2 = $$0.f();
      float $$3 = $$0.g();
      float $$4 = $$0.h();
      float $$5 = 2.0F * $$1 * $$1;
      float $$6 = 2.0F * $$2 * $$2;
      float $$7 = 2.0F * $$3 * $$3;
      this.a = 1.0F - $$6 - $$7;
      this.f = 1.0F - $$7 - $$5;
      this.k = 1.0F - $$5 - $$6;
      this.p = 1.0F;
      float $$8 = $$1 * $$2;
      float $$9 = $$2 * $$3;
      float $$10 = $$3 * $$1;
      float $$11 = $$1 * $$4;
      float $$12 = $$2 * $$4;
      float $$13 = $$3 * $$4;
      this.e = 2.0F * ($$8 + $$13);
      this.b = 2.0F * ($$8 - $$13);
      this.i = 2.0F * ($$10 - $$12);
      this.c = 2.0F * ($$10 + $$12);
      this.j = 2.0F * ($$9 + $$11);
      this.g = 2.0F * ($$9 - $$11);
   }

   public boolean a() {
      d $$0 = new d();
      $$0.m = 1.0F;
      $$0.n = 1.0F;
      $$0.o = 1.0F;
      $$0.p = 0.0F;
      d $$1 = this.h();
      $$1.b($$0);
      return b($$1.a / $$1.d)
         && b($$1.e / $$1.h)
         && b($$1.i / $$1.l)
         && b($$1.b / $$1.d)
         && b($$1.f / $$1.h)
         && b($$1.j / $$1.l)
         && b($$1.c / $$1.d)
         && b($$1.g / $$1.h)
         && b($$1.k / $$1.l);
   }

   private static boolean b(float $$0) {
      return (double)Math.abs($$0 - (float)Math.round($$0)) <= 1.0E-5;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         d $$1 = (d)$$0;
         return Float.compare($$1.a, this.a) == 0
            && Float.compare($$1.b, this.b) == 0
            && Float.compare($$1.c, this.c) == 0
            && Float.compare($$1.d, this.d) == 0
            && Float.compare($$1.e, this.e) == 0
            && Float.compare($$1.f, this.f) == 0
            && Float.compare($$1.g, this.g) == 0
            && Float.compare($$1.h, this.h) == 0
            && Float.compare($$1.i, this.i) == 0
            && Float.compare($$1.j, this.j) == 0
            && Float.compare($$1.k, this.k) == 0
            && Float.compare($$1.l, this.l) == 0
            && Float.compare($$1.m, this.m) == 0
            && Float.compare($$1.n, this.n) == 0
            && Float.compare($$1.o, this.o) == 0
            && Float.compare($$1.p, this.p) == 0;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int $$0 = this.a != 0.0F ? Float.floatToIntBits(this.a) : 0;
      $$0 = 31 * $$0 + (this.b != 0.0F ? Float.floatToIntBits(this.b) : 0);
      $$0 = 31 * $$0 + (this.c != 0.0F ? Float.floatToIntBits(this.c) : 0);
      $$0 = 31 * $$0 + (this.d != 0.0F ? Float.floatToIntBits(this.d) : 0);
      $$0 = 31 * $$0 + (this.e != 0.0F ? Float.floatToIntBits(this.e) : 0);
      $$0 = 31 * $$0 + (this.f != 0.0F ? Float.floatToIntBits(this.f) : 0);
      $$0 = 31 * $$0 + (this.g != 0.0F ? Float.floatToIntBits(this.g) : 0);
      $$0 = 31 * $$0 + (this.h != 0.0F ? Float.floatToIntBits(this.h) : 0);
      $$0 = 31 * $$0 + (this.i != 0.0F ? Float.floatToIntBits(this.i) : 0);
      $$0 = 31 * $$0 + (this.j != 0.0F ? Float.floatToIntBits(this.j) : 0);
      $$0 = 31 * $$0 + (this.k != 0.0F ? Float.floatToIntBits(this.k) : 0);
      $$0 = 31 * $$0 + (this.l != 0.0F ? Float.floatToIntBits(this.l) : 0);
      $$0 = 31 * $$0 + (this.m != 0.0F ? Float.floatToIntBits(this.m) : 0);
      $$0 = 31 * $$0 + (this.n != 0.0F ? Float.floatToIntBits(this.n) : 0);
      $$0 = 31 * $$0 + (this.o != 0.0F ? Float.floatToIntBits(this.o) : 0);
      return 31 * $$0 + (this.p != 0.0F ? Float.floatToIntBits(this.p) : 0);
   }

   private static int a(int $$0, int $$1) {
      return $$1 * 4 + $$0;
   }

   public void a(FloatBuffer $$0) {
      this.a = $$0.get(a(0, 0));
      this.b = $$0.get(a(0, 1));
      this.c = $$0.get(a(0, 2));
      this.d = $$0.get(a(0, 3));
      this.e = $$0.get(a(1, 0));
      this.f = $$0.get(a(1, 1));
      this.g = $$0.get(a(1, 2));
      this.h = $$0.get(a(1, 3));
      this.i = $$0.get(a(2, 0));
      this.j = $$0.get(a(2, 1));
      this.k = $$0.get(a(2, 2));
      this.l = $$0.get(a(2, 3));
      this.m = $$0.get(a(3, 0));
      this.n = $$0.get(a(3, 1));
      this.o = $$0.get(a(3, 2));
      this.p = $$0.get(a(3, 3));
   }

   public void b(FloatBuffer $$0) {
      this.a = $$0.get(a(0, 0));
      this.b = $$0.get(a(1, 0));
      this.c = $$0.get(a(2, 0));
      this.d = $$0.get(a(3, 0));
      this.e = $$0.get(a(0, 1));
      this.f = $$0.get(a(1, 1));
      this.g = $$0.get(a(2, 1));
      this.h = $$0.get(a(3, 1));
      this.i = $$0.get(a(0, 2));
      this.j = $$0.get(a(1, 2));
      this.k = $$0.get(a(2, 2));
      this.l = $$0.get(a(3, 2));
      this.m = $$0.get(a(0, 3));
      this.n = $$0.get(a(1, 3));
      this.o = $$0.get(a(2, 3));
      this.p = $$0.get(a(3, 3));
   }

   public void a(FloatBuffer $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }

   }

   public void a(d $$0) {
      this.a = $$0.a;
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
      this.m = $$0.m;
      this.n = $$0.n;
      this.o = $$0.o;
      this.p = $$0.p;
   }

   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("Matrix4f:\n");
      $$0.append(this.a);
      $$0.append(" ");
      $$0.append(this.b);
      $$0.append(" ");
      $$0.append(this.c);
      $$0.append(" ");
      $$0.append(this.d);
      $$0.append("\n");
      $$0.append(this.e);
      $$0.append(" ");
      $$0.append(this.f);
      $$0.append(" ");
      $$0.append(this.g);
      $$0.append(" ");
      $$0.append(this.h);
      $$0.append("\n");
      $$0.append(this.i);
      $$0.append(" ");
      $$0.append(this.j);
      $$0.append(" ");
      $$0.append(this.k);
      $$0.append(" ");
      $$0.append(this.l);
      $$0.append("\n");
      $$0.append(this.m);
      $$0.append(" ");
      $$0.append(this.n);
      $$0.append(" ");
      $$0.append(this.o);
      $$0.append(" ");
      $$0.append(this.p);
      $$0.append("\n");
      return $$0.toString();
   }

   public void c(FloatBuffer $$0) {
      $$0.put(a(0, 0), this.a);
      $$0.put(a(0, 1), this.b);
      $$0.put(a(0, 2), this.c);
      $$0.put(a(0, 3), this.d);
      $$0.put(a(1, 0), this.e);
      $$0.put(a(1, 1), this.f);
      $$0.put(a(1, 2), this.g);
      $$0.put(a(1, 3), this.h);
      $$0.put(a(2, 0), this.i);
      $$0.put(a(2, 1), this.j);
      $$0.put(a(2, 2), this.k);
      $$0.put(a(2, 3), this.l);
      $$0.put(a(3, 0), this.m);
      $$0.put(a(3, 1), this.n);
      $$0.put(a(3, 2), this.o);
      $$0.put(a(3, 3), this.p);
   }

   public void d(FloatBuffer $$0) {
      $$0.put(a(0, 0), this.a);
      $$0.put(a(1, 0), this.b);
      $$0.put(a(2, 0), this.c);
      $$0.put(a(3, 0), this.d);
      $$0.put(a(0, 1), this.e);
      $$0.put(a(1, 1), this.f);
      $$0.put(a(2, 1), this.g);
      $$0.put(a(3, 1), this.h);
      $$0.put(a(0, 2), this.i);
      $$0.put(a(1, 2), this.j);
      $$0.put(a(2, 2), this.k);
      $$0.put(a(3, 2), this.l);
      $$0.put(a(0, 3), this.m);
      $$0.put(a(1, 3), this.n);
      $$0.put(a(2, 3), this.o);
      $$0.put(a(3, 3), this.p);
   }

   public void b(FloatBuffer $$0, boolean $$1) {
      if ($$1) {
         this.d($$0);
      } else {
         this.c($$0);
      }

   }

   public void b() {
      this.a = 1.0F;
      this.b = 0.0F;
      this.c = 0.0F;
      this.d = 0.0F;
      this.e = 0.0F;
      this.f = 1.0F;
      this.g = 0.0F;
      this.h = 0.0F;
      this.i = 0.0F;
      this.j = 0.0F;
      this.k = 1.0F;
      this.l = 0.0F;
      this.m = 0.0F;
      this.n = 0.0F;
      this.o = 0.0F;
      this.p = 1.0F;
   }

   public float c() {
      float $$0 = this.a * this.f - this.b * this.e;
      float $$1 = this.a * this.g - this.c * this.e;
      float $$2 = this.a * this.h - this.d * this.e;
      float $$3 = this.b * this.g - this.c * this.f;
      float $$4 = this.b * this.h - this.d * this.f;
      float $$5 = this.c * this.h - this.d * this.g;
      float $$6 = this.i * this.n - this.j * this.m;
      float $$7 = this.i * this.o - this.k * this.m;
      float $$8 = this.i * this.p - this.l * this.m;
      float $$9 = this.j * this.o - this.k * this.n;
      float $$10 = this.j * this.p - this.l * this.n;
      float $$11 = this.k * this.p - this.l * this.o;
      float $$12 = this.f * $$11 - this.g * $$10 + this.h * $$9;
      float $$13 = -this.e * $$11 + this.g * $$8 - this.h * $$7;
      float $$14 = this.e * $$10 - this.f * $$8 + this.h * $$6;
      float $$15 = -this.e * $$9 + this.f * $$7 - this.g * $$6;
      float $$16 = -this.b * $$11 + this.c * $$10 - this.d * $$9;
      float $$17 = this.a * $$11 - this.c * $$8 + this.d * $$7;
      float $$18 = -this.a * $$10 + this.b * $$8 - this.d * $$6;
      float $$19 = this.a * $$9 - this.b * $$7 + this.c * $$6;
      float $$20 = this.n * $$5 - this.o * $$4 + this.p * $$3;
      float $$21 = -this.m * $$5 + this.o * $$2 - this.p * $$1;
      float $$22 = this.m * $$4 - this.n * $$2 + this.p * $$0;
      float $$23 = -this.m * $$3 + this.n * $$1 - this.o * $$0;
      float $$24 = -this.j * $$5 + this.k * $$4 - this.l * $$3;
      float $$25 = this.i * $$5 - this.k * $$2 + this.l * $$1;
      float $$26 = -this.i * $$4 + this.j * $$2 - this.l * $$0;
      float $$27 = this.i * $$3 - this.j * $$1 + this.k * $$0;
      this.a = $$12;
      this.e = $$13;
      this.i = $$14;
      this.m = $$15;
      this.b = $$16;
      this.f = $$17;
      this.j = $$18;
      this.n = $$19;
      this.c = $$20;
      this.g = $$21;
      this.k = $$22;
      this.o = $$23;
      this.d = $$24;
      this.h = $$25;
      this.l = $$26;
      this.p = $$27;
      return $$0 * $$11 - $$1 * $$10 + $$2 * $$9 + $$3 * $$8 - $$4 * $$7 + $$5 * $$6;
   }

   public float d() {
      float $$0 = this.a * this.f - this.b * this.e;
      float $$1 = this.a * this.g - this.c * this.e;
      float $$2 = this.a * this.h - this.d * this.e;
      float $$3 = this.b * this.g - this.c * this.f;
      float $$4 = this.b * this.h - this.d * this.f;
      float $$5 = this.c * this.h - this.d * this.g;
      float $$6 = this.i * this.n - this.j * this.m;
      float $$7 = this.i * this.o - this.k * this.m;
      float $$8 = this.i * this.p - this.l * this.m;
      float $$9 = this.j * this.o - this.k * this.n;
      float $$10 = this.j * this.p - this.l * this.n;
      float $$11 = this.k * this.p - this.l * this.o;
      return $$0 * $$11 - $$1 * $$10 + $$2 * $$9 + $$3 * $$8 - $$4 * $$7 + $$5 * $$6;
   }

   public void e() {
      float $$0 = this.e;
      this.e = this.b;
      this.b = $$0;
      $$0 = this.i;
      this.i = this.c;
      this.c = $$0;
      $$0 = this.j;
      this.j = this.g;
      this.g = $$0;
      $$0 = this.m;
      this.m = this.d;
      this.d = $$0;
      $$0 = this.n;
      this.n = this.h;
      this.h = $$0;
      $$0 = this.o;
      this.o = this.l;
      this.l = $$0;
   }

   public boolean f() {
      float $$0 = this.c();
      if (Math.abs($$0) > 1.0E-6F) {
         this.a($$0);
         return true;
      } else {
         return false;
      }
   }

   public void b(d $$0) {
      float $$1 = this.a * $$0.a + this.b * $$0.e + this.c * $$0.i + this.d * $$0.m;
      float $$2 = this.a * $$0.b + this.b * $$0.f + this.c * $$0.j + this.d * $$0.n;
      float $$3 = this.a * $$0.c + this.b * $$0.g + this.c * $$0.k + this.d * $$0.o;
      float $$4 = this.a * $$0.d + this.b * $$0.h + this.c * $$0.l + this.d * $$0.p;
      float $$5 = this.e * $$0.a + this.f * $$0.e + this.g * $$0.i + this.h * $$0.m;
      float $$6 = this.e * $$0.b + this.f * $$0.f + this.g * $$0.j + this.h * $$0.n;
      float $$7 = this.e * $$0.c + this.f * $$0.g + this.g * $$0.k + this.h * $$0.o;
      float $$8 = this.e * $$0.d + this.f * $$0.h + this.g * $$0.l + this.h * $$0.p;
      float $$9 = this.i * $$0.a + this.j * $$0.e + this.k * $$0.i + this.l * $$0.m;
      float $$10 = this.i * $$0.b + this.j * $$0.f + this.k * $$0.j + this.l * $$0.n;
      float $$11 = this.i * $$0.c + this.j * $$0.g + this.k * $$0.k + this.l * $$0.o;
      float $$12 = this.i * $$0.d + this.j * $$0.h + this.k * $$0.l + this.l * $$0.p;
      float $$13 = this.m * $$0.a + this.n * $$0.e + this.o * $$0.i + this.p * $$0.m;
      float $$14 = this.m * $$0.b + this.n * $$0.f + this.o * $$0.j + this.p * $$0.n;
      float $$15 = this.m * $$0.c + this.n * $$0.g + this.o * $$0.k + this.p * $$0.o;
      float $$16 = this.m * $$0.d + this.n * $$0.h + this.o * $$0.l + this.p * $$0.p;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.f = $$6;
      this.g = $$7;
      this.h = $$8;
      this.i = $$9;
      this.j = $$10;
      this.k = $$11;
      this.l = $$12;
      this.m = $$13;
      this.n = $$14;
      this.o = $$15;
      this.p = $$16;
   }

   public void a(g $$0) {
      this.b(new d($$0));
   }

   public void a(float $$0) {
      this.a *= $$0;
      this.b *= $$0;
      this.c *= $$0;
      this.d *= $$0;
      this.e *= $$0;
      this.f *= $$0;
      this.g *= $$0;
      this.h *= $$0;
      this.i *= $$0;
      this.j *= $$0;
      this.k *= $$0;
      this.l *= $$0;
      this.m *= $$0;
      this.n *= $$0;
      this.o *= $$0;
      this.p *= $$0;
   }

   public void c(d $$0) {
      this.a += $$0.a;
      this.b += $$0.b;
      this.c += $$0.c;
      this.d += $$0.d;
      this.e += $$0.e;
      this.f += $$0.f;
      this.g += $$0.g;
      this.h += $$0.h;
      this.i += $$0.i;
      this.j += $$0.j;
      this.k += $$0.k;
      this.l += $$0.l;
      this.m += $$0.m;
      this.n += $$0.n;
      this.o += $$0.o;
      this.p += $$0.p;
   }

   public void d(d $$0) {
      this.a -= $$0.a;
      this.b -= $$0.b;
      this.c -= $$0.c;
      this.d -= $$0.d;
      this.e -= $$0.e;
      this.f -= $$0.f;
      this.g -= $$0.g;
      this.h -= $$0.h;
      this.i -= $$0.i;
      this.j -= $$0.j;
      this.k -= $$0.k;
      this.l -= $$0.l;
      this.m -= $$0.m;
      this.n -= $$0.n;
      this.o -= $$0.o;
      this.p -= $$0.p;
   }

   public float g() {
      return this.a + this.f + this.k + this.p;
   }

   public static d a(double $$0, float $$1, float $$2, float $$3) {
      float $$4 = (float)(1.0 / Math.tan($$0 * (float) (Math.PI / 180.0) / 2.0));
      d $$5 = new d();
      $$5.a = $$4 / $$1;
      $$5.f = $$4;
      $$5.k = ($$3 + $$2) / ($$2 - $$3);
      $$5.o = -1.0F;
      $$5.l = 2.0F * $$3 * $$2 / ($$2 - $$3);
      return $$5;
   }

   public static d a(float $$0, float $$1, float $$2, float $$3) {
      d $$4 = new d();
      $$4.a = 2.0F / $$0;
      $$4.f = 2.0F / $$1;
      float $$5 = $$3 - $$2;
      $$4.k = -2.0F / $$5;
      $$4.p = 1.0F;
      $$4.d = -1.0F;
      $$4.h = 1.0F;
      $$4.l = -($$3 + $$2) / $$5;
      return $$4;
   }

   public static d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      d $$6 = new d();
      float $$7 = $$1 - $$0;
      float $$8 = $$2 - $$3;
      float $$9 = $$5 - $$4;
      $$6.a = 2.0F / $$7;
      $$6.f = 2.0F / $$8;
      $$6.k = -2.0F / $$9;
      $$6.d = -($$1 + $$0) / $$7;
      $$6.h = -($$2 + $$3) / $$8;
      $$6.l = -($$5 + $$4) / $$9;
      $$6.p = 1.0F;
      return $$6;
   }

   public void a(k $$0) {
      this.d += $$0.a();
      this.h += $$0.b();
      this.l += $$0.c();
   }

   public d h() {
      return new d(this);
   }

   public void a(float $$0, float $$1, float $$2) {
      this.d += this.a * $$0 + this.b * $$1 + this.c * $$2;
      this.h += this.e * $$0 + this.f * $$1 + this.g * $$2;
      this.l += this.i * $$0 + this.j * $$1 + this.k * $$2;
      this.p += this.m * $$0 + this.n * $$1 + this.o * $$2;
   }

   public static d b(float $$0, float $$1, float $$2) {
      d $$3 = new d();
      $$3.a = $$0;
      $$3.f = $$1;
      $$3.k = $$2;
      $$3.p = 1.0F;
      return $$3;
   }

   public static d c(float $$0, float $$1, float $$2) {
      d $$3 = new d();
      $$3.a = 1.0F;
      $$3.f = 1.0F;
      $$3.k = 1.0F;
      $$3.p = 1.0F;
      $$3.d = $$0;
      $$3.h = $$1;
      $$3.l = $$2;
      return $$3;
   }
}
