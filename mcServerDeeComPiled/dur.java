import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dur implements dux {
   final bd a;

   dur(bd $$0) {
      this.a = $$0;
   }

   @Override
   public duy a() {
      return duz.l;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.f, dul.c);
   }

   public boolean a(dsd $$0) {
      baw $$1 = $$0.c(dul.c);
      dwq $$2 = $$0.c(dul.f);
      return $$2 != null && $$1 != null && this.a.a($$0.c(), $$2, $$1);
   }

   public static dux.a a(bd.a $$0) {
      return () -> new dur($$0.b());
   }

   public static class a implements dsj<dur> {
      public void a(JsonObject $$0, dur $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
      }

      public dur b(JsonObject $$0, JsonDeserializationContext $$1) {
         bd $$2 = bd.a($$0.get("predicate"));
         return new dur($$2);
      }
   }
}
