import java.util.Map;

public abstract class cim extends cjt {
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 3;
   private static final int f = 2;
   protected static final int a = 4;
   private static final dxj g = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final dxj b = dxg.a(
      dxg.b(), dxg.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), g), dwu.e
   );
   private final Map<cat, hu> h;

   public cim(cvn.c $$0, Map<cat, hu> $$1) {
      super($$0);
      this.h = $$1;
   }

   protected double a(cvo $$0) {
      return 0.0;
   }

   protected boolean a(cvo $$0, gt $$1, bbn $$2) {
      return $$2.dh() < (double)$$1.v() + this.a($$0) && $$2.cy().e > (double)$$1.v() + 0.25;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      hu $$7 = (hu)this.h.get($$6.c());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2) {
      return g;
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   public abstract boolean c(cvo var1);

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      gt $$4 = cpa.a((cgx)$$1, $$2);
      if ($$4 != null) {
         dpu $$5 = cpa.a($$1, $$4);
         if ($$5 != dpw.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }

      }
   }

   protected boolean a(dpu $$0) {
      return false;
   }

   protected void a(cvo $$0, cgx $$1, gt $$2, dpu $$3) {
   }
}
