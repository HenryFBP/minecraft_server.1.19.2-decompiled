import com.google.gson.JsonObject;
import java.util.function.Function;

public class cdz<T extends cdp<?>> implements cdr<T> {
   private final Function<abb, T> v;

   public cdz(Function<abb, T> $$0) {
      this.v = $$0;
   }

   @Override
   public T a(abb $$0, JsonObject $$1) {
      return (T)this.v.apply($$0);
   }

   @Override
   public T a(abb $$0, qx $$1) {
      return (T)this.v.apply($$0);
   }

   @Override
   public void a(qx $$0, T $$1) {
   }
}
