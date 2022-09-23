import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;

public class dwq implements hj {
   public static final Codec<dwq> a = Codec.DOUBLE
      .listOf()
      .comapFlatMap($$0 -> ad.a($$0, 3).map($$0x -> new dwq($$0x.get(0), $$0x.get(1), $$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c()));
   public static final dwq b = new dwq(0.0, 0.0, 0.0);
   public final double c;
   public final double d;
   public final double e;

   public static dwq a(int $$0) {
      double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
      double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
      double $$3 = (double)($$0 & 0xFF) / 255.0;
      return new dwq($$1, $$2, $$3);
   }

   public static dwq a(hs $$0) {
      return new dwq((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5);
   }

   public static dwq b(hs $$0) {
      return new dwq((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public static dwq c(hs $$0) {
      return new dwq((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5);
   }

   public static dwq a(hs $$0, double $$1) {
      return new dwq((double)$$0.u() + 0.5, (double)$$0.v() + $$1, (double)$$0.w() + 0.5);
   }

   public dwq(double $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public dwq(k $$0) {
      this((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
   }

   public dwq a(dwq $$0) {
      return new dwq($$0.c - this.c, $$0.d - this.d, $$0.e - this.e);
   }

   public dwq d() {
      double $$0 = Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
      return $$0 < 1.0E-4 ? b : new dwq(this.c / $$0, this.d / $$0, this.e / $$0);
   }

   public double b(dwq $$0) {
      return this.c * $$0.c + this.d * $$0.d + this.e * $$0.e;
   }

   public dwq c(dwq $$0) {
      return new dwq(this.d * $$0.e - this.e * $$0.d, this.e * $$0.c - this.c * $$0.e, this.c * $$0.d - this.d * $$0.c);
   }

   public dwq d(dwq $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public dwq a(double $$0, double $$1, double $$2) {
      return this.b(-$$0, -$$1, -$$2);
   }

   public dwq e(dwq $$0) {
      return this.b($$0.c, $$0.d, $$0.e);
   }

   public dwq b(double $$0, double $$1, double $$2) {
      return new dwq(this.c + $$0, this.d + $$1, this.e + $$2);
   }

   public boolean a(hj $$0, double $$1) {
      return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
   }

   public double f(dwq $$0) {
      double $$1 = $$0.c - this.c;
      double $$2 = $$0.d - this.d;
      double $$3 = $$0.e - this.e;
      return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double g(dwq $$0) {
      double $$1 = $$0.c - this.c;
      double $$2 = $$0.d - this.d;
      double $$3 = $$0.e - this.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public double c(double $$0, double $$1, double $$2) {
      double $$3 = $$0 - this.c;
      double $$4 = $$1 - this.d;
      double $$5 = $$2 - this.e;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public dwq a(double $$0) {
      return this.d($$0, $$0, $$0);
   }

   public dwq e() {
      return this.a(-1.0);
   }

   public dwq h(dwq $$0) {
      return this.d($$0.c, $$0.d, $$0.e);
   }

   public dwq d(double $$0, double $$1, double $$2) {
      return new dwq(this.c * $$0, this.d * $$1, this.e * $$2);
   }

   public double f() {
      return Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
   }

   public double g() {
      return this.c * this.c + this.d * this.d + this.e * this.e;
   }

   public double h() {
      return Math.sqrt(this.c * this.c + this.e * this.e);
   }

   public double i() {
      return this.c * this.c + this.e * this.e;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof dwq)) {
         return false;
      } else {
         dwq $$1 = (dwq)$$0;
         if (Double.compare($$1.c, this.c) != 0) {
            return false;
         } else if (Double.compare($$1.d, this.d) != 0) {
            return false;
         } else {
            return Double.compare($$1.e, this.e) == 0;
         }
      }
   }

   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.c);
      int $$1 = (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.d);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.e);
      return 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
   }

   public String toString() {
      return "(" + this.c + ", " + this.d + ", " + this.e + ")";
   }

   public dwq a(dwq $$0, double $$1) {
      return new dwq(ami.d($$1, this.c, $$0.c), ami.d($$1, this.d, $$0.d), ami.d($$1, this.e, $$0.e));
   }

   public dwq a(float $$0) {
      float $$1 = ami.b($$0);
      float $$2 = ami.a($$0);
      double $$3 = this.c;
      double $$4 = this.d * (double)$$1 + this.e * (double)$$2;
      double $$5 = this.e * (double)$$1 - this.d * (double)$$2;
      return new dwq($$3, $$4, $$5);
   }

   public dwq b(float $$0) {
      float $$1 = ami.b($$0);
      float $$2 = ami.a($$0);
      double $$3 = this.c * (double)$$1 + this.e * (double)$$2;
      double $$4 = this.d;
      double $$5 = this.e * (double)$$1 - this.c * (double)$$2;
      return new dwq($$3, $$4, $$5);
   }

   public dwq c(float $$0) {
      float $$1 = ami.b($$0);
      float $$2 = ami.a($$0);
      double $$3 = this.c * (double)$$1 + this.d * (double)$$2;
      double $$4 = this.d * (double)$$1 - this.c * (double)$$2;
      double $$5 = this.e;
      return new dwq($$3, $$4, $$5);
   }

   public static dwq a(dwp $$0) {
      return a($$0.i, $$0.j);
   }

   public static dwq a(float $$0, float $$1) {
      float $$2 = ami.b(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$3 = ami.a(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$4 = -ami.b(-$$0 * (float) (Math.PI / 180.0));
      float $$5 = ami.a(-$$0 * (float) (Math.PI / 180.0));
      return new dwq((double)($$3 * $$4), (double)$$5, (double)($$2 * $$4));
   }

   public dwq a(EnumSet<gy.a> $$0) {
      double $$1 = $$0.contains(gy.a.a) ? (double)ami.b(this.c) : this.c;
      double $$2 = $$0.contains(gy.a.b) ? (double)ami.b(this.d) : this.d;
      double $$3 = $$0.contains(gy.a.c) ? (double)ami.b(this.e) : this.e;
      return new dwq($$1, $$2, $$3);
   }

   public double a(gy.a $$0) {
      return $$0.a(this.c, this.d, this.e);
   }

   public dwq a(gy.a $$0, double $$1) {
      double $$2 = $$0 == gy.a.a ? $$1 : this.c;
      double $$3 = $$0 == gy.a.b ? $$1 : this.d;
      double $$4 = $$0 == gy.a.c ? $$1 : this.e;
      return new dwq($$2, $$3, $$4);
   }

   public dwq a(gy $$0, double $$1) {
      hs $$2 = $$0.q();
      return new dwq(this.c + $$1 * (double)$$2.u(), this.d + $$1 * (double)$$2.v(), this.e + $$1 * (double)$$2.w());
   }

   @Override
   public final double a() {
      return this.c;
   }

   @Override
   public final double b() {
      return this.d;
   }

   @Override
   public final double c() {
      return this.e;
   }
}
