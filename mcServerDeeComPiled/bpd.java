import javax.annotation.Nullable;

public class bpd extends boz implements bru {
   private static final int cn = 5;
   private static final int co = 4;
   private static final cdm cp = cdm.a(caz.nS, cju.hh.l());
   private static final aaj<Integer> cq = aam.a(bpd.class, aal.b);
   private static final aaj<Integer> cr = aam.a(bpd.class, aal.b);
   private static final aaj<Integer> cs = aam.a(bpd.class, aal.b);
   boolean ct;
   @Nullable
   private bpd cu;
   @Nullable
   private bpd cv;

   public bpd(bbr<? extends bpd> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public boolean go() {
      return false;
   }

   private void x(int $$0) {
      this.Y.b(cq, Math.max(1, Math.min(5, $$0)));
   }

   private void e(amn $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gp() {
      return this.Y.a(cq);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Variant", this.gr());
      $$0.a("Strength", this.gp());
      if (!this.ci.a(1).b()) {
         $$0.a("DecorItem", (qc)this.ci.a(1).b(new pj()));
      }

   }

   @Override
   public void a(pj $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("DecorItem", 10)) {
         this.ci.a(1, cax.a($$0.p("DecorItem")));
      }

      this.ga();
   }

   @Override
   protected void u() {
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bjs(this, 1.2));
      this.bS.a(2, new biw(this, 2.1F));
      this.bS.a(3, new bjn(this, 1.25, 40, 20.0F));
      this.bS.a(3, new bji(this, 1.2));
      this.bS.a(4, new bib(this, 1.0));
      this.bS.a(5, new bjw(this, 1.25, cdm.a(caz.gH), false));
      this.bS.a(6, new bio(this, 1.0));
      this.bS.a(7, new bkb(this, 0.7));
      this.bS.a(8, new bix(this, buc.class, 6.0F));
      this.bS.a(9, new bjk(this));
      this.bT.a(1, new bpd.c(this));
      this.bT.a(2, new bpd.a(this));
   }

   public static bdc.a gq() {
      return q().a(bdd.b, 40.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cq, 0);
      this.Y.a(cr, -1);
      this.Y.a(cs, 0);
   }

   public int gr() {
      return ami.a(this.Y.a(cs), 0, 3);
   }

   public void w(int $$0) {
      this.Y.b(cs, $$0);
   }

   @Override
   protected int fJ() {
      return this.t() ? 2 + 3 * this.fL() : super.fJ();
   }

   @Override
   public void i(bbn $$0) {
      if (this.u($$0)) {
         float $$1 = ami.b(this.aX * (float) (Math.PI / 180.0));
         float $$2 = ami.a(this.aX * (float) (Math.PI / 180.0));
         float $$3 = 0.3F;
         $$0.e(this.df() + (double)(0.3F * $$2), this.dh() + this.bt() + $$0.bs(), this.dl() - (double)(0.3F * $$1));
      }
   }

   @Override
   public double bt() {
      return (double)this.cX() * 0.6;
   }

   @Nullable
   @Override
   public bcc gn() {
      return null;
   }

   @Override
   public boolean n(cax $$0) {
      return cp.a($$0);
   }

