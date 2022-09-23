import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class azi extends azm {
   public static final Codec<azi> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.FLOAT.fieldOf("mean").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("deviation").forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("min").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("max").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, azi::new)
      )
      .comapFlatMap(
         $$0 -> $$0.f < $$0.e ? DataResult.error("Max must be larger than min: [" + $$0.e + ", " + $$0.f + "]") : DataResult.success($$0), Function.identity()
      );
   private float b;
   private float d;
   private float e;
   private float f;

   public static azi a(float $$0, float $$1, float $$2, float $$3) {
      return new azi($$0, $$1, $$2, $$3);
   }

   private azi(float $$0, float $$1, float $$2, float $$3) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public float a(amn $$0) {
      return a($$0, this.b, this.d, this.e, this.f);
   }

   public static float a(amn $$0, float $$1, float $$2, float $$3, float $$4) {
      return ami.a(ami.c($$0, $$1, $$2), $$3, $$4);
   }

   @Override
   public float a() {
      return this.e;
   }

   @Override
   public float b() {
      return this.f;
   }

   @Override
   public azn<?> c() {
      return azn.c;
   }

   public String toString() {
      return "normal(" + this.b + ", " + this.d + ") in [" + this.e + "-" + this.f + "]";
   }
}
