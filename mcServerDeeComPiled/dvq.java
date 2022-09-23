import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;

public final class dvq implements dvs {
   final float a;

   dvq(float $$0) {
      this.a = $$0;
   }

   @Override
   public dvr a() {
      return dvt.a;
   }

   @Override
   public float b(dsd $$0) {
      return this.a;
   }

   public static dvq a(float $$0) {
      return new dvq($$0);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         return Float.compare(((dvq)$$0).a, this.a) == 0;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a != 0.0F ? Float.floatToIntBits(this.a) : 0;
   }

   public static class a implements dsa.b<dvq> {
      public JsonElement a(dvq $$0, JsonSerializationContext $$1) {
         return new JsonPrimitive($$0.a);
      }

      public dvq b(JsonElement $$0, JsonDeserializationContext $$1) {
         return new dvq(alz.e($$0, "value"));
      }
   }

   public static class b implements dsj<dvq> {
      public void a(JsonObject $$0, dvq $$1, JsonSerializationContext $$2) {
         $$0.addProperty("value", $$1.a);
      }

      public dvq b(JsonObject $$0, JsonDeserializationContext $$1) {
         float $$2 = alz.l($$0, "value");
         return new dvq($$2);
      }
   }
}
