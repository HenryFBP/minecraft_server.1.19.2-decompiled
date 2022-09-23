import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class azl extends azo {
   public static final azl a = new azl(0);
   public static final Codec<azl> b = Codec.either(
         Codec.INT, RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("value").forGetter($$0x -> $$0x.f)).apply($$0, azl::new))
      )
      .xmap($$0 -> (azl)$$0.map(azl::a, $$0x -> $$0x), $$0 -> Either.left($$0.f));
   private final int f;

   public static azl a(int $$0) {
      return $$0 == 0 ? a : new azl($$0);
   }

   private azl(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(amn $$0) {
      return this.f;
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public azp<?> c() {
      return azp.a;
   }

   public String toString() {
      return Integer.toString(this.f);
   }
}
