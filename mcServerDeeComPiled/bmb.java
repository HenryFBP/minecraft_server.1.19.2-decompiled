import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bmb extends bly<bcc> {
   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.i);
   }

   @Override
   protected void a(agg $$0, bcc $$1) {
      $$1.dy().a(bku.i, this.a($$1));
   }

   private List<bcc> a(bcc $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bcc $$0) {
      return $$0.ad() == bbr.aZ && $$0.y_();
   }

   private bkw c(bcc $$0) {
      return (bkw)$$0.dy().c(bku.h).orElse(bkw.a());
   }
}
