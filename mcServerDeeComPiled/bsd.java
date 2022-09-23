import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class bsd extends bne implements bbz, bcr {
   private static final float bX = 0.23F;
   private static final float bY = 0.66F;
   private static final float ca = 0.55F;
   private static final cdm cb = cdm.a(caz.cS);
   private static final cdm cc = cdm.a(caz.cS, caz.mu);
   private static final aaj<Integer> cd = aam.a(bsd.class, aal.b);
   private static final aaj<Boolean> ce = aam.a(bsd.class, aal.i);
   private static final aaj<Boolean> cf = aam.a(bsd.class, aal.i);
   private final bby cg = new bby(this.Y, cd, cf);
   @Nullable
   private bjw ch;
   @Nullable
   private bji ci;

   public bsd(bbr<? extends bsd> $$0, cgx $$1) {
      super($$0, $$1);
      this.q = true;
      this.a(dqh.j, -1.0F);
      this.a(dqh.i, 0.0F);
      this.a(dqh.n, 0.0F);
      this.a(dqh.o, 0.0F);
   }

   public static boolean c(bbr<bsd> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      gt.a $$5 = $$3.i();

      do {
         $$5.c(gy.b);
      } while($$1.b_($$5).a(akp.b));

      return $$1.a_($$5).h();
   }

   @Override
   public void a(aaj<?> $$0) {
      if (cd.equals($$0) && this.s.y) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cd, 0);
      this.Y.a(ce, false);
      this.Y.a(cf, false);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean d() {
      return this.cg.b();
   }

   @Override
   public boolean c() {
      return this.bo() && !this.y_();
   }

   @Override
   public void a(@Nullable ajx $$0) {
      this.cg.a(true);
      if ($$0 != null) {
         this.s.a(null, this, ajw.tK, $$0, 0.5F, 1.0F);
      }

   }

   @Override
   protected void u() {
      this.ci = new bji(this, 1.65);
      this.bS.a(1, this.ci);
      this.bS.a(2, new bib(this, 1.0));
      this.ch = new bjw(this, 1.4, cc, false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new bsd.a(this, 1.5));
      this.bS.a(5, new bio(this, 1.1));
      this.bS.a(7, new bjl(this, 1.0, 60));
      this.bS.a(8, new bix(this, buc.class, 8.0F));
      this.bS.a(8, new bjk(this));
      this.bS.a(9, new bix(this, bsd.class, 8.0F));
   }

   public void v(boolean $$0) {
      this.Y.b(ce, $$0);
   }

   public boolean q() {
      return this.cQ() instanceof bsd ? ((bsd)this.cQ()).q() : this.Y.a(ce);
   }

   @Override
   public boolean a(dpv $$0) {
      return $$0.a(akp.b);
   }

   @Override
   public double bt() {
      float $$0 = Math.min(0.25F, this.aS);
      float $$1 = this.aT;
      return (double)this.cX() - 0.19 + (double)(0.12F * ami.b($$1 * 1.5F) * 2.0F * $$0);
   }

   @Override
   public boolean a(cha $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bbn cG() {
      bbn $$0 = this.cJ();
      return $$0 != null && this.a($$0) ? $$0 : null;
   }

   private boolean a(bbn $$0) {
      if (!($$0 instanceof buc)) {
         return false;
      } else {
         buc $$1 = (buc)$$0;
         return $$1.ez().a(caz.mu) || $$1.eA().a(caz.mu);
      }
   }

   @Override
   public dwq b(bcc $$0) {
      dwq[] $$1 = new dwq[]{
         a((double)this.cW(), (double)$$0.cW(), $$0.dq()),
         a((double)this.cW(), (double)$$0.cW(), $$0.dq() - 22.5F),
         a((double)this.cW(), (double)$$0.cW(), $$0.dq() + 22.5F),
         a((double)this.cW(), (double)$$0.cW(), $$0.dq() - 45.0F),
         a((double)this.cW(), (double)$$0.cW(), $$0.dq() + 45.0F)
      };
      Set<gt> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cy().e;
      double $$4 = this.cy().b - 0.5;
      gt.a $$5 = new gt.a();

      for(dwq $$6 : $$1) {
         $$5.c(this.df() + $$6.c, $$3, this.dl() + $$6.e);

         for(double $$7 = $$3; $$7 > $$4; --$$7) {
            $$2.add($$5.h());
            $$5.c(gy.a);
         }
      }

      for(gt $$8 : $$2) {
         if (!this.s.b_($$8).a(akp.b)) {
            double $$9 = this.s.i($$8);
            if (bvy.a($$9)) {
               dwq $$10 = dwq.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fg().iterator();

               while(var14.hasNext()) {
                  bco $$11 = (bco)var14.next();
                  dwl $$12 = $$0.g($$11);
                  if (bvy.a(this.s, $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new dwq(this.df(), this.cy().e, this.dl());
   }

   @Override
   public void g(dwq $$0) {
      this.r(this.t());
      this.a(this, this.cg, $$0);
   }

   public float t() {
      return (float)this.b(bdd.d) * (this.q() ? 0.66F : 1.0F);
   }

   @Override
   public float b() {
      return (float)this.b(bdd.d) * (this.q() ? 0.23F : 0.55F);
   }

   @Override
   public void a(dwq $$0) {
      super.g($$0);
   }

   @Override
   protected float aF() {
      return this.J + 0.6F;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(this.bf() ? ajw.tI : ajw.tH, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.dQ());
   }

   @Override
   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
      this.aJ();
      if (this.bf()) {
         this.m();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void k() {
      if (this.fL() && this.R.a(140) == 0) {
         this.a(ajw.tD, 1.0F, this.eD());
      } else if (this.fK() && this.R.a(60) == 0) {
         this.a(ajw.tE, 1.0F, this.eD());
      }

      if (!this.fA()) {
         cvo $$0 = this.s.a_(this.da());
         cvo $$1 = this.bb();
         boolean $$2 = $$0.a(akl.aL) || $$1.a(akl.aL) || this.b(akp.b) > 0.0;
         this.v(!$$2);
      }

      super.k();
      this.fR();
      this.aJ();
   }

   private boolean fK() {
      return this.ci != null && this.ci.k();
   }

   private boolean fL() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean x() {
      return true;
   }

   private void fR() {
      if (this.bf()) {
         dwv $$0 = dwv.a(this);
         if ($$0.a(cnz.c, this.da(), true) && !this.s.b_(this.da().b()).a(akp.b)) {
            this.y = true;
         } else {
            this.f(this.dd().a(0.5).b(0.0, 0.05, 0.0));
         }
      }

   }

   public static bdc.a fJ() {
      return bce.w().a(bdd.d, 0.175F).a(bdd.b, 16.0);
   }

   @Override
   protected ajv r() {
      return !this.fK() && !this.fL() ? ajw.tC : null;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.tG;
   }

   @Override
   protected ajv x_() {
      return ajw.tF;
   }

   @Override
   protected boolean o(bbn $$0) {
      return !this.bJ() && !this.a(akp.b);
   }

   @Override
   public boolean eL() {
      return true;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   protected blc a(cgx $$0) {
      return new bsd.b(this, $$0);
   }

   @Override
   public float a(gt $$0, cha $$1) {
      if ($$1.a_($$0).p().a(akp.b)) {
         return 10.0F;
      } else {
         return this.bf() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   public bsd b(agg $$0, bbk $$1) {
      return bbr.aO.a((cgx)$$0);
   }

   @Override
   public boolean n(cax $$0) {
      return cb.a($$0);
   }

   @Override
   protected void ei() {
      super.ei();
      if (this.d()) {
         this.a(caz.mn);
      }

   }

   @Override
   public baj b(buc $$0, bai $$1) {
      boolean $$2 = this.n($$0.b($$1));
      if (!$$2 && this.d() && !this.bJ() && !$$0.fo()) {
         if (!this.s.y) {
            $$0.k(this);
         }

         return baj.a(this.s.y);
      } else {
         baj $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cax $$4 = $$0.b($$1);
            return $$4.a(caz.mn) ? $$4.a($$0, this, $$1) : baj.d;
         } else {
            if ($$2 && !this.aM()) {
               this.s.a(null, this.df(), this.dh(), this.dl(), ajw.tJ, this.cR(), 1.0F, 1.0F + (this.R.i() - this.R.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.6F * this.cA()), (double)(this.cW() * 0.4F));
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if (this.y_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         amn $$5 = $$0.r_();
         Object var8;
         if ($$5.a(30) == 0) {
            bce $$6 = bbr.bm.a((cgx)$$0.D());
            var8 = this.a($$0, $$1, $$6, new bsj.b(bsj.a($$5), false));
            $$6.a(bbs.a, new cax(caz.mu));
            this.a(null);
         } else if ($$5.a(10) == 0) {
            bbk $$7 = bbr.aO.a((cgx)$$0.D());
            $$7.b_(-24000);
            var8 = this.a($$0, $$1, $$7, null);
         } else {
            var8 = new bbk.a(0.5F);
         }

         return super.a($$0, $$1, $$2, (bcu)var8, $$4);
      }
   }

   private bcu a(chm $$0, bah $$1, bce $$2, @Nullable bcu $$3) {
      $$2.b(this.df(), this.dh(), this.dl(), this.dq(), 0.0F);
      $$2.a($$0, $$1, bcg.g, $$3, null);
      $$2.a(this, true);
      return new bbk.a(0.0F);
   }

   static class a extends bjc {
      private final bsd g;

      a(bsd $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public gt k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bf() && this.a(this.g.s, this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bf() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(cha $$0, gt $$1) {
         return $$0.a_($$1).a(cju.D) && $$0.a_($$1.b()).a($$0, $$1, dqm.a);
      }
   }

   static class b extends blb {
      b(bsd $$0, cgx $$1) {
         super($$0, $$1);
      }

      @Override
      protected dqn a(int $$0) {
         this.o = new dqq();
         this.o.a(true);
         return new dqn(this.o, $$0);
      }

      @Override
      protected boolean a(dqh $$0) {
         return $$0 != dqh.i && $$0 != dqh.o && $$0 != dqh.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(gt $$0) {
         return this.b.a_($$0).a(cju.D) || super.a($$0);
      }
   }
}
