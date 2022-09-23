import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ctk<T extends cti> {
   private static final Logger K = LogUtils.getLogger();
   public static final ctk<cty> a = a("furnace", ctk.b.a(cty::new, cju.co));
   public static final ctk<ctn> b = a("chest", ctk.b.a(ctn::new, cju.cg));
   public static final ctk<cus> c = a("trapped_chest", ctk.b.a(cus::new, cju.fW));
   public static final ctk<ctx> d = a("ender_chest", ctk.b.a(ctx::new, cju.eN));
   public static final ctk<cuc> e = a("jukebox", ctk.b.a(cuc::new, cju.dc));
   public static final ctk<ctu> f = a("dispenser", ctk.b.a(ctu::new, cju.aH));
   public static final ctk<ctv> g = a("dropper", ctk.b.a(ctv::new, cju.gj));
   public static final ctk<cuk> h = a(
      "sign",
      ctk.b.a(
         cuk::new,
         cju.cp,
         cju.cq,
         cju.cr,
         cju.cs,
         cju.ct,
         cju.cu,
         cju.cA,
         cju.cB,
         cju.cC,
         cju.cD,
         cju.cE,
         cju.cF,
         cju.nH,
         cju.nJ,
         cju.nI,
         cju.nK,
         cju.cv,
         cju.cG
      )
   );
   public static final ctk<cun> i = a("mob_spawner", ctk.b.a(cun::new, cju.ce));
   public static final ctk<cvk> j = a("piston", ctk.b.a(cvk::new, cju.bD));
   public static final ctk<ctl> k = a("brewing_stand", ctk.b.a(ctl::new, cju.ez));
   public static final ctk<ctw> l = a("enchanting_table", ctk.b.a(ctw::new, cju.ey));
   public static final ctk<cuq> m = a("end_portal", ctk.b.a(cuq::new, cju.eE));
   public static final ctk<ctd> n = a("beacon", ctk.b.a(ctd::new, cju.eV));
   public static final ctk<cul> o = a(
      "skull", ctk.b.a(cul::new, cju.fH, cju.fI, cju.fP, cju.fQ, cju.fR, cju.fS, cju.fL, cju.fM, cju.fJ, cju.fK, cju.fN, cju.fO)
   );
   public static final ctk<ctt> p = a("daylight_detector", ctk.b.a(ctt::new, cju.ga));
   public static final ctk<cua> q = a("hopper", ctk.b.a(cua::new, cju.gd));
   public static final ctk<ctq> r = a("comparator", ctk.b.a(ctq::new, cju.fZ));
   public static final ctk<csy> s = a(
      "banner",
      ctk.b.a(
         csy::new,
         cju.hH,
         cju.hI,
         cju.hJ,
         cju.hK,
         cju.hL,
         cju.hM,
         cju.hN,
         cju.hO,
         cju.hP,
         cju.hQ,
         cju.hR,
         cju.hS,
         cju.hT,
         cju.hU,
         cju.hV,
         cju.hW,
         cju.hX,
         cju.hY,
         cju.hZ,
         cju.ia,
         cju.ib,
         cju.ic,
         cju.id,
         cju.ie,
         cju.if,
         cju.ig,
         cju.ih,
         cju.ii,
         cju.ij,
         cju.ik,
         cju.il,
         cju.im
      )
   );
   public static final ctk<cuo> t = a("structure_block", ctk.b.a(cuo::new, cju.nL));
   public static final ctk<cup> u = a("end_gateway", ctk.b.a(cup::new, cju.jr));
   public static final ctk<ctp> v = a("command_block", ctk.b.a(ctp::new, cju.eU, cju.jt, cju.js));
   public static final ctk<cuj> w = a(
      "shulker_box",
      ctk.b.a(cuj::new, cju.jB, cju.jR, cju.jN, cju.jO, cju.jL, cju.jJ, cju.jP, cju.jF, cju.jK, cju.jH, cju.jE, cju.jD, cju.jI, cju.jM, cju.jQ, cju.jC, cju.jG)
   );
   public static final ctk<cte> x = a(
      "bed", ctk.b.a(cte::new, cju.ba, cju.bb, cju.aX, cju.aY, cju.aV, cju.aT, cju.aZ, cju.aP, cju.aU, cju.aR, cju.aO, cju.aN, cju.aS, cju.aW, cju.aM, cju.aQ)
   );
   public static final ctk<ctr> y = a("conduit", ctk.b.a(ctr::new, cju.lI));
   public static final ctk<ctb> z = a("barrel", ctk.b.a(ctb::new, cju.mF));
   public static final ctk<cum> A = a("smoker", ctk.b.a(cum::new, cju.mG));
   public static final ctk<cth> B = a("blast_furnace", ctk.b.a(cth::new, cju.mH));
   public static final ctk<cud> C = a("lectern", ctk.b.a(cud::new, cju.mL));
   public static final ctk<ctg> D = a("bell", ctk.b.a(ctg::new, cju.mO));
   public static final ctk<cub> E = a("jigsaw", ctk.b.a(cub::new, cju.nM));
   public static final ctk<ctm> F = a("campfire", ctk.b.a(ctm::new, cju.mR, cju.mS));
   public static final ctk<ctf> G = a("beehive", ctk.b.a(ctf::new, cju.nP, cju.nQ));
   public static final ctk<cuh> H = a("sculk_sensor", ctk.b.a(cuh::new, cju.po));
   public static final ctk<cug> I = a("sculk_catalyst", ctk.b.a(cug::new, cju.pr));
   public static final ctk<cui> J = a("sculk_shrieker", ctk.b.a(cui::new, cju.ps));
   private final ctk.a<? extends T> L;
   private final Set<cjt> M;
   private final Type<?> N;

   @Nullable
   public static abb a(ctk<?> $$0) {
      return hm.ab.b($$0);
   }

   private static <T extends cti> ctk<T> a(String $$0, ctk.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         K.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ad.a(asr.l, $$0);
      return hm.a(hm.ab, $$0, $$1.a($$2));
   }

   public ctk(ctk.a<? extends T> $$0, Set<cjt> $$1, Type<?> $$2) {
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
   }

   @Nullable
   public T a(gt $$0, cvo $$1) {
      return this.L.create($$0, $$1);
   }

   public boolean a(cvo $$0) {
      return this.M.contains($$0.b());
   }

   @Nullable
   public T a(cgd $$0, gt $$1) {
      cti $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.v() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends cti> {
      T create(gt var1, cvo var2);
   }

   public static final class b<T extends cti> {
      private final ctk.a<? extends T> a;
      final Set<cjt> b;

      private b(ctk.a<? extends T> $$0, Set<cjt> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends cti> ctk.b<T> a(ctk.a<? extends T> $$0, cjt... $$1) {
         return new ctk.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public ctk<T> a(Type<?> $$0) {
         return new ctk<>(this.a, this.b, $$0);
      }
   }
}
