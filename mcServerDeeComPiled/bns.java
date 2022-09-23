import javax.annotation.Nullable;

public class bns extends bne {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.33;
   private static final cdm cb = cdm.a(caz.pi, caz.pj);
   private static final aaj<Boolean> cc = aam.a(bns.class, aal.i);
   @Nullable
   private bns.a<buc> cd;
   @Nullable
   private bns.b ce;

   public bns(bbr<? extends bns> $$0, cgx $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean fJ() {
      return this.Y.a(cc);
   }

   private void v(boolean $$0) {
      this.Y.b(cc, $$0);
      this.t();
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Trusting", this.fJ());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.v($$0.q("Trusting"));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cc, false);
   }

   @Override
   protected void u() {
      this.ce = new bns.b(this, 0.6, cb, true);
      this.bS.a(1, new bij(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new biv(this, 0.3F));
      this.bS.a(8, new bjf(this));
      this.bS.a(9, new bib(this, 0.8));
      this.bS.a(10, new bkb(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new bix(this, buc.class, 10.0F));
      this.bT.a(1, new bkh(this, bnj.class, false));
      this.bT.a(1, new bkh(this, bof.class, 10, false, false, bof.bY));
   }

   @Override
   public void T() {
      if (this.A().b()) {
         double $$0 = this.A().c();
         if ($$0 == 0.6) {
            this.b(bco.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bco.a);
            this.g(true);
         } else {
            this.b(bco.a);
            this.g(false);
         }
      } else {
         this.b(bco.a);
         this.g(false);
      }

   }

   @Override
   public boolean h(double $$0) {
      return !this.fJ() && this.S > 2400;
   }

   public static bdc.a q() {
      return bce.w().a(bdd.a, 10.0).a(bdd.d, 0.3F).a(bdd.f, 3.0);
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Nullable
   @Override
   protected ajv r() {
      return ajw.nZ;
   }

   @Override
   public int J() {
      return 900;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.nY;
   }

   @Override
   protected ajv x_() {
      return ajw.oa;
   }

   private float fK() {
      return (float)this.b(bdd.f);
   }

   @Override
   public boolean z(bbn $$0) {
      return $$0.a(baw.c(this), this.fK());
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.fJ() && this.n($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.s.y) {
            if (this.R.a(3) == 0) {
               this.v(true);
               this.w(true);
               this.s.a(this, (byte)41);
            } else {
               this.w(false);
               this.s.a(this, (byte)40);
            }
         }

         return baj.a(this.s.y);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 41) {
         this.w(true);
      } else if ($$0 == 40) {
         this.w(false);
      } else {
         super.a($$0);
      }

   }

   private void w(boolean $$0) {
      im $$1 = io.L;
      if (!$$0) {
         $$1 = io.Y;
      }

      for(int $$2 = 0; $$2 < 7; ++$$2) {
         double $$3 = this.R.k() * 0.02;
         double $$4 = this.R.k() * 0.02;
         double $$5 = this.R.k() * 0.02;
         this.s.a($$1, this.d(1.0), this.di() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }

   }

   protected void t() {
      if (this.cd == null) {
         this.cd = new bns.a<>(this, buc.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.fJ()) {
         this.bS.a(4, this.cd);
      }

   }

   public bns b(agg $$0, bbk $$1) {
      return bbr.al.a((cgx)$$0);
   }

   @Override
   public boolean n(cax $$0) {
      return cb.a($$0);
   }

   public static boolean c(bbr<bns> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cha $$0) {
      if ($$0.f(this) && !$$0.d(this.cy())) {
         gt $$1 = this.da();
         if ($$1.v() < $$0.m_()) {
            return false;
         }

         cvo $$2 = $$0.a_($$1.c());
         if ($$2.a(cju.i) || $$2.a(akl.K)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$3 == null) {
         $$3 = new bbk.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.5F * this.cA()), (double)(this.cW() * 0.4F));
   }

   @Override
   public boolean bM() {
      return this.bQ() || super.bM();
   }

   static class a<T extends bcc> extends bhw<T> {
      private final bns i;

      public a(bns $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bbq.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.fJ() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.fJ() && super.b();
      }
   }

   static class b extends bjw {
      private final bns c;

      public b(bns $$0, double $$1, cdm $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.fJ();
      }
   }
}
