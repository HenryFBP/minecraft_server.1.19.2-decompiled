import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dlb {
   public static final Codec<dlb> a = hm.bf.p().dispatch(dlb::e, dlk::codec);
   public static final Codec<hc<dlb>> b = aav.a(hm.aN, a);
   protected final dlb.c c;

   public static <S extends dlb> RecordCodecBuilder<S, dlb.c> a(Instance<S> $$0) {
      return dlb.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dlb> Codec<S> a(Function<dlb.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dlb(dlb.c $$0) {
      this.c = $$0;
   }

   public he<cht> a() {
      return this.c.b;
   }

   public Map<bcf, dli> b() {
      return this.c.c;
   }

   public dan.b c() {
      return this.c.d;
   }

   public dlm d() {
      return this.c.e;
   }

   public dkt a(dkt $$0) {
      return this.d() != dlm.a ? $$0.a(12) : $$0;
   }

   public dlj a(hn $$0, cxk $$1, chx $$2, dbf $$3, dou $$4, long $$5, cge $$6, int $$7, cgz $$8, Predicate<hc<cht>> $$9) {
      Optional<dlb.b> $$10 = this.a(new dlb.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9));
      if ($$10.isPresent() && a((dlb.b)$$10.get(), $$1, $$3, $$9)) {
         dlt $$11 = ((dlb.b)$$10.get()).a();
         dlj $$12 = new dlj(this, $$6, $$7, $$11.a());
         if ($$12.b()) {
            return $$12;
         }
      }

      return dlj.b;
   }

   protected static Optional<dlb.b> a(dlb.a $$0, dar.a $$1, Consumer<dlt> $$2) {
      cge $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dlb.b(new gt($$4, $$6, $$5), $$2));
   }

   private static boolean a(dlb.b $$0, cxk $$1, dbf $$2, Predicate<hc<cht>> $$3) {
      gt $$4 = $$0.b();
      return $$3.test($$1.d().getNoiseBiome(hl.a($$4.u()), hl.a($$4.v()), hl.a($$4.w()), $$2.c()));
   }

   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, dlq $$6) {
   }

   private static int[] b(dlb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      cxk $$5 = $$0.b();
      cgz $$6 = $$0.i();
      dbf $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dar.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dar.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dar.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dar.a.a, $$6, $$7)
      };
   }

   protected static int a(dlb.a $$0, int $$1, int $$2) {
      cge $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dlb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gt a(dlb.a $$0, cpw $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == cpw.b) {
         $$2 = -5;
      } else if ($$1 == cpw.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == cpw.d) {
         $$3 = -5;
      }

      cge $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gt($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   public abstract Optional<dlb.b> a(dlb.a var1);

   public abstract dlk<?> e();

   public static record a(hn a, cxk b, chx c, dbf d, dou e, dbo f, long g, cge h, cgz i, Predicate<hc<cht>> j) {
      public a(hn $$0, cxk $$1, chx $$2, dbf $$3, dou $$4, long $$5, cge $$6, cgz $$7, Predicate<hc<cht>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dbo a(long $$0, cge $$1) {
         dbo $$2 = new dbo(new das(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gt a, Either<Consumer<dlt>, dlt> b) {
      public b(gt $$0, Consumer<dlt> $$1) {
         this($$0, Either.left($$1));
      }

      public dlt a() {
         return (dlt)this.b.map($$0 -> {
            dlt $$1 = new dlt();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gt b() {
         return this.a;
      }

      public Either<Consumer<dlt>, dlt> c() {
         return this.b;
      }
   }

   public static record c(he<cht> b, Map<bcf, dli> c, dan.b d, dlm e) {
      final he<cht> b;
      final Map<bcf, dli> c;
      final dan.b d;
      final dlm e;
      public static final MapCodec<dlb.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ho.a(hm.aR).fieldOf("biomes").forGetter(dlb.c::a),
                  Codec.simpleMap(bcf.i, dli.a, amw.a(bcf.values())).fieldOf("spawn_overrides").forGetter(dlb.c::b),
                  dan.b.l.fieldOf("step").forGetter(dlb.c::c),
                  dlm.e.optionalFieldOf("terrain_adaptation", dlm.a).forGetter(dlb.c::d)
               )
               .apply($$0, dlb.c::new)
      );

      public he<cht> a() {
         return this.b;
      }

      public Map<bcf, dli> b() {
         return this.c;
      }

      public dan.b c() {
         return this.d;
      }

      public dlm d() {
         return this.e;
      }
   }
}
