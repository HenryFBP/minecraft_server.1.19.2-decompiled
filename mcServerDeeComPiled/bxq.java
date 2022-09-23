public class bxq<T extends bwm> {
   public static final bxq<bwt> a = a("generic_9x1", bwt::a);
   public static final bxq<bwt> b = a("generic_9x2", bwt::b);
   public static final bxq<bwt> c = a("generic_9x3", bwt::c);
   public static final bxq<bwt> d = a("generic_9x4", bwt::d);
   public static final bxq<bwt> e = a("generic_9x5", bwt::e);
   public static final bxq<bwt> f = a("generic_9x6", bwt::f);
   public static final bxq<bxd> g = a("generic_3x3", bxd::new);
   public static final bxq<bwo> h = a("anvil", bwo::new);
   public static final bxq<bwp> i = a("beacon", bwp::new);
   public static final bxq<bwq> j = a("blast_furnace", bwq::new);
   public static final bxq<bwr> k = a("brewing_stand", bwr::new);
   public static final bxq<bxb> l = a("crafting", bxb::new);
   public static final bxq<bxe> m = a("enchantment", bxe::new);
   public static final bxq<bxg> n = a("furnace", bxg::new);
   public static final bxq<bxi> o = a("grindstone", bxi::new);
   public static final bxq<bxj> p = a("hopper", bxj::new);
   public static final bxq<bxn> q = a("lectern", ($$0, $$1) -> new bxn($$0));
   public static final bxq<bxo> r = a("loom", bxo::new);
   public static final bxq<bxs> s = a("merchant", bxs::new);
   public static final bxq<bya> t = a("shulker_box", bya::new);
   public static final bxq<bye> u = a("smithing", bye::new);
   public static final bxq<byf> v = a("smoker", byf::new);
   public static final bxq<bws> w = a("cartography_table", bws::new);
   public static final bxq<byh> x = a("stonecutter", byh::new);
   private final bxq.a<T> y;

   private static <T extends bwm> bxq<T> a(String $$0, bxq.a<T> $$1) {
      return hm.a(hm.ah, $$0, new bxq<>($$1));
   }

   private bxq(bxq.a<T> $$0) {
      this.y = $$0;
   }

   public T a(int $$0, bub $$1) {
      return this.y.create($$0, $$1);
   }

   interface a<T extends bwm> {
      T create(int var1, bub var2);
   }
}
