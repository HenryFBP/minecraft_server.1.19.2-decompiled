import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class dvj implements dvl {
   private static final String b = "block_entity";
   private static final dvj.a c = new dvj.a() {
      @Override
      public qc a(dsd $$0) {
         cti $$1 = $$0.c(dul.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<dui<?>> b() {
         return ImmutableSet.of(dul.h);
      }
   };
   public static final dvj a = new dvj(c);
   final dvj.a d;

   private static dvj.a b(final dsd.c $$0) {
      return new dvj.a() {
         @Nullable
         @Override
         public qc a(dsd $$0x) {
            bbn $$1 = $$0.c($$0.a());
            return $$1 != null ? cl.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<dui<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private dvj(dvj.a $$0) {
      this.d = $$0;
   }

   @Override
   public dvk a() {
      return dvm.b;
   }

   @Nullable
   @Override
   public qc a(dsd $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<dui<?>> b() {
      return this.d.b();
   }

   public static dvl a(dsd.c $$0) {
      return new dvj(b($$0));
   }

   static dvj a(String $$0) {
      if ($$0.equals("block_entity")) {
         return new dvj(c);
      } else {
         dsd.c $$1 = dsd.c.a($$0);
         return new dvj(b($$1));
      }
   }

   interface a {
      @Nullable
      qc a(dsd var1);

      String a();

      Set<dui<?>> b();
   }

   public static class b implements dsa.b<dvj> {
      public JsonElement a(dvj $$0, JsonSerializationContext $$1) {
         return new JsonPrimitive($$0.d.a());
      }

      public dvj b(JsonElement $$0, JsonDeserializationContext $$1) {
         String $$2 = $$0.getAsString();
         return dvj.a($$2);
      }
   }

   public static class c implements dsj<dvj> {
      public void a(JsonObject $$0, dvj $$1, JsonSerializationContext $$2) {
         $$0.addProperty("target", $$1.d.a());
      }

      public dvj b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = alz.h($$0, "target");
         return dvj.a($$2);
      }
   }
}
