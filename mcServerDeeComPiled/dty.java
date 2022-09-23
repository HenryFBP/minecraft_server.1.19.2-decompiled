import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dty extends dtn {
   final dvs a;
   final boolean b;

   dty(dux[] $$0, dvs $$1, boolean $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public dtp a() {
      return dtq.b;
   }

   @Override
   public Set<dui<?>> b() {
      return this.a.b();
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      int $$2 = this.b ? $$0.K() : 0;
      $$0.e(ami.a($$2 + this.a.a($$1), 0, $$0.f()));
      return $$0;
   }

   public static dtn.a<?> a(dvs $$0) {
      return a($$1 -> new dty($$1, $$0, false));
   }

   public static dtn.a<?> a(dvs $$0, boolean $$1) {
      return a($$2 -> new dty($$2, $$0, $$1));
   }

   public static class a extends dtn.c<dty> {
      public void a(JsonObject $$0, dty $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("count", $$2.serialize($$1.a));
         $$0.addProperty("add", $$1.b);
      }

      public dty a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         dvs $$3 = alz.a($$0, "count", $$1, dvs.class);
         boolean $$4 = alz.a($$0, "add", false);
         return new dty($$2, $$3, $$4);
      }
   }
}
