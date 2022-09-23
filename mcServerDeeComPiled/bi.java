import com.google.gson.JsonObject;

public class bi extends cv<bi.a> {
   static final abb a = new abb("enchanted_item");

   @Override
   public abb a() {
      return a;
   }

   public bi.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ca $$3 = ca.a($$0.get("item"));
      cj.d $$4 = cj.d.a($$0.get("levels"));
      return new bi.a($$1, $$3, $$4);
   }

   public void a(agh $$0, cax $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static class a extends as {
      private final ca a;
      private final cj.d b;

      public a(bo.b $$0, ca $$1, cj.d $$2) {
         super(bi.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static bi.a c() {
         return new bi.a(bo.b.a, ca.a, cj.d.e);
      }

      public boolean a(cax $$0, int $$1) {
         if (!this.a.a($$0)) {
            return false;
         } else {
            return this.b.d($$1);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         $$1.add("levels", this.b.d());
         return $$1;
      }
   }
}
