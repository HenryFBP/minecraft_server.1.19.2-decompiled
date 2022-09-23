public class css extends cmk {
   public css(bbe $$0, cvn.c $$1) {
      super($$0, 8, $$1);
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cju.df) || $$0.a(cju.dg) || $$0.a(cju.dh);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      dxj $$4 = this.a($$0, $$1, $$2, dwv.a());
      dwq $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for(int $$8 = 0; $$8 < 3; ++$$8) {
         if ($$3.h()) {
            $$1.a(io.Y, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$1.y && $$1.ag() != bag.a) {
         if ($$3 instanceof bcc $$4 && !$$4.b(baw.p)) {
            $$4.b(new bbg(bbi.t, 40));
         }

      }
   }
}
