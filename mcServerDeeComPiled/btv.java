import java.util.EnumSet;
import javax.annotation.Nullable;

public class btv extends btk {
   private static final int bZ = 5;
   @Nullable
   private gt ca;
   private int cb;

   public btv(bbr<? extends btv> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      this.bS.a(0, new bij(this));
      this.bS.a(0, new bjz<>(this, ccu.a(new cax(caz.qs), ccv.h), ajw.wl, $$0 -> this.s.N() && !$$0.bX()));
      this.bS.a(0, new bjz<>(this, new cax(caz.oN), ajw.wq, $$0 -> this.s.M() && $$0.bX()));
      this.bS.a(1, new bjx(this));
      this.bS.a(1, new bhw(this, bsj.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bhw(this, brj.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bhw(this, bsf.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bhw(this, bse.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bhw(this, brt.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new bhw(this, bro.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bhw(this, bsi.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new bji(this, 0.5));
      this.bS.a(1, new biy(this));
      this.bS.a(2, new btv.a(this, 2.0, 0.35));
      this.bS.a(4, new bjd(this, 0.35));
      this.bS.a(8, new bkb(this, 0.35));
      this.bS.a(9, new bis(this, buc.class, 3.0F, 1.0F));
      this.bS.a(10, new bix(this, bce.class, 8.0F));
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      return null;
   }

   @Override
   public boolean fN() {
      return false;
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (!$$2.a(caz.rJ) && this.bo() && !this.fL() && !this.y_()) {
         if ($$1 == bai.a) {
            $$0.a(akg.S);
         }

         if (this.fM().isEmpty()) {
            return baj.a(this.s.y);
         } else {
            if (!this.s.y) {
               this.e($$0);
               this.a($$0, this.C_(), 1);
            }

            return baj.a(this.s.y);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void fR() {
      btt.f[] $$0 = (btt.f[])btt.b.get(1);
      btt.f[] $$1 = (btt.f[])btt.b.get(2);
      if ($$0 != null && $$1 != null) {
         cfw $$2 = this.fM();
         this.a($$2, $$0, 5);
         int $$3 = this.R.a($$1.length);
         btt.f $$4 = $$1[$$3];
         cfv $$5 = $$4.a(this, this.R);
         if ($$5 != null) {
            $$2.add($$5);
         }

      }
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cb);
      if (this.ca != null) {
         $$0.a("WanderTarget", (qc)pv.a(this.ca));
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cb = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.ca = pv.b($$0.p("WanderTarget"));
      }

      this.b_(Math.max(0, this.j()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cfv $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.R.a(4);
         this.s.b(new bbt(this.s, this.df(), this.dh() + 0.5, this.dl(), $$1));
      }

   }

   @Override
   protected ajv r() {
      return this.fL() ? ajw.wr : ajw.wj;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.wo;
   }

   @Override
   protected ajv x_() {
      return ajw.wk;
   }

   @Override
   protected ajv d(cax $$0) {
      return $$0.a(caz.oN) ? ajw.wm : ajw.wn;
   }

   @Override
   protected ajv v(boolean $$0) {
      return $$0 ? ajw.ws : ajw.wp;
   }

   @Override
   public ajv fO() {
      return ajw.ws;
   }

   public void u(int $$0) {
      this.cb = $$0;
   }

   public int fT() {
      return this.cb;
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.s.y) {
         this.fU();
      }

   }

   private void fU() {
      if (this.cb > 0 && !this.fL() && --this.cb == 0) {
         this.ah();
      }

   }

   public void g(@Nullable gt $$0) {
      this.ca = $$0;
   }

   @Nullable
   gt fV() {
      return this.ca;
   }

   class a extends bip {
      final btv a;
      final double b;
      final double c;

      a(btv $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public void d() {
         this.a.g(null);
         btv.this.bR.n();
      }

      @Override
      public boolean a() {
         gt $$0 = this.a.fV();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gt $$0 = this.a.fV();
         if ($$0 != null && btv.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               dwq $$1 = new dwq((double)$$0.u() - this.a.df(), (double)$$0.v() - this.a.dh(), (double)$$0.w() - this.a.dl()).d();
               dwq $$2 = $$1.a(10.0).b(this.a.df(), this.a.dh(), this.a.dl());
               btv.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               btv.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }

      }

      private boolean a(gt $$0, double $$1) {
         return !$$0.a(this.a.cY(), $$1);
      }
   }
}
