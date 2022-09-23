import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brv extends bvk {
   private static final Predicate<bbn> e = $$0 -> $$0.bo() && !($$0 instanceof brv);
   private static final double bX = 0.3;
   private static final double bY = 0.35;
   private static final int bZ = 8356754;
   private static final double ca = 0.5725490196078431;
   private static final double cb = 0.5137254901960784;
   private static final double cc = 0.4980392156862745;
   private static final int cd = 10;
   public static final int b = 40;
   private int ce;
   private int cf;
   private int cg;

   public brv(bbr<? extends brv> $$0, cgx $$1) {
      super($$0, $$1);
      this.P = 1.0F;
      this.bN = 20;
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(0, new bij(this));
      this.bS.a(4, new brv.a());
      this.bS.a(5, new bkb(this, 0.4));
      this.bS.a(6, new bix(this, buc.class, 6.0F));
      this.bS.a(10, new bix(this, bce.class, 8.0F));
      this.bT.a(2, new bkg(this, bvk.class).a());
      this.bT.a(3, new bkh(this, buc.class, true));
      this.bT.a(4, new bkh(this, btk.class, true, $$0 -> !$$0.y_()));
      this.bT.a(4, new bkh(this, bnq.class, true));
   }

   @Override
   protected void M() {
      boolean $$0 = !(this.cG() instanceof bce) || this.cG().ad().a(akn.b);
      boolean $$1 = !(this.cQ() instanceof bvv);
      this.bS.a(bip.a.a, $$0);
      this.bS.a(bip.a.c, $$0 && $$1);
      this.bS.a(bip.a.b, $$0);
      this.bS.a(bip.a.d, $$0);
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.a, 100.0).a(bdd.d, 0.3).a(bdd.c, 0.75).a(bdd.f, 12.0).a(bdd.g, 1.5).a(bdd.b, 32.0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ce);
      $$0.a("StunTick", this.cf);
      $$0.a("RoarTick", this.cg);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.ce = $$0.h("AttackTick");
      this.cf = $$0.h("StunTick");
      this.cg = $$0.h("RoarTick");
   }

   @Override
   public ajv L_() {
      return ajw.qL;
   }

   @Override
   protected blc a(cgx $$0) {
      return new brv.b(this, $$0);
   }

   @Override
   public int V() {
      return 45;
   }

   @Override
   public double bt() {
      return 2.1;
   }

   @Nullable
   @Override
   public bbn cG() {
      bbn $$0 = this.cJ();
      return $$0 != null && this.a($$0) ? $$0 : null;
   }

   private boolean a(bbn $$0) {
      return !this.fA() && $$0 instanceof bcc;
   }

   @Override
   public void w_() {
      super.w_();
      if (this.bo()) {
         if (this.eE()) {
            this.a(bdd.d).a(0.0);
         } else {
            double $$0 = this.G() != null ? 0.35 : 0.3;
            double $$1 = this.a(bdd.d).b();
            this.a(bdd.d).a(ami.d(0.1, $$1, $$0));
         }

         if (this.z && this.s.W().b(cgt.c)) {
            boolean $$2 = false;
            dwl $$3 = this.cy().g(0.2);

            for(gt $$4 : gt.b(ami.b($$3.a), ami.b($$3.b), ami.b($$3.c), ami.b($$3.d), ami.b($$3.e), ami.b($$3.f))) {
               cvo $$5 = this.s.a_($$4);
               cjt $$6 = $$5.b();
               if ($$6 instanceof cnt) {
                  $$2 = this.s.a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.y) {
               this.eH();
            }
         }

         if (this.cg > 0) {
            --this.cg;
            if (this.cg == 10) {
               this.fV();
            }
         }

         if (this.ce > 0) {
            --this.ce;
         }

         if (this.cf > 0) {
            --this.cf;
            this.fU();
            if (this.cf == 0) {
               this.a(ajw.qQ, 1.0F, 1.0F);
               this.cg = 20;
            }
         }

      }
   }

   private void fU() {
      if (this.R.a(6) == 0) {
         double $$0 = this.df() - (double)this.cW() * Math.sin((double)(this.aX * (float) (Math.PI / 180.0))) + (this.R.j() * 0.6 - 0.3);
         double $$1 = this.dh() + (double)this.cX() - 0.3;
         double $$2 = this.dl() + (double)this.cW() * Math.cos((double)(this.aX * (float) (Math.PI / 180.0))) + (this.R.j() * 0.6 - 0.3);
         this.s.a(io.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }

   }

   @Override
   protected boolean eE() {
      return super.eE() || this.ce > 0 || this.cf > 0 || this.cg > 0;
   }

   @Override
   public boolean B(bbn $$0) {
      return this.cf <= 0 && this.cg <= 0 ? super.B($$0) : false;
   }

   @Override
   protected void e(bcc $$0) {
      if (this.cg == 0) {
         if (this.R.j() < 0.5) {
            this.cf = 40;
            this.a(ajw.qP, 1.0F, 1.0F);
            this.s.a(this, (byte)39);
            $$0.g((bbn)this);
         } else {
            this.b($$0);
         }

         $$0.D = true;
      }

   }

   private void fV() {
      if (this.bo()) {
         for(bcc $$1 : this.s.a(bcc.class, this.cy().g(4.0), e)) {
            if (!($$1 instanceof bqy)) {
               $$1.a(baw.c(this), 6.0F);
            }

            this.b($$1);
         }

         dwq $$2 = this.cy().f();

         for(int $$3 = 0; $$3 < 40; ++$$3) {
            double $$4 = this.R.k() * 0.2;
            double $$5 = this.R.k() * 0.2;
            double $$6 = this.R.k() * 0.2;
            this.s.a(io.V, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(czv.t);
      }

   }

   private void b(bbn $$0) {
      double $$1 = $$0.df() - this.df();
      double $$2 = $$0.dl() - this.dl();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.i($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 4) {
         this.ce = 10;
         this.a(ajw.qK, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cf = 40;
      }

      super.a($$0);
   }

   public int q() {
      return this.ce;
   }

   public int fJ() {
      return this.cf;
   }

   public int fT() {
      return this.cg;
   }

   @Override
   public boolean z(bbn $$0) {
      this.ce = 10;
      this.s.a(this, (byte)4);
      this.a(ajw.qK, 1.0F, 1.0F);
      return super.z($$0);
   }

   @Nullable
   @Override
   protected ajv r() {
      return ajw.qJ;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.qN;
   }

   @Override
   protected ajv x_() {
      return ajw.qM;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.qO, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cha $$0) {
      return !$$0.d(this.cy());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean fK() {
      return false;
   }

   class a extends biz {
      public a() {
         super(brv.this, 1.0, true);
      }

      @Override
      protected double a(bcc $$0) {
         float $$1 = brv.this.cW() - 0.1F;
         return (double)($$1 * 2.0F * $$1 * 2.0F + $$0.cW());
      }
   }

   static class b extends blb {
      public b(bce $$0, cgx $$1) {
         super($$0, $$1);
      }

      @Override
      protected dqn a(int $$0) {
         this.o = new brv.c();
         return new dqn(this.o, $$0);
      }
   }

   static class c extends dqq {
      @Override
      protected dqh a(cgd $$0, boolean $$1, boolean $$2, gt $$3, dqh $$4) {
         return $$4 == dqh.x ? dqh.b : super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
