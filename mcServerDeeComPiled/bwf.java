public class bwf extends bvt {
   private static final byte c = 10;
   private int d = -1;

   public bwf(bbr<? extends bwf> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bwf(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.ai, $$0, $$1, $$2, $$3);
   }

   @Override
   public bvt.a r() {
      return bvt.a.d;
   }

   @Override
   public cvo t() {
      return cju.bW.m();
   }

   @Override
   public void k() {
      super.k();
      if (this.d > 0) {
         --this.d;
         this.s.a(io.Y, this.df(), this.dh() + 0.5, this.dl(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dd().i());
      }

      if (this.z) {
         double $$0 = this.dd().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }

   }

   @Override
   public boolean a(baw $$0, float $$1) {
      bbn $$2 = $$0.l();
      if ($$2 instanceof bui $$3 && $$3.bH()) {
         this.h($$3.dd().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(baw $$0) {
      double $$1 = this.dd().i();
      if (!$$0.u() && !$$0.d() && !($$1 >= 0.01F)) {
         super.a($$0);
      } else {
         if (this.d < 0) {
            this.y();
            this.d = this.R.a(20) + this.R.a(20);
         }

      }
   }

   @Override
   protected cat h() {
      return caz.mr;
   }

   protected void h(double $$0) {
      if (!this.s.y) {
         double $$1 = Math.sqrt($$0);
         if ($$1 > 5.0) {
            $$1 = 5.0;
         }

         this.s.a(this, this.df(), this.dh(), this.dl(), (float)(4.0 + this.R.j() * 1.5 * $$1), cgp.a.b);
         this.ah();
      }

   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.y();
      }

   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 10) {
         this.y();
      } else {
         super.a($$0);
      }

   }

   public void y() {
      this.d = 80;
      if (!this.s.y) {
         this.s.a(this, (byte)10);
         if (!this.aM()) {
            this.s.a(null, this.df(), this.dh(), this.dl(), ajw.uJ, ajx.e, 1.0F, 1.0F);
         }
      }

   }

   public int z() {
      return this.d;
   }

   public boolean A() {
      return this.d > -1;
   }

   @Override
   public float a(cgp $$0, cgd $$1, gt $$2, cvo $$3, dpv $$4, float $$5) {
      return !this.A() || !$$3.a(akl.J) && !$$1.a_($$2.b()).a(akl.J) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cgp $$0, cgd $$1, gt $$2, cvo $$3, float $$4) {
      return !this.A() || !$$3.a(akl.J) && !$$1.a_($$2.b()).a(akl.J) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(pj $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }
}
