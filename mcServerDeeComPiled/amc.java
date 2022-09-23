import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record amc<A>(Codec<A> a) {
   public static <A> amc<A> a(Codec<A> $$0) {
      return new amc<>($$0);
   }

   public static <A> amc<A> a(MapCodec<A> $$0) {
      return new amc<>($$0.codec());
   }
}
