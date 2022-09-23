import com.google.gson.JsonObject;

public class dd extends cv<dd.a> {
   static final abb a = new abb("villager_trade");

   @Override
   public abb a() {
      return a;
   }

   public dd.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bo.b $$3 = bo.b.a($$0, "villager", $$2);
      ca $$4 = ca.a($$0.get("item"));
      return new dd.a($$1, $$3, $$4);
   }

   public void a(agh $$0, btk $$1, cax $$2) {
      dsd $$3 = bo.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static class a extends as {
      private final bo.b a;
      private final ca b;

      public a(bo.b $$0, bo.b $$1, ca $$2) {
         super(dd.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static dd.a c() {
         return new dd.a(bo.b.a, bo.b.a, ca.a);
      }

      public static dd.a a(bo.a $$0) {
         return new dd.a(bo.b.a($$0.b()), bo.b.a, ca.a);
      }

      public boolean a(dsd $$0, cax $$1) {
         if (!this.a.a($$0)) {
            return false;
         } else {
            return this.b.a($$1);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.b.a());
         $$1.add("villager", this.a.a($$0));
         return $$1;
      }
   }
}
