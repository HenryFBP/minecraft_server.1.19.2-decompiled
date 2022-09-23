import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bbr<T extends bbn> implements czj<bbn, T> {
   private static final Logger bp = LogUtils.getLogger();
   public static final String a = "EntityTag";
   private final hc.c<bbr<?>> bq = hm.X.e(this);
   private static final float br = 1.3964844F;
   public static final bbr<boi> b = a("allay", bbr.a.<boi>a(boi::new, bcf.b).a(0.35F, 0.6F).a(8).b(2));
   public static final bbr<bbm> c = a("area_effect_cloud", bbr.a.<bbm>a(bbm::new, bcf.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bbr<bql> d = a("armor_stand", bbr.a.<bql>a(bql::new, bcf.h).a(0.5F, 1.975F).a(10));
   public static final bbr<buk> e = a("arrow", bbr.a.<buk>a(buk::new, bcf.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bbr<bol> f = a("axolotl", bbr.a.<bol>a(bol::new, bcf.d).a(0.75F, 0.42F).a(10));
   public static final bbr<bmz> g = a("bat", bbr.a.<bmz>a(bmz::new, bcf.c).a(0.5F, 0.9F).a(5));
   public static final bbr<bnf> h = a("bee", bbr.a.<bnf>a(bnf::new, bcf.b).a(0.7F, 0.6F).a(8));
   public static final bbr<bra> i = a("blaze", bbr.a.<bra>a(bra::new, bcf.a).c().a(0.6F, 1.8F).a(8));
   public static final bbr<bvv> j = a("boat", bbr.a.<bvv>a(bvv::new, bcf.h).a(1.375F, 0.5625F).a(10));
   public static final bbr<bvw> k = a("chest_boat", bbr.a.<bvw>a(bvw::new, bcf.h).a(1.375F, 0.5625F).a(10));
   public static final bbr<bnh> l = a("cat", bbr.a.<bnh>a(bnh::new, bcf.b).a(0.6F, 0.7F).a(8));
   public static final bbr<brb> m = a("cave_spider", bbr.a.<brb>a(brb::new, bcf.a).a(0.7F, 0.5F).a(8));
   public static final bbr<bnj> n = a("chicken", bbr.a.<bnj>a(bnj::new, bcf.b).a(0.4F, 0.7F).a(10));
   public static final bbr<bnk> o = a("cod", bbr.a.<bnk>a(bnk::new, bcf.g).a(0.5F, 0.3F).a(4));
   public static final bbr<bnl> p = a("cow", bbr.a.<bnl>a(bnl::new, bcf.b).a(0.9F, 1.4F).a(10));
   public static final bbr<brc> q = a("creeper", bbr.a.<brc>a(brc::new, bcf.a).a(0.6F, 1.7F).a(8));
   public static final bbr<bnm> r = a("dolphin", bbr.a.<bnm>a(bnm::new, bcf.f).a(0.9F, 0.6F));
   public static final bbr<bpb> s = a("donkey", bbr.a.<bpb>a(bpb::new, bcf.b).a(1.3964844F, 1.5F).a(10));
   public static final bbr<bul> t = a("dragon_fireball", bbr.a.<bul>a(bul::new, bcf.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bbr<bre> u = a("drowned", bbr.a.<bre>a(bre::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<brf> v = a("elder_guardian", bbr.a.<brf>a(brf::new, bcf.a).a(1.9975F, 1.9975F).a(10));
   public static final bbr<bpo> w = a("end_crystal", bbr.a.<bpo>a(bpo::new, bcf.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bbr<bpp> x = a("ender_dragon", bbr.a.<bpp>a(bpp::new, bcf.a).c().a(16.0F, 8.0F).a(10));
   public static final bbr<brg> y = a("enderman", bbr.a.<brg>a(brg::new, bcf.a).a(0.6F, 2.9F).a(8));
   public static final bbr<brh> z = a("endermite", bbr.a.<brh>a(brh::new, bcf.a).a(0.4F, 0.3F).a(8));
   public static final bbr<brj> A = a("evoker", bbr.a.<brj>a(brj::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<bum> B = a("evoker_fangs", bbr.a.<bum>a(bum::new, bcf.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bbr<bbt> C = a("experience_orb", bbr.a.<bbt>a(bbt::new, bcf.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bbr<bun> D = a("eye_of_ender", bbr.a.<bun>a(bun::new, bcf.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bbr<bqu> E = a("falling_block", bbr.a.<bqu>a(bqu::new, bcf.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bbr<bup> F = a("firework_rocket", bbr.a.<bup>a(bup::new, bcf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bbr<bno> G = a("fox", bbr.a.<bno>a(bno::new, bcf.b).a(0.6F, 0.7F).a(8).a(cju.mT));
   public static final bbr<boq> H = a("frog", bbr.a.<boq>a(boq::new, bcf.b).a(0.5F, 0.5F).a(10));
   public static final bbr<brk> I = a("ghast", bbr.a.<brk>a(brk::new, bcf.a).c().a(4.0F, 4.0F).a(10));
   public static final bbr<brl> J = a("giant", bbr.a.<brl>a(brl::new, bcf.a).a(3.6F, 12.0F).a(10));
   public static final bbr<bqm> K = a("glow_item_frame", bbr.a.<bqm>a(bqm::new, bcf.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bbr<bbv> L = a("glow_squid", bbr.a.<bbv>a(bbv::new, bcf.e).a(0.8F, 0.8F).a(10));
   public static final bbr<bow> M = a("goat", bbr.a.<bow>a(bow::new, bcf.b).a(0.9F, 1.3F).a(10));
   public static final bbr<brm> N = a("guardian", bbr.a.<brm>a(brm::new, bcf.a).a(0.85F, 0.85F).a(8));
   public static final bbr<bsm> O = a("hoglin", bbr.a.<bsm>a(bsm::new, bcf.a).a(1.3964844F, 1.4F).a(8));
   public static final bbr<bpc> P = a("horse", bbr.a.<bpc>a(bpc::new, bcf.b).a(1.3964844F, 1.6F).a(10));
   public static final bbr<brn> Q = a("husk", bbr.a.<brn>a(brn::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<bro> R = a("illusioner", bbr.a.<bro>a(bro::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<bnq> S = a("iron_golem", bbr.a.<bnq>a(bnq::new, bcf.h).a(1.4F, 2.7F).a(10));
   public static final bbr<bqv> T = a("item", bbr.a.<bqv>a(bqv::new, bcf.h).a(0.25F, 0.25F).a(6).b(20));
   public static final bbr<bqo> U = a("item_frame", bbr.a.<bqo>a(bqo::new, bcf.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bbr<bus> V = a("fireball", bbr.a.<bus>a(bus::new, bcf.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bbr<bqp> W = a("leash_knot", bbr.a.<bqp>a(bqp::new, bcf.h).b().a(0.375F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bbr<bcb> X = a("lightning_bolt", bbr.a.<bcb>a(bcb::new, bcf.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bbr<bpd> Y = a("llama", bbr.a.<bpd>a(bpd::new, bcf.b).a(0.9F, 1.87F).a(10));
   public static final bbr<but> Z = a("llama_spit", bbr.a.<but>a(but::new, bcf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bbr<brp> aa = a("magma_cube", bbr.a.<brp>a(brp::new, bcf.a).c().a(2.04F, 2.04F).a(8));
   public static final bbr<bcd> ab = a("marker", bbr.a.<bcd>a(bcd::new, bcf.h).a(0.0F, 0.0F).a(0));
   public static final bbr<bvz> ac = a("minecart", bbr.a.<bvz>a(bvz::new, bcf.h).a(0.98F, 0.7F).a(8));
   public static final bbr<bwa> ad = a("chest_minecart", bbr.a.<bwa>a(bwa::new, bcf.h).a(0.98F, 0.7F).a(8));
   public static final bbr<bwb> ae = a("command_block_minecart", bbr.a.<bwb>a(bwb::new, bcf.h).a(0.98F, 0.7F).a(8));
   public static final bbr<bwc> af = a("furnace_minecart", bbr.a.<bwc>a(bwc::new, bcf.h).a(0.98F, 0.7F).a(8));
   public static final bbr<bwd> ag = a("hopper_minecart", bbr.a.<bwd>a(bwd::new, bcf.h).a(0.98F, 0.7F).a(8));
   public static final bbr<bwe> ah = a("spawner_minecart", bbr.a.<bwe>a(bwe::new, bcf.h).a(0.98F, 0.7F).a(8));
   public static final bbr<bwf> ai = a("tnt_minecart", bbr.a.<bwf>a(bwf::new, bcf.h).a(0.98F, 0.7F).a(8));
   public static final bbr<bpf> aj = a("mule", bbr.a.<bpf>a(bpf::new, bcf.b).a(1.3964844F, 1.6F).a(8));
   public static final bbr<bnr> ak = a("mooshroom", bbr.a.<bnr>a(bnr::new, bcf.b).a(0.9F, 1.4F).a(10));
   public static final bbr<bns> al = a("ocelot", bbr.a.<bns>a(bns::new, bcf.b).a(0.6F, 0.7F).a(10));
   public static final bbr<bqq> am = a("painting", bbr.a.<bqq>a(bqq::new, bcf.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bbr<bnt> an = a("panda", bbr.a.<bnt>a(bnt::new, bcf.b).a(1.3F, 1.25F).a(10));
   public static final bbr<bnu> ao = a("parrot", bbr.a.<bnu>a(bnu::new, bcf.b).a(0.5F, 0.9F).a(8));
   public static final bbr<brs> ap = a("phantom", bbr.a.<brs>a(brs::new, bcf.a).a(0.9F, 0.5F).a(8));
   public static final bbr<bnv> aq = a("pig", bbr.a.<bnv>a(bnv::new, bcf.b).a(0.9F, 0.9F).a(10));
   public static final bbr<bss> ar = a("piglin", bbr.a.<bss>a(bss::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<bsv> as = a("piglin_brute", bbr.a.<bsv>a(bsv::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<brt> at = a("pillager", bbr.a.<brt>a(brt::new, bcf.a).d().a(0.6F, 1.95F).a(8));
   public static final bbr<bnw> au = a("polar_bear", bbr.a.<bnw>a(bnw::new, bcf.b).a(cju.pn).a(1.4F, 1.4F).a(10));
   public static final bbr<bqw> av = a("tnt", bbr.a.<bqw>a(bqw::new, bcf.h).c().a(0.98F, 0.98F).a(10).b(10));
   public static final bbr<bnx> aw = a("pufferfish", bbr.a.<bnx>a(bnx::new, bcf.g).a(0.7F, 0.7F).a(4));
   public static final bbr<bny> ax = a("rabbit", bbr.a.<bny>a(bny::new, bcf.b).a(0.4F, 0.5F).a(8));
   public static final bbr<brv> ay = a("ravager", bbr.a.<brv>a(brv::new, bcf.a).a(1.95F, 2.2F).a(10));
   public static final bbr<bnz> az = a("salmon", bbr.a.<bnz>a(bnz::new, bcf.g).a(0.7F, 0.4F).a(4));
   public static final bbr<boa> aA = a("sheep", bbr.a.<boa>a(boa::new, bcf.b).a(0.9F, 1.3F).a(10));
   public static final bbr<brw> aB = a("shulker", bbr.a.<brw>a(brw::new, bcf.a).c().d().a(1.0F, 1.0F).a(10));
   public static final bbr<buw> aC = a("shulker_bullet", bbr.a.<buw>a(buw::new, bcf.h).a(0.3125F, 0.3125F).a(8));
   public static final bbr<brx> aD = a("silverfish", bbr.a.<brx>a(brx::new, bcf.a).a(0.4F, 0.3F).a(8));
   public static final bbr<bry> aE = a("skeleton", bbr.a.<bry>a(bry::new, bcf.a).a(0.6F, 1.99F).a(8));
   public static final bbr<bpg> aF = a("skeleton_horse", bbr.a.<bpg>a(bpg::new, bcf.b).a(1.3964844F, 1.6F).a(10));
   public static final bbr<brz> aG = a("slime", bbr.a.<brz>a(brz::new, bcf.a).a(2.04F, 2.04F).a(10));
   public static final bbr<bux> aH = a("small_fireball", bbr.a.<bux>a(bux::new, bcf.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bbr<boc> aI = a("snow_golem", bbr.a.<boc>a(boc::new, bcf.h).a(cju.pn).a(0.7F, 1.9F).a(8));
   public static final bbr<buy> aJ = a("snowball", bbr.a.<buy>a(buy::new, bcf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bbr<buz> aK = a("spectral_arrow", bbr.a.<buz>a(buz::new, bcf.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bbr<bsb> aL = a("spider", bbr.a.<bsb>a(bsb::new, bcf.a).a(1.4F, 0.9F).a(8));
   public static final bbr<bod> aM = a("squid", bbr.a.<bod>a(bod::new, bcf.f).a(0.8F, 0.8F).a(8));
   public static final bbr<bsc> aN = a("stray", bbr.a.<bsc>a(bsc::new, bcf.a).a(0.6F, 1.99F).a(cju.pn).a(8));
   public static final bbr<bsd> aO = a("strider", bbr.a.<bsd>a(bsd::new, bcf.b).c().a(0.9F, 1.7F).a(10));
   public static final bbr<bot> aP = a("tadpole", bbr.a.<bot>a(bot::new, bcf.b).a(bot.c, bot.d).a(10));
   public static final bbr<bvc> aQ = a("egg", bbr.a.<bvc>a(bvc::new, bcf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bbr<bvd> aR = a("ender_pearl", bbr.a.<bvd>a(bvd::new, bcf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bbr<bve> aS = a("experience_bottle", bbr.a.<bve>a(bve::new, bcf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bbr<bvf> aT = a("potion", bbr.a.<bvf>a(bvf::new, bcf.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bbr<bvg> aU = a("trident", bbr.a.<bvg>a(bvg::new, bcf.h).a(0.5F, 0.5F).a(4).b(20));
   public static final bbr<bpi> aV = a("trader_llama", bbr.a.<bpi>a(bpi::new, bcf.b).a(0.9F, 1.87F).a(10));
   public static final bbr<boe> aW = a("tropical_fish", bbr.a.<boe>a(boe::new, bcf.g).a(0.5F, 0.4F).a(4));
   public static final bbr<bof> aX = a("turtle", bbr.a.<bof>a(bof::new, bcf.b).a(1.2F, 0.4F).a(10));
   public static final bbr<bse> aY = a("vex", bbr.a.<bse>a(bse::new, bcf.a).c().a(0.4F, 0.8F).a(8));
   public static final bbr<btp> aZ = a("villager", bbr.a.<btp>a(btp::new, bcf.h).a(0.6F, 1.95F).a(10));
   public static final bbr<bsf> ba = a("vindicator", bbr.a.<bsf>a(bsf::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<btv> bb = a("wandering_trader", bbr.a.<btv>a(btv::new, bcf.b).a(0.6F, 1.95F).a(10));
   public static final bbr<btg> bc = a("warden", bbr.a.<btg>a(btg::new, bcf.a).a(0.9F, 2.9F).a(16).c());
   public static final bbr<bsg> bd = a("witch", bbr.a.<bsg>a(bsg::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<bqj> be = a("wither", bbr.a.<bqj>a(bqj::new, bcf.a).c().a(cju.bP).a(0.9F, 3.5F).a(10));
   public static final bbr<bsh> bf = a("wither_skeleton", bbr.a.<bsh>a(bsh::new, bcf.a).c().a(cju.bP).a(0.7F, 2.4F).a(8));
   public static final bbr<bvh> bg = a("wither_skull", bbr.a.<bvh>a(bvh::new, bcf.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bbr<boh> bh = a("wolf", bbr.a.<boh>a(boh::new, bcf.b).a(0.6F, 0.85F).a(10));
   public static final bbr<bsi> bi = a("zoglin", bbr.a.<bsi>a(bsi::new, bcf.a).c().a(1.3964844F, 1.4F).a(8));
   public static final bbr<bsj> bj = a("zombie", bbr.a.<bsj>a(bsj::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<bpk> bk = a("zombie_horse", bbr.a.<bpk>a(bpk::new, bcf.b).a(1.3964844F, 1.6F).a(10));
   public static final bbr<bsk> bl = a("zombie_villager", bbr.a.<bsk>a(bsk::new, bcf.a).a(0.6F, 1.95F).a(8));
   public static final bbr<bsl> bm = a("zombified_piglin", bbr.a.<bsl>a(bsl::new, bcf.a).c().a(0.6F, 1.95F).a(8));
   public static final bbr<buc> bn = a("player", bbr.a.<buc>a(bcf.h).b().a().a(0.6F, 1.8F).a(32).b(2));
   public static final bbr<buq> bo = a("fishing_bobber", bbr.a.<buq>a(buq::new, bcf.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bbr.b<T> bs;
   private final bcf bt;
   private final ImmutableSet<cjt> bu;
   private final boolean bv;
   private final boolean bw;
   private final boolean bx;
   private final boolean by;
   private final int bz;
   private final int bA;
   @Nullable
   private String bB;
   @Nullable
   private rq bC;
   @Nullable
   private abb bD;
   private final bbo bE;

   private static <T extends bbn> bbr<T> a(String $$0, bbr.a<T> $$1) {
      return hm.a(hm.X, $$0, $$1.a($$0));
   }

   public static abb a(bbr<?> $$0) {
      return hm.X.b($$0);
   }

   public static Optional<bbr<?>> a(String $$0) {
      return hm.X.b(abb.a($$0));
   }

   public bbr(bbr.b<T> $$0, bcf $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cjt> $$6, bbo $$7, int $$8, int $$9) {
      this.bs = $$0;
      this.bt = $$1;
      this.by = $$5;
      this.bv = $$2;
      this.bw = $$3;
      this.bx = $$4;
      this.bu = $$6;
      this.bE = $$7;
      this.bz = $$8;
      this.bA = $$9;
   }

   @Nullable
   public bbn a(agg $$0, @Nullable cax $$1, @Nullable buc $$2, gt $$3, bcg $$4, boolean $$5, boolean $$6) {
      return this.a($$0, $$1 == null ? null : $$1.u(), $$1 != null && $$1.z() ? $$1.x() : null, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   public T a(agg $$0, @Nullable pj $$1, @Nullable rq $$2, @Nullable buc $$3, gt $$4, bcg $$5, boolean $$6, boolean $$7) {
      T $$8 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8 != null) {
         $$0.a_($$8);
      }

      return $$8;
   }

   @Nullable
   public T b(agg $$0, @Nullable pj $$1, @Nullable rq $$2, @Nullable buc $$3, gt $$4, bcg $$5, boolean $$6, boolean $$7) {
      T $$8 = this.a((cgx)$$0);
      if ($$8 == null) {
         return null;
      } else {
         double $$9;
         if ($$6) {
            $$8.e((double)$$4.u() + 0.5, (double)($$4.v() + 1), (double)$$4.w() + 0.5);
            $$9 = a($$0, $$4, $$7, $$8.cy());
         } else {
            $$9 = 0.0;
         }

         $$8.b((double)$$4.u() + 0.5, (double)$$4.v() + $$9, (double)$$4.w() + 0.5, ami.g($$0.w.i() * 360.0F), 0.0F);
         if ($$8 instanceof bce $$11) {
            $$11.aZ = $$11.dq();
            $$11.aX = $$11.dq();
            $$11.a($$0, $$0.d_($$11.da()), $$5, null, $$1);
            $$11.K();
         }

         if ($$2 != null && $$8 instanceof bcc) {
            $$8.b($$2);
         }

         a($$0, $$3, $$8, $$1);
         return $$8;
      }
   }

   protected static double a(cha $$0, gt $$1, boolean $$2, dwl $$3) {
      dwl $$4 = new dwl($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<dxj> $$5 = $$0.c(null, $$4);
      return 1.0 + dxg.a(gy.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(cgx $$0, @Nullable buc $$1, @Nullable bbn $$2, @Nullable pj $$3) {
      if ($$3 != null && $$3.b("EntityTag", 10)) {
         MinecraftServer $$4 = $$0.n();
         if ($$4 != null && $$2 != null) {
            if ($$0.y || !$$2.cF() || $$1 != null && $$4.ac().e($$1.fy())) {
               pj $$5 = $$2.f(new pj());
               UUID $$6 = $$2.co();
               $$5.a($$3.p("EntityTag"));
               $$2.a_($$6);
               $$2.g($$5);
            }
         }
      }
   }

   public boolean b() {
      return this.bv;
   }

   public boolean c() {
      return this.bw;
   }

   public boolean d() {
      return this.bx;
   }

   public boolean e() {
      return this.by;
   }

   public bcf f() {
      return this.bt;
   }

   public String g() {
      if (this.bB == null) {
         this.bB = ad.a("entity", hm.X.b(this));
      }

      return this.bB;
   }

   public rq h() {
      if (this.bC == null) {
         this.bC = rq.c(this.g());
      }

      return this.bC;
   }

   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public abb j() {
      if (this.bD == null) {
         abb $$0 = hm.X.b(this);
         this.bD = new abb($$0.b(), "entities/" + $$0.a());
      }

      return this.bD;
   }

   public float k() {
      return this.bE.a;
   }

   public float l() {
      return this.bE.b;
   }

   @Nullable
   public T a(cgx $$0) {
      return this.bs.create(this, $$0);
   }

   public static Optional<bbn> a(pj $$0, cgx $$1) {
      return ad.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bp.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public dwl a(double $$0, double $$1, double $$2) {
      float $$3 = this.k() / 2.0F;
      return new dwl($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
   }

   public boolean a(cvo $$0) {
      if (this.bu.contains($$0.b())) {
         return false;
      } else if (!this.bx && dqq.a($$0)) {
         return true;
      } else {
         return $$0.a(cju.bP) || $$0.a(cju.mT) || $$0.a(cju.cZ) || $$0.a(cju.pn);
      }
   }

   public bbo m() {
      return this.bE;
   }

   public static Optional<bbr<?>> a(pj $$0) {
      return hm.X.b(new abb($$0.l("id")));
   }

   @Nullable
   public static bbn a(pj $$0, cgx $$1, Function<bbn, bbn> $$2) {
      return (bbn)b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            pp $$4 = $$0.c("Passengers", 10);

            for(int $$5 = 0; $$5 < $$4.size(); ++$$5) {
               bbn $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return $$3;
      }).orElse(null);
   }

   public static Stream<bbn> a(final List<? extends qc> $$0, final cgx $$1) {
      final Spliterator<? extends qc> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bbn>() {
         public boolean tryAdvance(Consumer<? super bbn> $$0x) {
            return $$2.tryAdvance($$2xx -> bbr.a((pj)$$2xx, $$1, $$1xxx -> {
                  $$0.accept($$1xxx);
                  return $$1xxx;
               }));
         }

         public Spliterator<bbn> trySplit() {
            return null;
         }

         public long estimateSize() {
            return (long)$$0.size();
         }

         public int characteristics() {
            return 1297;
         }
      }, false);
   }

   private static Optional<bbn> b(pj $$0, cgx $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bp.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int n() {
      return this.bz;
   }

   public int o() {
      return this.bA;
   }

   public boolean p() {
      return this != bn && this != Z && this != be && this != g && this != U && this != K && this != W && this != am && this != w && this != B;
   }

   public boolean a(akz<bbr<?>> $$0) {
      return this.bq.a($$0);
   }

   @Nullable
   public T a(bbn $$0) {
      return (T)($$0.ad() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bbn> a() {
      return bbn.class;
   }

   @Deprecated
   public hc.c<bbr<?>> q() {
      return this.bq;
   }

   public static class a<T extends bbn> {
      private final bbr.b<T> a;
      private final bcf b;
      private ImmutableSet<cjt> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bbo j = bbo.b(0.6F, 1.8F);

      private a(bbr.b<T> $$0, bcf $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bcf.b || $$1 == bcf.h;
      }

      public static <T extends bbn> bbr.a<T> a(bbr.b<T> $$0, bcf $$1) {
         return new bbr.a<>($$0, $$1);
      }

      public static <T extends bbn> bbr.a<T> a(bcf $$0) {
         return new bbr.a<>(($$0x, $$1) -> null, $$0);
      }

      public bbr.a<T> a(float $$0, float $$1) {
         this.j = bbo.b($$0, $$1);
         return this;
      }

      public bbr.a<T> a() {
         this.e = false;
         return this;
      }

      public bbr.a<T> b() {
         this.d = false;
         return this;
      }

      public bbr.a<T> c() {
         this.f = true;
         return this;
      }

      public bbr.a<T> a(cjt... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bbr.a<T> d() {
         this.g = true;
         return this;
      }

      public bbr.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bbr.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bbr<T> a(String $$0) {
         if (this.d) {
            ad.a(asr.p, $$0);
         }

         return new bbr<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i);
      }
   }

   public interface b<T extends bbn> {
      T create(bbr<T> var1, cgx var2);
   }
}
