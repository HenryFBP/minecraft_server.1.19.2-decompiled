import java.util.List;

public class caa extends cat {
   public caa(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      if (!$$3.a(cju.bZ) && !$$3.a(cju.B)) {
         return baj.e;
      } else {
         gt $$4 = $$2.b();
         if (!$$1.x($$4)) {
            return baj.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bbn> $$8 = $$1.a_(null, new dwl($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return baj.e;
            } else {
               if ($$1 instanceof agg) {
                  bpo $$9 = new bpo($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), czv.s, $$4);
                  cyx $$10 = ((agg)$$1).C();
                  if ($$10 != null) {
                     $$10.e();
                  }
               }

               $$0.n().g(1);
               return baj.a($$1.y);
            }
         }
      }
   }

   @Override
   public boolean i(cax $$0) {
      return true;
   }
}
