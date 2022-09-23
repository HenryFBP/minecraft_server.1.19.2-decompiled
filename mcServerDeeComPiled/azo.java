import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class azo {
   private static final Codec<Either<Integer, azo>> a = Codec.either(Codec.INT, hm.aE.p().dispatch(azo::c, azp::codec));
   public static final Codec<azo> c = a.xmap(
      $$0 -> (azo)$$0.map(azl::a, $$0x -> $$0x), $$0 -> $$0.c() == azp.a ? Either.left(((azl)$$0).d()) : Either.right($$0)
   );
   public static final Codec<azo> d = b(0, Integer.MAX_VALUE);
   public static final Codec<azo> e = b(1, Integer.MAX_VALUE);

   public static Codec<azo> b(int $$0, int $$1) {
      Function<azo, DataResult<azo>> $$2 = $$2x -> {
         if ($$2x.a() < $$0) {
            return DataResult.error("Value provider too low: " + $$0 + " [" + $$2x.a() + "-" + $$2x.b() + "]");
         } else {
            return $$2x.b() > $$1 ? DataResult.error("Value provider too high: " + $$1 + " [" + $$2x.a() + "-" + $$2x.b() + "]") : DataResult.success($$2x);
         }
      };
      return c.flatXmap($$2, $$2);
   }

   public abstract int a(amn var1);

   public abstract int a();

   public abstract int b();

   public abstract azp<?> c();
}
