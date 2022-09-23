import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dgj implements dfx {
   public static final Codec<dgj> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dgj::new, dfn.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dkg.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dfn> b;
   public final hc<dkg> c;

   public dgj(List<dfn> $$0, hc<dkg> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ddg<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> ((dkg)$$0.b.a()).a()), ((dkg)this.c.a()).a());
   }
}
