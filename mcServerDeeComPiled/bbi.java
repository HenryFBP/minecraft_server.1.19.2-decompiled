public class bbi {
   private static final int H = 22;
   public static final bbe a = a(1, "speed", new bbe(bbf.a, 8171462).a(bdd.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2F, bdb.a.c));
   public static final bbe b = a(2, "slowness", new bbe(bbf.b, 5926017).a(bdd.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15F, bdb.a.c));
   public static final bbe c = a(3, "haste", new bbe(bbf.a, 14270531).a(bdd.h, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.1F, bdb.a.c));
   public static final bbe d = a(4, "mining_fatigue", new bbe(bbf.b, 4866583).a(bdd.h, "55FCED67-E92A-486E-9800-B47F202C4386", -0.1F, bdb.a.c));
   public static final bbe e = a(5, "strength", new bbb(bbf.a, 9643043, 3.0).a(bdd.f, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0, bdb.a.a));
   public static final bbe f = a(6, "instant_health", new bbd(bbf.a, 16262179));
   public static final bbe g = a(7, "instant_damage", new bbd(bbf.b, 4393481));
   public static final bbe h = a(8, "jump_boost", new bbe(bbf.a, 2293580));
   public static final bbe i = a(9, "nausea", new bbe(bbf.b, 5578058));
   public static final bbe j = a(10, "regeneration", new bbe(bbf.a, 13458603));
   public static final bbe k = a(11, "resistance", new bbe(bbf.a, 10044730));
   public static final bbe l = a(12, "fire_resistance", new bbe(bbf.a, 14981690));
   public static final bbe m = a(13, "water_breathing", new bbe(bbf.a, 3035801));
   public static final bbe n = a(14, "invisibility", new bbe(bbf.a, 8356754));
   public static final bbe o = a(15, "blindness", new bbe(bbf.b, 2039587));
   public static final bbe p = a(16, "night_vision", new bbe(bbf.a, 2039713));
   public static final bbe q = a(17, "hunger", new bbe(bbf.b, 5797459));
   public static final bbe r = a(18, "weakness", new bbb(bbf.b, 4738376, -4.0).a(bdd.f, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0, bdb.a.a));
   public static final bbe s = a(19, "poison", new bbe(bbf.b, 5149489));
   public static final bbe t = a(20, "wither", new bbe(bbf.b, 3484199));
   public static final bbe u = a(21, "health_boost", new bbc(bbf.a, 16284963).a(bdd.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, bdb.a.a));
   public static final bbe v = a(22, "absorption", new bba(bbf.a, 2445989));
   public static final bbe w = a(23, "saturation", new bbd(bbf.a, 16262179));
   public static final bbe x = a(24, "glowing", new bbe(bbf.c, 9740385));
   public static final bbe y = a(25, "levitation", new bbe(bbf.b, 13565951));
   public static final bbe z = a(26, "luck", new bbe(bbf.a, 3381504).a(bdd.k, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0, bdb.a.a));
   public static final bbe A = a(27, "unluck", new bbe(bbf.b, 12624973).a(bdd.k, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0, bdb.a.a));
   public static final bbe B = a(28, "slow_falling", new bbe(bbf.a, 16773073));
   public static final bbe C = a(29, "conduit_power", new bbe(bbf.a, 1950417));
   public static final bbe D = a(30, "dolphins_grace", new bbe(bbf.a, 8954814));
   public static final bbe E = a(31, "bad_omen", new bbe(bbf.c, 745784) {
      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }

      @Override
      public void a(bcc $$0, int $$1) {
         if ($$0 instanceof agh $$2 && !$$0.B_()) {
            agg $$3 = $$2.x();
            if ($$3.ag() == bag.a) {
               return;
            }

            if ($$3.b($$0.da())) {
               $$3.y().a($$2);
            }
         }

      }
   });
   public static final bbe F = a(32, "hero_of_the_village", new bbe(bbf.a, 4521796));
   public static final bbe G = a(33, "darkness", new bbe(bbf.b, 2696993).a(() -> new bbg.a(22)));

   private static bbe a(int $$0, String $$1, bbe $$2) {
      return hm.a(hm.U, $$0, $$1, $$2);
   }
}
