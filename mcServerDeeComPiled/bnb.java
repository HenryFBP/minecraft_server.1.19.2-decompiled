public abstract class bnb extends bog implements bng {
   private static final aaj<Boolean> b = aam.a(bnb.class, aal.i);

   public bnb(bbr<? extends bnb> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bnb.a(this);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.65F;
   }

   public static bdc.a n() {
      return bce.w().a(bdd.a, 3.0);
   }

   @Override
   public boolean P() {
      return super.P() || this.q();
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && !this.Y();
   }

   @Override
   public int fo() {
      return 8;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, false);
   }

   @Override
   public boolean q() {
      return this.Y.a(b);
   }

   @Override
   public void v(boolean $$0) {
      this.Y.b(b, $$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.q());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.v($$0.q("FromBucket"));
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(0, new bji(this, 1.25));
      this.bS.a(2, new bhw(this, buc.class, 8.0F, 1.6, 1.4, bbq.f::test));
      this.bS.a(4, new bnb.b(this));
   }

   @Override
   protected blc a(cgx $$0) {
      return new ble(this, $$0);
   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() && this.aR()) {
         this.a(0.01F, $$0);
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
   public void w_() {
      if (!this.aR() && this.y && this.A) {
         this.f(this.dd().b((double)((this.R.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.R.i() * 2.0F - 1.0F) * 0.05F)));
         this.y = false;
         this.af = true;
         this.a(this.fK(), this.eC(), this.eD());
      }

      super.w_();
   }

   @Override
   protected baj b(buc $$0, bai $$1) {
      return (baj)bng.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void m(cax $$0) {
      bng.a(this, $$0);
   }

   @Override
   public void c(pj $$0) {
      bng.a(this, $$0);
   }

   @Override
   public ajv t() {
      return ajw.ci;
   }

   protected boolean fJ() {
      return true;
   }

   protected abstract ajv fK();

   @Override
   protected ajv aG() {
      return ajw.gp;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
   }

   static class a extends bhs {
      private final bnb l;

      a(bnb $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(akp.a)) {
            this.l.f(this.l.dd().b(0.0, 0.005, 0.0));
         }

         if (this.k == bhs.a.b && !this.l.D().l()) {
            float $$0 = (float)(this.h * this.l.b(bdd.d));
            this.l.r(ami.i(0.125F, this.l.eK(), $$0));
            double $$1 = this.e - this.l.df();
            double $$2 = this.f - this.l.dh();
            double $$3 = this.g - this.l.dl();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.f(this.l.dd().b(0.0, (double)this.l.eK() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ami.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.o(this.a(this.l.dq(), $$5, 90.0F));
               this.l.aX = this.l.dq();
            }

         } else {
            this.l.r(0.0F);
         }
      }
   }

   static class b extends bjm {
      private final bnb i;

      public b(bnb $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.fJ() && super.a();
      }
   }
}
