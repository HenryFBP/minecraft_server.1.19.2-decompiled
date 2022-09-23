public class dnb {
   private static final abb[] a = new abb[]{
      new abb("nether_fossils/fossil_1"),
      new abb("nether_fossils/fossil_2"),
      new abb("nether_fossils/fossil_3"),
      new abb("nether_fossils/fossil_4"),
      new abb("nether_fossils/fossil_5"),
      new abb("nether_fossils/fossil_6"),
      new abb("nether_fossils/fossil_7"),
      new abb("nether_fossils/fossil_8"),
      new abb("nether_fossils/fossil_9"),
      new abb("nether_fossils/fossil_10"),
      new abb("nether_fossils/fossil_11"),
      new abb("nether_fossils/fossil_12"),
      new abb("nether_fossils/fossil_13"),
      new abb("nether_fossils/fossil_14")
   };

   public static void a(dou $$0, dlg $$1, amn $$2, gt $$3) {
      cpw $$4 = cpw.a($$2);
      $$1.a(new dnb.a($$0, ad.a(a, $$2), $$3, $$4));
   }

   public static class a extends dll {
      public a(dou $$0, abb $$1, gt $$2, cpw $$3) {
         super(dls.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dou $$0, pj $$1) {
         super(dls.ac, $$1, $$0, $$1x -> a(cpw.valueOf($$1.l("Rot"))));
      }

      private static dop a(cpw $$0) {
         return new dop().a($$0).a(coh.a).a(dnw.d);
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gt $$1, chm $$2, amn $$3, dkt $$4) {
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
