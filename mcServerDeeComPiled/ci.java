import com.google.gson.JsonObject;

public class ci extends cv<ci.a> {
   static final abb a = new abb("player_generates_container_loot");

   @Override
   public abb a() {
      return a;
   }

   protected ci.a a(JsonObject $$0, bo.b $$1, be $$2) {
      abb $$3 = new abb(alz.h($$0, "loot_table"));
      return new ci.a($$1, $$3);
   }

   public void a(agh $$0, abb $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static class a extends as {
      private final abb a;

      public a(bo.b $$0, abb $$1) {
         super(ci.a, $$0);
         this.a = $$1;
      }

      public static ci.a a(abb $$0) {
         return new ci.a(bo.b.a, $$0);
      }

      public boolean b(abb $$0) {
         return this.a.equals($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.addProperty("loot_table", this.a.toString());
         return $$1;
      }
   }
}
