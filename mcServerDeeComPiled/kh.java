import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class kh<T> {
   final String a;
   final Function<T, JsonElement> b;

   public kh(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public kh<T>.a a(T $$0) {
      return new kh.a($$0);
   }

   public String toString() {
      return this.a;
   }

   public class a {
      private final T b;

      public a(T $$1) {
         this.b = $$1;
      }

      public kh<T> a() {
         return kh.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(kh.this.a, (JsonElement)kh.this.b.apply(this.b));
      }

      public String toString() {
         return kh.this.a + "=" + this.b;
      }
   }
}
