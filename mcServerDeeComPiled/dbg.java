import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.atomic.AtomicLong;

public final class dbg {
   public static final long a = -7046029254386353131L;
   public static final long b = 7640891576956012809L;
   private static final AtomicLong c = new AtomicLong(8682522807148012L);

   @VisibleForTesting
   public static long a(long $$0) {
      $$0 = ($$0 ^ $$0 >>> 30) * -4658895280553007687L;
      $$0 = ($$0 ^ $$0 >>> 27) * -7723592293110705685L;
      return $$0 ^ $$0 >>> 31;
   }

   public static dbg.a b(long $$0) {
      long $$1 = $$0 ^ 7640891576956012809L;
      long $$2 = $$1 + -7046029254386353131L;
      return new dbg.a(a($$1), a($$2));
   }

   public static long a() {
      return c.updateAndGet($$0 -> $$0 * 1181783497276652981L) ^ System.nanoTime();
   }

   public static record a(long a, long b) {
   }
}
