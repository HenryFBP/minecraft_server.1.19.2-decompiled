import com.google.gson.JsonObject;

public class cr extends cv<cr.a> {
   final abb a;

   public cr(abb $$0) {
      this.a = $$0;
   }

   @Override
   public abb a() {
      return this.a;
   }

   public cr.a a(JsonObject $$0, bo.b $$1, be $$2) {
      return new cr.a(this.a, $$1);
   }

   public void a(agh $$0) {
      this.a($$0, $$0x -> true);
   }

   public static class a extends as {
      public a(abb $$0, bo.b $$1) {
         super($$0, $$1);
      }

      public static cr.a a(ch $$0) {
         return new cr.a(aj.p.a, bo.b.a(bo.a.a().a($$0).b()));
      }

      public static cr.a a(bo $$0) {
         return new cr.a(aj.p.a, bo.b.a($$0));
      }

      public static cr.a c() {
         return new cr.a(aj.q.a, bo.b.a);
      }

      public static cr.a d() {
         return new cr.a(aj.H.a, bo.b.a);
      }

      public static cr.a e() {
         return new cr.a(aj.Y.a, bo.b.a);
      }

      public static cr.a a(cjt $$0, cat $$1) {
         return a(bo.a.a().a(bl.a.a().d(ca.a.a().a($$1).b()).b()).b(ch.a.a().a(au.a.a().a($$0).b()).b()).b());
      }
   }
}
