import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class chq {
   public static final Codec<chq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajv.a.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, chq::new)
   );
   private final ajv b;
   private final double c;

   public chq(ajv $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ajv a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
