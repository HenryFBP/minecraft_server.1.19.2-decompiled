import javax.annotation.Nullable;

public class boc extends bnc implements bcs, bru {
   private static final aaj<Byte> b = aam.a(boc.class, aal.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public boc(bbr<? extends boc> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      this.bS.a(1, new bjn(this, 1.25, 20, 10.0F));
      this.bS.a(2, new bkb(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new bix(this, buc.class, 6.0F));
      this.bS.a(4, new bjk(this));
      this.bT.a(1, new bkh(this, bce.class, 10, true, false, $$0 -> $$0 instanceof bri));
   }

   public static bdc.a n() {
      return bce.w().a(bdd.a, 4.0).a(bdd.d, 0.2F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, (byte)16);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.q());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.v($$0.q("Pumpkin"));
      }

   }

   @Override
   public boolean eL() {
      return true;
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.s.y) {
         int $$0 = ami.b(this.df());
         int $$1 = ami.b(this.dh());
         int $$2 = ami.b(this.dl());
         gt $$3 = new gt($$0, $$1, $$2);
         cht $$4 = this.s.w($$3).a();
         if ($$4.d($$3)) {
            this.a(baw.c, 1.0F);
         }

         if (!this.s.W().b(cgt.c)) {
            return;
         }

         cvo $$5 = cju.cW.m();

         for(int $$6 = 0; $$6 < 4; ++$$6) {
            $$0 = ami.b(this.df() + (double)((float)($$6 % 2 * 2 - 1) * 0.25F));
            $$1 = ami.b(this.dh());
            $$2 = ami.b(this.dl() + (double)((float)($$6 / 2 % 2 * 2 - 1) * 0.25F));
            gt $$7 = new gt($$0, $$1, $$2);
            if (this.s.a_($$7).h() && $$5.a((cha)this.s, $$7)) {
               this.s.b($$7, $$5);
               this.s.a(czv.i, $$7, czv.a.a(this, $$5));
            }
         }
      }

   }

   @Override
   public void a(bcc $$0, float $$1) {
      buy $$2 = new buy(this.s, this);
      double $$3 = $$0.dj() - 1.1F;
      double $$4 = $$0.df() - this.df();
      double $$5 = $$3 - $$2.dh();
      double $$6 = $$0.dl() - this.dl();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(ajw.tX, 1.0F, 0.4F / (this.dQ().i() * 0.4F + 0.8F));
      this.s.b($$2);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 1.7F;
   }

   @Override
   protected baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.qd) && this.a()) {
         this.a(ajx.h);
         this.a(czv.O, $$0);
         if (!this.s.y) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return baj.a(this.s.y);
      } else {
         return baj.d;
      }
   }

   @Override
   public void a(ajx $$0) {
      this.s.a(null, this, ajw.tY, $$0, 1.0F, 1.0F);
      if (!this.s.k_()) {
         this.v(false);
         this.a(new cax(caz.es), 1.7F);
      }

   }

   @Override
   public boolean a() {
      return this.bo() && this.q();
   }

   public boolean q() {
      return (this.Y.a(b) & 16) != 0;
   }

   public void v(boolean $$0) {
      byte $$1 = this.Y.a(b);
      if ($$0) {
         this.Y.b(b, (byte)($$1 | 16));
      } else {
         this.Y.b(b, (byte)($$1 & -17));
      }

   }

   @Nullable
   @Override
   protected ajv r() {
      return ajw.tU;
   }

   @Nullable
   @Override
   protected ajv c(baw $$0) {
      return ajw.tW;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return ajw.tV;
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.75F * this.cA()), (double)(this.cW() * 0.4F));
   }
}
