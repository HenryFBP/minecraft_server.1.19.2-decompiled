import com.google.gson.JsonObject;

public class de extends cv<de.a> {
   static final abb a = new abb("used_ender_eye");

   @Override
   public abb a() {
      return a;
   }

   public de.a a(JsonObject $$0, bo.b $$1, be $$2) {
      cj.c $$3 = cj.c.a($$0.get("distance"));
      return new de.a($$1, $$3);
   }

   public void a(agh $$0, gt $$1) {
      double $$2 = $$0.df() - (double)$$1.u();
      double $$3 = $$0.dl() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static class a extends as {
      private final cj.c a;

      public a(bo.b $$0, cj.c $$1) {
         super(de.a, $$0);
         this.a = $$1;
      }

      public boolean a(double $$0) {
         return this.a.e($$0);
      }
   }
}
