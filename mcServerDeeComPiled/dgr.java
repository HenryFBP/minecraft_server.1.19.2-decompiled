import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgr implements dfx {
   public static final Codec<dgr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dfd.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               gt.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dgr::new)
   );
   private final boolean b;
   private final List<dfd.a> c;
   @Nullable
   private final gt d;

   public dgr(boolean $$0, List<dfd.a> $$1, @Nullable gt $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dgr(boolean $$0, List<dfd.a> $$1, Optional<gt> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = (gt)$$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dfd.a> b() {
      return this.c;
   }

   @Nullable
   public gt c() {
      return this.d;
   }
}
