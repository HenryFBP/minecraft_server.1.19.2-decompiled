import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class dtx extends dtn {
   final akz<caq> a;

   dtx(dux[] $$0, akz<caq> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dtp a() {
      return dtq.z;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      car.a($$0, this.a, $$1.a());
      return $$0;
   }

   public static dtn.a<?> a(akz<caq> $$0) {
      return a($$1 -> new dtx($$1, $$0));
   }

   public static class a extends dtn.c<dtx> {
      public void a(JsonObject $$0, dtx $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("options", "#" + $$1.a.b());
      }

      public dtx a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         String $$3 = alz.h($$0, "options");
         if (!$$3.startsWith("#")) {
            throw new JsonSyntaxException("Inline tag value not supported: " + $$3);
         } else {
            return new dtx($$2, akz.a(hm.bP, new abb($$3.substring(1))));
         }
      }
   }
}
