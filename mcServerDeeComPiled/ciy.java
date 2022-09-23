public class ciy extends cjt implements cjv {
   protected static final float a = 4.0F;
   protected static final dxj b = cjt.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public ciy(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      dwq $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$3.a(3) == 0 && $$1.x($$2.b()) && $$1.b($$2.b(), 0) >= 9) {
         this.a($$1, $$2);
      }

   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return $$1.a_($$2.c()).a(akl.ap);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if (!$$0.a($$3, $$4)) {
         return cju.a.m();
      } else {
         if ($$1 == gy.b && $$2.a(cju.lK)) {
            $$3.a($$4, cju.lK.m(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(caz.df);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return $$0.a_($$1.b()).h();
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(cvo $$0, buc $$1, cgd $$2, gt $$3) {
      return $$1.ez().c() instanceof ccf ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cgx $$0, gt $$1) {
      $$0.a($$1.b(), cju.lK.m().a(cix.h, cwb.b), 3);
   }
}
