import javax.annotation.Nullable;

public class cqi extends cka implements cjv, coa {
   protected static final float a = 6.0F;
   protected static final dxj b = cjt.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   protected cqi(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.d($$1, $$2, gy.b) && !$$0.a(cju.jv);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      return $$1.a(akp.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      cvo $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.h()) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public dpv c_(cvo $$0) {
      return dpw.c.a(false);
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      cvo $$4 = cju.bk.m();
      cvo $$5 = $$4.a(crq.b, cwk.a);
      gt $$6 = $$2.b();
      if ($$0.a_($$6).a(cju.C)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }

   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, dpu $$3) {
      return false;
   }

   @Override
   public boolean a(cgy $$0, gt $$1, cvo $$2, dpv $$3) {
      return false;
   }
}
