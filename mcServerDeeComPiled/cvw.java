import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvw implements Predicate<cvo> {
   private static final cvw a = new cvw(dpz.a) {
      @Override
      public boolean a(@Nullable cvo $$0) {
         return $$0 != null && $$0.h();
      }
   };
   private final dpz b;

   cvw(dpz $$0) {
      this.b = $$0;
   }

   public static cvw a(dpz $$0) {
      return $$0 == dpz.a ? a : new cvw($$0);
   }

   public boolean a(@Nullable cvo $$0) {
      return $$0 != null && $$0.d() == this.b;
   }
}
