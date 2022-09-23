import com.google.common.base.Joiner;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public abstract class bq {
   public static final bq a = new bq() {
      @Override
      public boolean a(bbr<?> $$0) {
         return true;
      }

      @Override
      public JsonElement a() {
         return JsonNull.INSTANCE;
      }
   };
   private static final Joiner b = Joiner.on(", ");

   public abstract boolean a(bbr<?> var1);

   public abstract JsonElement a();

   public static bq a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         String $$1 = alz.a($$0, "type");
         if ($$1.startsWith("#")) {
            abb $$2 = new abb($$1.substring(1));
            return new bq.a(akz.a(hm.j, $$2));
         } else {
            abb $$3 = new abb($$1);
            bbr<?> $$4 = (bbr)hm.X
               .b($$3)
               .orElseThrow(() -> new JsonSyntaxException("Unknown entity type '" + $$3 + "', valid types are: " + b.join(hm.X.d())));
            return new bq.b($$4);
         }
      } else {
         return a;
      }
   }

   public static bq b(bbr<?> $$0) {
      return new bq.b($$0);
   }

   public static bq a(akz<bbr<?>> $$0) {
      return new bq.a($$0);
   }

   static class a extends bq {
      private final akz<bbr<?>> b;

      public a(akz<bbr<?>> $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a(bbr<?> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public JsonElement a() {
         return new JsonPrimitive("#" + this.b.b());
      }
   }

   static class b extends bq {
      private final bbr<?> b;

      public b(bbr<?> $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a(bbr<?> $$0) {
         return this.b == $$0;
      }

      @Override
      public JsonElement a() {
         return new JsonPrimitive(hm.X.b(this.b).toString());
      }
   }
}
