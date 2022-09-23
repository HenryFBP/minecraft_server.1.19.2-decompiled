import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import java.util.function.Consumer;

public class dsq extends dsx {
   dsq(int $$0, int $$1, dux[] $$2, dto[] $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public dsw a() {
      return dst.a;
   }

   @Override
   public void a(Consumer<cax> $$0, dsd $$1) {
   }

   public static dsx.a<?> b() {
      return a(dsq::new);
   }

   public static class a extends dsx.e<dsq> {
      public dsq a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, dux[] $$4, dto[] $$5) {
         return new dsq($$2, $$3, $$4, $$5);
      }
   }
}
