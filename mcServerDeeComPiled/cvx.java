import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvx implements Predicate<cvo> {
   private final cjt a;

   public cvx(cjt $$0) {
      this.a = $$0;
   }

   public static cvx a(cjt $$0) {
      return new cvx($$0);
   }

   public boolean a(@Nullable cvo $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
