import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class cgl {
   public static final cgl a = new cgl(ImmutableList.of("vanilla"), ImmutableList.of());
   public static final Codec<cgl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.listOf().fieldOf("Enabled").forGetter($$0x -> $$0x.c), Codec.STRING.listOf().fieldOf("Disabled").forGetter($$0x -> $$0x.d))
            .apply($$0, cgl::new)
   );
   private final List<String> c;
   private final List<String> d;

   public cgl(List<String> $$0, List<String> $$1) {
      this.c = ImmutableList.copyOf($$0);
      this.d = ImmutableList.copyOf($$1);
   }

   public List<String> a() {
      return this.c;
   }

   public List<String> b() {
      return this.d;
   }
}
