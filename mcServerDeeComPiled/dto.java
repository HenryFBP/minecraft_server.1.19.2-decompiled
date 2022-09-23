import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface dto extends dse, BiFunction<cax, dsd, cax> {
   dtp a();

   static Consumer<cax> a(BiFunction<cax, dsd, cax> $$0, Consumer<cax> $$1, dsd $$2) {
      return $$3 -> $$1.accept((cax)$$0.apply($$3, $$2));
   }

   public interface a {
      dto b();
   }
}
