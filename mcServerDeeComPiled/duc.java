import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class duc extends dtn {
   final pj a;

   duc(dux[] $$0, pj $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dtp a() {
      return dtq.f;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      $$0.v().a(this.a);
      return $$0;
   }

   @Deprecated
   public static dtn.a<?> a(pj $$0) {
      return a($$1 -> new duc($$1, $$0));
   }

   public static class a extends dtn.c<duc> {
      public void a(JsonObject $$0, duc $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("tag", $$1.a.toString());
      }

      public duc a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         try {
            pj $$3 = qd.a(alz.h($$0, "tag"));
            return new duc($$2, $$3);
         } catch (CommandSyntaxException var5) {
            throw new JsonSyntaxException(var5.getMessage());
         }
      }
   }
}
