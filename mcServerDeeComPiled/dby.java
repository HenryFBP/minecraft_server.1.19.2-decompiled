import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dby implements dbw {
   protected final List<dbw> e;

   protected dby(List<dbw> $$0) {
      this.e = $$0;
   }

   public static <T extends dby> Codec<T> a(Function<List<dbw>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dbw.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