   @Override
   protected boolean b(buc $$0, cax $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(caz.nS)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cju.hh.l())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.fS() && this.j() == 0 && this.fM()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.ef() < this.et() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.y_() && $$2 > 0) {
         this.s.a(io.J, this.d(1.0), this.di() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.s.y) {
            this.a_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.fS()) && this.fY() < this.gf()) {
         $$5 = true;
         if (!this.s.y) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aM()) {
         ajv $$6 = this.gc();
         if ($$6 != null) {
            this.s.a(null, this.df(), this.dh(), this.dl(), this.gc(), this.cR(), 1.0F, 1.0F + (this.R.i() - this.R.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   protected boolean eE() {
      return this.eg() || this.fV();
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      this.e($$5);
      int $$6;
      if ($$3 instanceof bpd.b) {
         $$6 = ((bpd.b)$$3).a;
      } else {
         $$6 = $$5.a(4);
         $$3 = new bpd.b($$6);
      }

      this.w($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected ajv gd() {
      return ajw.kz;
   }

   @Override
   protected ajv r() {
      return ajw.ky;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.kD;
   }

   @Override
   protected ajv x_() {
      return ajw.kB;
   }

   @Nullable
   @Override
   protected ajv gc() {
      return ajw.kC;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.kF, 0.15F, 1.0F);
   }

   @Override
   protected void fK() {
      this.a(ajw.kA, 1.0F, (this.R.i() - this.R.i()) * 0.2F + 1.0F);
   }

   @Override
   public void gi() {
      ajv $$0 = this.gd();
      if ($$0 != null) {
         this.a($$0, this.eC(), this.eD());
      }

   }

   @Override
   public int fL() {
      return this.gp();
   }

   @Override
   public boolean gl() {
      return true;
   }

   @Override
   public boolean gm() {
      return !this.ci.a(1).b();
   }

   @Override
   public boolean m(cax $$0) {
      return $$0.a(aks.f);
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public void a(bac $$0) {
      bzq $$1 = this.gs();
      super.a($$0);
      bzq $$2 = this.gs();
      if (this.S > 20 && $$2 != null && $$2 != $$1) {
         this.a(ajw.kG, 0.5F, 1.0F);
      }

   }

   @Override
   protected void ga() {
      if (!this.s.y) {
         super.ga();
         this.a(o(this.ci.a(1)));
      }
   }

   private void a(@Nullable bzq $$0) {
      this.Y.b(cr, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static bzq o(cax $$0) {
      cjt $$1 = cjt.a($$0.c());
      return $$1 instanceof csw ? ((csw)$$1).b() : null;
   }

   @Nullable
   public bzq gs() {
      int $$0 = this.Y.a(cr);
      return $$0 == -1 ? null : bzq.a($$0);
   }

   @Override
   public int gf() {
      return 30;
   }

   @Override
   public boolean a(bne $$0) {
      return $$0 != this && $$0 instanceof bpd && this.gk() && ((bpd)$$0).gk();
   }

   public bpd b(agg $$0, bbk $$1) {
      bpd $$2 = this.gt();
      this.a($$1, $$2);
      bpd $$3 = (bpd)$$1;
      int $$4 = this.R.a(Math.max(this.gp(), $$3.gp())) + 1;
      if (this.R.i() < 0.03F) {
         ++$$4;
      }

      $$2.x($$4);
      $$2.w(this.R.h() ? this.gr() : $$3.gr());
      return $$2;
   }

   protected bpd gt() {
      return bbr.Y.a(this.s);
   }

   private void k(bcc $$0) {
      but $$1 = new but(this.s, this);
      double $$2 = $$0.df() - this.df();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dh();
      double $$4 = $$0.dl() - this.dl();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aM()) {
         this.s.a(null, this.df(), this.dh(), this.dl(), ajw.kE, this.cR(), 1.0F, 1.0F + (this.R.i() - this.R.i()) * 0.2F);
      }

      this.s.b($$1);
      this.ct = true;
   }

   void C(boolean $$0) {
      this.ct = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bJ()) {
               for(bbn $$4 : this.cM()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.ep();
         return true;
      }
   }

   public void gu() {
      if (this.cu != null) {
         this.cu.cv = null;
      }

      this.cu = null;
   }

   public void a(bpd $$0) {
      this.cu = $$0;
      this.cu.cv = this;
   }

   public boolean gv() {
      return this.cv != null;
   }

   public boolean gw() {
      return this.cu != null;
   }

   @Nullable
   public bpd gx() {
      return this.cu;
   }

   @Override
   protected double fI() {
      return 2.0;
   }

   @Override
   protected void gg() {
      if (!this.gw() && this.y_()) {
         super.gg();
      }

   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   public void a(bcc $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, 0.75 * (double)this.cA(), (double)this.cW() * 0.5);
   }

   static class a extends bkh<boh> {
      public a(bpd $$0) {
         super($$0, boh.class, 16, false, true, $$0x -> !((boh)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bbk.a {
      public final int a;

      b(int $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bkg {
      public c(bpd $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bpd $$0 && $$0.ct) {
            $$0.C(false);
            return false;
         }

         return super.b();
      }
   }
}
