public class cqo extends cna {
   public cqo(cvn.c $$0) {
      super($$0);
   }

   @Override
   public void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, float $$4) {
      if ($$3.bN()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, baw.k);
      }

   }

   @Override
   public void a(cgd $$0, bbn $$1) {
      if ($$1.bN()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }

   }

   private void a(bbn $$0) {
      dwq $$1 = $$0.dd();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bcc ? 1.0 : 0.8;
         $$0.n($$1.c, -$$1.d * $$2, $$1.e);
      }

   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bbn $$3) {
      double $$4 = Math.abs($$3.dd().d);
      if ($$4 < 0.1 && !$$3.bM()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.f($$3.dd().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
