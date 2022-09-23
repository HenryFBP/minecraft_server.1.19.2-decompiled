import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record bue(PrivateKey b, buf c, Instant d) {
   public static final Codec<bue> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ali.f.fieldOf("private_key").forGetter(bue::b),
               buf.d.fieldOf("public_key").forGetter(bue::c),
               alq.f.fieldOf("refreshed_after").forGetter(bue::d)
            )
            .apply($$0, bue::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
