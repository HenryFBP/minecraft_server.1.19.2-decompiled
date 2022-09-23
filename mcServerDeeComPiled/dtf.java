import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dtf extends dtn {
   final dtf.a a;

   dtf(dux[] $$0, dtf.a $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dtp a() {
      return dtq.n;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(this.a.f);
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      Object $$2 = $$1.c(this.a.f);
      if ($$2 instanceof ban $$3 && $$3.Y()) {
         $$0.a($$3.C_());
      }

      return $$0;
   }

   public static dtn.a<?> a(dtf.a $$0) {
      return a($$1 -> new dtf($$1, $$0));
   }

   public static enum a {
      a("this", dul.a),
      b("killer", dul.d),
      c("killer_player", dul.b),
      d("block_entity", dul.h);

      public final String e;
      public final dui<?> f;

      private a(String $$0, dui<?> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static dtf.a a(String $$0) {
         for(dtf.a $$1 : values()) {
            if ($$1.e.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid name source " + $$0);
      }
   }

   public static class b extends dtn.c<dtf> {
      public void a(JsonObject $$0, dtf $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("source", $$1.a.e);
      }

      public dtf a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         dtf.a $$3 = dtf.a.a(alz.h($$0, "source"));
         return new dtf($$2, $$3);
      }
   }
}
