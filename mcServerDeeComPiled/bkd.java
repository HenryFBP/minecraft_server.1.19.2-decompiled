public class bkd extends biz {
   private final bsj b;
   private int c;

   public bkd(bsj $$0, double $$1, boolean $$2) {
      super($$0, $$1, $$2);
      this.b = $$0;
   }

   @Override
   public void c() {
      super.c();
      this.c = 0;
   }

   @Override
   public void d() {
      super.d();
      this.b.u(false);
   }

   @Override
   public void e() {
      super.e();
      ++this.c;
      if (this.c >= 5 && this.k() < this.l() / 2) {
         this.b.u(true);
      } else {
         this.b.u(false);
      }

   }
}
