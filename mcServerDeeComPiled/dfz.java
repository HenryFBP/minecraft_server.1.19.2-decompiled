import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfz implements dfx {
   public static final Codec<dfz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhw.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dhw.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dfz::new)
   );
   public final dhw b;
   public final dhw c;
   public final int d;

   public dfz(dhw $$0, dhw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
