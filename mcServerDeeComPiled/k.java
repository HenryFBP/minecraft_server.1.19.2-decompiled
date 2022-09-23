import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class k {
   public static final Codec<k> a = Codec.FLOAT
      .listOf()
      .comapFlatMap($$0 -> ad.a($$0, 3).map($$0x -> new k($$0x.get(0), $$0x.get(1), $$0x.get(2))), $$0 -> ImmutableList.of($$0.i, $$0.j, $$0.k));
   public static k b = new k(-1.0F, 0.0F, 0.0F);
   public static k c = new k(1.0F, 0.0F, 0.0F);
   public static k d = new k(0.0F, -1.0F, 0.0F);
   public static k e = new k(0.0F, 1.0F, 0.0F);
   public static k f = new k(0.0F, 0.0F, -1.0F);
   public static k g = new k(0.0F, 0.0F, 1.0F);
   public static k h = new k(0.0F, 0.0F, 0.0F);
   private float i;
   private float j;
   private float k;

   public k() {
   }

   public k(float $$0, float $$1, float $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   public k(l $$0) {
      this($$0.a(), $$0.b(), $$0.c());
   }

   public k(dwq $$0) {
      this((float)$$0.c, (float)$$0.d, (float)$$0.e);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         k $$1 = (k)$$0;
         if (Float.compare($$1.i, this.i) != 0) {
            return false;
         } else if (Float.compare($$1.j, this.j) != 0) {
            return false;
         } else {
            return Float.compare($$1.k, this.k) == 0;
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      int $$0 = Float.floatToIntBits(this.i);
      $$0 = 31 * $$0 + Float.floatToIntBits(this.j);
      return 31 * $$0 + Float.floatToIntBits(this.k);
   }

   public float a() {
      return this.i;
   }

   public float b() {
      return this.j;
   }

   public float c() {
      return this.k;
   }

   public void a(float $$0) {
      this.i *= $$0;
      this.j *= $$0;
      this.k *= $$0;
   }

   public void a(float $$0, float $$1, float $$2) {
      this.i *= $$0;
      this.j *= $$1;
      this.k *= $$2;
   }

   public void a(k $$0, k $$1) {
      this.i = ami.a(this.i, $$0.a(), $$1.a());
      this.j = ami.a(this.j, $$0.a(), $$1.b());
      this.k = ami.a(this.k, $$0.c(), $$1.c());
   }

   public void a(float $$0, float $$1) {
      this.i = ami.a(this.i, $$0, $$1);
      this.j = ami.a(this.j, $$0, $$1);
      this.k = ami.a(this.k, $$0, $$1);
   }

   public void b(float $$0, float $$1, float $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   public void a(k $$0) {
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
   }

   public void c(float $$0, float $$1, float $$2) {
      this.i += $$0;
      this.j += $$1;
      this.k += $$2;
   }

   public void b(k $$0) {
      this.i += $$0.i;
      this.j += $$0.j;
      this.k += $$0.k;
   }

   public void c(k $$0) {
      this.i -= $$0.i;
      this.j -= $$0.j;
      this.k -= $$0.k;
   }

   public float d(k $$0) {
      return this.i * $$0.i + this.j * $$0.j + this.k * $$0.k;
   }

   public boolean d() {
      float $$0 = this.i * this.i + this.j * this.j + this.k * this.k;
      if ((double)$$0 < 1.0E-5) {
         return false;
      } else {
         float $$1 = ami.i($$0);
         this.i *= $$1;
         this.j *= $$1;
         this.k *= $$1;
         return true;
      }
   }

   public void e(k $$0) {
      float $$1 = this.i;
      float $$2 = this.j;
      float $$3 = this.k;
      float $$4 = $$0.a();
      float $$5 = $$0.b();
      float $$6 = $$0.c();
      this.i = $$2 * $$6 - $$3 * $$5;
      this.j = $$3 * $$4 - $$1 * $$6;
      this.k = $$1 * $$5 - $$2 * $$4;
   }

   public void a(c $$0) {
      float $$1 = this.i;
      float $$2 = this.j;
      float $$3 = this.k;
      this.i = $$0.a * $$1 + $$0.b * $$2 + $$0.c * $$3;
      this.j = $$0.d * $$1 + $$0.e * $$2 + $$0.f * $$3;
      this.k = $$0.g * $$1 + $$0.h * $$2 + $$0.i * $$3;
   }

   public void a(g $$0) {
      g $$1 = new g($$0);
      $$1.a(new g(this.a(), this.b(), this.c(), 0.0F));
      g $$2 = new g($$0);
      $$2.i();
      $$1.a($$2);
      this.b($$1.e(), $$1.f(), $$1.g());
   }

   public void a(k $$0, float $$1) {
      float $$2 = 1.0F - $$1;
      this.i = this.i * $$2 + $$0.i * $$1;
      this.j = this.j * $$2 + $$0.j * $$1;
      this.k = this.k * $$2 + $$0.k * $$1;
   }

   public g b(float $$0) {
      return new g(this, $$0, false);
   }

   public g c(float $$0) {
      return new g(this, $$0, true);
   }

   public k e() {
      return new k(this.i, this.j, this.k);
   }

   public void a(Float2FloatFunction $$0) {
      this.i = $$0.get(this.i);
      this.j = $$0.get(this.j);
      this.k = $$0.get(this.k);
   }

   public String toString() {
      return "[" + this.i + ", " + this.j + ", " + this.k + "]";
   }
}
