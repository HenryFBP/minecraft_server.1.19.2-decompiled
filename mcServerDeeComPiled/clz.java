public class clz extends cps {
   protected clz(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.b));
   }

   @Override
   public cvo a(ccx $$0) {
      gy $$1 = $$0.k();
      cvo $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.m().a(a, $$1.g()) : this.m().a(a, $$1);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      gy $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(io.u, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }

   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.a;
   }
}
