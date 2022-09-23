public class ble extends blc {
   private boolean p;

   public ble(bce $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected dqn a(int $$0) {
      this.p = this.a.ad() == bbr.r;
      this.o = new dqo(this.p);
      return new dqn(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.o();
   }

   @Override
   protected dwq b() {
      return new dwq(this.a.df(), this.a.e(0.5), this.a.dl());
   }

   @Override
   protected double a(dwq $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(dwq $$0, dwq $$1) {
      return a(this.a, $$0, $$1);
   }

   @Override
   public boolean a(gt $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
