public class cdw extends cdi {
   public cdw(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      cax $$2 = cax.b;
      cax $$3 = cax.b;

      for(int $$4 = 0; $$4 < $$0.b(); ++$$4) {
         cax $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.c() instanceof byu) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(caz.tm)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (byx.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cax a(bxa $$0) {
      cax $$1 = cax.b;
      cax $$2 = cax.b;

      for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
         cax $$4 = $$0.a($$3);
         if (!$$4.b()) {
            if ($$4.c() instanceof byu) {
               $$1 = $$4;
            } else if ($$4.a(caz.tm)) {
               $$2 = $$4.o();
            }
         }
      }

      if ($$2.b()) {
         return $$2;
      } else {
         pj $$5 = byx.a($$1);
         pj $$6 = $$5 == null ? new pj() : $$5.g();
         $$6.a("Base", ((byu)$$1.c()).b().a());
         byx.a($$2, ctk.s, $$6);
         return $$2;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cdr<?> U_() {
      return cdr.l;
   }
}
