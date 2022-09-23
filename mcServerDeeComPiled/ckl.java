public class ckl extends cim {
   private static final float c = 0.05F;
   private static final float d = 0.1F;

   public ckl(cvn.c $$0) {
      super($$0, hu.a);
   }

   @Override
   public boolean c(cvo $$0) {
      return false;
   }

   protected static boolean a(cgx $$0, cht.c $$1) {
      if ($$1 == cht.c.b) {
         return $$0.r_().i() < 0.05F;
      } else if ($$1 == cht.c.c) {
         return $$0.r_().i() < 0.1F;
      } else {
         return false;
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cht.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cht.c.b) {
            $$1.b($$2, cju.eB.m());
            $$1.a(null, czv.c, $$2);
         } else if ($$3 == cht.c.c) {
            $$1.b($$2, cju.eD.m());
            $$1.a(null, czv.c, $$2);
         }

      }
   }

   @Override
   protected boolean a(dpu $$0) {
      return true;
   }

   @Override
   protected void a(cvo $$0, cgx $$1, gt $$2, dpu $$3) {
      if ($$3 == dpw.c) {
         cvo $$4 = cju.eB.m();
         $$1.b($$2, $$4);
         $$1.a(czv.c, $$2, czv.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == dpw.e) {
         cvo $$5 = cju.eC.m();
         $$1.b($$2, $$5);
         $$1.a(czv.c, $$2, czv.a.a($$5));
         $$1.c(1046, $$2, 0);
      }

   }
}
