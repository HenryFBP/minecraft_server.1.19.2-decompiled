import com.mojang.datafixers.util.Pair;
import java.nio.FloatBuffer;
import org.apache.commons.lang3.tuple.Triple;

public final class c {
   private static final int j = 3;
   private static final float k = 3.0F + 2.0F * (float)Math.sqrt(2.0);
   private static final float l = (float)Math.cos(Math.PI / 8);
   private static final float m = (float)Math.sin(Math.PI / 8);
   private static final float n = 1.0F / (float)Math.sqrt(2.0);
   protected float a;
   protected float b;
   protected float c;
   protected float d;
   protected float e;
   protected float f;
   protected float g;
   protected float h;
   protected float i;

   public c() {
   }

   public c(g $$0) {
      float $$1 = $$0.e();
      float $$2 = $$0.f();
      float $$3 = $$0.g();
      float $$4 = $$0.h();
      float $$5 = 2.0F * $$1 * $$1;
      float $$6 = 2.0F * $$2 * $$2;
      float $$7 = 2.0F * $$3 * $$3;
      this.a = 1.0F - $$6 - $$7;
      this.e = 1.0F - $$7 - $$5;
      this.i = 1.0F - $$5 - $$6;
      float $$8 = $$1 * $$2;
      float $$9 = $$2 * $$3;
      float $$10 = $$3 * $$1;
      float $$11 = $$1 * $$4;
      float $$12 = $$2 * $$4;
      float $$13 = $$3 * $$4;
      this.d = 2.0F * ($$8 + $$13);
      this.b = 2.0F * ($$8 - $$13);
      this.g = 2.0F * ($$10 - $$12);
      this.c = 2.0F * ($$10 + $$12);
      this.h = 2.0F * ($$9 + $$11);
      this.f = 2.0F * ($$9 - $$11);
   }

   public static c a(float $$0, float $$1, float $$2) {
      c $$3 = new c();
      $$3.a = $$0;
      $$3.e = $$1;
      $$3.i = $$2;
      return $$3;
   }

   public c(d $$0) {
      this.a = $$0.a;
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.e;
      this.e = $$0.f;
      this.f = $$0.g;
      this.g = $$0.i;
      this.h = $$0.j;
      this.i = $$0.k;
   }

