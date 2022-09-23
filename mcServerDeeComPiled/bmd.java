import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bmd extends blr<btg> {
   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(bku.B)));
   }

   protected void a(agg $$0, btg $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ad() == bbr.bn)
         .or(() -> a($$1, $$0xx -> $$0xx.ad() != bbr.bn))
         .ifPresentOrElse($$1x -> $$1.dy().a(bku.B, $$1x), () -> $$1.dy().b(bku.B));
   }

   private static Optional<bcc> a(btg $$0, Predicate<bcc> $$1) {
      return $$0.dy().c(bku.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
   }

   @Override
   protected int b() {
      return 24;
   }

   @Override
   protected int c() {
      return 24;
   }
}
