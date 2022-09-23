import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class azm implements azr {
   private static final Codec<Either<Float, azm>> a = Codec.either(Codec.FLOAT, hm.aC.p().dispatch(azm::c, azn::codec));
   public static final Codec<azm> c = a.xmap(
      $$0 -> (azm)$$0.map(azk::a, $$0x -> $$0x), $$0 -> $$0.c() == azn.a ? Either.left(((azk)$$0).d()) : Either.right($$0)
   );

   public static Codec<azm> a(float $$0, float $$1) {
      Function<azm, DataResult<azm>> $$2 = $$2x -> {
         if ($$2x.a() < $$0) {
            return DataResult.error("Value provider too low: " + $$0 + " [" + $$2x.a() + "-" + $$2x.b() + "]");
         } else {
            return $$2x.b() > $$1 ? DataResult.error("Value provider too high: " + $$1 + " [" + $$2x.a() + "-" + $$2x.b() + "]") : DataResult.success($$2x);
         }
      };
      return c.flatXmap($$2, $$2);
   }

   public abstract float a();

   public abstract float b();

   public abstract azn<?> c();
}