   public c(c $$0) {
      this.a = $$0.a;
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   private static Pair<Float, Float> b(float $$0, float $$1, float $$2) {
      float $$3 = 2.0F * ($$0 - $$2);
      if (k * $$1 * $$1 < $$3 * $$3) {
         float $$5 = ami.i($$1 * $$1 + $$3 * $$3);
         return Pair.of($$5 * $$1, $$5 * $$3);
      } else {
         return Pair.of(m, l);
      }
   }

   private static Pair<Float, Float> a(float $$0, float $$1) {
      float $$2 = (float)Math.hypot((double)$$0, (double)$$1);
      float $$3 = $$2 > 1.0E-6F ? $$1 : 0.0F;
      float $$4 = Math.abs($$0) + Math.max($$2, 1.0E-6F);
      if ($$0 < 0.0F) {
         float $$5 = $$3;
         $$3 = $$4;
         $$4 = $$5;
      }

      float $$6 = ami.i($$4 * $$4 + $$3 * $$3);
      $$4 *= $$6;
      $$3 *= $$6;
      return Pair.of($$3, $$4);
   }

   private static g e(c $$0) {
      c $$1 = new c();
      g $$2 = g.a.k();
      if ($$0.b * $$0.b + $$0.d * $$0.d > 1.0E-6F) {
         Pair<Float, Float> $$3 = b($$0.a, 0.5F * ($$0.b + $$0.d), $$0.e);
         Float $$4 = (Float)$$3.getFirst();
         Float $$5 = (Float)$$3.getSecond();
         g $$6 = new g(0.0F, 0.0F, $$4, $$5);
         float $$7 = $$5 * $$5 - $$4 * $$4;
         float $$8 = -2.0F * $$4 * $$5;
         float $$9 = $$5 * $$5 + $$4 * $$4;
         $$2.a($$6);
         $$1.c();
         $$1.a = $$7;
         $$1.e = $$7;
         $$1.d = -$$8;
         $$1.b = $$8;
         $$1.i = $$9;
         $$0.b($$1);
         $$1.a();
         $$1.b($$0);
         $$0.a($$1);
      }

      if ($$0.c * $$0.c + $$0.g * $$0.g > 1.0E-6F) {
         Pair<Float, Float> $$10 = b($$0.a, 0.5F * ($$0.c + $$0.g), $$0.i);
         float $$11 = -$$10.getFirst();
         Float $$12 = (Float)$$10.getSecond();
         g $$13 = new g(0.0F, $$11, 0.0F, $$12);
         float $$14 = $$12 * $$12 - $$11 * $$11;
         float $$15 = -2.0F * $$11 * $$12;
         float $$16 = $$12 * $$12 + $$11 * $$11;
         $$2.a($$13);
         $$1.c();
         $$1.a = $$14;
         $$1.i = $$14;
         $$1.g = $$15;
         $$1.c = -$$15;
         $$1.e = $$16;
         $$0.b($$1);
         $$1.a();
         $$1.b($$0);
         $$0.a($$1);
      }

      if ($$0.f * $$0.f + $$0.h * $$0.h > 1.0E-6F) {
         Pair<Float, Float> $$17 = b($$0.e, 0.5F * ($$0.f + $$0.h), $$0.i);
         Float $$18 = (Float)$$17.getFirst();
         Float $$19 = (Float)$$17.getSecond();
         g $$20 = new g($$18, 0.0F, 0.0F, $$19);
         float $$21 = $$19 * $$19 - $$18 * $$18;
         float $$22 = -2.0F * $$18 * $$19;
         float $$23 = $$19 * $$19 + $$18 * $$18;
         $$2.a($$20);
         $$1.c();
         $$1.e = $$21;
         $$1.i = $$21;
         $$1.h = -$$22;
         $$1.f = $$22;
         $$1.a = $$23;
         $$0.b($$1);
         $$1.a();
         $$1.b($$0);
         $$0.a($$1);
      }

      return $$2;
   }

   private static void a(c $$0, g $$1) {
      float $$2 = $$0.a * $$0.a + $$0.d * $$0.d + $$0.g * $$0.g;
      float $$3 = $$0.b * $$0.b + $$0.e * $$0.e + $$0.h * $$0.h;
      float $$4 = $$0.c * $$0.c + $$0.f * $$0.f + $$0.i * $$0.i;
      if ($$2 < $$3) {
         float $$5 = $$0.d;
         $$0.d = -$$0.a;
         $$0.a = $$5;
         $$5 = $$0.e;
         $$0.e = -$$0.b;
         $$0.b = $$5;
         $$5 = $$0.f;
         $$0.f = -$$0.c;
         $$0.c = $$5;
         g $$6 = new g(0.0F, 0.0F, n, n);
         $$1.a($$6);
         $$5 = $$2;
         $$2 = $$3;
         $$3 = $$5;
      }

      if ($$2 < $$4) {
         float $$7 = $$0.g;
         $$0.g = -$$0.a;
         $$0.a = $$7;
         $$7 = $$0.h;
         $$0.h = -$$0.b;
         $$0.b = $$7;
         $$7 = $$0.i;
         $$0.i = -$$0.c;
         $$0.c = $$7;
         g $$8 = new g(0.0F, n, 0.0F, n);
         $$1.a($$8);
         $$4 = $$2;
      }

      if ($$3 < $$4) {
         float $$9 = $$0.g;
         $$0.g = -$$0.d;
         $$0.d = $$9;
         $$9 = $$0.h;
         $$0.h = -$$0.e;
         $$0.e = $$9;
         $$9 = $$0.i;
         $$0.i = -$$0.f;
         $$0.f = $$9;
         g $$10 = new g(n, 0.0F, 0.0F, n);
         $$1.a($$10);
      }

   }

   public void a() {
      float $$0 = this.b;
      this.b = this.d;
      this.d = $$0;
      $$0 = this.c;
      this.c = this.g;
      this.g = $$0;
      $$0 = this.f;
      this.f = this.h;
      this.h = $$0;
   }

   public Triple<g, k, g> b() {
      g $$0 = g.a.k();
      g $$1 = g.a.k();
      c $$2 = this.h();
      $$2.a();
      $$2.b(this);

      for(int $$3 = 0; $$3 < 5; ++$$3) {
         $$1.a(e($$2));
      }

      $$1.j();
      c $$4 = new c(this);
      $$4.b(new c($$1));
      float $$5 = 1.0F;
      Pair<Float, Float> $$6 = a($$4.a, $$4.d);
      Float $$7 = (Float)$$6.getFirst();
      Float $$8 = (Float)$$6.getSecond();
      float $$9 = $$8 * $$8 - $$7 * $$7;
      float $$10 = -2.0F * $$7 * $$8;
      float $$11 = $$8 * $$8 + $$7 * $$7;
      g $$12 = new g(0.0F, 0.0F, $$7, $$8);
      $$0.a($$12);
      c $$13 = new c();
      $$13.c();
      $$13.a = $$9;
      $$13.e = $$9;
      $$13.d = $$10;
      $$13.b = -$$10;
      $$13.i = $$11;
      $$5 *= $$11;
      $$13.b($$4);
      $$6 = a($$13.a, $$13.g);
      float $$14 = -$$6.getFirst();
      Float $$15 = (Float)$$6.getSecond();
      float $$16 = $$15 * $$15 - $$14 * $$14;
      float $$17 = -2.0F * $$14 * $$15;
      float $$18 = $$15 * $$15 + $$14 * $$14;
      g $$19 = new g(0.0F, $$14, 0.0F, $$15);
      $$0.a($$19);
      c $$20 = new c();
      $$20.c();
      $$20.a = $$16;
      $$20.i = $$16;
      $$20.g = -$$17;
      $$20.c = $$17;
      $$20.e = $$18;
      $$5 *= $$18;
      $$20.b($$13);
      $$6 = a($$20.e, $$20.h);
      Float $$21 = (Float)$$6.getFirst();
      Float $$22 = (Float)$$6.getSecond();
      float $$23 = $$22 * $$22 - $$21 * $$21;
      float $$24 = -2.0F * $$21 * $$22;
      float $$25 = $$22 * $$22 + $$21 * $$21;
      g $$26 = new g($$21, 0.0F, 0.0F, $$22);
      $$0.a($$26);
      c $$27 = new c();
      $$27.c();
      $$27.e = $$23;
      $$27.i = $$23;
      $$27.h = $$24;
      $$27.f = -$$24;
      $$27.a = $$25;
      $$5 *= $$25;
      $$27.b($$20);
      $$5 = 1.0F / $$5;
      $$0.a((float)Math.sqrt((double)$$5));
      k $$28 = new k($$27.a * $$5, $$27.e * $$5, $$27.i * $$5);
      return Triple.of($$0, $$28, $$1);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         c $$1 = (c)$$0;
         return Float.compare($$1.a, this.a) == 0
            && Float.compare($$1.b, this.b) == 0
            && Float.compare($$1.c, this.c) == 0
            && Float.compare($$1.d, this.d) == 0
            && Float.compare($$1.e, this.e) == 0
            && Float.compare($$1.f, this.f) == 0
            && Float.compare($$1.g, this.g) == 0
            && Float.compare($$1.h, this.h) == 0
            && Float.compare($$1.i, this.i) == 0;
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
      return 31 * $$0 + (this.i != 0.0F ? Float.floatToIntBits(this.i) : 0);
   }

   private static int a(int $$0, int $$1) {
      return $$1 * 3 + $$0;
   }

   public void a(FloatBuffer $$0) {
      this.a = $$0.get(a(0, 0));
      this.b = $$0.get(a(0, 1));
      this.c = $$0.get(a(0, 2));
      this.d = $$0.get(a(1, 0));
      this.e = $$0.get(a(1, 1));
      this.f = $$0.get(a(1, 2));
      this.g = $$0.get(a(2, 0));
      this.h = $$0.get(a(2, 1));
      this.i = $$0.get(a(2, 2));
   }

   public void b(FloatBuffer $$0) {
      this.a = $$0.get(a(0, 0));
      this.b = $$0.get(a(1, 0));
      this.c = $$0.get(a(2, 0));
      this.d = $$0.get(a(0, 1));
      this.e = $$0.get(a(1, 1));
      this.f = $$0.get(a(2, 1));
      this.g = $$0.get(a(0, 2));
      this.h = $$0.get(a(1, 2));
      this.i = $$0.get(a(2, 2));
   }

   public void a(FloatBuffer $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }

   }

