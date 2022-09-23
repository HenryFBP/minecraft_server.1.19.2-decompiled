import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgb implements dfx {
   public static final Codec<dgb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, cyu.c).fieldOf("height").forGetter($$0x -> $$0x.b), cvo.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dgb::new)
   );
   public final int b;
   public final cvo c;

   public dgb(int $$0, cvo $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
