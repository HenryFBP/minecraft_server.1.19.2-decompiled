import com.google.gson.JsonObject;

public class cp extends cv<cp.a> {
   static final abb a = new abb("player_interacted_with_entity");

   @Override
   public abb a() {
      return a;
   }

   protected cp.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ca $$3 = ca.a($$0.get("item"));
      bo.b $$4 = bo.b.a($$0, "entity", $$2);
      return new cp.a($$1, $$3, $$4);
   }

   public void a(agh $$0, cax $$1, bbn $$2) {
      dsd $$3 = bo.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static class a extends as {
      private final ca a;
      private final bo.b b;

      public a(bo.b $$0, ca $$1, bo.b $$2) {
         super(cp.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cp.a a(bo.b $$0, ca.a $$1, bo.b $$2) {
         return new cp.a($$0, $$1.b(), $$2);
      }

      public static cp.a a(ca.a $$0, bo.b $$1) {
         return a(bo.b.a, $$0, $$1);
      }

      public boolean a(cax $$0, dsd $$1) {
         return !this.a.a($$0) ? false : this.b.a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         $$1.add("entity", this.b.a($$0));
         return $$1;
      }
   }
}
