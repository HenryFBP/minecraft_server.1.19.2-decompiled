public abstract class bps extends bpr {
   public bps(bpp $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(baw $$0, float $$1) {
      if ($$0.l() instanceof bui) {
         $$0.l().f(1);
         return 0.0F;
      } else {
         return super.a($$0, $$1);
      }
   }
}
