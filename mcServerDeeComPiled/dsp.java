import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public class dsp extends dsx {
   final abb i;

   dsp(abb $$0, int $$1, int $$2, dux[] $$3, dto[] $$4) {
      super($$1, $$2, $$3, $$4);
      this.i = $$0;
   }

   @Override
   public dsw a() {
      return dst.d;
   }

   @Override
   public void a(Consumer<cax> $$0, dsd $$1) {
      $$1.a(this.i, $$0);
   }

   public static dsx.a<?> a(abb $$0) {
      return a(($$1, $$2, $$3, $$4) -> new dsp($$0, $$1, $$2, $$3, $$4));
   }

   public static class a extends dsx.e<dsp> {
      public void a(JsonObject $$0, dsp $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("name", $$1.i.toString());
      }

      protected dsp a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, dux[] $$4, dto[] $$5) {
         abb $$6 = new abb(alz.h($$0, "name"));
         return new dsp($$6, $$2, $$3, $$4, $$5);
      }
   }
}
