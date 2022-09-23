import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface rb {
   static rb a(final Runnable $$0) {
      return new rb() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public tc<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static rb a(final Supplier<tc<?>> $$0) {
      return new rb() {
         @Nullable
         @Override
         public tc<?> b() {
            return (tc<?>)$$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default tc<?> b() {
      return null;
   }
}
