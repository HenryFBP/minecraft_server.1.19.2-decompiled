import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bls extends bly<bcc> {
   protected abstract boolean a(bcc var1, bcc var2);

   protected abstract bku<bcc> b();

   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(agg $$0, bcc $$1) {
      $$1.dy().a(this.b(), this.b($$1));
   }

   private Optional<bcc> b(bcc $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bkw> a(bcc $$0) {
      return $$0.dy().c(bku.h);
   }
}
