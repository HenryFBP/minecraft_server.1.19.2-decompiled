public class ckn extends cmz implements cjv, ckm {
   private static final float f = 0.11F;

   public ckn(cvn.c $$0) {
      super($$0, gy.a, o_, false, 0.1);
      this.k(this.D.b().a(d, Integer.valueOf(0)).a(p_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(amn $$0) {
      return 1;
   }

   @Override
   protected boolean g(cvo $$0) {
      return $$0.h();
   }

   @Override
   protected cjt b() {
      return cju.qf;
   }

   @Override
   protected cvo a(cvo $$0, cvo $$1) {
      return $$1.a(p_, (Boolean)$$0.c(p_));
   }

   @Override
   protected cvo a(cvo $$0, amn $$1) {
      return super.a($$0, $$1).a(p_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(caz.uj);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      return ckm.a_($$0, $$1, $$2);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      super.a($$0);
      $$0.a(p_);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return !$$2.c(p_);
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      $$0.a($$2, $$3.a(p_, Boolean.valueOf(true)), 2);
   }
}
