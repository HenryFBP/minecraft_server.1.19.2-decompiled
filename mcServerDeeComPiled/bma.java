import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bma extends bly<bcl> {
   public static final int a = 10;
   private static final bmf c = bmf.b().a(10.0).d();
   private final cdm d;

   public bma(cdm $$0) {
      this.d = $$0;
   }

   protected void a(agg $$0, bcl $$1) {
      bcx<?> $$2 = $$1.dy();
      List<buc> $$3 = (List)$$0.w()
         .stream()
         .filter(bbq.f)
         .filter($$1x -> c.a($$1, $$1x))
         .filter($$1x -> $$1.a($$1x, 10.0))
         .filter(this::a)
         .sorted(Comparator.comparingDouble($$1::f))
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         buc $$4 = (buc)$$3.get(0);
         $$2.a(bku.N, $$4);
      } else {
         $$2.b(bku.N);
      }

   }

   private boolean a(buc $$0) {
      return this.a($$0.ez()) || this.a($$0.eA());
   }

   private boolean a(cax $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.N);
   }
}
