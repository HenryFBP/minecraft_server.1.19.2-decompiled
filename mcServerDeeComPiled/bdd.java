public class bdd {
   public static final bcy a = a("generic.max_health", new bdf("attribute.name.generic.max_health", 20.0, 1.0, 1024.0).a(true));
   public static final bcy b = a("generic.follow_range", new bdf("attribute.name.generic.follow_range", 32.0, 0.0, 2048.0));
   public static final bcy c = a("generic.knockback_resistance", new bdf("attribute.name.generic.knockback_resistance", 0.0, 0.0, 1.0));
   public static final bcy d = a("generic.movement_speed", new bdf("attribute.name.generic.movement_speed", 0.7F, 0.0, 1024.0).a(true));
   public static final bcy e = a("generic.flying_speed", new bdf("attribute.name.generic.flying_speed", 0.4F, 0.0, 1024.0).a(true));
   public static final bcy f = a("generic.attack_damage", new bdf("attribute.name.generic.attack_damage", 2.0, 0.0, 2048.0));
   public static final bcy g = a("generic.attack_knockback", new bdf("attribute.name.generic.attack_knockback", 0.0, 0.0, 5.0));
   public static final bcy h = a("generic.attack_speed", new bdf("attribute.name.generic.attack_speed", 4.0, 0.0, 1024.0).a(true));
   public static final bcy i = a("generic.armor", new bdf("attribute.name.generic.armor", 0.0, 0.0, 30.0).a(true));
   public static final bcy j = a("generic.armor_toughness", new bdf("attribute.name.generic.armor_toughness", 0.0, 0.0, 20.0).a(true));
   public static final bcy k = a("generic.luck", new bdf("attribute.name.generic.luck", 0.0, -1024.0, 1024.0).a(true));
   public static final bcy l = a("zombie.spawn_reinforcements", new bdf("attribute.name.zombie.spawn_reinforcements", 0.0, 0.0, 1.0));
   public static final bcy m = a("horse.jump_strength", new bdf("attribute.name.horse.jump_strength", 0.7, 0.0, 2.0).a(true));

   private static bcy a(String $$0, bcy $$1) {
      return hm.a(hm.ak, $$0, $$1);
   }
}
