import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dtm extends dtn {
   final dsb a;

   dtm(dux[] $$0, dsb $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dtp a() {
      return dtq.p;
   }

   @Override
   public Set<dui<?>> b() {
      return this.a.a();
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      int $$2 = this.a.a($$1, $$0.K());
      $$0.e($$2);
      return $$0;
   }

   public static dtn.a<?> a(dsb $$0) {
      return a($$1 -> new dtm($$1, $$0));
   }

   public static class a extends dtn.c<dtm> {
      public void a(JsonObject $$0, dtm $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("limit", $$2.serialize($$1.a));
      }

      public dtm a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         dsb $$3 = alz.a($$0, "limit", $$1, dsb.class);
         return new dtm($$2, $$3);
      }
   }
}
