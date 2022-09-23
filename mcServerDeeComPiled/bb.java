import com.google.gson.JsonObject;

public class bb extends cv<bb.a> {
   static final abb a = new abb("cured_zombie_villager");

   @Override
   public abb a() {
      return a;
   }

   public bb.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bo.b $$3 = bo.b.a($$0, "zombie", $$2);
      bo.b $$4 = bo.b.a($$0, "villager", $$2);
      return new bb.a($$1, $$3, $$4);
   }

   public void a(agh $$0, bsj $$1, btp $$2) {
      dsd $$3 = bo.b($$0, $$1);
      dsd $$4 = bo.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static class a extends as {
      private final bo.b a;
      private final bo.b b;

      public a(bo.b $$0, bo.b $$1, bo.b $$2) {
         super(bb.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static bb.a c() {
         return new bb.a(bo.b.a, bo.b.a, bo.b.a);
      }

      public boolean a(dsd $$0, dsd $$1) {
         if (!this.a.a($$0)) {
            return false;
         } else {
            return this.b.a($$1);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("zombie", this.a.a($$0));
         $$1.add("villager", this.b.a($$0));
         return $$1;
      }
   }
}
