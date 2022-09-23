import com.google.gson.JsonObject;

public abstract class as implements an {
   private final abb a;
   private final bo.b b;

   public as(abb $$0, bo.b $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public abb a() {
      return this.a;
   }

   protected bo.b b() {
      return this.b;
   }

   @Override
   public JsonObject a(ct $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("player", this.b.a($$0));
      return $$1;
   }

   public String toString() {
      return "AbstractCriterionInstance{criterion=" + this.a + "}";
   }
}
