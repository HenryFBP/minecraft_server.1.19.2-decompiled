import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class bvt extends bbn {
   private static final aaj<Integer> c = aam.a(bvt.class, aal.b);
   private static final aaj<Integer> d = aam.a(bvt.class, aal.b);
   private static final aaj<Float> e = aam.a(bvt.class, aal.c);
   private static final aaj<Integer> f = aam.a(bvt.class, aal.b);
   private static final aaj<Integer> ao = aam.a(bvt.class, aal.b);
   private static final aaj<Boolean> ap = aam.a(bvt.class, aal.i);
   private static final ImmutableMap<bco, ImmutableList<Integer>> aq = ImmutableMap.of(
      bco.a, ImmutableList.of(0, 1, -1), bco.f, ImmutableList.of(0, 1, -1), bco.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean ar;
   private static final Map<cws, Pair<hs, hs>> as = ad.a(Maps.newEnumMap(cws.class), $$0 -> {
      hs $$1 = gy.e.q();
      hs $$2 = gy.f.q();
      hs $$3 = gy.c.q();
      hs $$4 = gy.d.q();
      hs $$5 = $$1.n();
      hs $$6 = $$2.n();
      hs $$7 = $$3.n();
      hs $$8 = $$4.n();
      $$0.put(cws.a, Pair.of($$3, $$4));
      $$0.put(cws.b, Pair.of($$1, $$2));
      $$0.put(cws.c, Pair.of($$5, $$2));
      $$0.put(cws.d, Pair.of($$1, $$6));
      $$0.put(cws.e, Pair.of($$3, $$8));
      $$0.put(cws.f, Pair.of($$7, $$4));
      $$0.put(cws.g, Pair.of($$4, $$2));
      $$0.put(cws.h, Pair.of($$4, $$1));
      $$0.put(cws.i, Pair.of($$3, $$1));
      $$0.put(cws.j, Pair.of($$3, $$2));
   });
   private int at;
   private double au;
   private double av;
   private double aw;
   private double ax;
   private double ay;
   private double az;
   private double aA;
   private double aB;

   protected bvt(bbr<?> $$0, cgx $$1) {
      super($$0, $$1);
      this.q = true;
   }

   protected bvt(bbr<?> $$0, cgx $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.e($$2, $$3, $$4);
      this.t = $$2;
      this.u = $$3;
      this.v = $$4;
   }

   public static bvt a(cgx $$0, double $$1, double $$2, double $$3, bvt.a $$4) {
      if ($$4 == bvt.a.b) {
         return new bwa($$0, $$1, $$2, $$3);
      } else if ($$4 == bvt.a.c) {
         return new bwc($$0, $$1, $$2, $$3);
      } else if ($$4 == bvt.a.d) {
         return new bwf($$0, $$1, $$2, $$3);
      } else if ($$4 == bvt.a.e) {
         return new bwe($$0, $$1, $$2, $$3);
      } else if ($$4 == bvt.a.f) {
         return new bwd($$0, $$1, $$2, $$3);
      } else {
         return (bvt)($$4 == bvt.a.g ? new bwb($$0, $$1, $$2, $$3) : new bvz($$0, $$1, $$2, $$3));
      }
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.c;
   }

   @Override
   protected void a_() {
      this.Y.a(c, 0);
      this.Y.a(d, 1);
      this.Y.a(e, 0.0F);
      this.Y.a(f, cjt.i(cju.a.m()));
      this.Y.a(ao, 6);
      this.Y.a(ap, false);
   }

   @Override
   public boolean h(bbn $$0) {
      return bvv.a(this, $$0);
   }

   @Override
   public boolean bl() {
      return true;
   }

   @Override
   protected dwq a(gy.a $$0, n.a $$1) {
      return bcc.h(super.a($$0, $$1));
   }

   @Override
   public double bt() {
      return 0.0;
   }

   @Override
   public dwq b(bcc $$0) {
      gy $$1 = this.cw();
      if ($$1.o() == gy.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = bvy.a($$1);
         gt $$3 = this.da();
         gt.a $$4 = new gt.a();
         ImmutableList<bco> $$5 = $$0.fg();
         UnmodifiableIterator $$14 = $$5.iterator();

         while($$14.hasNext()) {
            bco $$6 = (bco)$$14.next();
            bbo $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a, 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)aq.get($$6)).iterator();

            while($$16.hasNext()) {
               int $$9 = $$16.next();

               for(int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.s.a(bvy.a(this.s, $$4), () -> bvy.a(this.s, $$4.c()));
                  if (bvy.a($$11)) {
                     dwl $$12 = new dwl((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b, (double)$$8);
                     dwq $$13 = dwq.a($$4, $$11);
                     if (bvy.a(this.s, $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14 = this.cy().e;
         $$4.c((double)$$3.u(), $$14, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while(var22.hasNext()) {
            bco $$15 = (bco)var22.next();
            double $$16 = (double)$$0.a($$15).b;
            int $$17 = ami.e($$14 - (double)$$4.v() + $$16);
            double $$18 = bvy.a($$4, $$17, $$0x -> this.s.a_($$0x).k(this.s, $$0x));
            if ($$14 + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.s.y || this.dt()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.d(-this.q());
         this.c(10);
         this.bi();
         this.a(this.n() + $$1 * 10.0F);
         this.a(czv.p, $$0.m());
         boolean $$2 = $$0.m() instanceof buc && ((buc)$$0.m()).fB().d;
         if ($$2 || this.n() > 40.0F) {
            this.bv();
            if ($$2 && !this.Y()) {
               this.ah();
            } else {
               this.a($$0);
            }
         }

         return true;
      }
   }

   @Override
   protected float aD() {
      cvo $$0 = this.s.a_(this.da());
      return $$0.a(akl.J) ? 1.0F : super.aD();
   }

   public void a(baw $$0) {
      this.ag();
      if (this.s.W().b(cgt.h)) {
         cax $$1 = new cax(this.h());
         if (this.Y()) {
            $$1.a(this.Z());
         }

         this.b($$1);
      }

   }

   abstract cat h();

   @Override
   public void bD() {
      this.d(-this.q());
      this.c(10);
      this.a(this.n() + this.n() * 10.0F);
   }

   @Override
   public boolean bk() {
      return !this.dt();
   }

   private static Pair<hs, hs> a(cws $$0) {
      return (Pair<hs, hs>)as.get($$0);
   }

   @Override
   public gy cw() {
      return this.ar ? this.cv().g().h() : this.cv().h();
   }

   @Override
   public void k() {
      if (this.o() > 0) {
         this.c(this.o() - 1);
      }

      if (this.n() > 0.0F) {
         this.a(this.n() - 1.0F);
      }

      this.ao();
      this.bB();
      if (this.s.y) {
         if (this.at > 0) {
            double $$0 = this.df() + (this.au - this.df()) / (double)this.at;
            double $$1 = this.dh() + (this.av - this.dh()) / (double)this.at;
            double $$2 = this.dl() + (this.aw - this.dl()) / (double)this.at;
            double $$3 = ami.f(this.ax - (double)this.dq());
            this.o(this.dq() + (float)$$3 / (float)this.at);
            this.p(this.ds() + (float)(this.ay - (double)this.ds()) / (float)this.at);
            --this.at;
            this.e($$0, $$1, $$2);
            this.a(this.dq(), this.ds());
         } else {
            this.am();
            this.a(this.dq(), this.ds());
         }

      } else {
         if (!this.aN()) {
            double $$4 = this.aR() ? -0.005 : -0.04;
            this.f(this.dd().b(0.0, $$4, 0.0));
         }

         int $$5 = ami.b(this.df());
         int $$6 = ami.b(this.dh());
         int $$7 = ami.b(this.dl());
         if (this.s.a_(new gt($$5, $$6 - 1, $$7)).a(akl.J)) {
            --$$6;
         }

         gt $$8 = new gt($$5, $$6, $$7);
         cvo $$9 = this.s.a_($$8);
         if (cjj.g($$9)) {
            this.c($$8, $$9);
            if ($$9.a(cju.gi)) {
               this.a($$5, $$6, $$7, $$9.c(cpf.e));
            }
         } else {
            this.j();
         }

         this.aJ();
         this.p(0.0F);
         double $$10 = this.t - this.df();
         double $$11 = this.v - this.dl();
         if ($$10 * $$10 + $$11 * $$11 > 0.001) {
            this.o((float)(ami.d($$11, $$10) * 180.0 / Math.PI));
            if (this.ar) {
               this.o(this.dq() + 180.0F);
            }
         }

         double $$12 = (double)ami.g(this.dq() - this.w);
         if ($$12 < -170.0 || $$12 >= 170.0) {
            this.o(this.dq() + 180.0F);
            this.ar = !this.ar;
         }

         this.a(this.dq(), this.ds());
         if (this.r() == bvt.a.a && this.dd().i() > 0.01) {
            List<bbn> $$13 = this.s.a(this, this.cy().c(0.2F, 0.0, 0.2F), bbq.a(this));
            if (!$$13.isEmpty()) {
               for(int $$14 = 0; $$14 < $$13.size(); ++$$14) {
                  bbn $$15 = (bbn)$$13.get($$14);
                  if (!($$15 instanceof buc) && !($$15 instanceof bnq) && !($$15 instanceof bvt) && !this.bJ() && !$$15.bI()) {
                     $$15.k(this);
                  } else {
                     $$15.g(this);
                  }
               }
            }
         } else {
            for(bbn $$16 : this.s.a_(this, this.cy().c(0.2F, 0.0, 0.2F))) {
               if (!this.u($$16) && $$16.bl() && $$16 instanceof bvt) {
                  $$16.g(this);
               }
            }
         }

         this.aY();
         if (this.bf()) {
            this.as();
            this.L *= 0.5F;
         }

         this.X = false;
      }
   }

   protected double i() {
      return (this.aR() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void j() {
      double $$0 = this.i();
      dwq $$1 = this.dd();
      this.n(ami.a($$1.c, -$$0, $$0), $$1.d, ami.a($$1.e, -$$0, $$0));
      if (this.y) {
         this.f(this.dd().a(0.5));
      }

      this.a(bci.a, this.dd());
      if (!this.y) {
         this.f(this.dd().a(0.95));
      }

   }

   protected void c(gt $$0, cvo $$1) {
      this.m();
      double $$2 = this.df();
      double $$3 = this.dh();
      double $$4 = this.dl();
      dwq $$5 = this.p($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(cju.bc)) {
         $$6 = $$1.c(cpf.e);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aR()) {
         $$8 *= 0.2;
      }

      dwq $$9 = this.dd();
      cws $$10 = $$1.c(((cjj)$$1.b()).c());
      switch($$10) {
         case c:
            this.f($$9.b(-$$8, 0.0, 0.0));
            ++$$3;
            break;
         case d:
            this.f($$9.b($$8, 0.0, 0.0));
            ++$$3;
            break;
         case e:
            this.f($$9.b(0.0, 0.0, $$8));
            ++$$3;
            break;
         case f:
            this.f($$9.b(0.0, 0.0, -$$8));
            ++$$3;
      }

      $$9 = this.dd();
      Pair<hs, hs> $$11 = a($$10);
      hs $$12 = (hs)$$11.getFirst();
      hs $$13 = (hs)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new dwq($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.f($$9);
      bbn $$19 = this.cJ();
      if ($$19 instanceof buc) {
         dwq $$20 = $$19.dd();
         double $$21 = $$20.i();
         double $$22 = this.dd().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.f(this.dd().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dd().h();
         if ($$23 < 0.03) {
            this.f(dwq.b);
         } else {
            this.f(this.dd().d(0.5, 0.0, 0.5));
         }
      }

      double $$24 = (double)$$0.u() + 0.5 + (double)$$12.u() * 0.5;
      double $$25 = (double)$$0.w() + 0.5 + (double)$$12.w() * 0.5;
      double $$26 = (double)$$0.u() + 0.5 + (double)$$13.u() * 0.5;
      double $$27 = (double)$$0.w() + 0.5 + (double)$$13.w() * 0.5;
      $$14 = $$26 - $$24;
      $$15 = $$27 - $$25;
      double $$28;
      if ($$14 == 0.0) {
         $$28 = $$4 - (double)$$0.w();
      } else if ($$15 == 0.0) {
         $$28 = $$2 - (double)$$0.u();
      } else {
         double $$30 = $$2 - $$24;
         double $$31 = $$4 - $$25;
         $$28 = ($$30 * $$14 + $$31 * $$15) * 2.0;
      }

      $$2 = $$24 + $$14 * $$28;
      $$4 = $$25 + $$15 * $$28;
      this.e($$2, $$3, $$4);
      double $$33 = this.bJ() ? 0.75 : 1.0;
      double $$34 = this.i();
      $$9 = this.dd();
      this.a(bci.a, new dwq(ami.a($$33 * $$9.c, -$$34, $$34), 0.0, ami.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && ami.b(this.df()) - $$0.u() == $$12.u() && ami.b(this.dl()) - $$0.w() == $$12.w()) {
         this.e(this.df(), this.dh() + (double)$$12.v(), this.dl());
      } else if ($$13.v() != 0 && ami.b(this.df()) - $$0.u() == $$13.u() && ami.b(this.dl()) - $$0.w() == $$13.w()) {
         this.e(this.df(), this.dh() + (double)$$13.v(), this.dl());
      }

      this.l();
      dwq $$35 = this.p(this.df(), this.dh(), this.dl());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         dwq $$37 = this.dd();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.f($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.e(this.df(), $$35.d, this.dl());
      }

      int $$39 = ami.b(this.df());
      int $$40 = ami.b(this.dl());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         dwq $$41 = this.dd();
         double $$42 = $$41.h();
         this.n($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         dwq $$43 = this.dd();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.f($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            dwq $$46 = this.dd();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == cws.b) {
               if (this.a($$0.f())) {
                  $$47 = 0.02;
               } else if (this.a($$0.g())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != cws.a) {
                  return;
               }

               if (this.a($$0.d())) {
                  $$48 = 0.02;
               } else if (this.a($$0.e())) {
                  $$48 = -0.02;
               }
            }

            this.n($$47, $$46.d, $$48);
         }
      }

   }

   private boolean a(gt $$0) {
      return this.s.a_($$0).g(this.s, $$0);
   }

   protected void l() {
      double $$0 = this.bJ() ? 0.997 : 0.96;
      dwq $$1 = this.dd();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aR()) {
         $$1 = $$1.a(0.95F);
      }

      this.f($$1);
   }

   @Nullable
   public dwq a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = ami.b($$0);
      int $$5 = ami.b($$1);
      int $$6 = ami.b($$2);
      if (this.s.a_(new gt($$4, $$5 - 1, $$6)).a(akl.J)) {
         --$$5;
      }

      cvo $$7 = this.s.a_(new gt($$4, $$5, $$6));
      if (cjj.g($$7)) {
         cws $$8 = $$7.c(((cjj)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<hs, hs> $$9 = a($$8);
         hs $$10 = (hs)$$9.getFirst();
         hs $$11 = (hs)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && ami.b($$0) - $$4 == $$10.u() && ami.b($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && ami.b($$0) - $$4 == $$11.u() && ami.b($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.p($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public dwq p(double $$0, double $$1, double $$2) {
      int $$3 = ami.b($$0);
      int $$4 = ami.b($$1);
      int $$5 = ami.b($$2);
      if (this.s.a_(new gt($$3, $$4 - 1, $$5)).a(akl.J)) {
         --$$4;
      }

      cvo $$6 = this.s.a_(new gt($$3, $$4, $$5));
      if (cjj.g($$6)) {
         cws $$7 = $$6.c(((cjj)$$6.b()).c());
         Pair<hs, hs> $$8 = a($$7);
         hs $$9 = (hs)$$8.getFirst();
         hs $$10 = (hs)$$8.getSecond();
         double $$11 = (double)$$3 + 0.5 + (double)$$9.u() * 0.5;
         double $$12 = (double)$$4 + 0.0625 + (double)$$9.v() * 0.5;
         double $$13 = (double)$$5 + 0.5 + (double)$$9.w() * 0.5;
         double $$14 = (double)$$3 + 0.5 + (double)$$10.u() * 0.5;
         double $$15 = (double)$$4 + 0.0625 + (double)$$10.v() * 0.5;
         double $$16 = (double)$$5 + 0.5 + (double)$$10.w() * 0.5;
         double $$17 = $$14 - $$11;
         double $$18 = ($$15 - $$12) * 2.0;
         double $$19 = $$16 - $$13;
         double $$20;
         if ($$17 == 0.0) {
            $$20 = $$2 - (double)$$5;
         } else if ($$19 == 0.0) {
            $$20 = $$0 - (double)$$3;
         } else {
            double $$22 = $$0 - $$11;
            double $$23 = $$2 - $$13;
            $$20 = ($$22 * $$17 + $$23 * $$19) * 2.0;
         }

         $$0 = $$11 + $$17 * $$20;
         $$1 = $$12 + $$18 * $$20;
         $$2 = $$13 + $$19 * $$20;
         if ($$18 < 0.0) {
            ++$$1;
         } else if ($$18 > 0.0) {
            $$1 += 0.5;
         }

         return new dwq($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public dwl cz() {
      dwl $$0 = this.cy();
      return this.x() ? $$0.g((double)Math.abs(this.u()) / 16.0) : $$0;
   }

   @Override
   protected void a(pj $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.b(pv.c($$0.p("DisplayState")));
         this.m($$0.h("DisplayOffset"));
      }

   }

   @Override
   protected void b(pj $$0) {
      if (this.x()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", (qc)pv.a(this.s()));
         $$0.a("DisplayOffset", this.u());
      }

   }

   @Override
   public void g(bbn $$0) {
      if (!this.s.y) {
         if (!$$0.Q && !this.Q) {
            if (!this.u($$0)) {
               double $$1 = $$0.df() - this.df();
               double $$2 = $$0.dl() - this.dl();
               double $$3 = $$1 * $$1 + $$2 * $$2;
               if ($$3 >= 1.0E-4F) {
                  $$3 = Math.sqrt($$3);
                  $$1 /= $$3;
                  $$2 /= $$3;
                  double $$4 = 1.0 / $$3;
                  if ($$4 > 1.0) {
                     $$4 = 1.0;
                  }

                  $$1 *= $$4;
                  $$2 *= $$4;
                  $$1 *= 0.1F;
                  $$2 *= 0.1F;
                  $$1 *= 0.5;
                  $$2 *= 0.5;
                  if ($$0 instanceof bvt) {
                     double $$5 = $$0.df() - this.df();
                     double $$6 = $$0.dl() - this.dl();
                     dwq $$7 = new dwq($$5, 0.0, $$6).d();
                     dwq $$8 = new dwq((double)ami.b(this.dq() * (float) (Math.PI / 180.0)), 0.0, (double)ami.a(this.dq() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     dwq $$10 = this.dd();
                     dwq $$11 = $$0.dd();
                     if (((bvt)$$0).r() == bvt.a.c && this.r() != bvt.a.c) {
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.i($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.f($$11.d(0.95, 1.0, 0.95));
                     } else if (((bvt)$$0).r() != bvt.a.c && this.r() == bvt.a.c) {
                        $$0.f($$11.d(0.2, 1.0, 0.2));
                        $$0.i($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.f($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.i($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.f($$11.d(0.2, 1.0, 0.2));
                        $$0.i($$12 + $$1, 0.0, $$13 + $$2);
                     }
                  } else {
                     this.i(-$$1, 0.0, -$$2);
                     $$0.i($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }

            }
         }
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.au = $$0;
      this.av = $$1;
      this.aw = $$2;
      this.ax = (double)$$3;
      this.ay = (double)$$4;
      this.at = $$5 + 2;
      this.n(this.az, this.aA, this.aB);
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.az = $$0;
      this.aA = $$1;
      this.aB = $$2;
      this.n(this.az, this.aA, this.aB);
   }

   public void a(float $$0) {
      this.Y.b(e, $$0);
   }

   public float n() {
      return this.Y.a(e);
   }

   public void c(int $$0) {
      this.Y.b(c, $$0);
   }

   public int o() {
      return this.Y.a(c);
   }

   public void d(int $$0) {
      this.Y.b(d, $$0);
   }

   public int q() {
      return this.Y.a(d);
   }

   public abstract bvt.a r();

   public cvo s() {
      return !this.x() ? this.t() : cjt.a(this.ai().a(f));
   }

   public cvo t() {
      return cju.a.m();
   }

   public int u() {
      return !this.x() ? this.w() : this.ai().a(ao);
   }

   public int w() {
      return 6;
   }

   @Override
   public void b(cvo $$0) {
      this.ai().b(f, cjt.i($$0));
      this.a(true);
   }

   public void m(int $$0) {
      this.ai().b(ao, $$0);
      this.a(true);
   }

   public boolean x() {
      return this.ai().a(ap);
   }

   public void a(boolean $$0) {
      this.ai().b(ap, $$0);
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }

   @Override
   public cax dn() {
      return new cax(switch(this.r()) {
         case c -> caz.mq;
         case b -> caz.mp;
         case d -> caz.mr;
         case f -> caz.ms;
         case g -> caz.sI;
         default -> caz.mo;
      });
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
