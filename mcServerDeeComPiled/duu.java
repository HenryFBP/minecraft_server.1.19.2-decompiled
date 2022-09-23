import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class duu implements dux {
   final dux a;

   duu(dux $$0) {
      this.a = $$0;
   }

   @Override
   public duy a() {
      return duz.a;
   }

   public final boolean a(dsd $$0) {
      return !this.a.test($$0);
   }

   @Override
   public Set<dui<?>> b() {
      return this.a.b();
   }

   @Override
   public void a(dsl $$0) {
      dux.super.a($$0);
      this.a.a($$0);
   }

   public static dux.a a(dux.a $$0) {
      duu $$1 = new duu($$0.build());
      return () -> $$1;
   }

   public static class a implements dsj<duu> {
      public void a(JsonObject $$0, duu $$1, JsonSerializationContext $$2) {
         $$0.add("term", $$2.serialize($$1.a));
      }

      public duu b(JsonObject $$0, JsonDeserializationContext $$1) {
         dux $$2 = alz.a($$0, "term", $$1, dux.class);
         return new duu($$2);
      }
   }
}
