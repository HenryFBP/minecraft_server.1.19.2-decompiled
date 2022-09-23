import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class djj {
   private static final Codec<Either<dbl, djj>> a = Codec.either(dbl.a, hm.aG.p().dispatch(djj::a, djk::codec));
   public static final Codec<djj> c = a.xmap(
      $$0 -> (djj)$$0.map(dji::a, $$0x -> $$0x), $$0 -> $$0.a() == djk.a ? Either.left(((dji)$$0).b()) : Either.right($$0)
   );

   public abstract int a(amn var1, dbn var2);

   public abstract djk<?> a();
}
