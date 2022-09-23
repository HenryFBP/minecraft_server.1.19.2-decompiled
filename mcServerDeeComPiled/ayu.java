import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import org.slf4j.Logger;

public class ayu {
   public static final Codec<ayu> a = Codec.INT.xmap(ayu::a, ayu::a);
   private static final ayu b = new ayu(1);
   private static final Logger c = LogUtils.getLogger();
   private final int d;

   private ayu(int $$0) {
      this.d = $$0;
   }

   public static ayu a(int $$0) {
      if ($$0 == 1) {
         return b;
      } else {
         b($$0);
         return new ayu($$0);
      }
   }

   public int a() {
      return this.d;
   }

   private static void b(int $$0) {
      if ($$0 < 0) {
         throw (IllegalArgumentException)ad.c(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if ($$0 == 0 && ab.aL) {
            c.warn("Found 0 weight, make sure this is intentional!");
         }

      }
   }

   public String toString() {
      return Integer.toString(this.d);
   }

   public int hashCode() {
      return Integer.hashCode(this.d);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof ayu && this.d == ((ayu)$$0).d;
      }
   }
}
