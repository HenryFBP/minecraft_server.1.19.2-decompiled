public class cmn extends cnh {
   public static final int a = 3;
   public static final cwo b = cwe.as;
   private static final int c = 4;
   private static final int d = 2;

   public cmn(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.D($$2) > 11 - $$0.c(b) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         gt.a $$4 = new gt.a();

         for(gy $$5 : gy.values()) {
            $$4.a($$2, $$5);
            cvo $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, ami.a($$3, 20, 40));
            }
         }

      } else {
         $$1.a($$2, this, ami.a($$3, 20, 40));
      }
   }

   private boolean e(cvo $$0, cgx $$1, gt $$2) {
      int $$3 = $$0.c(b);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cgd $$0, gt $$1, int $$2) {
      int $$3 = 0;
      gt.a $$4 = new gt.a();

      for(gy $$5 : gy.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this) && ++$$3 >= $$2) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return cax.b;
   }
}
