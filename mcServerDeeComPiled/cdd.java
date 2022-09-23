public class cdd extends cdi {
   public cdd(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      bzq $$2 = null;
      cax $$3 = null;
      cax $$4 = null;

      for(int $$5 = 0; $$5 < $$0.b(); ++$$5) {
         cax $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cat $$7 = $$6.c();
            if (!($$7 instanceof byu)) {
               return false;
            }

            byu $$8 = (byu)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = csy.c($$6);
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cax a(bxa $$0) {
      for(int $$1 = 0; $$1 < $$0.b(); ++$$1) {
         cax $$2 = $$0.a($$1);
         if (!$$2.b()) {
            int $$3 = csy.c($$2);
            if ($$3 > 0 && $$3 <= 6) {
               cax $$4 = $$2.o();
               $$4.e(1);
               return $$4;
            }
         }
      }

      return cax.b;
   }

   public hi<cax> b(bxa $$0) {
      hi<cax> $$1 = hi.a($$0.b(), cax.b);

      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         cax $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.c().t()) {
               $$1.set($$2, new cax($$3.c().s()));
            } else if ($$3.t() && csy.c($$3) > 0) {
               cax $$4 = $$3.o();
               $$4.e(1);
               $$1.set($$2, $$4);
            }
         }
      }

      return $$1;
   }

   @Override
   public cdr<?> U_() {
      return cdr.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
