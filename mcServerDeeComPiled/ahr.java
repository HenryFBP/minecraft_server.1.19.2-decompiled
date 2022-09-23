import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class ahr implements ahp<ahq> {
   public ahq b(JsonObject $$0) {
      rq $$1 = rq.a.a($$0.get("description"));
      if ($$1 == null) {
         throw new JsonParseException("Invalid/missing description!");
      } else {
         int $$2 = alz.n($$0, "pack_format");
         return new ahq($$1, $$2);
      }
   }

   @Override
   public String a() {
      return "pack";
   }
}
