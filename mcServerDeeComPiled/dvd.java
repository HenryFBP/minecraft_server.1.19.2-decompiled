import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dvd implements dux {
   final float a;
   final float b;

   dvd(float $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.d;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.d);
   }

   public boolean a(dsd $$0) {
      bbn $$1 = $$0.c(dul.d);
      int $$2 = 0;
      if ($$1 instanceof bcc) {
         $$2 = cet.h((bcc)$$1);
      }

      return $$0.a().i() < this.a + (float)$$2 * this.b;
   }

   public static dux.a a(float $$0, float $$1) {
      return () -> new dvd($$0, $$1);
   }

   public static class a implements dsj<dvd> {
      public void a(JsonObject $$0, dvd $$1, JsonSerializationContext $$2) {
         $$0.addProperty("chance", $$1.a);
         $$0.addProperty("looting_multiplier", $$1.b);
      }

      public dvd b(JsonObject $$0, JsonDeserializationContext $$1) {
         return new dvd(alz.l($$0, "chance"), alz.l($$0, "looting_multiplier"));
      }
   }
}
