import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public record amb<T extends Comparable<T>>(T b, T c) {
   public static final Codec<amb<Integer>> a = a(Codec.INT);

   public amb(T $$0, T $$1) {
      if ($$0.compareTo($$1) > 0) {
         throw new IllegalArgumentException("min_inclusive must be less than or equal to max_inclusive");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   public static <T extends Comparable<T>> Codec<amb<T>> a(Codec<T> $$0) {
      return alq.a($$0, "min_inclusive", "max_inclusive", amb::a, amb::a, amb::b);
   }

   public static <T extends Comparable<T>> Codec<amb<T>> a(Codec<T> $$0, T $$1, T $$2) {
      Function<amb<T>, DataResult<amb<T>>> $$3 = $$2x -> {
         if ($$2x.a().compareTo($$1) < 0) {
            return DataResult.error("Range limit too low, expected at least " + $$1 + " [" + $$2x.a() + "-" + $$2x.b() + "]");
         } else {
            return $$2x.b().compareTo($$2) > 0
               ? DataResult.error("Range limit too high, expected at most " + $$2 + " [" + $$2x.a() + "-" + $$2x.b() + "]")
               : DataResult.success($$2x);
         }
      };
      return a($$0).flatXmap($$3, $$3);
   }

   public static <T extends Comparable<T>> DataResult<amb<T>> a(T $$0, T $$1) {
      return $$0.compareTo($$1) <= 0 ? DataResult.success(new amb($$0, $$1)) : DataResult.error("min_inclusive must be less than or equal to max_inclusive");
   }

   public boolean a(T $$0) {
      return $$0.compareTo(this.b) >= 0 && $$0.compareTo(this.c) <= 0;
   }

   public boolean a(amb<T> $$0) {
      return $$0.a().compareTo(this.b) >= 0 && $$0.c.compareTo(this.c) <= 0;
   }

   public String toString() {
      return "[" + this.b + ", " + this.c + "]";
   }

   public T a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
