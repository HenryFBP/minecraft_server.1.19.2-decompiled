import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dly {
   public static final Codec<dly> b = hm.bb.p().dispatch(dly::e, dlz::codec);
   private static final int a = 10387320;
   private final hs c;
   private final dly.c d;
   private final float e;
   private final int f;
   private final Optional<dly.a> g;

   protected static <S extends dly> P5<Mu<S>, hs, dly.c, Float, Integer, Optional<dly.a>> a(Instance<S> $$0) {
      return $$0.group(
         hs.v(16).optionalFieldOf("locate_offset", hs.g).forGetter(dly::f),
         dly.c.e.optionalFieldOf("frequency_reduction_method", dly.c.a).forGetter(dly::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dly::h),
         alq.b.fieldOf("salt").forGetter(dly::i),
         dly.a.a.optionalFieldOf("exclusion_zone").forGetter(dly::j)
      );
   }

   protected dly(hs $$0, dly.c $$1, float $$2, int $$3, Optional<dly.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected hs f() {
      return this.c;
   }

   protected dly.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dly.a> j() {
      return this.g;
   }

   public boolean b(cxk $$0, dbf $$1, long $$2, int $$3, int $$4) {
      if (!this.a($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (this.e < 1.0F && !this.d.a($$2, this.f, $$3, $$4, this.e)) {
         return false;
      } else {
         return !this.g.isPresent() || !((dly.a)this.g.get()).a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected abstract boolean a(cxk var1, dbf var2, long var3, int var5, int var6);

   public gt a(cge $$0) {
      return new gt($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dlz<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dbo $$5 = new dbo(new das(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dbo $$5 = new dbo(new das(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dbo $$5 = new dbo(new das(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dbo $$7 = new dbo(new das(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(hc<dlh> b, int c) {
      public static final Codec<dly.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aav.a(hm.aO, dlh.a, false).fieldOf("other_set").forGetter(dly.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dly.a::b)
               )
               .apply($$0, dly.a::new)
      );

      boolean a(cxk $$0, dbf $$1, long $$2, int $$3, int $$4) {
         return $$0.a(this.b, $$1, $$2, $$3, $$4, this.c);
      }

      public hc<dlh> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }

   @FunctionalInterface
   public interface b {
      boolean shouldGenerate(long var1, int var3, int var4, int var5, float var6);
   }

   public static enum c implements amw {
      a("default", dly::a),
      b("legacy_type_1", dly::d),
      c("legacy_type_2", dly::c),
      d("legacy_type_3", dly::b);

      public static final Codec<dly.c> e = amw.a(dly.c::values);
      private final String f;
      private final dly.b g;

      private c(String $$0, dly.b $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
         return this.g.shouldGenerate($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
