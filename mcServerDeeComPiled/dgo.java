import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgo(int b, int c, int d, int e, int f, azo g, float h) implements dfx {
   public static final Codec<dgo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dgo::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dgo::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dgo::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dgo::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dgo::f),
               azo.c.fieldOf("extra_rare_growths").forGetter(dgo::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dgo::h)
            )
            .apply($$0, dgo::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
