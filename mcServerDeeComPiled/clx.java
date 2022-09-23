public class clx extends cjg {
   protected static final dxj a = cjt.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   protected clx(cvn.c $$0) {
      super($$0);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cuq($$0, $$1);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if ($$1 instanceof agg
         && !$$3.bI()
         && !$$3.bJ()
         && $$3.ck()
         && dxg.c(dxg.a($$3.cy().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), dwu.i)) {
         aba<cgx> $$4 = $$1.ab() == cgx.g ? cgx.e : cgx.g;
         agg $$5 = ((agg)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(io.Y, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return cax.b;
   }

   @Override
   public boolean a(cvo $$0, dpu $$1) {
      return false;
   }
}
