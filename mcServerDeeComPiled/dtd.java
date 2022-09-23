import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class dtd extends dtn {
   dtd(dux[] $$0) {
      super($$0);
   }

   @Override
   public dtp a() {
      return dtq.s;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      Float $$2 = $$1.c(dul.j);
      if ($$2 != null) {
         amn $$3 = $$1.a();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.K();
         int $$6 = 0;

         for(int $$7 = 0; $$7 < $$5; ++$$7) {
            if ($$3.i() <= $$4) {
               ++$$6;
            }
         }

         $$0.e($$6);
      }

      return $$0;
   }

   public static dtn.a<?> c() {
      return a(dtd::new);
   }

   public static class a extends dtn.c<dtd> {
      public dtd a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         return new dtd($$2);
      }
   }
}
