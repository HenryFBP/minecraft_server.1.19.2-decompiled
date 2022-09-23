import javax.annotation.Nullable;

public class cnn extends cmz implements coa {
   protected static final dxj f = cjt.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double g = 0.14;

   protected cnn(cvn.c $$0) {
      super($$0, gy.b, f, true, 0.14);
   }

   @Override
   protected boolean g(cvo $$0) {
      return $$0.a(cju.C);
   }

   @Override
   protected cjt b() {
      return cju.kP;
   }

   @Override
   protected boolean h(cvo $$0) {
      return !$$0.a(cju.jv);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, dpu $$3) {
      return false;
   }

   @Override
   public boolean a(cgy $$0, gt $$1, cvo $$2, dpv $$3) {
      return false;
   }

   @Override
   protected int a(amn $$0) {
      return 1;
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      return $$1.a(akp.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dpv c_(cvo $$0) {
      return dpw.c.a(false);
   }
}
