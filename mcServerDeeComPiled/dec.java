import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dec implements dfx {
   public static final Codec<dec> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvo.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               cvo.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               cvo.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               cvo.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dec::new)
   );
   public final cvo b;
   public final cvo c;
   public final cvo d;
   public final cvo e;
   public final boolean f;

   public dec(cvo $$0, cvo $$1, cvo $$2, cvo $$3, boolean $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }
}
