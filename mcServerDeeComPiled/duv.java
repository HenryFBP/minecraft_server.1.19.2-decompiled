import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class duv implements dux {
   final ch a;
   final gt b;

   duv(ch $$0, gt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.m;
   }

   public boolean a(dsd $$0) {
      dwq $$1 = $$0.c(dul.f);
      return $$1 != null && this.a.a($$0.c(), $$1.a() + (double)this.b.u(), $$1.b() + (double)this.b.v(), $$1.c() + (double)this.b.w());
   }

   public static dux.a a(ch.a $$0) {
      return () -> new duv($$0.b(), gt.b);
   }

   public static dux.a a(ch.a $$0, gt $$1) {
      return () -> new duv($$0.b(), $$1);
   }

   public static class a implements dsj<duv> {
      public void a(JsonObject $$0, duv $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
         if ($$1.b.u() != 0) {
            $$0.addProperty("offsetX", $$1.b.u());
         }

         if ($$1.b.v() != 0) {
            $$0.addProperty("offsetY", $$1.b.v());
         }

         if ($$1.b.w() != 0) {
            $$0.addProperty("offsetZ", $$1.b.w());
         }

      }

      public duv b(JsonObject $$0, JsonDeserializationContext $$1) {
         ch $$2 = ch.a($$0.get("predicate"));
         int $$3 = alz.a($$0, "offsetX", 0);
         int $$4 = alz.a($$0, "offsetY", 0);
         int $$5 = alz.a($$0, "offsetZ", 0);
         return new duv($$2, new gt($$3, $$4, $$5));
      }
   }
}
