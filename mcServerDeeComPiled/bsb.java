import javax.annotation.Nullable;

public class bsb extends brq {
   private static final aaj<Byte> b = aam.a(bsb.class, aal.a);
   private static final float c = 0.1F;

   public bsb(bbr<? extends bsb> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      this.bS.a(1, new bij(this));
      this.bS.a(3, new biv(this, 0.4F));
      this.bS.a(4, new bsb.a(this));
      this.bS.a(5, new bkb(this, 0.8));
      this.bS.a(6, new bix(this, buc.class, 8.0F));
      this.bS.a(6, new bjk(this));
      this.bT.a(1, new bkg(this));
      this.bT.a(2, new bsb.c(this, buc.class));
      this.bT.a(3, new bsb.c(this, bnq.class));
   }

   @Override
   public double bt() {
      return (double)(this.cX() * 0.5F);
   }

   @Override
   protected blc a(cgx $$0) {
      return new bld(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, (byte)0);
   }

   @Override
   public void k() {
      super.k();
      if (!this.s.y) {
         this.v(this.z);
      }

   }

   public static bdc.a q() {
      return brq.fO().a(bdd.a, 16.0).a(bdd.d, 0.3F);
   }

   @Override
   protected ajv r() {
      return ajw.uc;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.ue;
   }

   @Override
   protected ajv x_() {
      return ajw.ud;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.uf, 0.15F, 1.0F);
   }

   @Override
   public boolean b_() {
      return this.t();
   }

   @Override
   public void a(cvo $$0, dwq $$1) {
      if (!$$0.a(cju.bf)) {
         super.a($$0, $$1);
      }

   }

   @Override
   public bch ey() {
      return bch.c;
   }

   @Override
   public boolean c(bbg $$0) {
      return $$0.b() == bbi.s ? false : super.c($$0);
   }

   public boolean t() {
      return (this.Y.a(b) & 1) != 0;
   }

   public void v(boolean $$0) {
      byte $$1 = this.Y.a(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.Y.b(b, $$1);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      amn $$5 = $$0.r_();
      if ($$5.a(100) == 0) {
         bry $$6 = bbr.aE.a(this.s);
         $$6.b(this.df(), this.dh(), this.dl(), this.dq(), 0.0F);
         $$6.a($$0, $$1, $$2, null, null);
         $$6.k(this);
      }

      if ($$3 == null) {
         $$3 = new bsb.b();
         if ($$0.ag() == bag.d && $$5.i() < 0.1F * $$1.d()) {
            ((bsb.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof bsb.b) {
         bbe $$7 = ((bsb.b)$$3).a;
         if ($$7 != null) {
            this.b(new bbg($$7, Integer.MAX_VALUE));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 0.65F;
   }

   static class a extends biz {
      public a(bsb $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bJ();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bg();
         if ($$0 >= 0.5F && this.a.dQ().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }

      @Override
      protected double a(bcc $$0) {
         return (double)(4.0F + $$0.cW());
      }
   }

   public static class b implements bcu {
      @Nullable
      public bbe a;

      public void a(amn $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bbi.a;
         } else if ($$1 <= 2) {
            this.a = bbi.e;
         } else if ($$1 <= 3) {
            this.a = bbi.j;
         } else if ($$1 <= 4) {
            this.a = bbi.n;
         }

      }
   }

   static class c<T extends bcc> extends bkh<T> {
      public c(bsb $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bg();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
