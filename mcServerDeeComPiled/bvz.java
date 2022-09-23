public class bvz extends bvt {
   public bvz(bbr<?> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bvz(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.ac, $$0, $$1, $$2, $$3);
   }

   @Override
   public baj a(buc $$0, bai $$1) {
      if ($$0.fo()) {
         return baj.d;
      } else if (this.bJ()) {
         return baj.d;
      } else if (!this.s.y) {
         return $$0.k(this) ? baj.b : baj.d;
      } else {
         return baj.a;
      }
   }

   @Override
   protected cat h() {
      return caz.mo;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bJ()) {
            this.bv();
         }

         if (this.o() == 0) {
            this.d(-this.q());
            this.c(10);
            this.a(50.0F);
            this.bi();
         }
      }

   }

   @Override
   public bvt.a r() {
      return bvt.a.a;
   }
}
