public class cdo extends cdu {
   public cdo(abb $$0) {
      super(
         $$0,
         "",
         3,
         3,
         hi.a(cdm.a, cdm.a(caz.oX), cdm.a(caz.oX), cdm.a(caz.oX), cdm.a(caz.oX), cdm.a(caz.qc), cdm.a(caz.oX), cdm.a(caz.oX), cdm.a(caz.oX), cdm.a(caz.oX)),
         new cax(caz.sg)
      );
   }

   @Override
   public boolean a(bxa $$0, cgx $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cax $$2 = cax.b;

         for(int $$3 = 0; $$3 < $$0.b() && $$2.b(); ++$$3) {
            cax $$4 = $$0.a($$3);
            if ($$4.a(caz.qc)) {
               $$2 = $$4;
            }
         }

         if ($$2.b()) {
            return false;
         } else {
            drg $$5 = cbd.a($$2, $$1);
            if ($$5 == null) {
               return false;
            } else if ($$5.e()) {
               return false;
            } else {
               return $$5.f < 4;
            }
         }
      }
   }

   @Override
   public cax a(bxa $$0) {
      cax $$1 = cax.b;

      for(int $$2 = 0; $$2 < $$0.b() && $$1.b(); ++$$2) {
         cax $$3 = $$0.a($$2);
         if ($$3.a(caz.qc)) {
            $$1 = $$3;
         }
      }

      $$1 = $$1.o();
      $$1.e(1);
      $$1.v().a("map_scale_direction", 1);
      return $$1;
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public cdr<?> U_() {
      return cdr.f;
   }
}
