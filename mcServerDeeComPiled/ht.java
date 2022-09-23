import com.mojang.serialization.Lifecycle;
import java.util.OptionalInt;

public abstract class ht<T> extends hm<T> {
   public ht(aba<? extends hm<T>> $$0, Lifecycle $$1) {
      super($$0, $$1);
   }

   public abstract hc<T> a(int var1, aba<T> var2, T var3, Lifecycle var4);

   public abstract hc<T> a(aba<T> var1, T var2, Lifecycle var3);

   public abstract hc<T> a(OptionalInt var1, aba<T> var2, T var3, Lifecycle var4);

   public abstract boolean j();
}
