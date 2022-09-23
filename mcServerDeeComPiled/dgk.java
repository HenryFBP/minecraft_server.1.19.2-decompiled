import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgk(int b, int c, int d, hc<dkg> e) implements dfx {
   public static final Codec<dgk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alq.c.fieldOf("tries").orElse(128).forGetter(dgk::a),
               alq.b.fieldOf("xz_spread").orElse(7).forGetter(dgk::b),
               alq.b.fieldOf("y_spread").orElse(3).forGetter(dgk::c),
               dkg.b.fieldOf("feature").forGetter(dgk::d)
            )
            .apply($$0, dgk::new)
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

   public hc<dkg> d() {
      return this.e;
   }
}
