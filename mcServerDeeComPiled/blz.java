import java.util.function.Supplier;

public class blz<U extends bly<?>> {
   public static final blz<blj> a = a("dummy", blj::new);
   public static final blz<blq> b = a("nearest_items", blq::new);
   public static final blz<blr<bcc>> c = a("nearest_living_entities", blr::new);
   public static final blz<blv> d = a("nearest_players", blv::new);
   public static final blz<blp> e = a("nearest_bed", blp::new);
   public static final blz<bln> f = a("hurt_by", bln::new);
   public static final blz<bmc> g = a("villager_hostiles", bmc::new);
   public static final blz<bmb> h = a("villager_babies", bmb::new);
   public static final blz<blw> i = a("secondary_pois", blw::new);
   public static final blz<bll> j = a("golem_detected", bll::new);
   public static final blz<blu> k = a("piglin_specific_sensor", blu::new);
   public static final blz<blt> l = a("piglin_brute_specific_sensor", blt::new);
   public static final blz<blm> m = a("hoglin_specific_sensor", blm::new);
   public static final blz<blh> n = a("nearest_adult", blh::new);
   public static final blz<bli> o = a("axolotl_attackables", bli::new);
   public static final blz<bma> p = a("axolotl_temptations", () -> new bma(bom.a()));
   public static final blz<bma> q = a("goat_temptations", () -> new bma(box.a()));
   public static final blz<bma> r = a("frog_temptations", () -> new bma(bor.a()));
   public static final blz<blk> s = a("frog_attackables", blk::new);
   public static final blz<blo> t = a("is_in_water", blo::new);
   public static final blz<bmd> u = a("warden_entity_sensor", bmd::new);
   private final Supplier<U> v;

   private blz(Supplier<U> $$0) {
      this.v = $$0;
   }

   public U a() {
      return (U)this.v.get();
   }

   private static <U extends bly<?>> blz<U> a(String $$0, Supplier<U> $$1) {
      return hm.a(hm.as, new abb($$0), new blz<>($$1));
   }
}
