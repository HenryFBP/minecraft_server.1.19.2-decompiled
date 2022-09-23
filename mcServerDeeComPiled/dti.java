import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dti extends dtn {
   final dvs a;
   final boolean b;

   dti(dux[] $$0, dvs $$1, boolean $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public dtp a() {
      return dtq.c;
   }

   @Override
   public Set<dui<?>> b() {
      return this.a.b();
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      amn $$2 = $$1.a();
      return cet.a($$2, $$0, this.a.a($$1), this.b);
   }

   public static dti.a a(dvs $$0) {
      return new dti.a($$0);
   }

   public static class a extends dtn.a<dti.a> {
      private final dvs a;
      private boolean b;

      public a(dvs $$0) {
         this.a = $$0;
      }

      protected dti.a a() {
         return this;
      }

      public dti.a e() {
         this.b = true;
         return this;
      }

      @Override
      public dto b() {
         return new dti(this.g(), this.a, this.b);
      }
   }

   public static class b extends dtn.c<dti> {
      public void a(JsonObject $$0, dti $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("levels", $$2.serialize($$1.a));
         $$0.addProperty("treasure", $$1.b);
      }

      public dti a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         dvs $$3 = alz.a($$0, "levels", $$1, dvs.class);
         boolean $$4 = alz.a($$0, "treasure", false);
         return new dti($$2, $$3, $$4);
      }
   }
}
