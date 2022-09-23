import com.google.gson.JsonObject;

public class cd extends cv<cd.a> {
   static final abb a = new abb("levitation");

   @Override
   public abb a() {
      return a;
   }

   public cd.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bf $$3 = bf.a($$0.get("distance"));
      cj.d $$4 = cj.d.a($$0.get("duration"));
      return new cd.a($$1, $$3, $$4);
   }

   public void a(agh $$0, dwq $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static class a extends as {
      private final bf a;
      private final cj.d b;

      public a(bo.b $$0, bf $$1, cj.d $$2) {
         super(cd.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cd.a a(bf $$0) {
         return new cd.a(bo.b.a, $$0, cj.d.e);
      }

      public boolean a(agh $$0, dwq $$1, int $$2) {
         if (!this.a.a($$1.c, $$1.d, $$1.e, $$0.df(), $$0.dh(), $$0.dl())) {
            return false;
         } else {
            return this.b.d($$2);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("distance", this.a.a());
         $$1.add("duration", this.b.d());
         return $$1;
      }
   }
}
