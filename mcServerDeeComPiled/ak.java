import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ak {
   @Nullable
   private final an a;

   public ak(an $$0) {
      this.a = $$0;
   }

   public ak() {
      this.a = null;
   }

   public void a(qx $$0) {
   }

   public static ak a(JsonObject $$0, be $$1) {
      abb $$2 = new abb(alz.h($$0, "trigger"));
      am<?> $$3 = aj.a($$2);
      if ($$3 == null) {
         throw new JsonSyntaxException("Invalid criterion trigger: " + $$2);
      } else {
         an $$4 = $$3.a(alz.a($$0, "conditions", new JsonObject()), $$1);
         return new ak($$4);
      }
   }

   public static ak b(qx $$0) {
      return new ak();
   }

   public static Map<String, ak> b(JsonObject $$0, be $$1) {
      Map<String, ak> $$2 = Maps.newHashMap();

      for(Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         $$2.put((String)$$3.getKey(), a(alz.m((JsonElement)$$3.getValue(), "criterion"), $$1));
      }

      return $$2;
   }

   public static Map<String, ak> c(qx $$0) {
      return $$0.a(qx::q, ak::b);
   }

   public static void a(Map<String, ak> $$0, qx $$1) {
      $$1.a($$0, qx::a, ($$0x, $$1x) -> $$1x.a($$0x));
   }

   @Nullable
   public an a() {
      return this.a;
   }

   public JsonElement b() {
      if (this.a == null) {
         throw new JsonSyntaxException("Missing trigger");
      } else {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("trigger", this.a.a().toString());
         JsonObject $$1 = this.a.a(ct.a);
         if ($$1.size() != 0) {
            $$0.add("conditions", $$1);
         }

         return $$0;
      }
   }
}
