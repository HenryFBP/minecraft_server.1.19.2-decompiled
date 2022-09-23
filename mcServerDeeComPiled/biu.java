public class biu extends bip {
   private final bob a;
   private agh b;
   private boolean c;

   public biu(bob $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      agh $$0 = (agh)this.a.fK();
      boolean $$1 = $$0 != null && !$$0.B_() && !$$0.fB().b && !$$0.aR() && !$$0.al;
      return !this.a.fL() && $$1 && this.a.fU();
   }

   @Override
   public boolean D_() {
      return !this.c;
   }

   @Override
   public void c() {
      this.b = (agh)this.a.fK();
      this.c = false;
   }

   @Override
   public void e() {
      if (!this.c && !this.a.fJ() && !this.a.fy()) {
         if (this.a.cy().c(this.b.cy())) {
            this.c = this.a.b(this.b);
         }

      }
   }
}
