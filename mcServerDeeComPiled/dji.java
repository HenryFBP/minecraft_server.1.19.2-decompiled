import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dji extends djj {
   public static final dji a = new dji(dbl.a(0));
   public static final Codec<dji> b = Codec.either(
         dbl.a, RecordCodecBuilder.create($$0 -> $$0.group(dbl.a.fieldOf("value").forGetter($$0x -> $$0x.d)).apply($$0, dji::new))
      )
      .xmap($$0 -> (dji)$$0.map(dji::a, $$0x -> $$0x), $$0 -> Either.left($$0.d));
   private final dbl d;

   public static dji a(dbl $$0) {
      return new dji($$0);
   }

   private dji(dbl $$0) {
      this.d = $$0;
   }

   public dbl b() {
      return this.d;
   }

   @Override
   public int a(amn $$0, dbn $$1) {
      return this.d.a($$1);
   }

   @Override
   public djk<?> a() {
      return djk.a;
   }

   public String toString() {
      return this.d.toString();
   }
}
