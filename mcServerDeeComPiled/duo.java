import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class duo implements dux {
   final cer a;
   final float[] b;

   duo(cer $$0, float[] $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.j;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.i);
   }

   public boolean a(dsd $$0) {
      cax $$1 = $$0.c(dul.i);
      int $$2 = $$1 != null ? cet.a(this.a, $$1) : 0;
      float $$3 = this.b[Math.min($$2, this.b.length - 1)];
      return $$0.a().i() < $$3;
   }

   public static dux.a a(cer $$0, float... $$1) {
      return () -> new duo($$0, $$1);
   }

   public static class a implements dsj<duo> {
      public void a(JsonObject $$0, duo $$1, JsonSerializationContext $$2) {
         $$0.addProperty("enchantment", hm.W.b($$1.a).toString());
         $$0.add("chances", $$2.serialize($$1.b));
      }

      public duo b(JsonObject $$0, JsonDeserializationContext $$1) {
         abb $$2 = new abb(alz.h($$0, "enchantment"));
         cer $$3 = (cer)hm.W.b($$2).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + $$2));
         float[] $$4 = alz.a($$0, "chances", $$1, float[].class);
         return new duo($$3, $$4);
      }
   }
}
