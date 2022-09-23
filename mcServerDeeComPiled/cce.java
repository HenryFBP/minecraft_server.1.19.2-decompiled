public class cce extends cat {
   public static final String a = "Effects";
   public static final String b = "EffectId";
   public static final String c = "EffectDuration";

   public cce(cat.a $$0) {
      super($$0);
   }

   public static void a(cax $$0, bbe $$1, int $$2) {
      pj $$3 = $$0.v();
      pp $$4 = $$3.c("Effects", 9);
      pj $$5 = new pj();
      $$5.a("EffectId", bbe.a($$1));
      $$5.a("EffectDuration", $$2);
      $$4.add($$5);
      $$3.a("Effects", (qc)$$4);
   }

   @Override
   public cax a(cax $$0, cgx $$1, bcc $$2) {
      cax $$3 = super.a($$0, $$1, $$2);
      pj $$4 = $$0.u();
      if ($$4 != null && $$4.b("Effects", 9)) {
         pp $$5 = $$4.c("Effects", 10);

         for(int $$6 = 0; $$6 < $$5.size(); ++$$6) {
            int $$7 = 160;
            pj $$8 = $$5.a($$6);
            if ($$8.b("EffectDuration", 3)) {
               $$7 = $$8.h("EffectDuration");
            }

            bbe $$9 = bbe.a($$8.h("EffectId"));
            if ($$9 != null) {
               $$2.b(new bbg($$9, $$7));
            }
         }
      }

      return $$2 instanceof buc && ((buc)$$2).fB().d ? $$3 : new cax(caz.nM);
   }
}
