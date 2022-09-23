import com.google.gson.JsonObject;

public class bz extends cv<bz.a> {
   final abb a;

   public bz(abb $$0) {
      this.a = $$0;
   }

   @Override
   public abb a() {
      return this.a;
   }

   public bz.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ch $$3 = ch.a($$0.get("location"));
      ca $$4 = ca.a($$0.get("item"));
      return new bz.a(this.a, $$1, $$3, $$4);
   }

   public void a(agh $$0, gt $$1, cax $$2) {
      cvo $$3 = $$0.x().a_($$1);
      this.a($$0, $$4 -> $$4.a($$3, $$0.x(), $$1, $$2));
   }

   public static class a extends as {
      private final ch a;
      private final ca b;

      public a(abb $$0, bo.b $$1, ch $$2, ca $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static bz.a a(ch.a $$0, ca.a $$1) {
         return new bz.a(aj.M.a, bo.b.a, $$0.b(), $$1.b());
      }

      public static bz.a b(ch.a $$0, ca.a $$1) {
         return new bz.a(aj.X.a, bo.b.a, $$0.b(), $$1.b());
      }

      public boolean a(cvo $$0, agg $$1, gt $$2, cax $$3) {
         return !this.a.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) ? false : this.b.a($$3);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("location", this.a.a());
         $$1.add("item", this.b.a());
         return $$1;
      }
   }
}
