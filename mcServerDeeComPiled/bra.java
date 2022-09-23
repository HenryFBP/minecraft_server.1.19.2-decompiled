import java.util.EnumSet;

public class bra extends brq {
   private float b = 0.5F;
   private int c;
   private static final aaj<Byte> d = aam.a(bra.class, aal.a);

   public bra(bbr<? extends bra> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.j, -1.0F);
      this.a(dqh.i, 8.0F);
      this.a(dqh.n, 0.0F);
      this.a(dqh.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void u() {
      this.bS.a(4, new bra.a(this));
      this.bS.a(5, new bjd(this, 1.0));
      this.bS.a(7, new bkb(this, 1.0, 0.0F));
      this.bS.a(8, new bix(this, buc.class, 8.0F));
      this.bS.a(8, new bjk(this));
      this.bT.a(1, new bkg(this).a());
      this.bT.a(2, new bkh(this, buc.class, true));
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.f, 6.0).a(bdd.d, 0.23F).a(bdd.b, 48.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(d, (byte)0);
   }

   @Override
   protected ajv r() {
      return ajw.bB;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.bE;
   }

   @Override
   protected ajv x_() {
      return ajw.bD;
   }

   @Override
   public float bg() {
      return 1.0F;
   }

   @Override
   public void w_() {
      if (!this.y && this.dd().d < 0.0) {
         this.f(this.dd().d(1.0, 0.6, 1.0));
      }

      if (this.s.y) {
         if (this.R.a(24) == 0 && !this.aM()) {
            this.s.a(this.df() + 0.5, this.dh() + 0.5, this.dl() + 0.5, ajw.bC, this.cR(), 1.0F + this.R.i(), this.R.i() * 0.7F + 0.3F, false);
         }

         for(int $$0 = 0; $$0 < 2; ++$$0) {
            this.s.a(io.R, this.d(0.5), this.di(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.w_();
   }

   @Override
   public boolean eL() {
      return true;
   }

   @Override
   protected void T() {
      --this.c;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.R.a(0.5, 6.891);
      }

      bcc $$0 = this.G();
      if ($$0 != null && $$0.dj() > this.dj() + (double)this.b && this.c($$0)) {
         dwq $$1 = this.dd();
         this.f(this.dd().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.af = true;
      }

      super.T();
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   public boolean bH() {
      return this.q();
   }

   private boolean q() {
      return (this.Y.a(d) & 1) != 0;
   }

   void v(boolean $$0) {
      byte $$1 = this.Y.a(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.Y.b(d, $$1);
   }

   static class a extends bip {
      private final bra a;
      private int b;
      private int c;
      private int d;

      public a(bra $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean a() {
         bcc $$0 = this.a.G();
         return $$0 != null && $$0.bo() && this.a.c($$0);
      }

      @Override
      public void c() {
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.v(false);
         this.d = 0;
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         --this.c;
         bcc $$0 = this.a.G();
         if ($$0 != null) {
            boolean $$1 = this.a.E().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               ++this.d;
            }

            double $$2 = this.a.f((bbn)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.z($$0);
               }

               this.a.A().a($$0.df(), $$0.dh(), $$0.dl(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.df() - this.a.df();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dl() - this.a.dl();
               if (this.c <= 0) {
                  ++this.b;
                  if (this.b == 1) {
                     this.c = 60;
                     this.a.v(true);
                  } else if (this.b <= 4) {
                     this.c = 6;
                  } else {
                     this.c = 100;
                     this.b = 0;
                     this.a.v(false);
                  }

                  if (this.b > 1) {
                     double $$6 = Math.sqrt(Math.sqrt($$2)) * 0.5;
                     if (!this.a.aM()) {
                        this.a.s.a(null, 1018, this.a.da(), 0);
                     }

                     for(int $$7 = 0; $$7 < 1; ++$$7) {
                        bux $$8 = new bux(this.a.s, this.a, this.a.dQ().a($$3, 2.297 * $$6), $$4, this.a.dQ().a($$5, 2.297 * $$6));
                        $$8.e($$8.df(), this.a.e(0.5) + 0.5, $$8.dl());
                        this.a.s.b($$8);
                     }
                  }
               }

               this.a.z().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.A().a($$0.df(), $$0.dh(), $$0.dl(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.b(bdd.b);
      }
   }
}
