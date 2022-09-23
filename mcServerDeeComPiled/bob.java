public abstract class bob extends bcw {
   private static final int ca = 100;
   private int cb;

   protected bob(bbr<? extends bob> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public boolean b(agh $$0) {
      pj $$1 = new pj();
      $$1.a("id", this.bn());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ah();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void k() {
      ++this.cb;
      super.k();
   }

   public boolean fU() {
      return this.cb > 100;
   }
}
