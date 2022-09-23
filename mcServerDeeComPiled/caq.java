import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record caq(ajv b, int c, float d) {
   public static final Codec<caq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajv.a.fieldOf("sound_event").forGetter(caq::a), alq.c.fieldOf("use_duration").forGetter(caq::b), alq.d.fieldOf("range").forGetter(caq::c)
            )
            .apply($$0, caq::new)
   );

   public ajv a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
