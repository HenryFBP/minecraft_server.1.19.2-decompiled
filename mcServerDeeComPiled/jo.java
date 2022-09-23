import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class jo implements Consumer<BiConsumer<abb, dsg.a>> {
   private static final dux.a a = dve.a(ca.a.a().a(new bj(cev.v, cj.d.b(1))));
   private static final dux.a b = a.invert();
   private static final dux.a c = dve.a(ca.a.a().a(caz.qd));
   private static final dux.a d = c.or(a);
   private static final dux.a e = d.invert();
   private static final Set<cat> f = (Set<cat>)Stream.of(
         cju.eH,
         cju.eV,
         cju.lI,
         cju.fH,
         cju.fJ,
         cju.fN,
         cju.fL,
         cju.fP,
         cju.fR,
         cju.jB,
         cju.jR,
         cju.jN,
         cju.jO,
         cju.jL,
         cju.jJ,
         cju.jP,
         cju.jF,
         cju.jK,
         cju.jH,
         cju.jE,
         cju.jD,
         cju.jI,
         cju.jM,
         cju.jQ,
         cju.jC,
         cju.jG
      )
      .map(cgw::l)
      .collect(ImmutableSet.toImmutableSet());
   private static final float[] g = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] h = new float[]{0.025F, 0.027777778F, 0.03125F, 0.041666668F, 0.1F};
   private static final float[] i = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};
   private final Map<abb, dsg.a> j = Maps.newHashMap();

   private static <T extends dtl<T>> T a(cgw $$0, dtl<T> $$1) {
      return (T)(!f.contains($$0.l()) ? $$1.b(dtd.c()) : $$1.c());
   }

   private static <T extends duq<T>> T a(cgw $$0, duq<T> $$1) {
      return (T)(!f.contains($$0.l()) ? $$1.b(dut.c()) : $$1.d());
   }

   private static dsg.a a(cgw $$0) {
      return dsg.b().a(a($$0, dsf.a().a(dvq.a(1.0F)).a(dss.a($$0))));
   }

   private static dsg.a a(cjt $$0, dux.a $$1, dsv.a<?> $$2) {
      return dsg.b().a(dsf.a().a(dvq.a(1.0F)).a(dss.a($$0).a($$1).a($$2)));
   }

   private static dsg.a a(cjt $$0, dsv.a<?> $$1) {
      return a($$0, a, $$1);
   }

   private static dsg.a b(cjt $$0, dsv.a<?> $$1) {
      return a($$0, c, $$1);
   }

   private static dsg.a c(cjt $$0, dsv.a<?> $$1) {
      return a($$0, d, $$1);
   }

   private static dsg.a b(cjt $$0, cgw $$1) {
      return a($$0, a((cgw)$$0, dss.a($$1)));
   }

   private static dsg.a a(cgw $$0, dvs $$1) {
      return dsg.b().a(dsf.a().a(dvq.a(1.0F)).a(a($$0, dss.a($$0).a(dty.a($$1)))));
   }

   private static dsg.a a(cjt $$0, cgw $$1, dvs $$2) {
      return a($$0, a((cgw)$$0, dss.a($$1).a(dty.a($$2))));
   }

   private static dsg.a b(cgw $$0) {
      return dsg.b().a(dsf.a().a(a).a(dvq.a(1.0F)).a(dss.a($$0)));
   }

   private static dsg.a c(cgw $$0) {
      return dsg.b().a(a(cju.eY, dsf.a().a(dvq.a(1.0F)).a(dss.a(cju.eY)))).a(a($$0, dsf.a().a(dvq.a(1.0F)).a(dss.a($$0))));
   }

   private static dsg.a e(cjt $$0) {
      return dsg.b().a(dsf.a().a(dvq.a(1.0F)).a(a((cgw)$$0, dss.a($$0).a(dty.a(dvq.a(2.0F)).a(duw.a($$0).a(cz.a.a().a(cqn.a, cwv.c)))))));
   }

   private static <T extends Comparable<T> & amw> dsg.a a(cjt $$0, cwr<T> $$1, T $$2) {
      return dsg.b().a(a($$0, dsf.a().a(dvq.a(1.0F)).a(dss.a($$0).a(duw.a($$0).a(cz.a.a().a($$1, $$2))))));
   }

   private static dsg.a f(cjt $$0) {
      return dsg.b().a(a($$0, dsf.a().a(dvq.a(1.0F)).a(dss.a($$0).a(dtf.a(dtf.a.d)))));
   }

   private static dsg.a g(cjt $$0) {
      return dsg.b()
         .a(
            a(
               $$0,
               dsf.a()
                  .a(dvq.a(1.0F))
                  .a(
                     dss.a($$0)
                        .a(dtf.a(dtf.a.d))
                        .a(
                           dtg.a(dvj.a)
                              .a("Lock", "BlockEntityTag.Lock")
                              .a("LootTable", "BlockEntityTag.LootTable")
                              .a("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .a(dtu.a(ctk.w).a(dsp.a(cqj.b)))
                  )
            )
         );
   }

   private static dsg.a h(cjt $$0) {
      return a($$0, a((cgw)$$0, dss.a(caz.nb).a(dty.a(dvv.a(2.0F, 5.0F))).a(dtc.a(cev.x))));
   }

   private static dsg.a i(cjt $$0) {
      return a($$0, a((cgw)$$0, dss.a(caz.mW).a(dty.a(dvv.a(4.0F, 9.0F))).a(dtc.a(cev.x))));
   }

   private static dsg.a j(cjt $$0) {
      return a($$0, a((cgw)$$0, dss.a(caz.kK).a(dty.a(dvv.a(4.0F, 5.0F))).a(dtc.b(cev.x))));
   }

   private static dsg.a k(cjt $$0) {
      return dsg.b().a(a($$0, dsf.a().a(dvq.a(1.0F)).a(dss.a($$0).a(dtf.a(dtf.a.d)).a(dtg.a(dvj.a).a("Patterns", "BlockEntityTag.Patterns")))));
   }

   private static dsg.a l(cjt $$0) {
      return dsg.b().a(dsf.a().a(a).a(dvq.a(1.0F)).a(dss.a($$0).a(dtg.a(dvj.a).a("Bees", "BlockEntityTag.Bees")).a(dte.a($$0).a(cjn.b))));
   }

   private static dsg.a m(cjt $$0) {
      return dsg.b().a(dsf.a().a(dvq.a(1.0F)).a(dss.a($$0).a(a).a(dtg.a(dvj.a).a("Bees", "BlockEntityTag.Bees")).a(dte.a($$0).a(cjn.b)).a(dss.a($$0))));
   }

   private static dsg.a n(cjt $$0) {
      return dsg.b().a(dsf.a().a(dss.a(caz.uj)).a(duw.a($$0).a(cz.a.a().a(ckm.p_, true))));
   }

   private static dsg.a a(cjt $$0, cat $$1) {
      return a($$0, a((cgw)$$0, dss.a($$1).a(dtc.a(cev.x))));
   }

   private static dsg.a c(cjt $$0, cgw $$1) {
      return a($$0, a((cgw)$$0, dss.a($$1).a(dty.a(dvv.a(-6.0F, 2.0F))).a(dtm.a(dsb.b(0)))));
   }

   private static dsg.a o(cjt $$0) {
      return b($$0, a((cgw)$$0, dss.a(caz.nR).a(dvc.a(0.125F)).a(dtc.a(cev.x, 2))));
   }

   private static dsg.a b(cjt $$0, cat $$1) {
      return dsg.b()
         .a(
            a(
               $$0,
               dsf.a().a(dvq.a(1.0F)).a(dss.a($$1).a(crf.b.a(), $$1x -> dty.a(dvp.a(3, (float)($$1x + 1) / 15.0F)).a(duw.a($$0).a(cz.a.a().a(crf.b, $$1x)))))
            )
         );
   }

   private static dsg.a c(cjt $$0, cat $$1) {
      return dsg.b().a(a($$0, dsf.a().a(dvq.a(1.0F)).a(dss.a($$1).a(dty.a(dvp.a(3, 0.53333336F))))));
   }

   private static dsg.a d(cgw $$0) {
      return dsg.b().a(dsf.a().a(dvq.a(1.0F)).a(c).a(dss.a($$0)));
   }

   private static dsg.a a(cjt $$0, dux.a $$1) {
      return dsg.b()
         .a(
            dsf.a()
               .a(
                  a(
                     (cgw)$$0,
                     dss.a($$0)
                        .a($$1)
                        .a(gy.values(), $$1x -> dty.a(dvq.a(1.0F), true).a(duw.a($$0).a(cz.a.a().a(cok.b($$1x), true))))
                        .a(dty.a(dvq.a(-1.0F), true))
                  )
               )
         );
   }

   private static dsg.a a(cjt $$0, cjt $$1, float... $$2) {
      return c($$0, a((cgw)$$0, dss.a($$1)).a(duo.a(cev.x, $$2)))
         .a(dsf.a().a(dvq.a(1.0F)).a(e).a(a((cgw)$$0, dss.a(caz.nL).a(dty.a(dvv.a(1.0F, 2.0F)))).a(duo.a(cev.x, i))));
   }

   private static dsg.a b(cjt $$0, cjt $$1, float... $$2) {
      return a($$0, $$1, $$2)
         .a(dsf.a().a(dvq.a(1.0F)).a(e).a(a((cgw)$$0, dss.a(caz.mP)).a(duo.a(cev.x, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))));
   }

   private static dsg.a p(cjt $$0) {
      return c($$0, a((cgw)cju.ay, dss.a(caz.nL).a(dty.a(dvv.a(1.0F, 2.0F)))).a(duo.a(cev.x, i)));
   }

   private static dsg.a a(cjt $$0, cat $$1, cat $$2, dux.a $$3) {
      return a((cgw)$$0, dsg.b().a(dsf.a().a(dss.a($$1).a($$3).a(dss.a($$2)))).a(dsf.a().a($$3).a(dss.a($$2).a(dtc.a(cev.x, 0.5714286F, 3)))));
   }

   private static dsg.a q(cjt $$0) {
      return dsg.b().a(dsf.a().a(c).a(dss.a($$0).a(dty.a(dvq.a(2.0F)))));
   }

   private static dsg.a b(cjt $$0, cjt $$1) {
      dsv.a<?> $$2 = dss.a($$1).a(dty.a(dvq.a(2.0F))).a(c).a(a((cgw)$$0, dss.a(caz.nR)).a(dvc.a(0.125F)));
      return dsg.b()
         .a(
            dsf.a()
               .a($$2)
               .a(duw.a($$0).a(cz.a.a().a(clr.a, cwk.b)))
               .a(duv.a(ch.a.a().a(au.a.a().a($$0).a(cz.a.a().a(clr.a, cwk.a).b()).b()), new gt(0, 1, 0)))
         )
         .a(
            dsf.a()
               .a($$2)
               .a(duw.a($$0).a(cz.a.a().a(clr.a, cwk.a)))
               .a(duv.a(ch.a.a().a(au.a.a().a($$0).a(cz.a.a().a(clr.a, cwk.b).b()).b()), new gt(0, -1, 0)))
         );
   }

   private static dsg.a r(cjt $$0) {
      return dsg.b()
         .a(
            dsf.a()
               .a(dvq.a(1.0F))
               .a(a($$0, dss.a($$0).a(List.of(2, 3, 4), $$1 -> dty.a(dvq.a((float)$$1.intValue())).a(duw.a($$0).a(cz.a.a().a(ckf.e, $$1))))))
         );
   }

   private static dsg.a s(cjt $$0) {
      return dsg.b().a(dsf.a().a(dvq.a(1.0F)).a(dss.a($$0)));
   }

   public static dsg.a a() {
      return dsg.b();
   }

   public void a(BiConsumer<abb, dsg.a> $$0) {
      this.d(cju.c);
      this.d(cju.d);
      this.d(cju.e);
      this.d(cju.f);
      this.d(cju.g);
      this.d(cju.h);
      this.d(cju.j);
      this.d(cju.k);
      this.d(cju.m);
      this.d(cju.n);
      this.d(cju.o);
      this.d(cju.p);
      this.d(cju.q);
      this.d(cju.r);
      this.d(cju.s);
      this.d(cju.t);
      this.d(cju.u);
      this.d(cju.v);
      this.d(cju.w);
      this.d(cju.x);
      this.d(cju.y);
      this.d(cju.z);
      this.d(cju.E);
      this.d(cju.F);
      this.d(cju.O);
      this.d(cju.P);
      this.d(cju.Q);
      this.d(cju.R);
      this.d(cju.S);
      this.d(cju.T);
      this.d(cju.X);
      this.d(cju.Y);
      this.d(cju.Z);
      this.d(cju.aa);
      this.d(cju.ab);
      this.d(cju.ac);
      this.d(cju.mV);
      this.d(cju.ne);
      this.d(cju.ad);
      this.d(cju.ae);
      this.d(cju.af);
      this.d(cju.ag);
      this.d(cju.ah);
      this.d(cju.ai);
      this.d(cju.aj);
      this.d(cju.ak);
      this.d(cju.al);
      this.d(cju.am);
      this.d(cju.an);
      this.d(cju.ao);
      this.d(cju.ap);
      this.d(cju.aq);
      this.d(cju.ng);
      this.d(cju.mX);
      this.d(cju.ar);
      this.d(cju.aB);
      this.d(cju.aC);
      this.d(cju.aG);
      this.d(cju.aI);
      this.d(cju.aJ);
      this.d(cju.aK);
      this.d(cju.aL);
      this.d(cju.bc);
      this.d(cju.bd);
      this.d(cju.be);
      this.d(cju.bl);
      this.d(cju.bn);
      this.d(cju.bo);
      this.d(cju.bp);
      this.d(cju.bq);
      this.d(cju.br);
      this.d(cju.bs);
      this.d(cju.bt);
      this.d(cju.bu);
      this.d(cju.bv);
      this.d(cju.bw);
      this.d(cju.bx);
      this.d(cju.by);
      this.d(cju.bz);
      this.d(cju.bA);
      this.d(cju.bB);
      this.d(cju.bC);
      this.d(cju.bE);
      this.d(cju.bF);
      this.d(cju.bG);
      this.d(cju.bH);
      this.d(cju.bI);
      this.d(cju.bJ);
      this.d(cju.bK);
      this.d(cju.bL);
      this.d(cju.bM);
      this.d(cju.bN);
      this.d(cju.bO);
      this.d(cju.bP);
      this.d(cju.bQ);
      this.d(cju.bR);
      this.d(cju.bS);
      this.d(cju.bT);
      this.d(cju.bU);
      this.d(cju.bV);
      this.d(cju.bY);
      this.d(cju.bZ);
      this.d(cju.nV);
      this.d(cju.ca);
      this.d(cju.cf);
      this.d(cju.gS);
      this.d(cju.ch);
      this.d(cju.ck);
      this.d(cju.cl);
      this.d(cju.cp);
      this.d(cju.cq);
      this.d(cju.cr);
      this.d(cju.cs);
      this.d(cju.ct);
      this.d(cju.cu);
      this.d(cju.cv);
      this.d(cju.cx);
      this.d(cju.cy);
      this.d(cju.cz);
      this.d(cju.cH);
      this.d(cju.cI);
      this.d(cju.cK);
      this.d(cju.cL);
      this.d(cju.cM);
      this.d(cju.cN);
      this.d(cju.cO);
      this.d(cju.cP);
      this.d(cju.cQ);
      this.d(cju.cT);
      this.d(cju.cV);
      this.d(cju.cZ);
      this.d(cju.db);
      this.d(cju.dc);
      this.d(cju.dd);
      this.d(cju.jb);
      this.d(cju.de);
      this.d(cju.df);
      this.d(cju.dg);
      this.d(cju.dh);
      this.d(cju.di);
      this.d(cju.dj);
      this.d(cju.qM);
      this.d(cju.dk);
      this.d(cju.do);
      this.d(cju.dp);
      this.d(cju.dr);
      this.d(cju.dI);
      this.d(cju.dJ);
      this.d(cju.dK);
      this.d(cju.dL);
      this.d(cju.dM);
      this.d(cju.dN);
      this.d(cju.dO);
      this.d(cju.dP);
      this.d(cju.dQ);
      this.d(cju.dR);
      this.d(cju.dS);
      this.d(cju.ee);
      this.d(cju.eo);
      this.d(cju.iV);
      this.d(cju.ep);
      this.d(cju.eq);
      this.d(cju.et);
      this.d(cju.eu);
      this.d(cju.ev);
      this.d(cju.ew);
      this.d(cju.eA);
      this.d(cju.eG);
      this.d(cju.eI);
      this.d(cju.eK);
      this.d(cju.eO);
      this.d(cju.eQ);
      this.d(cju.eR);
      this.d(cju.eS);
      this.d(cju.eT);
      this.d(cju.eW);
      this.d(cju.eX);
      this.d(cju.eY);
      this.d(cju.fA);
      this.d(cju.fB);
      this.d(cju.fC);
      this.d(cju.fD);
      this.d(cju.fE);
      this.d(cju.fF);
      this.d(cju.fG);
      this.d(cju.fH);
      this.d(cju.fJ);
      this.d(cju.fL);
      this.d(cju.fP);
      this.d(cju.fR);
      this.d(cju.fT);
      this.d(cju.fU);
      this.d(cju.fV);
      this.d(cju.fX);
      this.d(cju.fY);
      this.d(cju.fZ);
      this.d(cju.ga);
      this.d(cju.gb);
      this.d(cju.ge);
      this.d(cju.gf);
      this.d(cju.gg);
      this.d(cju.gh);
      this.d(cju.gi);
      this.d(cju.gk);
      this.d(cju.gl);
      this.d(cju.gm);
      this.d(cju.gn);
      this.d(cju.go);
      this.d(cju.gp);
      this.d(cju.gq);
      this.d(cju.gr);
      this.d(cju.gs);
      this.d(cju.gt);
      this.d(cju.gu);
      this.d(cju.gv);
      this.d(cju.gw);
      this.d(cju.gx);
      this.d(cju.gy);
      this.d(cju.gz);
      this.d(cju.gQ);
      this.d(cju.gR);
      this.d(cju.gT);
      this.d(cju.gW);
      this.d(cju.gX);
      this.d(cju.gY);
      this.d(cju.gZ);
      this.d(cju.ha);
      this.d(cju.hb);
      this.d(cju.hc);
      this.d(cju.hh);
      this.d(cju.hi);
      this.d(cju.hj);
      this.d(cju.hk);
      this.d(cju.hl);
      this.d(cju.hm);
      this.d(cju.hn);
      this.d(cju.ho);
      this.d(cju.hp);
      this.d(cju.hq);
      this.d(cju.hr);
      this.d(cju.hs);
      this.d(cju.ht);
      this.d(cju.hu);
      this.d(cju.hv);
      this.d(cju.hw);
      this.d(cju.hx);
      this.d(cju.hy);
      this.d(cju.hz);
      this.d(cju.in);
      this.d(cju.io);
      this.d(cju.ip);
      this.d(cju.iq);
      this.d(cju.iM);
      this.d(cju.iN);
      this.d(cju.iO);
      this.d(cju.iP);
      this.d(cju.iQ);
      this.d(cju.iR);
      this.d(cju.iS);
      this.d(cju.iT);
      this.d(cju.iU);
      this.d(cju.iW);
      this.d(cju.iX);
      this.d(cju.iY);
      this.d(cju.iZ);
      this.d(cju.ja);
      this.d(cju.ji);
      this.d(cju.jl);
      this.d(cju.jm);
      this.d(cju.jn);
      this.d(cju.jo);
      this.d(cju.jv);
      this.d(cju.jw);
      this.d(cju.jx);
      this.d(cju.jy);
      this.d(cju.jA);
      this.d(cju.nO);
      this.d(cju.jS);
      this.d(cju.jT);
      this.d(cju.jU);
      this.d(cju.jV);
      this.d(cju.jW);
      this.d(cju.jX);
      this.d(cju.jY);
      this.d(cju.jZ);
      this.d(cju.ka);
      this.d(cju.kb);
      this.d(cju.kc);
      this.d(cju.kd);
      this.d(cju.ke);
      this.d(cju.kf);
      this.d(cju.kg);
      this.d(cju.kh);
      this.d(cju.ki);
      this.d(cju.kj);
      this.d(cju.kk);
      this.d(cju.kl);
      this.d(cju.km);
      this.d(cju.kn);
      this.d(cju.ko);
      this.d(cju.kp);
      this.d(cju.kq);
      this.d(cju.kr);
      this.d(cju.ks);
      this.d(cju.kt);
      this.d(cju.ku);
      this.d(cju.kv);
      this.d(cju.kw);
      this.d(cju.kx);
      this.d(cju.ky);
      this.d(cju.kz);
      this.d(cju.kA);
      this.d(cju.kB);
      this.d(cju.kC);
      this.d(cju.kD);
      this.d(cju.kE);
      this.d(cju.kF);
      this.d(cju.kG);
      this.d(cju.kH);
      this.d(cju.kI);
      this.d(cju.kJ);
      this.d(cju.kK);
      this.d(cju.kL);
      this.d(cju.kM);
      this.d(cju.kN);
      this.d(cju.kO);
      this.d(cju.kQ);
      this.d(cju.kS);
      this.d(cju.kT);
      this.d(cju.kU);
      this.d(cju.kV);
      this.d(cju.kW);
      this.d(cju.lI);
      this.d(cju.eH);
      this.d(cju.lK);
      this.d(cju.lP);
      this.d(cju.lQ);
      this.d(cju.lR);
      this.d(cju.lS);
      this.d(cju.lT);
      this.d(cju.lU);
      this.d(cju.lV);
      this.d(cju.lW);
      this.d(cju.lX);
      this.d(cju.lY);
      this.d(cju.lZ);
      this.d(cju.ma);
      this.d(cju.mb);
      this.d(cju.mc);
      this.d(cju.mq);
      this.d(cju.mr);
      this.d(cju.ms);
      this.d(cju.mt);
      this.d(cju.mu);
      this.d(cju.mv);
      this.d(cju.mx);
      this.d(cju.my);
      this.d(cju.mz);
      this.d(cju.mA);
      this.d(cju.mB);
      this.d(cju.mC);
      this.d(cju.mw);
      this.d(cju.mE);
      this.d(cju.mD);
      this.d(cju.nR);
      this.d(cju.nS);
      this.d(cju.nW);
      this.d(cju.ob);
      this.d(cju.mU);
      this.d(cju.mW);
      this.d(cju.mZ);
      this.d(cju.na);
      this.d(cju.nd);
      this.d(cju.nf);
      this.d(cju.ni);
      this.d(cju.nj);
      this.d(cju.np);
      this.d(cju.nq);
      this.d(cju.nu);
      this.d(cju.nw);
      this.d(cju.ny);
      this.d(cju.nA);
      this.d(cju.nC);
      this.d(cju.nE);
      this.d(cju.nI);
      this.d(cju.nt);
      this.d(cju.nv);
      this.d(cju.nx);
      this.d(cju.nz);
      this.d(cju.nB);
      this.d(cju.nD);
      this.d(cju.nH);
      this.d(cju.nT);
      this.d(cju.nU);
      this.d(cju.oc);
      this.d(cju.oh);
      this.d(cju.ol);
      this.d(cju.od);
      this.d(cju.oe);
      this.d(cju.om);
      this.d(cju.oj);
      this.d(cju.oi);
      this.d(cju.og);
      this.d(cju.oo);
      this.d(cju.oq);
      this.d(cju.or);
      this.d(cju.os);
      this.d(cju.ot);
      this.d(cju.ou);
      this.d(cju.ov);
      this.d(cju.ef);
      this.d(cju.nb);
      this.d(cju.no);
      this.d(cju.dU);
      this.d(cju.W);
      this.d(cju.er);
      this.d(cju.pe);
      this.d(cju.pl);
      this.d(cju.pk);
      this.d(cju.pm);
      this.c(cju.po);
      this.c(cju.pp);
      this.c(cju.pr);
      this.a(cju.pq, (Function<cjt, dsg.a>)($$0x -> a($$0x, a)));
      this.c(cju.ps);
      this.d(cju.pw);
      this.d(cju.pv);
      this.d(cju.pu);
      this.d(cju.pt);
      this.d(cju.pC);
      this.d(cju.pB);
      this.d(cju.pA);
      this.d(cju.pz);
      this.d(cju.pL);
      this.d(cju.pM);
      this.d(cju.pN);
      this.d(cju.pO);
      this.d(cju.pS);
      this.d(cju.pQ);
      this.d(cju.pR);
      this.d(cju.pP);
      this.d(cju.pW);
      this.d(cju.pV);
      this.d(cju.pU);
      this.d(cju.pT);
      this.d(cju.pG);
      this.d(cju.pF);
      this.d(cju.pE);
      this.d(cju.pD);
      this.d(cju.qb);
      this.d(cju.qc);
      this.d(cju.qd);
      this.d(cju.qg);
      this.d(cju.qi);
      this.d(cju.qh);
      this.d(cju.qj);
      this.d(cju.ql);
      this.d(cju.qk);
      this.d(cju.qp);
      this.d(cju.qs);
      this.d(cju.qt);
      this.d(cju.qv);
      this.d(cju.qw);
      this.d(cju.qx);
      this.d(cju.qz);
      this.d(cju.qA);
      this.d(cju.qB);
      this.d(cju.qD);
      this.d(cju.qE);
      this.d(cju.qF);
      this.d(cju.qH);
      this.d(cju.qI);
      this.d(cju.qJ);
      this.d(cju.qK);
      this.d(cju.qN);
      this.d(cju.qO);
      this.d(cju.qP);
      this.d(cju.qS);
      this.d(cju.qT);
      this.d(cju.qU);
      this.d(cju.V);
      this.d(cju.U);
      this.d(cju.qq);
      this.d(cju.dT);
      this.a(cju.cn, (cgw)cju.j);
      this.a(cju.eP, (cgw)caz.nO);
      this.a(cju.jq, (cgw)cju.j);
      this.a(cju.kP, (cgw)cju.kO);
      this.a(cju.lJ, (cgw)cju.lK);
      this.a(cju.eB, (cgw)cju.eA);
      this.a(cju.eC, (cgw)cju.eA);
      this.a(cju.eD, (cgw)cju.eA);
      this.a(cju.qm, (cgw)cju.ql);
      this.a(cju.b, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.m)));
      this.a(cju.qr, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.qs)));
      this.a(cju.i, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.j)));
      this.a(cju.l, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.j)));
      this.a(cju.es, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.j)));
      this.a(cju.kX, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.kS)));
      this.a(cju.kY, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.kT)));
      this.a(cju.kZ, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.kU)));
      this.a(cju.la, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.kV)));
      this.a(cju.lb, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.kW)));
      this.a(cju.nh, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.df)));
      this.a(cju.mY, (Function<cjt, dsg.a>)($$0x -> b($$0x, (cgw)cju.df)));
      this.a(cju.bX, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.oY, dvq.a(3.0F))));
      this.a(cju.da, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.oV, dvq.a(4.0F))));
      this.a(cju.eN, (Function<cjt, dsg.a>)($$0x -> a($$0x, (cgw)cju.bZ, (dvs)dvq.a(8.0F))));
      this.a(cju.cY, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.oL, dvq.a(4.0F))));
      this.a(cju.jj, a(caz.tc, dvv.a(0.0F, 1.0F)));
      this.b(cju.eZ);
      this.b(cju.fa);
      this.b(cju.fb);
      this.b(cju.fc);
      this.b(cju.fd);
      this.b(cju.fe);
      this.b(cju.ff);
      this.b(cju.fg);
      this.b(cju.fh);
      this.b(cju.fi);
      this.b(cju.fj);
      this.b(cju.fk);
      this.b(cju.fl);
      this.b(cju.fm);
      this.b(cju.fn);
      this.b(cju.fo);
      this.b(cju.fp);
      this.b(cju.fq);
      this.b(cju.fr);
      this.b(cju.fs);
      this.b(cju.ft);
      this.b(cju.fu);
      this.b(cju.fv);
      this.b(cju.fw);
      this.b(cju.fx);
      this.b(cju.lL);
      this.b(cju.nX);
      this.b(cju.nY);
      this.b(cju.nZ);
      this.b(cju.oa);
      this.b(cju.qQ);
      this.b(cju.qR);
      this.a(cju.ix, jo::e);
      this.a(cju.iv, jo::e);
      this.a(cju.it, jo::e);
      this.a(cju.iE, jo::e);
      this.a(cju.iD, jo::e);
      this.a(cju.iw, jo::e);
      this.a(cju.hf, jo::e);
      this.a(cju.iu, jo::e);
      this.a(cju.iH, jo::e);
      this.a(cju.ir, jo::e);
      this.a(cju.iC, jo::e);
      this.a(cju.he, jo::e);
      this.a(cju.hd, jo::e);
      this.a(cju.iL, jo::e);
      this.a(cju.iI, jo::e);
      this.a(cju.iJ, jo::e);
      this.a(cju.iA, jo::e);
      this.a(cju.iK, jo::e);
      this.a(cju.iB, jo::e);
      this.a(cju.is, jo::e);
      this.a(cju.iF, jo::e);
      this.a(cju.iy, jo::e);
      this.a(cju.iz, jo::e);
      this.a(cju.md, jo::e);
      this.a(cju.me, jo::e);
      this.a(cju.mf, jo::e);
      this.a(cju.mg, jo::e);
      this.a(cju.mh, jo::e);
      this.a(cju.mi, jo::e);
      this.a(cju.mj, jo::e);
      this.a(cju.mk, jo::e);
      this.a(cju.ml, jo::e);
      this.a(cju.mm, jo::e);
      this.a(cju.mn, jo::e);
      this.a(cju.mo, jo::e);
      this.a(cju.mp, jo::e);
      this.a(cju.nr, jo::e);
      this.a(cju.ns, jo::e);
      this.a(cju.of, jo::e);
      this.a(cju.ok, jo::e);
      this.a(cju.op, jo::e);
      this.a(cju.pH, jo::e);
      this.a(cju.pI, jo::e);
      this.a(cju.pJ, jo::e);
      this.a(cju.pK, jo::e);
      this.a(cju.pX, jo::e);
      this.a(cju.pY, jo::e);
      this.a(cju.pZ, jo::e);
      this.a(cju.qa, jo::e);
      this.a(cju.qu, jo::e);
      this.a(cju.qy, jo::e);
      this.a(cju.qC, jo::e);
      this.a(cju.qG, jo::e);
      this.a(cju.iG, jo::e);
      this.a(cju.jf, jo::a);
      this.a(cju.jd, jo::a);
      this.a(cju.jg, jo::a);
      this.a(cju.cJ, jo::a);
      this.a(cju.je, jo::a);
      this.a(cju.cw, jo::a);
      this.a(cju.jc, jo::a);
      this.a(cju.nG, jo::a);
      this.a(cju.nF, jo::a);
      this.a(cju.jh, jo::a);
      this.a(cju.bb, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aX, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aY, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aV, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aT, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aZ, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aP, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aU, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aR, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aO, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aW, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aN, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aS, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.ba, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aM, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.aQ, (Function<cjt, dsg.a>)($$0x -> a($$0x, cjm.a, cwc.a)));
      this.a(cju.hC, (Function<cjt, dsg.a>)($$0x -> a($$0x, clr.a, cwk.b)));
      this.a(cju.hB, (Function<cjt, dsg.a>)($$0x -> a($$0x, clr.a, cwk.b)));
      this.a(cju.hE, (Function<cjt, dsg.a>)($$0x -> a($$0x, clr.a, cwk.b)));
      this.a(cju.hD, (Function<cjt, dsg.a>)($$0x -> a($$0x, clr.a, cwk.b)));
      this.a(cju.bW, dsg.b().a(a(cju.bW, dsf.a().a(dvq.a(1.0F)).a(dss.a(cju.bW).a(duw.a(cju.bW).a(cz.a.a().a(crt.a, false)))))));
      this.a(
         cju.eJ,
         (Function<cjt, dsg.a>)($$0x -> dsg.b()
               .a(dsf.a().a(dvq.a(1.0F)).a(a((cgw)$$0x, dss.a(caz.pq).a(dty.a(dvq.a(3.0F)).a(duw.a($$0x).a(cz.a.a().a(cku.b, 2))))))))
      );
      this.a(
         cju.lG,
         (Function<cjt, dsg.a>)($$0x -> dsg.b()
               .a(
                  dsf.a()
                     .a(dvq.a(1.0F))
                     .a(a(cju.lG, dss.a($$0x).a(List.of(2, 3, 4), $$1x -> dty.a(dvq.a((float)$$1x.intValue())).a(duw.a($$0x).a(cz.a.a().a(cqh.b, $$1x))))))
               ))
      );
      this.a(
         cju.nN,
         (Function<cjt, dsg.a>)($$0x -> dsg.b().a(dsf.a().a(a((cgw)$$0x, dss.a(caz.tW)))).a(dsf.a().a(dss.a(caz.pH)).a(duw.a($$0x).a(cz.a.a().a(ckx.d, 8)))))
      );
      this.a(cju.qe, jo::n);
      this.a(cju.qf, jo::n);
      this.a(cju.ow, jo::r);
      this.a(cju.ox, jo::r);
      this.a(cju.oy, jo::r);
      this.a(cju.oz, jo::r);
      this.a(cju.oA, jo::r);
      this.a(cju.oB, jo::r);
      this.a(cju.oC, jo::r);
      this.a(cju.oD, jo::r);
      this.a(cju.oE, jo::r);
      this.a(cju.oF, jo::r);
      this.a(cju.oG, jo::r);
      this.a(cju.oH, jo::r);
      this.a(cju.oI, jo::r);
      this.a(cju.oJ, jo::r);
      this.a(cju.oK, jo::r);
      this.a(cju.oL, jo::r);
      this.a(cju.oM, jo::r);
      this.a(cju.eV, jo::f);
      this.a(cju.ez, jo::f);
      this.a(cju.cg, jo::f);
      this.a(cju.aH, jo::f);
      this.a(cju.gj, jo::f);
      this.a(cju.ey, jo::f);
      this.a(cju.co, jo::f);
      this.a(cju.gd, jo::f);
      this.a(cju.fW, jo::f);
      this.a(cju.mG, jo::f);
      this.a(cju.mH, jo::f);
      this.a(cju.mF, jo::f);
      this.a(cju.mI, jo::f);
      this.a(cju.mJ, jo::f);
      this.a(cju.mK, jo::f);
      this.a(cju.mL, jo::f);
      this.a(cju.mM, jo::f);
      this.a(cju.mN, jo::f);
      this.a(cju.mO, jo::a);
      this.a(cju.mP, jo::a);
      this.a(cju.mQ, jo::a);
      this.a(cju.jB, jo::g);
      this.a(cju.jR, jo::g);
      this.a(cju.jN, jo::g);
      this.a(cju.jO, jo::g);
      this.a(cju.jL, jo::g);
      this.a(cju.jJ, jo::g);
      this.a(cju.jP, jo::g);
      this.a(cju.jF, jo::g);
      this.a(cju.jK, jo::g);
      this.a(cju.jH, jo::g);
      this.a(cju.jE, jo::g);
      this.a(cju.jD, jo::g);
      this.a(cju.jI, jo::g);
      this.a(cju.jM, jo::g);
      this.a(cju.jQ, jo::g);
      this.a(cju.jC, jo::g);
      this.a(cju.jG, jo::g);
      this.a(cju.hW, jo::k);
      this.a(cju.hS, jo::k);
      this.a(cju.hT, jo::k);
      this.a(cju.hQ, jo::k);
      this.a(cju.hO, jo::k);
      this.a(cju.hU, jo::k);
      this.a(cju.hK, jo::k);
      this.a(cju.hP, jo::k);
      this.a(cju.hM, jo::k);
      this.a(cju.hJ, jo::k);
      this.a(cju.hI, jo::k);
      this.a(cju.hN, jo::k);
      this.a(cju.hR, jo::k);
      this.a(cju.hV, jo::k);
      this.a(cju.hH, jo::k);
      this.a(cju.hL, jo::k);
      this.a(cju.fN, (Function<cjt, dsg.a>)($$0x -> dsg.b().a(a($$0x, dsf.a().a(dvq.a(1.0F)).a(dss.a($$0x).a(dtg.a(dvj.a).a("SkullOwner", "SkullOwner")))))));
      this.a(cju.nP, jo::l);
      this.a(cju.nQ, jo::m);
      this.a(cju.au, (Function<cjt, dsg.a>)($$0x -> a($$0x, cju.w, g)));
      this.a(cju.aw, (Function<cjt, dsg.a>)($$0x -> a($$0x, cju.y, g)));
      this.a(cju.av, (Function<cjt, dsg.a>)($$0x -> a($$0x, cju.x, h)));
      this.a(cju.at, (Function<cjt, dsg.a>)($$0x -> a($$0x, cju.v, g)));
      this.a(cju.as, (Function<cjt, dsg.a>)($$0x -> b($$0x, cju.u, g)));
      this.a(cju.ax, (Function<cjt, dsg.a>)($$0x -> b($$0x, cju.z, g)));
      this.a(cju.az, (Function<cjt, dsg.a>)($$0x -> a($$0x, cju.qh, g)));
      this.a(cju.aA, (Function<cjt, dsg.a>)($$0x -> a($$0x, cju.qi, g)));
      dux.a $$1 = duw.a(cju.jp).a(cz.a.a().a(cjo.b, 3));
      this.a(cju.jp, a(cju.jp, caz.te, caz.tf, $$1));
      dux.a $$2 = duw.a(cju.cm).a(cz.a.a().a(clf.d, 7));
      this.a(cju.cm, a(cju.cm, caz.nS, caz.nR, $$2));
      dux.a $$3 = duw.a(cju.fy).a(cz.a.a().a(cki.d, 7));
      dux.a $$4 = duw.a(cju.A).a(cz.a.a().a(coe.a, 4));
      this.a(cju.A, a((cgw)cju.A, dsg.b().a(dsf.a().a($$4).a(dss.a(caz.M)))));
      this.a(cju.fy, a((cgw)cju.fy, dsg.b().a(dsf.a().a(dss.a(caz.sc))).a(dsf.a().a($$3).a(dss.a(caz.sc).a(dtc.a(cev.x, 0.5714286F, 3))))));
      dux.a $$5 = duw.a(cju.fz).a(cz.a.a().a(cpb.d, 7));
      this.a(
         cju.fz,
         a(
            (cgw)cju.fz,
            dsg.b()
               .a(dsf.a().a(dss.a(caz.sd)))
               .a(dsf.a().a($$5).a(dss.a(caz.sd).a(dtc.a(cev.x, 0.5714286F, 3))))
               .a(dsf.a().a($$5).a(dss.a(caz.sf).a(dvc.a(0.02F))))
         )
      );
      this.a(
         cju.mT,
         (Function<cjt, dsg.a>)($$0x -> a(
               (cgw)$$0x,
               dsg.b()
                  .a(dsf.a().a(duw.a(cju.mT).a(cz.a.a().a(crn.b, 3))).a(dss.a(caz.ui)).a(dty.a(dvv.a(2.0F, 3.0F))).a(dtc.b(cev.x)))
                  .a(dsf.a().a(duw.a(cju.mT).a(cz.a.a().a(crn.b, 2))).a(dss.a(caz.ui)).a(dty.a(dvv.a(1.0F, 2.0F))).a(dtc.b(cev.x)))
            ))
      );
      this.a(cju.eb, (Function<cjt, dsg.a>)($$0x -> c($$0x, (cgw)cju.bR)));
      this.a(cju.ec, (Function<cjt, dsg.a>)($$0x -> c($$0x, (cgw)cju.bS)));
      this.a(cju.L, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mS)));
      this.a(cju.M, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mS)));
      this.a(cju.eL, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mV)));
      this.a(cju.eM, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mV)));
      this.a(cju.gc, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mX)));
      this.a(cju.ci, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mU)));
      this.a(cju.cj, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mU)));
      this.a(cju.px, jo::h);
      this.a(cju.py, jo::h);
      this.a(cju.J, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mZ)));
      this.a(cju.K, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.mZ)));
      this.a(cju.H, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.nd)));
      this.a(cju.I, (Function<cjt, dsg.a>)($$0x -> a($$0x, caz.nd)));
      this.a(cju.N, (Function<cjt, dsg.a>)($$0x -> a($$0x, a((cgw)$$0x, dss.a(caz.qq).a(dty.a(dvv.a(2.0F, 6.0F))).a(dtc.a(cev.x))))));
      this.a(cju.aE, jo::i);
      this.a(cju.aF, jo::i);
      this.a(cju.bf, (Function<cjt, dsg.a>)($$0x -> c($$0x, a((cgw)$$0x, dss.a(caz.nO)))));
      this.a(cju.bi, (Function<cjt, dsg.a>)($$0x -> b($$0x, a((cgw)$$0x, dss.a(caz.nL).a(dty.a(dvv.a(0.0F, 2.0F)))))));
      this.a(cju.nc, jo::d);
      this.a(cju.bj, jo::d);
      this.a(cju.em, jo::d);
      this.a(cju.en, (Function<cjt, dsg.a>)($$0x -> a($$0x, c)));
      this.a(cju.qo, jo::d);
      this.a(cju.qn, jo::d);
      this.a(cju.ay, jo::p);
      this.a(cju.bk, q(cju.bj));
      this.a(cju.hG, (Function<cjt, dsg.a>)($$0x -> b($$0x, cju.bh)));
      this.a(cju.hF, (Function<cjt, dsg.a>)($$0x -> b($$0x, cju.bg)));
      this.a(cju.el, (Function<cjt, dsg.a>)($$0x -> b($$0x, caz.qh)));
      this.a(cju.ej, (Function<cjt, dsg.a>)($$0x -> c($$0x, caz.qh)));
      this.a(cju.ek, (Function<cjt, dsg.a>)($$0x -> b($$0x, caz.qg)));
      this.a(cju.ei, (Function<cjt, dsg.a>)($$0x -> c($$0x, caz.qg)));
      this.a(cju.jk, (Function<cjt, dsg.a>)($$0x -> dsg.b().a(dsf.a().a(dvq.a(1.0F)).a(a((cgw)$$0x, dss.a($$0x)).a(dva.a(dsd.c.a))))));
      this.a(cju.bh, jo::o);
      this.a(cju.bg, jo::o);
      this.a(cju.dm, (Function<cjt, dsg.a>)($$0x -> a($$0x, a((cgw)$$0x, dss.a(caz.ph).a(dty.a(dvv.a(2.0F, 4.0F))).a(dtc.b(cev.x)).a(dtm.a(dsb.a(1, 4)))))));
      this.a(cju.eh, (Function<cjt, dsg.a>)($$0x -> a($$0x, a((cgw)$$0x, dss.a(caz.qe).a(dty.a(dvv.a(3.0F, 7.0F))).a(dtc.b(cev.x)).a(dtm.a(dsb.c(9)))))));
      this.a(cju.cR, jo::j);
      this.a(cju.cS, jo::j);
      this.a(cju.hg, (Function<cjt, dsg.a>)($$0x -> a($$0x, a((cgw)$$0x, dss.a(caz.sv).a(dty.a(dvv.a(2.0F, 3.0F))).a(dtc.b(cev.x)).a(dtm.a(dsb.a(1, 5)))))));
      this.a(
         cju.ex,
         (Function<cjt, dsg.a>)($$0x -> dsg.b()
               .a(
                  a(
                     $$0x,
                     dsf.a()
                        .a(dvq.a(1.0F))
                        .a(
                           dss.a(caz.qr)
                              .a(dty.a(dvv.a(2.0F, 4.0F)).a(duw.a($$0x).a(cz.a.a().a(cos.b, 3))))
                              .a(dtc.b(cev.x).a(duw.a($$0x).a(cz.a.a().a(cos.b, 3))))
                        )
                  )
               ))
      );
      this.a(
         cju.cW,
         (Function<cjt, dsg.a>)($$0x -> dsg.b()
               .a(
                  dsf.a()
                     .a(dva.a(dsd.c.a))
                     .a(
                        dsm.a(
                           dsm.a(cqs.b.a(), $$1x -> dss.a(caz.oL).a(duw.a($$0x).a(cz.a.a().a(cqs.b, $$1x))).a(dty.a(dvq.a((float)$$1x.intValue())))).a(b),
                           dsm.a(
                              cqs.b.a(),
                              $$1x -> (dsv.a)($$1x == 8
                                    ? dss.a(cju.cY)
                                    : dss.a(cju.cW).a(dty.a(dvq.a((float)$$1x.intValue()))).a(duw.a($$0x).a(cz.a.a().a(cqs.b, $$1x))))
                           )
                        )
                     )
               ))
      );
      this.a(cju.G, (Function<cjt, dsg.a>)($$0x -> a($$0x, a((cgw)$$0x, dss.a(caz.os).a(duo.a(cev.x, 0.1F, 0.14285715F, 0.25F, 1.0F)).a(dss.a($$0x))))));
      this.a(cju.mR, (Function<cjt, dsg.a>)($$0x -> a($$0x, a((cgw)$$0x, dss.a(caz.mT).a(dty.a(dvq.a(2.0F)))))));
      this.a(
         cju.on,
         (Function<cjt, dsg.a>)($$0x -> a(
               $$0x, a((cgw)$$0x, dss.a(caz.qq).a(dty.a(dvv.a(2.0F, 5.0F))).a(duo.a(cev.x, 0.1F, 0.14285715F, 0.25F, 1.0F)).a(dss.a($$0x)))
            ))
      );
      this.a(cju.mS, (Function<cjt, dsg.a>)($$0x -> a($$0x, a((cgw)$$0x, dss.a(caz.ew).a(dty.a(dvq.a(1.0F)))))));
      this.a(
         cju.pg,
         (Function<cjt, dsg.a>)($$0x -> a(
               $$0x, dss.a(caz.mY).a(dty.a(dvq.a(4.0F))).a(dtc.a(cev.x)).a(dve.a(ca.a.a().a(aks.ax))).a(a((cgw)$$0x, dss.a(caz.mY).a(dty.a(dvq.a(2.0F)))))
            ))
      );
      this.c(cju.pj);
      this.c(cju.pi);
      this.c(cju.ph);
      this.c(cju.aD);
      this.c(cju.ds);
      this.c(cju.dt);
      this.c(cju.du);
      this.c(cju.dv);
      this.c(cju.dw);
      this.c(cju.dx);
      this.c(cju.dy);
      this.c(cju.dz);
      this.c(cju.dA);
      this.c(cju.dB);
      this.c(cju.dC);
      this.c(cju.dD);
      this.c(cju.dE);
      this.c(cju.dF);
      this.c(cju.dG);
      this.c(cju.dH);
      this.c(cju.eg);
      this.c(cju.gA);
      this.c(cju.gB);
      this.c(cju.gC);
      this.c(cju.gD);
      this.c(cju.gE);
      this.c(cju.gF);
      this.c(cju.gG);
      this.c(cju.gH);
      this.c(cju.gI);
      this.c(cju.gJ);
      this.c(cju.gK);
      this.c(cju.gL);
      this.c(cju.gM);
      this.c(cju.gN);
      this.c(cju.gO);
      this.c(cju.gP);
      this.c(cju.cX);
      this.c(cju.hA);
      this.c(cju.lH);
      this.c(cju.kR);
      this.c(cju.ed);
      this.c(cju.lc);
      this.c(cju.ld);
      this.c(cju.le);
      this.c(cju.lf);
      this.c(cju.lg);
      this.c(cju.lh);
      this.c(cju.li);
      this.c(cju.lj);
      this.c(cju.lk);
      this.c(cju.ll);
      this.c(cju.lm);
      this.c(cju.ln);
      this.c(cju.lo);
      this.c(cju.lp);
      this.c(cju.lq);
      this.c(cju.lr);
      this.c(cju.ls);
      this.c(cju.lt);
      this.c(cju.lu);
      this.c(cju.lv);
      this.a(cju.dV, cju.b);
      this.a(cju.dW, cju.m);
      this.a(cju.dX, cju.dP);
      this.a(cju.dY, cju.dQ);
      this.a(cju.dZ, cju.dR);
      this.a(cju.ea, cju.dS);
      this.a(cju.qL, cju.qr);
      this.c(cju.nk, cju.nl);
      this.c(cju.nm, cju.nn);
      this.a(cju.dq, a());
      this.a(cju.oN, s(cju.ow));
      this.a(cju.oO, s(cju.ox));
      this.a(cju.oP, s(cju.oy));
      this.a(cju.oQ, s(cju.oz));
      this.a(cju.oR, s(cju.oA));
      this.a(cju.oS, s(cju.oB));
      this.a(cju.oT, s(cju.oC));
      this.a(cju.oU, s(cju.oD));
      this.a(cju.oV, s(cju.oE));
      this.a(cju.oW, s(cju.oF));
      this.a(cju.oX, s(cju.oG));
      this.a(cju.oY, s(cju.oH));
      this.a(cju.oZ, s(cju.oI));
      this.a(cju.pa, s(cju.oJ));
      this.a(cju.pb, s(cju.oK));
      this.a(cju.pc, s(cju.oL));
      this.a(cju.pd, s(cju.oM));
      this.a(cju.ju, a());
      this.a(cju.ce, a());
      this.a(cju.cc, a());
      this.a(cju.cd, a());
      this.a(cju.dn, a());
      this.a(cju.pf, a());
      this.a(cju.pn, a());
      this.a(cju.qV, a());
      this.a(cju.qW, a());
      Set<abb> $$6 = Sets.newHashSet();

      for(cjt $$7 : hm.V) {
         abb $$8 = $$7.r();
         if ($$8 != dry.a && $$6.add($$8)) {
            dsg.a $$9 = (dsg.a)this.j.remove($$8);
            if ($$9 == null) {
               throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$8, hm.V.b($$7)));
            }

            $$0.accept($$8, $$9);
         }
      }

      if (!this.j.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.j.keySet());
      }
   }

   private void c(cjt $$0, cjt $$1) {
      dsg.a $$2 = c($$0, dss.a($$0).a(duo.a(cev.x, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$2);
      this.a($$1, $$2);
   }

   public static dsg.a a(cjt $$0) {
      return a($$0, clp.e, cwk.b);
   }

   public void b(cjt $$0) {
      this.a($$0, (Function<cjt, dsg.a>)($$0x -> c((cgw)((cml)$$0x).b())));
   }

   public void a(cjt $$0, cjt $$1) {
      this.a($$0, b((cgw)$$1));
   }

   public void a(cjt $$0, cgw $$1) {
      this.a($$0, a($$1));
   }

   public void c(cjt $$0) {
      this.a($$0, $$0);
   }

   public void d(cjt $$0) {
      this.a($$0, (cgw)$$0);
   }

   private void a(cjt $$0, Function<cjt, dsg.a> $$1) {
      this.a($$0, (dsg.a)$$1.apply($$0));
   }

   private void a(cjt $$0, dsg.a $$1) {
      this.j.put($$0.r(), $$1);
   }
}
