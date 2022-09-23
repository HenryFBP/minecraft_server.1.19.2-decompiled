import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bnm extends bog {
   private static final aaj<gt> d = aam.a(bnm.class, aal.l);
   private static final aaj<Boolean> e = aam.a(bnm.class, aal.i);
   private static final aaj<Integer> bX = aam.a(bnm.class, aal.b);
   static final bmf bY = bmf.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bZ = 2400;
   public static final Predicate<bqv> c = $$0 -> !$$0.s() && $$0.bo() && $$0.aR();

   public bnm(bbr<? extends bnm> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bhu(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bht(this, 10);
      this.r(true);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.i(this.bZ());
      this.p(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean dB() {
      return false;
   }

   @Override
   protected void a(int $$0) {
   }

   public void g(gt $$0) {
      this.Y.b(d, $$0);
   }

   public gt n() {
      return this.Y.a(d);
   }

   public boolean q() {
      return this.Y.a(e);
   }

   public void v(boolean $$0) {
      this.Y.b(e, $$0);
   }

   public int t() {
      return this.Y.a(bX);
   }

   public void b(int $$0) {
      this.Y.b(bX, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(d, gt.b);
      this.Y.a(e, false);
      this.Y.a(bX, 2400);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.n().u());
      $$0.a("TreasurePosY", this.n().v());
      $$0.a("TreasurePosZ", this.n().w());
      $$0.a("GotFish", this.q());
      $$0.a("Moistness", this.t());
   }

   @Override
   public void a(pj $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.g(new gt($$1, $$2, $$3));
      super.a($$0);
      this.v($$0.q("GotFish"));
      this.b($$0.h("Moistness"));
   }

   @Override
   protected void u() {
      this.bS.a(0, new bia(this));
      this.bS.a(0, new bjy(this));
      this.bS.a(1, new bnm.a(this));
      this.bS.a(2, new bnm.b(this, 4.0));
      this.bS.a(4, new bjm(this, 1.0, 10));
      this.bS.a(4, new bjk(this));
      this.bS.a(5, new bix(this, buc.class, 6.0F));
      this.bS.a(5, new bif(this, 10));
      this.bS.a(6, new biz(this, 1.2F, true));
      this.bS.a(8, new bnm.c());
      this.bS.a(8, new bik(this));
      this.bS.a(9, new bhw(this, brm.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new bkg(this, brm.class).a());
   }

   public static bdc.a fJ() {
      return bce.w().a(bdd.a, 10.0).a(bdd.d, 1.2F).a(bdd.f, 3.0);
   }

   @Override
   protected blc a(cgx $$0) {
      return new ble(this, $$0);
   }

   @Override
   public boolean z(bbn $$0) {
      boolean $$1 = $$0.a(baw.c(this), (float)((int)this.b(bdd.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(ajw.es, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int bZ() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.bZ();
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 0.3F;
   }

   @Override
   public int U() {
      return 1;
   }

   @Override
   public int V() {
      return 1;
   }

   @Override
   protected boolean l(bbn $$0) {
      return true;
   }

   @Override
   public boolean g(cax $$0) {
      bbs $$1 = bce.i($$0);
      if (!this.c($$1).b()) {
         return false;
      } else {
         return $$1 == bbs.a && super.g($$0);
      }
   }

   @Override
   protected void b(bqv $$0) {
      if (this.c(bbs.a).b()) {
         cax $$1 = $$0.i();
         if (this.k($$1)) {
            this.a($$0);
            this.a(bbs.a, $$1);
            this.e(bbs.a);
            this.a($$0, $$1.K());
            $$0.ah();
         }
      }

   }

   @Override
   public void k() {
      super.k();
      if (this.fA()) {
         this.i(this.bZ());
      } else {
         if (this.aT()) {
            this.b(2400);
         } else {
            this.b(this.t() - 1);
            if (this.t() <= 0) {
               this.a(baw.t, 1.0F);
            }

            if (this.y) {
               this.f(this.dd().b((double)((this.R.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.R.i() * 2.0F - 1.0F) * 0.2F)));
               this.o(this.R.i() * 360.0F);
               this.y = false;
               this.af = true;
            }
         }

         if (this.s.y && this.aR() && this.dd().g() > 0.03) {
            dwq $$0 = this.e(0.0F);
            float $$1 = ami.b(this.dq() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ami.a(this.dq() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.R.i() * 0.7F;

            for(int $$4 = 0; $$4 < 2; ++$$4) {
               this.s.a(io.al, this.df() - $$0.c * (double)$$3 + (double)$$1, this.dh() - $$0.d, this.dl() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.s.a(io.al, this.df() - $$0.c * (double)$$3 - (double)$$1, this.dh() - $$0.d, this.dl() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }

      }
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 38) {
         this.a(io.J);
      } else {
         super.a($$0);
      }

   }

   private void a(im $$0) {
      for(int $$1 = 0; $$1 < 7; ++$$1) {
         double $$2 = this.R.k() * 0.01;
         double $$3 = this.R.k() * 0.01;
         double $$4 = this.R.k() * 0.01;
         this.s.a($$0, this.d(1.0), this.di() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }

   }

   @Override
   protected baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(aks.ak)) {
         if (!this.s.y) {
            this.a(ajw.eu, 1.0F, 1.0F);
         }

         this.v(true);
         if (!$$0.fB().d) {
            $$2.g(1);
         }

         return baj.a(this.s.y);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.ev;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return ajw.et;
   }

   @Nullable
   @Override
   protected ajv r() {
      return this.aR() ? ajw.er : ajw.eq;
   }

   @Override
   protected ajv aH() {
      return ajw.ey;
   }

   @Override
   protected ajv aG() {
      return ajw.ez;
   }

   protected boolean fK() {
      gt $$0 = this.D().h();
      return $$0 != null ? $$0.a(this.cY(), 12.0) : false;
   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() && this.aR()) {
         this.a(this.eK(), $$0);
         this.a(bci.a, this.dd());
         this.f(this.dd().a(0.9));
         if (this.G() == null) {
            this.f(this.dd().b(0.0, -0.005, 0.0));
         }
      } else {
         super.g($$0);
      }

   }

   @Override
   public boolean a(buc $$0) {
      return true;
   }

   static class a extends bip {
      private final bnm a;
      private boolean b;

      a(bnm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean D_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.q() && this.a.ca() >= 100;
      }

      @Override
      public boolean b() {
         gt $$0 = this.a.n();
         return !new gt((double)$$0.u(), this.a.dh(), (double)$$0.w()).a(this.a.cY(), 4.0) && !this.b && this.a.ca() >= 100;
      }

      @Override
      public void c() {
         if (this.a.s instanceof agg) {
            agg $$0 = (agg)this.a.s;
            this.b = false;
            this.a.D().n();
            gt $$1 = this.a.da();
            gt $$2 = $$0.a(akv.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.g($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         gt $$0 = this.a.n();
         if (new gt((double)$$0.u(), this.a.dh(), (double)$$0.w()).a(this.a.cY(), 4.0) || this.b) {
            this.a.v(false);
         }

      }

      @Override
      public void e() {
         cgx $$0 = this.a.s;
         if (this.a.fK() || this.a.D().l()) {
            dwq $$1 = dwq.a(this.a.n());
            dwq $$2 = bmj.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bmj.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               gt $$3 = new gt($$2);
               if (!$$0.b_($$3).a(akp.a) || !$$0.a_($$3).a($$0, $$3, dqm.b)) {
                  $$2 = bmj.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.z().a($$2.c, $$2.d, $$2.e, (float)(this.a.V() + 20), (float)this.a.U());
            this.a.D().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.w.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }

      }
   }

   static class b extends bip {
      private final bnm a;
      private final double b;
      @Nullable
      private buc c;

      b(bnm $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.s.a(bnm.bY, this.a);
         if (this.c == null) {
            return false;
         } else {
            return this.c.bS() && this.a.G() != this.c;
         }
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bS() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bbg(bbi.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.D().n();
      }

      @Override
      public void e() {
         this.a.z().a(this.c, (float)(this.a.V() + 20), (float)this.a.U());
         if (this.a.f(this.c) < 6.25) {
            this.a.D().n();
         } else {
            this.a.D().a(this.c, this.b);
         }

         if (this.c.bS() && this.c.s.w.a(6) == 0) {
            this.c.b(new bbg(bbi.D, 100), this.a);
         }

      }
   }

   class c extends bip {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bnm.this.S) {
            return false;
         } else {
            List<bqv> $$0 = bnm.this.s.a(bqv.class, bnm.this.cy().c(8.0, 8.0, 8.0), bnm.c);
            return !$$0.isEmpty() || !bnm.this.c(bbs.a).b();
         }
      }

      @Override
      public void c() {
         List<bqv> $$0 = bnm.this.s.a(bqv.class, bnm.this.cy().c(8.0, 8.0, 8.0), bnm.c);
         if (!$$0.isEmpty()) {
            bnm.this.D().a((bbn)$$0.get(0), 1.2F);
            bnm.this.a(ajw.ex, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cax $$0 = bnm.this.c(bbs.a);
         if (!$$0.b()) {
            this.a($$0);
            bnm.this.a(bbs.a, cax.b);
            this.b = bnm.this.S + bnm.this.R.a(100);
         }

      }

      @Override
      public void e() {
         List<bqv> $$0 = bnm.this.s.a(bqv.class, bnm.this.cy().c(8.0, 8.0, 8.0), bnm.c);
         cax $$1 = bnm.this.c(bbs.a);
         if (!$$1.b()) {
            this.a($$1);
            bnm.this.a(bbs.a, cax.b);
         } else if (!$$0.isEmpty()) {
            bnm.this.D().a((bbn)$$0.get(0), 1.2F);
         }

      }

      private void a(cax $$0) {
         if (!$$0.b()) {
            double $$1 = bnm.this.dj() - 0.3F;
            bqv $$2 = new bqv(bnm.this.s, bnm.this.df(), $$1, bnm.this.dl(), $$0);
            $$2.a(40);
            $$2.c(bnm.this.co());
            float $$3 = 0.3F;
            float $$4 = bnm.this.R.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bnm.this.R.i();
            $$2.n(
               (double)(0.3F * -ami.a(bnm.this.dq() * (float) (Math.PI / 180.0)) * ami.b(bnm.this.ds() * (float) (Math.PI / 180.0)) + ami.b($$4) * $$5),
               (double)(0.3F * ami.a(bnm.this.ds() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ami.b(bnm.this.dq() * (float) (Math.PI / 180.0)) * ami.b(bnm.this.ds() * (float) (Math.PI / 180.0)) + ami.a($$4) * $$5)
            );
            bnm.this.s.b($$2);
         }
      }
   }
}
