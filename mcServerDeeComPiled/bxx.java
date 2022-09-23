import java.util.Collections;
import javax.annotation.Nullable;

public interface bxx {
   void a(@Nullable cdp<?> var1);

   @Nullable
   cdp<?> d();

   default void b(buc $$0) {
      cdp<?> $$1 = this.d();
      if ($$1 != null && !$$1.T_()) {
         $$0.a(Collections.singleton($$1));
         this.a(null);
      }

   }

   default boolean a(cgx $$0, agh $$1, cdp<?> $$2) {
      if (!$$2.T_() && $$0.W().b(cgt.v) && !$$1.E().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
