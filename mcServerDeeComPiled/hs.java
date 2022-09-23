import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;
import java.util.stream.IntStream;
import javax.annotation.concurrent.Immutable;

@Immutable
public class hs implements Comparable<hs> {
   public static final Codec<hs> f = Codec.INT_STREAM
      .comapFlatMap($$0 -> ad.a($$0, 3).map($$0x -> new hs($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of(new int[]{$$0.u(), $$0.v(), $$0.w()}));
   public static final hs g = new hs(0, 0, 0);
   private int a;
   private int b;
   private int c;

   private static Function<hs, DataResult<hs>> a(int $$0) {
      return $$1 -> Math.abs($$1.u()) < $$0 && Math.abs($$1.v()) < $$0 && Math.abs($$1.w()) < $$0
            ? DataResult.success($$1)
            : DataResult.error("Position out of range, expected at most " + $$0 + ": " + $$1);
   }

   public static Codec<hs> v(int $$0) {
      return f.flatXmap(a($$0), a($$0));
   }

   public hs(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public hs(double $$0, double $$1, double $$2) {
      this(ami.b($$0), ami.b($$1), ami.b($$2));
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof hs)) {
         return false;
      } else {
         hs $$1 = (hs)$$0;
         if (this.u() != $$1.u()) {
            return false;
         } else if (this.v() != $$1.v()) {
            return false;
         } else {
            return this.w() == $$1.w();
         }
      }
   }

   public int hashCode() {
      return (this.v() + this.w() * 31) * 31 + this.u();
   }

   public int i(hs $$0) {
      if (this.v() == $$0.v()) {
         return this.w() == $$0.w() ? this.u() - $$0.u() : this.w() - $$0.w();
      } else {
         return this.v() - $$0.v();
      }
   }

   public int u() {
      return this.a;
   }

   public int v() {
      return this.b;
   }

   public int w() {
      return this.c;
   }

   protected hs u(int $$0) {
      this.a = $$0;
      return this;
   }

   protected hs t(int $$0) {
      this.b = $$0;
      return this;
   }

   protected hs s(int $$0) {
      this.c = $$0;
      return this;
   }

   public hs b(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0 ? this : new hs((double)this.u() + $$0, (double)this.v() + $$1, (double)this.w() + $$2);
   }

   public hs c(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new hs(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public hs f(hs $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   public hs e(hs $$0) {
      return this.c(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public hs o(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? g : new hs(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public hs o() {
      return this.n(1);
   }

   public hs n(int $$0) {
      return this.b(gy.b, $$0);
   }

   public hs n() {
      return this.m(1);
   }

   public hs m(int $$0) {
      return this.b(gy.a, $$0);
   }

   public hs m() {
      return this.l(1);
   }

   public hs l(int $$0) {
      return this.b(gy.c, $$0);
   }

   public hs l() {
      return this.k(1);
   }

   public hs k(int $$0) {
      return this.b(gy.d, $$0);
   }

   public hs k() {
      return this.j(1);
   }

   public hs j(int $$0) {
      return this.b(gy.e, $$0);
   }

   public hs j() {
      return this.i(1);
   }

   public hs i(int $$0) {
      return this.b(gy.f, $$0);
   }

   public hs b(gy $$0) {
      return this.b($$0, 1);
   }

   public hs b(gy $$0, int $$1) {
      return $$1 == 0 ? this : new hs(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public hs b(gy.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == gy.a.a ? $$1 : 0;
         int $$3 = $$0 == gy.a.b ? $$1 : 0;
         int $$4 = $$0 == gy.a.c ? $$1 : 0;
         return new hs(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public hs d(hs $$0) {
      return new hs(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public boolean a(hs $$0, double $$1) {
      return this.j($$0) < ami.m($$1);
   }

   public boolean a(hj $$0, double $$1) {
      return this.b($$0) < ami.m($$1);
   }

   public double j(hs $$0) {
      return this.e((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public double b(hj $$0) {
      return this.d($$0.a(), $$0.b(), $$0.c());
   }

   public double d(double $$0, double $$1, double $$2) {
      double $$3 = (double)this.u() + 0.5 - $$0;
      double $$4 = (double)this.v() + 0.5 - $$1;
      double $$5 = (double)this.w() + 0.5 - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double e(double $$0, double $$1, double $$2) {
      double $$3 = (double)this.u() - $$0;
      double $$4 = (double)this.v() - $$1;
      double $$5 = (double)this.w() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public int k(hs $$0) {
      float $$1 = (float)Math.abs($$0.u() - this.u());
      float $$2 = (float)Math.abs($$0.v() - this.v());
      float $$3 = (float)Math.abs($$0.w() - this.w());
      return (int)($$1 + $$2 + $$3);
   }

   public int a(gy.a $$0) {
      return $$0.a(this.a, this.b, this.c);
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("x", this.u()).add("y", this.v()).add("z", this.w()).toString();
   }

   public String x() {
      return this.u() + ", " + this.v() + ", " + this.w();
   }
}
