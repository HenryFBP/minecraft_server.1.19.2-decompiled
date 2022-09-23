public class dmm {
   public static class a extends dlf {
      public a(gt $$0) {
         super(dls.aa, 0, new dkt($$0));
      }

      public a(pj $$0) {
         super(dls.aa, $$0);
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         int $$7 = $$0.a(dar.a.c, this.f.g(), this.f.i());
         gt.a $$8 = new gt.a(this.f.g(), $$7, this.f.i());

         while($$8.v() > $$0.u_()) {
            cvo $$9 = $$0.a_($$8);
            cvo $$10 = $$0.a_($$8.c());
            if ($$10 == cju.aI.m() || $$10 == cju.b.m() || $$10 == cju.g.m() || $$10 == cju.c.m() || $$10 == cju.e.m()) {
               cvo $$11 = !$$9.h() && !this.b($$9) ? $$9 : cju.E.m();

               for(gy $$12 : gy.values()) {
                  gt $$13 = $$8.a($$12);
                  cvo $$14 = $$0.a_($$13);
                  if ($$14.h() || this.b($$14)) {
                     gt $$15 = $$13.c();
                     cvo $$16 = $$0.a_($$15);
                     if (($$16.h() || this.b($$16)) && $$12 != gy.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new dkt($$8);
               this.a($$0, $$4, $$3, $$8, dry.G, null);
               return;
            }

            $$8.e(0, -1, 0);
         }

      }

      private boolean b(cvo $$0) {
         return $$0 == cju.C.m() || $$0 == cju.D.m();
      }
   }
}
