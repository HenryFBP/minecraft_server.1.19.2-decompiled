import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.UUID;

public final class hr {
   public static final Codec<UUID> a = Codec.INT_STREAM.comapFlatMap($$0 -> ad.a($$0, 4).map(hr::a), $$0 -> Arrays.stream(a($$0)));
   public static final int b = 16;
   private static final String c = "OfflinePlayer:";

   private hr() {
   }

   public static UUID a(int[] $$0) {
      return new UUID((long)$$0[0] << 32 | (long)$$0[1] & 4294967295L, (long)$$0[2] << 32 | (long)$$0[3] & 4294967295L);
   }

   public static int[] a(UUID $$0) {
      long $$1 = $$0.getMostSignificantBits();
      long $$2 = $$0.getLeastSignificantBits();
      return a($$1, $$2);
   }

   private static int[] a(long $$0, long $$1) {
      return new int[]{(int)($$0 >> 32), (int)$$0, (int)($$1 >> 32), (int)$$1};
   }

   public static byte[] b(UUID $$0) {
      byte[] $$1 = new byte[16];
      ByteBuffer.wrap($$1).order(ByteOrder.BIG_ENDIAN).putLong($$0.getMostSignificantBits()).putLong($$0.getLeastSignificantBits());
      return $$1;
   }

   public static UUID a(Dynamic<?> $$0) {
      int[] $$1 = $$0.asIntStream().toArray();
      if ($$1.length != 4) {
         throw new IllegalArgumentException("Could not read UUID. Expected int-array of length 4, got " + $$1.length + ".");
      } else {
         return a($$1);
      }
   }

   public static UUID a(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      if ($$1 == null) {
         $$1 = a($$0.getName());
      }

      return $$1;
   }

   public static UUID a(String $$0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + $$0).getBytes(StandardCharsets.UTF_8));
   }
}
