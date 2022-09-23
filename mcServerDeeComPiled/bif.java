public class bif extends bit {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final bnm b;
   private final int c;
   private boolean d;

   public bif(bnm $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean a() {
      if (this.b.dQ().a(this.c) != 0) {
         return false;
      } else {
         gy $$0 = this.b.cw();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         gt $$3 = this.b.da();

         for(int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(gt $$0, int $$1, int $$2, int $$3) {
      gt $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.s.b_($$4).a(akp.a) && !this.b.s.a_($$4).d().c();
   }

   private boolean b(gt $$0, int $$1, int $$2, int $$3) {
      return this.b.s.a_($$0.b($$1 * $$3, 1, $$2 * $$3)).h() && this.b.s.a_($$0.b($$1 * $$3, 2, $$2 * $$3)).h();
   }

   @Override
   public boolean b() {
      double $$0 = this.b.dd().d;
      return (!($$0 * $$0 < 0.03F) || this.b.ds() == 0.0F || !(Math.abs(this.b.ds()) < 10.0F) || !this.b.aR()) && !this.b.aw();
   }

   @Override
   public boolean D_() {
      return false;
   }

   @Override
   public void c() {
      gy $$0 = this.b.cw();
      this.b.f(this.b.dd().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.D().n();
   }

   @Override
   public void d() {
      this.b.p(0.0F);
   }

   @Override
   public void e() {
      boolean $$0 = this.d;
      if (!$$0) {
         dpv $$1 = this.b.s.b_(this.b.da());
         this.d = $$1.a(akp.a);
      }

      if (this.d && !$$0) {
         this.b.a(ajw.ew, 1.0F, 1.0F);
      }

      dwq $$2 = this.b.dd();
      if ($$2.d * $$2.d < 0.03F && this.b.ds() != 0.0F) {
         this.b.p(ami.l(this.b.ds(), 0.0F, 0.2F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.p((float)$$4);
      }

   }
}
