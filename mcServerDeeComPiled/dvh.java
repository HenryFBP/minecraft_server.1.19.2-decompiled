import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import javax.annotation.Nullable;

public class dvh implements dux {
   @Nullable
   final Boolean a;
   @Nullable
   final Boolean b;

   dvh(@Nullable Boolean $$0, @Nullable Boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.n;
   }

   public boolean a(dsd $$0) {
      agg $$1 = $$0.c();
      if (this.a != null && this.a != $$1.Y()) {
         return false;
      } else {
         return this.b == null || this.b == $$1.X();
      }
   }

   public static dvh.a c() {
      return new dvh.a();
   }

   public static class a implements dux.a {
      @Nullable
      private Boolean a;
      @Nullable
      private Boolean b;

      public dvh.a a(@Nullable Boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dvh.a b(@Nullable Boolean $$0) {
         this.b = $$0;
         return this;
      }

      public dvh a() {
         return new dvh(this.a, this.b);
      }
   }

   public static class b implements dsj<dvh> {
      public void a(JsonObject $$0, dvh $$1, JsonSerializationContext $$2) {
         $$0.addProperty("raining", $$1.a);
         $$0.addProperty("thundering", $$1.b);
      }

      public dvh b(JsonObject $$0, JsonDeserializationContext $$1) {
         Boolean $$2 = $$0.has("raining") ? alz.j($$0, "raining") : null;
         Boolean $$3 = $$0.has("thundering") ? alz.j($$0, "thundering") : null;
         return new dvh($$2, $$3);
      }
   }
}
