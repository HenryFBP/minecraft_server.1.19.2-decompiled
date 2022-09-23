import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public interface hz {
   Logger a = LogUtils.getLogger();
   hz b = ($$0, $$1) -> $$1;

   cax dispense(gu var1, cax var2);

   static void c() {
      clo.a(caz.mR, new hw() {
         @Override
         protected buu a(cgx $$0, hj $$1, cax $$2) {
            buk $$3 = new buk($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = bui.a.b;
            return $$3;
         }
      });
      clo.a(caz.tk, new hw() {
         @Override
         protected buu a(cgx $$0, hj $$1, cax $$2) {
            buk $$3 = new buk($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.a($$2);
            $$3.d = bui.a.b;
            return $$3;
         }
      });
      clo.a(caz.tj, new hw() {
         @Override
         protected buu a(cgx $$0, hj $$1, cax $$2) {
            bui $$3 = new buz($$0, $$1.a(), $$1.b(), $$1.c());
            $$3.d = bui.a.b;
            return $$3;
         }
      });
      clo.a(caz.pa, new hw() {
         @Override
         protected buu a(cgx $$0, hj $$1, cax $$2) {
            return ad.a(new bvc($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      clo.a(caz.oL, new hw() {
         @Override
         protected buu a(cgx $$0, hj $$1, cax $$2) {
            return ad.a(new buy($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }
      });
      clo.a(caz.rV, new hw() {
         @Override
         protected buu a(cgx $$0, hj $$1, cax $$2) {
            return ad.a(new bve($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
         }

         @Override
         protected float a() {
            return super.a() * 0.5F;
         }

         @Override
         protected float b() {
            return super.b() * 1.25F;
         }
      });
      clo.a(caz.ti, new hz() {
         @Override
         public cax dispense(gu $$0, cax $$1) {
            return (new hw() {
               @Override
               protected buu a(cgx $$0, hj $$1, cax $$2) {
                  return ad.a(new bvf($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
               }

               @Override
               protected float a() {
                  return super.a() * 0.5F;
               }

               @Override
               protected float b() {
                  return super.b() * 1.25F;
               }
            }).dispense($$0, $$1);
         }
      });
      clo.a(caz.tl, new hz() {
         @Override
         public cax dispense(gu $$0, cax $$1) {
            return (new hw() {
               @Override
               protected buu a(cgx $$0, hj $$1, cax $$2) {
                  return ad.a(new bvf($$0, $$1.a(), $$1.b(), $$1.c()), $$1x -> $$1x.a($$2));
               }

               @Override
               protected float a() {
                  return super.a() * 0.5F;
               }

               @Override
               protected float b() {
                  return super.b() * 1.25F;
               }
            }).dispense($$0, $$1);
         }
      });
      hy $$0 = new hy() {
         @Override
         public cax a(gu $$0, cax $$1) {
            gy $$2 = $$0.e().c(clo.a);
            bbr<?> $$3 = ((cbz)$$1.c()).a($$1.u());

            try {
               $$3.a($$0.g(), $$1, null, $$0.d().a($$2), bcg.o, $$2 != gy.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.d(), var6);
               return cax.b;
            }

            $$1.g(1);
            $$0.g().a(null, czv.s, $$0.d());
            return $$1;
         }
      };

      for(cbz $$1 : cbz.i()) {
         clo.a($$1, $$0);
      }

      clo.a(caz.sB, new hy() {
         @Override
         public cax a(gu $$0, cax $$1) {
            gy $$2 = $$0.e().c(clo.a);
            gt $$3 = $$0.d().a($$2);
            cgx $$4 = $$0.g();
            bql $$5 = new bql($$4, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5);
            bbr.a($$4, null, $$5, $$1.u());
            $$5.o($$2.p());
            $$4.b($$5);
            $$1.g(1);
            return $$1;
         }
      });
      clo.a(caz.mn, new ia() {
         @Override
         public cax a(gu $$0, cax $$1) {
            gt $$2 = $$0.d().a($$0.e().c(clo.a));
            List<bcc> $$3 = $$0.g().a(bcc.class, new dwl($$2), $$0x -> {
               if (!($$0x instanceof bcr)) {
                  return false;
               } else {
                  bcr $$1x = (bcr)$$0x;
                  return !$$1x.d() && $$1x.c();
               }
            });
            if (!$$3.isEmpty()) {
               ((bcr)$$3.get(0)).a(ajx.e);
               $$1.g(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      hy $$2 = new ia() {
         @Override
         protected cax a(gu $$0, cax $$1) {
            gt $$2 = $$0.d().a($$0.e().c(clo.a));

            for(bpa $$4 : $$0.g().a(bpa.class, new dwl($$2), $$0x -> $$0x.bo() && $$0x.gl())) {
               if ($$4.m($$1) && !$$4.gm() && $$4.fS()) {
                  $$4.k(401).a($$1.a(1));
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      };
      clo.a(caz.sF, $$2);
      clo.a(caz.sC, $$2);
      clo.a(caz.sD, $$2);
      clo.a(caz.sE, $$2);
      clo.a(caz.gI, $$2);
      clo.a(caz.gJ, $$2);
      clo.a(caz.gR, $$2);
      clo.a(caz.gT, $$2);
      clo.a(caz.gU, $$2);
      clo.a(caz.gX, $$2);
      clo.a(caz.gP, $$2);
      clo.a(caz.gV, $$2);
      clo.a(caz.gL, $$2);
      clo.a(caz.gQ, $$2);
      clo.a(caz.gN, $$2);
      clo.a(caz.gK, $$2);
      clo.a(caz.gO, $$2);
      clo.a(caz.gS, $$2);
      clo.a(caz.gW, $$2);
      clo.a(caz.gM, $$2);
      clo.a(caz.dW, new ia() {
         @Override
         public cax a(gu $$0, cax $$1) {
            gt $$2 = $$0.d().a($$0.e().c(clo.a));

            for(boz $$4 : $$0.g().a(boz.class, new dwl($$2), $$0x -> $$0x.bo() && !$$0x.t())) {
               if ($$4.fS() && $$4.k(499).a($$1)) {
                  $$1.g(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      clo.a(caz.sq, new hy() {
         @Override
         public cax a(gu $$0, cax $$1) {
            gy $$2 = $$0.e().c(clo.a);
            bup $$3 = new bup($$0.g(), $$1, $$0.a(), $$0.b(), $$0.a(), true);
            hz.a($$0, $$3, $$2);
            $$3.c((double)$$2.j(), (double)$$2.k(), (double)$$2.l(), 0.5F, 1.0F);
            $$0.g().b($$3);
            $$1.g(1);
            return $$1;
         }

         @Override
         protected void a(gu $$0) {
            $$0.g().c(1004, $$0.d(), 0);
         }
      });
      clo.a(caz.rW, new hy() {
         @Override
         public cax a(gu $$0, cax $$1) {
            gy $$2 = $$0.e().c(clo.a);
            hj $$3 = clo.a($$0);
            double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3F);
            double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3F);
            double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3F);
            cgx $$7 = $$0.g();
            amn $$8 = $$7.w;
            double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
            double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
            double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
            bux $$12 = new bux($$7, $$4, $$5, $$6, $$9, $$10, $$11);
            $$7.b(ad.a($$12, $$1x -> $$1x.a($$1)));
            $$1.g(1);
            return $$1;
         }

         @Override
         protected void a(gu $$0) {
            $$0.g().c(1018, $$0.d(), 0);
         }
      });
      clo.a(caz.mw, new hx(bvv.b.a));
      clo.a(caz.my, new hx(bvv.b.b));
      clo.a(caz.mA, new hx(bvv.b.c));
      clo.a(caz.mC, new hx(bvv.b.d));
      clo.a(caz.mG, new hx(bvv.b.f));
      clo.a(caz.mE, new hx(bvv.b.e));
      clo.a(caz.mI, new hx(bvv.b.g));
      clo.a(caz.mx, new hx(bvv.b.a, true));
      clo.a(caz.mz, new hx(bvv.b.b, true));
      clo.a(caz.mB, new hx(bvv.b.c, true));
      clo.a(caz.mD, new hx(bvv.b.d, true));
      clo.a(caz.mH, new hx(bvv.b.f, true));
      clo.a(caz.mF, new hx(bvv.b.e, true));
      clo.a(caz.mJ, new hx(bvv.b.g, true));
      hz $$3 = new hy() {
         private final hy c = new hy();

         @Override
         public cax a(gu $$0, cax $$1) {
            bzo $$2 = (bzo)$$1.c();
            gt $$3 = $$0.d().a($$0.e().c(clo.a));
            cgx $$4 = $$0.g();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return new cax(caz.oH);
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      clo.a(caz.oJ, $$3);
      clo.a(caz.oI, $$3);
      clo.a(caz.oK, $$3);
      clo.a(caz.oP, $$3);
      clo.a(caz.oQ, $$3);
      clo.a(caz.oO, $$3);
      clo.a(caz.oR, $$3);
      clo.a(caz.oS, $$3);
      clo.a(caz.oT, $$3);
      clo.a(caz.oH, new hy() {
         private final hy c = new hy();

         @Override
         public cax a(gu $$0, cax $$1) {
            cgy $$2 = $$0.g();
            gt $$3 = $$0.d().a($$0.e().c(clo.a));
            cvo $$4 = $$2.a_($$3);
            cjt $$5 = $$4.b();
            if ($$5 instanceof cjy) {
               cax $$6 = ((cjy)$$5).c($$2, $$3, $$4);
               if ($$6.b()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, czv.y, $$3);
                  cat $$7 = $$6.c();
                  $$1.g(1);
                  if ($$1.b()) {
                     return new cax($$7);
                  } else {
                     if ($$0.<ctu>f().a(new cax($$7)) < 0) {
                        this.c.dispense($$0, new cax($$7));
                     }

                     return $$1;
                  }
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      clo.a(caz.mO, new ia() {
         @Override
         protected cax a(gu $$0, cax $$1) {
            cgx $$2 = $$0.g();
            this.a(true);
            gy $$3 = $$0.e().c(clo.a);
            gt $$4 = $$0.d().a($$3);
            cvo $$5 = $$2.a_($$4);
            if (cjh.a($$2, $$4, $$3)) {
               $$2.b($$4, cjh.a($$2, $$4));
               $$2.a(null, czv.i, $$4);
            } else if (cke.h($$5) || ckf.g($$5) || ckg.g($$5)) {
               $$2.b($$4, $$5.a(cwe.r, Boolean.valueOf(true)));
               $$2.a(null, czv.c, $$4);
            } else if ($$5.b() instanceof crt) {
               crt.a($$2, $$4);
               $$2.a($$4, false);
            } else {
               this.a(false);
            }

            if (this.a() && $$1.a(1, $$2.w, null)) {
               $$1.e(0);
            }

            return $$1;
         }
      });
      clo.a(caz.pH, new ia() {
         @Override
         protected cax a(gu $$0, cax $$1) {
            this.a(true);
            cgx $$2 = $$0.g();
            gt $$3 = $$0.d().a($$0.e().c(clo.a));
            if (!byz.a($$1, $$2, $$3) && !byz.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.y) {
               $$2.c(1505, $$3, 0);
            }

            return $$1;
         }
      });
      clo.a(cju.bW, new hy() {
         @Override
         protected cax a(gu $$0, cax $$1) {
            cgx $$2 = $$0.g();
            gt $$3 = $$0.d().a($$0.e().c(clo.a));
            bqw $$4 = new bqw($$2, (double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5, null);
            $$2.b($$4);
            $$2.a(null, $$4.df(), $$4.dh(), $$4.dl(), ajw.uJ, ajx.e, 1.0F, 1.0F);
            $$2.a(null, czv.s, $$3);
            $$1.g(1);
            return $$1;
         }
      });
      hz $$4 = new ia() {
         @Override
         protected cax a(gu $$0, cax $$1) {
            this.a(byo.a($$0, $$1));
            return $$1;
         }
      };
      clo.a(caz.sm, $$4);
      clo.a(caz.sl, $$4);
      clo.a(caz.sn, $$4);
      clo.a(caz.si, $$4);
      clo.a(caz.sk, $$4);
      clo.a(caz.sj, new ia() {
         @Override
         protected cax a(gu $$0, cax $$1) {
            cgx $$2 = $$0.g();
            gy $$3 = $$0.e().c(clo.a);
            gt $$4 = $$0.d().a($$3);
            if ($$2.x($$4) && cst.b($$2, $$4, $$1)) {
               $$2.a($$4, cju.fJ.m().a(cqm.b, Integer.valueOf($$3.o() == gy.a.b ? 0 : $$3.g().e() * 4)), 3);
               $$2.a(null, czv.i, $$4);
               cti $$5 = $$2.c_($$4);
               if ($$5 instanceof cul) {
                  cst.a($$2, $$4, (cul)$$5);
               }

               $$1.g(1);
               this.a(true);
            } else {
               this.a(byo.a($$0, $$1));
            }

            return $$1;
         }
      });
      clo.a(cju.do, new ia() {
         @Override
         protected cax a(gu $$0, cax $$1) {
            cgx $$2 = $$0.g();
            gt $$3 = $$0.d().a($$0.e().c(clo.a));
            ckk $$4 = (ckk)cju.do;
            if ($$2.x($$3) && $$4.a($$2, $$3)) {
               if (!$$2.y) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, czv.i, $$3);
               }

               $$1.g(1);
               this.a(true);
            } else {
               this.a(byo.a($$0, $$1));
            }

            return $$1;
         }
      });
      clo.a(cju.jB.l(), new ic());

      for(bzq $$5 : bzq.values()) {
         clo.a(cqj.a($$5).l(), new ic());
      }

      clo.a(caz.qt.l(), new ia() {
         private final hy c = new hy();

         private cax a(gu $$0, cax $$1, cax $$2) {
            $$1.g(1);
            if ($$1.b()) {
               $$0.g().a(null, czv.y, $$0.d());
               return $$2.o();
            } else {
               if ($$0.<ctu>f().a($$2.o()) < 0) {
                  this.c.dispense($$0, $$2.o());
               }

               return $$1;
            }
         }

         @Override
         public cax a(gu $$0, cax $$1) {
            this.a(false);
            agg $$2 = $$0.g();
            gt $$3 = $$0.d().a($$0.e().c(clo.a));
            cvo $$4 = $$2.a_($$3);
            if ($$4.a(akl.ax, $$0x -> $$0x.b(cjn.b) && $$0x.b() instanceof cjn) && $$4.c(cjn.b) >= 5) {
               ((cjn)$$4.b()).a($$2, $$4, $$3, null, ctf.b.b);
               this.a(true);
               return this.a($$0, $$1, new cax(caz.uq));
            } else if ($$2.b_($$3).a(akp.a)) {
               this.a(true);
               return this.a($$0, $$1, ccu.a(new cax(caz.qs), ccv.b));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      clo.a(caz.eB, new ia() {
         @Override
         public cax a(gu $$0, cax $$1) {
            gy $$2 = $$0.e().c(clo.a);
            gt $$3 = $$0.d().a($$2);
            cgx $$4 = $$0.g();
            cvo $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(cju.nW)) {
               if ($$5.c(cpr.c) != 4) {
                  cpr.a($$4, $$3, $$5);
                  $$1.g(1);
               } else {
                  this.a(false);
               }

               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      clo.a(caz.qd.l(), new ib());
      clo.a(caz.un, new ia() {
         @Override
         public cax a(gu $$0, cax $$1) {
            gt $$2 = $$0.d().a($$0.e().c(clo.a));
            cgx $$3 = $$0.g();
            cvo $$4 = $$3.a_($$2);
            Optional<cvo> $$5 = cao.b($$4);
            if ($$5.isPresent()) {
               $$3.b($$2, (cvo)$$5.get());
               $$3.c(3003, $$2, 0);
               $$1.g(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      clo.a(caz.qs, new hy() {
         private final hy c = new hy();

         @Override
         public cax a(gu $$0, cax $$1) {
            if (ccu.d($$1) != ccv.b) {
               return this.c.dispense($$0, $$1);
            } else {
               agg $$2 = $$0.g();
               gt $$3 = $$0.d();
               gt $$4 = $$0.d().a($$0.e().c(clo.a));
               if (!$$2.a_($$4).a(akl.bP)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$2.y) {
                     for(int $$5 = 0; $$5 < 5; ++$$5) {
                        $$2.a(io.af, (double)$$3.u() + $$2.w.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.w.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$2.a(null, $$3, ajw.bR, ajx.e, 1.0F, 1.0F);
                  $$2.a(null, czv.z, $$3);
                  $$2.b($$4, cju.qq.m());
                  return new cax(caz.qt);
               }
            }
         }
      });
   }

   static void a(gu $$0, bbn $$1, gy $$2) {
      $$1.e(
         $$0.a() + (double)$$2.j() * (0.5000099999997474 - (double)$$1.cW() / 2.0),
         $$0.b() + (double)$$2.k() * (0.5000099999997474 - (double)$$1.cX() / 2.0) - (double)$$1.cX() / 2.0,
         $$0.c() + (double)$$2.l() * (0.5000099999997474 - (double)$$1.cW() / 2.0)
      );
   }
}
