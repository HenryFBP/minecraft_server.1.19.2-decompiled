import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfu(die b, dbw c, azo d, int e) implements dfx {
   public static final Codec<dfu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               die.a.fieldOf("state_provider").forGetter(dfu::a),
               dbw.b.fieldOf("target").forGetter(dfu::b),
               azo.b(0, 8).fieldOf("radius").forGetter(dfu::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dfu::d)
            )
            .apply($$0, dfu::new)
   );

   public die a() {
      return this.b;
   }

   public dbw b() {
      return this.c;
   }

   public azo c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
