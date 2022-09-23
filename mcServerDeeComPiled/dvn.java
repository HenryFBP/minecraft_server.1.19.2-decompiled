import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class dvn implements dvl {
   final abb a;

   dvn(abb $$0) {
      this.a = $$0;
   }

   @Override
   public dvk a() {
      return dvm.a;
   }

   @Nullable
   @Override
   public qc a(dsd $$0) {
      return $$0.c().n().aG().a(this.a);
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of();
   }

   public static class a implements dsj<dvn> {
      public void a(JsonObject $$0, dvn $$1, JsonSerializationContext $$2) {
         $$0.addProperty("source", $$1.a.toString());
      }

      public dvn b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = alz.h($$0, "source");
         return new dvn(new abb($$2));
      }
   }
}
