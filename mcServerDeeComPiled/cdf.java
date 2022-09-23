public class cdf extends cdi {
   public cdf(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      int $$2 = 0;
      cax $$3 = cax.b;

      for(int $$4 = 0; $$4 < $$0.b(); ++$$4) {
         cax $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(caz.rY)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(caz.rX)) {
                  return false;
               }

               ++$$2;
            }
         }
      }

      return !$$3.b() && $$3.t() && $$2 > 0;
   }

   public cax a(bxa $$0) {
      int $$1 = 0;
      cax $$2 = cax.b;

      for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
         cax $$4 = $$0.a($$3);
         if (!$$4.b()) {
            if ($$4.a(caz.rY)) {
               if (!$$2.b()) {
                  return cax.b;
               }

               $$2 = $$4;
            } else {
               if (!$$4.a(caz.rX)) {
                  return cax.b;
               }

               ++$$1;
            }
         }
      }

      if (!$$2.b() && $$2.t() && $$1 >= 1 && ccr.d($$2) < 2) {
         cax $$5 = new cax(caz.rY, $$1);
         pj $$6 = $$2.u().g();
         $$6.a("generation", ccr.d($$2) + 1);
         $$5.c($$6);
         return $$5;
      } else {
         return cax.b;
      }
   }

   public hi<cax> b(bxa $$0) {
      hi<cax> $$1 = hi.a($$0.b(), cax.b);

      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         cax $$3 = $$0.a($$2);
         if ($$3.c().t()) {
            $$1.set($$2, new cax($$3.c().s()));
         } else if ($$3.c() instanceof ccr) {
            cax $$4 = $$3.o();
            $$4.e(1);
            $$1.set($$2, $$4);
            break;
         }
      }

      return $$1;
   }

   @Override
   public cdr<?> U_() {
      return cdr.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
