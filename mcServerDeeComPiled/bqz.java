import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class bqz extends brq implements bru {
   private final bjo<bqz> b = new bjo<>(this, 1.0, 20, 15.0F);
   private final biz c = new biz(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         bqz.this.u(false);
      }

      @Override
      public void c() {
         super.c();
         bqz.this.u(true);
      }
   };

   protected bqz(bbr<? extends bqz> $$0, cgx $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void u() {
      this.bS.a(2, new bjr(this));
      this.bS.a(3, new bii(this, 1.0));
      this.bS.a(3, new bhw(this, boh.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new bkb(this, 1.0));
      this.bS.a(6, new bix(this, buc.class, 8.0F));
      this.bS.a(6, new bjk(this));
      this.bT.a(1, new bkg(this));
      this.bT.a(2, new bkh(this, buc.class, true));
      this.bT.a(3, new bkh(this, bnq.class, true));
      this.bT.a(3, new bkh(this, bof.class, 10, true, false, bof.bY));
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.d, 0.25);
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(this.q(), 0.15F, 1.0F);
   }

   abstract ajv q();

   @Override
   public bch ey() {
      return bch.b;
   }

   @Override
   public void w_() {
      boolean $$0 = this.fD();
      if ($$0) {
         cax $$1 = this.c(bbs.f);
         if (!$$1.b()) {
            if ($$1.h()) {
               $$1.b($$1.j() + this.R.a(2));
               if ($$1.j() >= $$1.k()) {
                  this.d(bbs.f);
                  this.a(bbs.f, cax.b);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.f(8);
         }
      }

      super.w_();
   }

   @Override
   public void br() {
      super.br();
      if (this.cQ() instanceof bcl $$0) {
         this.aX = $$0.aX;
      }

   }

   @Override
   protected void a(amn $$0, bah $$1) {
      super.a($$0, $$1);
      this.a(bbs.a, new cax(caz.mQ));
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      amn $$5 = $$0.r_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.t();
      this.r($$5.i() < 0.55F * $$1.d());
      if (this.c(bbs.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bbs.f, new cax($$5.i() < 0.1F ? cju.dp : cju.do));
            this.bV[bbs.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.s != null && !this.s.y) {
         this.bS.a(this.c);
         this.bS.a(this.b);
         cax $$0 = this.b(buv.a(this, caz.mQ));
         if ($$0.a(caz.mQ)) {
            int $$1 = 20;
            if (this.s.ag() != bag.d) {
               $$1 = 40;
            }

            this.b.c($$1);
            this.bS.a(4, this.b);
         } else {
            this.bS.a(4, this.c);
         }

      }
   }

   @Override
   public void a(bcc $$0, float $$1) {
      cax $$2 = this.h(this.b(buv.a(this, caz.mQ)));
      bui $$3 = this.b($$2, $$1);
      double $$4 = $$0.df() - this.df();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dh();
      double $$6 = $$0.dl() - this.dl();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.s.ag().a() * 4));
      this.a(ajw.sT, 1.0F, 1.0F / (this.dQ().i() * 0.4F + 0.8F));
      this.s.b($$3);
   }

   protected bui b(cax $$0, float $$1) {
      return buv.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cbm $$0) {
      return $$0 == caz.mQ;
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bbs $$0, cax $$1) {
      super.a($$0, $$1);
      if (!this.s.y) {
         this.t();
      }

   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 1.74F;
   }

   @Override
   public double bs() {
      return -0.6;
   }

   public boolean fJ() {
      return this.cd();
   }
}
