public class clh extends cjt {
   public clh(cvn.c $$0) {
      super($$0);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$3.a(5) == 0) {
         gy $$4 = gy.b($$3);
         if ($$4 != gy.b) {
            gt $$5 = $$2.a($$4);
            cvo $$6 = $$1.a_($$5);
            if (!$$0.m() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(io.ax, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
