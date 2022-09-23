import javax.annotation.Nullable;

public class bro extends bsa implements bru {
   private static final int e = 4;
   private static final int bX = 3;
   private static final int bY = 3;
   private int bZ;
   private final dwq[][] ca;

   public bro(bbr<? extends bro> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.ca = new dwq[2][4];

      for(int $$2 = 0; $$2 < 4; ++$$2) {
         this.ca[0][$$2] = dwq.b;
         this.ca[1][$$2] = dwq.b;
      }

   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bsa.b());
      this.bS.a(4, new bro.b());
      this.bS.a(5, new bro.a());
      this.bS.a(6, new bjo<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new bjl(this, 0.6));
      this.bS.a(9, new bix(this, buc.class, 3.0F, 1.0F));
      this.bS.a(10, new bix(this, bce.class, 8.0F));
      this.bT.a(1, new bkg(this, bvk.class).a());
      this.bT.a(2, new bkh(this, buc.class, true).c(300));
      this.bT.a(3, new bkh(this, btk.class, false).c(300));
      this.bT.a(3, new bkh(this, bnq.class, false).c(300));
   }

   public static bdc.a q() {
      return brq.fO().a(bdd.d, 0.5).a(bdd.b, 18.0).a(bdd.a, 32.0);
   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.a(bbs.a, new cax(caz.mQ));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public dwl cz() {
      return this.cy().c(3.0, 0.0, 3.0);
   }

   @Override
   public void w_() {
      super.w_();
      if (this.s.y && this.bX()) {
         --this.bZ;
         if (this.bZ < 0) {
            this.bZ = 0;
         }

         if (this.aK == 1 || this.S % 1200 == 0) {
            this.bZ = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for(int $$2 = 0; $$2 < 4; ++$$2) {
               this.ca[0][$$2] = this.ca[1][$$2];
               this.ca[1][$$2] = new dwq(
                  (double)(-6.0F + (float)this.R.a(13)) * 0.5, (double)Math.max(0, this.R.a(6) - 4), (double)(-6.0F + (float)this.R.a(13)) * 0.5
               );
            }

            for(int $$3 = 0; $$3 < 16; ++$$3) {
               this.s.a(io.f, this.d(0.5), this.di(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.s.a(this.df(), this.dh(), this.dl(), ajw.jI, this.cR(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bZ = 3;

            for(int $$4 = 0; $$4 < 4; ++$$4) {
               this.ca[0][$$4] = this.ca[1][$$4];
               this.ca[1][$$4] = new dwq(0.0, 0.0, 0.0);
            }
         }
      }

   }

   @Override
   public ajv L_() {
      return ajw.jE;
   }

   public dwq[] y(float $$0) {
      if (this.bZ <= 0) {
         return this.ca[1];
      } else {
         double $$1 = (double)(((float)this.bZ - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         dwq[] $$2 = new dwq[4];

         for(int $$3 = 0; $$3 < 4; ++$$3) {
            $$2[$$3] = this.ca[1][$$3].a(1.0 - $$1).e(this.ca[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean p(bbn $$0) {
      if (super.p($$0)) {
         return true;
      } else if ($$0 instanceof bcc && ((bcc)$$0).ey() == bch.d) {
         return this.bY() == null && $$0.bY() == null;
      } else {
         return false;
      }
   }

   @Override
   protected ajv r() {
      return ajw.jE;
   }

   @Override
   protected ajv x_() {
      return ajw.jG;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.jH;
   }

   @Override
   protected ajv fJ() {
      return ajw.jF;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bcc $$0, float $$1) {
      cax $$2 = this.h(this.b(buv.a(this, caz.mQ)));
      bui $$3 = buv.a(this, $$2, $$1);
      double $$4 = $$0.df() - this.df();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dh();
      double $$6 = $$0.dl() - this.dl();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.s.ag().a() * 4));
      this.a(ajw.sT, 1.0F, 1.0F / (this.dQ().i() * 0.4F + 0.8F));
      this.s.b($$3);
   }

   @Override
   public bqy.a n() {
      if (this.fT()) {
         return bqy.a.c;
      } else {
         return this.fC() ? bqy.a.d : bqy.a.a;
      }
   }

   class a extends bsa.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (bro.this.G() == null) {
            return false;
         } else if (bro.this.G().ae() == this.e) {
            return false;
         } else {
            return bro.this.s.d_(bro.this.da()).a((float)bag.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bcc $$0 = bro.this.G();
         if ($$0 != null) {
            this.e = $$0.ae();
         }

      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 180;
      }

      @Override
      protected void k() {
         bro.this.G().b(new bbg(bbi.o, 400), bro.this);
      }

      @Override
      protected ajv l() {
         return ajw.jJ;
      }

      @Override
      protected bsa.a m() {
         return bsa.a.f;
      }
   }

   class b extends bsa.c {
      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            return !bro.this.a(bbi.n);
         }
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         bro.this.b(new bbg(bbi.n, 1200));
      }

      @Nullable
      @Override
      protected ajv l() {
         return ajw.jK;
      }

      @Override
      protected bsa.a m() {
         return bsa.a.e;
      }
   }
}
