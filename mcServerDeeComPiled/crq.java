import javax.annotation.Nullable;

public class crq extends clr implements coa {
   public static final cwm<cwk> b = clr.a;
   protected static final float c = 6.0F;
   protected static final dxj d = cjt.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public crq(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return d;
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.d($$1, $$2, gy.b) && !$$0.a(cju.jv);
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(cju.bj);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = super.a($$0);
      if ($$1 != null) {
         dpv $$2 = $$0.q().b_($$0.a().b());
         if ($$2.a(akp.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      if ($$0.c(b) == cwk.a) {
         cvo $$3 = $$1.a_($$2.c());
         return $$3.a(this) && $$3.c(b) == cwk.b;
      } else {
         dpv $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(akp.a) && $$4.e() == 8;
      }
   }

   @Override
   public dpv c_(cvo $$0) {
      return dpw.c.a(false);
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
