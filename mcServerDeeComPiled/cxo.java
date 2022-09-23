import javax.annotation.Nullable;

public final class cxo {
   public static final int a = 16;
   public static final int b = 128;
   public static final int c = 2048;
   private static final int e = 4;
   @Nullable
   protected byte[] d;

   public cxo() {
   }

   public cxo(byte[] $$0) {
      this.d = $$0;
      if ($$0.length != 2048) {
         throw (IllegalArgumentException)ad.c(new IllegalArgumentException("DataLayer should be 2048 bytes not: " + $$0.length));
      }
   }

   protected cxo(int $$0) {
      this.d = new byte[$$0];
   }

   public int a(int $$0, int $$1, int $$2) {
      return this.b(b($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.a(b($$0, $$1, $$2), $$3);
   }

   private static int b(int $$0, int $$1, int $$2) {
      return $$1 << 8 | $$2 << 4 | $$0;
   }

   private int b(int $$0) {
      if (this.d == null) {
         return 0;
      } else {
         int $$1 = d($$0);
         int $$2 = c($$0);
         return this.d[$$1] >> 4 * $$2 & 15;
      }
   }

   private void a(int $$0, int $$1) {
      if (this.d == null) {
         this.d = new byte[2048];
      }

      int $$2 = d($$0);
      int $$3 = c($$0);
      int $$4 = ~(15 << 4 * $$3);
      int $$5 = ($$1 & 15) << 4 * $$3;
      this.d[$$2] = (byte)(this.d[$$2] & $$4 | $$5);
   }

   private static int c(int $$0) {
      return $$0 & 1;
   }

   private static int d(int $$0) {
      return $$0 >> 1;
   }

   public byte[] a() {
      if (this.d == null) {
         this.d = new byte[2048];
      }

      return this.d;
   }

   public cxo b() {
      return this.d == null ? new cxo() : new cxo((byte[])this.d.clone());
   }

   public String toString() {
      StringBuilder $$0 = new StringBuilder();

      for(int $$1 = 0; $$1 < 4096; ++$$1) {
         $$0.append(Integer.toHexString(this.b($$1)));
         if (($$1 & 15) == 15) {
            $$0.append("\n");
         }

         if (($$1 & 0xFF) == 255) {
            $$0.append("\n");
         }
      }

      return $$0.toString();
   }

   @ang
   public String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();

      for(int $$2 = 0; $$2 < 256; ++$$2) {
         $$1.append(Integer.toHexString(this.b($$2)));
         if (($$2 & 15) == 15) {
            $$1.append("\n");
         }
      }

      return $$1.toString();
   }

   public boolean c() {
      return this.d == null;
   }
}
