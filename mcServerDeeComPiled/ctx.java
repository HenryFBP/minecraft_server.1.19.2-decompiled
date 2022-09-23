public class ctx extends cti implements cue {
   private final cto a = new cto();
   private final cts b = new cts() {
      @Override
      protected void a(cgx $$0, gt $$1, cvo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, ajw.ft, ajx.e, 0.5F, $$0.w.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cgx $$0, gt $$1, cvo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, ajw.fs, ajx.e, 0.5F, $$0.w.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cgx $$0, gt $$1, cvo $$2, int $$3, int $$4) {
         $$0.a(ctx.this.o, cju.eN, 1, $$4);
      }

      @Override
      protected boolean a(buc $$0) {
         return $$0.fO().b(ctx.this);
      }
   };

   public ctx(gt $$0, cvo $$1) {
      super(ctk.d, $$0, $$1);
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctx $$3) {
      $$3.a.a();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public void a(buc $$0) {
      if (!this.p && !$$0.B_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }

   }

   public void b(buc $$0) {
      if (!this.p && !$$0.B_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }

   }

   public boolean c(buc $$0) {
      if (this.n.c_(this.o) != this) {
         return false;
      } else {
         return !($$0.h((double)this.o.u() + 0.5, (double)this.o.v() + 0.5, (double)this.o.w() + 0.5) > 64.0);
      }
   }

   public void c() {
      if (!this.p) {
         this.b.c(this.k(), this.p(), this.q());
      }

   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