   public void a(c $$0) {
      this.a = $$0.a;
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("Matrix3f:\n");
      $$0.append(this.a);
      $$0.append(" ");
      $$0.append(this.b);
      $$0.append(" ");
      $$0.append(this.c);
      $$0.append("\n");
      $$0.append(this.d);
      $$0.append(" ");
      $$0.append(this.e);
      $$0.append(" ");
      $$0.append(this.f);
      $$0.append("\n");
      $$0.append(this.g);
      $$0.append(" ");
      $$0.append(this.h);
      $$0.append(" ");
      $$0.append(this.i);
      $$0.append("\n");
      return $$0.toString();
   }

   public void c(FloatBuffer $$0) {
      $$0.put(a(0, 0), this.a);
      $$0.put(a(0, 1), this.b);
      $$0.put(a(0, 2), this.c);
      $$0.put(a(1, 0), this.d);
      $$0.put(a(1, 1), this.e);
      $$0.put(a(1, 2), this.f);
      $$0.put(a(2, 0), this.g);
      $$0.put(a(2, 1), this.h);
      $$0.put(a(2, 2), this.i);
   }

   public void d(FloatBuffer $$0) {
      $$0.put(a(0, 0), this.a);
      $$0.put(a(1, 0), this.b);
      $$0.put(a(2, 0), this.c);
      $$0.put(a(0, 1), this.d);
      $$0.put(a(1, 1), this.e);
      $$0.put(a(2, 1), this.f);
      $$0.put(a(0, 2), this.g);
      $$0.put(a(1, 2), this.h);
      $$0.put(a(2, 2), this.i);
   }

