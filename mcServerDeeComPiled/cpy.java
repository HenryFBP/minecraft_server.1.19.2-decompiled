public class cpy extends cka implements cjv {
   public static final cwo d = cwe.aU;
   protected static final float e = 6.0F;
   protected static final dxj f = cjt.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final cuv a;

   protected cpy(cuv $$0, cvn.c $$1) {
      super($$1);
      this.a = $$0;
      this.k(this.D.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return f;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.D($$2.b()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }

   }

   public void a(agg $$0, gt $$1, cvo $$2, amn $$3) {
      if ($$2.c(d) == 0) {
         $$0.a($$1, $$2.a(d), 4);
      } else {
         this.a.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }

   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return (double)$$0.w.i() < 0.45;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d);
   }
}
