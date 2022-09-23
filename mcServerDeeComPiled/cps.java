public class cps extends clm {
   protected static final float e = 6.0F;
   protected static final float f = 10.0F;
   protected static final dxj g = cjt.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final dxj h = cjt.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final dxj i = cjt.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected cps(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch(((gy)$$0.c(a)).o()) {
         case a:
         default:
            return i;
         case c:
            return h;
         case b:
            return g;
      }
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