   public void b(FloatBuffer $$0, boolean $$1) {
      if ($$1) {
         this.d($$0);
      } else {
         this.c($$0);
      }

   }

   public void c() {
      this.a = 1.0F;
      this.b = 0.0F;
      this.c = 0.0F;
      this.d = 0.0F;
      this.e = 1.0F;
      this.f = 0.0F;
      this.g = 0.0F;
      this.h = 0.0F;
      this.i = 1.0F;
   }

   public float d() {
      float $$0 = this.e * this.i - this.f * this.h;
      float $$1 = -(this.d * this.i - this.f * this.g);
      float $$2 = this.d * this.h - this.e * this.g;
      float $$3 = -(this.b * this.i - this.c * this.h);
      float $$4 = this.a * this.i - this.c * this.g;
      float $$5 = -(this.a * this.h - this.b * this.g);
      float $$6 = this.b * this.f - this.c * this.e;
      float $$7 = -(this.a * this.f - this.c * this.d);
      float $$8 = this.a * this.e - this.b * this.d;
      float $$9 = this.a * $$0 + this.b * $$1 + this.c * $$2;
      this.a = $$0;
      this.d = $$1;
      this.g = $$2;
      this.b = $$3;
      this.e = $$4;
      this.h = $$5;
      this.c = $$6;
      this.f = $$7;
      this.i = $$8;
      return $$9;
   }

   public float e() {
      float $$0 = this.e * this.i - this.f * this.h;
      float $$1 = -(this.d * this.i - this.f * this.g);
      float $$2 = this.d * this.h - this.e * this.g;
      return this.a * $$0 + this.b * $$1 + this.c * $$2;
   }

   public boolean f() {
      float $$0 = this.d();
      if (Math.abs($$0) > 1.0E-6F) {
         this.a($$0);
         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, float $$2) {
      if ($$0 == 0) {
         if ($$1 == 0) {
            this.a = $$2;
         } else if ($$1 == 1) {
            this.b = $$2;
         } else {
            this.c = $$2;
         }
      } else if ($$0 == 1) {
         if ($$1 == 0) {
            this.d = $$2;
         } else if ($$1 == 1) {
            this.e = $$2;
         } else {
            this.f = $$2;
         }
      } else if ($$1 == 0) {
         this.g = $$2;
      } else if ($$1 == 1) {
         this.h = $$2;
      } else {
         this.i = $$2;
      }

   }

   public void b(c $$0) {
      float $$1 = this.a * $$0.a + this.b * $$0.d + this.c * $$0.g;
      float $$2 = this.a * $$0.b + this.b * $$0.e + this.c * $$0.h;
      float $$3 = this.a * $$0.c + this.b * $$0.f + this.c * $$0.i;
      float $$4 = this.d * $$0.a + this.e * $$0.d + this.f * $$0.g;
      float $$5 = this.d * $$0.b + this.e * $$0.e + this.f * $$0.h;
      float $$6 = this.d * $$0.c + this.e * $$0.f + this.f * $$0.i;
      float $$7 = this.g * $$0.a + this.h * $$0.d + this.i * $$0.g;
      float $$8 = this.g * $$0.b + this.h * $$0.e + this.i * $$0.h;
      float $$9 = this.g * $$0.c + this.h * $$0.f + this.i * $$0.i;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.f = $$6;
      this.g = $$7;
      this.h = $$8;
      this.i = $$9;
   }

   public void a(g $$0) {
      this.b(new c($$0));
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
   }

   public void c(c $$0) {
      this.a += $$0.a;
      this.b += $$0.b;
      this.c += $$0.c;
      this.d += $$0.d;
      this.e += $$0.e;
      this.f += $$0.f;
      this.g += $$0.g;
      this.h += $$0.h;
      this.i += $$0.i;
   }

   public void d(c $$0) {
      this.a -= $$0.a;
      this.b -= $$0.b;
      this.c -= $$0.c;
      this.d -= $$0.d;
      this.e -= $$0.e;
      this.f -= $$0.f;
      this.g -= $$0.g;
      this.h -= $$0.h;
      this.i -= $$0.i;
   }

   public float g() {
      return this.a + this.e + this.i;
   }

   public c h() {
      return new c(this);
   }
}
