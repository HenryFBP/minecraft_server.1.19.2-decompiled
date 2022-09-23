import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class azj extends azo {
   public static final Codec<azj> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.FLOAT.fieldOf("mean").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("deviation").forGetter($$0x -> $$0x.f),
                  Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.g),
                  Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.h)
               )
               .apply($$0, azj::new)
      )
      .comapFlatMap(
         $$0 -> $$0.h < $$0.g ? DataResult.error("Max must be larger than min: [" + $$0.g + ", " + $$0.h + "]") : DataResult.success($$0), Function.identity()
      );
   private float b;
   private float f;
   private int g;
   private int h;

   public static azj a(float $$0, float $$1, int $$2, int $$3) {
      return new azj($$0, $$1, $$2, $$3);
   }

   private azj(float $$0, float $$1, int $$2, int $$3) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
   }

   @Override
   public int a(amn $$0) {
      return a($$0, this.b, this.f, (float)this.g, (float)this.h);
   }

   public static int a(amn $$0, float $$1, float $$2, float $$3, float $$4) {
      return (int)ami.a(ami.c($$0, $$1, $$2), $$3, $$4);
   }

   @Override
   public int a() {
      return this.g;
   }

   @Override
   public int b() {
      return this.h;
   }

   @Override
   public azp<?> c() {
      return azp.f;
   }

   public String toString() {
      return "normal(" + this.b + ", " + this.f + ") in [" + this.g + "-" + this.h + "]";
   }
}
