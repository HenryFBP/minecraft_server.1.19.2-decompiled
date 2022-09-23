import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class aj {
   private static final Map<abb, am<?>> Z = Maps.newHashMap();
   public static final bw a = a(new bw());
   public static final cc b = a(new cc(new abb("player_killed_entity")));
   public static final cc c = a(new cc(new abb("entity_killed_player")));
   public static final bk d = a(new bk());
   public static final bx e = a(new bx());
   public static final cs f = a(new cs());
   public static final co g = a(new co());
   public static final bn h = a(new bn());
   public static final bi i = a(new bi());
   public static final bs j = a(new bs());
   public static final aw k = a(new aw());
   public static final az l = a(new az());
   public static final de m = a(new de());
   public static final da n = a(new da());
   public static final av o = a(new av());
   public static final cr p = a(new cr(new abb("location")));
   public static final cr q = a(new cr(new abb("slept_in_bed")));
   public static final bb r = a(new bb());
   public static final dd s = a(new dd());
   public static final by t = a(new by());
   public static final cd u = a(new cd());
   public static final ax v = a(new ax());
   public static final cr w = a(new cr(new abb("tick")));
   public static final db x = a(new db());
   public static final cn y = a(new cn());
   public static final ba z = a(new ba());
   public static final bh A = a(new bh());
   public static final df B = a(new df());
   public static final bg C = a(new bg(new abb("nether_travel")));
   public static final bu D = a(new bu());
   public static final ay E = a(new ay());
   public static final cu F = a(new cu());
   public static final cb G = a(new cb());
   public static final cr H = a(new cr(new abb("hero_of_the_village")));
   public static final cr I = a(new cr(new abb("voluntary_exile")));
   public static final cw J = a(new cw());
   public static final at K = a(new at());
   public static final dc L = a(new dc());
   public static final bz M = a(new bz(new abb("item_used_on_block")));
   public static final ci N = a(new ci());
   public static final cm O = a(new cm(new abb("thrown_item_picked_up_by_entity")));
   public static final cm P = a(new cm(new abb("thrown_item_picked_up_by_player")));
   public static final cp Q = a(new cp());
   public static final cy R = a(new cy());
   public static final cg S = a(new cg());
   public static final dg T = a(new dg());
   public static final bg U = a(new bg(new abb("fall_from_height")));
   public static final bg V = a(new bg(new abb("ride_entity_in_lava")));
   public static final cc W = a(new cc(new abb("kill_mob_near_sculk_catalyst")));
   public static final bz X = a(new bz(new abb("allay_drop_item_on_block")));
   public static final cr Y = a(new cr(new abb("avoid_vibration")));

   private static <T extends am<?>> T a(T $$0) {
      if (Z.containsKey($$0.a())) {
         throw new IllegalArgumentException("Duplicate criterion id " + $$0.a());
      } else {
         Z.put($$0.a(), $$0);
         return $$0;
      }
   }

   @Nullable
   public static <T extends an> am<T> a(abb $$0) {
      return (am<T>)Z.get($$0);
   }

   public static Iterable<? extends am<?>> a() {
      return Z.values();
   }
}
