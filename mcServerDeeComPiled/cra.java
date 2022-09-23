public abstract class cra extends cqt {
   protected cra(cvn.c $$0) {
      super($$0);
   }

   private static boolean b(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.b();
      cvo $$4 = $$1.a_($$3);
      if ($$4.a(cju.cW) && $$4.c(cqs.b) == 1) {
         return true;
      } else if ($$4.p().e() == 8) {
         return false;
      } else {
         int $$5 = dpj.a($$1, $$0, $$2, $$4, $$3, gy.b, $$4.b($$1, $$3));
         return $$5 < $$1.L();
      }
   }

   private static boolean c(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.b();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(akp.a);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cju.j.m());
      } else {
         if ($$1.D($$2.b()) >= 9) {
            cvo $$4 = this.m();

            for(int $$5 = 0; $$5 < 4; ++$$5) {
               gt $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(cju.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(a, Boolean.valueOf($$1.a_($$6.b()).a(cju.cW))));
               }
            }
         }

      }
   }
}
