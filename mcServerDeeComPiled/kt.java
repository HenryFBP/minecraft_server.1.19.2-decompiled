import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface kt {
   void a(JsonObject var1);

   default JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("type", hm.aj.b(this.c()).toString());
      this.a($$0);
      return $$0;
   }

   abb b();

   cdr<?> c();

   @Nullable
   JsonObject d();

   @Nullable
   abb e();
}
