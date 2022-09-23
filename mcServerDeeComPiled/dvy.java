import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class dvy implements dwa {
   final String a;

   dvy(String $$0) {
      this.a = $$0;
   }

   public static dwa a(String $$0) {
      return new dvy($$0);
   }

   @Override
   public dvz a() {
      return dwb.a;
   }

   public String c() {
      return this.a;
   }

   @Nullable
   @Override
   public String a(dsd $$0) {
      return this.a;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of();
   }

   public static class a implements dsj<dvy> {
      public void a(JsonObject $$0, dvy $$1, JsonSerializationContext $$2) {
         $$0.addProperty("name", $$1.a);
      }

      public dvy b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = alz.h($$0, "name");
         return new dvy($$2);
      }
   }
}
