import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dol extends don {
   public static final Codec<dol> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvo.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dol::new)
   );
   private final cvo b;
   private final float d;

   public dol(cvo $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(cvo $$0, amn $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected doo<?> a() {
      return doo.f;
   }
}
