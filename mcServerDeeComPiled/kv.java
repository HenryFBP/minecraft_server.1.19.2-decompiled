import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class kv implements iz {
   private static final Logger c = LogUtils.getLogger();
   private static final ImmutableList<cgw> d = ImmutableList.of(caz.R, caz.S);
   private static final ImmutableList<cgw> e = ImmutableList.of(caz.T, caz.U, caz.mZ);
   private static final ImmutableList<cgw> f = ImmutableList.of(caz.V, caz.W, caz.nb);
   private static final ImmutableList<cgw> g = ImmutableList.of(caz.X, caz.Y, caz.ah, caz.nd);
   private static final ImmutableList<cgw> h = ImmutableList.of(caz.af, caz.ag);
   private static final ImmutableList<cgw> i = ImmutableList.of(caz.ad, caz.ae);
   private static final ImmutableList<cgw> j = ImmutableList.of(caz.Z, caz.aa);
   private static final ImmutableList<cgw> k = ImmutableList.of(caz.ab, caz.ac);
   private final iy.a l;
   private final iy.a m;
   private static final Map<iv.b, BiFunction<cgw, cgw, ku>> n = ImmutableMap.builder()
      .put(iv.b.a, (BiFunction)($$0, $$1) -> e($$0, cdm.a($$1)))
      .put(iv.b.b, (BiFunction)($$0, $$1) -> d($$0, cdm.a($$1)))
      .put(iv.b.d, (BiFunction)($$0, $$1) -> c($$0, cdm.a($$1)))
      .put(iv.b.e, (BiFunction)($$0, $$1) -> f($$0, cdm.a($$1)))
      .put(iv.b.f, (BiFunction)($$0, $$1) -> g($$0, cdm.a($$1)))
      .put(iv.b.g, (BiFunction)($$0, $$1) -> h($$0, cdm.a($$1)))
      .put(iv.b.h, (BiFunction)($$0, $$1) -> m($$0, cdm.a($$1)))
      .put(iv.b.i, (BiFunction)($$0, $$1) -> j($$0, cdm.a($$1)))
      .put(iv.b.j, (BiFunction)($$0, $$1) -> k($$0, cdm.a($$1)))
      .put(iv.b.k, (BiFunction)($$0, $$1) -> i($$0, cdm.a($$1)))
      .put(iv.b.l, (BiFunction)($$0, $$1) -> b($$0, cdm.a($$1)))
      .put(iv.b.m, (BiFunction)($$0, $$1) -> l($$0, cdm.a($$1)))
      .put(iv.b.n, (BiFunction)($$0, $$1) -> a($$0, cdm.a($$1)))
      .build();

   public kv(iy $$0) {
      this.l = $$0.a(iy.b.a, "recipes");
      this.m = $$0.a(iy.b.a, "advancements");
   }

   @Override
   public void a(ix $$0) {
      Set<abb> $$1 = Sets.newHashSet();
      a($$2 -> {
         if (!$$1.add($$2.b())) {
            throw new IllegalStateException("Duplicate recipe " + $$2.b());
         } else {
            a($$0, $$2.a(), this.l.a($$2.b()));
            JsonObject $$3 = $$2.d();
            if ($$3 != null) {
               b($$0, $$3, this.m.a($$2.e()));
            }

         }
      });
      b($$0, af.a.a().a("impossible", new bw.a()).b(), this.m.a(ku.a));
   }

   private static void a(ix $$0, JsonObject $$1, Path $$2) {
      try {
         iz.a($$0, $$1, $$2);
      } catch (IOException var4) {
         c.error("Couldn't save recipe {}", $$2, var4);
      }

   }

   private static void b(ix $$0, JsonObject $$1, Path $$2) {
      try {
         iz.a($$0, $$1, $$2);
      } catch (IOException var4) {
         c.error("Couldn't save recipe advancement {}", $$2, var4);
      }

   }

   private static void a(Consumer<kt> $$0) {
      iu.a().filter(iv::d).forEach($$1 -> a($$0, $$1));
      a($$0, cju.r, aks.u);
      b($$0, cju.p, aks.t);
      b($$0, cju.np, aks.y);
      a($$0, cju.s, aks.r);
      b($$0, cju.q, aks.v);
      b($$0, cju.n, aks.s);
      b($$0, cju.o, aks.w);
      b($$0, cju.nq, aks.z);
      b($$0, cju.t, aks.x);
      f($$0, cju.ai, cju.S);
      f($$0, cju.ag, cju.Q);
      f($$0, cju.aj, cju.T);
      f($$0, cju.ah, cju.R);
      f($$0, cju.ae, cju.O);
      f($$0, cju.af, cju.P);
      f($$0, cju.nf, cju.nd);
      f($$0, cju.mW, cju.mU);
      f($$0, cju.ak, cju.U);
      f($$0, cju.ap, cju.aa);
      f($$0, cju.an, cju.Y);
      f($$0, cju.aq, cju.ab);
      f($$0, cju.ao, cju.Z);
      f($$0, cju.al, cju.ac);
      f($$0, cju.am, cju.X);
      f($$0, cju.ng, cju.ne);
      f($$0, cju.mX, cju.mV);
      f($$0, cju.ar, cju.ad);
      g($$0, caz.mE, cju.r);
      g($$0, caz.mA, cju.p);
      g($$0, caz.mG, cju.s);
      g($$0, caz.mC, cju.q);
      g($$0, caz.mw, cju.n);
      g($$0, caz.my, cju.o);
      g($$0, caz.mI, cju.t);
      k($$0, cju.bC, caz.pG);
      l($$0, cju.hx, cju.bC);
      m($$0, cju.hx, caz.pG);
      n($$0, caz.qa, cju.bC);
      o($$0, caz.qa, caz.pG);
      p($$0, caz.ta, cju.bC);
      k($$0, cju.by, caz.pC);
      l($$0, cju.ht, cju.by);
      m($$0, cju.ht, caz.pC);
      n($$0, caz.pW, cju.by);
      o($$0, caz.pW, caz.pC);
      p($$0, caz.sW, cju.by);
      k($$0, cju.bz, caz.pD);
      l($$0, cju.hu, cju.bz);
      m($$0, cju.hu, caz.pD);
      n($$0, caz.pX, cju.bz);
      o($$0, caz.pX, caz.pD);
      p($$0, caz.sX, cju.bz);
      k($$0, cju.bw, caz.pA);
      l($$0, cju.hr, cju.bw);
      m($$0, cju.hr, caz.pA);
      n($$0, caz.pU, cju.bw);
      o($$0, caz.pU, caz.pA);
      p($$0, caz.sU, cju.bw);
      k($$0, cju.bu, caz.py);
      l($$0, cju.hp, cju.bu);
      m($$0, cju.hp, caz.py);
      n($$0, caz.pS, cju.bu);
      o($$0, caz.pS, caz.py);
      p($$0, caz.sS, cju.bu);
      k($$0, cju.bA, caz.pE);
      l($$0, cju.hv, cju.bA);
      m($$0, cju.hv, caz.pE);
      n($$0, caz.pY, cju.bA);
      o($$0, caz.pY, caz.pE);
      p($$0, caz.sY, cju.bA);
      k($$0, cju.bq, caz.pu);
      l($$0, cju.hl, cju.bq);
      m($$0, cju.hl, caz.pu);
      n($$0, caz.pO, cju.bq);
      o($$0, caz.pO, caz.pu);
      p($$0, caz.sO, cju.bq);
      k($$0, cju.bv, caz.pz);
      l($$0, cju.hq, cju.bv);
      m($$0, cju.hq, caz.pz);
      n($$0, caz.pT, cju.bv);
      o($$0, caz.pT, caz.pz);
      p($$0, caz.sT, cju.bv);
      k($$0, cju.bs, caz.pw);
      l($$0, cju.hn, cju.bs);
      m($$0, cju.hn, caz.pw);
      n($$0, caz.pQ, cju.bs);
      o($$0, caz.pQ, caz.pw);
      p($$0, caz.sQ, cju.bs);
      k($$0, cju.bp, caz.pt);
      l($$0, cju.hk, cju.bp);
      m($$0, cju.hk, caz.pt);
      n($$0, caz.pN, cju.bp);
      o($$0, caz.pN, caz.pt);
      p($$0, caz.sN, cju.bp);
      k($$0, cju.bo, caz.ps);
      l($$0, cju.hj, cju.bo);
      m($$0, cju.hj, caz.ps);
      n($$0, caz.pM, cju.bo);
      o($$0, caz.pM, caz.ps);
      p($$0, caz.sM, cju.bo);
      k($$0, cju.bt, caz.px);
      l($$0, cju.ho, cju.bt);
      m($$0, cju.ho, caz.px);
      n($$0, caz.pR, cju.bt);
      o($$0, caz.pR, caz.px);
      p($$0, caz.sR, cju.bt);
      k($$0, cju.bx, caz.pB);
      l($$0, cju.hs, cju.bx);
      m($$0, cju.hs, caz.pB);
      n($$0, caz.pV, cju.bx);
      o($$0, caz.pV, caz.pB);
      p($$0, caz.sV, cju.bx);
      k($$0, cju.bB, caz.pF);
      l($$0, cju.hw, cju.bB);
      m($$0, cju.hw, caz.pF);
      n($$0, caz.pZ, cju.bB);
      o($$0, caz.pZ, caz.pF);
      p($$0, caz.sZ, cju.bB);
      l($$0, cju.hi, cju.bn);
      n($$0, caz.pL, cju.bn);
      p($$0, caz.sL, cju.bn);
      k($$0, cju.br, caz.pv);
      l($$0, cju.hm, cju.br);
      m($$0, cju.hm, caz.pv);
      n($$0, caz.pP, cju.br);
      o($$0, caz.pP, caz.pv);
      p($$0, caz.sP, cju.br);
      l($$0, cju.qj, cju.qk);
      q($$0, cju.dH, caz.pG);
      r($$0, cju.gP, cju.dH);
      s($$0, cju.gP, caz.pG);
      q($$0, cju.dD, caz.pC);
      r($$0, cju.gL, cju.dD);
      s($$0, cju.gL, caz.pC);
      q($$0, cju.dE, caz.pD);
      r($$0, cju.gM, cju.dE);
      s($$0, cju.gM, caz.pD);
      q($$0, cju.dB, caz.pA);
      r($$0, cju.gJ, cju.dB);
      s($$0, cju.gJ, caz.pA);
      q($$0, cju.dz, caz.py);
      r($$0, cju.gH, cju.dz);
      s($$0, cju.gH, caz.py);
      q($$0, cju.dF, caz.pE);
      r($$0, cju.gN, cju.dF);
      s($$0, cju.gN, caz.pE);
      q($$0, cju.dv, caz.pu);
      r($$0, cju.gD, cju.dv);
      s($$0, cju.gD, caz.pu);
      q($$0, cju.dA, caz.pz);
      r($$0, cju.gI, cju.dA);
      s($$0, cju.gI, caz.pz);
      q($$0, cju.dx, caz.pw);
      r($$0, cju.gF, cju.dx);
      s($$0, cju.gF, caz.pw);
      q($$0, cju.du, caz.pt);
      r($$0, cju.gC, cju.du);
      s($$0, cju.gC, caz.pt);
      q($$0, cju.dt, caz.ps);
      r($$0, cju.gB, cju.dt);
      s($$0, cju.gB, caz.ps);
      q($$0, cju.dy, caz.px);
      r($$0, cju.gG, cju.dy);
      s($$0, cju.gG, caz.px);
      q($$0, cju.dC, caz.pB);
      r($$0, cju.gK, cju.dC);
      s($$0, cju.gK, caz.pB);
      q($$0, cju.dG, caz.pF);
      r($$0, cju.gO, cju.dG);
      s($$0, cju.gO, caz.pF);
      q($$0, cju.ds, caz.pr);
      r($$0, cju.gA, cju.ds);
      s($$0, cju.gA, caz.pr);
      q($$0, cju.dw, caz.pv);
      r($$0, cju.gE, cju.dw);
      s($$0, cju.gE, caz.pv);
      t($$0, cju.gz, caz.pG);
      t($$0, cju.gv, caz.pC);
      t($$0, cju.gw, caz.pD);
      t($$0, cju.gt, caz.pA);
      t($$0, cju.gr, caz.py);
      t($$0, cju.gx, caz.pE);
      t($$0, cju.gn, caz.pu);
      t($$0, cju.gs, caz.pz);
      t($$0, cju.gp, caz.pw);
      t($$0, cju.gm, caz.pt);
      t($$0, cju.gl, caz.ps);
      t($$0, cju.gq, caz.px);
      t($$0, cju.gu, caz.pB);
      t($$0, cju.gy, caz.pF);
      t($$0, cju.gk, caz.pr);
      t($$0, cju.go, caz.pv);
      u($$0, cju.kN, caz.pG);
      u($$0, cju.kJ, caz.pC);
      u($$0, cju.kK, caz.pD);
      u($$0, cju.kH, caz.pA);
      u($$0, cju.kF, caz.py);
      u($$0, cju.kL, caz.pE);
      u($$0, cju.kB, caz.pu);
      u($$0, cju.kG, caz.pz);
      u($$0, cju.kD, caz.pw);
      u($$0, cju.kA, caz.pt);
      u($$0, cju.kz, caz.ps);
      u($$0, cju.kE, caz.px);
      u($$0, cju.kI, caz.pB);
      u($$0, cju.kM, caz.pF);
      u($$0, cju.ky, caz.pr);
      u($$0, cju.kC, caz.pv);
      kw.b(caz.uH).a('S', caz.nO).a('H', caz.un).b("S").b("H").b("has_string", a(caz.nO)).b("has_honeycomb", a(caz.un)).a($$0);
      a($$0, cju.oM, caz.pG);
      a($$0, cju.oI, caz.pC);
      a($$0, cju.oJ, caz.pD);
      a($$0, cju.oG, caz.pA);
      a($$0, cju.oE, caz.py);
      a($$0, cju.oK, caz.pE);
      a($$0, cju.oA, caz.pu);
      a($$0, cju.oF, caz.pz);
      a($$0, cju.oC, caz.pw);
      a($$0, cju.oz, caz.pt);
      a($$0, cju.oy, caz.ps);
      a($$0, cju.oD, caz.px);
      a($$0, cju.oH, caz.pB);
      a($$0, cju.oL, caz.pF);
      a($$0, cju.ox, caz.pr);
      a($$0, cju.oB, caz.pv);
      kx.a(cju.dT, 1).c(cju.qq).c(caz.nS).b("has_mud", a((cgw)cju.qq)).a($$0);
      kw.a(cju.dU, 4).a('#', cju.dT).b("##").b("##").b("has_packed_mud", a((cgw)cju.dT)).a($$0);
      kx.a(cju.W, 1).c(cju.qq).c(caz.bh).b("has_mangrove_roots", a((cgw)cju.V)).a($$0);
      kw.a(cju.gi, 6).a('#', cju.cT).a('S', caz.nL).a('X', caz.na).b("XSX").b("X#X").b("XSX").b("has_rail", a((cgw)cju.cy)).a($$0);
      kx.a(cju.g, 2).c(cju.e).c(cju.m).b("has_stone", a((cgw)cju.e)).a($$0);
      kw.b(cju.fT).a('I', cju.bU).a('i', caz.na).b("III").b(" i ").b("iii").b("has_iron_block", a((cgw)cju.bU)).a($$0);
      kw.b(caz.sB).a('/', caz.nL).a('_', cju.iz).b("///").b(" / ").b("/_/").b("has_stone_slab", a((cgw)cju.iz)).a($$0);
      kw.a(caz.mR, 4).a('#', caz.nL).a('X', caz.os).a('Y', caz.nP).b("X").b("#").b("Y").b("has_feather", a(caz.nP)).b("has_flint", a(caz.os)).a($$0);
      kw.a(cju.mF, 1).a('P', aks.b).a('S', aks.i).b("PSP").b("P P").b("PSP").b("has_planks", a(aks.b)).b("has_wood_slab", a(aks.i)).a($$0);
      kw.b(cju.eV).a('S', caz.so).a('G', cju.aD).a('O', cju.bZ).b("GGG").b("GSG").b("OOO").b("has_nether_star", a(caz.so)).a($$0);
      kw.b(cju.nQ).a('P', aks.b).a('H', caz.un).b("PPP").b("HHH").b("PPP").b("has_honeycomb", a(caz.un)).a($$0);
      kx.b(caz.tg).c(caz.nM).b(caz.te, 6).b("has_beetroot", a(caz.te)).a($$0);
      kx.b(caz.pG).c(caz.po).b("black_dye").b("has_ink_sac", a(caz.po)).a($$0);
      a($$0, caz.pG, cju.bP, "black_dye");
      kx.a(caz.qw, 2).c(caz.qo).b("has_blaze_rod", a(caz.qo)).a($$0);
      kx.b(caz.pC).c(caz.mW).b("blue_dye").b("has_lapis_lazuli", a(caz.mW)).a($$0);
      a($$0, caz.pC, cju.bO, "blue_dye");
      kw.b(cju.lH).a('#', cju.hA).b("###").b("###").b("###").b("has_packed_ice", a((cgw)cju.hA)).a($$0);
      kx.a(caz.pH, 3).c(caz.pI).b("bonemeal").b("has_bone", a(caz.pI)).a($$0);
      b($$0, caz.pH, caz.ie, "bone_meal_from_bone_block", "bonemeal");
      kx.b(caz.oY).b(caz.oX, 3).c(caz.oM).b("has_paper", a(caz.oX)).a($$0);
      kw.b(cju.bX).a('#', aks.b).a('X', caz.oY).b("###").b("XXX").b("###").b("has_book", a(caz.oY)).a($$0);
      kw.b(caz.mQ).a('#', caz.nL).a('X', caz.nO).b(" #X").b("# X").b(" #X").b("has_string", a(caz.nO)).a($$0);
      kw.a(caz.nM, 4)
         .a('#', aks.b)
         .b("# #")
         .b(" # ")
         .b("has_brown_mushroom", a((cgw)cju.bR))
         .b("has_red_mushroom", a((cgw)cju.bS))
         .b("has_mushroom_stew", a(caz.nN))
         .a($$0);
      kw.b(caz.nT).a('#', caz.nS).b("###").b("has_wheat", a(caz.nS)).a($$0);
      kw.b(cju.ez).a('B', caz.qo).a('#', aks.at).b(" B ").b("###").b("has_blaze_rod", a(caz.qo)).a($$0);
      kw.b(cju.bV).a('#', caz.oU).b("##").b("##").b("has_brick", a(caz.oU)).a($$0);
      kx.b(caz.pD).c(caz.pq).b("brown_dye").b("has_cocoa_beans", a(caz.pq)).a($$0);
      kw.b(caz.oH).a('#', caz.na).b("# #").b(" # ").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(cju.dq).a('A', caz.oN).a('B', caz.pJ).a('C', caz.nS).a('E', caz.pa).b("AAA").b("BEB").b("CCC").b("has_egg", a(caz.pa)).a($$0);
      kw.b(cju.mR).a('L', aks.q).a('S', caz.nL).a('C', aks.ao).b(" S ").b("SCS").b("LLL").b("has_stick", a(caz.nL)).b("has_coal", a(aks.ao)).a($$0);
      kw.b(caz.mt).a('#', caz.pe).a('X', caz.sc).b("# ").b(" X").b("has_carrot", a(caz.sc)).a($$0);
      kw.b(caz.mu).a('#', caz.pe).a('X', caz.cS).b("# ").b(" X").b("has_warped_fungus", a(caz.cS)).a($$0);
      kw.b(cju.eA).a('#', caz.na).b("# #").b("# #").b("###").b("has_water_bucket", a(caz.oI)).a($$0);
      kw.b(cju.nN).a('#', aks.i).b("# #").b("# #").b("###").b("has_wood_slab", a(aks.i)).a($$0);
      kw.b(cju.cg).a('#', aks.b).b("###").b("# #").b("###").b("has_lots_of_items", new bx.a(bo.b.a, cj.d.b(10), cj.d.e, cj.d.e, new ca[0])).a($$0);
      kx.b(caz.mp).c(cju.cg).c(caz.mo).b("has_minecart", a(caz.mo)).a($$0);
      h($$0, caz.mF, caz.mE);
      h($$0, caz.mB, caz.mA);
      h($$0, caz.mH, caz.mG);
      h($$0, caz.mD, caz.mC);
      h($$0, caz.mx, caz.mw);
      h($$0, caz.mz, caz.my);
      h($$0, caz.mJ, caz.mI);
      d(cju.gf, cdm.a(cju.iI))
         .b("has_chiseled_quartz_block", a((cgw)cju.gf))
         .b("has_quartz_block", a((cgw)cju.ge))
         .b("has_quartz_pillar", a((cgw)cju.gg))
         .a($$0);
      d(cju.dS, cdm.a(cju.iF)).b("has_tag", a(aks.c)).a($$0);
      kw.b(cju.da).a('#', caz.oV).b("##").b("##").b("has_clay_ball", a(caz.oV)).a($$0);
      kw.b(caz.pf).a('#', caz.ne).a('X', caz.kK).b(" # ").b("#X#").b(" # ").b("has_redstone", a(caz.kK)).a($$0);
      x($$0, caz.mS, caz.ak);
      kw.a(cju.k, 4).a('D', cju.j).a('G', cju.G).b("DG").b("GD").b("has_gravel", a((cgw)cju.G)).a($$0);
      kw.b(cju.fZ).a('#', cju.cT).a('X', caz.mX).a('I', cju.b).b(" # ").b("#X#").b("III").b("has_quartz", a(caz.mX)).a($$0);
      kw.b(caz.pb).a('#', caz.na).a('X', caz.kK).b(" # ").b("#X#").b(" # ").b("has_redstone", a(caz.kK)).a($$0);
      kw.a(caz.qb, 8).a('#', caz.nS).a('X', caz.pq).b("#X#").b("has_cocoa", a(caz.pq)).a($$0);
      kw.b(cju.cl).a('#', aks.b).b("##").b("##").b("has_planks", a(aks.b)).a($$0);
      kw.b(caz.tM)
         .a('~', caz.nO)
         .a('#', caz.nL)
         .a('&', caz.na)
         .a('$', cju.eO)
         .b("#&#")
         .b("~$~")
         .b(" # ")
         .b("has_string", a(caz.nO))
         .b("has_stick", a(caz.nL))
         .b("has_iron_ingot", a(caz.na))
         .b("has_tripwire_hook", a((cgw)cju.eO))
         .a($$0);
      kw.b(cju.mE).a('#', aks.b).a('@', caz.nO).b("@@").b("##").b("has_string", a(caz.nO)).a($$0);
      d(cju.io, cdm.a(cju.iJ))
         .b("has_red_sandstone", a((cgw)cju.in))
         .b("has_chiseled_red_sandstone", a((cgw)cju.io))
         .b("has_cut_red_sandstone", a((cgw)cju.ip))
         .a($$0);
      e($$0, cju.aJ, cju.iA);
      b($$0, caz.nc, caz.ar, d(caz.nc), c(caz.nc));
      kx.a(caz.nc, 9).c(cju.pL).b(c(caz.nc)).b(b(cju.pL), a((cgw)cju.pL)).a($$0, a(caz.nc, cju.pL));
      b($$0);
      kx.a(caz.pA, 2).c(caz.pC).c(caz.pE).b("has_green_dye", a(caz.pE)).b("has_blue_dye", a(caz.pC)).a($$0);
      kw.b(cju.gZ).a('S', caz.su).a('I', caz.pG).b("SSS").b("SIS").b("SSS").b("has_prismarine_shard", a(caz.su)).a($$0);
      kw.b(cju.ga).a('Q', caz.mX).a('G', cju.aD).a('W', cdm.a(aks.i)).b("GGG").b("QQQ").b("WWW").b("has_quartz", a(caz.mX)).a($$0);
      kw.a(cju.qE, 4).a('S', cju.qw).b("SS").b("SS").b("has_polished_deepslate", a((cgw)cju.qw)).a($$0);
      kw.a(cju.qA, 4).a('S', cju.qE).b("SS").b("SS").b("has_deepslate_bricks", a((cgw)cju.qE)).a($$0);
      kw.a(cju.bd, 6).a('R', caz.kK).a('#', cju.cI).a('X', caz.na).b("X X").b("X#X").b("XRX").b("has_rail", a((cgw)cju.cy)).a($$0);
      kw.b(caz.nE).a('#', caz.nL).a('X', caz.mU).b("XX").b("X#").b(" #").b("has_diamond", a(caz.mU)).a($$0);
      x($$0, caz.mU, caz.at);
      kw.b(caz.oj).a('X', caz.mU).b("X X").b("X X").b("has_diamond", a(caz.mU)).a($$0);
      kw.b(caz.oh).a('X', caz.mU).b("X X").b("XXX").b("XXX").b("has_diamond", a(caz.mU)).a($$0);
      kw.b(caz.og).a('X', caz.mU).b("XXX").b("X X").b("has_diamond", a(caz.mU)).a($$0);
      kw.b(caz.nF).a('#', caz.nL).a('X', caz.mU).b("XX").b(" #").b(" #").b("has_diamond", a(caz.mU)).a($$0);
      kw.b(caz.oi).a('X', caz.mU).b("XXX").b("X X").b("X X").b("has_diamond", a(caz.mU)).a($$0);
      kw.b(caz.nD).a('#', caz.nL).a('X', caz.mU).b("XXX").b(" # ").b(" # ").b("has_diamond", a(caz.mU)).a($$0);
      kw.b(caz.nC).a('#', caz.nL).a('X', caz.mU).b("X").b("#").b("#").b("has_diamond", a(caz.mU)).a($$0);
      kw.b(caz.nB).a('#', caz.nL).a('X', caz.mU).b("X").b("X").b("#").b("has_diamond", a(caz.mU)).a($$0);
      kw.a(cju.e, 2).a('Q', caz.mX).a('C', cju.m).b("CQ").b("QC").b("has_quartz", a(caz.mX)).a($$0);
      kw.b(cju.aH).a('R', caz.kK).a('#', cju.m).a('X', caz.mQ).b("###").b("#X#").b("#R#").b("has_bow", a(caz.mQ)).a($$0);
      kw.b(cju.qd).a('#', caz.vc).b("##").b("##").c("pointed_dripstone").b("has_pointed_dripstone", a(caz.vc)).a($$0);
      kw.b(cju.gj).a('R', caz.kK).a('#', cju.m).b("###").b("# #").b("#R#").b("has_redstone", a(caz.kK)).a($$0);
      x($$0, caz.mV, caz.fz);
      kw.b(cju.ey).a('B', caz.oY).a('#', cju.bZ).a('D', caz.mU).b(" B ").b("D#D").b("###").b("has_obsidian", a((cgw)cju.bZ)).a($$0);
      kw.b(cju.eN).a('#', cju.bZ).a('E', caz.qA).b("###").b("#E#").b("###").b("has_ender_eye", a(caz.qA)).a($$0);
      kx.b(caz.qA).c(caz.qn).c(caz.qw).b("has_blaze_powder", a(caz.qw)).a($$0);
      kw.a(cju.jo, 4).a('#', cju.eG).b("##").b("##").b("has_end_stone", a((cgw)cju.eG)).a($$0);
      kw.b(caz.tb).a('T', caz.qp).a('E', caz.qA).a('G', cju.aD).b("GGG").b("GEG").b("GTG").b("has_ender_eye", a(caz.qA)).a($$0);
      kw.a(cju.ji, 4).a('#', caz.td).a('/', caz.qo).b("/").b("#").b("has_chorus_fruit_popped", a(caz.td)).a($$0);
      kx.b(caz.qv).c(caz.qu).c(cju.bR).c(caz.pJ).b("has_spider_eye", a(caz.qu)).a($$0);
      kx.a(caz.rW, 3).c(caz.nQ).c(caz.qw).a(cdm.a(caz.mS, caz.mT)).b("has_blaze_powder", a(caz.qw)).a($$0);
      kx.a(caz.sq, 3).c(caz.nQ).c(caz.oX).b("has_gunpowder", a(caz.nQ)).a($$0, "firework_rocket_simple");
      kw.b(caz.pe).a('#', caz.nL).a('X', caz.nO).b("  #").b(" #X").b("# X").b("has_string", a(caz.nO)).a($$0);
      kx.b(caz.mO).c(caz.na).c(caz.os).b("has_flint", a(caz.os)).b("has_obsidian", a((cgw)cju.bZ)).a($$0);
      kw.b(cju.eY).a('#', caz.oU).b("# #").b(" # ").b("has_brick", a(caz.oU)).a($$0);
      kw.b(cju.co).a('#', aks.at).b("###").b("# #").b("###").b("has_cobblestone", a(aks.at)).a($$0);
      kx.b(caz.mq).c(cju.co).c(caz.mo).b("has_minecart", a(caz.mo)).a($$0);
      kw.a(caz.qt, 3).a('#', cju.aD).b("# #").b(" # ").b("has_glass", a((cgw)cju.aD)).a($$0);
      kw.a(cju.eg, 16).a('#', cju.aD).b("###").b("###").b("has_glass", a((cgw)cju.aD)).a($$0);
      kw.b(cju.dm).a('#', caz.ph).b("##").b("##").b("has_glowstone_dust", a(caz.ph)).a($$0);
      kx.b(caz.sa).c(caz.rZ).c(caz.pp).b("has_item_frame", a(caz.rZ)).b("has_glow_ink_sac", a(caz.pp)).a($$0);
      kw.b(caz.ow).a('#', caz.ne).a('X', caz.mP).b("###").b("#X#").b("###").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.b(caz.nu).a('#', caz.nL).a('X', caz.ne).b("XX").b("X#").b(" #").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.b(caz.on).a('X', caz.ne).b("X X").b("X X").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.b(caz.sh).a('#', caz.qq).a('X', caz.sc).b("###").b("#X#").b("###").b("has_gold_nugget", a(caz.qq)).a($$0);
      kw.b(caz.ol).a('X', caz.ne).b("X X").b("XXX").b("XXX").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.b(caz.ok).a('X', caz.ne).b("XXX").b("X X").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.b(caz.nv).a('#', caz.nL).a('X', caz.ne).b("XX").b(" #").b(" #").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.b(caz.om).a('X', caz.ne).b("XXX").b("X X").b("X X").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.b(caz.nt).a('#', caz.nL).a('X', caz.ne).b("XXX").b(" # ").b(" # ").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.a(cju.bc, 6).a('R', caz.kK).a('#', caz.nL).a('X', caz.ne).b("X X").b("X#X").b("XRX").b("has_rail", a((cgw)cju.cy)).a($$0);
      kw.b(caz.ns).a('#', caz.nL).a('X', caz.ne).b("X").b("#").b("#").b("has_gold_ingot", a(caz.ne)).a($$0);
      kw.b(caz.nr).a('#', caz.nL).a('X', caz.ne).b("X").b("X").b("#").b("has_gold_ingot", a(caz.ne)).a($$0);
      b($$0, caz.ne, caz.as, "gold_ingot_from_gold_block", "gold_ingot");
      a($$0, caz.qq, caz.ne, "gold_ingot_from_nuggets", "gold_ingot");
      kx.b(cju.c).c(cju.e).c(caz.mX).b("has_quartz", a(caz.mX)).a($$0);
      kx.a(caz.py, 2).c(caz.pG).c(caz.pr).b("has_white_dye", a(caz.pr)).b("has_black_dye", a(caz.pG)).a($$0);
      kw.b(cju.hh).a('#', caz.nS).b("###").b("###").b("###").b("has_wheat", a(caz.nS)).a($$0);
      i($$0, cju.fY, caz.na);
      kx.a(caz.uq, 4).c(caz.kS).b(caz.qt, 4).b("has_honey_block", a((cgw)cju.nR)).a($$0);
      kw.a(cju.nR, 1).a('S', caz.uq).b("SS").b("SS").b("has_honey_bottle", a(caz.uq)).a($$0);
      kw.b(cju.nS).a('H', caz.un).b("HH").b("HH").b("has_honeycomb", a(caz.un)).a($$0);
      kw.b(cju.gd).a('C', cju.cg).a('I', caz.na).b("I I").b("ICI").b(" I ").b("has_iron_ingot", a(caz.na)).a($$0);
      kx.b(caz.ms).c(cju.gd).c(caz.mo).b("has_minecart", a(caz.mo)).a($$0);
      kw.b(caz.nz).a('#', caz.nL).a('X', caz.na).b("XX").b("X#").b(" #").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.a(cju.ee, 16).a('#', caz.na).b("###").b("###").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(caz.of).a('X', caz.na).b("X X").b("X X").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(caz.od).a('X', caz.na).b("X X").b("XXX").b("XXX").b("has_iron_ingot", a(caz.na)).a($$0);
      f(cju.cJ, cdm.a(caz.na)).a(b(caz.na), a(caz.na)).a($$0);
      kw.b(caz.oc).a('X', caz.na).b("XXX").b("X X").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(caz.nA).a('#', caz.nL).a('X', caz.na).b("XX").b(" #").b(" #").b("has_iron_ingot", a(caz.na)).a($$0);
      b($$0, caz.na, caz.aq, "iron_ingot_from_iron_block", "iron_ingot");
      a($$0, caz.tp, caz.na, "iron_ingot_from_nuggets", "iron_ingot");
      kw.b(caz.oe).a('X', caz.na).b("XXX").b("X X").b("X X").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(caz.ny).a('#', caz.nL).a('X', caz.na).b("XXX").b(" # ").b(" # ").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(caz.nx).a('#', caz.nL).a('X', caz.na).b("X").b("#").b("#").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(caz.nw).a('#', caz.nL).a('X', caz.na).b("X").b("X").b("#").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(cju.gW).a('#', caz.na).b("##").b("##").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(caz.rZ).a('#', caz.nL).a('X', caz.oM).b("###").b("#X#").b("###").b("has_leather", a(caz.oM)).a($$0);
      kw.b(cju.dc).a('#', aks.b).a('X', caz.mU).b("###").b("#X#").b("###").b("has_diamond", a(caz.mU)).a($$0);
      kw.a(cju.cx, 3).a('#', caz.nL).b("# #").b("###").b("# #").b("has_stick", a(caz.nL)).a($$0);
      x($$0, caz.mW, caz.bZ);
      kw.a(caz.sG, 2).a('~', caz.nO).a('O', caz.oZ).b("~~ ").b("~O ").b("  ~").b("has_slime_ball", a(caz.oZ)).a($$0);
      kw.b(caz.oM).a('#', caz.sA).b("##").b("##").b("has_rabbit_hide", a(caz.sA)).a($$0);
      kw.b(caz.nX).a('X', caz.oM).b("X X").b("X X").b("has_leather", a(caz.oM)).a($$0);
      kw.b(caz.nV).a('X', caz.oM).b("X X").b("XXX").b("XXX").b("has_leather", a(caz.oM)).a($$0);
      kw.b(caz.nU).a('X', caz.oM).b("XXX").b("X X").b("has_leather", a(caz.oM)).a($$0);
      kw.b(caz.nW).a('X', caz.oM).b("XXX").b("X X").b("X X").b("has_leather", a(caz.oM)).a($$0);
      kw.b(caz.sF).a('X', caz.oM).b("X X").b("XXX").b("X X").b("has_leather", a(caz.oM)).a($$0);
      kw.b(cju.mL).a('S', aks.i).a('B', cju.bX).b("SSS").b(" B ").b(" S ").b("has_book", a(caz.oY)).a($$0);
      kw.b(cju.cH).a('#', cju.m).a('X', caz.nL).b("X").b("#").b("has_cobblestone", a((cgw)cju.m)).a($$0);
      a($$0, caz.pu, cju.bG, "light_blue_dye");
      kx.a(caz.pu, 2)
         .c(caz.pC)
         .c(caz.pr)
         .b("light_blue_dye")
         .b("has_blue_dye", a(caz.pC))
         .b("has_white_dye", a(caz.pr))
         .a($$0, "light_blue_dye_from_blue_white_dye");
      a($$0, caz.pz, cju.bI, "light_gray_dye");
      kx.a(caz.pz, 2)
         .c(caz.py)
         .c(caz.pr)
         .b("light_gray_dye")
         .b("has_gray_dye", a(caz.py))
         .b("has_white_dye", a(caz.pr))
         .a($$0, "light_gray_dye_from_gray_white_dye");
      kx.a(caz.pz, 3)
         .c(caz.pG)
         .b(caz.pr, 2)
         .b("light_gray_dye")
         .b("has_white_dye", a(caz.pr))
         .b("has_black_dye", a(caz.pG))
         .a($$0, "light_gray_dye_from_black_white_dye");
      a($$0, caz.pz, cju.bN, "light_gray_dye");
      a($$0, caz.pz, cju.bL, "light_gray_dye");
      i($$0, cju.fX, caz.ne);
      kw.b(cju.qb).a('#', caz.nc).b("#").b("#").b("#").b("has_copper_ingot", a(caz.nc)).a($$0);
      kx.a(caz.pw, 2).c(caz.pE).c(caz.pr).b("has_green_dye", a(caz.pE)).b("has_white_dye", a(caz.pr)).a($$0);
      kw.b(cju.dp).a('A', cju.do).a('B', cju.ca).b("A").b("B").b("has_carved_pumpkin", a((cgw)cju.do)).a($$0);
      a($$0, caz.pt, cju.bH, "magenta_dye");
      kx.a(caz.pt, 4)
         .c(caz.pC)
         .b(caz.pF, 2)
         .c(caz.pr)
         .b("magenta_dye")
         .b("has_blue_dye", a(caz.pC))
         .b("has_rose_red", a(caz.pF))
         .b("has_white_dye", a(caz.pr))
         .a($$0, "magenta_dye_from_blue_red_white_dye");
      kx.a(caz.pt, 3)
         .c(caz.pC)
         .c(caz.pF)
         .c(caz.px)
         .b("magenta_dye")
         .b("has_pink_dye", a(caz.px))
         .b("has_blue_dye", a(caz.pC))
         .b("has_red_dye", a(caz.pF))
         .a($$0, "magenta_dye_from_blue_red_pink");
      a($$0, caz.pt, cju.hC, "magenta_dye", 2);
      kx.a(caz.pt, 2)
         .c(caz.pB)
         .c(caz.px)
         .b("magenta_dye")
         .b("has_pink_dye", a(caz.px))
         .b("has_purple_dye", a(caz.pB))
         .a($$0, "magenta_dye_from_purple_and_pink");
      kw.b(cju.jv).a('#', caz.qx).b("##").b("##").b("has_magma_cream", a(caz.qx)).a($$0);
      kx.b(caz.qx).c(caz.qw).c(caz.oZ).b("has_blaze_powder", a(caz.qw)).a($$0);
      kw.b(caz.sg).a('#', caz.oX).a('X', caz.pb).b("###").b("#X#").b("###").b("has_compass", a(caz.pb)).a($$0);
      kw.b(cju.eh).a('M', caz.qe).b("MMM").b("MMM").b("MMM").b("has_melon", a(caz.qe)).a($$0);
      kx.b(caz.qh).c(caz.qe).b("has_melon", a(caz.qe)).a($$0);
      kw.b(caz.mo).a('#', caz.na).b("# #").b("###").b("has_iron_ingot", a(caz.na)).a($$0);
      kx.b(cju.bY).c(cju.m).c(cju.em).b("mossy_cobblestone").b("has_vine", a((cgw)cju.em)).a($$0, a(cju.bY, cju.em));
      kx.b(cju.dQ).c(cju.dP).c(cju.em).b("mossy_stone_bricks").b("has_vine", a((cgw)cju.em)).a($$0, a(cju.dQ, cju.em));
      kx.b(cju.bY).c(cju.m).c(cju.qk).b("mossy_cobblestone").b("has_moss_block", a((cgw)cju.qk)).a($$0, a(cju.bY, cju.qk));
      kx.b(cju.dQ).c(cju.dP).c(cju.qk).b("mossy_stone_bricks").b("has_moss_block", a((cgw)cju.qk)).a($$0, a(cju.dQ, cju.qk));
      kx.b(caz.nN)
         .c(cju.bR)
         .c(cju.bS)
         .c(caz.nM)
         .b("has_mushroom_stew", a(caz.nN))
         .b("has_bowl", a(caz.nM))
         .b("has_brown_mushroom", a((cgw)cju.bR))
         .b("has_red_mushroom", a((cgw)cju.bS))
         .a($$0);
      kw.b(cju.eu).a('N', caz.st).b("NN").b("NN").b("has_netherbrick", a(caz.st)).a($$0);
      kw.b(cju.jw).a('#', caz.qr).b("###").b("###").b("###").b("has_nether_wart", a(caz.qr)).a($$0);
      kw.b(cju.aL).a('#', aks.b).a('X', caz.kK).b("###").b("#X#").b("###").b("has_redstone", a(caz.kK)).a($$0);
      kw.b(cju.jA).a('Q', caz.mX).a('R', caz.kK).a('#', cju.m).b("###").b("RRQ").b("###").b("has_quartz", a(caz.mX)).a($$0);
      a($$0, caz.ps, cju.bK, "orange_dye");
      kx.a(caz.ps, 2).c(caz.pF).c(caz.pv).b("orange_dye").b("has_red_dye", a(caz.pF)).b("has_yellow_dye", a(caz.pv)).a($$0, "orange_dye_from_red_yellow");
      kw.b(caz.ov).a('#', caz.nL).a('X', cdm.a(aks.a)).b("###").b("#X#").b("###").b("has_wool", a(aks.a)).a($$0);
      kw.a(caz.oX, 3).a('#', cju.db).b("###").b("has_reeds", a((cgw)cju.db)).a($$0);
      kw.a(cju.gg, 2)
         .a('#', cju.ge)
         .b("#")
         .b("#")
         .b("has_chiseled_quartz_block", a((cgw)cju.gf))
         .b("has_quartz_block", a((cgw)cju.ge))
         .b("has_quartz_pillar", a((cgw)cju.gg))
         .a($$0);
      kx.b(cju.hA).b(cju.cX, 9).b("has_ice", a((cgw)cju.cX)).a($$0);
      a($$0, caz.px, cju.hE, "pink_dye", 2);
      a($$0, caz.px, cju.bM, "pink_dye");
      kx.a(caz.px, 2).c(caz.pF).c(caz.pr).b("pink_dye").b("has_white_dye", a(caz.pr)).b("has_red_dye", a(caz.pF)).a($$0, "pink_dye_from_red_white_dye");
      kw.b(cju.bl).a('R', caz.kK).a('#', cju.m).a('T', aks.b).a('X', caz.na).b("TTT").b("#X#").b("#R#").b("has_redstone", a(caz.kK)).a($$0);
      c($$0, cju.dj, cju.di);
      kw.b(cju.gX).a('S', caz.su).b("SS").b("SS").b("has_prismarine_shard", a(caz.su)).a($$0);
      kw.b(cju.gY).a('S', caz.su).b("SSS").b("SSS").b("SSS").b("has_prismarine_shard", a(caz.su)).a($$0);
      kx.b(caz.sp).c(cju.de).c(caz.pJ).c(caz.pa).b("has_carved_pumpkin", a((cgw)cju.do)).b("has_pumpkin", a((cgw)cju.de)).a($$0);
      kx.a(caz.qg, 4).c(cju.de).b("has_pumpkin", a((cgw)cju.de)).a($$0);
      kx.a(caz.pB, 2).c(caz.pC).c(caz.pF).b("has_blue_dye", a(caz.pC)).b("has_red_dye", a(caz.pF)).a($$0);
      kw.b(cju.jB).a('#', cju.cg).a('-', caz.to).b("-").b("#").b("-").b("has_shulker_shell", a(caz.to)).a($$0);
      kw.a(cju.jl, 4).a('F', caz.td).b("FF").b("FF").b("has_chorus_fruit_popped", a(caz.td)).a($$0);
      kw.b(cju.jm).a('#', cju.iL).b("#").b("#").b("has_purpur_block", a((cgw)cju.jl)).a($$0);
      j(cju.iL, cdm.a(cju.jl, cju.jm)).a("has_purpur_block", a((cgw)cju.jl)).a($$0);
      k(cju.jn, cdm.a(cju.jl, cju.jm)).a("has_purpur_block", a((cgw)cju.jl)).a($$0);
      kw.b(cju.ge).a('#', caz.mX).b("##").b("##").b("has_quartz", a(caz.mX)).a($$0);
      kw.a(cju.ov, 4).a('#', cju.ge).b("##").b("##").b("has_quartz_block", a((cgw)cju.ge)).a($$0);
      j(cju.iI, cdm.a(cju.gf, cju.ge, cju.gg))
         .a("has_chiseled_quartz_block", a((cgw)cju.gf))
         .a("has_quartz_block", a((cgw)cju.ge))
         .a("has_quartz_pillar", a((cgw)cju.gg))
         .a($$0);
      k(cju.gh, cdm.a(cju.gf, cju.ge, cju.gg))
         .a("has_chiseled_quartz_block", a((cgw)cju.gf))
         .a("has_quartz_block", a((cgw)cju.ge))
         .a("has_quartz_pillar", a((cgw)cju.gg))
         .a($$0);
      kx.b(caz.sy).c(caz.se).c(caz.sx).c(caz.nM).c(caz.sc).c(cju.bR).b("rabbit_stew").b("has_cooked_rabbit", a(caz.sx)).a($$0, a(caz.sy, caz.cP));
      kx.b(caz.sy).c(caz.se).c(caz.sx).c(caz.nM).c(caz.sc).c(cju.bS).b("rabbit_stew").b("has_cooked_rabbit", a(caz.sx)).a($$0, a(caz.sy, caz.cQ));
      kw.a(cju.cy, 16).a('#', caz.nL).a('X', caz.na).b("X X").b("X#X").b("X X").b("has_minecart", a(caz.mo)).a($$0);
      x($$0, caz.kK, caz.kM);
      kw.b(cju.eI).a('R', caz.kK).a('G', cju.dm).b(" R ").b("RGR").b(" R ").b("has_glowstone", a((cgw)cju.dm)).a($$0);
      kw.b(cju.cT).a('#', caz.nL).a('X', caz.kK).b("X").b("#").b("has_redstone", a(caz.kK)).a($$0);
      a($$0, caz.pF, caz.te, "red_dye");
      a($$0, caz.pF, cju.bF, "red_dye");
      a($$0, caz.pF, cju.hD, "red_dye", 2);
      kx.b(caz.pF).c(cju.bJ).b("red_dye").b("has_red_flower", a((cgw)cju.bJ)).a($$0, "red_dye_from_tulip");
      kw.b(cju.jx).a('W', caz.qr).a('N', caz.st).b("NW").b("WN").b("has_nether_wart", a(caz.qr)).a($$0);
      kw.b(cju.in).a('#', cju.F).b("##").b("##").b("has_sand", a((cgw)cju.F)).a($$0);
      j(cju.iJ, cdm.a(cju.in, cju.io)).a("has_red_sandstone", a((cgw)cju.in)).a("has_chiseled_red_sandstone", a((cgw)cju.io)).a($$0);
      k(cju.iq, cdm.a(cju.in, cju.io, cju.ip))
         .a("has_red_sandstone", a((cgw)cju.in))
         .a("has_chiseled_red_sandstone", a((cgw)cju.io))
         .a("has_cut_red_sandstone", a((cgw)cju.ip))
         .a($$0);
      kw.b(cju.dr).a('#', cju.cT).a('X', caz.kK).a('I', cju.b).b("#X#").b("III").b("has_redstone_torch", a((cgw)cju.cT)).a($$0);
      kw.b(cju.aI).a('#', cju.E).b("##").b("##").b("has_sand", a((cgw)cju.E)).a($$0);
      j(cju.iA, cdm.a(cju.aI, cju.aJ)).a("has_sandstone", a((cgw)cju.aI)).a("has_chiseled_sandstone", a((cgw)cju.aJ)).a($$0);
      k(cju.eK, cdm.a(cju.aI, cju.aJ, cju.aK))
         .a("has_sandstone", a((cgw)cju.aI))
         .a("has_chiseled_sandstone", a((cgw)cju.aJ))
         .a("has_cut_sandstone", a((cgw)cju.aK))
         .a($$0);
      kw.b(cju.hg).a('S', caz.su).a('C', caz.sv).b("SCS").b("CCC").b("SCS").b("has_prismarine_crystals", a(caz.sv)).a($$0);
      kw.b(caz.qd).a('#', caz.na).b(" #").b("# ").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(caz.tm).a('W', aks.b).a('o', caz.na).b("WoW").b("WWW").b(" W ").b("has_iron_ingot", a(caz.na)).a($$0);
      x($$0, caz.oZ, caz.kR);
      d($$0, cju.ip, cju.in);
      d($$0, cju.aK, cju.aI);
      kw.b(cju.cY).a('#', caz.oL).b("##").b("##").b("has_snowball", a(caz.oL)).a($$0);
      kw.a(cju.cW, 6).a('#', cju.cY).b("###").b("has_snowball", a(caz.oL)).a($$0);
      kw.b(cju.mS).a('L', aks.q).a('S', caz.nL).a('#', aks.ad).b(" S ").b("S#S").b("LLL").b("has_stick", a(caz.nL)).b("has_soul_sand", a(aks.ad)).a($$0);
      kw.b(caz.qB).a('#', caz.qq).a('X', caz.qe).b("###").b("#X#").b("###").b("has_melon", a(caz.qe)).a($$0);
      kw.a(caz.tj, 2).a('#', caz.ph).a('X', caz.mR).b(" # ").b("#X#").b(" # ").b("has_glowstone_dust", a(caz.ph)).a($$0);
      kw.b(caz.pg).a('#', caz.mY).a('X', caz.nc).b(" # ").b(" X ").b(" X ").b("has_amethyst_shard", a(caz.mY)).a($$0);
      kw.a(caz.nL, 4).a('#', aks.b).b("#").b("#").c("sticks").b("has_planks", a(aks.b)).a($$0);
      kw.a(caz.nL, 1).a('#', cju.lK).b("#").b("#").c("sticks").b("has_bamboo", a((cgw)cju.lK)).a($$0, "stick_from_bamboo_item");
      kw.b(cju.be).a('P', cju.bl).a('S', caz.oZ).b("S").b("P").b("has_slime_ball", a(caz.oZ)).a($$0);
      kw.a(cju.dP, 4).a('#', cju.b).b("##").b("##").b("has_stone", a((cgw)cju.b)).a($$0);
      kw.b(caz.np).a('#', caz.nL).a('X', aks.as).b("XX").b("X#").b(" #").b("has_cobblestone", a(aks.as)).a($$0);
      j(cju.iF, cdm.a(cju.dP)).a("has_stone_bricks", a(aks.c)).a($$0);
      k(cju.eq, cdm.a(cju.dP)).a("has_stone_bricks", a(aks.c)).a($$0);
      kw.b(caz.nq).a('#', caz.nL).a('X', aks.as).b("XX").b(" #").b(" #").b("has_cobblestone", a(aks.as)).a($$0);
      kw.b(caz.no).a('#', caz.nL).a('X', aks.as).b("XXX").b(" # ").b(" # ").b("has_cobblestone", a(aks.as)).a($$0);
      kw.b(caz.nn).a('#', caz.nL).a('X', aks.as).b("X").b("#").b("#").b("has_cobblestone", a(aks.as)).a($$0);
      j($$0, cju.iz, cju.iM);
      kw.b(caz.nm).a('#', caz.nL).a('X', aks.as).b("X").b("X").b("#").b("has_cobblestone", a(aks.as)).a($$0);
      kw.b(cju.bn).a('#', caz.nO).b("##").b("##").b("has_string", a(caz.nO)).a($$0, a(cju.bn, caz.nO));
      a($$0, caz.pJ, cju.db, "sugar");
      kx.a(caz.pJ, 3).c(caz.uq).b("sugar").b("has_honey_bottle", a(caz.uq)).a($$0, a(caz.pJ, caz.uq));
      kw.b(cju.nO).a('H', caz.gH).a('R', caz.kK).b(" R ").b("RHR").b(" R ").b("has_redstone", a(caz.kK)).b("has_hay_block", a((cgw)cju.hh)).a($$0);
      kw.b(cju.bW).a('#', cdm.a(cju.E, cju.F)).a('X', caz.nQ).b("X#X").b("#X#").b("X#X").b("has_gunpowder", a(caz.nQ)).a($$0);
      kx.b(caz.mr).c(cju.bW).c(caz.mo).b("has_minecart", a(caz.mo)).a($$0);
      kw.a(cju.ca, 4).a('#', caz.nL).a('X', cdm.a(caz.mS, caz.mT)).b("X").b("#").b("has_stone_pickaxe", a(caz.no)).a($$0);
      kw.a(cju.dk, 4).a('X', cdm.a(caz.mS, caz.mT)).a('#', caz.nL).a('S', aks.ad).b("X").b("#").b("S").b("has_soul_sand", a(aks.ad)).a($$0);
      kw.b(cju.mP).a('#', caz.dO).a('X', caz.tp).b("XXX").b("X#X").b("XXX").b("has_iron_nugget", a(caz.tp)).b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(cju.mQ).a('#', caz.eA).a('X', caz.tp).b("XXX").b("X#X").b("XXX").b("has_soul_torch", a(caz.eA)).a($$0);
      kx.b(cju.fW).c(cju.cg).c(cju.eO).b("has_tripwire_hook", a((cgw)cju.eO)).a($$0);
      kw.a(cju.eO, 2).a('#', aks.b).a('S', caz.nL).a('I', caz.na).b("I").b("S").b("#").b("has_string", a(caz.nO)).a($$0);
      kw.b(caz.mM).a('X', caz.mN).b("XXX").b("X X").b("has_scute", a(caz.mN)).a($$0);
      kx.a(caz.nS, 9).c(cju.hh).b("has_hay_block", a((cgw)cju.hh)).a($$0);
      kx.b(caz.pr).c(caz.pH).b("white_dye").b("has_bone_meal", a(caz.pH)).a($$0);
      a($$0, caz.pr, cju.bQ, "white_dye");
      kw.b(caz.nk).a('#', caz.nL).a('X', aks.b).b("XX").b("X#").b(" #").b("has_stick", a(caz.nL)).a($$0);
      kw.b(caz.nl).a('#', caz.nL).a('X', aks.b).b("XX").b(" #").b(" #").b("has_stick", a(caz.nL)).a($$0);
      kw.b(caz.nj).a('#', caz.nL).a('X', aks.b).b("XXX").b(" # ").b(" # ").b("has_stick", a(caz.nL)).a($$0);
      kw.b(caz.ni).a('#', caz.nL).a('X', aks.b).b("X").b("#").b("#").b("has_stick", a(caz.nL)).a($$0);
      kw.b(caz.nh).a('#', caz.nL).a('X', aks.b).b("X").b("X").b("#").b("has_stick", a(caz.nL)).a($$0);
      kx.b(caz.rX).c(caz.oY).c(caz.po).c(caz.nP).b("has_book", a(caz.oY)).a($$0);
      a($$0, caz.pv, cju.bE, "yellow_dye");
      a($$0, caz.pv, cju.hB, "yellow_dye", 2);
      x($$0, caz.qf, caz.oW);
      kw.b(cju.lI).a('#', caz.tK).a('X', caz.tL).b("###").b("#X#").b("###").b("has_nautilus_core", a(caz.tL)).b("has_nautilus_shell", a(caz.tK)).a($$0);
      b($$0, cju.ms, cju.in);
      b($$0, cju.mv, cju.dP);
      b($$0, cju.mA, cju.aI);
      kx.b(caz.tQ).c(caz.oX).c(caz.sm).b("has_creeper_head", a(caz.sm)).a($$0);
      kx.b(caz.tR).c(caz.oX).c(caz.sj).b("has_wither_skeleton_skull", a(caz.sj)).a($$0);
      kx.b(caz.tP).c(caz.oX).c(cju.bN).b("has_oxeye_daisy", a((cgw)cju.bN)).a($$0);
      kx.b(caz.tS).c(caz.oX).c(caz.ox).b("has_enchanted_golden_apple", a(caz.ox)).a($$0);
      kw.a(cju.mD, 6).a('~', caz.nO).a('I', cju.lK).b("I~I").b("I I").b("I I").b("has_bamboo", a((cgw)cju.lK)).a($$0);
      kw.b(cju.mK).a('I', caz.nL).a('-', cju.iy).a('#', aks.b).b("I-I").b("# #").b("has_stone_slab", a((cgw)cju.iy)).a($$0);
      kw.b(cju.mH).a('#', cju.iM).a('X', cju.co).a('I', caz.na).b("III").b("IXI").b("###").b("has_smooth_stone", a((cgw)cju.iM)).a($$0);
      kw.b(cju.mG).a('#', aks.q).a('X', cju.co).b(" # ").b("#X#").b(" # ").b("has_furnace", a((cgw)cju.co)).a($$0);
      kw.b(cju.mI).a('#', aks.b).a('@', caz.oX).b("@@").b("##").b("##").b("has_paper", a(caz.oX)).a($$0);
      kw.b(cju.mM).a('#', aks.b).a('@', caz.na).b("@@").b("##").b("##").b("has_iron_ingot", a(caz.na)).a($$0);
      kw.b(cju.mJ).a('#', aks.b).a('@', caz.os).b("@@").b("##").b("##").b("has_flint", a(caz.os)).a($$0);
      kw.b(cju.mN).a('I', caz.na).a('#', cju.b).b(" I ").b("###").b("has_stone", a((cgw)cju.b)).a($$0);
      kw.b(cju.ob).a('S', caz.eM).a('#', caz.nf).b("SSS").b("S#S").b("SSS").b("has_netherite_ingot", a(caz.nf)).a($$0);
      b($$0, caz.nf, caz.au, "netherite_ingot_from_netherite_block", "netherite_ingot");
      kx.b(caz.nf).b(caz.ng, 4).b(caz.ne, 4).b("netherite_ingot").b("has_netherite_scrap", a(caz.ng)).a($$0);
      kw.b(cju.nW).a('O', cju.nV).a('G', cju.dm).b("OOO").b("GGG").b("OOO").b("has_obsidian", a((cgw)cju.nV)).a($$0);
      kw.b(cju.ef).a('I', caz.na).a('N', caz.tp).b("N").b("I").b("N").b("has_iron_nugget", a(caz.tp)).b("has_iron_ingot", a(caz.na)).a($$0);
      kw.a(cju.pm, 2).a('G', cju.aD).a('S', caz.mY).b(" S ").b("SGS").b(" S ").b("has_amethyst_shard", a(caz.mY)).a($$0);
      kw.b(cju.pe).a('S', caz.mY).b("SS").b("SS").b("has_amethyst_shard", a(caz.mY)).a($$0);
      kw.b(caz.pc).a('C', caz.pb).a('S', caz.vh).b("SSS").b("SCS").b("SSS").b("has_echo_shard", a(caz.vh)).a($$0);
      kw.b(caz.tF).a('S', caz.tH).b("SSS").b("SSS").b("SSS").b("has_disc_fragment_5", a(caz.tH)).a($$0);
      la.a(cdr.c).a($$0, "armor_dye");
      la.a(cdr.k).a($$0, "banner_duplicate");
      la.a(cdr.d).a($$0, "book_cloning");
      la.a(cdr.g).a($$0, "firework_rocket");
      la.a(cdr.h).a($$0, "firework_star");
      la.a(cdr.i).a($$0, "firework_star_fade");
      la.a(cdr.e).a($$0, "map_cloning");
      la.a(cdr.f).a($$0, "map_extending");
      la.a(cdr.o).a($$0, "repair_item");
      la.a(cdr.l).a($$0, "shield_decoration");
      la.a(cdr.m).a($$0, "shulker_box_coloring");
      la.a(cdr.j).a($$0, "tipped_arrow");
      la.a(cdr.n).a($$0, "suspicious_stew");
      ky.c(cdm.a(caz.sd), caz.se, 0.35F, 200).b("has_potato", a(caz.sd)).a($$0);
      ky.c(cdm.a(caz.oV), caz.oU, 0.3F, 200).b("has_clay_ball", a(caz.oV)).a($$0);
      ky.c(cdm.a(aks.o), caz.mT, 0.15F, 200).b("has_log", a(aks.o)).a($$0);
      ky.c(cdm.a(caz.tc), caz.td, 0.1F, 200).b("has_chorus_fruit", a(caz.tc)).a($$0);
      ky.c(cdm.a(caz.qi), caz.qj, 0.35F, 200).b("has_beef", a(caz.qi)).a($$0);
      ky.c(cdm.a(caz.qk), caz.ql, 0.35F, 200).b("has_chicken", a(caz.qk)).a($$0);
      ky.c(cdm.a(caz.pi), caz.pm, 0.35F, 200).b("has_cod", a(caz.pi)).a($$0);
      ky.c(cdm.a(cju.kO), caz.qf, 0.1F, 200).b("has_kelp", a((cgw)cju.kO)).a($$0, e(caz.qf));
      ky.c(cdm.a(caz.pj), caz.pn, 0.35F, 200).b("has_salmon", a(caz.pj)).a($$0);
      ky.c(cdm.a(caz.sJ), caz.sK, 0.35F, 200).b("has_mutton", a(caz.sJ)).a($$0);
      ky.c(cdm.a(caz.ot), caz.ou, 0.35F, 200).b("has_porkchop", a(caz.ot)).a($$0);
      ky.c(cdm.a(caz.sw), caz.sx, 0.35F, 200).b("has_rabbit", a(caz.sw)).a($$0);
      a($$0, d, caz.mS, 0.1F, 200, "coal");
      a($$0, e, caz.na, 0.7F, 200, "iron_ingot");
      a($$0, f, caz.nc, 0.7F, 200, "copper_ingot");
      a($$0, g, caz.ne, 1.0F, 200, "gold_ingot");
      a($$0, h, caz.mU, 1.0F, 200, "diamond");
      a($$0, i, caz.mW, 0.2F, 200, "lapis_lazuli");
      a($$0, j, caz.kK, 0.7F, 200, "redstone");
      a($$0, k, caz.mV, 1.0F, 200, "emerald");
      x($$0, caz.mZ, caz.al);
      x($$0, caz.nb, caz.am);
      x($$0, caz.nd, caz.an);
      ky.c(cdm.a(aks.C), cju.aD.l(), 0.1F, 200).b("has_sand", a(aks.C)).a($$0);
      ky.c(cdm.a(cju.lG), caz.pw, 0.1F, 200).b("has_sea_pickle", a((cgw)cju.lG)).a($$0, e(caz.pw));
      ky.c(cdm.a(cju.cZ.l()), caz.pE, 1.0F, 200).b("has_cactus", a((cgw)cju.cZ)).a($$0);
      ky.c(cdm.a(caz.nt, caz.ns, caz.nu, caz.nv, caz.nr, caz.ok, caz.ol, caz.om, caz.on, caz.sD), caz.qq, 0.1F, 200)
         .b("has_golden_pickaxe", a(caz.nt))
         .b("has_golden_shovel", a(caz.ns))
         .b("has_golden_axe", a(caz.nu))
         .b("has_golden_hoe", a(caz.nv))
         .b("has_golden_sword", a(caz.nr))
         .b("has_golden_helmet", a(caz.ok))
         .b("has_golden_chestplate", a(caz.ol))
         .b("has_golden_leggings", a(caz.om))
         .b("has_golden_boots", a(caz.on))
         .b("has_golden_horse_armor", a(caz.sD))
         .a($$0, e(caz.qq));
      ky.c(cdm.a(caz.ny, caz.nx, caz.nz, caz.nA, caz.nw, caz.oc, caz.od, caz.oe, caz.of, caz.sC, caz.nY, caz.nZ, caz.oa, caz.ob), caz.tp, 0.1F, 200)
         .b("has_iron_pickaxe", a(caz.ny))
         .b("has_iron_shovel", a(caz.nx))
         .b("has_iron_axe", a(caz.nz))
         .b("has_iron_hoe", a(caz.nA))
         .b("has_iron_sword", a(caz.nw))
         .b("has_iron_helmet", a(caz.oc))
         .b("has_iron_chestplate", a(caz.od))
         .b("has_iron_leggings", a(caz.oe))
         .b("has_iron_boots", a(caz.of))
         .b("has_iron_horse_armor", a(caz.sC))
         .b("has_chainmail_helmet", a(caz.nY))
         .b("has_chainmail_chestplate", a(caz.nZ))
         .b("has_chainmail_leggings", a(caz.oa))
         .b("has_chainmail_boots", a(caz.ob))
         .a($$0, e(caz.tp));
      ky.c(cdm.a(cju.da), cju.hy.l(), 0.35F, 200).b("has_clay_block", a((cgw)cju.da)).a($$0);
      ky.c(cdm.a(cju.df), caz.st, 0.1F, 200).b("has_netherrack", a((cgw)cju.df)).a($$0);
      ky.c(cdm.a(cju.gc), caz.mX, 0.2F, 200).b("has_nether_quartz_ore", a((cgw)cju.gc)).a($$0);
      ky.c(cdm.a(cju.aC), cju.aB.l(), 0.15F, 200).b("has_wet_sponge", a((cgw)cju.aC)).a($$0);
      ky.c(cdm.a(cju.m), cju.b.l(), 0.1F, 200).b("has_cobblestone", a((cgw)cju.m)).a($$0);
      ky.c(cdm.a(cju.b), cju.iM.l(), 0.1F, 200).b("has_stone", a((cgw)cju.b)).a($$0);
      ky.c(cdm.a(cju.aI), cju.iN.l(), 0.1F, 200).b("has_sandstone", a((cgw)cju.aI)).a($$0);
      ky.c(cdm.a(cju.in), cju.iP.l(), 0.1F, 200).b("has_red_sandstone", a((cgw)cju.in)).a($$0);
      ky.c(cdm.a(cju.ge), cju.iO.l(), 0.1F, 200).b("has_quartz_block", a((cgw)cju.ge)).a($$0);
      ky.c(cdm.a(cju.dP), cju.dR.l(), 0.1F, 200).b("has_stone_bricks", a((cgw)cju.dP)).a($$0);
      ky.c(cdm.a(cju.gz), cju.kh.l(), 0.1F, 200).b("has_black_terracotta", a((cgw)cju.gz)).a($$0);
      ky.c(cdm.a(cju.gv), cju.kd.l(), 0.1F, 200).b("has_blue_terracotta", a((cgw)cju.gv)).a($$0);
      ky.c(cdm.a(cju.gw), cju.ke.l(), 0.1F, 200).b("has_brown_terracotta", a((cgw)cju.gw)).a($$0);
      ky.c(cdm.a(cju.gt), cju.kb.l(), 0.1F, 200).b("has_cyan_terracotta", a((cgw)cju.gt)).a($$0);
      ky.c(cdm.a(cju.gr), cju.jZ.l(), 0.1F, 200).b("has_gray_terracotta", a((cgw)cju.gr)).a($$0);
      ky.c(cdm.a(cju.gx), cju.kf.l(), 0.1F, 200).b("has_green_terracotta", a((cgw)cju.gx)).a($$0);
      ky.c(cdm.a(cju.gn), cju.jV.l(), 0.1F, 200).b("has_light_blue_terracotta", a((cgw)cju.gn)).a($$0);
      ky.c(cdm.a(cju.gs), cju.ka.l(), 0.1F, 200).b("has_light_gray_terracotta", a((cgw)cju.gs)).a($$0);
      ky.c(cdm.a(cju.gp), cju.jX.l(), 0.1F, 200).b("has_lime_terracotta", a((cgw)cju.gp)).a($$0);
      ky.c(cdm.a(cju.gm), cju.jU.l(), 0.1F, 200).b("has_magenta_terracotta", a((cgw)cju.gm)).a($$0);
      ky.c(cdm.a(cju.gl), cju.jT.l(), 0.1F, 200).b("has_orange_terracotta", a((cgw)cju.gl)).a($$0);
      ky.c(cdm.a(cju.gq), cju.jY.l(), 0.1F, 200).b("has_pink_terracotta", a((cgw)cju.gq)).a($$0);
      ky.c(cdm.a(cju.gu), cju.kc.l(), 0.1F, 200).b("has_purple_terracotta", a((cgw)cju.gu)).a($$0);
      ky.c(cdm.a(cju.gy), cju.kg.l(), 0.1F, 200).b("has_red_terracotta", a((cgw)cju.gy)).a($$0);
      ky.c(cdm.a(cju.gk), cju.jS.l(), 0.1F, 200).b("has_white_terracotta", a((cgw)cju.gk)).a($$0);
      ky.c(cdm.a(cju.go), cju.jW.l(), 0.1F, 200).b("has_yellow_terracotta", a((cgw)cju.go)).a($$0);
      ky.c(cdm.a(cju.nU), caz.ng, 2.0F, 200).b("has_ancient_debris", a((cgw)cju.nU)).a($$0);
      ky.c(cdm.a(cju.di), cju.qM, 0.1F, 200).b("has_basalt", a((cgw)cju.di)).a($$0);
      ky.c(cdm.a(cju.qs), cju.qr, 0.1F, 200).b("has_cobbled_deepslate", a((cgw)cju.qs)).a($$0);
      b($$0, d, caz.mS, 0.1F, 100, "coal");
      b($$0, e, caz.na, 0.7F, 100, "iron_ingot");
      b($$0, f, caz.nc, 0.7F, 100, "copper_ingot");
      b($$0, g, caz.ne, 1.0F, 100, "gold_ingot");
      b($$0, h, caz.mU, 1.0F, 100, "diamond");
      b($$0, i, caz.mW, 0.2F, 100, "lapis_lazuli");
      b($$0, j, caz.kK, 0.7F, 100, "redstone");
      b($$0, k, caz.mV, 1.0F, 100, "emerald");
      ky.b(cdm.a(cju.gc), caz.mX, 0.2F, 100).b("has_nether_quartz_ore", a((cgw)cju.gc)).a($$0, f(caz.mX));
      ky.b(cdm.a(caz.nt, caz.ns, caz.nu, caz.nv, caz.nr, caz.ok, caz.ol, caz.om, caz.on, caz.sD), caz.qq, 0.1F, 100)
         .b("has_golden_pickaxe", a(caz.nt))
         .b("has_golden_shovel", a(caz.ns))
         .b("has_golden_axe", a(caz.nu))
         .b("has_golden_hoe", a(caz.nv))
         .b("has_golden_sword", a(caz.nr))
         .b("has_golden_helmet", a(caz.ok))
         .b("has_golden_chestplate", a(caz.ol))
         .b("has_golden_leggings", a(caz.om))
         .b("has_golden_boots", a(caz.on))
         .b("has_golden_horse_armor", a(caz.sD))
         .a($$0, f(caz.qq));
      ky.b(cdm.a(caz.ny, caz.nx, caz.nz, caz.nA, caz.nw, caz.oc, caz.od, caz.oe, caz.of, caz.sC, caz.nY, caz.nZ, caz.oa, caz.ob), caz.tp, 0.1F, 100)
         .b("has_iron_pickaxe", a(caz.ny))
         .b("has_iron_shovel", a(caz.nx))
         .b("has_iron_axe", a(caz.nz))
         .b("has_iron_hoe", a(caz.nA))
         .b("has_iron_sword", a(caz.nw))
         .b("has_iron_helmet", a(caz.oc))
         .b("has_iron_chestplate", a(caz.od))
         .b("has_iron_leggings", a(caz.oe))
         .b("has_iron_boots", a(caz.of))
         .b("has_iron_horse_armor", a(caz.sC))
         .b("has_chainmail_helmet", a(caz.nY))
         .b("has_chainmail_chestplate", a(caz.nZ))
         .b("has_chainmail_leggings", a(caz.oa))
         .b("has_chainmail_boots", a(caz.ob))
         .a($$0, f(caz.tp));
      ky.b(cdm.a(cju.nU), caz.ng, 2.0F, 100).b("has_ancient_debris", a((cgw)cju.nU)).a($$0, f(caz.ng));
      a($$0, "smoking", cdr.r, 100);
      a($$0, "campfire_cooking", cdr.s, 600);
      a($$0, cju.iy, cju.b, 2);
      v($$0, cju.lV, cju.b);
      v($$0, cju.dP, cju.b);
      a($$0, cju.iF, cju.b, 2);
      v($$0, cju.eq, cju.b);
      kz.a(cdm.a(cju.b), cju.dS).b("has_stone", a((cgw)cju.b)).a($$0, "chiseled_stone_bricks_stone_from_stonecutting");
      kz.a(cdm.a(cju.b), cju.mv).b("has_stone", a((cgw)cju.b)).a($$0, "stone_brick_walls_from_stone_stonecutting");
      v($$0, cju.aK, cju.aI);
      a($$0, cju.iA, cju.aI, 2);
      a($$0, cju.iB, cju.aI, 2);
      a($$0, cju.iB, cju.aK, 2);
      v($$0, cju.eK, cju.aI);
      v($$0, cju.mA, cju.aI);
      v($$0, cju.aJ, cju.aI);
      v($$0, cju.ip, cju.in);
      a($$0, cju.iJ, cju.in, 2);
      a($$0, cju.iK, cju.in, 2);
      a($$0, cju.iK, cju.ip, 2);
      v($$0, cju.iq, cju.in);
      v($$0, cju.ms, cju.in);
      v($$0, cju.io, cju.in);
      kz.a(cdm.a(cju.ge), cju.iI, 2).b("has_quartz_block", a((cgw)cju.ge)).a($$0, "quartz_slab_from_stonecutting");
      v($$0, cju.gh, cju.ge);
      v($$0, cju.gg, cju.ge);
      v($$0, cju.gf, cju.ge);
      v($$0, cju.ov, cju.ge);
      v($$0, cju.cz, cju.m);
      a($$0, cju.iD, cju.m, 2);
      v($$0, cju.eW, cju.m);
      a($$0, cju.iF, cju.dP, 2);
      v($$0, cju.eq, cju.dP);
      kz.a(cdm.a(cju.dP), cju.mv).b("has_stone_bricks", a((cgw)cju.dP)).a($$0, "stone_brick_wall_from_stone_bricks_stonecutting");
      v($$0, cju.dS, cju.dP);
      a($$0, cju.iE, cju.bV, 2);
      v($$0, cju.ep, cju.bV);
      v($$0, cju.mq, cju.bV);
      a($$0, cju.iG, cju.dU, 2);
      v($$0, cju.er, cju.dU);
      v($$0, cju.mw, cju.dU);
      a($$0, cju.iH, cju.eu, 2);
      v($$0, cju.ew, cju.eu);
      v($$0, cju.mx, cju.eu);
      v($$0, cju.ot, cju.eu);
      a($$0, cju.mn, cju.jx, 2);
      v($$0, cju.ma, cju.jx);
      v($$0, cju.mz, cju.jx);
      a($$0, cju.iL, cju.jl, 2);
      v($$0, cju.jn, cju.jl);
      v($$0, cju.jm, cju.jl);
      a($$0, cju.hd, cju.gX, 2);
      v($$0, cju.ha, cju.gX);
      v($$0, cju.mr, cju.gX);
      kz.a(cdm.a(cju.gY), cju.he, 2).b("has_prismarine_brick", a((cgw)cju.gY)).a($$0, "prismarine_brick_slab_from_prismarine_stonecutting");
      kz.a(cdm.a(cju.gY), cju.hb).b("has_prismarine_brick", a((cgw)cju.gY)).a($$0, "prismarine_brick_stairs_from_prismarine_stonecutting");
      a($$0, cju.hf, cju.gZ, 2);
      v($$0, cju.hc, cju.gZ);
      a($$0, cju.mm, cju.g, 2);
      v($$0, cju.lZ, cju.g);
      v($$0, cju.my, cju.g);
      v($$0, cju.h, cju.g);
      a($$0, cju.mo, cju.g, 2);
      v($$0, cju.mb, cju.g);
      a($$0, cju.mo, cju.h, 2);
      v($$0, cju.mb, cju.h);
      v($$0, cju.dj, cju.di);
      a($$0, cju.ml, cju.c, 2);
      v($$0, cju.lY, cju.c);
      v($$0, cju.mu, cju.c);
      v($$0, cju.d, cju.c);
      a($$0, cju.md, cju.c, 2);
      v($$0, cju.lP, cju.c);
      a($$0, cju.md, cju.d, 2);
      v($$0, cju.lP, cju.d);
      a($$0, cju.mp, cju.e, 2);
      v($$0, cju.mc, cju.e);
      v($$0, cju.mC, cju.e);
      v($$0, cju.f, cju.e);
      a($$0, cju.mg, cju.e, 2);
      v($$0, cju.lS, cju.e);
      a($$0, cju.mg, cju.f, 2);
      v($$0, cju.lS, cju.f);
      kz.a(cdm.a(cju.dQ), cju.mf, 2).b("has_mossy_stone_bricks", a((cgw)cju.dQ)).a($$0, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      kz.a(cdm.a(cju.dQ), cju.lR).b("has_mossy_stone_bricks", a((cgw)cju.dQ)).a($$0, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      kz.a(cdm.a(cju.dQ), cju.mt).b("has_mossy_stone_bricks", a((cgw)cju.dQ)).a($$0, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      a($$0, cju.mh, cju.bY, 2);
      v($$0, cju.lT, cju.bY);
      v($$0, cju.eX, cju.bY);
      a($$0, cju.mj, cju.iN, 2);
      v($$0, cju.lW, cju.iN);
      a($$0, cju.me, cju.iP, 2);
      v($$0, cju.lQ, cju.iP);
      a($$0, cju.mk, cju.iO, 2);
      v($$0, cju.lX, cju.iO);
      kz.a(cdm.a(cju.jo), cju.mi, 2).b("has_end_stone_brick", a((cgw)cju.jo)).a($$0, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      kz.a(cdm.a(cju.jo), cju.lU).b("has_end_stone_brick", a((cgw)cju.jo)).a($$0, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      kz.a(cdm.a(cju.jo), cju.mB).b("has_end_stone_brick", a((cgw)cju.jo)).a($$0, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      v($$0, cju.jo, cju.eG);
      a($$0, cju.mi, cju.eG, 2);
      v($$0, cju.lU, cju.eG);
      v($$0, cju.mB, cju.eG);
      a($$0, cju.iz, cju.iM, 2);
      a($$0, cju.of, cju.oc, 2);
      v($$0, cju.od, cju.oc);
      v($$0, cju.oe, cju.oc);
      v($$0, cju.og, cju.oc);
      v($$0, cju.os, cju.oc);
      a($$0, cju.op, cju.oc, 2);
      v($$0, cju.oo, cju.oc);
      v($$0, cju.oj, cju.oc);
      v($$0, cju.oh, cju.oc);
      a($$0, cju.ok, cju.oc, 2);
      v($$0, cju.ol, cju.oc);
      v($$0, cju.om, cju.oc);
      a($$0, cju.op, cju.og, 2);
      v($$0, cju.oo, cju.og);
      v($$0, cju.oh, cju.og);
      v($$0, cju.os, cju.og);
      a($$0, cju.ok, cju.og, 2);
      v($$0, cju.ol, cju.og);
      v($$0, cju.om, cju.og);
      v($$0, cju.oj, cju.og);
      a($$0, cju.ok, cju.oh, 2);
      v($$0, cju.ol, cju.oh);
      v($$0, cju.om, cju.oh);
      a($$0, cju.pK, cju.pC, 2);
      v($$0, cju.pG, cju.pC);
      a($$0, cju.pJ, cju.pB, 2);
      v($$0, cju.pF, cju.pB);
      a($$0, cju.pI, cju.pA, 2);
      v($$0, cju.pE, cju.pA);
      a($$0, cju.pH, cju.pz, 2);
      v($$0, cju.pD, cju.pz);
      a($$0, cju.qa, cju.pS, 2);
      v($$0, cju.pW, cju.pS);
      a($$0, cju.pZ, cju.pR, 2);
      v($$0, cju.pV, cju.pR);
      a($$0, cju.pY, cju.pQ, 2);
      v($$0, cju.pU, cju.pQ);
      a($$0, cju.pX, cju.pP, 2);
      v($$0, cju.pT, cju.pP);
      a($$0, cju.pC, cju.pw, 4);
      a($$0, cju.pG, cju.pw, 4);
      a($$0, cju.pK, cju.pw, 8);
      a($$0, cju.pB, cju.pv, 4);
      a($$0, cju.pF, cju.pv, 4);
      a($$0, cju.pJ, cju.pv, 8);
      a($$0, cju.pA, cju.pu, 4);
      a($$0, cju.pE, cju.pu, 4);
      a($$0, cju.pI, cju.pu, 8);
      a($$0, cju.pz, cju.pt, 4);
      a($$0, cju.pD, cju.pt, 4);
      a($$0, cju.pH, cju.pt, 8);
      a($$0, cju.pS, cju.pL, 4);
      a($$0, cju.pW, cju.pL, 4);
      a($$0, cju.qa, cju.pL, 8);
      a($$0, cju.pR, cju.pN, 4);
      a($$0, cju.pV, cju.pN, 4);
      a($$0, cju.pZ, cju.pN, 8);
      a($$0, cju.pQ, cju.pM, 4);
      a($$0, cju.pU, cju.pM, 4);
      a($$0, cju.pY, cju.pM, 8);
      a($$0, cju.pP, cju.pO, 4);
      a($$0, cju.pT, cju.pO, 4);
      a($$0, cju.pX, cju.pO, 8);
      a($$0, cju.qu, cju.qs, 2);
      v($$0, cju.qt, cju.qs);
      v($$0, cju.qv, cju.qs);
      v($$0, cju.qI, cju.qs);
      v($$0, cju.qw, cju.qs);
      a($$0, cju.qy, cju.qs, 2);
      v($$0, cju.qx, cju.qs);
      v($$0, cju.qz, cju.qs);
      v($$0, cju.qE, cju.qs);
      a($$0, cju.qG, cju.qs, 2);
      v($$0, cju.qF, cju.qs);
      v($$0, cju.qH, cju.qs);
      v($$0, cju.qA, cju.qs);
      a($$0, cju.qC, cju.qs, 2);
      v($$0, cju.qB, cju.qs);
      v($$0, cju.qD, cju.qs);
      a($$0, cju.qy, cju.qw, 2);
      v($$0, cju.qx, cju.qw);
      v($$0, cju.qz, cju.qw);
      v($$0, cju.qE, cju.qw);
      a($$0, cju.qG, cju.qw, 2);
      v($$0, cju.qF, cju.qw);
      v($$0, cju.qH, cju.qw);
      v($$0, cju.qA, cju.qw);
      a($$0, cju.qC, cju.qw, 2);
      v($$0, cju.qB, cju.qw);
      v($$0, cju.qD, cju.qw);
      a($$0, cju.qG, cju.qE, 2);
      v($$0, cju.qF, cju.qE);
      v($$0, cju.qH, cju.qE);
      v($$0, cju.qA, cju.qE);
      a($$0, cju.qC, cju.qE, 2);
      v($$0, cju.qB, cju.qE);
      v($$0, cju.qD, cju.qE);
      a($$0, cju.qC, cju.qA, 2);
      v($$0, cju.qB, cju.qA);
      v($$0, cju.qD, cju.qA);
      a($$0, caz.oh, caz.op);
      a($$0, caz.oi, caz.oq);
      a($$0, caz.og, caz.oo);
      a($$0, caz.oj, caz.or);
      a($$0, caz.nB, caz.nG);
      a($$0, caz.nE, caz.nJ);
      a($$0, caz.nD, caz.nI);
      a($$0, caz.nF, caz.nK);
      a($$0, caz.nC, caz.nH);
   }

   private static void a(Consumer<kt> $$0, cgw $$1, cgw $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   private static void a(Consumer<kt> $$0, cgw $$1, cgw $$2, @Nullable String $$3, int $$4) {
      kx.a($$1, $$4).c($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   private static void a(Consumer<kt> $$0, List<cgw> $$1, cgw $$2, float $$3, int $$4, String $$5) {
      a($$0, cdr.p, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   private static void b(Consumer<kt> $$0, List<cgw> $$1, cgw $$2, float $$3, int $$4, String $$5) {
      a($$0, cdr.q, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private static void a(Consumer<kt> $$0, cdy<?> $$1, List<cgw> $$2, cgw $$3, float $$4, int $$5, String $$6, String $$7) {
      for(cgw $$8 : $$2) {
         ky.a(cdm.a($$8), $$3, $$4, $$5, $$1).b($$6).b(b($$8), a($$8)).a($$0, c($$3) + $$7 + "_" + c($$8));
      }

   }

   private static void a(Consumer<kt> $$0, cat $$1, cat $$2) {
      lb.a(cdm.a($$1), cdm.a(caz.nf), $$2).a("has_netherite_ingot", a(caz.nf)).a($$0, c($$2) + "_smithing");
   }

   private static void a(Consumer<kt> $$0, cgw $$1, akz<cat> $$2) {
      kx.a($$1, 4).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   private static void b(Consumer<kt> $$0, cgw $$1, akz<cat> $$2) {
      kx.a($$1, 4).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   private static void f(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.a($$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   private static void g(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.b($$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cju.C)).a($$0);
   }

   private static void h(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kx.b($$1).c(cju.cg).c($$2).b("chest_boat").b("has_boat", a(aks.ai)).a($$0);
   }

   private static ku e(cgw $$0, cdm $$1) {
      return kx.b($$0).a($$1);
   }

   private static ku f(cgw $$0, cdm $$1) {
      return kw.a($$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static ku g(cgw $$0, cdm $$1) {
      int $$2 = $$0 == cju.ev ? 6 : 3;
      cat $$3 = $$0 == cju.ev ? caz.st : caz.nL;
      return kw.a($$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static ku h(cgw $$0, cdm $$1) {
      return kw.b($$0).a('#', caz.nL).a('W', $$1).b("#W#").b("#W#");
   }

   private static void i(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      i($$1, cdm.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static ku i(cgw $$0, cdm $$1) {
      return kw.b($$0).a('#', $$1).b("##");
   }

   private static void j(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      j($$1, cdm.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static ku j(cgw $$0, cdm $$1) {
      return kw.a($$0, 6).a('#', $$1).b("###");
   }

   private static ku k(cgw $$0, cdm $$1) {
      return kw.a($$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static ku l(cgw $$0, cdm $$1) {
      return kw.a($$0, 2).a('#', $$1).b("###").b("###");
   }

   private static ku m(cgw $$0, cdm $$1) {
      return kw.a($$0, 3).c("sign").a('#', $$1).a('X', caz.nL).b("###").b("###").b(" X ");
   }

   private static void k(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kx.b($$1).c($$2).c(cju.bn).b("wool").b("has_white_wool", a((cgw)cju.bn)).a($$0);
   }

   private static void l(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.a($$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   private static void m(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.a($$1, 8)
         .a('#', cju.hi)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("carpet")
         .b("has_white_carpet", a((cgw)cju.hi))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cju.hi));
   }

   private static void n(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.b($$1).a('#', $$2).a('X', aks.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   private static void o(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kx.b($$1).c(caz.pL).c($$2).b("dyed_bed").b("has_bed", a(caz.pL)).a($$0, a($$1, caz.pL));
   }

   private static void p(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.b($$1).a('#', $$2).a('|', caz.nL).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   private static void q(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.a($$1, 8).a('#', cju.aD).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cgw)cju.aD)).a($$0);
   }

   private static void r(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.a($$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   private static void s(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.a($$1, 8)
         .a('#', cju.eg)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cgw)cju.eg))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cju.eg));
   }

   private static void t(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kw.a($$1, 8).a('#', cju.hy).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cgw)cju.hy)).a($$0);
   }

   private static void u(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kx.a($$1, 8).c($$2).b(cju.E, 4).b(cju.G, 4).b("concrete_powder").b("has_sand", a((cgw)cju.E)).b("has_gravel", a((cgw)cju.G)).a($$0);
   }

   public static void a(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      kx.b($$1).c(cju.ow).c($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   public static void b(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      a($$1, cdm.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   public static ku a(cgw $$0, cdm $$1) {
      return kw.a($$0, 6).a('#', $$1).b("###").b("###");
   }

   public static void c(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      b($$1, cdm.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   public static ku b(cgw $$0, cdm $$1) {
      return kw.a($$0, 4).a('S', $$1).b("SS").b("SS");
   }

   public static void d(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      c($$1, cdm.a($$2)).b(b($$2), a($$2)).a($$0);
   }

   public static kw c(cgw $$0, cdm $$1) {
      return kw.a($$0, 4).a('#', $$1).b("##").b("##");
   }

   public static void e(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      d($$1, cdm.a($$2)).b(b($$2), a($$2)).a($$0);
   }

   public static kw d(cgw $$0, cdm $$1) {
      return kw.b($$0).a('#', $$1).b("#").b("#");
   }

   private static void v(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      a($$0, $$1, $$2, 1);
   }

   private static void a(Consumer<kt> $$0, cgw $$1, cgw $$2, int $$3) {
      kz.a(cdm.a($$2), $$1, $$3).b(b($$2), a($$2)).a($$0, a($$1, $$2) + "_stonecutting");
   }

   private static void w(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      ky.c(cdm.a($$2), $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   private static void x(Consumer<kt> $$0, cgw $$1, cgw $$2) {
      a($$0, $$1, $$2, d($$2), null, d($$1), null);
   }

   private static void a(Consumer<kt> $$0, cgw $$1, cgw $$2, String $$3, String $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$1), null);
   }

   private static void b(Consumer<kt> $$0, cgw $$1, cgw $$2, String $$3, String $$4) {
      a($$0, $$1, $$2, d($$2), null, $$3, $$4);
   }

   private static void a(Consumer<kt> $$0, cgw $$1, cgw $$2, String $$3, @Nullable String $$4, String $$5, @Nullable String $$6) {
      kx.a($$1, 9).c($$2).b($$6).b(b($$2), a($$2)).a($$0, new abb($$5));
      kw.b($$2).a('#', $$1).b("###").b("###").b("###").c($$4).b(b($$1), a($$1)).a($$0, new abb($$3));
   }

   private static void a(Consumer<kt> $$0, String $$1, cdy<?> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, caz.qi, caz.qj, 0.35F);
      a($$0, $$1, $$2, $$3, caz.qk, caz.ql, 0.35F);
      a($$0, $$1, $$2, $$3, caz.pi, caz.pm, 0.35F);
      a($$0, $$1, $$2, $$3, caz.cZ, caz.qf, 0.1F);
      a($$0, $$1, $$2, $$3, caz.pj, caz.pn, 0.35F);
      a($$0, $$1, $$2, $$3, caz.sJ, caz.sK, 0.35F);
      a($$0, $$1, $$2, $$3, caz.ot, caz.ou, 0.35F);
      a($$0, $$1, $$2, $$3, caz.sd, caz.se, 0.35F);
      a($$0, $$1, $$2, $$3, caz.sw, caz.sx, 0.35F);
   }

   private static void a(Consumer<kt> $$0, String $$1, cdy<?> $$2, int $$3, cgw $$4, cgw $$5, float $$6) {
      ky.a(cdm.a($$4), $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   private static void b(Consumer<kt> $$0) {
      ((BiMap)cao.a.get()).forEach(($$1, $$2) -> kx.b($$2).c($$1).c(caz.un).b(c($$2)).b(b($$1), a((cgw)$$1)).a($$0, a($$2, caz.un)));
   }

   private static void a(Consumer<kt> $$0, iv $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cgw, cgw, ku> $$4 = (BiFunction)n.get($$2);
         cgw $$5 = a($$1, $$2);
         if ($$4 != null) {
            ku $$6 = (ku)$$4.apply($$3, $$5);
            $$1.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == iv.b.d ? "" : "_" + $$2.a())));
            $$6.a((String)$$1.f().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == iv.b.c) {
            w($$0, $$3, $$5);
         }

      });
   }

   private static cjt a(iv $$0, iv.b $$1) {
      if ($$1 == iv.b.b) {
         if (!$$0.b().containsKey(iv.b.i)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(iv.b.i);
         }
      } else {
         return $$0.a();
      }
   }

   private static bk.a a(cjt $$0) {
      return new bk.a(bo.b.a, $$0, cz.a);
   }

   private static bx.a a(cj.d $$0, cgw $$1) {
      return a(ca.a.a().a($$1).a($$0).b());
   }

   private static bx.a a(cgw $$0) {
      return a(ca.a.a().a($$0).b());
   }

   private static bx.a a(akz<cat> $$0) {
      return a(ca.a.a().a($$0).b());
   }

   private static bx.a a(ca... $$0) {
      return new bx.a(bo.b.a, cj.d.e, cj.d.e, cj.d.e, $$0);
   }

   private static String b(cgw $$0) {
      return "has_" + c($$0);
   }

   private static String c(cgw $$0) {
      return hm.Y.b($$0.l()).a();
   }

   private static String d(cgw $$0) {
      return c($$0);
   }

   private static String a(cgw $$0, cgw $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   private static String e(cgw $$0) {
      return c($$0) + "_from_smelting";
   }

   private static String f(cgw $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public String a() {
      return "Recipes";
   }
}
