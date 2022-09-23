import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

public record buf(buf.a e) {
   public static final rq a = rq.c("multiplayer.disconnect.missing_public_key");
   public static final rq b = rq.c("multiplayer.disconnect.expired_public_key");
   private static final rq f = rq.c("multiplayer.disconnect.invalid_public_key_signature");
   public static final Duration c = Duration.ofHours(8L);
   public static final Codec<buf> d = buf.a.a.xmap(buf::new, buf::b);

   public static buf a(amp $$0, UUID $$1, buf.a $$2, Duration $$3) throws buf.b {
      if ($$2.a($$3)) {
         throw new buf.b(b);
      } else if (!$$2.a($$0, $$1)) {
         throw new buf.b(f);
      } else {
         return new buf($$2);
      }
   }

   public amp a() {
      return amp.a(this.e.c, "SHA256withRSA");
   }

   public buf.a b() {
      return this.e;
   }

   public static record a(Instant b, PublicKey c, byte[] d) {
      final PublicKey c;
      private static final int e = 4096;
      public static final Codec<buf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alq.f.fieldOf("expires_at").forGetter(buf.a::b), ali.e.fieldOf("key").forGetter(buf.a::c), alq.g.fieldOf("signature_v2").forGetter(buf.a::d)
               )
               .apply($$0, buf.a::new)
      );

      public a(qx $$0) {
         this($$0.t(), $$0.u(), $$0.b(4096));
      }

      public void a(qx $$0) {
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
      }

      boolean a(amp $$0, UUID $$1) {
         return $$0.a(this.a($$1), this.d);
      }

      private byte[] a(UUID $$0) {
         byte[] $$1 = this.c.getEncoded();
         byte[] $$2 = new byte[24 + $$1.length];
         ByteBuffer $$3 = ByteBuffer.wrap($$2).order(ByteOrder.BIG_ENDIAN);
         $$3.putLong($$0.getMostSignificantBits()).putLong($$0.getLeastSignificantBits()).putLong(this.b.toEpochMilli()).put($$1);
         return $$2;
      }

      public boolean a() {
         return this.b.isBefore(Instant.now());
      }

      public boolean a(Duration $$0) {
         return this.b.plus($$0).isBefore(Instant.now());
      }
   }

   public static class b extends sm {
      public b(rq $$0) {
         super($$0);
      }
   }
}
