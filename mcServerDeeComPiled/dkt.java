import com.google.common.base.MoreObjects;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class dkt {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dkt> a = Codec.INT_STREAM
      .comapFlatMap(
         $$0 -> ad.a($$0, 6).map($$0x -> new dkt($$0x[0], $$0x[1], $$0x[2], $$0x[3], $$0x[4], $$0x[5])),
         $$0 -> IntStream.of(new int[]{$$0.c, $$0.d, $$0.e, $$0.f, $$0.g, $$0.h})
      )
      .stable();
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public dkt(gt $$0) {
      this($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
   }

   public dkt(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      if ($$3 < $$0 || $$4 < $$1 || $$5 < $$2) {
         String $$6 = "Invalid bounding box data, inverted bounds for: " + this;
         if (ab.aL) {
            throw new IllegalStateException($$6);
         }

         b.error($$6);
         this.c = Math.min($$0, $$3);
         this.d = Math.min($$1, $$4);
         this.e = Math.min($$2, $$5);
         this.f = Math.max($$0, $$3);
         this.g = Math.max($$1, $$4);
         this.h = Math.max($$2, $$5);
      }

   }

   public static dkt a(hs $$0, hs $$1) {
      return new dkt(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static dkt a() {
      return new dkt(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public static dkt a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, gy $$9) {
      switch($$9) {
         case d:
         default:
            return new dkt($$0 + $$3, $$1 + $$4, $$2 + $$5, $$0 + $$6 - 1 + $$3, $$1 + $$7 - 1 + $$4, $$2 + $$8 - 1 + $$5);
         case c:
            return new dkt($$0 + $$3, $$1 + $$4, $$2 - $$8 + 1 + $$5, $$0 + $$6 - 1 + $$3, $$1 + $$7 - 1 + $$4, $$2 + $$5);
         case e:
            return new dkt($$0 - $$8 + 1 + $$5, $$1 + $$4, $$2 + $$3, $$0 + $$5, $$1 + $$7 - 1 + $$4, $$2 + $$6 - 1 + $$3);
         case f:
            return new dkt($$0 + $$5, $$1 + $$4, $$2 + $$3, $$0 + $$8 - 1 + $$5, $$1 + $$7 - 1 + $$4, $$2 + $$6 - 1 + $$3);
      }
   }

   public boolean a(dkt $$0) {
      return this.f >= $$0.c && this.c <= $$0.f && this.h >= $$0.e && this.e <= $$0.h && this.g >= $$0.d && this.d <= $$0.g;
   }

   public boolean a(int $$0, int $$1, int $$2, int $$3) {
      return this.f >= $$0 && this.c <= $$2 && this.h >= $$1 && this.e <= $$3;
   }

   public static Optional<dkt> a(Iterable<gt> $$0) {
      Iterator<gt> $$1 = $$0.iterator();
      if (!$$1.hasNext()) {
         return Optional.empty();
      } else {
         dkt $$2 = new dkt((gt)$$1.next());
         $$1.forEachRemaining($$2::a);
         return Optional.of($$2);
      }
   }

   public static Optional<dkt> b(Iterable<dkt> $$0) {
      Iterator<dkt> $$1 = $$0.iterator();
      if (!$$1.hasNext()) {
         return Optional.empty();
      } else {
         dkt $$2 = (dkt)$$1.next();
         dkt $$3 = new dkt($$2.c, $$2.d, $$2.e, $$2.f, $$2.g, $$2.h);
         $$1.forEachRemaining($$3::b);
         return Optional.of($$3);
      }
   }

   @Deprecated
   public dkt b(dkt $$0) {
      this.c = Math.min(this.c, $$0.c);
      this.d = Math.min(this.d, $$0.d);
      this.e = Math.min(this.e, $$0.e);
      this.f = Math.max(this.f, $$0.f);
      this.g = Math.max(this.g, $$0.g);
      this.h = Math.max(this.h, $$0.h);
      return this;
   }

   @Deprecated
   public dkt a(gt $$0) {
      this.c = Math.min(this.c, $$0.u());
      this.d = Math.min(this.d, $$0.v());
      this.e = Math.min(this.e, $$0.w());
      this.f = Math.max(this.f, $$0.u());
      this.g = Math.max(this.g, $$0.v());
      this.h = Math.max(this.h, $$0.w());
      return this;
   }

   @Deprecated
   public dkt a(int $$0, int $$1, int $$2) {
      this.c += $$0;
      this.d += $$1;
      this.e += $$2;
      this.f += $$0;
      this.g += $$1;
      this.h += $$2;
      return this;
   }

   @Deprecated
   public dkt a(hs $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public dkt b(int $$0, int $$1, int $$2) {
      return new dkt(this.c + $$0, this.d + $$1, this.e + $$2, this.f + $$0, this.g + $$1, this.h + $$2);
   }

   public dkt a(int $$0) {
      return new dkt(this.g() - $$0, this.h() - $$0, this.i() - $$0, this.j() + $$0, this.k() + $$0, this.l() + $$0);
   }

   public boolean b(hs $$0) {
      return $$0.u() >= this.c && $$0.u() <= this.f && $$0.w() >= this.e && $$0.w() <= this.h && $$0.v() >= this.d && $$0.v() <= this.g;
   }

   public hs b() {
      return new hs(this.f - this.c, this.g - this.d, this.h - this.e);
   }

   public int c() {
      return this.f - this.c + 1;
   }

   public int d() {
      return this.g - this.d + 1;
   }

   public int e() {
      return this.h - this.e + 1;
   }

   public gt f() {
      return new gt(this.c + (this.f - this.c + 1) / 2, this.d + (this.g - this.d + 1) / 2, this.e + (this.h - this.e + 1) / 2);
   }

   public void a(Consumer<gt> $$0) {
      gt.a $$1 = new gt.a();
      $$0.accept($$1.d(this.f, this.g, this.h));
      $$0.accept($$1.d(this.c, this.g, this.h));
      $$0.accept($$1.d(this.f, this.d, this.h));
      $$0.accept($$1.d(this.c, this.d, this.h));
      $$0.accept($$1.d(this.f, this.g, this.e));
      $$0.accept($$1.d(this.c, this.g, this.e));
      $$0.accept($$1.d(this.f, this.d, this.e));
      $$0.accept($$1.d(this.c, this.d, this.e));
   }

   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("minX", this.c)
         .add("minY", this.d)
         .add("minZ", this.e)
         .add("maxX", this.f)
         .add("maxY", this.g)
         .add("maxZ", this.h)
         .toString();
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof dkt)) {
         return false;
      } else {
         dkt $$1 = (dkt)$$0;
         return this.c == $$1.c && this.d == $$1.d && this.e == $$1.e && this.f == $$1.f && this.g == $$1.g && this.h == $$1.h;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.c, this.d, this.e, this.f, this.g, this.h});
   }

   public int g() {
      return this.c;
   }

   public int h() {
      return this.d;
   }

   public int i() {
      return this.e;
   }

   public int j() {
      return this.f;
   }

   public int k() {
      return this.g;
   }

   public int l() {
      return this.h;
   }
}
