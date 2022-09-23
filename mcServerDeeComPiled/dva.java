import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dva implements dux {
   final bo a;
   final dsd.c b;

   dva(bo $$0, dsd.c $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.e;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.f, this.b.a());
   }

   public boolean a(dsd $$0) {
      bbn $$1 = $$0.c(this.b.a());
      dwq $$2 = $$0.c(dul.f);
      return this.a.a($$0.c(), $$2, $$1);
   }

   public static dux.a a(dsd.c $$0) {
      return a($$0, bo.a.a());
   }

   public static dux.a a(dsd.c $$0, bo.a $$1) {
      return () -> new dva($$1.b(), $$0);
   }

   public static dux.a a(dsd.c $$0, bo $$1) {
      return () -> new dva($$1, $$0);
   }

   public static class a implements dsj<dva> {
      public void a(JsonObject $$0, dva $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
         $$0.add("entity", $$2.serialize($$1.b));
      }

      public dva b(JsonObject $$0, JsonDeserializationContext $$1) {
         bo $$2 = bo.a($$0.get("predicate"));
         return new dva($$2, alz.a($$0, "entity", $$1, dsd.c.class));
      }
   }
}
