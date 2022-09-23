public class cos extends cka {
   public static final int a = 3;
   public static final cwo b = cwe.as;
   private static final dxj[] c = new dxj[]{
      cjt.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected cos(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c[$$0.c(b)];
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.a(cju.dg);
   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }

   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(caz.qr);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }
}
