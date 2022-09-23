import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class dvf implements dux {
   @Nullable
   final Long a;
   final dsb b;

   dvf(@Nullable Long $$0, dsb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.p;
   }

   @Override
   public Set<dui<?>> b() {
      return this.b.a();
   }

   public boolean a(dsd $$0) {
      agg $$1 = $$0.c();
      long $$2 = $$1.V();
      if (this.a != null) {
         $$2 %= this.a;
      }

      return this.b.b($$0, (int)$$2);
   }

   public static dvf.a a(dsb $$0) {
      return new dvf.a($$0);
   }

   public static class a implements dux.a {
      @Nullable
      private Long a;
      private final dsb b;

      public a(dsb $$0) {
         this.b = $$0;
      }

      public dvf.a a(long $$0) {
         this.a = $$0;
         return this;
      }

      public dvf a() {
         return new dvf(this.a, this.b);
      }
   }

   public static class b implements dsj<dvf> {
      public void a(JsonObject $$0, dvf $$1, JsonSerializationContext $$2) {
         $$0.addProperty("period", $$1.a);
         $$0.add("value", $$2.serialize($$1.b));
      }

      public dvf b(JsonObject $$0, JsonDeserializationContext $$1) {
         Long $$2 = $$0.has("period") ? alz.m($$0, "period") : null;
         dsb $$3 = alz.a($$0, "value", $$1, dsb.class);
         return new dvf($$2, $$3);
      }
   }
}
