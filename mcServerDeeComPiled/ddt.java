import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ddt<FC extends dfx> {
   public static final ddt<dge> f = a("no_op", new den(dge.a));
   public static final ddt<dgt> g = a("tree", new dff(dgt.a));
   public static final ddt<dgk> h = a("flower", new der(dgk.a));
   public static final ddt<dgk> i = a("no_bonemeal_flower", new der(dgk.a));
   public static final ddt<dgk> j = a("random_patch", new der(dgk.a));
   public static final ddt<dfp> k = a("block_pile", new ddc(dfp.a));
   public static final ddt<dgs> l = a("spring_feature", new dfe(dgs.a));
   public static final ddt<dge> m = a("chorus_plant", new ddf(dge.a));
   public static final ddt<dgl> n = a("replace_single_block", new deu(dgl.a));
   public static final ddt<dge> o = a("void_start_platform", new dfk(dge.a));
   public static final ddt<dge> p = a("desert_well", new ddm(dge.a));
   public static final ddt<ddy> q = a("fossil", new ddx(ddy.a));
   public static final ddt<dfz> r = a("huge_red_mushroom", new dee(dfz.a));
   public static final ddt<dfz> s = a("huge_brown_mushroom", new deb(dfz.a));
   public static final ddt<dge> t = a("ice_spike", new def(dge.a));
   public static final ddt<dge> u = a("glowstone_blob", new dea(dge.a));
   public static final ddt<dge> v = a("freeze_top_layer", new dfc(dge.a));
   public static final ddt<dge> w = a("vines", new dfj(dge.a));
   public static final ddt<dfo> x = a("block_column", new ddb(dfo.a));
   public static final ddt<dgw> y = a("vegetation_patch", new dfi(dgw.a));
   public static final ddt<dgw> z = a("waterlogged_vegetation_patch", new dfl(dgw.a));
   public static final ddt<dgn> A = a("root_system", new dev(dgn.a));
   public static final ddt<dgc> B = a("multiface_growth", new del(dgc.a));
   public static final ddt<dgv> C = a("underwater_magma", new dfh(dgv.a));
   public static final ddt<dge> D = a("monster_room", new dek(dge.a));
   public static final ddt<dge> E = a("blue_ice", new ddd(dge.a));
   public static final ddt<dfq> F = a("iceberg", new deg(dfq.a));
   public static final ddt<dfq> G = a("forest_rock", new dda(dfq.a));
   public static final ddt<dfu> H = a("disk", new ddn(dfu.a));
   public static final ddt<dei.a> I = a("lake", new dei(dei.a.a));
   public static final ddt<dgf> J = a("ore", new deo(dgf.a));
   public static final ddt<dgr> K = a("end_spike", new dfd(dgr.a));
   public static final ddt<dge> L = a("end_island", new ddr(dge.a));
   public static final ddt<dfw> M = a("end_gateway", new ddq(dfw.a));
   public static final dez N = a("seagrass", new dez(dgh.k));
   public static final ddt<dge> O = a("kelp", new deh(dge.a));
   public static final ddt<dge> P = a("coral_tree", new ddk(dge.a));
   public static final ddt<dge> Q = a("coral_mushroom", new ddj(dge.a));
   public static final ddt<dge> R = a("coral_claw", new ddh(dge.a));
   public static final ddt<dfs> S = a("sea_pickle", new dey(dfs.a));
   public static final ddt<dgp> T = a("simple_block", new dfa(dgp.a));
   public static final ddt<dgh> U = a("bamboo", new dcx(dgh.k));
   public static final ddt<dec> V = a("huge_fungus", new ded(dec.a));
   public static final ddt<dgd> W = a("nether_forest_vegetation", new dem(dgd.c));
   public static final ddt<dge> X = a("weeping_vines", new dfm(dge.a));
   public static final ddt<dgu> Y = a("twisting_vines", new dfg(dgu.a));
   public static final ddt<dfr> Z = a("basalt_columns", new dcy(dfr.a));
   public static final ddt<dft> aa = a("delta_feature", new ddl(dft.a));
   public static final ddt<dgm> ab = a("netherrack_replace_blobs", new det(dgm.a));
   public static final ddt<dgb> ac = a("fill_layer", new ddw(dgb.a));
   public static final dde ad = a("bonus_chest", new dde(dge.a));
   public static final ddt<dge> ae = a("basalt_pillar", new dcz(dge.a));
   public static final ddt<dgf> af = a("scattered_ore", new dew(dgf.a));
   public static final ddt<dgj> ag = a("random_selector", new des(dgj.a));
   public static final ddt<dgq> ah = a("simple_random_selector", new dfb(dgq.a));
   public static final ddt<dgi> ai = a("random_boolean_selector", new deq(dgi.a));
   public static final ddt<dfy> aj = a("geode", new ddz(dfy.b));
   public static final ddt<dfv> ak = a("dripstone_cluster", new ddo(dfv.a));
   public static final ddt<dga> al = a("large_dripstone", new dej(dga.a));
   public static final ddt<dgg> am = a("pointed_dripstone", new dep(dgg.a));
   public static final ddt<dgo> an = a("sculk_patch", new dex(dgo.a));
   private final Codec<ddg<FC, ddt<FC>>> a;

   private static <C extends dfx, F extends ddt<C>> F a(String $$0, F $$1) {
      return hm.a(hm.aZ, $$0, $$1);
   }

   public ddt(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ddg<>(this, $$0x), ddg::c).codec();
   }

   public Codec<ddg<FC, ddt<FC>>> a() {
      return this.a;
   }

   protected void a(chf $$0, gt $$1, cvo $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<cvo> a(akz<cjt> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(chp $$0, gt $$1, cvo $$2, Predicate<cvo> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }

   }

   public abstract boolean a(ddv<FC> var1);

   public boolean a(FC $$0, chp $$1, cxk $$2, amn $$3, gt $$4) {
      return $$1.e_($$4) ? this.a(new ddv<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(cvo $$0) {
      return $$0.a(akl.aV);
   }

   public static boolean b(cvo $$0) {
      return $$0.a(akl.ac);
   }

   public static boolean a(chd $$0, gt $$1) {
      return $$0.a($$1, ddt::b);
   }

   public static boolean a(Function<gt, cvo> $$0, gt $$1, Predicate<cvo> $$2) {
      gt.a $$3 = new gt.a();

      for(gy $$4 : gy.values()) {
         $$3.a($$1, $$4);
         if ($$2.test((cvo)$$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<gt, cvo> $$0, gt $$1) {
      return a($$0, $$1, cvn.a::h);
   }

   protected void a(chp $$0, gt $$1) {
      gt.a $$2 = $$1.i();

      for(int $$3 = 0; $$3 < 2; ++$$3) {
         $$2.c(gy.b);
         if ($$0.a_($$2).h()) {
            return;
         }

         $$0.B($$2).e($$2);
      }

   }
}
