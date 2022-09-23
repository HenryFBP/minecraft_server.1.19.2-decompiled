import com.google.gson.JsonObject;

public class dc extends cv<dc.a> {
   static final abb a = new abb("target_hit");

   @Override
   public abb a() {
      return a;
   }

   public dc.a a(JsonObject $$0, bo.b $$1, be $$2) {
      cj.d $$3 = cj.d.a($$0.get("signal_strength"));
      bo.b $$4 = bo.b.a($$0, "projectile", $$2);
      return new dc.a($$1, $$3, $$4);
   }

   public void a(agh $$0, bbn $$1, dwq $$2, int $$3) {
      dsd $$4 = bo.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static class a extends as {
      private final cj.d a;
      private final bo.b b;

      public a(bo.b $$0, cj.d $$1, bo.b $$2) {
         super(dc.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static dc.a a(cj.d $$0, bo.b $$1) {
         return new dc.a(bo.b.a, $$0, $$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("signal_strength", this.a.d());
         $$1.add("projectile", this.b.a($$0));
         return $$1;
      }

      public boolean a(dsd $$0, dwq $$1, int $$2) {
         if (!this.a.d($$2)) {
            return false;
         } else {
            return this.b.a($$0);
         }
      }
   }
}
