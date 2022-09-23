import com.google.gson.JsonObject;

public class dg extends cv<dg.a> {
   static final abb a = new abb("using_item");

   @Override
   public abb a() {
      return a;
   }

   public dg.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ca $$3 = ca.a($$0.get("item"));
      return new dg.a($$1, $$3);
   }

   public void a(agh $$0, cax $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends as {
      private final ca a;

      public a(bo.b $$0, ca $$1) {
         super(dg.a, $$0);
         this.a = $$1;
      }

      public static dg.a a(bo.a $$0, ca.a $$1) {
         return new dg.a(bo.b.a($$0.b()), $$1.b());
      }

      public boolean a(cax $$0) {
         return this.a.a($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         return $$1;
      }
   }
}
