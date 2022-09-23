public class cdn extends cdi {
   public cdn(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      int $$2 = 0;
      cax $$3 = cax.b;

      for(int $$4 = 0; $$4 < $$0.b(); ++$$4) {
         cax $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(caz.qc)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(caz.sg)) {
                  return false;
               }

               ++$$2;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cax a(bxa $$0) {
      int $$1 = 0;
      cax $$2 = cax.b;

      for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
         cax $$4 = $$0.a($$3);
         if (!$$4.b()) {
            if ($$4.a(caz.qc)) {
               if (!$$2.b()) {
                  return cax.b;
               }

               $$2 = $$4;
            } else {
               if (!$$4.a(caz.sg)) {
                  return cax.b;
               }

               ++$$1;
            }
         }
      }

      if (!$$2.b() && $$1 >= 1) {
         cax $$5 = $$2.o();
         $$5.e($$1 + 1);
         return $$5;
      } else {
         return cax.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cdr<?> U_() {
      return cdr.e;
   }
}
