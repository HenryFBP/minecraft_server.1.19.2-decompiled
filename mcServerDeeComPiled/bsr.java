import javax.annotation.Nullable;

public abstract class bsr extends brq {
   protected static final aaj<Boolean> b = aam.a(bsr.class, aal.i);
   protected static final int c = 300;
   protected int d;

   public bsr(bbr<? extends bsr> $$0, cgx $$1) {
      super($$0, $$1);
      this.r(true);
      this.t();
      this.a(dqh.n, 16.0F);
      this.a(dqh.o, -1.0F);
   }

   private void t() {
      if (bmk.a(this)) {
         ((blb)this.D()).b(true);
      }

   }

   protected abstract boolean n();

   public void v(boolean $$0) {
      this.ai().b(b, $$0);
   }

   protected boolean q() {
      return this.ai().a(b);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, false);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.q()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public double bs() {
      return this.y_() ? -0.05 : -0.45;
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.v($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void T() {
      super.T();
      if (this.fJ()) {
         ++this.d;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.fP();
         this.c((agg)this.s);
      }

   }

   public boolean fJ() {
      return !this.s.q_().b() && !this.q() && !this.fA();
   }

   protected void c(agg $$0) {
      bsl $$1 = this.a(bbr.bm, true);
      if ($$1 != null) {
         $$1.b(new bbg(bbi.i, 200, 0));
      }

   }

   public boolean fK() {
      return !this.y_();
   }

   public abstract bsu fL();

   @Nullable
   @Override
   public bcc G() {
      return (bcc)this.bD.c(bku.o).orElse(null);
   }

   protected boolean fM() {
      return this.ez().c() instanceof cci;
   }

   @Override
   public void K() {
      if (bst.d(this)) {
         super.K();
      }

   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   protected abstract void fP();
}
