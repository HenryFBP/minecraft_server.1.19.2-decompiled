import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import javax.annotation.Nullable;

public class bt implements bp {
   public static final bt b = new bt(false);
   private static final String c = "in_open_water";
   private final boolean d;

   private bt(boolean $$0) {
      this.d = $$0;
   }

   public static bt a(boolean $$0) {
      return new bt($$0);
   }

   public static bt a(JsonObject $$0) {
      JsonElement $$1 = $$0.get("in_open_water");
      return $$1 != null ? new bt(alz.c($$1, "in_open_water")) : b;
   }

   @Override
   public JsonObject a() {
      if (this == b) {
         return new JsonObject();
      } else {
         JsonObject $$0 = new JsonObject();
         $$0.add("in_open_water", new JsonPrimitive(this.d));
         return $$0;
      }
   }

   @Override
   public bp.a c() {
      return bp.b.c;
   }

   @Override
   public boolean a(bbn $$0, agg $$1, @Nullable dwq $$2) {
      if (this == b) {
         return true;
      } else if (!($$0 instanceof buq)) {
         return false;
      } else {
         buq $$3 = (buq)$$0;
         return this.d == $$3.h();
      }
   }
}
