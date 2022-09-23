public class cpq extends cll {
   public static final cwf a = cwe.s;
   public static final cwo d = cwe.aA;

   protected cpq(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(aD, gy.c).a(d, Integer.valueOf(1)).a(a, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if (!$$3.fB().e) {
         return baj.d;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return baj.a($$1.y);
      }
   }

   @Override
   protected int g(cvo $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = super.a($$0);
      return $$1.a(a, Boolean.valueOf(this.a($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return !$$3.k_() && $$1.o() != ((gy)$$0.c(aD)).o() ? $$0.a(a, Boolean.valueOf(this.a($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cha $$0, gt $$1, cvo $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean h(cvo $$0) {
      return n($$0);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(c)) {
         gy $$4 = $$0.c(aD);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(d) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(ii.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(aD, d, a, c);
   }
}
