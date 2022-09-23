import com.google.gson.JsonObject;

public class co extends cv<co.a> {
   static final abb a = new abb("player_hurt_entity");

   @Override
   public abb a() {
      return a;
   }

   public co.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bc $$3 = bc.a($$0.get("damage"));
      bo.b $$4 = bo.b.a($$0, "entity", $$2);
      return new co.a($$1, $$3, $$4);
   }

   public void a(agh $$0, bbn $$1, baw $$2, float $$3, float $$4, boolean $$5) {
      dsd $$6 = bo.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static class a extends as {
      private final bc a;
      private final bo.b b;

      public a(bo.b $$0, bc $$1, bo.b $$2) {
         super(co.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static co.a c() {
         return new co.a(bo.b.a, bc.a, bo.b.a);
      }

      public static co.a a(bc $$0) {
         return new co.a(bo.b.a, $$0, bo.b.a);
      }

      public static co.a a(bc.a $$0) {
         return new co.a(bo.b.a, $$0.b(), bo.b.a);
      }

      public static co.a a(bo $$0) {
         return new co.a(bo.b.a, bc.a, bo.b.a($$0));
      }

      public static co.a a(bc $$0, bo $$1) {
         return new co.a(bo.b.a, $$0, bo.b.a($$1));
      }

      public static co.a a(bc.a $$0, bo $$1) {
         return new co.a(bo.b.a, $$0.b(), bo.b.a($$1));
      }

      public boolean a(agh $$0, dsd $$1, baw $$2, float $$3, float $$4, boolean $$5) {
         if (!this.a.a($$0, $$2, $$3, $$4, $$5)) {
            return false;
         } else {
            return this.b.a($$1);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("damage", this.a.a());
         $$1.add("entity", this.b.a($$0));
         return $$1;
      }
   }
}
