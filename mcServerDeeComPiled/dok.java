import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dok extends don {
   public static final Codec<dok> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hm.V.p().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dok::new)
   );
   private final cjt b;
   private final float d;

   public dok(cjt $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(cvo $$0, amn $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected doo<?> a() {
      return doo.e;
   }
}
