import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class aau<E> implements Codec<he<E>> {
   private final aba<? extends hm<E>> a;
   private final Codec<hc<E>> b;
   private final Codec<List<hc<E>>> c;
   private final Codec<Either<akz<E>, List<hc<E>>>> d;

   private static <E> Codec<List<hc<E>>> a(Codec<hc<E>> $$0, boolean $$1) {
      Function<List<hc<E>>, DataResult<List<hc<E>>>> $$2 = alq.b(hc::f);
      Codec<List<hc<E>>> $$3 = $$0.listOf().flatXmap($$2, $$2);
      return $$1
         ? $$3
         : Codec.either($$3, $$0)
            .xmap($$0x -> (List)$$0x.map($$0xx -> $$0xx, List::of), $$0x -> $$0x.size() == 1 ? Either.right((hc)$$0x.get(0)) : Either.left($$0x));
   }

   public static <E> Codec<he<E>> a(aba<? extends hm<E>> $$0, Codec<hc<E>> $$1, boolean $$2) {
      return new aau<>($$0, $$1, $$2);
   }

   private aau(aba<? extends hm<E>> $$0, Codec<hc<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(akz.b($$0), this.c);
   }

   public <T> DataResult<Pair<he<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof aay $$2) {
         Optional<? extends hm<E>> $$3 = $$2.a(this.a);
         if ($$3.isPresent()) {
            hm<E> $$4 = (hm)$$3.get();
            return this.d.decode($$0, $$1).map($$1x -> $$1x.mapFirst($$1xx -> (he)$$1xx.map($$4::b, he::a)));
         }
      }

      return this.a($$0, $$1);
   }

   public <T> DataResult<T> a(he<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof aay $$3) {
         Optional<? extends hm<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a((hm<E>)$$4.get())) {
               return DataResult.error("HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.c().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<he<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<hc.a<E>> $$1x = new ArrayList();

         for(hc<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof hc.a)) {
               return DataResult.error("Can't decode element " + $$2 + " without registry");
            }

            hc.a<E> $$3 = (hc.a)$$2;
            $$1x.add($$3);
         }

         return DataResult.success(new Pair(he.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(he<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
