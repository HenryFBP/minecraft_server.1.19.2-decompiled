import java.util.List;
import java.util.Optional;

public class ayw {
   private ayw() {
   }

   public static int a(List<? extends ayv> $$0) {
      long $$1 = 0L;

      for(ayv $$2 : $$0) {
         $$1 += (long)$$2.a().a();
      }

      if ($$1 > 2147483647L) {
         throw new IllegalArgumentException("Sum of weights must be <= 2147483647");
      } else {
         return (int)$$1;
      }
   }

   public static <T extends ayv> Optional<T> a(amn $$0, List<T> $$1, int $$2) {
      if ($$2 < 0) {
         throw (IllegalArgumentException)ad.c((T)(new IllegalArgumentException("Negative total weight in getRandomItem")));
      } else if ($$2 == 0) {
         return Optional.empty();
      } else {
         int $$3 = $$0.a($$2);
         return a($$1, $$3);
      }
   }

   public static <T extends ayv> Optional<T> a(List<T> $$0, int $$1) {
      for(T $$2 : $$0) {
         $$1 -= $$2.a().a();
         if ($$1 < 0) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   public static <T extends ayv> Optional<T> a(amn $$0, List<T> $$1) {
      return a($$0, $$1, a($$1));
   }
}
