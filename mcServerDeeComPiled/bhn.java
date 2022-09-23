public class bhn implements bho {
   private final bce a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public bhn(bce $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.aX = this.a.dq();
         this.c();
         this.f = this.a.aZ;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.aZ - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.aZ;
               this.b();
            } else {
               ++this.e;
               if (this.e > 10) {
                  this.d();
               }
            }
         }

      }
   }

   private void b() {
      this.a.aX = ami.c(this.a.aX, this.a.aZ, (float)this.a.V());
   }

   private void c() {
      this.a.aZ = ami.c(this.a.aZ, this.a.aX, (float)this.a.V());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = ami.a((float)$$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = (float)this.a.V() * (1.0F - $$1);
      this.a.aX = ami.c(this.a.aX, this.a.aZ, $$2);
   }

   private boolean e() {
      return !(this.a.cJ() instanceof bce);
   }

   private boolean f() {
      double $$0 = this.a.df() - this.a.t;
      double $$1 = this.a.dl() - this.a.v;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
