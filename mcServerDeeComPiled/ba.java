import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonObject;

public class ba extends cv<ba.a> {
   static final abb a = new abb("consume_item");

   @Override
   public abb a() {
      return a;
   }

   public ba.a a(JsonObject $$0, bo.b $$1, be $$2) {
      return new ba.a($$1, ca.a($$0.get("item")));
   }

   public void a(agh $$0, cax $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends as {
      private final ca a;

      public a(bo.b $$0, ca $$1) {
         super(ba.a, $$0);
         this.a = $$1;
      }

      public static ba.a c() {
         return new ba.a(bo.b.a, ca.a);
      }

      public static ba.a a(ca $$0) {
         return new ba.a(bo.b.a, $$0);
      }

      public static ba.a a(cgw $$0) {
         return new ba.a(bo.b.a, new ca(null, ImmutableSet.of($$0.l()), cj.d.e, cj.d.e, bj.b, bj.b, null, cl.a));
      }

      public boolean a(cax $$0) {
         return this.a.a($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         return $$1;
      }
   }
}
