import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum gy implements amw {
   a(0, 1, -1, "down", gy.b.b, gy.a.b, new hs(0, -1, 0)),
   b(1, 0, -1, "up", gy.b.a, gy.a.b, new hs(0, 1, 0)),
   c(2, 3, 2, "north", gy.b.b, gy.a.c, new hs(0, 0, -1)),
   d(3, 2, 0, "south", gy.b.a, gy.a.c, new hs(0, 0, 1)),
   e(4, 5, 1, "west", gy.b.b, gy.a.a, new hs(-1, 0, 0)),
   f(5, 4, 3, "east", gy.b.a, gy.a.a, new hs(1, 0, 0));

   public static final amw.a<gy> g = amw.a(gy::values);
   public static final Codec<gy> h = g.flatXmap(gy::a, gy::a);
   private final int i;
   private final int j;
   private final int k;
   private final String l;
   private final gy.a m;
   private final gy.b n;
   private final hs o;
   private static final gy[] p = values();
   private static final gy[] q = (gy[])Arrays.stream(p).sorted(Comparator.comparingInt($$0 -> $$0.i)).toArray($$0 -> new gy[$$0]);
   private static final gy[] r = (gy[])Arrays.stream(p).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.k)).toArray($$0 -> new gy[$$0]);
   private static final Long2ObjectMap<gy> s = (Long2ObjectMap<gy>)Arrays.stream(p)
      .collect(Collectors.toMap($$0 -> new gt($$0.q()).a(), $$0 -> $$0, ($$0, $$1) -> {
         throw new IllegalArgumentException("Duplicate keys");
      }, Long2ObjectOpenHashMap::new));

   private gy(int $$0, int $$1, int $$2, String $$3, gy.b $$4, gy.a $$5, hs $$6) {
      this.i = $$0;
      this.k = $$2;
      this.j = $$1;
      this.l = $$3;
      this.m = $$5;
      this.n = $$4;
      this.o = $$6;
   }

   public static gy[] a(bbn $$0) {
      float $$1 = $$0.f(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.g(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = ami.a($$1);
      float $$4 = ami.b($$1);
      float $$5 = ami.a($$2);
      float $$6 = ami.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      gy $$15 = $$7 ? f : e;
      gy $$16 = $$8 ? b : a;
      gy $$17 = $$9 ? d : c;
      if ($$10 > $$12) {
         if ($$11 > $$13) {
            return a($$16, $$15, $$17);
         } else {
            return $$14 > $$11 ? a($$15, $$17, $$16) : a($$15, $$16, $$17);
         }
      } else if ($$11 > $$14) {
         return a($$16, $$17, $$15);
      } else {
         return $$13 > $$11 ? a($$17, $$15, $$16) : a($$17, $$16, $$15);
      }
   }

   private static gy[] a(gy $$0, gy $$1, gy $$2) {
      return new gy[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static gy a(d $$0, gy $$1) {
      hs $$2 = $$1.q();
      l $$3 = new l((float)$$2.u(), (float)$$2.v(), (float)$$2.w(), 0.0F);
      $$3.a($$0);
      return a($$3.a(), $$3.b(), $$3.c());
   }

   public static Collection<gy> a(amn $$0) {
      return ad.<gy>b(values(), $$0);
   }

   public static Stream<gy> a() {
      return Stream.of(p);
   }

   public g b() {
      g $$0 = k.c.c(90.0F);

      return switch(this) {
         case a -> k.c.c(180.0F);
         case b -> g.a.k();
         case c -> {
            $$0.a(k.g.c(180.0F));
            yield $$0;
         }
         case d -> $$0;
         case e -> {
            $$0.a(k.g.c(90.0F));
            yield $$0;
         }
         case f -> {
            $$0.a(k.g.c(-90.0F));
            yield $$0;
         }
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public int d() {
      return this.i;
   }

   public int e() {
      return this.k;
   }

   public gy.b f() {
      return this.n;
   }

   public static gy a(bbn $$0, gy.a $$1) {
      return switch($$1) {
         case a -> f.a($$0.g(1.0F)) ? f : e;
         case c -> d.a($$0.g(1.0F)) ? d : c;
         case b -> $$0.f(1.0F) < 0.0F ? b : a;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public gy g() {
      return a(this.j);
   }

   public gy a(gy.a $$0) {
      return switch($$0) {
         case a -> this != e && this != f ? this.r() : this;
         case c -> this != c && this != d ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public gy b(gy.a $$0) {
      return switch($$0) {
         case a -> this != e && this != f ? this.s() : this;
         case c -> this != c && this != d ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public gy h() {
      return switch(this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private gy r() {
      return switch(this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private gy s() {
      return switch(this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private gy t() {
      return switch(this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private gy u() {
      return switch(this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public gy i() {
      return switch(this) {
         case c -> e;
         case d -> f;
         case e -> d;
         case f -> c;
         default -> throw new IllegalStateException("Unable to get CCW facing of " + this);
      };
   }

   public int j() {
      return this.o.u();
   }

   public int k() {
      return this.o.v();
   }

   public int l() {
      return this.o.w();
   }

   public k m() {
      return new k((float)this.j(), (float)this.k(), (float)this.l());
   }

   public String n() {
      return this.l;
   }

   public gy.a o() {
      return this.m;
   }

   @Nullable
   public static gy a(@Nullable String $$0) {
      return (gy)g.a($$0);
   }

   public static gy a(int $$0) {
      return q[ami.a($$0 % q.length)];
   }

   public static gy b(int $$0) {
      return r[ami.a($$0 % r.length)];
   }

   @Nullable
   public static gy a(gt $$0) {
      return (gy)s.get($$0.a());
   }

   @Nullable
   public static gy a(int $$0, int $$1, int $$2) {
      return (gy)s.get(gt.a($$0, $$1, $$2));
   }

   public static gy a(double $$0) {
      return b(ami.b($$0 / 90.0 + 0.5) & 3);
   }

   public static gy a(gy.a $$0, gy.b $$1) {
      return switch($$0) {
         case a -> $$1 == gy.b.a ? f : e;
         case c -> $$1 == gy.b.a ? d : c;
         case b -> $$1 == gy.b.a ? b : a;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public float p() {
      return (float)((this.k & 3) * 90);
   }

   public static gy b(amn $$0) {
      return ad.a(p, $$0);
   }

   public static gy a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static gy a(float $$0, float $$1, float $$2) {
      gy $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for(gy $$5 : p) {
         float $$6 = $$0 * (float)$$5.o.u() + $$1 * (float)$$5.o.v() + $$2 * (float)$$5.o.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public String toString() {
      return this.l;
   }

   @Override
   public String c() {
      return this.l;
   }

   private static DataResult<gy> a(gy $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error("Expected a vertical direction");
   }

   public static gy a(gy.b $$0, gy.a $$1) {
      for(gy $$2 : p) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public hs q() {
      return this.o;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -ami.a($$1);
      float $$3 = ami.b($$1);
      return (float)this.o.u() * $$2 + (float)this.o.w() * $$3 > 0.0F;
   }

   public static enum a implements amw, Predicate<gy> {
      a("x") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$0;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$0;
         }
      },
      b("y") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$1;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$1;
         }
      },
      c("z") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$2;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$2;
         }
      };

      public static final gy.a[] d = values();
      public static final amw.a<gy.a> e = amw.a(gy.a::values);
      private final String f;

      a(String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static gy.a a(String $$0) {
         return (gy.a)e.a($$0);
      }

      public String a() {
         return this.f;
      }

      public boolean b() {
         return this == b;
      }

      public boolean d() {
         return this == a || this == c;
      }

      public String toString() {
         return this.f;
      }

      public static gy.a a(amn $$0) {
         return ad.a(d, $$0);
      }

      public boolean a(@Nullable gy $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public gy.c e() {
         return switch(this) {
            case a, c -> gy.c.a;
            case b -> gy.c.b;
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public String c() {
         return this.f;
      }

      public abstract int a(int var1, int var2, int var3);

      public abstract double a(double var1, double var3, double var5);
   }

   public static enum b {
      a(1, "Towards positive"),
      b(-1, "Towards negative");

      private final int c;
      private final String d;

      private b(int $$0, String $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public int a() {
         return this.c;
      }

      public String b() {
         return this.d;
      }

      public String toString() {
         return this.d;
      }

      public gy.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<gy>, Predicate<gy> {
      a(new gy[]{gy.c, gy.f, gy.d, gy.e}, new gy.a[]{gy.a.a, gy.a.c}),
      b(new gy[]{gy.b, gy.a}, new gy.a[]{gy.a.b});

      private final gy[] c;
      private final gy.a[] d;

      private c(gy[] $$0, gy.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public gy a(amn $$0) {
         return ad.a(this.c, $$0);
      }

      public gy.a b(amn $$0) {
         return ad.a(this.d, $$0);
      }

      public boolean a(@Nullable gy $$0) {
         return $$0 != null && $$0.o().e() == this;
      }

      public Iterator<gy> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<gy> a() {
         return Arrays.stream(this.c);
      }

      public List<gy> c(amn $$0) {
         return ad.b(this.c, $$0);
      }
   }
}
