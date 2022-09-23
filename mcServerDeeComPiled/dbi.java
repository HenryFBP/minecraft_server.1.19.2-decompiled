import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dbi {
   public static final dbi.f a = a(0, false, djx.b);
   public static final dbi.f b = a(0, true, djx.b);
   public static final dbi.f c = a(0, true, 6, djx.b);
   public static final dbi.f d = a(0, true, 30, djx.b);
   public static final dbi.f e = a(0, false, djx.a);
   public static final dbi.f f = a(0, true, djx.a);

   public static dbi.f a(int $$0, boolean $$1, djx $$2) {
      return new dbi.t($$0, $$1, 0, $$2);
   }

   public static dbi.f a(int $$0, boolean $$1, int $$2, djx $$3) {
      return new dbi.t($$0, $$1, $$2, $$3);
   }

   public static dbi.f a(dbi.f $$0) {
      return new dbi.n($$0);
   }

   public static dbi.f a(dbl $$0, int $$1) {
      return new dbi.aa($$0, $$1, false);
   }

   public static dbi.f b(dbl $$0, int $$1) {
      return new dbi.aa($$0, $$1, true);
   }

   public static dbi.f a(int $$0, int $$1) {
      return new dbi.z($$0, $$1, false);
   }

   public static dbi.f b(int $$0, int $$1) {
      return new dbi.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dbi.f a(aba<cht>... $$0) {
      return a(List.of($$0));
   }

   private static dbi.c a(List<aba<cht>> $$0) {
      return new dbi.c($$0);
   }

   public static dbi.f a(aba<dpa.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dbi.f a(aba<dpa.a> $$0, double $$1, double $$2) {
      return new dbi.l($$0, $$1, $$2);
   }

   public static dbi.f a(String $$0, dbl $$1, dbl $$2) {
      return new dbi.y(new abb($$0), $$1, $$2);
   }

   public static dbi.f a() {
      return dbi.s.a;
   }

   public static dbi.f b() {
      return dbi.h.a;
   }

   public static dbi.f c() {
      return dbi.a.a;
   }

   public static dbi.f d() {
      return dbi.v.a;
   }

   public static dbi.o a(dbi.f $$0, dbi.o $$1) {
      return new dbi.x($$0, $$1);
   }

   public static dbi.o a(dbi.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dbi.q(Arrays.asList($$0));
      }
   }

   public static dbi.o a(cvo $$0) {
      return new dbi.d($$0);
   }

   public static dbi.o e() {
      return dbi.b.a;
   }

   static <A> Codec<? extends A> a(hm<Codec<? extends A>> $$0, String $$1, amc<? extends A> $$2) {
      return hm.a($$0, $$1, $$2.a());
   }

   static enum a implements dbi.f {
      a;

      static final amc<dbi.a> c = amc.a(MapCodec.unit(a));

      @Override
      public amc<? extends dbi.f> a() {
         return c;
      }

      public dbi.e a(dbi.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dbl a, int c, boolean d) implements dbi.f {
      final dbl a;
      final int c;
      final boolean d;
      static final amc<dbi.aa> e = amc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dbl.a.fieldOf("anchor").forGetter(dbi.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dbi.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dbi.aa::d)
                  )
                  .apply($$0, dbi.aa::new)
         )
      );

      @Override
      public amc<? extends dbi.f> a() {
         return e;
      }

      public dbi.e a(final dbi.g $$0) {
         class a extends dbi.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return this.c.B + (aa.this.d ? this.c.E : 0) >= aa.this.a.a(this.c.n) + this.c.t * aa.this.c;
            }
         }

         return new a();
      }

      public dbl b() {
         return this.a;
      }
   }

   static enum b implements dbi.o {
      a;

      static final amc<dbi.b> c = amc.a(MapCodec.unit(a));

      @Override
      public amc<? extends dbi.o> a() {
         return c;
      }

      public dbi.u a(dbi.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dbi.f {
      static final amc<dbi.c> a = amc.a(aba.a(hm.aR).listOf().fieldOf("biome_is").xmap(dbi::a, $$0 -> $$0.c));
      private final List<aba<cht>> c;
      final Predicate<aba<cht>> d;

      c(List<aba<cht>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public amc<? extends dbi.f> a() {
         return a;
      }

      public dbi.e a(final dbi.g $$0) {
         class a extends dbi.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return ((hc)this.c.A.get()).a(c.this.d);
            }
         }

         return new a();
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof dbi.c $$1 ? this.c.equals($$1.c) : false;
         }
      }

      public int hashCode() {
         return this.c.hashCode();
      }

      public String toString() {
         return "BiomeConditionSource[biomes=" + this.c + "]";
      }
   }

   static record d(cvo a, dbi.r c) implements dbi.o {
      static final amc<dbi.d> d = amc.a(cvo.b.xmap(dbi.d::new, dbi.d::b).fieldOf("result_state"));

      d(cvo $$0) {
         this($$0, new dbi.r($$0));
      }

      @Override
      public amc<? extends dbi.o> a() {
         return d;
      }

      public dbi.u a(dbi.g $$0) {
         return this.c;
      }

      public cvo b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dbi.g, dbi.e> {
      Codec<dbi.f> b = hm.bD.p().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dbi.f> a(hm<Codec<? extends dbi.f>> $$0) {
         dbi.a($$0, "biome", dbi.c.a);
         dbi.a($$0, "noise_threshold", dbi.l.e);
         dbi.a($$0, "vertical_gradient", dbi.y.e);
         dbi.a($$0, "y_above", dbi.aa.e);
         dbi.a($$0, "water", dbi.z.e);
         dbi.a($$0, "temperature", dbi.v.c);
         dbi.a($$0, "steep", dbi.s.c);
         dbi.a($$0, "not", dbi.n.c);
         dbi.a($$0, "hole", dbi.h.c);
         dbi.a($$0, "above_preliminary_surface", dbi.a.c);
         return dbi.a($$0, "stone_depth", dbi.t.f);
      }

      amc<? extends dbi.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dbj e;
      final dbi.e f = new dbi.g.d(this);
      final dbi.e g = new dbi.g.c(this);
      final dbi.e h = new dbi.g.b(this);
      final dbi.e i = new dbi.g.a();
      final dbf j;
      final cxj k;
      private final dav l;
      private final Function<gt, hc<cht>> m;
      final dbn n;
      private long o = Long.MAX_VALUE;
      private final int[] p = new int[4];
      long q = -9223372036854775807L;
      int r;
      int s;
      int t;
      private long u = this.q - 1L;
      private double v;
      private long w = this.q - 1L;
      private int x;
      long y = -9223372036854775807L;
      final gt.a z = new gt.a();
      Supplier<hc<cht>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dbj $$0, dbf $$1, cxj $$2, dav $$3, Function<gt, hc<cht>> $$4, hm<cht> $$5, dbn $$6) {
         this.e = $$0;
         this.j = $$1;
         this.k = $$2;
         this.l = $$3;
         this.m = $$4;
         this.n = $$6;
      }

      protected void a(int $$0, int $$1) {
         ++this.q;
         ++this.y;
         this.r = $$0;
         this.s = $$1;
         this.t = this.e.a($$0, $$1);
      }

      protected void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
         ++this.y;
         this.A = Suppliers.memoize(() -> (hc)this.m.apply(this.z.d($$3, $$4, $$5)));
         this.B = $$4;
         this.C = $$2;
         this.D = $$1;
         this.E = $$0;
      }

      protected double a() {
         if (this.u != this.q) {
            this.u = this.q;
            this.v = this.e.b(this.r, this.s);
         }

         return this.v;
      }

      private static int a(int $$0) {
         return $$0 >> 4;
      }

      private static int b(int $$0) {
         return $$0 << 4;
      }

      protected int b() {
         if (this.w != this.q) {
            this.w = this.q;
            int $$0 = a(this.r);
            int $$1 = a(this.s);
            long $$2 = cge.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ami.b(
               ami.a(
                  (double)((float)(this.r & 15) / 16.0F),
                  (double)((float)(this.s & 15) / 16.0F),
                  (double)this.p[0],
                  (double)this.p[1],
                  (double)this.p[2],
                  (double)this.p[3]
               )
            );
            this.x = $$3 + this.t - 8;
         }

         return this.x;
      }

      final class a implements dbi.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dbi.j {
         b(dbi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dbi.j {
         c(dbi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            cxj $$4 = this.c.k;
            int $$5 = $$4.a(dar.a.a, $$0, $$2);
            int $$6 = $$4.a(dar.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dar.a.a, $$7, $$1);
               int $$10 = $$4.a(dar.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dbi.k {
         d(dbi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return ((cht)((hc)this.c.A.get()).a()).a(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dbi.f {
      a;

      static final amc<dbi.h> c = amc.a(MapCodec.unit(a));

      @Override
      public amc<? extends dbi.f> a() {
         return c;
      }

      public dbi.e a(dbi.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dbi.e {
      protected final dbi.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dbi.g $$0) {
         this.c = $$0;
         this.a = this.c() - 1L;
      }

      @Override
      public boolean b() {
         long $$0 = this.c();
         if ($$0 == this.a) {
            if (this.d == null) {
               throw new IllegalStateException("Update triggered but the result is null");
            } else {
               return this.d;
            }
         } else {
            this.a = $$0;
            this.d = this.a();
            return this.d;
         }
      }

      protected abstract long c();

      protected abstract boolean a();
   }

   abstract static class j extends dbi.i {
      protected j(dbi.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dbi.i {
      protected k(dbi.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aba<dpa.a> a, double c, double d) implements dbi.f {
      final double c;
      final double d;
      static final amc<dbi.l> e = amc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aba.a(hm.aS).fieldOf("noise").forGetter(dbi.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dbi.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dbi.l::d)
                  )
                  .apply($$0, dbi.l::new)
         )
      );

      @Override
      public amc<? extends dbi.f> a() {
         return e;
      }

      public dbi.e a(final dbi.g $$0) {
         final dpa $$1 = $$0.j.a(this.a);

         class a extends dbi.j {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               double $$0 = $$1.a((double)this.c.r, 0.0, (double)this.c.s);
               return $$0 >= l.this.c && $$0 <= l.this.d;
            }
         }

         return new a();
      }

      public aba<dpa.a> b() {
         return this.a;
      }
   }

   static record m(dbi.e a) implements dbi.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dbi.f a) implements dbi.f {
      static final amc<dbi.n> c = amc.a(dbi.f.b.xmap(dbi.n::new, dbi.n::b).fieldOf("invert"));

      @Override
      public amc<? extends dbi.f> a() {
         return c;
      }

      public dbi.e a(dbi.g $$0) {
         return new dbi.m((dbi.e)this.a.apply($$0));
      }

      public dbi.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dbi.g, dbi.u> {
      Codec<dbi.o> b = hm.bE.p().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dbi.o> a(hm<Codec<? extends dbi.o>> $$0) {
         dbi.a($$0, "bandlands", dbi.b.c);
         dbi.a($$0, "block", dbi.d.d);
         dbi.a($$0, "sequence", dbi.q.c);
         return dbi.a($$0, "condition", dbi.x.d);
      }

      amc<? extends dbi.o> a();
   }

   static record p(List<dbi.u> a) implements dbi.u {
      @Nullable
      @Override
      public cvo tryApply(int $$0, int $$1, int $$2) {
         for(dbi.u $$3 : this.a) {
            cvo $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dbi.o> a) implements dbi.o {
      static final amc<dbi.q> c = amc.a(dbi.o.b.listOf().xmap(dbi.q::new, dbi.q::b).fieldOf("sequence"));

      @Override
      public amc<? extends dbi.o> a() {
         return c;
      }

      public dbi.u a(dbi.g $$0) {
         if (this.a.size() == 1) {
            return (dbi.u)((dbi.o)this.a.get(0)).apply($$0);
         } else {
            Builder<dbi.u> $$1 = ImmutableList.builder();

            for(dbi.o $$2 : this.a) {
               $$1.add((dbi.u)$$2.apply($$0));
            }

            return new dbi.p($$1.build());
         }
      }

      public List<dbi.o> b() {
         return this.a;
      }
   }

   static record r(cvo a) implements dbi.u {
      @Override
      public cvo tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dbi.f {
      a;

      static final amc<dbi.s> c = amc.a(MapCodec.unit(a));

      @Override
      public amc<? extends dbi.f> a() {
         return c;
      }

      public dbi.e a(dbi.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, djx e) implements dbi.f {
      final int a;
      final boolean c;
      final int d;
      static final amc<dbi.t> f = amc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dbi.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dbi.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dbi.t::d),
                     djx.c.fieldOf("surface_type").forGetter(dbi.t::e)
                  )
                  .apply($$0, dbi.t::new)
         )
      );

      @Override
      public amc<? extends dbi.f> a() {
         return f;
      }

      public dbi.e a(final dbi.g $$0) {
         final boolean $$1 = this.e == djx.a;

         class a extends dbi.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ami.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
               return $$0 <= 1 + t.this.a + $$1 + $$2;
            }
         }

         return new a();
      }

      public int b() {
         return this.a;
      }
   }

   protected interface u {
      @Nullable
      cvo tryApply(int var1, int var2, int var3);
   }

   static enum v implements dbi.f {
      a;

      static final amc<dbi.v> c = amc.a(MapCodec.unit(a));

      @Override
      public amc<? extends dbi.f> a() {
         return c;
      }

      public dbi.e a(dbi.g $$0) {
         return $$0.f;
      }
   }

   static record w(dbi.e a, dbi.u b) implements dbi.u {
      @Nullable
      @Override
      public cvo tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dbi.f a, dbi.o c) implements dbi.o {
      static final amc<dbi.x> d = amc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dbi.f.b.fieldOf("if_true").forGetter(dbi.x::b), dbi.o.b.fieldOf("then_run").forGetter(dbi.x::c)).apply($$0, dbi.x::new)
         )
      );

      @Override
      public amc<? extends dbi.o> a() {
         return d;
      }

      public dbi.u a(dbi.g $$0) {
         return new dbi.w((dbi.e)this.a.apply($$0), (dbi.u)this.c.apply($$0));
      }

      public dbi.f b() {
         return this.a;
      }
   }

   static record y(abb a, dbl c, dbl d) implements dbi.f {
      static final amc<dbi.y> e = amc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     abb.a.fieldOf("random_name").forGetter(dbi.y::b),
                     dbl.a.fieldOf("true_at_and_below").forGetter(dbi.y::c),
                     dbl.a.fieldOf("false_at_and_above").forGetter(dbi.y::d)
                  )
                  .apply($$0, dbi.y::new)
         )
      );

      @Override
      public amc<? extends dbi.f> a() {
         return e;
      }

      public dbi.e a(final dbi.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dbe $$3 = $$0.j.a(this.b());

         class a extends dbi.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = this.c.B;
               if ($$0 <= $$1) {
                  return true;
               } else if ($$0 >= $$2) {
                  return false;
               } else {
                  double $$1 = ami.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  amn $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public abb b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dbi.f {
      final int a;
      final int c;
      final boolean d;
      static final amc<dbi.z> e = amc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dbi.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dbi.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dbi.z::d)
                  )
                  .apply($$0, dbi.z::new)
         )
      );

      @Override
      public amc<? extends dbi.f> a() {
         return e;
      }

      public dbi.e a(final dbi.g $$0) {
         class a extends dbi.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return this.c.C == Integer.MIN_VALUE || this.c.B + (z.this.d ? this.c.E : 0) >= this.c.C + z.this.a + this.c.t * z.this.c;
            }
         }

         return new a();
      }

      public int b() {
         return this.a;
      }
   }
}
