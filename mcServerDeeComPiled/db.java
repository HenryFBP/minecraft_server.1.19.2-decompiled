import com.google.gson.JsonObject;

public class db extends cv<db.a> {
   static final abb a = new abb("tame_animal");

   @Override
   public abb a() {
      return a;
   }

   public db.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bo.b $$3 = bo.b.a($$0, "entity", $$2);
      return new db.a($$1, $$3);
   }

   public void a(agh $$0, bne $$1) {
      dsd $$2 = bo.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static class a extends as {
      private final bo.b a;

      public a(bo.b $$0, bo.b $$1) {
         super(db.a, $$0);
         this.a = $$1;
      }

      public static db.a c() {
         return new db.a(bo.b.a, bo.b.a);
      }

      public static db.a a(bo $$0) {
         return new db.a(bo.b.a, bo.b.a($$0));
      }

      public boolean a(dsd $$0) {
         return this.a.a($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("entity", this.a.a($$0));
         return $$1;
      }
   }
}
