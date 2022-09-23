public abstract class bvb extends buu {
   protected bvb(bbr<? extends bvb> $$0, cgx $$1) {
      super($$0, $$1);
   }

   protected bvb(bbr<? extends bvb> $$0, double $$1, double $$2, double $$3, cgx $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected bvb(bbr<? extends bvb> $$0, bcc $$1, cgx $$2) {
      this($$0, $$1.df(), $$1.dj() - 0.1F, $$1.dl(), $$2);
      this.b((bbn)$$1);
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
      super.k();
      dwo $$0 = buv.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == dwo.a.b) {
         gt $$2 = ((dwm)$$0).a();
         cvo $$3 = this.s.a_($$2);
         if ($$3.a(cju.dn)) {
            this.d($$2);
            $$1 = true;
         } else if ($$3.a(cju.jr)) {
            cti $$4 = this.s.c_($$2);
            if ($$4 instanceof cup && cup.a(this)) {
               cup.a(this.s, $$2, $$3, this, (cup)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != dwo.a.a && !$$1) {
         this.a($$0);
      }

      this.aJ();
      dwq $$5 = this.dd();
      double $$6 = this.df() + $$5.c;
      double $$7 = this.dh() + $$5.d;
      double $$8 = this.dl() + $$5.e;
      this.z();
      float $$11;
      if (this.aR()) {
         for(int $$9 = 0; $$9 < 4; ++$$9) {
            float $$10 = 0.25F;
            this.s.a(io.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.f($$5.a((double)$$11));
      if (!this.aN()) {
         dwq $$13 = this.dd();
         this.n($$13.c, $$13.d - (double)this.l(), $$13.e);
      }

      this.e($$6, $$7, $$8);
   }

   protected float l() {
      return 0.03F;
   }
}
