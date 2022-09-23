import javax.annotation.Nullable;

public class dqj {
   public final int a;
   public final int b;
   public final int c;
   private final int m;
   public int d = -1;
   public float e;
   public float f;
   public float g;
   @Nullable
   public dqj h;
   public boolean i;
   public float j;
   public float k;
   public dqh l = dqh.a;

   public dqj(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.m = b($$0, $$1, $$2);
   }

   public dqj a(int $$0, int $$1, int $$2) {
      dqj $$3 = new dqj($$0, $$1, $$2);
      $$3.d = this.d;
      $$3.e = this.e;
      $$3.f = this.f;
      $$3.g = this.g;
      $$3.h = this.h;
      $$3.i = this.i;
      $$3.j = this.j;
      $$3.k = this.k;
      $$3.l = this.l;
      return $$3;
   }

   public static int b(int $$0, int $$1, int $$2) {
      return $$1 & 0xFF | ($$0 & 32767) << 8 | ($$2 & 32767) << 24 | ($$0 < 0 ? Integer.MIN_VALUE : 0) | ($$2 < 0 ? 32768 : 0);
   }

   public float a(dqj $$0) {
      float $$1 = (float)($$0.a - this.a);
      float $$2 = (float)($$0.b - this.b);
      float $$3 = (float)($$0.c - this.c);
      return ami.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public float b(dqj $$0) {
      float $$1 = (float)($$0.a - this.a);
      float $$2 = (float)($$0.c - this.c);
      return ami.c($$1 * $$1 + $$2 * $$2);
   }

   public float a(gt $$0) {
      float $$1 = (float)($$0.u() - this.a);
      float $$2 = (float)($$0.v() - this.b);
      float $$3 = (float)($$0.w() - this.c);
      return ami.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public float c(dqj $$0) {
      float $$1 = (float)($$0.a - this.a);
      float $$2 = (float)($$0.b - this.b);
      float $$3 = (float)($$0.c - this.c);
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public float b(gt $$0) {
      float $$1 = (float)($$0.u() - this.a);
      float $$2 = (float)($$0.v() - this.b);
      float $$3 = (float)($$0.w() - this.c);
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public float d(dqj $$0) {
      float $$1 = (float)Math.abs($$0.a - this.a);
      float $$2 = (float)Math.abs($$0.b - this.b);
      float $$3 = (float)Math.abs($$0.c - this.c);
      return $$1 + $$2 + $$3;
   }

   public float c(gt $$0) {
      float $$1 = (float)Math.abs($$0.u() - this.a);
      float $$2 = (float)Math.abs($$0.v() - this.b);
      float $$3 = (float)Math.abs($$0.w() - this.c);
      return $$1 + $$2 + $$3;
   }

   public gt a() {
      return new gt(this.a, this.b, this.c);
   }

   public dwq b() {
      return new dwq((double)this.a, (double)this.b, (double)this.c);
   }

   public boolean equals(Object $$0) {
      if (!($$0 instanceof dqj)) {
         return false;
      } else {
         dqj $$1 = (dqj)$$0;
         return this.m == $$1.m && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
      }
   }

   public int hashCode() {
      return this.m;
   }

   public boolean c() {
      return this.d >= 0;
   }

   public String toString() {
      return "Node{x=" + this.a + ", y=" + this.b + ", z=" + this.c + "}";
   }

   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.writeInt(this.b);
      $$0.writeInt(this.c);
      $$0.writeFloat(this.j);
      $$0.writeFloat(this.k);
      $$0.writeBoolean(this.i);
      $$0.writeInt(this.l.ordinal());
      $$0.writeFloat(this.g);
   }

   public static dqj b(qx $$0) {
      dqj $$1 = new dqj($$0.readInt(), $$0.readInt(), $$0.readInt());
      $$1.j = $$0.readFloat();
      $$1.k = $$0.readFloat();
      $$1.i = $$0.readBoolean();
      $$1.l = dqh.values()[$$0.readInt()];
      $$1.g = $$0.readFloat();
      return $$1;
   }
}
