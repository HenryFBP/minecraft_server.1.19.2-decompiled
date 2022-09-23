public class cfe extends cer {
   public final cfe.a a;

   public cfe(cer.a $$0, cfe.a $$1, bbs... $$2) {
      super($$0, $$1 == cfe.a.c ? ces.b : ces.a, $$2);
      this.a = $$1;
   }

   @Override
   public int a(int $$0) {
      return this.a.a() + ($$0 - 1) * this.a.b();
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + this.a.b();
   }

   @Override
   public int a() {
      return 4;
   }

   @Override
   public int a(int $$0, baw $$1) {
      if ($$1.i()) {
         return 0;
      } else if (this.a == cfe.a.a) {
         return $$0;
      } else if (this.a == cfe.a.b && $$1.u()) {
         return $$0 * 2;
      } else if (this.a == cfe.a.c && $$1.B()) {
         return $$0 * 3;
      } else if (this.a == cfe.a.d && $$1.d()) {
         return $$0 * 2;
      } else {
         return this.a == cfe.a.e && $$1.b() ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cer $$0) {
      if ($$0 instanceof cfe $$1) {
         if (this.a == $$1.a) {
            return false;
         } else {
            return this.a == cfe.a.c || $$1.a == cfe.a.c;
         }
      } else {
         return super.a($$0);
      }
   }

   public static int a(bcc $$0, int $$1) {
      int $$2 = cet.a(cev.b, $$0);
      if ($$2 > 0) {
         $$1 -= ami.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bcc $$0, double $$1) {
      int $$2 = cet.a(cev.d, $$0);
      if ($$2 > 0) {
         $$1 -= (double)ami.b($$1 * (double)((float)$$2 * 0.15F));
      }

      return $$1;
   }

   public static enum a {
      a(1, 11),
      b(10, 8),
      c(5, 6),
      d(5, 8),
      e(3, 6);

      private final int f;
      private final int g;

      private a(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public int a() {
         return this.f;
      }

      public int b() {
         return this.g;
      }
   }
}
