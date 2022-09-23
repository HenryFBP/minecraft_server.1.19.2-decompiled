public class cdj extends cdi {
   private static final cdm a = cdm.a(caz.oX);
   private static final cdm b = cdm.a(caz.nQ);
   private static final cdm c = cdm.a(caz.sr);

   public cdj(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for(int $$4 = 0; $$4 < $$0.b(); ++$$4) {
         cax $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (a.a($$5)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else if (b.a($$5)) {
               if (++$$3 > 3) {
                  return false;
               }
            } else if (!c.a($$5)) {
               return false;
            }
         }
      }

      return $$2 && $$3 >= 1;
   }

   public cax a(bxa $$0) {
      cax $$1 = new cax(caz.sq, 3);
      pj $$2 = $$1.a("Fireworks");
      pp $$3 = new pp();
      int $$4 = 0;

      for(int $$5 = 0; $$5 < $$0.b(); ++$$5) {
         cax $$6 = $$0.a($$5);
         if (!$$6.b()) {
            if (b.a($$6)) {
               ++$$4;
            } else if (c.a($$6)) {
               pj $$7 = $$6.b("Explosion");
               if ($$7 != null) {
                  $$3.add($$7);
               }
            }
         }
      }

      $$2.a("Flight", (byte)$$4);
      if (!$$3.isEmpty()) {
         $$2.a("Explosions", (qc)$$3);
      }

      return $$1;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cax c() {
      return new cax(caz.sq);
   }

   @Override
   public cdr<?> U_() {
      return cdr.g;
   }
}
