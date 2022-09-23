public class cls extends cme {
   protected static final dxj a = cjt.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public cls(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      this.d($$0, $$1, $$2);
      return baj.a($$1.y);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(cvo $$0, cgx $$1, gt $$2) {
      cxe $$3 = $$1.p_();

      for(int $$4 = 0; $$4 < 1000; ++$$4) {
         gt $$5 = $$2.b($$1.w.a(16) - $$1.w.a(16), $$1.w.a(8) - $$1.w.a(8), $$1.w.a(16) - $$1.w.a(16));
         if ($$1.a_($$5).h() && $$3.a($$5)) {
            if ($$1.y) {
               for(int $$6 = 0; $$6 < 128; ++$$6) {
                  double $$7 = $$1.w.j();
                  float $$8 = ($$1.w.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.w.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.w.i() - 0.5F) * 0.2F;
                  double $$11 = ami.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.w.j() - 0.5) + 0.5;
                  double $$12 = ami.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.w.j() - 0.5;
                  double $$13 = ami.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.w.j() - 0.5) + 0.5;
                  $$1.a(io.W, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
               }
            } else {
               $$1.a($$5, $$0, 2);
               $$1.a($$2, false);
            }

            return;
         }
      }

   }

   @Override
   protected int c() {
      return 5;
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
