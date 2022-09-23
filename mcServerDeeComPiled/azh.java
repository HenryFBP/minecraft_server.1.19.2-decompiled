import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class azh extends azo {
   public static final Codec<azh> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  azo.c.fieldOf("source").forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.f),
                  Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, azh::new)
      )
      .comapFlatMap(
         $$0 -> $$0.g < $$0.f ? DataResult.error("Max must be at least min, min_inclusive: " + $$0.f + ", max_inclusive: " + $$0.g) : DataResult.success($$0),
         Function.identity()
      );
   private final azo b;
   private int f;
   private int g;

   public static azh a(azo $$0, int $$1, int $$2) {
      return new azh($$0, $$1, $$2);
   }

   public azh(azo $$0, int $$1, int $$2) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public int a(amn $$0) {
      return ami.a(this.b.a($$0), this.f, this.g);
   }

   @Override
   public int a() {
      return Math.max(this.f, this.b.a());
   }

   @Override
   public int b() {
      return Math.min(this.g, this.b.b());
   }

   @Override
   public azp<?> c() {
      return azp.d;
   }
}
