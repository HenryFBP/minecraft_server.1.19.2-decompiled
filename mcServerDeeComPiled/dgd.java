import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgd extends dfp {
   public static final Codec<dgd> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhw.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               alq.c.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               alq.c.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dgd::new)
   );
   public final int d;
   public final int e;

   public dgd(dhw $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
