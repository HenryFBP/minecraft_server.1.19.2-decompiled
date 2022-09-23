import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cic {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static cic.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new cic.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static cic.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new cic.d(cic.b.a($$0), cic.b.a($$1), cic.b.a($$2), cic.b.a($$3), cic.b.a($$4), cic.b.a($$5), a($$6));
   }

   public static cic.d a(cic.b $$0, cic.b $$1, cic.b $$2, cic.b $$3, cic.b $$4, cic.b $$5, float $$6) {
      return new cic.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static cic.f a() {
      dak $$0 = dal.a();
      return new cic.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static gt a(List<cic.d> $$0, cic.f $$1) {
      return (new cic.g($$0, $$1)).a.a();
   }

   interface a<T> {
      long distance(cic.e.b<T> var1, long[] var2);
   }

   public static record b(long b, long c) {
      public static final Codec<cic.b> a = alq.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
               ? DataResult.error("Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
               : DataResult.success(new cic.b(cic.a($$0), cic.a($$1))),
         $$0 -> cic.a($$0.a()),
         $$0 -> cic.a($$0.b())
      );

      public static cic.b a(float $$0) {
         return a($$0, $$0);
      }

      public static cic.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cic.b(cic.a($$0), cic.a($$1));
         }
      }

      public static cic.b a(cic.b $$0, cic.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new cic.b($$0.a(), $$1.b());
         }
      }

      public String toString() {
         return this.b == this.c ? String.format(Locale.ROOT, "%d", this.b) : String.format(Locale.ROOT, "[%d-%d]", this.b, this.c);
      }

      public long a(long $$0) {
         long $$1 = $$0 - this.c;
         long $$2 = this.b - $$0;
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public long a(cic.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public cic.b b(@Nullable cic.b $$0) {
         return $$0 == null ? this : new cic.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<cic.d, T>> a;
      private final cic.e<T> b;

      public c(List<Pair<cic.d, T>> $$0) {
         this.a = $$0;
         this.b = cic.e.a($$0);
      }

      public List<Pair<cic.d, T>> a() {
         return this.a;
      }

      public T a(cic.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(cic.h $$0) {
         Iterator<Pair<cic.d, T>> $$1 = this.a().iterator();
         Pair<cic.d, T> $$2 = (Pair)$$1.next();
         long $$3 = ((cic.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while($$1.hasNext()) {
            Pair<cic.d, T> $$5 = (Pair)$$1.next();
            long $$6 = ((cic.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(cic.h $$0) {
         return this.a($$0, cic.e.b::a);
      }

      protected T a(cic.h $$0, cic.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public static record d(cic.b b, cic.b c, cic.b d, cic.b e, cic.b f, cic.b g, long h) {
      public static final Codec<cic.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cic.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
                  cic.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
                  cic.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
                  cic.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
                  cic.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
                  cic.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(cic::a, cic::a).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, cic.d::new)
      );

      long a(cic.h $$0) {
         return ami.b(this.b.a($$0.a))
            + ami.b(this.c.a($$0.b))
            + ami.b(this.d.a($$0.c))
            + ami.b(this.e.a($$0.d))
            + ami.b(this.f.a($$0.e))
            + ami.b(this.g.a($$0.f))
            + ami.b(this.h);
      }

      protected List<cic.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new cic.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 10;
      private final cic.e.b<T> b;
      private final ThreadLocal<cic.e.a<T>> c = new ThreadLocal();

      private e(cic.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> cic.e<T> a(List<Pair<cic.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((cic.d)((Pair)$$0.get(0)).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<cic.e.a<T>> $$2 = (List)$$0.stream()
                  .map($$0x -> new cic.e.a<>((cic.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new cic.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> cic.e.b<T> a(int $$0, List<? extends cic.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (cic.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 10) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for(int $$3x = 0; $$3x < $$0; ++$$3x) {
                  cic.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new cic.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<cic.e.c<T>> $$4 = null;

            for(int $$5 = 0; $$5 < $$0; ++$$5) {
               a($$1, $$0, $$5, false);
               List<cic.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for(cic.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new cic.e.c<>((List<? extends cic.e.b<T>>)$$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends cic.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<cic.e.b<T>> $$4 = a($$2, $$3);

         for(int $$5 = 1; $$5 < $$1; ++$$5) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<cic.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            cic.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<cic.e.c<T>> b(List<? extends cic.e.b<T>> $$0) {
         List<cic.e.c<T>> $$1 = Lists.newArrayList();
         List<cic.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(10.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(10.0)));

         for(cic.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new cic.e.c($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new cic.e.c($$2));
         }

         return $$1;
      }

      private static long a(cic.b[] $$0) {
         long $$1 = 0L;

         for(cic.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<cic.b> c(List<? extends cic.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<cic.b> $$2 = Lists.newArrayList();

            for(int $$3 = 0; $$3 < 7; ++$$3) {
               $$2.add(null);
            }

            for(cic.e.b<T> $$4 : $$0) {
               for(int $$5 = 0; $$5 < 7; ++$$5) {
                  $$2.set($$5, $$4.a[$$5].b((cic.b)$$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(cic.h $$0, cic.a<T> $$1) {
         long[] $$2 = $$0.a();
         cic.e.a<T> $$3 = this.b.a($$2, (cic.e.a<T>)this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends cic.e.b<T> {
         final T b;

         a(cic.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected cic.e.a<T> a(long[] $$0, @Nullable cic.e.a<T> $$1, cic.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final cic.b[] a;

         protected b(List<cic.b> $$0) {
            this.a = (cic.b[])$$0.toArray(new cic.b[0]);
         }

         protected abstract cic.e.a<T> a(long[] var1, @Nullable cic.e.a<T> var2, cic.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for(int $$2 = 0; $$2 < 7; ++$$2) {
               $$1 += ami.b(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         public String toString() {
            return Arrays.toString(this.a);
         }
      }

      static final class c<T> extends cic.e.b<T> {
         final cic.e.b<T>[] b;

         protected c(List<? extends cic.e.b<T>> $$0) {
            this(cic.e.c($$0), $$0);
         }

         protected c(List<cic.b> $$0, List<? extends cic.e.b<T>> $$1) {
            super($$0);
            this.b = (cic.e.b[])$$1.toArray(new cic.e.b[0]);
         }

         @Override
         protected cic.e.a<T> a(long[] $$0, @Nullable cic.e.a<T> $$1, cic.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            cic.e.a<T> $$4 = $$1;

            for(cic.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  cic.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
                  long $$8 = $$5 == $$7 ? $$6 : $$2.distance($$7, $$0);
                  if ($$3 > $$8) {
                     $$3 = $$8;
                     $$4 = $$7;
                  }
               }
            }

            return $$4;
         }
      }
   }

   public static record f(dak a, dak b, dak c, dak d, dak e, dak f, List<cic.d> g) {
      public cic.h a(int $$0, int $$1, int $$2) {
         int $$3 = hl.c($$0);
         int $$4 = hl.c($$1);
         int $$5 = hl.c($$2);
         dak.e $$6 = new dak.e($$3, $$4, $$5);
         return cic.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public gt a() {
         return this.g.isEmpty() ? gt.b : cic.a(this.g, this);
      }

      public dak b() {
         return this.a;
      }

      public dak c() {
         return this.b;
      }

      public dak d() {
         return this.c;
      }

      public dak e() {
         return this.d;
      }

      public dak f() {
         return this.e;
      }

      public dak g() {
         return this.f;
      }

      public List<cic.d> h() {
         return this.g;
      }
   }

   static class g {
      cic.g.a a;

      g(List<cic.d> $$0, cic.f $$1) {
         this.a = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<cic.d> $$0, cic.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         gt $$6 = this.a.a();

         while($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin((double)$$4) * (double)$$5);
            int $$8 = $$6.w() + (int)(Math.cos((double)$$4) * (double)$$5);
            cic.g.a $$9 = a($$0, $$1, $$7, $$8);
            if ($$9.b() < this.a.b()) {
               this.a = $$9;
            }

            $$4 += $$3 / $$5;
            if ((double)$$4 > Math.PI * 2) {
               $$4 = 0.0F;
               $$5 += $$3;
            }
         }

      }

      private static cic.g.a a(List<cic.d> $$0, cic.f $$1, int $$2, int $$3) {
         double $$4 = ami.m(2500.0);
         int $$5 = 2;
         long $$6 = (long)((double)ami.k(10000.0F) * Math.pow((double)(ami.b((long)$$2) + ami.b((long)$$3)) / $$4, 2.0));
         cic.h $$7 = $$1.a(hl.a($$2), 0, hl.a($$3));
         cic.h $$8 = new cic.h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
         long $$9 = Long.MAX_VALUE;

         for(cic.d $$10 : $$0) {
            $$9 = Math.min($$9, $$10.a($$8));
         }

         return new cic.g.a(new gt($$2, 0, $$3), $$6 + $$9);
      }

      static record a(gt a, long b) {
      }
   }

   public static record h(long a, long b, long c, long d, long e, long f) {
      final long a;
      final long b;
      final long c;
      final long d;
      final long e;
      final long f;

      @VisibleForTesting
      protected long[] a() {
         return new long[]{this.a, this.b, this.c, this.d, this.e, this.f, 0L};
      }

      public long b() {
         return this.a;
      }

      public long c() {
         return this.b;
      }

      public long d() {
         return this.c;
      }

      public long e() {
         return this.d;
      }

      public long f() {
         return this.e;
      }

      public long g() {
         return this.f;
      }
   }
}
