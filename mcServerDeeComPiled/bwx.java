import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface bwx {
   bwx a = new bwx() {
      @Override
      public <T> Optional<T> a(BiFunction<cgx, gt, T> $$0) {
         return Optional.empty();
      }
   };

   static bwx a(final cgx $$0, final gt $$1) {
      return new bwx() {
         @Override
         public <T> Optional<T> a(BiFunction<cgx, gt, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cgx, gt, T> var1);

   default <T> T a(BiFunction<cgx, gt, T> $$0, T $$1) {
      return (T)this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cgx, gt> $$0) {
      this.a((BiFunction)(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      }));
   }
}
