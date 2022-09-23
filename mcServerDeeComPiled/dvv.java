import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dvv implements dvs {
   final dvs a;
   final dvs b;

   dvv(dvs $$0, dvs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dvr a() {
      return dvt.b;
   }

   public static dvv a(float $$0, float $$1) {
      return new dvv(dvq.a($$0), dvq.a($$1));
   }

   @Override
   public int a(dsd $$0) {
      return ami.a($$0.a(), this.a.a($$0), this.b.a($$0));
   }

   @Override
   public float b(dsd $$0) {
      return ami.a($$0.a(), this.a.b($$0), this.b.b($$0));
   }

   @Override
   public Set<dui<?>> b() {
      return Sets.union(this.a.b(), this.b.b());
   }

   public static class a implements dsj<dvv> {
      public dvv b(JsonObject $$0, JsonDeserializationContext $$1) {
         dvs $$2 = alz.a($$0, "min", $$1, dvs.class);
         dvs $$3 = alz.a($$0, "max", $$1, dvs.class);
         return new dvv($$2, $$3);
      }

      public void a(JsonObject $$0, dvv $$1, JsonSerializationContext $$2) {
         $$0.add("min", $$2.serialize($$1.a));
         $$0.add("max", $$2.serialize($$1.b));
      }
   }
}
