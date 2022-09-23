import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dvb implements dux {
   static final dvb a = new dvb();

   private dvb() {
   }

   @Override
   public duy a() {
      return duz.f;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.b);
   }

   public boolean a(dsd $$0) {
      return $$0.a(dul.b);
   }

   public static dux.a c() {
      return () -> a;
   }

   public static class a implements dsj<dvb> {
      public void a(JsonObject $$0, dvb $$1, JsonSerializationContext $$2) {
      }

      public dvb b(JsonObject $$0, JsonDeserializationContext $$1) {
         return dvb.a;
      }
   }
}
