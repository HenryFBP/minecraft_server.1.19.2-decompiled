public class ctb extends cuf {
   private hi<cax> b = hi.a(27, cax.b);
   private cts c = new cts() {
      @Override
      protected void a(cgx $$0, gt $$1, cvo $$2) {
         ctb.this.a($$2, ajw.aU);
         ctb.this.a($$2, true);
      }

      @Override
      protected void b(cgx $$0, gt $$1, cvo $$2) {
         ctb.this.a($$2, ajw.aT);
         ctb.this.a($$2, false);
      }

      @Override
      protected void a(cgx $$0, gt $$1, cvo $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(buc $$0) {
         if ($$0.bU instanceof bwt) {
            bac $$1 = ((bwt)$$0.bU).l();
            return $$1 == ctb.this;
         } else {
            return false;
         }
      }
   };

   public ctb(gt $$0, cvo $$1) {
      super(ctk.z, $$0, $$1);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bad.a($$0, this.b);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.b = hi.a(this.b(), cax.b);
      if (!this.d($$0)) {
         bad.b($$0, this.b);
      }

   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected hi<cax> f() {
      return this.b;
   }

   @Override
   protected void a(hi<cax> $$0) {
      this.b = $$0;
   }

   @Override
   protected rq g() {
      return rq.c("container.barrel");
   }

   @Override
   protected bwm a(int $$0, bub $$1) {
      return bwt.a($$0, $$1, this);
   }

   @Override
   public void d_(buc $$0) {
      if (!this.p && !$$0.B_()) {
         this.c.a($$0, this.k(), this.p(), this.q());
      }

   }

   @Override
   public void c_(buc $$0) {
      if (!this.p && !$$0.B_()) {
         this.c.b($$0, this.k(), this.p(), this.q());
      }

   }

   public void i() {
      if (!this.p) {
         this.c.c(this.k(), this.p(), this.q());
      }

   }

   void a(cvo $$0, boolean $$1) {
      this.n.a(this.p(), $$0.a(cja.b, Boolean.valueOf($$1)), 3);
   }

   void a(cvo $$0, ajv $$1) {
      hs $$2 = ((gy)$$0.c(cja.a)).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, ajx.e, 0.5F, this.n.w.i() * 0.1F + 0.9F);
   }
}
