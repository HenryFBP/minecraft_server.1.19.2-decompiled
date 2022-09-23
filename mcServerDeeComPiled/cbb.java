public class cbb extends cat {
   public cbb(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      if ($$3.a(akl.O)) {
         buc $$4 = $$0.o();
         if (!$$1.y && $$4 != null) {
            a($$4, $$1, $$2);
         }

         $$1.a(czv.b, $$2, czv.a.a($$4));
         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   public static baj a(buc $$0, cgx $$1, gt $$2) {
      bqp $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for(bce $$10 : $$1.a(
         bce.class, new dwl((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fz() == $$0) {
            if ($$3 == null) {
               $$3 = bqp.b($$1, $$2);
               $$3.u();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      return $$4 ? baj.a : baj.d;
   }
}
