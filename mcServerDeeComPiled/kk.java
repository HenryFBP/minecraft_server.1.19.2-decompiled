public class kk {
   @Deprecated
   public static abb a(String $$0) {
      return new abb("minecraft", "block/" + $$0);
   }

   public static abb b(String $$0) {
      return new abb("minecraft", "item/" + $$0);
   }

   public static abb a(cjt $$0, String $$1) {
      abb $$2 = hm.V.b($$0);
      return new abb($$2.b(), "block/" + $$2.a() + $$1);
   }

   public static abb a(cjt $$0) {
      abb $$1 = hm.V.b($$0);
      return new abb($$1.b(), "block/" + $$1.a());
   }

   public static abb a(cat $$0) {
      abb $$1 = hm.Y.b($$0);
      return new abb($$1.b(), "item/" + $$1.a());
   }

   public static abb a(cat $$0, String $$1) {
      abb $$2 = hm.Y.b($$0);
      return new abb($$2.b(), "item/" + $$2.a() + $$1);
   }
}
