import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;

public class dry {
   private static final Set<abb> aB = Sets.newHashSet();
   private static final Set<abb> aC = Collections.unmodifiableSet(aB);
   public static final abb a = new abb("empty");
   public static final abb b = a("chests/spawn_bonus_chest");
   public static final abb c = a("chests/end_city_treasure");
   public static final abb d = a("chests/simple_dungeon");
   public static final abb e = a("chests/village/village_weaponsmith");
   public static final abb f = a("chests/village/village_toolsmith");
   public static final abb g = a("chests/village/village_armorer");
   public static final abb h = a("chests/village/village_cartographer");
   public static final abb i = a("chests/village/village_mason");
   public static final abb j = a("chests/village/village_shepherd");
   public static final abb k = a("chests/village/village_butcher");
   public static final abb l = a("chests/village/village_fletcher");
   public static final abb m = a("chests/village/village_fisher");
   public static final abb n = a("chests/village/village_tannery");
   public static final abb o = a("chests/village/village_temple");
   public static final abb p = a("chests/village/village_desert_house");
   public static final abb q = a("chests/village/village_plains_house");
   public static final abb r = a("chests/village/village_taiga_house");
   public static final abb s = a("chests/village/village_snowy_house");
   public static final abb t = a("chests/village/village_savanna_house");
   public static final abb u = a("chests/abandoned_mineshaft");
   public static final abb v = a("chests/nether_bridge");
   public static final abb w = a("chests/stronghold_library");
   public static final abb x = a("chests/stronghold_crossing");
   public static final abb y = a("chests/stronghold_corridor");
   public static final abb z = a("chests/desert_pyramid");
   public static final abb A = a("chests/jungle_temple");
   public static final abb B = a("chests/jungle_temple_dispenser");
   public static final abb C = a("chests/igloo_chest");
   public static final abb D = a("chests/woodland_mansion");
   public static final abb E = a("chests/underwater_ruin_small");
   public static final abb F = a("chests/underwater_ruin_big");
   public static final abb G = a("chests/buried_treasure");
   public static final abb H = a("chests/shipwreck_map");
   public static final abb I = a("chests/shipwreck_supply");
   public static final abb J = a("chests/shipwreck_treasure");
   public static final abb K = a("chests/pillager_outpost");
   public static final abb L = a("chests/bastion_treasure");
   public static final abb M = a("chests/bastion_other");
   public static final abb N = a("chests/bastion_bridge");
   public static final abb O = a("chests/bastion_hoglin_stable");
   public static final abb P = a("chests/ancient_city");
   public static final abb Q = a("chests/ancient_city_ice_box");
   public static final abb R = a("chests/ruined_portal");
   public static final abb S = a("entities/sheep/white");
   public static final abb T = a("entities/sheep/orange");
   public static final abb U = a("entities/sheep/magenta");
   public static final abb V = a("entities/sheep/light_blue");
   public static final abb W = a("entities/sheep/yellow");
   public static final abb X = a("entities/sheep/lime");
   public static final abb Y = a("entities/sheep/pink");
   public static final abb Z = a("entities/sheep/gray");
   public static final abb aa = a("entities/sheep/light_gray");
   public static final abb ab = a("entities/sheep/cyan");
   public static final abb ac = a("entities/sheep/purple");
   public static final abb ad = a("entities/sheep/blue");
   public static final abb ae = a("entities/sheep/brown");
   public static final abb af = a("entities/sheep/green");
   public static final abb ag = a("entities/sheep/red");
   public static final abb ah = a("entities/sheep/black");
   public static final abb ai = a("gameplay/fishing");
   public static final abb aj = a("gameplay/fishing/junk");
   public static final abb ak = a("gameplay/fishing/treasure");
   public static final abb al = a("gameplay/fishing/fish");
   public static final abb am = a("gameplay/cat_morning_gift");
   public static final abb an = a("gameplay/hero_of_the_village/armorer_gift");
   public static final abb ao = a("gameplay/hero_of_the_village/butcher_gift");
   public static final abb ap = a("gameplay/hero_of_the_village/cartographer_gift");
   public static final abb aq = a("gameplay/hero_of_the_village/cleric_gift");
   public static final abb ar = a("gameplay/hero_of_the_village/farmer_gift");
   public static final abb as = a("gameplay/hero_of_the_village/fisherman_gift");
   public static final abb at = a("gameplay/hero_of_the_village/fletcher_gift");
   public static final abb au = a("gameplay/hero_of_the_village/leatherworker_gift");
   public static final abb av = a("gameplay/hero_of_the_village/librarian_gift");
   public static final abb aw = a("gameplay/hero_of_the_village/mason_gift");
   public static final abb ax = a("gameplay/hero_of_the_village/shepherd_gift");
   public static final abb ay = a("gameplay/hero_of_the_village/toolsmith_gift");
   public static final abb az = a("gameplay/hero_of_the_village/weaponsmith_gift");
   public static final abb aA = a("gameplay/piglin_bartering");

   private static abb a(String $$0) {
      return a(new abb($$0));
   }

   private static abb a(abb $$0) {
      if (aB.add($$0)) {
         return $$0;
      } else {
         throw new IllegalArgumentException($$0 + " is already a registered built-in loot table");
      }
   }

   public static Set<abb> a() {
      return aC;
   }
}
