import java.util.Arrays;
import java.util.function.Function;

public interface dtl<T extends dtl<T>> {
   T b(dto.a var1);

   default <E> T a(Iterable<E> $$0, Function<E, dto.a> $$1) {
      T $$2 = this.c();

      for(E $$3 : $$0) {
         $$2 = $$2.b((dto.a)$$1.apply($$3));
      }

      return $$2;
   }

   default <E> T a(E[] $$0, Function<E, dto.a> $$1) {
      return this.a(Arrays.asList($$0), $$1);
   }

   T c();
}
