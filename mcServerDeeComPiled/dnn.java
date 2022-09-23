public class dnn extends dkz {
   private boolean h;
   private boolean i;

   public dnn(amn $$0, int $$1, int $$2) {
      super(dls.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dnn(pj $$0) {
      super(dls.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dlr $$0, pj $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cju.o.m(), cju.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cju.o.m(), cju.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cju.o.m(), cju.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cju.o.m(), cju.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cju.o.m(), cju.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cju.o.m(), cju.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cju.o.m(), cju.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cju.O.m(), cju.O.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cju.O.m(), cju.O.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cju.O.m(), cju.O.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cju.O.m(), cju.O.m(), false);
         this.a($$0, cju.dd.m(), 2, 3, 2, $$4);
         this.a($$0, cju.dd.m(), 3, 3, 7, $$4);
         this.a($$0, cju.a.m(), 1, 3, 4, $$4);
         this.a($$0, cju.a.m(), 5, 3, 4, $$4);
         this.a($$0, cju.a.m(), 5, 3, 5, $$4);
         this.a($$0, cju.fu.m(), 1, 3, 5, $$4);
         this.a($$0, cju.cl.m(), 3, 2, 6, $$4);
         this.a($$0, cju.eA.m(), 4, 2, 6, $$4);
         this.a($$0, cju.dd.m(), 1, 2, 1, $$4);
         this.a($$0, cju.dd.m(), 5, 2, 1, $$4);
         cvo $$7 = cju.eR.m().a(crd.a, gy.c);
         cvo $$8 = cju.eR.m().a(crd.a, gy.f);
         cvo $$9 = cju.eR.m().a(crd.a, gy.e);
         cvo $$10 = cju.eR.m().a(crd.a, gy.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(crd.c, cww.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(crd.c, cww.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(crd.c, cww.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(crd.c, cww.e), 6, 4, 8, $$4);

         for(int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for(int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cju.O.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            gt $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               bsg $$14 = bbr.bd.a((cgx)$$0.D());
               $$14.fp();
               $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
               $$14.a($$0, $$0.d_($$13), bcg.d, null, null);
               $$0.a_($$14);
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(chm $$0, dkt $$1) {
      if (!this.i) {
         gt $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bnh $$3 = bbr.l.a((cgx)$$0.D());
            $$3.fp();
            $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
            $$3.a($$0, $$0.d_($$2), bcg.d, null, null);
            $$0.a_($$3);
         }
      }

   }
}
