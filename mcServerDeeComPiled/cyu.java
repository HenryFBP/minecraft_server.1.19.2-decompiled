import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record cyu(
   OptionalLong k, boolean l, boolean m, boolean n, boolean o, double p, boolean q, boolean r, int s, int t, int u, akz<cjt> v, abb w, float x, cyu.a y
) {
   public static final int a = gt.c;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<cyu> h = alq.c(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alq.a(Codec.LONG.optionalFieldOf("fixed_time")).forGetter(cyu::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(cyu::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(cyu::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(cyu::i),
                  Codec.BOOL.fieldOf("natural").forGetter(cyu::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(cyu::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(cyu::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(cyu::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(cyu::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(cyu::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(cyu::p),
                  akz.b(hm.h).fieldOf("infiniburn").forGetter(cyu::q),
                  abb.a.fieldOf("effects").orElse(cys.e).forGetter(cyu::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(cyu::s),
                  cyu.a.a.forGetter(cyu::t)
               )
               .apply($$0, cyu::new)
      )
   );
   private static final int z = 8;
   public static final float[] i = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<hc<cyu>> j = aav.a(hm.O, h);

   public cyu(
      OptionalLong $$0,
      boolean $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      double $$5,
      boolean $$6,
      boolean $$7,
      int $$8,
      int $$9,
      int $$10,
      akz<cjt> $$11,
      abb $$12,
      float $$13,
      cyu.a $$14
   ) {
      if ($$9 < 16) {
         throw new IllegalStateException("height has to be at least 16");
      } else if ($$8 + $$9 > d + 1) {
         throw new IllegalStateException("min_y + height cannot be higher than: " + (d + 1));
      } else if ($$10 > $$9) {
         throw new IllegalStateException("logical_height cannot be higher than height");
      } else if ($$9 % 16 != 0) {
         throw new IllegalStateException("height has to be multiple of 16");
      } else if ($$8 % 16 != 0) {
         throw new IllegalStateException("min_y has to be a multiple of 16");
      } else {
         this.k = $$0;
         this.l = $$1;
         this.m = $$2;
         this.n = $$3;
         this.o = $$4;
         this.p = $$5;
         this.q = $$6;
         this.r = $$7;
         this.s = $$8;
         this.t = $$9;
         this.u = $$10;
         this.v = $$11;
         this.w = $$12;
         this.x = $$13;
         this.y = $$14;
      }
   }

   @Deprecated
   public static DataResult<aba<cgx>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = ((Number)$$1.get()).intValue();
         if ($$2 == -1) {
            return DataResult.success(cgx.f);
         }

         if ($$2 == 0) {
            return DataResult.success(cgx.e);
         }

         if ($$2 == 1) {
            return DataResult.success(cgx.g);
         }
      }

      return cgx.d.parse($$0);
   }

   public static double a(cyu $$0, cyu $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(aba<cgx> $$0, Path $$1) {
      if ($$0 == cgx.e) {
         return $$1;
      } else if ($$0 == cgx.g) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == cgx.f ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.k.isPresent();
   }

   public float a(long $$0) {
      double $$1 = ami.g((double)this.k.orElse($$0) / 24000.0 - 0.25);
      double $$2 = 0.5 - Math.cos($$1 * Math.PI) / 2.0;
      return (float)($$1 * 2.0 + $$2) / 3.0F;
   }

   public int b(long $$0) {
      return (int)($$0 / 24000L % 8L + 8L) % 8;
   }

   public boolean b() {
      return this.y.a();
   }

   public boolean c() {
      return this.y.b();
   }

   public azo d() {
      return this.y.c();
   }

   public int e() {
      return this.y.d();
   }

   public OptionalLong f() {
      return this.k;
   }

   public boolean g() {
      return this.l;
   }

   public boolean h() {
      return this.m;
   }

   public boolean i() {
      return this.n;
   }

   public boolean j() {
      return this.o;
   }

   public double k() {
      return this.p;
   }

   public boolean l() {
      return this.q;
   }

   public boolean m() {
      return this.r;
   }

   public int n() {
      return this.s;
   }

   public int o() {
      return this.t;
   }

   public int p() {
      return this.u;
   }

   public akz<cjt> q() {
      return this.v;
   }

   public abb r() {
      return this.w;
   }

   public float s() {
      return this.x;
   }

   public cyu.a t() {
      return this.y;
   }

   public static record a(boolean b, boolean c, azo d, int e) {
      public static final MapCodec<cyu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(cyu.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(cyu.a::b),
                  azo.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(cyu.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(cyu.a::d)
               )
               .apply($$0, cyu.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public azo c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
