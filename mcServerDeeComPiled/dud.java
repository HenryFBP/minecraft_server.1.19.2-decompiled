import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class dud extends dtn {
   final ccs a;

   dud(dux[] $$0, ccs $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dtp a() {
      return dtq.y;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      ccu.a($$0, this.a);
      return $$0;
   }

   public static dtn.a<?> a(ccs $$0) {
      return a($$1 -> new dud($$1, $$0));
   }

   public static class a extends dtn.c<dud> {
      public void a(JsonObject $$0, dud $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("id", hm.Z.b($$1.a).toString());
      }

      public dud a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         String $$3 = alz.h($$0, "id");
         ccs $$4 = (ccs)hm.Z.b(abb.a($$3)).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$3 + "'"));
         return new dud($$2, $$4);
      }
   }
}
