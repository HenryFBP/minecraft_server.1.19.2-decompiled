public class cef extends cdi {
   public cef(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      if ($$0.g() == 3 && $$0.f() == 3) {
         for(int $$2 = 0; $$2 < $$0.g(); ++$$2) {
            for(int $$3 = 0; $$3 < $$0.f(); ++$$3) {
               cax $$4 = $$0.a($$2 + $$3 * $$0.g());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(caz.tl)) {
                     return false;
                  }
               } else if (!$$4.a(caz.mR)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cax a(bxa $$0) {
      cax $$1 = $$0.a(1 + $$0.g());
      if (!$$1.a(caz.tl)) {
         return cax.b;
      } else {
         cax $$2 = new cax(caz.tk, 8);
         ccu.a($$2, ccu.d($$1));
         ccu.a($$2, ccu.b($$1));
         return $$2;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cdr<?> U_() {
      return cdr.j;
   }
}
