public class bli extends bls {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bcc $$0, bcc $$1) {
      return this.f($$0, $$1) && $$1.aU() && (this.b($$1) || this.e($$0, $$1)) && bly.c($$0, $$1);
   }

   private boolean e(bcc $$0, bcc $$1) {
      return !$$0.dy().a(bku.S) && $$1.ad().a(akn.h);
   }

   private boolean b(bcc $$0) {
      return $$0.ad().a(akn.g);
   }

   private boolean f(bcc $$0, bcc $$1) {
      return $$1.f((bbn)$$0) <= 64.0;
   }

   @Override
   protected bku<bcc> b() {
      return bku.B;
   }
}
