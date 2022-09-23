import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgu(int b, int c, int d) implements dfx {
   public static final Codec<dgu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alq.c.fieldOf("spread_width").forGetter(dgu::a),
               alq.c.fieldOf("spread_height").forGetter(dgu::b),
               alq.c.fieldOf("max_height").forGetter(dgu::c)
            )
            .apply($$0, dgu::new)
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
}
