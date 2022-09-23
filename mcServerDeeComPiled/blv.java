import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class blv extends bly<bcc> {
   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.j, bku.k, bku.l);
   }

   @Override
   protected void a(agg $$0, bcc $$1) {
      List<buc> $$2 = (List)$$0.w()
         .stream()
         .filter(bbq.f)
         .filter($$1x -> $$1.a($$1x, 16.0))
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      bcx<?> $$3 = $$1.dy();
      $$3.a(bku.j, $$2);
      List<buc> $$4 = (List)$$2.stream().filter($$1x -> b($$1, $$1x)).collect(Collectors.toList());
      $$3.a(bku.k, $$4.isEmpty() ? null : (buc)$$4.get(0));
      Optional<buc> $$5 = $$4.stream().filter($$1x -> c($$1, $$1x)).findFirst();
      $$3.a(bku.l, $$5);
   }
}
