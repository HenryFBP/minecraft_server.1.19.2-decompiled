import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cmi extends cjh {
   public static final int c = 15;
   public static final cwo d = cwe.aw;
   public static final cwf e = cox.a;
   public static final cwf f = cox.b;
   public static final cwf g = cox.c;
   public static final cwf h = cox.d;
   public static final cwf i = cox.e;
   private static final Map<gy, cwf> j = (Map<gy, cwf>)cox.g.entrySet().stream().filter($$0 -> $$0.getKey() != gy.a).collect(ad.a());
   private static final dxj k = cjt.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final dxj l = cjt.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final dxj m = cjt.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final dxj n = cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final dxj E = cjt.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<cvo, dxj> F;
   private static final int G = 60;
   private static final int H = 30;
   private static final int I = 15;
   private static final int J = 5;
   private static final int K = 100;
   private static final int L = 60;
   private static final int M = 20;
   private static final int N = 5;
   private final Object2IntMap<cjt> O = new Object2IntOpenHashMap();
   private final Object2IntMap<cjt> P = new Object2IntOpenHashMap();

   public cmi(cvn.c $$0) {
      super($$0, 1.0F);
      this.k(
         this.D
            .b()
            .a(d, Integer.valueOf(0))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(h, Boolean.valueOf(false))
            .a(i, Boolean.valueOf(false))
      );
      this.F = ImmutableMap.copyOf((Map)this.D.a().stream().filter($$0x -> $$0x.c(d) == 0).collect(Collectors.toMap(Function.identity(), cmi::h)));
   }

   private static dxj h(cvo $$0) {
      dxj $$1 = dxg.a();
      if ($$0.c(i)) {
         $$1 = k;
      }

      if ($$0.c(e)) {
         $$1 = dxg.a($$1, n);
      }

      if ($$0.c(g)) {
         $$1 = dxg.a($$1, E);
      }

      if ($$0.c(f)) {
         $$1 = dxg.a($$1, m);
      }

      if ($$0.c(h)) {
         $$1 = dxg.a($$1, l);
      }

      return $$1.b() ? b : $$1;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(d)) : cju.a.m();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)this.F.get($$0.a(d, Integer.valueOf(0)));
   }

   @Override
   public cvo a(ccx $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected cvo b(cgd $$0, gt $$1) {
      gt $$2 = $$1.c();
      cvo $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, gy.b)) {
         cvo $$4 = this.m();

         for(gy $$5 : gy.values()) {
            cwf $$6 = (cwf)j.get($$5);
            if ($$6 != null) {
               $$4 = $$4.a($$6, Boolean.valueOf(this.f($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.m();
      }
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      return $$1.a_($$3).d($$1, $$3, gy.b) || this.d($$1, $$2);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      $$1.a($$2, this, a($$1.w));
      if ($$1.W().b(cgt.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         cvo $$4 = $$1.a_($$2.c());
         boolean $$5 = $$4.a($$1.q_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.Y() && this.a((cgx)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(d, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  gt $$8 = $$2.c();
                  if (!$$1.a_($$8).d($$1, $$8, gy.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.c()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.u($$2);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.b(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            gt.a $$11 = new gt.a();

            for(int $$12 = -1; $$12 <= 1; ++$$12) {
               for(int $$13 = -1; $$13 <= 1; ++$$13) {
                  for(int $$14 = -1; $$14 <= 4; ++$$14) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((cha)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ag().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Y() || !this.a((cgx)$$1, $$11))) {
                              int $$18 = Math.min(15, $$6 + $$3.a(5) / 4);
                              $$1.a($$11, this.a($$1, $$11, $$18), 3);
                           }
                        }
                     }
                  }
               }
            }

         }
      }
   }

   protected boolean a(cgx $$0, gt $$1) {
      return $$0.t($$1) || $$0.t($$1.f()) || $$0.t($$1.g()) || $$0.t($$1.d()) || $$0.t($$1.e());
   }

   private int n(cvo $$0) {
      return $$0.b(cwe.C) && $$0.c(cwe.C) ? 0 : this.P.getInt($$0.b());
   }

   private int o(cvo $$0) {
      return $$0.b(cwe.C) && $$0.c(cwe.C) ? 0 : this.O.getInt($$0.b());
   }

   private void a(cgx $$0, gt $$1, int $$2, amn $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         cvo $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.t($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cjt $$8 = $$6.b();
         if ($$8 instanceof crt) {
            crt.a($$0, $$1);
         }
      }

   }

   private cvo a(cgy $$0, gt $$1, int $$2) {
      cvo $$3 = a($$0, $$1);
      return $$3.a(cju.cc) ? $$3.a(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cgd $$0, gt $$1) {
      for(gy $$2 : gy.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cha $$0, gt $$1) {
      if (!$$0.x($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for(gy $$3 : gy.values()) {
            cvo $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(cvo $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.w));
   }

   private static int a(amn $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   private void a(cjt $$0, int $$1, int $$2) {
      this.O.put($$0, $$1);
      this.P.put($$0, $$2);
   }

   public static void b() {
      cmi $$0 = (cmi)cju.cc;
      $$0.a(cju.n, 5, 20);
      $$0.a(cju.o, 5, 20);
      $$0.a(cju.p, 5, 20);
      $$0.a(cju.q, 5, 20);
      $$0.a(cju.r, 5, 20);
      $$0.a(cju.s, 5, 20);
      $$0.a(cju.t, 5, 20);
      $$0.a(cju.ir, 5, 20);
      $$0.a(cju.is, 5, 20);
      $$0.a(cju.it, 5, 20);
      $$0.a(cju.iu, 5, 20);
      $$0.a(cju.iv, 5, 20);
      $$0.a(cju.iw, 5, 20);
      $$0.a(cju.ix, 5, 20);
      $$0.a(cju.eo, 5, 20);
      $$0.a(cju.iQ, 5, 20);
      $$0.a(cju.iR, 5, 20);
      $$0.a(cju.iS, 5, 20);
      $$0.a(cju.iT, 5, 20);
      $$0.a(cju.iU, 5, 20);
      $$0.a(cju.iV, 5, 20);
      $$0.a(cju.dd, 5, 20);
      $$0.a(cju.iW, 5, 20);
      $$0.a(cju.iX, 5, 20);
      $$0.a(cju.iY, 5, 20);
      $$0.a(cju.iZ, 5, 20);
      $$0.a(cju.ja, 5, 20);
      $$0.a(cju.jb, 5, 20);
      $$0.a(cju.cf, 5, 20);
      $$0.a(cju.eS, 5, 20);
      $$0.a(cju.eR, 5, 20);
      $$0.a(cju.eT, 5, 20);
      $$0.a(cju.gQ, 5, 20);
      $$0.a(cju.gR, 5, 20);
      $$0.a(cju.gS, 5, 20);
      $$0.a(cju.O, 5, 5);
      $$0.a(cju.P, 5, 5);
      $$0.a(cju.Q, 5, 5);
      $$0.a(cju.R, 5, 5);
      $$0.a(cju.S, 5, 5);
      $$0.a(cju.T, 5, 5);
      $$0.a(cju.U, 5, 5);
      $$0.a(cju.ac, 5, 5);
      $$0.a(cju.X, 5, 5);
      $$0.a(cju.Y, 5, 5);
      $$0.a(cju.Z, 5, 5);
      $$0.a(cju.aa, 5, 5);
      $$0.a(cju.ab, 5, 5);
      $$0.a(cju.ad, 5, 5);
      $$0.a(cju.al, 5, 5);
      $$0.a(cju.am, 5, 5);
      $$0.a(cju.an, 5, 5);
      $$0.a(cju.ao, 5, 5);
      $$0.a(cju.ap, 5, 5);
      $$0.a(cju.aq, 5, 5);
      $$0.a(cju.ar, 5, 5);
      $$0.a(cju.ae, 5, 5);
      $$0.a(cju.af, 5, 5);
      $$0.a(cju.ag, 5, 5);
      $$0.a(cju.ah, 5, 5);
      $$0.a(cju.ai, 5, 5);
      $$0.a(cju.aj, 5, 5);
      $$0.a(cju.ak, 5, 5);
      $$0.a(cju.V, 5, 20);
      $$0.a(cju.as, 30, 60);
      $$0.a(cju.at, 30, 60);
      $$0.a(cju.au, 30, 60);
      $$0.a(cju.av, 30, 60);
      $$0.a(cju.aw, 30, 60);
      $$0.a(cju.ax, 30, 60);
      $$0.a(cju.ay, 30, 60);
      $$0.a(cju.bX, 30, 20);
      $$0.a(cju.bW, 15, 100);
      $$0.a(cju.bg, 60, 100);
      $$0.a(cju.bh, 60, 100);
      $$0.a(cju.bi, 60, 100);
      $$0.a(cju.hB, 60, 100);
      $$0.a(cju.hC, 60, 100);
      $$0.a(cju.hD, 60, 100);
      $$0.a(cju.hE, 60, 100);
      $$0.a(cju.hF, 60, 100);
      $$0.a(cju.hG, 60, 100);
      $$0.a(cju.bE, 60, 100);
      $$0.a(cju.bF, 60, 100);
      $$0.a(cju.bG, 60, 100);
      $$0.a(cju.bH, 60, 100);
      $$0.a(cju.bI, 60, 100);
      $$0.a(cju.bJ, 60, 100);
      $$0.a(cju.bK, 60, 100);
      $$0.a(cju.bL, 60, 100);
      $$0.a(cju.bM, 60, 100);
      $$0.a(cju.bN, 60, 100);
      $$0.a(cju.bO, 60, 100);
      $$0.a(cju.bQ, 60, 100);
      $$0.a(cju.bP, 60, 100);
      $$0.a(cju.bn, 30, 60);
      $$0.a(cju.bo, 30, 60);
      $$0.a(cju.bp, 30, 60);
      $$0.a(cju.bq, 30, 60);
      $$0.a(cju.br, 30, 60);
      $$0.a(cju.bs, 30, 60);
      $$0.a(cju.bt, 30, 60);
      $$0.a(cju.bu, 30, 60);
      $$0.a(cju.bv, 30, 60);
      $$0.a(cju.bw, 30, 60);
      $$0.a(cju.bx, 30, 60);
      $$0.a(cju.by, 30, 60);
      $$0.a(cju.bz, 30, 60);
      $$0.a(cju.bA, 30, 60);
      $$0.a(cju.bB, 30, 60);
      $$0.a(cju.bC, 30, 60);
      $$0.a(cju.em, 15, 100);
      $$0.a(cju.hz, 5, 5);
      $$0.a(cju.hh, 60, 20);
      $$0.a(cju.nO, 15, 20);
      $$0.a(cju.hi, 60, 20);
      $$0.a(cju.hj, 60, 20);
      $$0.a(cju.hk, 60, 20);
      $$0.a(cju.hl, 60, 20);
      $$0.a(cju.hm, 60, 20);
      $$0.a(cju.hn, 60, 20);
      $$0.a(cju.ho, 60, 20);
      $$0.a(cju.hp, 60, 20);
      $$0.a(cju.hq, 60, 20);
      $$0.a(cju.hr, 60, 20);
      $$0.a(cju.hs, 60, 20);
      $$0.a(cju.ht, 60, 20);
      $$0.a(cju.hu, 60, 20);
      $$0.a(cju.hv, 60, 20);
      $$0.a(cju.hw, 60, 20);
      $$0.a(cju.hx, 60, 20);
      $$0.a(cju.kQ, 30, 60);
      $$0.a(cju.lK, 60, 60);
      $$0.a(cju.mD, 60, 60);
      $$0.a(cju.mL, 30, 20);
      $$0.a(cju.nN, 5, 20);
      $$0.a(cju.mT, 60, 100);
      $$0.a(cju.nQ, 5, 20);
      $$0.a(cju.nP, 30, 20);
      $$0.a(cju.az, 30, 60);
      $$0.a(cju.aA, 30, 60);
      $$0.a(cju.qe, 15, 60);
      $$0.a(cju.qf, 15, 60);
      $$0.a(cju.qg, 60, 100);
      $$0.a(cju.qh, 30, 60);
      $$0.a(cju.qi, 30, 60);
      $$0.a(cju.ql, 60, 100);
      $$0.a(cju.qm, 60, 100);
      $$0.a(cju.qn, 60, 100);
      $$0.a(cju.qo, 30, 60);
      $$0.a(cju.en, 15, 100);
   }
}
