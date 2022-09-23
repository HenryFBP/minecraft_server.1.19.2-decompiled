import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Longs;

public class dbq implements amn {
   private static final float b = 5.9604645E-8F;
   private static final double c = 1.110223E-16F;
   private dbp d;
   private final dat e = new dat(this);

   public dbq(long $$0) {
      this.d = new dbp(dbg.b($$0));
   }

   public dbq(long $$0, long $$1) {
      this.d = new dbp($$0, $$1);
   }

   @Override
   public amn d() {
      return new dbq(this.d.a(), this.d.a());
   }

   @Override
   public dbe e() {
      return new dbq.a(this.d.a(), this.d.a());
   }

   @Override
   public void b(long $$0) {
      this.d = new dbp(dbg.b($$0));
      this.e.a();
   }

   @Override
   public int f() {
      return (int)this.d.a();
   }

   @Override
   public int a(int $$0) {
      if ($$0 <= 0) {
         throw new IllegalArgumentException("Bound must be positive");
      } else {
         long $$1 = Integer.toUnsignedLong(this.f());
         long $$2 = $$1 * (long)$$0;
         long $$3 = $$2 & 4294967295L;
         if ($$3 < (long)$$0) {
            for(int $$4 = Integer.remainderUnsigned(~$$0 + 1, $$0); $$3 < (long)$$4; $$3 = $$2 & 4294967295L) {
               $$1 = Integer.toUnsignedLong(this.f());
               $$2 = $$1 * (long)$$0;
            }
         }

         long $$5 = $$2 >> 32;
         return (int)$$5;
      }
   }

   @Override
   public long g() {
      return this.d.a();
   }

   @Override
   public boolean h() {
      return (this.d.a() & 1L) != 0L;
   }

   @Override
   public float i() {
      return (float)this.c(24) * 5.9604645E-8F;
   }

   @Override
   public double j() {
      return (double)this.c(53) * 1.110223E-16F;
   }

   @Override
   public double k() {
      return this.e.b();
   }

   @Override
   public void b(int $$0) {
      for(int $$1 = 0; $$1 < $$0; ++$$1) {
         this.d.a();
      }

   }

   private long c(int $$0) {
      return this.d.a() >>> 64 - $$0;
   }

   public static class a implements dbe {
      private static final HashFunction a = Hashing.md5();
      private final long b;
      private final long c;

      public a(long $$0, long $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public amn a(int $$0, int $$1, int $$2) {
         long $$3 = ami.c($$0, $$1, $$2);
         long $$4 = $$3 ^ this.b;
         return new dbq($$4, this.c);
      }

      @Override
      public amn a(String $$0) {
         byte[] $$1 = a.hashString($$0, Charsets.UTF_8).asBytes();
         long $$2 = Longs.fromBytes($$1[0], $$1[1], $$1[2], $$1[3], $$1[4], $$1[5], $$1[6], $$1[7]);
         long $$3 = Longs.fromBytes($$1[8], $$1[9], $$1[10], $$1[11], $$1[12], $$1[13], $$1[14], $$1[15]);
         return new dbq($$2 ^ this.b, $$3 ^ this.c);
      }

      @VisibleForTesting
      @Override
      public void a(StringBuilder $$0) {
         $$0.append("seedLo: ").append(this.b).append(", seedHi: ").append(this.c);
      }
   }
}
