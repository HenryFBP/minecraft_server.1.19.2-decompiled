import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class ax extends cv<ax.a> {
   static final abb a = new abb("changed_dimension");

   @Override
   public abb a() {
      return a;
   }

   public ax.a a(JsonObject $$0, bo.b $$1, be $$2) {
      aba<cgx> $$3 = $$0.has("from") ? aba.a(hm.P, new abb(alz.h($$0, "from"))) : null;
      aba<cgx> $$4 = $$0.has("to") ? aba.a(hm.P, new abb(alz.h($$0, "to"))) : null;
      return new ax.a($$1, $$3, $$4);
   }

   public void a(agh $$0, aba<cgx> $$1, aba<cgx> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static class a extends as {
      @Nullable
      private final aba<cgx> a;
      @Nullable
      private final aba<cgx> b;

      public a(bo.b $$0, @Nullable aba<cgx> $$1, @Nullable aba<cgx> $$2) {
         super(ax.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static ax.a c() {
         return new ax.a(bo.b.a, null, null);
      }

      public static ax.a a(aba<cgx> $$0, aba<cgx> $$1) {
         return new ax.a(bo.b.a, $$0, $$1);
      }

      public static ax.a a(aba<cgx> $$0) {
         return new ax.a(bo.b.a, null, $$0);
      }

      public static ax.a b(aba<cgx> $$0) {
         return new ax.a(bo.b.a, $$0, null);
      }

      public boolean b(aba<cgx> $$0, aba<cgx> $$1) {
         if (this.a != null && this.a != $$0) {
            return false;
         } else {
            return this.b == null || this.b == $$1;
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("from", this.a.a().toString());
         }

         if (this.b != null) {
            $$1.addProperty("to", this.b.a().toString());
         }

         return $$1;
      }
   }
}
