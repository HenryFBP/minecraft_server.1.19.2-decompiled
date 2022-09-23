import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bku<U> {
   public static final bku<Void> a = a("dummy");
   public static final bku<hb> b = a("home", hb.a);
   public static final bku<hb> c = a("job_site", hb.a);
   public static final bku<hb> d = a("potential_job_site", hb.a);
   public static final bku<hb> e = a("meeting_point", hb.a);
   public static final bku<List<hb>> f = a("secondary_job_site");
   public static final bku<List<bcc>> g = a("mobs");
   public static final bku<bkw> h = a("visible_mobs");
   public static final bku<List<bcc>> i = a("visible_villager_babies");
   public static final bku<List<buc>> j = a("nearest_players");
   public static final bku<buc> k = a("nearest_visible_player");
   public static final bku<buc> l = a("nearest_visible_targetable_player");
   public static final bku<bkx> m = a("walk_target");
   public static final bku<bfc> n = a("look_target");
   public static final bku<bcc> o = a("attack_target");
   public static final bku<Boolean> p = a("attack_cooling_down");
   public static final bku<bcc> q = a("interaction_target");
   public static final bku<bbk> r = a("breed_target");
   public static final bku<bbn> s = a("ride_target");
   public static final bku<dql> t = a("path");
   public static final bku<List<hb>> u = a("interactable_doors");
   public static final bku<Set<hb>> v = a("doors_to_close");
   public static final bku<gt> w = a("nearest_bed");
   public static final bku<baw> x = a("hurt_by");
   public static final bku<bcc> y = a("hurt_by_entity");
   public static final bku<bcc> z = a("avoid_target");
   public static final bku<bcc> A = a("nearest_hostile");
   public static final bku<bcc> B = a("nearest_attackable");
   public static final bku<hb> C = a("hiding_place");
   public static final bku<Long> D = a("heard_bell_time");
   public static final bku<Long> E = a("cant_reach_walk_target_since");
   public static final bku<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bku<Long> G = a("last_slept", Codec.LONG);
   public static final bku<Long> H = a("last_woken", Codec.LONG);
   public static final bku<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bku<bbk> J = a("nearest_visible_adult");
   public static final bku<bqv> K = a("nearest_visible_wanted_item");
   public static final bku<bce> L = a("nearest_visible_nemesis");
   public static final bku<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bku<buc> N = a("tempting_player");
   public static final bku<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bku<Boolean> P = a("is_tempted", Codec.BOOL);
   public static final bku<Integer> Q = a("long_jump_cooling_down", Codec.INT);
   public static final bku<Boolean> R = a("long_jump_mid_jump");
   public static final bku<Boolean> S = a("has_hunting_cooldown", Codec.BOOL);
   public static final bku<Integer> T = a("ram_cooldown_ticks", Codec.INT);
   public static final bku<dwq> U = a("ram_target");
   public static final bku<anf> V = a("is_in_water", Codec.unit(anf.a));
   public static final bku<anf> W = a("is_pregnant", Codec.unit(anf.a));
   public static final bku<Boolean> X = a("is_panicking", Codec.BOOL);
   public static final bku<List<UUID>> Y = a("unreachable_tongue_targets");
   public static final bku<UUID> Z = a("angry_at", hr.a);
   public static final bku<Boolean> aa = a("universal_anger", Codec.BOOL);
   public static final bku<Boolean> ab = a("admiring_item", Codec.BOOL);
   public static final bku<Integer> ac = a("time_trying_to_reach_admire_item");
   public static final bku<Boolean> ad = a("disable_walk_to_admire_item");
   public static final bku<Boolean> ae = a("admiring_disabled", Codec.BOOL);
   public static final bku<Boolean> af = a("hunted_recently", Codec.BOOL);
   public static final bku<gt> ag = a("celebrate_location");
   public static final bku<Boolean> ah = a("dancing");
   public static final bku<bsm> ai = a("nearest_visible_huntable_hoglin");
   public static final bku<bsm> aj = a("nearest_visible_baby_hoglin");
   public static final bku<buc> ak = a("nearest_targetable_player_not_wearing_gold");
   public static final bku<List<bsr>> al = a("nearby_adult_piglins");
   public static final bku<List<bsr>> am = a("nearest_visible_adult_piglins");
   public static final bku<List<bsm>> an = a("nearest_visible_adult_hoglins");
   public static final bku<bsr> ao = a("nearest_visible_adult_piglin");
   public static final bku<bcc> ap = a("nearest_visible_zombified");
   public static final bku<Integer> aq = a("visible_adult_piglin_count");
   public static final bku<Integer> ar = a("visible_adult_hoglin_count");
   public static final bku<buc> as = a("nearest_player_holding_wanted_item");
   public static final bku<Boolean> at = a("ate_recently");
   public static final bku<gt> au = a("nearest_repellent");
   public static final bku<Boolean> av = a("pacified");
   public static final bku<bcc> aw = a("roar_target");
   public static final bku<gt> ax = a("disturbance_location");
   public static final bku<anf> ay = a("recent_projectile", Codec.unit(anf.a));
   public static final bku<anf> az = a("is_sniffing", Codec.unit(anf.a));
   public static final bku<anf> aA = a("is_emerging", Codec.unit(anf.a));
   public static final bku<anf> aB = a("roar_sound_delay", Codec.unit(anf.a));
   public static final bku<anf> aC = a("dig_cooldown", Codec.unit(anf.a));
   public static final bku<anf> aD = a("roar_sound_cooldown", Codec.unit(anf.a));
   public static final bku<anf> aE = a("sniff_cooldown", Codec.unit(anf.a));
   public static final bku<anf> aF = a("touch_cooldown", Codec.unit(anf.a));
   public static final bku<anf> aG = a("vibration_cooldown", Codec.unit(anf.a));
   public static final bku<anf> aH = a("sonic_boom_cooldown", Codec.unit(anf.a));
   public static final bku<anf> aI = a("sonic_boom_sound_cooldown", Codec.unit(anf.a));
   public static final bku<anf> aJ = a("sonic_boom_sound_delay", Codec.unit(anf.a));
   public static final bku<UUID> aK = a("liked_player", hr.a);
   public static final bku<hb> aL = a("liked_noteblock", hb.a);
   public static final bku<Integer> aM = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bku<Integer> aN = a("item_pickup_cooldown_ticks", Codec.INT);
   private final Optional<Codec<bkt<U>>> aO;

   @VisibleForTesting
   public bku(Optional<Codec<U>> $$0) {
      this.aO = $$0.map(bkt::a);
   }

   public String toString() {
      return hm.ar.b(this).toString();
   }

   public Optional<Codec<bkt<U>>> a() {
      return this.aO;
   }

   private static <U> bku<U> a(String $$0, Codec<U> $$1) {
      return hm.a(hm.ar, new abb($$0), new bku<>(Optional.of($$1)));
   }

   private static <U> bku<U> a(String $$0) {
      return hm.a(hm.ar, new abb($$0), new bku<>(Optional.empty()));
   }
}
