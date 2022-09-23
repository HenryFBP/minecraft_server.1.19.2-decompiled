import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dgi implements dfx {
   public static final Codec<dgi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkg.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dkg.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dgi::new)
   );
   public final hc<dkg> b;
   public final hc<dkg> c;

   public dgi(hc<dkg> $$0, hc<dkg> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ddg<?, ?>> e() {
      return Stream.concat(((dkg)this.b.a()).a(), ((dkg)this.c.a()).a());
   }
}
