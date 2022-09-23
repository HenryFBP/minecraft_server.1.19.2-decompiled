import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class aw extends cv<aw.a> {
   static final abb a = new abb("brewed_potion");

   @Override
   public abb a() {
      return a;
   }

   public aw.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ccs $$3 = null;
      if ($$0.has("potion")) {
         abb $$4 = new abb(alz.h($$0, "potion"));
         $$3 = (ccs)hm.Z.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$4 + "'"));
      }

      return new aw.a($$1, $$3);
   }

   public void a(agh $$0, ccs $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends as {
      @Nullable
      private final ccs a;

      public a(bo.b $$0, @Nullable ccs $$1) {
         super(aw.a, $$0);
         this.a = $$1;
      }

      public static aw.a c() {
         return new aw.a(bo.b.a, null);
      }

      public boolean a(ccs $$0) {
         return this.a == null || this.a == $$0;
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("potion", hm.Z.b(this.a).toString());
         }

         return $$1;
      }
   }
}
