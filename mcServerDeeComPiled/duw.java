import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Set;

public class duw implements dux {
   final cjt a;
   final cz b;

   duw(cjt $$0, cz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.h;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.g);
   }

   public boolean a(dsd $$0) {
      cvo $$1 = $$0.c(dul.g);
      return $$1 != null && $$1.a(this.a) && this.b.a($$1);
   }

   public static duw.a a(cjt $$0) {
      return new duw.a($$0);
   }

   public static class a implements dux.a {
      private final cjt a;
      private cz b = cz.a;

      public a(cjt $$0) {
         this.a = $$0;
      }

      public duw.a a(cz.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public dux build() {
         return new duw(this.a, this.b);
      }
   }

   public static class b implements dsj<duw> {
      public void a(JsonObject $$0, duw $$1, JsonSerializationContext $$2) {
         $$0.addProperty("block", hm.V.b($$1.a).toString());
         $$0.add("properties", $$1.b.a());
      }

      public duw b(JsonObject $$0, JsonDeserializationContext $$1) {
         abb $$2 = new abb(alz.h($$0, "block"));
         cjt $$3 = (cjt)hm.V.b($$2).orElseThrow(() -> new IllegalArgumentException("Can't find block " + $$2));
         cz $$4 = cz.a($$0.get("properties"));
         $$4.a($$3.k(), $$1x -> {
            throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1x);
         });
         return new duw($$3, $$4);
      }
   }
}
