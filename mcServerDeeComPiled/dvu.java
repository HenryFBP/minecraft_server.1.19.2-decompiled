import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dvu implements dvs {
   final dwa a;
   final String b;
   final float c;

   dvu(dwa $$0, String $$1, float $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public dvr a() {
      return dvt.d;
   }

   @Override
   public Set<dui<?>> b() {
      return this.a.b();
   }

   public static dvu a(dsd.c $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static dvu a(dsd.c $$0, String $$1, float $$2) {
      return new dvu(dvx.a($$0), $$1, $$2);
   }

   @Override
   public float b(dsd $$0) {
      String $$1 = this.a.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         dxo $$2 = $$0.c().f();
         dxl $$3 = $$2.d(this.b);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.c;
         }
      }
   }

   public static class a implements dsj<dvu> {
      public dvu b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = alz.h($$0, "score");
         float $$3 = alz.a($$0, "scale", 1.0F);
         dwa $$4 = alz.a($$0, "target", $$1, dwa.class);
         return new dvu($$4, $$2, $$3);
      }

      public void a(JsonObject $$0, dvu $$1, JsonSerializationContext $$2) {
         $$0.addProperty("score", $$1.b);
         $$0.add("target", $$2.serialize($$1.a));
         $$0.addProperty("scale", $$1.c);
      }
   }
}
