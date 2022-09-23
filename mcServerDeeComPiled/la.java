import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class la {
   final cdz<?> a;

   public la(cdz<?> $$0) {
      this.a = $$0;
   }

   public static la a(cdz<?> $$0) {
      return new la($$0);
   }

   public void a(Consumer<kt> $$0, final String $$1) {
      $$0.accept(new kt() {
         @Override
         public void a(JsonObject $$0) {
         }

         @Override
         public cdr<?> c() {
            return la.this.a;
         }

         @Override
         public abb b() {
            return new abb($$1);
         }

         @Nullable
         @Override
         public JsonObject d() {
            return null;
         }

         @Override
         public abb e() {
            return new abb("");
         }
      });
   }
}
