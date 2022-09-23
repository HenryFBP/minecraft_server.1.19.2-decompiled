import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dap {
   public static final Codec<dap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfy.a.fieldOf("generate_crack_chance").orElse(1.0).forGetter($$0x -> $$0x.b),
               Codec.doubleRange(0.0, 5.0).fieldOf("base_crack_size").orElse(2.0).forGetter($$0x -> $$0x.c),
               Codec.intRange(0, 10).fieldOf("crack_point_offset").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dap::new)
   );
   public final double b;
   public final double c;
   public final int d;

   public dap(double $$0, double $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
