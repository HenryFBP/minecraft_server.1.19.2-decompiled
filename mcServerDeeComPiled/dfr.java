import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfr implements dfx {
   public static final Codec<dfr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azo.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), azo.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dfr::new)
   );
   private final azo b;
   private final azo c;

   public dfr(azo $$0, azo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public azo a() {
      return this.b;
   }

   public azo b() {
      return this.c;
   }
}
