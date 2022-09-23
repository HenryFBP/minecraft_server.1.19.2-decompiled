import com.google.gson.JsonObject;

public class cs extends cv<cs.a> {
   static final abb a = new abb("recipe_unlocked");

   @Override
   public abb a() {
      return a;
   }

   public cs.a a(JsonObject $$0, bo.b $$1, be $$2) {
      abb $$3 = new abb(alz.h($$0, "recipe"));
      return new cs.a($$1, $$3);
   }

   public void a(agh $$0, cdp<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static cs.a a(abb $$0) {
      return new cs.a(bo.b.a, $$0);
   }

   public static class a extends as {
      private final abb a;

      public a(bo.b $$0, abb $$1) {
         super(cs.a, $$0);
         this.a = $$1;
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.addProperty("recipe", this.a.toString());
         return $$1;
      }

      public boolean a(cdp<?> $$0) {
         return this.a.equals($$0.f());
      }
   }
}
