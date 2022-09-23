public class csi extends cka {
   protected static final dxj a = cjt.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected csi(cvn.c $$0) {
      super($$0);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof agg && $$3 instanceof bvv) {
         $$1.a(new gt($$2), true, $$3);
      }

   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      dpv $$3 = $$1.b_($$2);
      dpv $$4 = $$1.b_($$2.b());
      return ($$3.a() == dpw.c || $$0.d() == dpz.H) && $$4.a() == dpw.a;
   }
}
