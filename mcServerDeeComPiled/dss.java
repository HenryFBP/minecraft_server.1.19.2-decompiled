import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public class dss extends dsx {
   final cat i;

   dss(cat $$0, int $$1, int $$2, dux[] $$3, dto[] $$4) {
      super($$1, $$2, $$3, $$4);
      this.i = $$0;
   }

   @Override
   public dsw a() {
      return dst.b;
   }

   @Override
   public void a(Consumer<cax> $$0, dsd $$1) {
      $$0.accept(new cax(this.i));
   }

   public static dsx.a<?> a(cgw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new dss($$0.l(), $$1, $$2, $$3, $$4));
   }

   public static class a extends dsx.e<dss> {
      public void a(JsonObject $$0, dss $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         abb $$3 = hm.Y.b($$1.i);
         if ($$3 == null) {
            throw new IllegalArgumentException("Can't serialize unknown item " + $$1.i);
         } else {
            $$0.addProperty("name", $$3.toString());
         }
      }

      protected dss a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, dux[] $$4, dto[] $$5) {
         cat $$6 = alz.i($$0, "name");
         return new dss($$6, $$2, $$3, $$4, $$5);
      }
   }
}
