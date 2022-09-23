import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dvg implements dux {
   final dvs a;
   final dsb b;

   dvg(dvs $$0, dsb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.q;
   }

   @Override
   public Set<dui<?>> b() {
      return Sets.union(this.a.b(), this.b.a());
   }

   public boolean a(dsd $$0) {
      return this.b.b($$0, this.a.a($$0));
   }

   public static dux.a a(dvs $$0, dsb $$1) {
      return () -> new dvg($$0, $$1);
   }

   public static class a implements dsj<dvg> {
      public void a(JsonObject $$0, dvg $$1, JsonSerializationContext $$2) {
         $$0.add("value", $$2.serialize($$1.a));
         $$0.add("range", $$2.serialize($$1.b));
      }

      public dvg b(JsonObject $$0, JsonDeserializationContext $$1) {
         dvs $$2 = alz.a($$0, "value", $$1, dvs.class);
         dsb $$3 = alz.a($$0, "range", $$1, dsb.class);
         return new dvg($$2, $$3);
      }
   }
}
