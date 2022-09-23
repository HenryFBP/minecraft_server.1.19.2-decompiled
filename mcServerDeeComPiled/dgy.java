import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class dgy {
   public static final Codec<dgy> a = hm.bA.p().dispatch(dgy::b, dgz::a);
   protected static final int b = 16;
   protected final OptionalInt c;

   protected static <S extends dgy> RecordCodecBuilder<S, OptionalInt> a() {
      return Codec.intRange(0, 80)
         .optionalFieldOf("min_clipped_height")
         .xmap(
            $$0 -> (OptionalInt)$$0.map(OptionalInt::of).orElse(OptionalInt.empty()), $$0 -> $$0.isPresent() ? Optional.of($$0.getAsInt()) : Optional.empty()
         )
         .forGetter($$0 -> $$0.c);
   }

   public dgy(OptionalInt $$0) {
      this.c = $$0;
   }

   protected abstract dgz<?> b();

   public abstract int a(int var1, int var2);

   public OptionalInt c() {
      return this.c;
   }
}
