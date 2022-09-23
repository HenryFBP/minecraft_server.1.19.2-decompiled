public class cot extends cjt implements cjv {
   public cot(cvn.c $$0) {
      super($$0);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      if (!$$0.a_($$1.b()).a($$0, $$1)) {
         return false;
      } else {
         for(gt $$4 : gt.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$4).a(akl.aC)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for(gt $$6 : gt.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         cvo $$7 = $$0.a_($$6);
         if ($$7.a(cju.mY)) {
            $$5 = true;
         }

         if ($$7.a(cju.nh)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cju.mY.m() : cju.nh.m(), 3);
      } else if ($$5) {
         $$0.a($$2, cju.mY.m(), 3);
      } else if ($$4) {
         $$0.a($$2, cju.nh.m(), 3);
      }

   }
}
