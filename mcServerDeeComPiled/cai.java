public class cai extends cat {
   public cai(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      buc $$1 = $$0.o();
      cgx $$2 = $$0.q();
      gt $$3 = $$0.a();
      cvo $$4 = $$2.a_($$3);
      if (!cke.h($$4) && !ckf.g($$4) && !ckg.g($$4)) {
         gt $$5 = $$3.a($$0.k());
         if (cjh.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, ajw.gt, ajx.e, 1.0F, $$2.r_().i() * 0.4F + 0.8F);
            cvo $$6 = cjh.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, czv.i, $$3);
            cax $$7 = $$0.n();
            if ($$1 instanceof agh) {
               aj.y.a((agh)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return baj.a($$2.k_());
         } else {
            return baj.e;
         }
      } else {
         $$2.a($$1, $$3, ajw.gt, ajx.e, 1.0F, $$2.r_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(cwe.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, czv.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return baj.a($$2.k_());
      }
   }
}
