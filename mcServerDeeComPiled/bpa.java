import com.google.common.collect.UnmodifiableIterator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bpa extends bne implements bae, bbw, bcn, bcr {
   public static final int bY = 400;
   public static final int ca = 499;
   public static final int cb = 500;
   private static final Predicate<bcc> bX = $$0 -> $$0 instanceof bpa && ((bpa)$$0).fX();
   private static final bmf cn = bmf.b().a(16.0).d().a(bX);
   private static final cdm co = cdm.a(caz.nS, caz.pJ, cju.hh.l(), caz.mP, caz.sh, caz.ow, caz.ox);
   private static final aaj<Byte> cp = aam.a(bpa.class, aal.a);
   private static final aaj<Optional<UUID>> cq = aam.a(bpa.class, aal.o);
   private static final int cr = 2;
   private static final int cs = 4;
   private static final int ct = 8;
   private static final int cu = 16;
   private static final int cv = 32;
   private static final int cw = 64;
   public static final int cc = 0;
   public static final int cd = 1;
   public static final int ce = 2;
   private int cx;
   private int cy;
   private int cz;
   public int cf;
   public int cg;
   protected boolean ch;
   protected bao ci;
   protected int cj;
   protected float ck;
   private boolean cA;
   private float cB;
   private float cC;
   private float cD;
   private float cE;
   private float cF;
   private float cG;
   protected boolean cl = true;
   protected int cm;

   protected bpa(bbr<? extends bpa> $$0, cgx $$1) {
      super($$0, $$1);
      this.P = 1.0F;
      this.fZ();
   }

   @Override
   protected void u() {
      this.bS.a(1, new bji(this, 1.2));
      this.bS.a(1, new bjs(this, 1.2));
      this.bS.a(2, new bib(this, 1.0, bpa.class));
      this.bS.a(4, new bio(this, 1.0));
      this.bS.a(6, new bkb(this, 0.7));
      this.bS.a(7, new bix(this, buc.class, 6.0F));
      this.bS.a(8, new bjk(this));
      this.fR();
   }

   protected void fR() {
      this.bS.a(0, new bij(this));
      this.bS.a(3, new bjw(this, 1.25, cdm.a(caz.sh, caz.ow, caz.ox), false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cp, (byte)0);
      this.Y.a(cq, Optional.empty());
   }

   protected boolean t(int $$0) {
      return (this.Y.a(cp) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.Y.a(cp);
      if ($$1) {
         this.Y.b(cp, (byte)($$2 | $$0));
      } else {
         this.Y.b(cp, (byte)($$2 & ~$$0));
      }

   }

   public boolean fS() {
      return this.t(2);
   }

   @Nullable
   public UUID fT() {
      return (UUID)((Optional)this.Y.a(cq)).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.Y.b(cq, Optional.ofNullable($$0));
   }

   public boolean fU() {
      return this.ch;
   }

   public void w(boolean $$0) {
      this.d(2, $$0);
   }

   public void x(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   protected void x(float $$0) {
      if ($$0 > 6.0F && this.fV()) {
         this.z(false);
      }

   }

   public boolean fV() {
      return this.t(16);
   }

   public boolean fW() {
      return this.t(32);
   }

   public boolean fX() {
      return this.t(8);
   }

   public void y(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean c() {
      return this.bo() && !this.y_() && this.fS();
   }

   @Override
   public void a(@Nullable ajx $$0) {
      this.ci.a(0, new cax(caz.mn));
      if ($$0 != null) {
         this.s.a(null, this, ajw.jq, $$0, 0.5F, 1.0F);
      }

   }

   @Override
   public boolean d() {
      return this.t(4);
   }

   public int fY() {
      return this.cj;
   }

   public void u(int $$0) {
      this.cj = $$0;
   }

   public int v(int $$0) {
      int $$1 = ami.a(this.fY() + $$0, 0, this.gf());
      this.u($$1);
      return $$1;
   }

   @Override
   public boolean bl() {
      return !this.bJ();
   }

   private void q() {
      this.fK();
      if (!this.aM()) {
         ajv $$0 = this.gc();
         if ($$0 != null) {
            this.s.a(null, this.df(), this.dh(), this.dl(), $$0, this.cR(), 1.0F, 1.0F + (this.R.i() - this.R.i()) * 0.2F);
         }
      }

   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      if ($$0 > 1.0F) {
         this.a(ajw.jp, 0.4F, 1.0F);
      }

      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, (float)$$3);
         if (this.bJ()) {
            for(bbn $$4 : this.cM()) {
               $$4.a($$2, (float)$$3);
            }
         }

         this.ep();
         return true;
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ami.f(($$0 * 0.5F - 3.0F) * $$1);
   }

   protected int fJ() {
      return 2;
   }

   protected void fZ() {
      bao $$0 = this.ci;
      this.ci = new bao(this.fJ());
      if ($$0 != null) {
         $$0.b(this);
         int $$1 = Math.min($$0.b(), this.ci.b());

         for(int $$2 = 0; $$2 < $$1; ++$$2) {
            cax $$3 = $$0.a($$2);
            if (!$$3.b()) {
               this.ci.a($$2, $$3.o());
            }
         }
      }

      this.ci.a(this);
      this.ga();
   }

   protected void ga() {
      if (!this.s.y) {
         this.d(4, !this.ci.a(0).b());
      }
   }

   @Override
   public void a(bac $$0) {
      boolean $$1 = this.d();
      this.ga();
      if (this.S > 20 && !$$1 && this.d()) {
         this.a(ajw.jq, 0.5F, 1.0F);
      }

   }

   public double gb() {
      return this.b(bdd.m);
   }

   @Nullable
   protected ajv gc() {
      return null;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return null;
   }

   @Nullable
   @Override
   protected ajv c(baw $$0) {
      if (this.R.a(3) == 0) {
         this.fL();
      }

      return null;
   }

   @Nullable
   @Override
   protected ajv r() {
      if (this.R.a(10) == 0 && !this.eE()) {
         this.fL();
      }

      return null;
   }

   @Nullable
   protected ajv gd() {
      this.fL();
      return null;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      if (!$$1.d().a()) {
         cvo $$2 = this.s.a_($$0.b());
         cqw $$3 = $$1.r();
         if ($$2.a(cju.cW)) {
            $$3 = $$2.r();
         }

         if (this.bJ() && this.cl) {
            ++this.cm;
            if (this.cm > 5 && this.cm % 3 == 0) {
               this.a($$3);
            } else if (this.cm <= 5) {
               this.a(ajw.js, $$3.a() * 0.15F, $$3.b());
            }
         } else if ($$3 == cqw.a) {
            this.a(ajw.js, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(ajw.jr, $$3.a() * 0.15F, $$3.b());
         }

      }
   }

   protected void a(cqw $$0) {
      this.a(ajw.jm, $$0.a() * 0.15F, $$0.b());
   }

   public static bdc.a ge() {
      return bce.w().a(bdd.m).a(bdd.a, 53.0).a(bdd.d, 0.225F);
   }

   @Override
   public int fo() {
      return 6;
   }

   public int gf() {
      return 100;
   }

   @Override
   protected float eC() {
      return 0.8F;
   }

   @Override
   public int J() {
      return 400;
   }

   @Override
   public void b(buc $$0) {
      if (!this.s.y && (!this.bJ() || this.u($$0)) && this.fS()) {
         $$0.a(this, this.ci);
      }

   }

   public baj a(buc $$0, cax $$1) {
      boolean $$2 = this.b($$0, $$1);
      if (!$$0.fB().d) {
         $$1.g(1);
      }

      if (this.s.y) {
         return baj.b;
      } else {
         return $$2 ? baj.a : baj.d;
      }
   }

   protected boolean b(buc $$0, cax $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(caz.nS)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(caz.pJ)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(cju.hh.l())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(caz.mP)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(caz.sh)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.s.y && this.fS() && this.j() == 0 && !this.fP()) {
            $$2 = true;
            this.f($$0);
         }
      } else if ($$1.a(caz.ow) || $$1.a(caz.ox)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.s.y && this.fS() && this.j() == 0 && !this.fP()) {
            $$2 = true;
            this.f($$0);
         }
      }

      if (this.ef() < this.et() && $$3 > 0.0F) {
         this.b($$3);
         $$2 = true;
      }

      if (this.y_() && $$4 > 0) {
         this.s.a(io.J, this.d(1.0), this.di() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.s.y) {
            this.a_($$4);
         }

         $$2 = true;
      }

      if ($$5 > 0 && ($$2 || !this.fS()) && this.fY() < this.gf()) {
         $$2 = true;
         if (!this.s.y) {
            this.v($$5);
         }
      }

      if ($$2) {
         this.q();
         this.a(czv.n);
      }

      return $$2;
   }

   protected void e(buc $$0) {
      this.z(false);
      this.A(false);
      if (!this.s.y) {
         $$0.o(this.dq());
         $$0.p(this.ds());
         $$0.k(this);
      }

   }

   @Override
   protected boolean eE() {
      return super.eE() && this.bJ() && this.d() || this.fV() || this.fW();
   }

   @Override
   public boolean n(cax $$0) {
      return co.a($$0);
   }

   private void t() {
      this.cf = 1;
   }

   @Override
   protected void ei() {
      super.ei();
      if (this.ci != null) {
         for(int $$0 = 0; $$0 < this.ci.b(); ++$$0) {
            cax $$1 = this.ci.a($$0);
            if (!$$1.b() && !cet.e($$1)) {
               this.b($$1);
            }
         }

      }
   }

   @Override
   public void w_() {
      if (this.R.a(200) == 0) {
         this.t();
      }

      super.w_();
      if (!this.s.y && this.bo()) {
         if (this.R.a(900) == 0 && this.aN == 0) {
            this.b(1.0F);
         }

         if (this.gh()) {
            if (!this.fV() && !this.bJ() && this.R.a(300) == 0 && this.s.a_(this.da().c()).a(cju.i)) {
               this.z(true);
            }

            if (this.fV() && ++this.cx > 50) {
               this.cx = 0;
               this.z(false);
            }
         }

         this.gg();
      }
   }

   protected void gg() {
      if (this.fX() && this.y_() && !this.fV()) {
         bcc $$0 = this.s.a(bpa.class, cn, this, this.df(), this.dh(), this.dl(), this.cy().g(16.0));
         if ($$0 != null && this.f((bbn)$$0) > 4.0) {
            this.bR.a($$0, 0);
         }
      }

   }

   public boolean gh() {
      return true;
   }

   @Override
   public void k() {
      super.k();
      if (this.cy > 0 && ++this.cy > 30) {
         this.cy = 0;
         this.d(64, false);
      }

      if ((this.cP() || this.eP()) && this.cz > 0 && ++this.cz > 20) {
         this.cz = 0;
         this.A(false);
      }

      if (this.cf > 0 && ++this.cf > 8) {
         this.cf = 0;
      }

      if (this.cg > 0) {
         ++this.cg;
         if (this.cg > 300) {
            this.cg = 0;
         }
      }

      this.cC = this.cB;
      if (this.fV()) {
         this.cB += (1.0F - this.cB) * 0.4F + 0.05F;
         if (this.cB > 1.0F) {
            this.cB = 1.0F;
         }
      } else {
         this.cB += (0.0F - this.cB) * 0.4F - 0.05F;
         if (this.cB < 0.0F) {
            this.cB = 0.0F;
         }
      }

      this.cE = this.cD;
      if (this.fW()) {
         this.cB = 0.0F;
         this.cC = this.cB;
         this.cD += (1.0F - this.cD) * 0.4F + 0.05F;
         if (this.cD > 1.0F) {
            this.cD = 1.0F;
         }
      } else {
         this.cA = false;
         this.cD += (0.8F * this.cD * this.cD * this.cD - this.cD) * 0.6F - 0.05F;
         if (this.cD < 0.0F) {
            this.cD = 0.0F;
         }
      }

      this.cG = this.cF;
      if (this.t(64)) {
         this.cF += (1.0F - this.cF) * 0.7F + 0.05F;
         if (this.cF > 1.0F) {
            this.cF = 1.0F;
         }
      } else {
         this.cF += (0.0F - this.cF) * 0.7F - 0.05F;
         if (this.cF < 0.0F) {
            this.cF = 0.0F;
         }
      }

   }

   private void fK() {
      if (!this.s.y) {
         this.cy = 1;
         this.d(64, true);
      }

   }

   public void z(boolean $$0) {
      this.d(16, $$0);
   }

   public void A(boolean $$0) {
      if ($$0) {
         this.z(false);
      }

      this.d(32, $$0);
   }

   private void fL() {
      if (this.cP() || this.eP()) {
         this.cz = 1;
         this.A(true);
      }

   }

   public void gi() {
      if (!this.fW()) {
         this.fL();
         ajv $$0 = this.gd();
         if ($$0 != null) {
            this.a($$0, this.eC(), this.eD());
         }
      }

   }

   public boolean g(buc $$0) {
      this.b($$0.co());
      this.w(true);
      if ($$0 instanceof agh) {
         aj.x.a((agh)$$0, this);
      }

      this.s.a(this, (byte)7);
      return true;
   }

   @Override
   public void g(dwq $$0) {
      if (this.bo()) {
         bcc $$1 = this.gn();
         if (this.bJ() && $$1 != null) {
            this.o($$1.dq());
            this.w = this.dq();
            this.p($$1.ds() * 0.5F);
            this.a(this.dq(), this.ds());
            this.aX = this.dq();
            this.aZ = this.aX;
            float $$2 = $$1.bo * 0.5F;
            float $$3 = $$1.bq;
            if ($$3 <= 0.0F) {
               $$3 *= 0.25F;
               this.cm = 0;
            }

            if (this.y && this.ck == 0.0F && this.fW() && !this.cA) {
               $$2 = 0.0F;
               $$3 = 0.0F;
            }

            if (this.ck > 0.0F && !this.fU() && this.y) {
               double $$4 = this.gb() * (double)this.ck * (double)this.aC();
               double $$5 = $$4 + this.eG();
               dwq $$6 = this.dd();
               this.n($$6.c, $$5, $$6.e);
               this.x(true);
               this.af = true;
               if ($$3 > 0.0F) {
                  float $$7 = ami.a(this.dq() * (float) (Math.PI / 180.0));
                  float $$8 = ami.b(this.dq() * (float) (Math.PI / 180.0));
                  this.f(this.dd().b((double)(-0.4F * $$7 * this.ck), 0.0, (double)(0.4F * $$8 * this.ck)));
               }

               this.ck = 0.0F;
            }

            this.bb = this.eK() * 0.1F;
            if (this.cP()) {
               this.r((float)this.b(bdd.d));
               super.g(new dwq((double)$$2, $$0.d, (double)$$3));
            } else if ($$1 instanceof buc) {
               this.f(dwq.b);
            }

            if (this.y) {
               this.ck = 0.0F;
               this.x(false);
            }

            this.a(this, false);
            this.ax();
         } else {
            this.bb = 0.02F;
            super.g($$0);
         }
      }
   }

   protected void gj() {
      this.a(ajw.jo, 0.4F, 1.0F);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("EatingHaystack", this.fV());
      $$0.a("Bred", this.fX());
      $$0.a("Temper", this.fY());
      $$0.a("Tame", this.fS());
      if (this.fT() != null) {
         $$0.a("Owner", this.fT());
      }

      if (!this.ci.a(0).b()) {
         $$0.a("SaddleItem", (qc)this.ci.a(0).b(new pj()));
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.z($$0.q("EatingHaystack"));
      this.y($$0.q("Bred"));
      this.u($$0.h("Temper"));
      this.w($$0.q("Tame"));
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aiy.a(this.cD(), $$2);
      }

      if ($$1 != null) {
         this.b($$1);
      }

      if ($$0.b("SaddleItem", 10)) {
         cax $$4 = cax.a($$0.p("SaddleItem"));
         if ($$4.a(caz.mn)) {
            this.ci.a(0, $$4);
         }
      }

      this.ga();
   }

   @Override
   public boolean a(bne $$0) {
      return false;
   }

   protected boolean gk() {
      return !this.bJ() && !this.bI() && this.fS() && !this.y_() && this.ef() >= this.et() && this.fP();
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      return null;
   }

   protected void a(bbk $$0, bpa $$1) {
      double $$2 = this.c(bdd.a) + $$0.c(bdd.a) + (double)this.b(this.R);
      $$1.a(bdd.a).a($$2 / 3.0);
      double $$3 = this.c(bdd.m) + $$0.c(bdd.m) + this.c(this.R);
      $$1.a(bdd.m).a($$3 / 3.0);
      double $$4 = this.c(bdd.d) + $$0.c(bdd.d) + this.d(this.R);
      $$1.a(bdd.d).a($$4 / 3.0);
   }

   public float y(float $$0) {
      return ami.i($$0, this.cC, this.cB);
   }

   public float z(float $$0) {
      return ami.i($$0, this.cE, this.cD);
   }

   public float A(float $$0) {
      return ami.i($$0, this.cG, this.cF);
   }

   @Override
   public void a(int $$0) {
      if (this.d()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cA = true;
            this.fL();
         }

         if ($$0 >= 90) {
            this.ck = 1.0F;
         } else {
            this.ck = 0.4F + 0.4F * (float)$$0 / 90.0F;
         }

      }
   }

   @Override
   public boolean a() {
      return this.d();
   }

   @Override
   public void b(int $$0) {
      this.cA = true;
      this.fL();
      this.gj();
   }

   @Override
   public void b() {
   }

   protected void B(boolean $$0) {
      im $$1 = $$0 ? io.L : io.Y;

      for(int $$2 = 0; $$2 < 7; ++$$2) {
         double $$3 = this.R.k() * 0.02;
         double $$4 = this.R.k() * 0.02;
         double $$5 = this.R.k() * 0.02;
         this.s.a($$1, this.d(1.0), this.di() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }

   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 7) {
         this.B(true);
      } else if ($$0 == 6) {
         this.B(false);
      } else {
         super.a($$0);
      }

   }

   @Override
   public void i(bbn $$0) {
      super.i($$0);
      if ($$0 instanceof bce $$1) {
         this.aX = $$1.aX;
      }

      if (this.cE > 0.0F) {
         float $$2 = ami.a(this.aX * (float) (Math.PI / 180.0));
         float $$3 = ami.b(this.aX * (float) (Math.PI / 180.0));
         float $$4 = 0.7F * this.cE;
         float $$5 = 0.15F * this.cE;
         $$0.e(this.df() + (double)($$4 * $$2), this.dh() + this.bt() + $$0.bs() + (double)$$5, this.dl() - (double)($$4 * $$3));
         if ($$0 instanceof bcc) {
            ((bcc)$$0).aX = this.aX;
         }
      }

   }

   protected float b(amn $$0) {
      return 15.0F + (float)$$0.a(8) + (float)$$0.a(9);
   }

   protected double c(amn $$0) {
      return 0.4F + $$0.j() * 0.2 + $$0.j() * 0.2 + $$0.j() * 0.2;
   }

   protected double d(amn $$0) {
      return (0.45F + $$0.j() * 0.3 + $$0.j() * 0.3 + $$0.j() * 0.3) * 0.25;
   }

   @Override
   public boolean b_() {
      return false;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.95F;
   }

   public boolean gl() {
      return false;
   }

   public boolean gm() {
      return !this.c(bbs.e).b();
   }

   public boolean m(cax $$0) {
      return false;
   }

   private bct a(final int $$0, final Predicate<cax> $$1) {
      return new bct() {
         @Override
         public cax a() {
            return bpa.this.ci.a($$0);
         }

         @Override
         public boolean a(cax $$0x) {
            if (!$$1.test($$0)) {
               return false;
            } else {
               bpa.this.ci.a($$0, $$0);
               bpa.this.ga();
               return true;
            }
         }
      };
   }

   @Override
   public bct k(int $$0) {
      int $$1 = $$0 - 400;
      if ($$1 >= 0 && $$1 < 2 && $$1 < this.ci.b()) {
         if ($$1 == 0) {
            return this.a($$1, $$0x -> $$0x.b() || $$0x.a(caz.mn));
         }

         if ($$1 == 1) {
            if (!this.gl()) {
               return bct.a;
            }

            return this.a($$1, $$0x -> $$0x.b() || this.m($$0x));
         }
      }

      int $$2 = $$0 - 500 + 2;
      return $$2 >= 2 && $$2 < this.ci.b() ? bct.a(this.ci, $$2) : super.k($$0);
   }

   @Nullable
   public bcc gn() {
      if (this.d()) {
         bbn var2 = this.cJ();
         if (var2 instanceof bcc) {
            return (bcc)var2;
         }
      }

      return null;
   }

   @Nullable
   private dwq a(dwq $$0, bcc $$1) {
      double $$2 = this.df() + $$0.c;
      double $$3 = this.cy().b;
      double $$4 = this.dl() + $$0.e;
      gt.a $$5 = new gt.a();
      UnmodifiableIterator var10 = $$1.fg().iterator();

      while(var10.hasNext()) {
         bco $$6 = (bco)var10.next();
         $$5.c($$2, $$3, $$4);
         double $$7 = this.cy().e + 0.75;

         while(true) {
            double $$8 = this.s.i($$5);
            if ((double)$$5.v() + $$8 > $$7) {
               break;
            }

            if (bvy.a($$8)) {
               dwl $$9 = $$1.g($$6);
               dwq $$10 = new dwq($$2, (double)$$5.v() + $$8, $$4);
               if (bvy.a(this.s, $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(gy.b);
            if (!((double)$$5.v() < $$7)) {
               break;
            }
         }
      }

      return null;
   }

   @Override
   public dwq b(bcc $$0) {
      dwq $$1 = a((double)this.cW(), (double)$$0.cW(), this.dq() + ($$0.eS() == bbx.b ? 90.0F : -90.0F));
      dwq $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         dwq $$3 = a((double)this.cW(), (double)$$0.cW(), this.dq() + ($$0.eS() == bbx.a ? 90.0F : -90.0F));
         dwq $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.cY();
      }
   }

   protected void a(amn $$0) {
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$3 == null) {
         $$3 = new bbk.a(0.2F);
      }

      this.a($$0.r_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public boolean b(bac $$0) {
      return this.ci != $$0;
   }
}
