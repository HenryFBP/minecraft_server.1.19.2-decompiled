public class cbs extends cat {
   public cbs(cat.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cax $$0, cgx $$1, cvo $$2, gt $$3, bcc $$4) {
      if (!$$1.y && !$$2.a(akl.aB)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bbs.a));
      }

      return !$$2.a(akl.K)
            && !$$2.a(cju.bf)
            && !$$2.a(cju.bg)
            && !$$2.a(cju.bh)
            && !$$2.a(cju.bi)
            && !$$2.a(cju.qo)
            && !$$2.a(cju.em)
            && !$$2.a(cju.eP)
            && !$$2.a(akl.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(cvo $$0) {
      return $$0.a(cju.bf) || $$0.a(cju.ch) || $$0.a(cju.eP);
   }

   @Override
   public float a(cax $$0, cvo $$1) {
      if ($$1.a(cju.bf) || $$1.a(akl.K)) {
         return 15.0F;
      } else if ($$1.a(akl.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cju.em) && !$$1.a(cju.en) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      cjt $$4 = $$3.b();
      if ($$4 instanceof cmz $$5 && !$$5.o($$3)) {
         buc $$6 = $$0.o();
         cax $$7 = $$0.n();
         if ($$6 instanceof agh) {
            aj.M.a((agh)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, ajw.iz, ajx.e, 1.0F, 1.0F);
         $$1.b($$2, $$5.n($$3));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return baj.a($$1.y);
      }

      return super.a($$0);
   }
}
