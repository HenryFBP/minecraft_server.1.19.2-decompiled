import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.Codec.ResultFunction;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;

public class alq {
   public static final Codec<UUID> a = hr.a;
   public static final Codec<Integer> b = a(0, Integer.MAX_VALUE, $$0 -> "Value must be non-negative: " + $$0);
   public static final Codec<Integer> c = a(1, Integer.MAX_VALUE, $$0 -> "Value must be positive: " + $$0);
   public static final Codec<Float> d = a(0.0F, Float.MAX_VALUE, $$0 -> "Value must be positive: " + $$0);
   public static final Codec<Pattern> e = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(Pattern.compile($$0));
      } catch (PatternSyntaxException var2) {
         return DataResult.error("Invalid regex pattern '" + $$0 + "': " + var2.getMessage());
      }
   }, Pattern::pattern);
   public static final Codec<Instant> f = a(DateTimeFormatter.ISO_INSTANT);
   public static final Codec<byte[]> g = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(Base64.getDecoder().decode($$0));
      } catch (IllegalArgumentException var2) {
         return DataResult.error("Malformed base64 string");
      }
   }, $$0 -> Base64.getEncoder().encodeToString($$0));
   public static final Codec<alq.d> h = Codec.STRING
      .comapFlatMap(
         $$0 -> $$0.startsWith("#") ? abb.b($$0.substring(1)).map($$0x -> new alq.d($$0x, true)) : abb.b($$0).map($$0x -> new alq.d($$0x, false)), alq.d::c
      );
   public static final Function<Optional<Long>, OptionalLong> i = $$0 -> (OptionalLong)$$0.map(OptionalLong::of).orElseGet(OptionalLong::empty);
   public static final Function<OptionalLong, Optional<Long>> j = $$0 -> $$0.isPresent() ? Optional.of($$0.getAsLong()) : Optional.empty();

   public static <F, S> Codec<Either<F, S>> a(Codec<F> $$0, Codec<S> $$1) {
      return new alq.e($$0, $$1);
   }

   public static <P, I> Codec<I> a(Codec<P> $$0, String $$1, String $$2, BiFunction<P, P, DataResult<I>> $$3, Function<I, P> $$4, Function<I, P> $$5) {
      Codec<I> $$6 = Codec.list($$0).comapFlatMap($$1x -> ad.a($$1x, 2).flatMap($$1xx -> {
            P $$2x = $$1xx.get(0);
            P $$3x = $$1xx.get(1);
            return (DataResult)$$3.apply($$2x, $$3x);
         }), $$2x -> ImmutableList.of($$4.apply($$2x), $$5.apply($$2x)));
      Codec<I> $$7 = RecordCodecBuilder.create(
            $$3x -> $$3x.group($$0.fieldOf($$1).forGetter(Pair::getFirst), $$0.fieldOf($$2).forGetter(Pair::getSecond)).apply($$3x, Pair::of)
         )
         .comapFlatMap($$1x -> (DataResult)$$3.apply($$1x.getFirst(), $$1x.getSecond()), $$2x -> Pair.of($$4.apply($$2x), $$5.apply($$2x)));
      Codec<I> $$8 = new alq.b($$6, $$7).xmap($$0x -> $$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), Either::left);
      return Codec.either($$0, $$8).comapFlatMap($$1x -> (DataResult)$$1x.map($$1xx -> (DataResult)$$3.apply($$1xx, $$1xx), DataResult::success), $$2x -> {
         P $$3x = $$4.apply($$2x);
         P $$4x = $$5.apply($$2x);
         return Objects.equals($$3x, $$4x) ? Either.left($$3x) : Either.right($$2x);
      });
   }

   public static <A> ResultFunction<A> a(final A $$0) {
      return new ResultFunction<A>() {
         public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> $$0x, T $$1, DataResult<Pair<A, T>> $$2) {
            MutableObject<String> $$3 = new MutableObject();
            Optional<Pair<A, T>> $$4 = $$2.resultOrPartial($$3::setValue);
            return $$4.isPresent() ? $$2 : DataResult.error("(" + (String)$$3.getValue() + " -> using default)", Pair.of($$0, $$1));
         }

         public <T> DataResult<T> coApply(DynamicOps<T> $$0x, A $$1, DataResult<T> $$2) {
            return $$2;
         }

         public String toString() {
            return "OrElsePartial[" + $$0 + "]";
         }
      };
   }

   public static <E> Codec<E> a(ToIntFunction<E> $$0, IntFunction<E> $$1, int $$2) {
      return Codec.INT
         .flatXmap(
            $$1x -> (DataResult)Optional.ofNullable($$1.apply($$1x)).map(DataResult::success).orElseGet(() -> DataResult.error("Unknown element id: " + $$1x)),
            $$2x -> {
               int $$3 = $$0.applyAsInt($$2x);
               return $$3 == $$2 ? DataResult.error("Element with unknown id: " + $$2x) : DataResult.success($$3);
            }
         );
   }

   public static <E> Codec<E> a(Function<E, String> $$0, Function<String, E> $$1) {
      return Codec.STRING
         .flatXmap(
            $$1x -> (DataResult)Optional.ofNullable($$1.apply($$1x))
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown element name:" + $$1x)),
            $$1x -> (DataResult)Optional.ofNullable((String)$$0.apply($$1x))
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Element with unknown name: " + $$1x))
         );
   }

   public static <E> Codec<E> b(final Codec<E> $$0, final Codec<E> $$1) {
      return new Codec<E>() {
         public <T> DataResult<T> encode(E $$0x, DynamicOps<T> $$1x, T $$2) {
            return $$1.compressMaps() ? $$1.encode($$0, $$1, $$2) : $$0.encode($$0, $$1, $$2);
         }

         public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> $$0x, T $$1x) {
            return $$0.compressMaps() ? $$1.decode($$0, $$1) : $$0.decode($$0, $$1);
         }

         public String toString() {
            return $$0 + " orCompressed " + $$1;
         }
      };
   }

   public static <E> Codec<E> a(Codec<E> $$0, final Function<E, Lifecycle> $$1, final Function<E, Lifecycle> $$2) {
      return $$0.mapResult(new ResultFunction<E>() {
         public <T> DataResult<Pair<E, T>> apply(DynamicOps<T> $$0, T $$1x, DataResult<Pair<E, T>> $$2x) {
            return (DataResult<Pair<E, T>>)$$2.result().map($$2xxx -> $$2.setLifecycle((Lifecycle)$$1.apply($$2xxx.getFirst()))).orElse($$2);
         }

         public <T> DataResult<T> coApply(DynamicOps<T> $$0, E $$1x, DataResult<T> $$2x) {
            return $$2.setLifecycle((Lifecycle)$$2.apply($$1));
         }

         public String toString() {
            return "WithLifecycle[" + $$1 + " " + $$2 + "]";
         }
      });
   }

   private static <N extends Number & Comparable<N>> Function<N, DataResult<N>> a(N $$0, N $$1, Function<N, String> $$2) {
      return $$3 -> ((Comparable)$$3).compareTo($$0) >= 0 && ((Comparable)$$3).compareTo($$1) <= 0
            ? DataResult.success($$3)
            : DataResult.error((String)$$2.apply($$3));
   }

   private static Codec<Integer> a(int $$0, int $$1, Function<Integer, String> $$2) {
      Function<Integer, DataResult<Integer>> $$3 = a($$0, Integer.valueOf($$1), $$2);
      return Codec.INT.flatXmap($$3, $$3);
   }

   private static <N extends Number & Comparable<N>> Function<N, DataResult<N>> b(N $$0, N $$1, Function<N, String> $$2) {
      return $$3 -> ((Comparable)$$3).compareTo($$0) > 0 && ((Comparable)$$3).compareTo($$1) <= 0
            ? DataResult.success($$3)
            : DataResult.error((String)$$2.apply($$3));
   }

   private static Codec<Float> a(float $$0, float $$1, Function<Float, String> $$2) {
      Function<Float, DataResult<Float>> $$3 = b($$0, $$1, $$2);
      return Codec.FLOAT.flatXmap($$3, $$3);
   }

   public static <T> Function<List<T>, DataResult<List<T>>> a() {
      return $$0 -> $$0.isEmpty() ? DataResult.error("List must have contents") : DataResult.success($$0);
   }

   public static <T> Codec<List<T>> a(Codec<List<T>> $$0) {
      return $$0.flatXmap(a(), a());
   }

   public static <T> Function<he<T>, DataResult<he<T>>> b() {
      return $$0 -> $$0.c().right().filter(List::isEmpty).isPresent() ? DataResult.error("List must have contents") : DataResult.success($$0);
   }

   public static <T> Codec<he<T>> b(Codec<he<T>> $$0) {
      return $$0.flatXmap(b(), b());
   }

   public static <A> Codec<A> a(Supplier<Codec<A>> $$0) {
      return new alq.c<>($$0);
   }

   public static <E> MapCodec<E> a(final Function<DynamicOps<?>, DataResult<E>> $$0) {
      class a extends MapCodec<E> {
         public <T> RecordBuilder<T> encode(E $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            return $$2;
         }

         public <T> DataResult<E> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            return (DataResult<E>)$$0.apply($$0);
         }

         public String toString() {
            return "ContextRetrievalCodec[" + $$0 + "]";
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return Stream.empty();
         }
      }

      return new a();
   }

   public static <E, L extends Collection<E>, T> Function<L, DataResult<L>> b(Function<E, T> $$0) {
      return $$1 -> {
         Iterator<E> $$2 = $$1.iterator();
         if ($$2.hasNext()) {
            T $$3 = (T)$$0.apply($$2.next());

            while($$2.hasNext()) {
               E $$4 = (E)$$2.next();
               T $$5 = (T)$$0.apply($$4);
               if ($$5 != $$3) {
                  return DataResult.error("Mixed type list: element " + $$4 + " had type " + $$5 + ", but list is of type " + $$3);
               }
            }
         }

         return DataResult.success($$1, Lifecycle.stable());
      };
   }

   public static <A> Codec<A> c(final Codec<A> $$0) {
      return Codec.of($$0, new Decoder<A>() {
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$0x, T $$1) {
            try {
               return $$0.decode($$0, $$1);
            } catch (Exception var4) {
               return DataResult.error("Cauch exception decoding " + $$1 + ": " + var4.getMessage());
            }
         }
      });
   }

   public static Codec<Instant> a(DateTimeFormatter $$0) {
      return Codec.STRING.comapFlatMap($$1 -> {
         try {
            return DataResult.success(Instant.from($$0.parse($$1)));
         } catch (Exception var3) {
            return DataResult.error(var3.getMessage());
         }
      }, $$0::format);
   }

   public static MapCodec<OptionalLong> a(MapCodec<Optional<Long>> $$0) {
      return $$0.xmap(i, j);
   }

   static final class b<F, S> implements Codec<Either<F, S>> {
      private final Codec<F> a;
      private final Codec<S> b;

      public b(Codec<F> $$0, Codec<S> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public <T> DataResult<Pair<Either<F, S>, T>> decode(DynamicOps<T> $$0, T $$1) {
         DataResult<Pair<Either<F, S>, T>> $$2 = this.a.decode($$0, $$1).map($$0x -> $$0x.mapFirst(Either::left));
         if (!$$2.error().isPresent()) {
            return $$2;
         } else {
            DataResult<Pair<Either<F, S>, T>> $$3 = this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(Either::right));
            return !$$3.error().isPresent() ? $$3 : $$2.apply2(($$0x, $$1x) -> $$1x, $$3);
         }
      }

      public <T> DataResult<T> a(Either<F, S> $$0, DynamicOps<T> $$1, T $$2) {
         return (DataResult<T>)$$0.map($$2x -> this.a.encode($$2x, $$1, $$2), $$2x -> this.b.encode($$2x, $$1, $$2));
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            alq.b<?, ?> $$1 = (alq.b)$$0;
            return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         } else {
            return false;
         }
      }

      public int hashCode() {
         return Objects.hash(new Object[]{this.a, this.b});
      }

      public String toString() {
         return "EitherCodec[" + this.a + ", " + this.b + "]";
      }
   }

   static record c<A>(Supplier<Codec<A>> a) implements Codec<A> {
      c(Supplier<Codec<A>> $$0) {
         Supplier<Codec<A>> var2 = Suppliers.memoize($$0::get);
         this.a = var2;
      }

      public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$0, T $$1) {
         return ((Codec)this.a.get()).decode($$0, $$1);
      }

      public <T> DataResult<T> encode(A $$0, DynamicOps<T> $$1, T $$2) {
         return ((Codec)this.a.get()).encode($$0, $$1, $$2);
      }
   }

   public static record d(abb a, boolean b) {
      public String toString() {
         return this.c();
      }

      private String c() {
         return this.b ? "#" + this.a : this.a.toString();
      }
   }

   static final class e<F, S> implements Codec<Either<F, S>> {
      private final Codec<F> a;
      private final Codec<S> b;

      public e(Codec<F> $$0, Codec<S> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public <T> DataResult<Pair<Either<F, S>, T>> decode(DynamicOps<T> $$0, T $$1) {
         DataResult<Pair<Either<F, S>, T>> $$2 = this.a.decode($$0, $$1).map($$0x -> $$0x.mapFirst(Either::left));
         DataResult<Pair<Either<F, S>, T>> $$3 = this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(Either::right));
         Optional<Pair<Either<F, S>, T>> $$4 = $$2.result();
         Optional<Pair<Either<F, S>, T>> $$5 = $$3.result();
         if ($$4.isPresent() && $$5.isPresent()) {
            return DataResult.error(
               "Both alternatives read successfully, can not pick the correct one; first: " + $$4.get() + " second: " + $$5.get(), (Pair)$$4.get()
            );
         } else {
            return $$4.isPresent() ? $$2 : $$3;
         }
      }

      public <T> DataResult<T> a(Either<F, S> $$0, DynamicOps<T> $$1, T $$2) {
         return (DataResult<T>)$$0.map($$2x -> this.a.encode($$2x, $$1, $$2), $$2x -> this.b.encode($$2x, $$1, $$2));
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            alq.e<?, ?> $$1 = (alq.e)$$0;
            return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         } else {
            return false;
         }
      }

      public int hashCode() {
         return Objects.hash(new Object[]{this.a, this.b});
      }

      public String toString() {
         return "XorCodec[" + this.a + ", " + this.b + "]";
      }
   }
}
