import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class blh extends bly<bbk> {
   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.J, bku.h);
   }

   protected void a(agg $$0, bbk $$1) {
      $$1.dy().c(bku.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bbk $$0, bkw $$1) {
      Optional<bbk> $$2 = $$1.a($$1x -> $$1x.ad() == $$0.ad() && !$$1x.y_()).map(bbk.class::cast);
      $$0.dy().a(bku.J, $$2);
   }
}
