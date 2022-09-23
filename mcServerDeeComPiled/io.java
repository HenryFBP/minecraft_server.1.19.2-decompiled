import com.mojang.serialization.Codec;
import java.util.function.Function;

public class io {
   public static final ir a = a("ambient_entity_effect", false);
   public static final ir b = a("angry_villager", false);
   public static final in<ig> c = a("block", false, ig.a, ig::a);
   public static final in<ig> d = a("block_marker", false, ig.a, ig::a);
   public static final ir e = a("bubble", false);
   public static final ir f = a("cloud", false);
   public static final ir g = a("crit", false);
   public static final ir h = a("damage_indicator", true);
   public static final ir i = a("dragon_breath", false);
   public static final ir j = a("dripping_lava", false);
   public static final ir k = a("falling_lava", false);
   public static final ir l = a("landing_lava", false);
   public static final ir m = a("dripping_water", false);
   public static final ir n = a("falling_water", false);
   public static final in<ii> o = a("dust", false, ii.d, $$0 -> ii.c);
   public static final in<ih> p = a("dust_color_transition", false, ih.d, $$0 -> ih.c);
   public static final ir q = a("effect", false);
   public static final ir r = a("elder_guardian", true);
   public static final ir s = a("enchanted_hit", false);
   public static final ir t = a("enchant", false);
   public static final ir u = a("end_rod", false);
   public static final ir v = a("entity_effect", false);
   public static final ir w = a("explosion_emitter", true);
   public static final ir x = a("explosion", true);
   public static final ir y = a("sonic_boom", true);
   public static final in<ig> z = a("falling_dust", false, ig.a, ig::a);
   public static final ir A = a("firework", false);
   public static final ir B = a("fishing", false);
   public static final ir C = a("flame", false);
   public static final ir D = a("sculk_soul", false);
   public static final in<ip> E = a("sculk_charge", true, ip.b, $$0 -> ip.a);
   public static final ir F = a("sculk_charge_pop", true);
   public static final ir G = a("soul_fire_flame", false);
   public static final ir H = a("soul", false);
   public static final ir I = a("flash", false);
   public static final ir J = a("happy_villager", false);
   public static final ir K = a("composter", false);
   public static final ir L = a("heart", false);
   public static final ir M = a("instant_effect", false);
   public static final in<ik> N = a("item", false, ik.a, ik::a);
   public static final in<is> O = a("vibration", true, is.b, $$0 -> is.a);
   public static final ir P = a("item_slime", false);
   public static final ir Q = a("item_snowball", false);
   public static final ir R = a("large_smoke", false);
   public static final ir S = a("lava", false);
   public static final ir T = a("mycelium", false);
   public static final ir U = a("note", false);
   public static final ir V = a("poof", true);
   public static final ir W = a("portal", false);
   public static final ir X = a("rain", false);
   public static final ir Y = a("smoke", false);
   public static final ir Z = a("sneeze", false);
   public static final ir aa = a("spit", true);
   public static final ir ab = a("squid_ink", true);
   public static final ir ac = a("sweep_attack", true);
   public static final ir ad = a("totem_of_undying", false);
   public static final ir ae = a("underwater", false);
   public static final ir af = a("splash", false);
   public static final ir ag = a("witch", false);
   public static final ir ah = a("bubble_pop", false);
   public static final ir ai = a("current_down", false);
   public static final ir aj = a("bubble_column_up", false);
   public static final ir ak = a("nautilus", false);
   public static final ir al = a("dolphin", false);
   public static final ir am = a("campfire_cosy_smoke", true);
   public static final ir an = a("campfire_signal_smoke", true);
   public static final ir ao = a("dripping_honey", false);
   public static final ir ap = a("falling_honey", false);
   public static final ir aq = a("landing_honey", false);
   public static final ir ar = a("falling_nectar", false);
   public static final ir as = a("falling_spore_blossom", false);
   public static final ir at = a("ash", false);
   public static final ir au = a("crimson_spore", false);
   public static final ir av = a("warped_spore", false);
   public static final ir aw = a("spore_blossom_air", false);
   public static final ir ax = a("dripping_obsidian_tear", false);
   public static final ir ay = a("falling_obsidian_tear", false);
   public static final ir az = a("landing_obsidian_tear", false);
   public static final ir aA = a("reverse_portal", false);
   public static final ir aB = a("white_ash", false);
   public static final ir aC = a("small_flame", false);
   public static final ir aD = a("snowflake", false);
   public static final ir aE = a("dripping_dripstone_lava", false);
   public static final ir aF = a("falling_dripstone_lava", false);
   public static final ir aG = a("dripping_dripstone_water", false);
   public static final ir aH = a("falling_dripstone_water", false);
   public static final ir aI = a("glow_squid_ink", true);
   public static final ir aJ = a("glow", true);
   public static final ir aK = a("wax_on", true);
   public static final ir aL = a("wax_off", true);
   public static final ir aM = a("electric_spark", true);
   public static final ir aN = a("scrape", true);
   public static final in<iq> aO = a("shriek", false, iq.b, $$0 -> iq.a);
   public static final Codec<im> aP = hm.aa.p().dispatch("type", im::b, in::e);

   private static ir a(String $$0, boolean $$1) {
      return hm.a(hm.aa, $$0, new ir($$1));
   }

   private static <T extends im> in<T> a(String $$0, boolean $$1, im.a<T> $$2, final Function<in<T>, Codec<T>> $$3) {
      return hm.a(hm.aa, $$0, new in<T>($$1, $$2) {
         @Override
         public Codec<T> e() {
            return (Codec<T>)$$3.apply(this);
         }
      });
   }
}
