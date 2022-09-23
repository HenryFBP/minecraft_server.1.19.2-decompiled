import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class dvx implements dwa {
   final dsd.c a;

   dvx(dsd.c $$0) {
      this.a = $$0;
   }

   public static dwa a(dsd.c $$0) {
      return new dvx($$0);
   }

   @Override
   public dvz a() {
      return dwb.b;
   }

   @Nullable
   @Override
   public String a(dsd $$0) {
      bbn $$1 = $$0.c(this.a.a());
      return $$1 != null ? $$1.cq() : null;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(this.a.a());
   }

   public static class a implements dsa.b<dvx> {
      public JsonElement a(dvx $$0, JsonSerializationContext $$1) {
         return $$1.serialize($$0.a);
      }

      public dvx b(JsonElement $$0, JsonDeserializationContext $$1) {
         dsd.c $$2 = (dsd.c)$$1.deserialize($$0, dsd.c.class);
         return new dvx($$2);
      }
   }

   public static class b implements dsj<dvx> {
      public void a(JsonObject $$0, dvx $$1, JsonSerializationContext $$2) {
         $$0.addProperty("target", $$1.a.name());
      }

      public dvx b(JsonObject $$0, JsonDeserializationContext $$1) {
         dsd.c $$2 = alz.a($$0, "target", $$1, dsd.c.class);
         return new dvx($$2);
      }
   }
}
