import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dgq implements dfx {
   public static final Codec<dgq> a = alq.b(dkg.c).fieldOf("features").xmap(dgq::new, $$0 -> $$0.b).codec();
   public final he<dkg> b;

   public dgq(he<dkg> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ddg<?, ?>> e() {
      return this.b.a().flatMap($$0 -> ((dkg)$$0.a()).a());
   }
}
