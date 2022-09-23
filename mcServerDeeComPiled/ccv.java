public class ccv {
   public static final ccs a = a("empty", new ccs());
   public static final ccs b = a("water", new ccs());
   public static final ccs c = a("mundane", new ccs());
   public static final ccs d = a("thick", new ccs());
   public static final ccs e = a("awkward", new ccs());
   public static final ccs f = a("night_vision", new ccs(new bbg(bbi.p, 3600)));
   public static final ccs g = a("long_night_vision", new ccs("night_vision", new bbg(bbi.p, 9600)));
   public static final ccs h = a("invisibility", new ccs(new bbg(bbi.n, 3600)));
   public static final ccs i = a("long_invisibility", new ccs("invisibility", new bbg(bbi.n, 9600)));
   public static final ccs j = a("leaping", new ccs(new bbg(bbi.h, 3600)));
   public static final ccs k = a("long_leaping", new ccs("leaping", new bbg(bbi.h, 9600)));
   public static final ccs l = a("strong_leaping", new ccs("leaping", new bbg(bbi.h, 1800, 1)));
   public static final ccs m = a("fire_resistance", new ccs(new bbg(bbi.l, 3600)));
   public static final ccs n = a("long_fire_resistance", new ccs("fire_resistance", new bbg(bbi.l, 9600)));
   public static final ccs o = a("swiftness", new ccs(new bbg(bbi.a, 3600)));
   public static final ccs p = a("long_swiftness", new ccs("swiftness", new bbg(bbi.a, 9600)));
   public static final ccs q = a("strong_swiftness", new ccs("swiftness", new bbg(bbi.a, 1800, 1)));
   public static final ccs r = a("slowness", new ccs(new bbg(bbi.b, 1800)));
   public static final ccs s = a("long_slowness", new ccs("slowness", new bbg(bbi.b, 4800)));
   public static final ccs t = a("strong_slowness", new ccs("slowness", new bbg(bbi.b, 400, 3)));
   public static final ccs u = a("turtle_master", new ccs("turtle_master", new bbg(bbi.b, 400, 3), new bbg(bbi.k, 400, 2)));
   public static final ccs v = a("long_turtle_master", new ccs("turtle_master", new bbg(bbi.b, 800, 3), new bbg(bbi.k, 800, 2)));
   public static final ccs w = a("strong_turtle_master", new ccs("turtle_master", new bbg(bbi.b, 400, 5), new bbg(bbi.k, 400, 3)));
   public static final ccs x = a("water_breathing", new ccs(new bbg(bbi.m, 3600)));
   public static final ccs y = a("long_water_breathing", new ccs("water_breathing", new bbg(bbi.m, 9600)));
   public static final ccs z = a("healing", new ccs(new bbg(bbi.f, 1)));
   public static final ccs A = a("strong_healing", new ccs("healing", new bbg(bbi.f, 1, 1)));
   public static final ccs B = a("harming", new ccs(new bbg(bbi.g, 1)));
   public static final ccs C = a("strong_harming", new ccs("harming", new bbg(bbi.g, 1, 1)));
   public static final ccs D = a("poison", new ccs(new bbg(bbi.s, 900)));
   public static final ccs E = a("long_poison", new ccs("poison", new bbg(bbi.s, 1800)));
   public static final ccs F = a("strong_poison", new ccs("poison", new bbg(bbi.s, 432, 1)));
   public static final ccs G = a("regeneration", new ccs(new bbg(bbi.j, 900)));
   public static final ccs H = a("long_regeneration", new ccs("regeneration", new bbg(bbi.j, 1800)));
   public static final ccs I = a("strong_regeneration", new ccs("regeneration", new bbg(bbi.j, 450, 1)));
   public static final ccs J = a("strength", new ccs(new bbg(bbi.e, 3600)));
   public static final ccs K = a("long_strength", new ccs("strength", new bbg(bbi.e, 9600)));
   public static final ccs L = a("strong_strength", new ccs("strength", new bbg(bbi.e, 1800, 1)));
   public static final ccs M = a("weakness", new ccs(new bbg(bbi.r, 1800)));
   public static final ccs N = a("long_weakness", new ccs("weakness", new bbg(bbi.r, 4800)));
   public static final ccs O = a("luck", new ccs("luck", new bbg(bbi.z, 6000)));
   public static final ccs P = a("slow_falling", new ccs(new bbg(bbi.B, 1800)));
   public static final ccs Q = a("long_slow_falling", new ccs("slow_falling", new bbg(bbi.B, 4800)));

   private static ccs a(String $$0, ccs $$1) {
      return hm.a(hm.Z, $$0, $$1);
   }
}
