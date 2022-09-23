public class cdx extends cdi {
   public cdx(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for(int $$4 = 0; $$4 < $$0.b(); ++$$4) {
         cax $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cjt.a($$5.c()) instanceof cqj) {
               ++$$2;
            } else {
               if (!($$5.c() instanceof bzr)) {
                  return false;
               }

               ++$$3;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cax a(bxa $$0) {
      cax $$1 = cax.b;
      bzr $$2 = (bzr)caz.pr;

      for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
         cax $$4 = $$0.a($$3);
         if (!$$4.b()) {
            cat $$5 = $$4.c();
            if (cjt.a($$5) instanceof cqj) {
               $$1 = $$4;
            } else if ($$5 instanceof bzr) {
               $$2 = (bzr)$$5;
            }
         }
      }

      cax $$6 = cqj.b($$2.d());
      if ($$1.t()) {
         $$6.c($$1.u().g());
      }

      return $$6;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cdr<?> U_() {
      return cdr.m;
   }
}
