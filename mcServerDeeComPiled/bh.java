import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class bh extends cv<bh.a> {
   static final abb a = new abb("effects_changed");

   @Override
   public abb a() {
      return a;
   }

   public bh.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ck $$3 = ck.a($$0.get("effects"));
      bo.b $$4 = bo.b.a($$0, "source", $$2);
      return new bh.a($$1, $$3, $$4);
   }

   public void a(agh $$0, @Nullable bbn $$1) {
      dsd $$2 = $$1 != null ? bo.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static class a extends as {
      private final ck a;
      private final bo.b b;

      public a(bo.b $$0, ck $$1, bo.b $$2) {
         super(bh.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static bh.a a(ck $$0) {
         return new bh.a(bo.b.a, $$0, bo.b.a);
      }

      public static bh.a a(bo $$0) {
         return new bh.a(bo.b.a, ck.a, bo.b.a($$0));
      }

      public boolean a(agh $$0, @Nullable dsd $$1) {
         if (!this.a.a((bcc)$$0)) {
            return false;
         } else {
            return this.b == bo.b.a || $$1 != null && this.b.a($$1);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("effects", this.a.b());
         $$1.add("source", this.b.a($$0));
         return $$1;
      }
   }
}
