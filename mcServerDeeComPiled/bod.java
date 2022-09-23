public class bod extends bog {
   public float b;
   public float c;
   public float d;
   public float e;
   public float bX;
   public float bY;
   public float bZ;
   public float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   private float cg;

   public bod(bbr<? extends bod> $$0, cgx $$1) {
      super($$0, $$1);
      this.R.b((long)this.ae());
      this.cc = 1.0F / (this.R.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void u() {
      this.bS.a(0, new bod.b(this));
      this.bS.a(1, new bod.a());
   }

   public static bdc.a fJ() {
      return bce.w().a(bdd.a, 10.0);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   protected ajv r() {
      return ajw.uk;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.um;
   }

   @Override
   protected ajv x_() {
      return ajw.ul;
   }

   protected ajv q() {
      return ajw.un;
   }

   @Override
   public boolean a(buc $$0) {
      return !this.fy();
   }

   @Override
   protected float eC() {
      return 0.4F;
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.c;
   }

   @Override
   public void w_() {
      super.w_();
      this.c = this.b;
      this.e = this.d;
      this.bY = this.bX;
      this.ca = this.bZ;
      this.bX += this.cc;
      if ((double)this.bX > Math.PI * 2) {
         if (this.s.y) {
            this.bX = (float) (Math.PI * 2);
         } else {
            this.bX -= (float) (Math.PI * 2);
            if (this.R.a(10) == 0) {
               this.cc = 1.0F / (this.R.i() + 1.0F) * 0.2F;
            }

            this.s.a(this, (byte)19);
         }
      }

      if (this.aU()) {
         if (this.bX < (float) Math.PI) {
            float $$0 = this.bX / (float) Math.PI;
            this.bZ = ami.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.cb = 1.0F;
               this.cd = 1.0F;
            } else {
               this.cd *= 0.8F;
            }
         } else {
            this.bZ = 0.0F;
            this.cb *= 0.9F;
            this.cd *= 0.99F;
         }

         if (!this.s.y) {
            this.n((double)(this.ce * this.cb), (double)(this.cf * this.cb), (double)(this.cg * this.cb));
         }

         dwq $$1 = this.dd();
         double $$2 = $$1.h();
         this.aX += (-((float)ami.d($$1.c, $$1.e)) * 180.0F / (float)Math.PI - this.aX) * 0.1F;
         this.o(this.aX);
         this.d += (float) Math.PI * this.cd * 1.5F;
         this.b += (-((float)ami.d($$2, $$1.d)) * 180.0F / (float)Math.PI - this.b) * 0.1F;
      } else {
         this.bZ = ami.e(ami.a(this.bX)) * (float) Math.PI * 0.25F;
         if (!this.s.y) {
            double $$3 = this.dd().d;
            if (this.a(bbi.y)) {
               $$3 = 0.05 * (double)(this.b(bbi.y).d() + 1);
            } else if (!this.aN()) {
               $$3 -= 0.08;
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.b += (-90.0F - this.b) * 0.02F;
      }

   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (super.a($$0, $$1) && this.dR() != null) {
         if (!this.s.y) {
            this.t();
         }

         return true;
      } else {
         return false;
      }
   }

   private dwq i(dwq $$0) {
      dwq $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void t() {
      this.a(this.q(), this.eC(), this.eD());
      dwq $$0 = this.i(new dwq(0.0, -1.0, 0.0)).b(this.df(), this.dh(), this.dl());

      for(int $$1 = 0; $$1 < 30; ++$$1) {
         dwq $$2 = this.i(new dwq((double)this.R.i() * 0.6 - 0.3, -1.0, (double)this.R.i() * 0.6 - 0.3));
         dwq $$3 = $$2.a(0.3 + (double)(this.R.i() * 2.0F));
         ((agg)this.s).a(this.n(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }

   }

   protected im n() {
      return io.ab;
   }

   @Override
   public void g(dwq $$0) {
      this.a(bci.a, this.dd());
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 19) {
         this.bX = 0.0F;
      } else {
         super.a($$0);
      }

   }

   public void a(float $$0, float $$1, float $$2) {
      this.ce = $$0;
      this.cf = $$1;
      this.cg = $$2;
   }

   public boolean fK() {
      return this.ce != 0.0F || this.cf != 0.0F || this.cg != 0.0F;
   }

   class a extends bip {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bcc $$0 = bod.this.dR();
         if (bod.this.aR() && $$0 != null) {
            return bod.this.f((bbn)$$0) < 100.0;
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         this.e = 0;
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         ++this.e;
         bcc $$0 = bod.this.dR();
         if ($$0 != null) {
            dwq $$1 = new dwq(bod.this.df() - $$0.df(), bod.this.dh() - $$0.dh(), bod.this.dl() - $$0.dl());
            cvo $$2 = bod.this.s.a_(new gt(bod.this.df() + $$1.c, bod.this.dh() + $$1.d, bod.this.dl() + $$1.e));
            dpv $$3 = bod.this.s.b_(new gt(bod.this.df() + $$1.c, bod.this.dh() + $$1.d, bod.this.dl() + $$1.e));
            if ($$3.a(akp.a) || $$2.h()) {
               double $$4 = $$1.f();
               if ($$4 > 0.0) {
                  $$1.d();
                  double $$5 = 3.0;
                  if ($$4 > 5.0) {
                     $$5 -= ($$4 - 5.0) / 5.0;
                  }

                  if ($$5 > 0.0) {
                     $$1 = $$1.a($$5);
                  }
               }

               if ($$2.h()) {
                  $$1 = $$1.a(0.0, $$1.d, 0.0);
               }

               bod.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               bod.this.s.a(io.e, bod.this.df(), bod.this.dh(), bod.this.dl(), 0.0, 0.0, 0.0);
            }

         }
      }
   }

   class b extends bip {
      private final bod b;

      public b(bod $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.dV();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.dQ().a(b(50)) == 0 || !this.b.T || !this.b.fK()) {
            float $$1 = this.b.dQ().i() * (float) (Math.PI * 2);
            float $$2 = ami.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.dQ().i() * 0.2F;
            float $$4 = ami.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }

      }
   }
}
