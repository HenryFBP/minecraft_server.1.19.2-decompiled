import javax.annotation.Nullable;

public interface baa {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof baa) {
         ((baa)$$0).a();
      }

   }
}
