import com.google.common.base.Suppliers;
import java.util.function.Supplier;

@Deprecated
public class amd<T> {
   private final Supplier<T> a;

   public amd(Supplier<T> $$0) {
      this.a = Suppliers.memoize($$0::get);
   }

   public T a() {
      return (T)this.a.get();
   }
}
