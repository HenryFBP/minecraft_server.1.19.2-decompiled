public class bzg extends cat {
   public bzg(cat.a $$0) {
      super($$0);
   }

   @Override
   public cax a(cax $$0, cgx $$1, bcc $$2) {
      cax $$3 = super.a($$0, $$1, $$2);
      if (!$$1.y) {
         double $$4 = $$2.df();
         double $$5 = $$2.dh();
         double $$6 = $$2.dl();

         for(int $$7 = 0; $$7 < 16; ++$$7) {
            double $$8 = $$2.df() + ($$2.dQ().j() - 0.5) * 16.0;
            double $$9 = ami.a($$2.dh() + (double)($$2.dQ().a(16) - 8), (double)$$1.u_(), (double)($$1.u_() + ((agg)$$1).j() - 1));
            double $$10 = $$2.dl() + ($$2.dQ().j() - 0.5) * 16.0;
            if ($$2.bI()) {
               $$2.p();
            }

            dwq $$11 = $$2.cY();
            if ($$2.a($$8, $$9, $$10, true)) {
               $$1.a(czv.T, $$11, czv.a.a($$2));
               ajv $$12 = $$2 instanceof bno ? ajw.gJ : ajw.dh;
               $$1.a(null, $$4, $$5, $$6, $$12, ajx.h, 1.0F, 1.0F);
               $$2.a($$12, 1.0F, 1.0F);
               break;
            }
         }

         if ($$2 instanceof buc) {
            ((buc)$$2).fW().a(this, 20);
         }
      }

      return $$3;
   }
}
