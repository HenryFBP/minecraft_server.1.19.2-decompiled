public class dbd implements cgk {
   private int a;

   @Override
   public int a(agg $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.W().b(cgt.z)) {
         return 0;
      } else {
         amn $$3 = $$0.w;
         --this.a;
         if (this.a > 0) {
            return 0;
         } else {
            this.a += (60 + $$3.a(60)) * 20;
            if ($$0.o_() < 5 && $$0.q_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for(buc $$5 : $$0.w()) {
                  if (!$$5.B_()) {
                     gt $$6 = $$5.da();
                     if (!$$0.q_().g() || $$6.v() >= $$0.m_() && $$0.g($$6)) {
                        bah $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           akc $$8 = ((agh)$$5).D();
                           int $$9 = ami.a($$8.a(akg.i.b(akg.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              gt $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              cvo $$12 = $$0.a_($$11);
                              dpv $$13 = $$0.b_($$11);
                              if (chi.a($$0, $$11, $$12, $$13, bbr.ap)) {
                                 bcu $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for(int $$16 = 0; $$16 < $$15; ++$$16) {
                                    brs $$17 = bbr.ap.a((cgx)$$0);
                                    $$17.a($$11, 0.0F, 0.0F);
                                    $$14 = $$17.a($$0, $$7, bcg.a, $$14, null);
                                    $$0.a_($$17);
                                 }

                                 $$4 += $$15;
                              }
                           }
                        }
                     }
                  }
               }

               return $$4;
            }
         }
      }
   }
}
