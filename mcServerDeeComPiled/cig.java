import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class cig extends chx {
   public static final MapCodec<cig> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alq.a(
                     RecordCodecBuilder.create(
                           $$0x -> $$0x.group(cic.d.a.fieldOf("parameters").forGetter(Pair::getFirst), cht.c.fieldOf("biome").forGetter(Pair::getSecond))
                                 .apply($$0x, Pair::of)
                        )
                        .listOf()
                  )
                  .xmap(cic.c::new, cic.c::a)
                  .fieldOf("biomes")
                  .forGetter($$0x -> $$0x.d)
            )
            .apply($$0, cig::new)
   );
   public static final Codec<cig> c = Codec.mapEither(cig.b.a, b)
      .xmap($$0 -> (cig)$$0.map(cig.b::a, Function.identity()), $$0 -> (Either)$$0.c().map(Either::left).orElseGet(() -> Either.right($$0)))
      .codec();
   private final cic.c<hc<cht>> d;
   private final Optional<cig.b> e;

   private cig(cic.c<hc<cht>> $$0) {
      this($$0, Optional.empty());
   }

   cig(cic.c<hc<cht>> $$0, Optional<cig.b> $$1) {
      super($$0.a().stream().map(Pair::getSecond));
      this.e = $$1;
      this.d = $$0;
   }

   @Override
   protected Codec<? extends chx> a() {
      return c;
   }

   private Optional<cig.b> c() {
      return this.e;
   }

   public boolean a(cig.a $$0) {
      return this.e.isPresent() && Objects.equals(((cig.b)this.e.get()).b(), $$0);
   }

   @Override
   public hc<cht> getNoiseBiome(int $$0, int $$1, int $$2, cic.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @ang
   public hc<cht> a(cic.h $$0) {
      return this.d.a($$0);
   }

   @Override
   public void a(List<String> $$0, gt $$1, cic.f $$2) {
      int $$3 = hl.a($$1.u());
      int $$4 = hl.a($$1.v());
      int $$5 = hl.a($$1.w());
      cic.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cic.a($$6.d());
      float $$8 = cic.a($$6.e());
      float $$9 = cic.a($$6.b());
      float $$10 = cic.a($$6.c());
      float $$11 = cic.a($$6.g());
      double $$12 = (double)day.a($$11);
      cih $$13 = new cih();
      $$0.add(
         "Biome builder PV: "
            + cih.a($$12)
            + " C: "
            + $$13.b((double)$$7)
            + " E: "
            + $$13.c((double)$$8)
            + " T: "
            + $$13.d((double)$$9)
            + " H: "
            + $$13.e((double)$$10)
      );
   }

   public static class a {
      static final Map<abb, cig.a> c = Maps.newHashMap();
      public static final cig.a a = new cig.a(
         new abb("nether"),
         $$0 -> new cic.c(
               ImmutableList.of(
                  Pair.of(cic.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.c(cia.ab)),
                  Pair.of(cic.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.c(cia.ae)),
                  Pair.of(cic.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.c(cia.ad)),
                  Pair.of(cic.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.c(cia.ac)),
                  Pair.of(cic.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.c(cia.af))
               )
            )
      );
      public static final cig.a b = new cig.a(new abb("overworld"), $$0 -> {
         Builder<Pair<cic.d, hc<cht>>> $$1 = ImmutableList.builder();
         new cih().a($$2 -> $$1.add($$2.mapSecond($$0::c)));
         return new cic.c($$1.build());
      });
      final abb d;
      private final Function<hm<cht>, cic.c<hc<cht>>> e;

      public a(abb $$0, Function<hm<cht>, cic.c<hc<cht>>> $$1) {
         this.d = $$0;
         this.e = $$1;
         c.put($$0, this);
      }

      @ang
      public static Stream<Pair<abb, cig.a>> a() {
         return c.entrySet().stream().map($$0 -> Pair.of((abb)$$0.getKey(), (cig.a)$$0.getValue()));
      }

      cig a(cig.b $$0, boolean $$1) {
         cic.c<hc<cht>> $$2 = (cic.c)this.e.apply($$0.c());
         return new cig($$2, $$1 ? Optional.of($$0) : Optional.empty());
      }

      public cig a(hm<cht> $$0, boolean $$1) {
         return this.a(new cig.b(this, $$0), $$1);
      }

      public cig a(hm<cht> $$0) {
         return this.a($$0, true);
      }

      public Stream<aba<cht>> b() {
         return this.a(iw.j).b().stream().flatMap($$0 -> $$0.e().stream());
      }
   }

   static record b(cig.a b, hm<cht> c) {
      public static final MapCodec<cig.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  abb.a
                     .flatXmap(
                        $$0x -> (DataResult)Optional.ofNullable((cig.a)cig.a.c.get($$0x))
                              .map(DataResult::success)
                              .orElseGet(() -> DataResult.error("Unknown preset: " + $$0x)),
                        $$0x -> DataResult.success($$0x.d)
                     )
                     .fieldOf("preset")
                     .stable()
                     .forGetter(cig.b::b),
                  aay.b(hm.aR).forGetter(cig.b::c)
               )
               .apply($$0, $$0.stable(cig.b::new))
      );

      public cig a() {
         return this.b.a(this, true);
      }
   }
}
