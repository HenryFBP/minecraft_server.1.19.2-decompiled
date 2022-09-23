import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class cm extends cv<cm.a> {
   private final abb a;

   public cm(abb $$0) {
      this.a = $$0;
   }

   @Override
   public abb a() {
      return this.a;
   }

   protected cm.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ca $$3 = ca.a($$0.get("item"));
      bo.b $$4 = bo.b.a($$0, "entity", $$2);
      return new cm.a(this.a, $$1, $$3, $$4);
   }

   public void a(agh $$0, cax $$1, @Nullable bbn $$2) {
      dsd $$3 = bo.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static class a extends as {
      private final ca a;
      private final bo.b b;

      public a(abb $$0, bo.b $$1, ca $$2, bo.b $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static cm.a a(bo.b $$0, ca $$1, bo.b $$2) {
         return new cm.a(aj.O.a(), $$0, $$1, $$2);
      }

      public static cm.a b(bo.b $$0, ca $$1, bo.b $$2) {
         return new cm.a(aj.P.a(), $$0, $$1, $$2);
      }

      public boolean a(agh $$0, cax $$1, dsd $$2) {
         if (!this.a.a($$1)) {
            return false;
         } else {
            return this.b.a($$2);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         $$1.add("entity", this.b.a($$0));
         return $$1;
      }
   }
}
