import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dup implements dux {
   private static final Logger a = LogUtils.getLogger();
   final abb b;

   dup(abb $$0) {
      this.b = $$0;
   }

   @Override
   public duy a() {
      return duz.o;
   }

   @Override
   public void a(dsl $$0) {
      if ($$0.b(this.b)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         dux.super.a($$0);
         dux $$1 = $$0.d(this.b);
         if ($$1 == null) {
            $$0.a("Unknown condition table called " + this.b);
         } else {
            $$1.a($$0.a(".{" + this.b + "}", this.b));
         }

      }
   }

   public boolean a(dsd $$0) {
      dux $$1 = $$0.b(this.b);
      if ($$1 == null) {
         a.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else if ($$0.a($$1)) {
         boolean var3;
         try {
            var3 = $$1.test($$0);
         } finally {
            $$0.b($$1);
         }

         return var3;
      } else {
         a.warn("Detected infinite loop in loot tables");
         return false;
      }
   }

   public static dux.a a(abb $$0) {
      return () -> new dup($$0);
   }

   public static class a implements dsj<dup> {
      public void a(JsonObject $$0, dup $$1, JsonSerializationContext $$2) {
         $$0.addProperty("name", $$1.b.toString());
      }

      public dup b(JsonObject $$0, JsonDeserializationContext $$1) {
         abb $$2 = new abb(alz.h($$0, "name"));
         return new dup($$2);
      }
   }
}
