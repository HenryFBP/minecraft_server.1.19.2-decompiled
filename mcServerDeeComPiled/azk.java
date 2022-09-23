import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class azk extends azm {
   public static final azk a = new azk(0.0F);
   public static final Codec<azk> b = Codec.either(
         Codec.FLOAT, RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter($$0x -> $$0x.d)).apply($$0, azk::new))
      )
      .xmap($$0 -> (azk)$$0.map(azk::a, $$0x -> $$0x), $$0 -> Either.left($$0.d));
   private final float d;

   public static azk a(float $$0) {
      return $$0 == 0.0F ? a : new azk($$0);
   }

   private azk(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(amn $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d + 1.0F;
   }

   @Override
   public azn<?> c() {
      return azn.a;
   }

   public String toString() {
      return Float.toString(this.d);
   }
}
