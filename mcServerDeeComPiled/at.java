import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class at extends cv<at.a> {
   static final abb a = new abb("bee_nest_destroyed");

   @Override
   public abb a() {
      return a;
   }

   public at.a a(JsonObject $$0, bo.b $$1, be $$2) {
      cjt $$3 = a($$0);
      ca $$4 = ca.a($$0.get("item"));
      cj.d $$5 = cj.d.a($$0.get("num_bees_inside"));
      return new at.a($$1, $$3, $$4, $$5);
   }

   @Nullable
   private static cjt a(JsonObject $$0) {
      if ($$0.has("block")) {
         abb $$1 = new abb(alz.h($$0, "block"));
         return (cjt)hm.V.b($$1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + $$1 + "'"));
      } else {
         return null;
      }
   }

   public void a(agh $$0, cvo $$1, cax $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static class a extends as {
      @Nullable
      private final cjt a;
      private final ca b;
      private final cj.d c;

      public a(bo.b $$0, @Nullable cjt $$1, ca $$2, cj.d $$3) {
         super(at.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static at.a a(cjt $$0, ca.a $$1, cj.d $$2) {
         return new at.a(bo.b.a, $$0, $$1.b(), $$2);
      }

      public boolean a(cvo $$0, cax $$1, int $$2) {
         if (this.a != null && !$$0.a(this.a)) {
            return false;
         } else {
            return !this.b.a($$1) ? false : this.c.d($$2);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("block", hm.V.b(this.a).toString());
         }

         $$1.add("item", this.b.a());
         $$1.add("num_bees_inside", this.c.d());
         return $$1;
      }
   }
}
