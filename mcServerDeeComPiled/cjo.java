public class cjo extends clf {
   public static final int a = 3;
   public static final cwo b = cwe.as;
   private static final dxj[] e = new dxj[]{
      cjt.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   public cjo(cvn.c $$0) {
      super($$0);
   }

   @Override
   public cwo b() {
      return b;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cgw d() {
      return caz.tf;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }

   }

   @Override
   protected int a(cgx $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return e[$$0.c(this.b())];
   }
}
