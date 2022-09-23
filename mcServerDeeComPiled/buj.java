public abstract class buj extends buu {
   public double b;
   public double c;
   public double d;

   protected buj(bbr<? extends buj> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public buj(bbr<? extends buj> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cgx $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dq(), this.ds());
      this.am();
      double $$8 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
      if ($$8 != 0.0) {
         this.b = $$4 / $$8 * 0.1;
         this.c = $$5 / $$8 * 0.1;
         this.d = $$6 / $$8 * 0.1;
      }

   }

   public buj(bbr<? extends buj> $$0, bcc $$1, double $$2, double $$3, double $$4, cgx $$5) {
      this($$0, $$1.df(), $$1.dh(), $$1.dl(), $$2, $$3, $$4, $$5);
      this.b($$1);
      this.a($$1.dq(), $$1.ds());
   }

   @Override
   protected void a_() {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cy().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void k() {
      bbn $$0 = this.x();
      if (this.s.y || ($$0 == null || !$$0.dt()) && this.s.E(this.da())) {
         super.k();
         if (this.M_()) {
            this.f(1);
         }

         dwo $$1 = buv.a(this, this::a);
         if ($$1.c() != dwo.a.a) {
            this.a($$1);
         }

         this.aJ();
         dwq $$2 = this.dd();
         double $$3 = this.df() + $$2.c;
         double $$4 = this.dh() + $$2.d;
         double $$5 = this.dl() + $$2.e;
         buv.a(this, 0.2F);
         float $$6 = this.j();
         if (this.aR()) {
            for(int $$7 = 0; $$7 < 4; ++$$7) {
               float $$8 = 0.25F;
               this.s.a(io.e, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$6 = 0.8F;
         }

         this.f($$2.b(this.b, this.c, this.d).a((double)$$6));
         this.s.a(this.i(), $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         this.e($$3, $$4, $$5);
      } else {
         this.ah();
      }
   }

   @Override
   protected boolean a(bbn $$0) {
      return super.a($$0) && !$$0.Q;
   }

   protected boolean M_() {
      return true;
   }

   protected im i() {
      return io.Y;
   }

   protected float j() {
      return 0.95F;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("power", (qc)this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         pp $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.b = $$1.h(0);
            this.c = $$1.h(1);
            this.d = $$1.h(2);
         }
      }

   }

   @Override
   public boolean bk() {
      return true;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bi();
         bbn $$2 = $$0.m();
         if ($$2 != null) {
            if (!this.s.y) {
               dwq $$3 = $$2.by();
               this.f($$3);
               this.b = $$3.c * 0.1;
               this.c = $$3.d * 0.1;
               this.d = $$3.e * 0.1;
               this.b($$2);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public float bg() {
      return 1.0F;
   }

   @Override
   public tc<?> S() {
      bbn $$0 = this.x();
      int $$1 = $$0 == null ? 0 : $$0.ae();
      return new tg(this.ae(), this.co(), this.df(), this.dh(), this.dl(), this.ds(), this.dq(), this.ad(), $$1, new dwq(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      double $$1 = $$0.h();
      double $$2 = $$0.i();
      double $$3 = $$0.j();
      double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
      if ($$4 != 0.0) {
         this.b = $$1 / $$4 * 0.1;
         this.c = $$2 / $$4 * 0.1;
         this.d = $$3 / $$4 * 0.1;
      }

   }
}
