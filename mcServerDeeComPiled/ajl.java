import java.nio.charset.StandardCharsets;

public class ajl {
   public static final int a = 1460;
   public static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

   public static String a(byte[] $$0, int $$1, int $$2) {
      int $$3 = $$2 - 1;
      int $$4 = $$1 > $$3 ? $$3 : $$1;

      while(0 != $$0[$$4] && $$4 < $$3) {
         ++$$4;
      }

      return new String($$0, $$1, $$4 - $$1, StandardCharsets.UTF_8);
   }

   public static int a(byte[] $$0, int $$1) {
      return b($$0, $$1, $$0.length);
   }

   public static int b(byte[] $$0, int $$1, int $$2) {
      return 0 > $$2 - $$1 - 4 ? 0 : $$0[$$1 + 3] << 24 | ($$0[$$1 + 2] & 0xFF) << 16 | ($$0[$$1 + 1] & 0xFF) << 8 | $$0[$$1] & 0xFF;
   }

   public static int c(byte[] $$0, int $$1, int $$2) {
      return 0 > $$2 - $$1 - 4 ? 0 : $$0[$$1] << 24 | ($$0[$$1 + 1] & 0xFF) << 16 | ($$0[$$1 + 2] & 0xFF) << 8 | $$0[$$1 + 3] & 0xFF;
   }

   public static String a(byte $$0) {
      return "" + b[($$0 & 240) >>> 4] + b[$$0 & 15];
   }
}
