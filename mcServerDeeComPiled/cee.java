public class cee extends cdi {
   public cee(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for(int $$6 = 0; $$6 < $$0.b(); ++$$6) {
         cax $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cju.bR.l()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cju.bS.l()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(aks.K) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(caz.nM) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cax a(bxa $$0) {
      cax $$1 = cax.b;

      for(int $$2 = 0; $$2 < $$0.b(); ++$$2) {
         cax $$3 = $$0.a($$2);
         if (!$$3.b() && $$3.a(aks.K)) {
            $$1 = $$3;
            break;
         }
      }

      cax $$4 = new cax(caz.tN, 1);
      if ($$1.c() instanceof byx && ((byx)$$1.c()).e() instanceof cmk $$5) {
         bbe $$6 = $$5.b();
         cce.a($$4, $$6, $$5.c());
      }

      return $$4;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cdr<?> U_() {
      return cdr.n;
   }
}
