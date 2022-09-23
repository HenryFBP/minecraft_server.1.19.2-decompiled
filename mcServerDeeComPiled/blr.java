import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class blr<T extends bcc> extends bly<T> {
   @Override
   protected void a(agg $$0, T $$1) {
      dwl $$2 = $$1.cy().c((double)this.b(), (double)this.c(), (double)this.b());
      List<bcc> $$3 = $$0.a(bcc.class, $$2, $$1x -> $$1x != $$1 && $$1x.bo());
      $$3.sort(Comparator.comparingDouble($$1::f));
      bcx<?> $$4 = $$1.dy();
      $$4.a(bku.g, $$3);
      $$4.a(bku.h, new bkw($$1, $$3));
   }

   protected int b() {
      return 16;
   }

   protected int c() {
      return 16;
   }

   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.g, bku.h);
   }
}
