public class but extends buu {
   public but(bbr<? extends but> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public but(cgx $$0, bpd $$1) {
      this(bbr.Z, $$0);
      this.b($$1);
      this.e(
         $$1.df() - (double)($$1.cW() + 1.0F) * 0.5 * (double)ami.a($$1.aX * (float) (Math.PI / 180.0)),
         $$1.dj() - 0.1F,
         $$1.dl() + (double)($$1.cW() + 1.0F) * 0.5 * (double)ami.b($$1.aX * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void k() {
      super.k();
      dwq $$0 = this.dd();
      dwo $$1 = buv.a(this, this::a);
      this.a($$1);
      double $$2 = this.df() + $$0.c;
      double $$3 = this.dh() + $$0.d;
      double $$4 = this.dl() + $$0.e;
      this.z();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.s.a(this.cy()).noneMatch(cvn.a::h)) {
         this.ah();
      } else if (this.aU()) {
         this.ah();
      } else {
         this.f($$0.a(0.99F));
         if (!this.aN()) {
            this.f(this.dd().b(0.0, -0.06F, 0.0));
         }

         this.e($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      bbn $$1 = this.x();
      if ($$1 instanceof bcc) {
         $$0.a().a(baw.a(this, (bcc)$$1).c(), 1.0F);
      }

   }

   @Override
   protected void a(dwm $$0) {
      super.a($$0);
      if (!this.s.y) {
         this.ah();
      }

   }

   @Override
   protected void a_() {
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      double $$1 = $$0.h();
      double $$2 = $$0.i();
      double $$3 = $$0.j();

      for(int $$4 = 0; $$4 < 7; ++$$4) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.s.a(io.aa, this.df(), this.dh(), this.dl(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
