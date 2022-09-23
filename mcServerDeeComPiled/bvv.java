import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class bvv extends bbn {
   private static final aaj<Integer> f = aam.a(bvv.class, aal.b);
   private static final aaj<Integer> ao = aam.a(bvv.class, aal.b);
   private static final aaj<Float> ap = aam.a(bvv.class, aal.c);
   private static final aaj<Integer> aq = aam.a(bvv.class, aal.b);
   private static final aaj<Boolean> ar = aam.a(bvv.class, aal.i);
   private static final aaj<Boolean> as = aam.a(bvv.class, aal.i);
   private static final aaj<Integer> at = aam.a(bvv.class, aal.b);
   public static final int b = 0;
   public static final int c = 1;
   private static final int au = 60;
   private static final float av = (float) (Math.PI / 8);
   public static final double d = (float) (Math.PI / 4);
   public static final int e = 60;
   private final float[] aw = new float[2];
   private float ax;
   private float ay;
   private float az;
   private int aA;
   private double aB;
   private double aC;
   private double aD;
   private double aE;
   private double aF;
   private boolean aG;
   private boolean aH;
   private boolean aI;
   private boolean aJ;
   private double aK;
   private float aL;
   private bvv.a aM;
   private bvv.a aN;
   private double aO;
   private boolean aP;
   private boolean aQ;
   private float aR;
   private float aS;
   private float aT;

   public bvv(bbr<? extends bvv> $$0, cgx $$1) {
      super($$0, $$1);
      this.q = true;
   }

   public bvv(cgx $$0, double $$1, double $$2, double $$3) {
      this(bbr.j, $$0);
      this.e($$1, $$2, $$3);
      this.t = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected float a(bco $$0, bbo $$1) {
      return $$1.b;
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.c;
   }

   @Override
   protected void a_() {
      this.Y.a(f, 0);
      this.Y.a(ao, 1);
      this.Y.a(ap, 0.0F);
      this.Y.a(aq, bvv.b.a.ordinal());
      this.Y.a(ar, false);
      this.Y.a(as, false);
      this.Y.a(at, 0);
   }

   @Override
   public boolean h(bbn $$0) {
      return a(this, $$0);
   }

   public static boolean a(bbn $$0, bbn $$1) {
      return ($$1.bq() || $$1.bl()) && !$$0.v($$1);
   }

   @Override
   public boolean bq() {
      return true;
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
      return -0.1;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.s.y && !this.dt()) {
         this.m(-this.r());
         this.d(10);
         this.a(this.o() + $$1 * 10.0F);
         this.bi();
         this.a(czv.p, $$0.m());
         boolean $$2 = $$0.m() instanceof buc && ((buc)$$0.m()).fB().d;
         if ($$2 || this.o() > 40.0F) {
            if (!$$2 && this.s.W().b(cgt.h)) {
               this.a($$0);
            }

            this.ah();
         }

         return true;
      } else {
         return true;
      }
   }

   protected void a(baw $$0) {
      this.a(this.h());
   }

   @Override
   public void k(boolean $$0) {
      if (!this.s.y) {
         this.aP = true;
         this.aQ = $$0;
         if (this.D() == 0) {
            this.a(60);
         }
      }

      this.s.a(io.af, this.df() + (double)this.R.i(), this.dh() + 0.7, this.dl() + (double)this.R.i(), 0.0, 0.0, 0.0);
      if (this.R.a(20) == 0) {
         this.s.a(this.df(), this.dh(), this.dl(), this.aH(), this.cR(), 1.0F, 0.8F + 0.4F * this.R.i(), false);
         this.a(czv.Q, this.cG());
      }

   }

   @Override
   public void g(bbn $$0) {
      if ($$0 instanceof bvv) {
         if ($$0.cy().b < this.cy().e) {
            super.g($$0);
         }
      } else if ($$0.cy().b <= this.cy().b) {
         super.g($$0);
      }

   }

   public cat h() {
      switch(this.s()) {
         case a:
         default:
            return caz.mw;
         case b:
            return caz.my;
         case c:
            return caz.mA;
         case d:
            return caz.mC;
         case e:
            return caz.mE;
         case f:
            return caz.mG;
         case g:
            return caz.mI;
      }
   }

   @Override
   public void bD() {
      this.m(-this.r());
      this.d(10);
      this.a(this.o() * 11.0F);
   }

   @Override
   public boolean bk() {
      return !this.dt();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.aB = $$0;
      this.aC = $$1;
      this.aD = $$2;
      this.aE = (double)$$3;
      this.aF = (double)$$4;
      this.aA = 10;
   }

   @Override
   public gy cw() {
      return this.cv().h();
   }

   @Override
   public void k() {
      this.aN = this.aM;
      this.aM = this.x();
      if (this.aM != bvv.a.b && this.aM != bvv.a.c) {
         this.ay = 0.0F;
      } else {
         ++this.ay;
      }

      if (!this.s.y && this.ay >= 60.0F) {
         this.bv();
      }

      if (this.q() > 0) {
         this.d(this.q() - 1);
      }

      if (this.o() > 0.0F) {
         this.a(this.o() - 1.0F);
      }

      super.k();
      this.w();
      if (this.cP()) {
         if (!(this.cJ() instanceof buc)) {
            this.a(false, false);
         }

         this.A();
         if (this.s.y) {
            this.C();
            this.s.a(new yk(this.c(0), this.c(1)));
         }

         this.a(bci.a, this.dd());
      } else {
         this.f(dwq.b);
      }

      this.u();

      for(int $$0 = 0; $$0 <= 1; ++$$0) {
         if (this.c($$0)) {
            if (!this.aM()
               && (double)(this.aw[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.aw[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               ajv $$1 = this.i();
               if ($$1 != null) {
                  dwq $$2 = this.e(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.e : $$2.e;
                  double $$4 = $$0 == 1 ? $$2.c : -$$2.c;
                  this.s.a(null, this.df() + $$3, this.dh(), this.dl() + $$4, $$1, this.cR(), 1.0F, 0.8F + 0.4F * this.R.i());
               }
            }

            this.aw[$$0] += (float) (Math.PI / 8);
         } else {
            this.aw[$$0] = 0.0F;
         }
      }

      this.aJ();
      List<bbn> $$5 = this.s.a(this, this.cy().c(0.2F, -0.01F, 0.2F), bbq.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.s.y && !(this.cG() instanceof buc);

         for(int $$7 = 0; $$7 < $$5.size(); ++$$7) {
            bbn $$8 = (bbn)$$5.get($$7);
            if (!$$8.u(this)) {
               if ($$6
                  && this.cI().size() < this.t()
                  && !$$8.bI()
                  && $$8.cW() < this.cW()
                  && $$8 instanceof bcc
                  && !($$8 instanceof bog)
                  && !($$8 instanceof buc)) {
                  $$8.k(this);
               } else {
                  this.g($$8);
               }
            }
         }
      }

   }

   private void u() {
      if (this.s.y) {
         int $$0 = this.D();
         if ($$0 > 0) {
            this.aR += 0.05F;
         } else {
            this.aR -= 0.1F;
         }

         this.aR = ami.a(this.aR, 0.0F, 1.0F);
         this.aT = this.aS;
         this.aS = 10.0F * (float)Math.sin((double)(0.5F * (float)this.s.U())) * this.aR;
      } else {
         if (!this.aP) {
            this.a(0);
         }

         int $$1 = this.D();
         if ($$1 > 0) {
            this.a(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.a(0);
               dwq $$3 = this.dd();
               if (this.aQ) {
                  this.f($$3.b(0.0, -0.7, 0.0));
                  this.bv();
               } else {
                  this.n($$3.c, this.a($$0 -> $$0 instanceof buc) ? 2.7 : 0.6, $$3.e);
               }
            }

            this.aP = false;
         }
      }

   }

   @Nullable
   protected ajv i() {
      switch(this.x()) {
         case a:
         case b:
         case c:
            return ajw.bH;
         case d:
            return ajw.bG;
         case e:
         default:
            return null;
      }
   }

   private void w() {
      if (this.cP()) {
         this.aA = 0;
         this.d(this.df(), this.dh(), this.dl());
      }

      if (this.aA > 0) {
         double $$0 = this.df() + (this.aB - this.df()) / (double)this.aA;
         double $$1 = this.dh() + (this.aC - this.dh()) / (double)this.aA;
         double $$2 = this.dl() + (this.aD - this.dl()) / (double)this.aA;
         double $$3 = ami.f(this.aE - (double)this.dq());
         this.o(this.dq() + (float)$$3 / (float)this.aA);
         this.p(this.ds() + (float)(this.aF - (double)this.ds()) / (float)this.aA);
         --this.aA;
         this.e($$0, $$1, $$2);
         this.a(this.dq(), this.ds());
      }
   }

   public void a(boolean $$0, boolean $$1) {
      this.Y.b(ar, $$0);
      this.Y.b(as, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? ami.b(this.aw[$$0] - (float) (Math.PI / 8), this.aw[$$0], $$1) : 0.0F;
   }

   private bvv.a x() {
      bvv.a $$0 = this.z();
      if ($$0 != null) {
         this.aK = this.cy().e;
         return $$0;
      } else if (this.y()) {
         return bvv.a.a;
      } else {
         float $$1 = this.l();
         if ($$1 > 0.0F) {
            this.aL = $$1;
            return bvv.a.d;
         } else {
            return bvv.a.e;
         }
      }
   }

   public float j() {
      dwl $$0 = this.cy();
      int $$1 = ami.b($$0.a);
      int $$2 = ami.e($$0.d);
      int $$3 = ami.b($$0.e);
      int $$4 = ami.e($$0.e - this.aO);
      int $$5 = ami.b($$0.c);
      int $$6 = ami.e($$0.f);
      gt.a $$7 = new gt.a();

      label39:
      for(int $$8 = $$3; $$8 < $$4; ++$$8) {
         float $$9 = 0.0F;

         for(int $$10 = $$1; $$10 < $$2; ++$$10) {
            for(int $$11 = $$5; $$11 < $$6; ++$$11) {
               $$7.d($$10, $$8, $$11);
               dpv $$12 = this.s.b_($$7);
               if ($$12.a(akp.a)) {
                  $$9 = Math.max($$9, $$12.a((cgd)this.s, $$7));
               }

               if ($$9 >= 1.0F) {
                  continue label39;
               }
            }
         }

         if ($$9 < 1.0F) {
            return (float)$$7.v() + $$9;
         }
      }

      return (float)($$4 + 1);
   }

   public float l() {
      dwl $$0 = this.cy();
      dwl $$1 = new dwl($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = ami.b($$1.a) - 1;
      int $$3 = ami.e($$1.d) + 1;
      int $$4 = ami.b($$1.b) - 1;
      int $$5 = ami.e($$1.e) + 1;
      int $$6 = ami.b($$1.c) - 1;
      int $$7 = ami.e($$1.f) + 1;
      dxj $$8 = dxg.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      gt.a $$11 = new gt.a();

      for(int $$12 = $$2; $$12 < $$3; ++$$12) {
         for(int $$13 = $$6; $$13 < $$7; ++$$13) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for(int $$15 = $$4; $$15 < $$5; ++$$15) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     cvo $$16 = this.s.a_($$11);
                     if (!($$16.b() instanceof csi) && dxg.c($$16.k(this.s, $$11).a((double)$$12, (double)$$15, (double)$$13), $$8, dwu.i)) {
                        $$9 += $$16.b().h();
                        ++$$10;
                     }
                  }
               }
            }
         }
      }

      return $$9 / (float)$$10;
   }

   private boolean y() {
      dwl $$0 = this.cy();
      int $$1 = ami.b($$0.a);
      int $$2 = ami.e($$0.d);
      int $$3 = ami.b($$0.b);
      int $$4 = ami.e($$0.b + 0.001);
      int $$5 = ami.b($$0.c);
      int $$6 = ami.e($$0.f);
      boolean $$7 = false;
      this.aK = -Double.MAX_VALUE;
      gt.a $$8 = new gt.a();

      for(int $$9 = $$1; $$9 < $$2; ++$$9) {
         for(int $$10 = $$3; $$10 < $$4; ++$$10) {
            for(int $$11 = $$5; $$11 < $$6; ++$$11) {
               $$8.d($$9, $$10, $$11);
               dpv $$12 = this.s.b_($$8);
               if ($$12.a(akp.a)) {
                  float $$13 = (float)$$10 + $$12.a((cgd)this.s, $$8);
                  this.aK = Math.max((double)$$13, this.aK);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private bvv.a z() {
      dwl $$0 = this.cy();
      double $$1 = $$0.e + 0.001;
      int $$2 = ami.b($$0.a);
      int $$3 = ami.e($$0.d);
      int $$4 = ami.b($$0.e);
      int $$5 = ami.e($$1);
      int $$6 = ami.b($$0.c);
      int $$7 = ami.e($$0.f);
      boolean $$8 = false;
      gt.a $$9 = new gt.a();

      for(int $$10 = $$2; $$10 < $$3; ++$$10) {
         for(int $$11 = $$4; $$11 < $$5; ++$$11) {
            for(int $$12 = $$6; $$12 < $$7; ++$$12) {
               $$9.d($$10, $$11, $$12);
               dpv $$13 = this.s.b_($$9);
               if ($$13.a(akp.a) && $$1 < (double)((float)$$9.v() + $$13.a((cgd)this.s, $$9))) {
                  if (!$$13.b()) {
                     return bvv.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? bvv.a.b : null;
   }

   private void A() {
      double $$0 = -0.04F;
      double $$1 = this.aN() ? 0.0 : -0.04F;
      double $$2 = 0.0;
      this.ax = 0.05F;
      if (this.aN == bvv.a.e && this.aM != bvv.a.e && this.aM != bvv.a.d) {
         this.aK = this.e(1.0);
         this.e(this.df(), (double)(this.j() - this.cX()) + 0.101, this.dl());
         this.f(this.dd().d(1.0, 0.0, 1.0));
         this.aO = 0.0;
         this.aM = bvv.a.a;
      } else {
         if (this.aM == bvv.a.a) {
            $$2 = (this.aK - this.dh()) / (double)this.cX();
            this.ax = 0.9F;
         } else if (this.aM == bvv.a.c) {
            $$1 = -7.0E-4;
            this.ax = 0.9F;
         } else if (this.aM == bvv.a.b) {
            $$2 = 0.01F;
            this.ax = 0.45F;
         } else if (this.aM == bvv.a.e) {
            this.ax = 0.9F;
         } else if (this.aM == bvv.a.d) {
            this.ax = this.aL;
            if (this.cG() instanceof buc) {
               this.aL /= 2.0F;
            }
         }

         dwq $$3 = this.dd();
         this.n($$3.c * (double)this.ax, $$3.d + $$1, $$3.e * (double)this.ax);
         this.az *= this.ax;
         if ($$2 > 0.0) {
            dwq $$4 = this.dd();
            this.n($$4.c, ($$4.d + $$2 * 0.06153846016296973) * 0.75, $$4.e);
         }
      }

   }

   private void C() {
      if (this.bJ()) {
         float $$0 = 0.0F;
         if (this.aG) {
            --this.az;
         }

         if (this.aH) {
            ++this.az;
         }

         if (this.aH != this.aG && !this.aI && !this.aJ) {
            $$0 += 0.005F;
         }

         this.o(this.dq() + this.az);
         if (this.aI) {
            $$0 += 0.04F;
         }

         if (this.aJ) {
            $$0 -= 0.005F;
         }

         this.f(this.dd().b((double)(ami.a(-this.dq() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(ami.b(this.dq() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.aH && !this.aG || this.aI, this.aG && !this.aH || this.aI);
      }
   }

   protected float n() {
      return 0.0F;
   }

   @Override
   public void i(bbn $$0) {
      if (this.u($$0)) {
         float $$1 = this.n();
         float $$2 = (float)((this.dt() ? 0.01F : this.bt()) + $$0.bs());
         if (this.cI().size() > 1) {
            int $$3 = this.cI().indexOf($$0);
            if ($$3 == 0) {
               $$1 = 0.2F;
            } else {
               $$1 = -0.6F;
            }

            if ($$0 instanceof bne) {
               $$1 += 0.2F;
            }
         }

         dwq $$4 = new dwq((double)$$1, 0.0, 0.0).b(-this.dq() * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
         $$0.e(this.df() + $$4.c, this.dh() + (double)$$2, this.dl() + $$4.e);
         $$0.o($$0.dq() + this.az);
         $$0.l($$0.cg() + this.az);
         this.a($$0);
         if ($$0 instanceof bne && this.cI().size() == this.t()) {
            int $$5 = $$0.ae() % 2 == 0 ? 90 : 270;
            $$0.m(((bne)$$0).aX + (float)$$5);
            $$0.l($$0.cg() + (float)$$5);
         }

      }
   }

   @Override
   public dwq b(bcc $$0) {
      dwq $$1 = a((double)(this.cW() * ami.g), (double)$$0.cW(), $$0.dq());
      double $$2 = this.df() + $$1.c;
      double $$3 = this.dl() + $$1.e;
      gt $$4 = new gt($$2, this.cy().e, $$3);
      gt $$5 = $$4.c();
      if (!this.s.C($$5)) {
         List<dwq> $$6 = Lists.newArrayList();
         double $$7 = this.s.i($$4);
         if (bvy.a($$7)) {
            $$6.add(new dwq($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.s.i($$5);
         if (bvy.a($$8)) {
            $$6.add(new dwq($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fg().iterator();

         while(var14.hasNext()) {
            bco $$9 = (bco)var14.next();

            for(dwq $$10 : $$6) {
               if (bvy.a(this.s, $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void a(bbn $$0) {
      $$0.m(this.dq());
      float $$1 = ami.g($$0.dq() - this.dq());
      float $$2 = ami.a($$1, -105.0F, 105.0F);
      $$0.w += $$2 - $$1;
      $$0.o($$0.dq() + $$2 - $$1);
      $$0.l($$0.dq());
   }

   @Override
   public void j(bbn $$0) {
      this.a($$0);
   }

   @Override
   protected void b(pj $$0) {
      $$0.a("Type", this.s().a());
   }

   @Override
   protected void a(pj $$0) {
      if ($$0.b("Type", 8)) {
         this.a(bvv.b.a($$0.l("Type")));
      }

   }

   @Override
   public baj a(buc $$0, bai $$1) {
      if ($$0.fo()) {
         return baj.d;
      } else if (this.ay < 60.0F) {
         if (!this.s.y) {
            return $$0.k(this) ? baj.b : baj.d;
         } else {
            return baj.a;
         }
      } else {
         return baj.d;
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
      this.aO = this.dd().d;
      if (!this.bI()) {
         if ($$1) {
            if (this.L > 3.0F) {
               if (this.aM != bvv.a.d) {
                  this.m();
                  return;
               }

               this.a(this.L, 1.0F, baw.k);
               if (!this.s.y && !this.dt()) {
                  this.ag();
                  if (this.s.W().b(cgt.h)) {
                     for(int $$4 = 0; $$4 < 3; ++$$4) {
                        this.a(this.s().b());
                     }

                     for(int $$5 = 0; $$5 < 2; ++$$5) {
                        this.a(caz.nL);
                     }
                  }
               }
            }

            this.m();
         } else if (!this.s.b_(this.da().c()).a(akp.a) && $$0 < 0.0) {
            this.L -= (float)$$0;
         }

      }
   }

   public boolean c(int $$0) {
      return this.Y.a($$0 == 0 ? ar : as) && this.cG() != null;
   }

   public void a(float $$0) {
      this.Y.b(ap, $$0);
   }

   public float o() {
      return this.Y.a(ap);
   }

   public void d(int $$0) {
      this.Y.b(f, $$0);
   }

   public int q() {
      return this.Y.a(f);
   }

   private void a(int $$0) {
      this.Y.b(at, $$0);
   }

   private int D() {
      return this.Y.a(at);
   }

   public float b(float $$0) {
      return ami.i($$0, this.aT, this.aS);
   }

   public void m(int $$0) {
      this.Y.b(ao, $$0);
   }

   public int r() {
      return this.Y.a(ao);
   }

   public void a(bvv.b $$0) {
      this.Y.b(aq, $$0.ordinal());
   }

   public bvv.b s() {
      return bvv.b.a(this.Y.a(aq));
   }

   @Override
   protected boolean o(bbn $$0) {
      return this.cI().size() < this.t() && !this.a(akp.a);
   }

   protected int t() {
      return 2;
   }

   @Nullable
   @Override
   public bbn cG() {
      return this.cJ();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aG = $$0;
      this.aH = $$1;
      this.aI = $$2;
      this.aJ = $$3;
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }

   @Override
   public boolean aV() {
      return this.aM == bvv.a.b || this.aM == bvv.a.c;
   }

   @Override
   public cax dn() {
      return new cax(this.h());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b {
      a(cju.n, "oak"),
      b(cju.o, "spruce"),
      c(cju.p, "birch"),
      d(cju.q, "jungle"),
      e(cju.r, "acacia"),
      f(cju.s, "dark_oak"),
      g(cju.t, "mangrove");

      private final String h;
      private final cjt i;

      private b(cjt $$0, String $$1) {
         this.h = $$1;
         this.i = $$0;
      }

      public String a() {
         return this.h;
      }

      public cjt b() {
         return this.i;
      }

      public String toString() {
         return this.h;
      }

      public static bvv.b a(int $$0) {
         bvv.b[] $$1 = values();
         if ($$0 < 0 || $$0 >= $$1.length) {
            $$0 = 0;
         }

         return $$1[$$0];
      }

      public static bvv.b a(String $$0) {
         bvv.b[] $$1 = values();

         for(int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if ($$1[$$2].a().equals($$0)) {
               return $$1[$$2];
            }
         }

         return $$1[0];
      }
   }
}
