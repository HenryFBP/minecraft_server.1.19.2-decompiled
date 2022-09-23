import com.google.gson.JsonObject;

public class az extends cv<az.a> {
   static final abb a = new abb("construct_beacon");

   @Override
   public abb a() {
      return a;
   }

   public az.a a(JsonObject $$0, bo.b $$1, be $$2) {
      cj.d $$3 = cj.d.a($$0.get("level"));
      return new az.a($$1, $$3);
   }

   public void a(agh $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends as {
      private final cj.d a;

      public a(bo.b $$0, cj.d $$1) {
         super(az.a, $$0);
         this.a = $$1;
      }

      public static az.a c() {
         return new az.a(bo.b.a, cj.d.e);
      }

      public static az.a a(cj.d $$0) {
         return new az.a(bo.b.a, $$0);
      }

      public boolean a(int $$0) {
         return this.a.d($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("level", this.a.d());
         return $$1;
      }
   }
}
