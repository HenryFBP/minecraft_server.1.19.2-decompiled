import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dve implements dux {
   final ca a;

   public dve(ca $$0) {
      this.a = $$0;
   }

   @Override
   public duy a() {
      return duz.i;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.i);
   }

   public boolean a(dsd $$0) {
      cax $$1 = $$0.c(dul.i);
      return $$1 != null && this.a.a($$1);
   }

   public static dux.a a(ca.a $$0) {
      return () -> new dve($$0.b());
   }

   public static class a implements dsj<dve> {
      public void a(JsonObject $$0, dve $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
      }

      public dve b(JsonObject $$0, JsonDeserializationContext $$1) {
         ca $$2 = ca.a($$0.get("predicate"));
         return new dve($$2);
      }
   }
}
