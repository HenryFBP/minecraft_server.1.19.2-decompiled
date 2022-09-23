import java.util.function.Function;

public interface duq<T extends duq<T>> {
   T b(dux.a var1);

   default <E> T a_(Iterable<E> $$0, Function<E, dux.a> $$1) {
      T $$2 = this.d();

      for(E $$3 : $$0) {
         $$2 = $$2.b((dux.a)$$1.apply($$3));
      }

      return $$2;
   }

   T d();
}
