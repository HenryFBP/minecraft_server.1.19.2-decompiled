import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class dbj {
   private static final cvo a = cju.gk.m();
   private static final cvo b = cju.gl.m();
   private static final cvo c = cju.hy.m();
   private static final cvo d = cju.go.m();
   private static final cvo e = cju.gw.m();
   private static final cvo f = cju.gy.m();
   private static final cvo g = cju.gs.m();
   private static final cvo h = cju.hA.m();
   private static final cvo i = cju.cY.m();
   private final cvo j;
   private final int k;
   private final cvo[] l;
   private final dpa m;
   private final dpa n;
   private final dpa o;
   private final dpa p;
   private final dpa q;
   private final dpa r;
   private final dpa s;
   private final dbe t;
   private final dpa u;
   private final dpa v;

   public dbj(dbf $$0, cvo $$1, int $$2, dbe $$3) {
      this.j = $$1;
      this.k = $$2;
      this.t = $$3;
      this.m = $$0.a(dba.P);
      this.l = a($$3.a(new abb("clay_bands")));
      this.u = $$0.a(dba.N);
      this.v = $$0.a(dba.O);
      this.n = $$0.a(dba.Q);
      this.o = $$0.a(dba.R);
      this.p = $$0.a(dba.S);
      this.q = $$0.a(dba.T);
      this.r = $$0.a(dba.U);
      this.s = $$0.a(dba.V);
   }

   public void a(dbf $$0, chv $$1, hm<cht> $$2, boolean $$3, dbn $$4, final cxj $$5, dav $$6, dbi.o $$7) {
      final gt.a $$8 = new gt.a();
      final cge $$9 = $$5.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      cxg $$12 = new cxg() {
         @Override
         public cvo a(int $$0) {
            return $$5.a_($$8.q($$0));
         }

         @Override
         public void a(int $$0, cvo $$1) {
            cgz $$2 = $$5.z();
            if ($$0 >= $$2.u_() && $$0 < $$2.ah()) {
               $$5.a($$8.q($$0), $$1, false);
               if (!$$1.p().c()) {
                  $$5.e($$8);
               }
            }

         }

         public String toString() {
            return "ChunkBlockColumn " + $$9;
         }
      };
      dbi.g $$13 = new dbi.g(this, $$0, $$5, $$6, $$1::a, $$2, $$4);
      dbi.u $$14 = (dbi.u)$$7.apply($$13);
      gt.a $$15 = new gt.a();

      for(int $$16 = 0; $$16 < 16; ++$$16) {
         for(int $$17 = 0; $$17 < 16; ++$$17) {
            int $$18 = $$10 + $$16;
            int $$19 = $$11 + $$17;
            int $$20 = $$5.a(dar.a.a, $$16, $$17) + 1;
            $$8.p($$18).r($$19);
            hc<cht> $$21 = $$1.a($$15.d($$18, $$3 ? 0 : $$20, $$19));
            if ($$21.a(cia.B)) {
               this.a($$12, $$18, $$19, $$20, $$5);
            }

            int $$22 = $$5.a(dar.a.a, $$16, $$17) + 1;
            $$13.a($$18, $$19);
            int $$23 = 0;
            int $$24 = Integer.MIN_VALUE;
            int $$25 = Integer.MAX_VALUE;
            int $$26 = $$5.u_();

            for(int $$27 = $$22; $$27 >= $$26; --$$27) {
               cvo $$28 = $$12.a($$27);
               if ($$28.h()) {
                  $$23 = 0;
                  $$24 = Integer.MIN_VALUE;
               } else if (!$$28.p().c()) {
                  if ($$24 == Integer.MIN_VALUE) {
                     $$24 = $$27 + 1;
                  }
               } else {
                  if ($$25 >= $$27) {
                     $$25 = cyu.g;

                     for(int $$29 = $$27 - 1; $$29 >= $$26 - 1; --$$29) {
                        cvo $$30 = $$12.a($$29);
                        if (!this.a($$30)) {
                           $$25 = $$29 + 1;
                           break;
                        }
                     }
                  }

                  ++$$23;
                  int $$31 = $$27 - $$25 + 1;
                  $$13.a($$23, $$31, $$24, $$18, $$27, $$19);
                  if ($$28 == this.j) {
                     cvo $$32 = $$14.tryApply($$18, $$27, $$19);
                     if ($$32 != null) {
                        $$12.a($$27, $$32);
                     }
                  }
               }
            }

            if ($$21.a(cia.V) || $$21.a(cia.W)) {
               this.a($$13.b(), $$21.a(), $$12, $$15, $$18, $$19, $$20);
            }
         }
      }

   }

   protected int a(int $$0, int $$1) {
      double $$2 = this.u.a((double)$$0, 0.0, (double)$$1);
      return (int)($$2 * 2.75 + 3.0 + this.t.a($$0, 0, $$1).j() * 0.25);
   }

   protected double b(int $$0, int $$1) {
      return this.v.a((double)$$0, 0.0, (double)$$1);
   }

   private boolean a(cvo $$0) {
      return !$$0.h() && $$0.p().c();
   }

   @Deprecated
   public Optional<cvo> a(dbi.o $$0, dcp $$1, Function<gt, hc<cht>> $$2, cxj $$3, dav $$4, gt $$5, boolean $$6) {
      dbi.g $$7 = new dbi.g(this, $$1.d(), $$3, $$4, $$2, $$1.c().d(hm.aR), $$1);
      dbi.u $$8 = (dbi.u)$$0.apply($$7);
      int $$9 = $$5.u();
      int $$10 = $$5.v();
      int $$11 = $$5.w();
      $$7.a($$9, $$11);
      $$7.a(1, 1, $$6 ? $$10 + 1 : Integer.MIN_VALUE, $$9, $$10, $$11);
      cvo $$12 = $$8.tryApply($$9, $$10, $$11);
      return Optional.ofNullable($$12);
   }

   private void a(cxg $$0, int $$1, int $$2, int $$3, cgz $$4) {
      double $$5 = 0.2;
      double $$6 = Math.min(Math.abs(this.p.a((double)$$1, 0.0, (double)$$2) * 8.25), this.n.a((double)$$1 * 0.2, 0.0, (double)$$2 * 0.2) * 15.0);
      if (!($$6 <= 0.0)) {
         double $$7 = 0.75;
         double $$8 = 1.5;
         double $$9 = Math.abs(this.o.a((double)$$1 * 0.75, 0.0, (double)$$2 * 0.75) * 1.5);
         double $$10 = 64.0 + Math.min($$6 * $$6 * 2.5, Math.ceil($$9 * 50.0) + 24.0);
         int $$11 = ami.b($$10);
         if ($$3 <= $$11) {
            for(int $$12 = $$11; $$12 >= $$4.u_(); --$$12) {
               cvo $$13 = $$0.a($$12);
               if ($$13.a(this.j.b())) {
                  break;
               }

               if ($$13.a(cju.C)) {
                  return;
               }
            }

            for(int $$14 = $$11; $$14 >= $$4.u_() && $$0.a($$14).h(); --$$14) {
               $$0.a($$14, this.j);
            }

         }
      }
   }

   private void a(int $$0, cht $$1, cxg $$2, gt.a $$3, int $$4, int $$5, int $$6) {
      double $$7 = 1.28;
      double $$8 = Math.min(Math.abs(this.s.a((double)$$4, 0.0, (double)$$5) * 8.25), this.q.a((double)$$4 * 1.28, 0.0, (double)$$5 * 1.28) * 15.0);
      if (!($$8 <= 1.8)) {
         double $$9 = 1.17;
         double $$10 = 1.5;
         double $$11 = Math.abs(this.r.a((double)$$4 * 1.17, 0.0, (double)$$5 * 1.17) * 1.5);
         double $$12 = Math.min($$8 * $$8 * 1.2, Math.ceil($$11 * 40.0) + 14.0);
         if ($$1.c($$3.d($$4, 63, $$5))) {
            $$12 -= 2.0;
         }

         double $$13;
         if ($$12 > 2.0) {
            $$13 = (double)this.k - $$12 - 7.0;
            $$12 += (double)this.k;
         } else {
            $$12 = 0.0;
            $$13 = 0.0;
         }

         double $$15 = $$12;
         amn $$16 = this.t.a($$4, 0, $$5);
         int $$17 = 2 + $$16.a(4);
         int $$18 = this.k + 18 + $$16.a(10);
         int $$19 = 0;

         for(int $$20 = Math.max($$6, (int)$$12 + 1); $$20 >= $$0; --$$20) {
            if ($$2.a($$20).h() && $$20 < (int)$$15 && $$16.j() > 0.01
               || $$2.a($$20).d() == dpz.j && $$20 > (int)$$13 && $$20 < this.k && $$13 != 0.0 && $$16.j() > 0.15) {
               if ($$19 <= $$17 && $$20 > $$18) {
                  $$2.a($$20, i);
                  ++$$19;
               } else {
                  $$2.a($$20, h);
               }
            }
         }

      }
   }

   private static cvo[] a(amn $$0) {
      cvo[] $$1 = new cvo[192];
      Arrays.fill($$1, c);

      for(int $$2 = 0; $$2 < $$1.length; ++$$2) {
         $$2 += $$0.a(5) + 1;
         if ($$2 < $$1.length) {
            $$1[$$2] = b;
         }
      }

      a($$0, $$1, 1, d);
      a($$0, $$1, 2, e);
      a($$0, $$1, 1, f);
      int $$3 = $$0.a(9, 15);
      int $$4 = 0;

      for(int $$5 = 0; $$4 < $$3 && $$5 < $$1.length; $$5 += $$0.a(16) + 4) {
         $$1[$$5] = a;
         if ($$5 - 1 > 0 && $$0.h()) {
            $$1[$$5 - 1] = g;
         }

         if ($$5 + 1 < $$1.length && $$0.h()) {
            $$1[$$5 + 1] = g;
         }

         ++$$4;
      }

      return $$1;
   }

   private static void a(amn $$0, cvo[] $$1, int $$2, cvo $$3) {
      int $$4 = $$0.a(6, 15);

      for(int $$5 = 0; $$5 < $$4; ++$$5) {
         int $$6 = $$2 + $$0.a(3);
         int $$7 = $$0.a($$1.length);

         for(int $$8 = 0; $$7 + $$8 < $$1.length && $$8 < $$6; ++$$8) {
            $$1[$$7 + $$8] = $$3;
         }
      }

   }

   protected cvo a(int $$0, int $$1, int $$2) {
      int $$3 = (int)Math.round(this.m.a((double)$$0, 0.0, (double)$$2) * 4.0);
      return this.l[($$1 + $$3 + this.l.length) % this.l.length];
   }
}
