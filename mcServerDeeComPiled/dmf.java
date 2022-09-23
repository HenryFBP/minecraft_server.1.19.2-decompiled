import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmf extends dmh {
   public static final Codec<dmf> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dmf::new));

   protected dmf(Either<abb, dot> $$0, hc<dor> $$1, dmk.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dop a(cpw $$0, dkt $$1, boolean $$2) {
      dop $$3 = super.a($$0, $$1, $$2);
      $$3.b(dnw.b);
      $$3.a(dnw.d);
      return $$3;
   }

   @Override
   public dmj<?> a() {
      return dmj.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
