public class cph extends crg {
   protected cph(cvn.c $$0) {
      super($$0);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      if ($$6.a(caz.qd)) {
         if (!$$1.y) {
            gy $$7 = $$5.b();
            gy $$8 = $$7.o() == gy.a.b ? $$3.cv().g() : $$7;
            $$1.a(null, $$2, ajw.qC, ajx.e, 1.0F, 1.0F);
            $$1.a($$2, cju.do.m().a(ckk.a, $$8), 11);
            bqv $$9 = new bqv(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cax(caz.qg, 4)
            );
            $$9.n(0.05 * (double)$$8.j() + $$1.w.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.w.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, czv.O, $$2);
            $$3.b(akg.c.b(caz.qd));
         }

         return baj.a($$1.y);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public crf b() {
      return (crf)cju.ek;
   }

   @Override
   public civ c() {
      return (civ)cju.ei;
   }
}
