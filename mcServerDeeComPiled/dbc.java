public class dbc implements cgk {
   private int a;

   @Override
   public int a(agg $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.W().b(cgt.F)) {
         return 0;
      } else {
         amn $$3 = $$0.w;
         --this.a;
         if (this.a > 0) {
            return 0;
         } else {
            this.a += 12000 + $$3.a(1200);
            long $$4 = $$0.V() / 24000L;
            if ($$4 < 5L || !$$0.M()) {
               return 0;
            } else if ($$3.a(5) != 0) {
               return 0;
            } else {
               int $$5 = $$0.w().size();
               if ($$5 < 1) {
                  return 0;
               } else {
                  buc $$6 = (buc)$$0.w().get($$3.a($$5));
                  if ($$6.B_()) {
                     return 0;
                  } else if ($$0.a($$6.da(), 2)) {
                     return 0;
                  } else {
                     int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     gt.a $$9 = $$6.da().i().e($$7, 0, $$8);
                     int $$10 = 10;
                     if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                        return 0;
                     } else {
                        hc<cht> $$11 = $$0.w($$9);
                        if ($$11.a(akk.ac)) {
                           return 0;
                        } else {
                           int $$12 = 0;
                           int $$13 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                           for(int $$14 = 0; $$14 < $$13; ++$$14) {
                              ++$$12;
                              $$9.q($$0.a(dar.a.f, $$9).v());
                              if ($$14 == 0) {
                                 if (!this.a($$0, $$9, $$3, true)) {
                                    break;
                                 }
                              } else {
                                 this.a($$0, $$9, $$3, false);
                              }

                              $$9.p($$9.u() + $$3.a(5) - $$3.a(5));
                              $$9.r($$9.w() + $$3.a(5) - $$3.a(5));
                           }

                           return $$12;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(agg $$0, gt $$1, amn $$2, boolean $$3) {
      cvo $$4 = $$0.a_($$1);
      if (!chi.a($$0, $$1, $$4, $$4.p(), bbr.at)) {
         return false;
      } else if (!brr.b(bbr.at, $$0, bcg.p, $$1, $$2)) {
         return false;
      } else {
         brr $$5 = bbr.at.a((cgx)$$0);
         if ($$5 != null) {
            if ($$3) {
               $$5.v(true);
               $$5.fR();
            }

            $$5.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), bcg.p, null, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
