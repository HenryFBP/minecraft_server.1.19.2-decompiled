import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class pr extends pw {
   private static final int b = 128;
   public static final qe<pr> a = new qe.a<pr>() {
      public pr a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(128L);
         return pr.a($$0.readLong());
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         return $$1.a($$0.readLong());
      }

      @Override
      public int c() {
         return 8;
      }

      @Override
      public String a() {
         return "LONG";
      }

      @Override
      public String b() {
         return "TAG_Long";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final long c;

   pr(long $$0) {
      this.c = $$0;
   }

   public static pr a(long $$0) {
      return $$0 >= -128L && $$0 <= 1024L ? pr.a.a[(int)$$0 - -128] : new pr($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeLong(this.c);
   }

   @Override
   public byte a() {
      return 4;
   }

   @Override
   public qe<pr> b() {
      return a;
   }

   public pr d() {
      return this;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof pr && this.c == ((pr)$$0).c;
      }
   }

   public int hashCode() {
      return (int)(this.c ^ this.c >>> 32);
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   @Override
   public long e() {
      return this.c;
   }

   @Override
   public int f() {
      return (int)(this.c & -1L);
   }

   @Override
   public short g() {
      return (short)((int)(this.c & 65535L));
   }

   @Override
   public byte h() {
      return (byte)((int)(this.c & 255L));
   }

   @Override
   public double i() {
      return (double)this.c;
   }

   @Override
   public float j() {
      return (float)this.c;
   }

   @Override
   public Number k() {
      return this.c;
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final pr[] a = new pr[1153];

      private a() {
      }

      static {
         for(int $$0 = 0; $$0 < a.length; ++$$0) {
            a[$$0] = new pr((long)(-128 + $$0));
         }

      }
   }
}
