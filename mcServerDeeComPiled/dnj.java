import java.util.Map;

public class dnj {
   static final gt a = new gt(4, 0, 15);
   private static final abb[] b = new abb[]{
      new abb("shipwreck/with_mast"),
      new abb("shipwreck/sideways_full"),
      new abb("shipwreck/sideways_fronthalf"),
      new abb("shipwreck/sideways_backhalf"),
      new abb("shipwreck/rightsideup_full"),
      new abb("shipwreck/rightsideup_fronthalf"),
      new abb("shipwreck/rightsideup_backhalf"),
      new abb("shipwreck/with_mast_degraded"),
      new abb("shipwreck/rightsideup_full_degraded"),
      new abb("shipwreck/rightsideup_fronthalf_degraded"),
      new abb("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final abb[] c = new abb[]{
      new abb("shipwreck/with_mast"),
      new abb("shipwreck/upsidedown_full"),
      new abb("shipwreck/upsidedown_fronthalf"),
      new abb("shipwreck/upsidedown_backhalf"),
      new abb("shipwreck/sideways_full"),
      new abb("shipwreck/sideways_fronthalf"),
      new abb("shipwreck/sideways_backhalf"),
      new abb("shipwreck/rightsideup_full"),
      new abb("shipwreck/rightsideup_fronthalf"),
      new abb("shipwreck/rightsideup_backhalf"),
      new abb("shipwreck/with_mast_degraded"),
      new abb("shipwreck/upsidedown_full_degraded"),
      new abb("shipwreck/upsidedown_fronthalf_degraded"),
      new abb("shipwreck/upsidedown_backhalf_degraded"),
      new abb("shipwreck/sideways_full_degraded"),
      new abb("shipwreck/sideways_fronthalf_degraded"),
      new abb("shipwreck/sideways_backhalf_degraded"),
      new abb("shipwreck/rightsideup_full_degraded"),
      new abb("shipwreck/rightsideup_fronthalf_degraded"),
      new abb("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, abb> d = Map.of("map_chest", dry.H, "treasure_chest", dry.J, "supply_chest", dry.I);

   public static void a(dou $$0, gt $$1, cpw $$2, dlg $$3, amn $$4, boolean $$5) {
      abb $$6 = ad.a($$5 ? b : c, $$4);
      $$3.a(new dnj.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dll {
      private final boolean h;

      public a(dou $$0, abb $$1, gt $$2, cpw $$3, boolean $$4) {
         super(dls.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dou $$0, pj $$1) {
         super(dls.ab, $$1, $$0, $$1x -> a(cpw.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dop a(cpw $$0) {
         return new dop().a($$0).a(coh.a).a(dnj.a).a(dnw.d);
      }

      @Override
      protected void a(String $$0, gt $$1, chm $$2, amn $$3, dkt $$4) {
         abb $$5 = (abb)dnj.d.get($$0);
         if ($$5 != null) {
            cuf.a($$2, $$3, $$1.c(), $$5);
         }

      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         int $$7 = $$0.ah();
         int $$8 = 0;
         hs $$9 = this.b.a();
         dar.a $$10 = this.h ? dar.a.a : dar.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            gt $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for(gt $$13 : gt.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new gt(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
