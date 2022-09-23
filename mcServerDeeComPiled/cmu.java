import java.util.List;

public class cmu extends cra implements cjv {
   public cmu(cvn.c $$0) {
      super($$0);
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
      gt $$4 = $$2.b();
      cvo $$5 = cju.bg.m();

      label46:
      for(int $$6 = 0; $$6 < 128; ++$$6) {
         gt $$7 = $$4;

         for(int $$8 = 0; $$8 < $$6 / 16; ++$$8) {
            $$7 = $$7.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$7.c()).a(this) || $$0.a_($$7).r($$0, $$7)) {
               continue label46;
            }
         }

         cvo $$9 = $$0.a_($$7);
         if ($$9.a($$5.b()) && $$1.a(10) == 0) {
            ((cjv)$$5.b()).a($$0, $$1, $$7, $$9);
         }

         if ($$9.h()) {
            hc<dkg> $$11;
            if ($$1.a(8) == 0) {
               List<ddg<?, ?>> $$10 = $$0.w($$7).a().e().a();
               if ($$10.isEmpty()) {
                  continue;
               }

               $$11 = ((dgk)((ddg)$$10.get(0)).c()).d();
            } else {
               $$11 = nv.n;
            }

            ((dkg)$$11.a()).a($$0, $$0.k().g(), $$1, $$7);
         }
      }

   }
}
