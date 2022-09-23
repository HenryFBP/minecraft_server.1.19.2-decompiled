import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ho {
   private static <T> MapCodec<ho.a<T>> a(aba<? extends hm<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(aba.a($$0).fieldOf("name").forGetter(ho.a::a), Codec.INT.fieldOf("id").forGetter(ho.a::b), $$1.forGetter(ho.a::c))
               .apply($$2, ho.a::new)
      );
   }

   public static <T> Codec<hm<T>> a(aba<? extends hm<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         ht<T> $$3 = new hh<>($$0, $$1, null);

         for(ho.a<T> $$4 : $$2x) {
            $$3.a($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<ho.a<T>> $$1x = ImmutableList.builder();

         for(T $$2x : $$0x) {
            $$1x.add(new ho.a<Object>((aba<Object>)$$0x.c($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<hm<E>> b(aba<? extends hm<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<aba<E>, E>> $$3 = b($$0, $$2);
      Encoder<hm<E>> $$4 = $$3.comap($$0x -> ImmutableMap.copyOf($$0x.f()));
      return Codec.of($$4, a($$0, $$2, $$3, $$1), "DataPackRegistryCodec for " + $$0);
   }

   private static <E> Decoder<hm<E>> a(final aba<? extends hm<E>> $$0, final Codec<E> $$1, Decoder<Map<aba<E>, E>> $$2, Lifecycle $$3) {
      final Decoder<ht<E>> $$4 = $$2.map($$2x -> {
         ht<E> $$3x = new hh<>($$0, $$3, null);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, $$3xx, $$3));
         return $$3x;
      });
      return new Decoder<hm<E>>() {
         public <T> DataResult<Pair<hm<E>, T>> decode(DynamicOps<T> $$0x, T $$1x) {
            DataResult<Pair<ht<E>, T>> $$2 = $$4.decode($$0, $$1);
            return $$0 instanceof aay $$3
               ? (DataResult)$$3.a().map($$2x -> this.a($$2, $$3, $$2x.b())).orElseGet(() -> DataResult.error("Can't load registry with this ops"))
               : $$2.map($$0xx -> $$0xx.mapFirst($$0xxxx -> $$0xxxx));
         }

         private <T> DataResult<Pair<hm<E>, T>> a(DataResult<Pair<ht<E>, T>> $$0x, aay<?> $$1x, aax $$2) {
            return $$0.flatMap($$4xx -> $$2.a((ht<E>)$$4xx.getFirst(), $$0, $$1, $$1.b()).map($$1xxxxx -> Pair.of($$1xxxxx, $$4xx.getSecond())));
         }
      };
   }

   private static <T> Codec<Map<aba<T>, T>> b(aba<? extends hm<T>> $$0, Codec<T> $$1) {
      return Codec.unboundedMap(aba.a($$0), $$1);
   }

   public static <E> Codec<he<E>> a(aba<? extends hm<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<he<E>> a(aba<? extends hm<E>> $$0, Codec<E> $$1, boolean $$2) {
      return aau.a($$0, aav.a($$0, $$1), $$2);
   }

   public static <E> Codec<he<E>> a(aba<? extends hm<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<he<E>> a(aba<? extends hm<E>> $$0, boolean $$1) {
      return aau.a($$0, aaw.a($$0), $$1);
   }

   static record a<T>(aba<T> a, int b, T c) {
   }
}
