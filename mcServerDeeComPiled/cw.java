import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class cw extends cv<cw.a> {
   static final abb a = new abb("slide_down_block");

   @Override
   public abb a() {
      return a;
   }

   public cw.a a(JsonObject $$0, bo.b $$1, be $$2) {
      cjt $$3 = a($$0);
      cz $$4 = cz.a($$0.get("state"));
      if ($$3 != null) {
         $$4.a($$3.k(), $$1x -> {
            throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1x);
         });
      }

      return new cw.a($$1, $$3, $$4);
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

   public void a(agh $$0, cvo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends as {
      @Nullable
      private final cjt a;
      private final cz b;

      public a(bo.b $$0, @Nullable cjt $$1, cz $$2) {
         super(cw.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cw.a a(cjt $$0) {
         return new cw.a(bo.b.a, $$0, cz.a);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("block", hm.V.b(this.a).toString());
         }

         $$1.add("state", this.b.a());
         return $$1;
      }

      public boolean a(cvo $$0) {
         if (this.a != null && !$$0.a(this.a)) {
            return false;
         } else {
            return this.b.a($$0);
         }
      }
   }
}
