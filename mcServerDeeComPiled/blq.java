import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class blq extends bly<bce> {
   private static final long c = 32L;
   private static final long d = 16L;
   public static final int a = 32;

   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.K);
   }

   protected void a(agg $$0, bce $$1) {
      bcx<?> $$2 = $$1.dy();
      List<bqv> $$3 = $$0.a(bqv.class, $$1.cy().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::f));
      Optional<bqv> $$4 = $$3.stream().filter($$1x -> $$1.l($$1x.i())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::B).findFirst();
      $$2.a(bku.K, $$4);
   }
}
