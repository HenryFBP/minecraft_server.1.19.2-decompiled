import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class cn extends cv<cn.a> {
   static final abb a = new abb("placed_block");

   @Override
   public abb a() {
      return a;
   }

   public cn.a a(JsonObject $$0, bo.b $$1, be $$2) {
      cjt $$3 = a($$0);
      cz $$4 = cz.a($$0.get("state"));
      if ($$3 != null) {
         $$4.a($$3.k(), $$1x -> {
            throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1x + ":");
         });
      }

      ch $$5 = ch.a($$0.get("location"));
      ca $$6 = ca.a($$0.get("item"));
      return new cn.a($$1, $$3, $$4, $$5, $$6);
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

   public void a(agh $$0, gt $$1, cax $$2) {
      cvo $$3 = $$0.x().a_($$1);
      this.a($$0, $$4 -> $$4.a($$3, $$1, $$0.x(), $$2));
   }

   public static class a extends as {
      @Nullable
      private final cjt a;
      private final cz b;
      private final ch c;
      private final ca d;

      public a(bo.b $$0, @Nullable cjt $$1, cz $$2, ch $$3, ca $$4) {
         super(cn.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
      }

      public static cn.a a(cjt $$0) {
         return new cn.a(bo.b.a, $$0, cz.a, ch.a, ca.a);
      }

      public boolean a(cvo $$0, gt $$1, agg $$2, cax $$3) {
         if (this.a != null && !$$0.a(this.a)) {
            return false;
         } else if (!this.b.a($$0)) {
            return false;
         } else if (!this.c.a($$2, (double)$$1.u(), (double)$$1.v(), (double)$$1.w())) {
            return false;
         } else {
            return this.d.a($$3);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("block", hm.V.b(this.a).toString());
         }

         $$1.add("state", this.b.a());
         $$1.add("location", this.c.a());
         $$1.add("item", this.d.a());
         return $$1;
      }
   }
}
