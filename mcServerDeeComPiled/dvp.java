import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public final class dvp implements dvs {
   final dvs a;
   final dvs b;

   dvp(dvs $$0, dvs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dvr a() {
      return dvt.c;
   }

   @Override
   public int a(dsd $$0) {
      int $$1 = this.a.a($$0);
      float $$2 = this.b.b($$0);
      amn $$3 = $$0.a();
      int $$4 = 0;

      for(int $$5 = 0; $$5 < $$1; ++$$5) {
         if ($$3.i() < $$2) {
            ++$$4;
         }
      }

      return $$4;
   }

   @Override
   public float b(dsd $$0) {
      return (float)this.a($$0);
   }

   public static dvp a(int $$0, float $$1) {
      return new dvp(dvq.a((float)$$0), dvq.a($$1));
   }

   @Override
   public Set<dui<?>> b() {
      return Sets.union(this.a.b(), this.b.b());
   }

   public static class a implements dsj<dvp> {
      public dvp b(JsonObject $$0, JsonDeserializationContext $$1) {
         dvs $$2 = alz.a($$0, "n", $$1, dvs.class);
         dvs $$3 = alz.a($$0, "p", $$1, dvs.class);
         return new dvp($$2, $$3);
      }

      public void a(JsonObject $$0, dvp $$1, JsonSerializationContext $$2) {
         $$0.add("n", $$2.serialize($$1.a));
         $$0.add("p", $$2.serialize($$1.b));
      }
   }
}
