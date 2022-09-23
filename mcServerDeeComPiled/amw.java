import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface amw {
   int W = 16;

   String c();

   static <E extends Enum<E> & amw> amw.a<E> a(Supplier<E[]> $$0) {
      E[] $$1 = (E[])$$0.get();
      if ($$1.length > 16) {
         Map<String, E> $$2 = (Map)Arrays.stream($$1).collect(Collectors.toMap($$0x -> ((amw)$$0x).c(), $$0x -> $$0x));
         return new amw.a<>($$1, $$1x -> $$1x == null ? null : (Enum)$$2.get($$1x));
      } else {
         return new amw.a<>($$1, $$1x -> {
            for(E $$2x : $$1) {
               if (((amw)$$2x).c().equals($$1x)) {
                  return $$2x;
               }
            }

            return null;
         });
      }
   }

   static Keyable a(final amw[] $$0) {
      return new Keyable() {
         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return Arrays.stream($$0).map(amw::c).map($$0::createString);
         }
      };
   }

   @Deprecated
   public static class a<E extends Enum<E> & amw> implements Codec<E> {
      private Codec<E> a;
      private Function<String, E> b;

      public a(E[] $$0, Function<String, E> $$1) {
         this.a = alq.b(
            alq.a($$0x -> ((amw)$$0x).c(), $$1), alq.a($$0x -> ((Enum)$$0x).ordinal(), $$1x -> $$1x >= 0 && $$1x < $$0.length ? $$0[$$1x] : null, -1)
         );
         this.b = $$1;
      }

      public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> $$0, T $$1) {
         return this.a.decode($$0, $$1);
      }

      public <T> DataResult<T> a(E $$0, DynamicOps<T> $$1, T $$2) {
         return this.a.encode($$0, $$1, $$2);
      }

      @Nullable
      public E a(@Nullable String $$0) {
         return (E)this.b.apply($$0);
      }
   }
}
