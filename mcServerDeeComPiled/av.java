import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class av extends cv<av.a> {
   static final abb a = new abb("bred_animals");

   @Override
   public abb a() {
      return a;
   }

   public av.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bo.b $$3 = bo.b.a($$0, "parent", $$2);
      bo.b $$4 = bo.b.a($$0, "partner", $$2);
      bo.b $$5 = bo.b.a($$0, "child", $$2);
      return new av.a($$1, $$3, $$4, $$5);
   }

   public void a(agh $$0, bne $$1, bne $$2, @Nullable bbk $$3) {
      dsd $$4 = bo.b($$0, $$1);
      dsd $$5 = bo.b($$0, $$2);
      dsd $$6 = $$3 != null ? bo.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static class a extends as {
      private final bo.b a;
      private final bo.b b;
      private final bo.b c;

      public a(bo.b $$0, bo.b $$1, bo.b $$2, bo.b $$3) {
         super(av.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static av.a c() {
         return new av.a(bo.b.a, bo.b.a, bo.b.a, bo.b.a);
      }

      public static av.a a(bo.a $$0) {
         return new av.a(bo.b.a, bo.b.a, bo.b.a, bo.b.a($$0.b()));
      }

      public static av.a a(bo $$0, bo $$1, bo $$2) {
         return new av.a(bo.b.a, bo.b.a($$0), bo.b.a($$1), bo.b.a($$2));
      }

      public boolean a(dsd $$0, dsd $$1, @Nullable dsd $$2) {
         if (this.c == bo.b.a || $$2 != null && this.c.a($$2)) {
            return this.a.a($$0) && this.b.a($$1) || this.a.a($$1) && this.b.a($$0);
         } else {
            return false;
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("parent", this.a.a($$0));
         $$1.add("partner", this.b.a($$0));
         $$1.add("child", this.c.a($$0));
         return $$1;
      }
   }
}
