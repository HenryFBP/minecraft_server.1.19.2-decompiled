import com.google.gson.JsonObject;

public class by extends cv<by.a> {
   static final abb a = new abb("item_durability_changed");

   @Override
   public abb a() {
      return a;
   }

   public by.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ca $$3 = ca.a($$0.get("item"));
      cj.d $$4 = cj.d.a($$0.get("durability"));
      cj.d $$5 = cj.d.a($$0.get("delta"));
      return new by.a($$1, $$3, $$4, $$5);
   }

   public void a(agh $$0, cax $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static class a extends as {
      private final ca a;
      private final cj.d b;
      private final cj.d c;

      public a(bo.b $$0, ca $$1, cj.d $$2, cj.d $$3) {
         super(by.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static by.a a(ca $$0, cj.d $$1) {
         return a(bo.b.a, $$0, $$1);
      }

      public static by.a a(bo.b $$0, ca $$1, cj.d $$2) {
         return new by.a($$0, $$1, $$2, cj.d.e);
      }

      public boolean a(cax $$0, int $$1) {
         if (!this.a.a($$0)) {
            return false;
         } else if (!this.b.d($$0.k() - $$1)) {
            return false;
         } else {
            return this.c.d($$0.j() - $$1);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         $$1.add("durability", this.b.d());
         $$1.add("delta", this.c.d());
         return $$1;
      }
   }
}
