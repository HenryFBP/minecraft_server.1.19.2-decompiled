public class als {
   public static class a {
      public static int a(int $$0) {
         return $$0 >>> 24;
      }

      public static int b(int $$0) {
         return $$0 >> 16 & 0xFF;
      }

      public static int c(int $$0) {
         return $$0 >> 8 & 0xFF;
      }

      public static int d(int $$0) {
         return $$0 & 0xFF;
      }

      public static int a(int $$0, int $$1, int $$2, int $$3) {
         return $$0 << 24 | $$1 << 16 | $$2 << 8 | $$3;
      }

      public static int a(int $$0, int $$1) {
         return a(a($$0) * a($$1) / 255, b($$0) * b($$1) / 255, c($$0) * c($$1) / 255, d($$0) * d($$1) / 255);
      }
   }
}
