import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class dvc implements dux {
   final float a;

   dvc(float $$0) {
      this.a = $$0;
   }

   @Override
   public duy a() {
      return duz.c;
   }

   public boolean a(dsd $$0) {
      return $$0.a().i() < this.a;
   }

   public static dux.a a(float $$0) {
      return () -> new dvc($$0);
   }

   public static class a implements dsj<dvc> {
      public void a(JsonObject $$0, dvc $$1, JsonSerializationContext $$2) {
         $$0.addProperty("chance", $$1.a);
      }

      public dvc b(JsonObject $$0, JsonDeserializationContext $$1) {
         return new dvc(alz.l($$0, "chance"));
      }
   }
}
