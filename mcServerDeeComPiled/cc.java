import com.google.gson.JsonObject;

public class cc extends cv<cc.a> {
   final abb a;

   public cc(abb $$0) {
      this.a = $$0;
   }

   @Override
   public abb a() {
      return this.a;
   }

   public cc.a a(JsonObject $$0, bo.b $$1, be $$2) {
      return new cc.a(this.a, $$1, bo.b.a($$0, "entity", $$2), bd.a($$0.get("killing_blow")));
   }

   public void a(agh $$0, bbn $$1, baw $$2) {
      dsd $$3 = bo.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static class a extends as {
      private final bo.b a;
      private final bd b;

      public a(abb $$0, bo.b $$1, bo.b $$2, bd $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static cc.a a(bo $$0) {
         return new cc.a(aj.b.a, bo.b.a, bo.b.a($$0), bd.a);
      }

      public static cc.a a(bo.a $$0) {
         return new cc.a(aj.b.a, bo.b.a, bo.b.a($$0.b()), bd.a);
      }

      public static cc.a c() {
         return new cc.a(aj.b.a, bo.b.a, bo.b.a, bd.a);
      }

      public static cc.a a(bo $$0, bd $$1) {
         return new cc.a(aj.b.a, bo.b.a, bo.b.a($$0), $$1);
      }

      public static cc.a a(bo.a $$0, bd $$1) {
         return new cc.a(aj.b.a, bo.b.a, bo.b.a($$0.b()), $$1);
      }

      public static cc.a a(bo $$0, bd.a $$1) {
         return new cc.a(aj.b.a, bo.b.a, bo.b.a($$0), $$1.b());
      }

      public static cc.a a(bo.a $$0, bd.a $$1) {
         return new cc.a(aj.b.a, bo.b.a, bo.b.a($$0.b()), $$1.b());
      }

      public static cc.a d() {
         return new cc.a(aj.W.a, bo.b.a, bo.b.a, bd.a);
      }

      public static cc.a b(bo $$0) {
         return new cc.a(aj.c.a, bo.b.a, bo.b.a($$0), bd.a);
      }

      public static cc.a b(bo.a $$0) {
         return new cc.a(aj.c.a, bo.b.a, bo.b.a($$0.b()), bd.a);
      }

      public static cc.a e() {
         return new cc.a(aj.c.a, bo.b.a, bo.b.a, bd.a);
      }

      public static cc.a b(bo $$0, bd $$1) {
         return new cc.a(aj.c.a, bo.b.a, bo.b.a($$0), $$1);
      }

      public static cc.a b(bo.a $$0, bd $$1) {
         return new cc.a(aj.c.a, bo.b.a, bo.b.a($$0.b()), $$1);
      }

      public static cc.a b(bo $$0, bd.a $$1) {
         return new cc.a(aj.c.a, bo.b.a, bo.b.a($$0), $$1.b());
      }

      public static cc.a b(bo.a $$0, bd.a $$1) {
         return new cc.a(aj.c.a, bo.b.a, bo.b.a($$0.b()), $$1.b());
      }

      public boolean a(agh $$0, dsd $$1, baw $$2) {
         return !this.b.a($$0, $$2) ? false : this.a.a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("entity", this.a.a($$0));
         $$1.add("killing_blow", this.b.a());
         return $$1;
      }
   }
}
