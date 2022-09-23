public class cqz extends cjt {
   private static final dxj a = cjt.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int b = 14;
   private static final int c = 10;
   private static final int d = 10;

   public cqz(cvn.c $$0) {
      super($$0);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return cjt.a($$1, $$2.b(), gy.a) && !$$1.C($$2);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == gy.b && !this.a($$0, $$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(io.as, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      gt.a $$10 = new gt.a();

      for(int $$11 = 0; $$11 < 14; ++$$11) {
         $$10.d($$4 + ami.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ami.a($$3, -10, 10));
         cvo $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(io.aw, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }

   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }
}
