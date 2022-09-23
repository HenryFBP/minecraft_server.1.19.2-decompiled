import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bde {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bbr<? extends bcc>, bdc> b = ImmutableMap.builder()
      .put(bbr.b, boi.n().a())
      .put(bbr.d, bcc.dA().a())
      .put(bbr.f, bol.fR().a())
      .put(bbr.g, bmz.n().a())
      .put(bbr.h, bnf.fW().a())
      .put(bbr.i, bra.n().a())
      .put(bbr.l, bnh.fX().a())
      .put(bbr.m, brb.n().a())
      .put(bbr.n, bnj.q().a())
      .put(bbr.o, bnb.n().a())
      .put(bbr.p, bnl.q().a())
      .put(bbr.q, brc.n().a())
      .put(bbr.r, bnm.fJ().a())
      .put(bbr.s, boz.q().a())
      .put(bbr.u, bsj.fP().a())
      .put(bbr.v, brf.n().a())
      .put(bbr.y, brg.n().a())
      .put(bbr.z, brh.n().a())
      .put(bbr.x, bpp.n().a())
      .put(bbr.A, brj.q().a())
      .put(bbr.G, bno.q().a())
      .put(bbr.H, boq.fK().a())
      .put(bbr.I, brk.t().a())
      .put(bbr.J, brl.n().a())
      .put(bbr.L, bbv.fJ().a())
      .put(bbr.M, bow.t().a())
      .put(bbr.N, brm.fJ().a())
      .put(bbr.O, bsm.q().a())
      .put(bbr.P, bpa.ge().a())
      .put(bbr.Q, bsj.fP().a())
      .put(bbr.R, bro.q().a())
      .put(bbr.S, bnq.n().a())
      .put(bbr.Y, bpd.gq().a())
      .put(bbr.aa, brp.n().a())
      .put(bbr.ak, bnl.q().a())
      .put(bbr.aj, boz.q().a())
      .put(bbr.al, bns.q().a())
      .put(bbr.an, bnt.fV().a())
      .put(bbr.ao, bnu.fR().a())
      .put(bbr.ap, brq.fO().a())
      .put(bbr.aq, bnv.q().a())
      .put(bbr.ar, bss.fQ().a())
      .put(bbr.as, bsv.t().a())
      .put(bbr.at, brt.q().a())
      .put(bbr.bn, buc.fn().a())
      .put(bbr.au, bnw.q().a())
      .put(bbr.aw, bnb.n().a())
      .put(bbr.ax, bny.t().a())
      .put(bbr.ay, brv.n().a())
      .put(bbr.az, bnb.n().a())
      .put(bbr.aA, boa.q().a())
      .put(bbr.aB, brw.n().a())
      .put(bbr.aD, brx.n().a())
      .put(bbr.aE, bqz.n().a())
      .put(bbr.aF, bpg.q().a())
      .put(bbr.aG, brq.fO().a())
      .put(bbr.aI, boc.n().a())
      .put(bbr.aL, bsb.q().a())
      .put(bbr.aM, bod.fJ().a())
      .put(bbr.aN, bqz.n().a())
      .put(bbr.aO, bsd.fJ().a())
      .put(bbr.aP, bot.fL().a())
      .put(bbr.aV, bpd.gq().a())
      .put(bbr.aW, bnb.n().a())
      .put(bbr.aX, bof.fJ().a())
      .put(bbr.aY, bse.n().a())
      .put(bbr.aZ, btp.fT().a())
      .put(bbr.ba, bsf.q().a())
      .put(bbr.bc, btg.n().a())
      .put(bbr.bb, bce.w().a())
      .put(bbr.bd, bsg.q().a())
      .put(bbr.be, bqj.q().a())
      .put(bbr.bf, bqz.n().a())
      .put(bbr.bh, boh.fR().a())
      .put(bbr.bi, bsi.n().a())
      .put(bbr.bj, bsj.fP().a())
      .put(bbr.bk, bpk.q().a())
      .put(bbr.bl, bsj.fP().a())
      .put(bbr.bm, bsl.fT().a())
      .build();

   public static bdc a(bbr<? extends bcc> $$0) {
      return (bdc)b.get($$0);
   }

   public static boolean b(bbr<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      hm.X.r().filter($$0 -> $$0.f() != bcf.h).filter($$0 -> !b($$0)).map(hm.X::b).forEach($$0 -> ad.a("Entity " + $$0 + " has no attributes"));
   }
}
