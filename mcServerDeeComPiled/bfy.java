import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class bfy<U> {
   protected final List<bfy.a<U>> a;
   private final amn b = amn.a();

   public bfy() {
      this.a = Lists.newArrayList();
   }

   private bfy(List<bfy.a<U>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public static <U> Codec<bfy<U>> a(Codec<U> $$0) {
      return bfy.a.a($$0).listOf().xmap(bfy::new, $$0x -> $$0x.a);
   }

   public bfy<U> a(U $$0, int $$1) {
      this.a.add(new bfy.a<>($$0, $$1));
      return this;
   }

   public bfy<U> a() {
      this.a.forEach($$0 -> $$0.a(this.b.i()));
      this.a.sort(Comparator.comparingDouble(bfy.a::c));
      return this;
   }

   public Stream<U> b() {
      return this.a.stream().map(bfy.a::a);
   }

   public String toString() {
      return "ShufflingList[" + this.a + "]";
   }

   public static class a<T> {
      final T a;
      final int b;
      private double c;

      a(T $$0, int $$1) {
         this.b = $$1;
         this.a = $$0;
      }

      private double c() {
         return this.c;
      }

      void a(float $$0) {
         this.c = -Math.pow((double)$$0, (double)(1.0F / (float)this.b));
      }

      public T a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public String toString() {
         return this.b + ":" + this.a;
      }

      public static <E> Codec<bfy.a<E>> a(final Codec<E> $$0) {
         return new Codec<bfy.a<E>>() {
            public <T> DataResult<Pair<bfy.a<E>, T>> decode(DynamicOps<T> $$0x, T $$1) {
               Dynamic<T> $$2 = new Dynamic($$0, $$1);
               return $$2.get("data").flatMap($$0::parse).map($$1x -> new bfy.a<>($$1x, $$2.get("weight").asInt(1))).map($$1x -> Pair.of($$1x, $$0.empty()));
            }

            public <T> DataResult<T> a(bfy.a<E> $$0x, DynamicOps<T> $$1, T $$2) {
               return $$1.mapBuilder().add("weight", $$1.createInt($$0.b)).add("data", $$0.encodeStart($$1, $$0.a)).build($$2);
            }
         };
      }
   }
}
