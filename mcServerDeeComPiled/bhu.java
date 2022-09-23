public class bhu extends bhs {
   private final int l;
   private final int m;
   private final float n;
   private final float o;
   private final boolean p;

   public bhu(bce $$0, int $$1, int $$2, float $$3, float $$4, boolean $$5) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      this.p = $$5;
   }

   @Override
   public void a() {
      if (this.p && this.d.aR()) {
         this.d.f(this.d.dd().b(0.0, 0.005, 0.0));
      }

      if (this.k == bhs.a.b && !this.d.D().l()) {
         double $$0 = this.e - this.d.df();
         double $$1 = this.f - this.d.dh();
         double $$2 = this.g - this.d.dl();
         double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
         if ($$3 < 2.5000003E-7F) {
            this.d.u(0.0F);
         } else {
            float $$4 = (float)(ami.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
            this.d.o(this.a(this.d.dq(), $$4, (float)this.m));
            this.d.aX = this.d.dq();
            this.d.aZ = this.d.dq();
            float $$5 = (float)(this.h * this.d.b(bdd.d));
            if (this.d.aR()) {
               this.d.r($$5 * this.n);
               double $$6 = Math.sqrt($$0 * $$0 + $$2 * $$2);
               if (Math.abs($$1) > 1.0E-5F || Math.abs($$6) > 1.0E-5F) {
                  float $$7 = -((float)(ami.d($$1, $$6) * 180.0F / (float)Math.PI));
                  $$7 = ami.a(ami.g($$7), (float)(-this.l), (float)this.l);
                  this.d.p(this.a(this.d.ds(), $$7, 5.0F));
               }

               float $$8 = ami.b(this.d.ds() * (float) (Math.PI / 180.0));
               float $$9 = ami.a(this.d.ds() * (float) (Math.PI / 180.0));
               this.d.bq = $$8 * $$5;
               this.d.bp = -$$9 * $$5;
            } else {
               this.d.r($$5 * this.o);
            }

         }
      } else {
         this.d.r(0.0F);
         this.d.w(0.0F);
         this.d.v(0.0F);
         this.d.u(0.0F);
      }
   }
}
