public class cru extends cjt {
   protected static final int g = 2;
   protected static final dxj h = cjt.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final im i;

   protected cru(cvn.c $$0, im $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return h;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == gy.a && !this.a($$0, $$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return a($$1, $$2.c(), gy.b);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(io.Y, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
