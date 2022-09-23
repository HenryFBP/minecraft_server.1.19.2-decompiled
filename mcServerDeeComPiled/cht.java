import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public final class cht {
   public static final Codec<cht> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cht.b.a.forGetter($$0x -> $$0x.i),
               chz.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               chu.b.forGetter($$0x -> $$0x.j),
               cif.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, cht::new)
   );
   public static final Codec<cht> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cht.b.a.forGetter($$0x -> $$0x.i), chz.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new cht($$0x, $$1, chu.a, cif.b))
   );
   public static final Codec<hc<cht>> c = aav.a(hm.aR, a);
   public static final Codec<he<cht>> d = ho.a(hm.aR, a);
   private static final dpc f = new dpc(new dbo(new das(1234L)), ImmutableList.of(0));
   static final dpc g = new dpc(new dbo(new das(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final dpc e = new dpc(new dbo(new das(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final cht.b i;
   private final chu j;
   private final cif k;
   private final chz l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ad.a((Supplier<Long2FloatLinkedOpenHashMap>)(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      })));

   cht(cht.b $$0, chz $$1, chu $$2, cif $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public cif b() {
      return this.k;
   }

   public cht.c c() {
      return this.i.b;
   }

   public boolean d() {
      return this.h() > 0.85F;
   }

   private float e(gt $$0) {
      float $$1 = this.i.d.a($$0, this.i());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(gt $$0) {
      long $$1 = $$0.a();
      Long2FloatLinkedOpenHashMap $$2 = (Long2FloatLinkedOpenHashMap)this.m.get();
      float $$3 = $$2.get($$1);
      if (!Float.isNaN($$3)) {
         return $$3;
      } else {
         float $$4 = this.e($$0);
         if ($$2.size() == 1024) {
            $$2.removeFirstFloat();
         }

         $$2.put($$1, $$4);
         return $$4;
      }
   }

   public boolean a(cha $$0, gt $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(cha $$0, gt $$1, boolean $$2) {
      if (this.b($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.u_() && $$1.v() < $$0.ah() && $$0.a(chg.b, $$1) < 10) {
            cvo $$3 = $$0.a_($$1);
            dpv $$4 = $$0.b_($$1);
            if ($$4.a() == dpw.c && $$3.b() instanceof cnz) {
               if (!$$2) {
                  return true;
               }

               boolean $$5 = $$0.C($$1.f()) && $$0.C($$1.g()) && $$0.C($$1.d()) && $$0.C($$1.e());
               if (!$$5) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean a(gt $$0) {
      return !this.b($$0);
   }

   public boolean b(gt $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean c(gt $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean d(gt $$0) {
      return this.f($$0) > 1.0F;
   }

   public boolean b(cha $$0, gt $$1) {
      if (this.b($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.u_() && $$1.v() < $$0.ah() && $$0.a(chg.b, $$1) < 10) {
            cvo $$2 = $$0.a_($$1);
            if ($$2.h() && cju.cW.m().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public chu e() {
      return this.j;
   }

   public int f() {
      return this.l.a();
   }

   public int a(double $$0, double $$1) {
      int $$2 = this.l.f().orElseGet(this::r);
      return this.l.g().a($$0, $$1, $$2);
   }

   private int r() {
      double $$0 = (double)ami.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ami.a(this.i.e, 0.0F, 1.0F);
      return cgv.a($$0, $$1);
   }

   public int g() {
      return this.l.e().orElseGet(this::s);
   }

   private int s() {
      double $$0 = (double)ami.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ami.a(this.i.e, 0.0F, 1.0F);
      return cgr.a($$0, $$1);
   }

   public float h() {
      return this.i.e;
   }

   public float i() {
      return this.i.c;
   }

   public chz j() {
      return this.l;
   }

   public int k() {
      return this.l.b();
   }

   public int l() {
      return this.l.c();
   }

   public Optional<chs> m() {
      return this.l.h();
   }

   public Optional<ajv> n() {
      return this.l.i();
   }

   public Optional<chr> o() {
      return this.l.j();
   }

   public Optional<chq> p() {
      return this.l.k();
   }

   public Optional<ajt> q() {
      return this.l.l();
   }

   public static class a {
      @Nullable
      private cht.c a;
      @Nullable
      private Float b;
      private cht.d c = cht.d.a;
      @Nullable
      private Float d;
      @Nullable
      private chz e;
      @Nullable
      private cif f;
      @Nullable
      private chu g;

      public cht.a a(cht.c $$0) {
         this.a = $$0;
         return this;
      }

      public cht.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cht.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public cht.a a(chz $$0) {
         this.e = $$0;
         return this;
      }

      public cht.a a(cif $$0) {
         this.f = $$0;
         return this;
      }

      public cht.a a(chu $$0) {
         this.g = $$0;
         return this;
      }

      public cht.a a(cht.d $$0) {
         this.c = $$0;
         return this;
      }

      public cht a() {
         if (this.a != null && this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new cht(new cht.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
         } else {
            throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
         }
      }

      public String toString() {
         return "BiomeBuilder{\nprecipitation="
            + this.a
            + ",\ntemperature="
            + this.b
            + ",\ntemperatureModifier="
            + this.c
            + ",\ndownfall="
            + this.d
            + ",\nspecialEffects="
            + this.e
            + ",\nmobSpawnSettings="
            + this.f
            + ",\ngenerationSettings="
            + this.g
            + ",\n}";
      }
   }

   static record b(cht.c b, float c, cht.d d, float e) {
      final cht.c b;
      final float c;
      final cht.d d;
      final float e;
      public static final MapCodec<cht.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cht.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  cht.d.c.optionalFieldOf("temperature_modifier", cht.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cht.b::new)
      );

      public cht.c a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public cht.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements amw {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<cht.c> d = amw.a(cht.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements amw {
      a("none") {
         @Override
         public float a(gt $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(gt $$0, float $$1) {
            double $$2 = cht.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = cht.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = cht.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<cht.d> c = amw.a(cht.d::values);

      public abstract float a(gt var1, float var2);

      d(String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
