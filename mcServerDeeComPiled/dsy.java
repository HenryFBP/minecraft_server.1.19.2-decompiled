import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public class dsy extends dsx {
   final abb i;

   dsy(abb $$0, int $$1, int $$2, dux[] $$3, dto[] $$4) {
      super($$1, $$2, $$3, $$4);
      this.i = $$0;
   }

   @Override
   public dsw a() {
      return dst.c;
   }

   @Override
   public void a(Consumer<cax> $$0, dsd $$1) {
      dsg $$2 = $$1.a(this.i);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(dsl $$0) {
      if ($$0.a(this.i)) {
         $$0.a("Table " + this.i + " is recursively called");
      } else {
         super.a($$0);
         dsg $$1 = $$0.c(this.i);
         if ($$1 == null) {
            $$0.a("Unknown loot table called " + this.i);
         } else {
            $$1.a($$0.a("->{" + this.i + "}", this.i));
         }

      }
   }

   public static dsx.a<?> a(abb $$0) {
      return a(($$1, $$2, $$3, $$4) -> new dsy($$0, $$1, $$2, $$3, $$4));
   }

   public static class a extends dsx.e<dsy> {
      public void a(JsonObject $$0, dsy $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("name", $$1.i.toString());
      }

      protected dsy a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, dux[] $$4, dto[] $$5) {
         abb $$6 = new abb(alz.h($$0, "name"));
         return new dsy($$6, $$2, $$3, $$4, $$5);
      }
   }
}
