public class cpk extends cjt {
   public static final cwf a = cpn.a;

   public cpk(cvn.c $$0) {
      super($$0);
      this.k(this.m().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bbn $$3) {
      if (!$$3.bM()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      cax $$6 = $$3.b($$4);
      return $$6.c() instanceof byx && new ccx($$3, $$4, $$6, $$5).b() ? baj.d : baj.a;
   }

   private static void d(cvo $$0, cgx $$1, gt $$2) {
      a($$1, $$2);
      if (!$$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      }

   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.c(a);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
      }

   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, cax $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cet.a(cev.v, $$3) == 0) {
         int $$5 = 1 + $$1.w.a(5);
         this.a($$1, $$2, $$5);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(a)) {
         a($$1, $$2);
      }

   }

   private static void a(cgx $$0, gt $$1) {
      double $$2 = 0.5625;
      amn $$3 = $$0.w;

      for(gy $$4 : gy.values()) {
         gt $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            gy.a $$6 = $$4.o();
            double $$7 = $$6 == gy.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == gy.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == gy.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ii.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }

   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }
}
