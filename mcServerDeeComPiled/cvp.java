import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cvp<O, S extends cvq<O, S>> {
   static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
   private final O b;
   private final ImmutableSortedMap<String, cwr<?>> c;
   private final ImmutableList<S> d;

   protected cvp(Function<O, S> $$0, O $$1, cvp.b<O, S> $$2, Map<String, cwr<?>> $$3) {
      this.b = $$1;
      this.c = ImmutableSortedMap.copyOf($$3);
      Supplier<S> $$4 = () -> (cvq)$$0.apply($$1);
      MapCodec<S> $$5 = MapCodec.of(Encoder.empty(), Decoder.unit($$4));

      Entry<String, cwr<?>> $$6;
      for(UnmodifiableIterator $$7 = this.c.entrySet().iterator(); $$7.hasNext(); $$5 = a($$5, $$4, (String)$$6.getKey(), (cwr)$$6.getValue())) {
         $$6 = (Entry)$$7.next();
      }

      MapCodec<S> $$7 = $$5;
      Map<Map<cwr<?>, Comparable<?>>, S> $$8 = Maps.newLinkedHashMap();
      List<S> $$9 = Lists.newArrayList();
      Stream<List<Pair<cwr<?>, Comparable<?>>>> $$10 = Stream.of(Collections.emptyList());

      cwr<?> $$11;
      for(UnmodifiableIterator var11 = this.c.values().iterator(); var11.hasNext(); $$10 = $$10.flatMap($$1x -> $$11.a().stream().map($$2x -> {
            List<Pair<cwr<?>, Comparable<?>>> $$3x = Lists.newArrayList($$1x);
            $$3x.add(Pair.of($$11, $$2x));
            return $$3x;
         }))) {
         $$11 = (cwr)var11.next();
      }

      $$10.forEach($$5x -> {
         ImmutableMap<cwr<?>, Comparable<?>> $$6 = (ImmutableMap)$$5x.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
         S $$7x = $$2.create($$1, $$6, $$7);
         $$8.put($$6, $$7x);
         $$9.add($$7x);
      });

      for(S $$12 : $$9) {
         $$12.a($$8);
      }

      this.d = ImmutableList.copyOf($$9);
   }

   private static <S extends cvq<?, S>, T extends Comparable<T>> MapCodec<S> a(MapCodec<S> $$0, Supplier<S> $$1, String $$2, cwr<T> $$3) {
      return Codec.mapPair($$0, $$3.e().fieldOf($$2).orElseGet($$0x -> {
      }, () -> $$3.a((cvq<?, ?>)$$1.get()))).xmap(
         $$1x -> (cvq)((cvq)$$1x.getFirst()).a($$3, ((cwr.a)$$1x.getSecond()).b()), $$1x -> Pair.of($$1x, $$3.a($$1x))
      );
   }

   public ImmutableList<S> a() {
      return this.d;
   }

   public S b() {
      return (S)this.d.get(0);
   }

   public O c() {
      return this.b;
   }

   public Collection<cwr<?>> d() {
      return this.c.values();
   }

   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("block", this.b)
         .add("properties", this.c.values().stream().map(cwr::f).collect(Collectors.toList()))
         .toString();
   }

   @Nullable
   public cwr<?> a(String $$0) {
      return (cwr<?>)this.c.get($$0);
   }

   public static class a<O, S extends cvq<O, S>> {
      private final O a;
      private final Map<String, cwr<?>> b = Maps.newHashMap();

      public a(O $$0) {
         this.a = $$0;
      }

      public cvp.a<O, S> a(cwr<?>... $$0) {
         for(cwr<?> $$1 : $$0) {
            this.a($$1);
            this.b.put($$1.f(), $$1);
         }

         return this;
      }

      private <T extends Comparable<T>> void a(cwr<T> $$0) {
         String $$1 = $$0.f();
         if (!cvp.a.matcher($$1).matches()) {
            throw new IllegalArgumentException(this.a + " has invalidly named property: " + $$1);
         } else {
            Collection<T> $$2 = $$0.a();
            if ($$2.size() <= 1) {
               throw new IllegalArgumentException(this.a + " attempted use property " + $$1 + " with <= 1 possible values");
            } else {
               for(T $$3 : $$2) {
                  String $$4 = $$0.a($$3);
                  if (!cvp.a.matcher($$4).matches()) {
                     throw new IllegalArgumentException(this.a + " has property: " + $$1 + " with invalidly named value: " + $$4);
                  }
               }

               if (this.b.containsKey($$1)) {
                  throw new IllegalArgumentException(this.a + " has duplicate property: " + $$1);
               }
            }
         }
      }

      public cvp<O, S> a(Function<O, S> $$0, cvp.b<O, S> $$1) {
         return new cvp<>($$0, this.a, $$1, this.b);
      }
   }

   public interface b<O, S> {
      S create(O var1, ImmutableMap<cwr<?>, Comparable<?>> var2, MapCodec<S> var3);
   }
}
