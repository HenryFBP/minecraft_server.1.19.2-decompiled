import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bln extends bly<bcc> {
   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.x, bku.y);
   }

   @Override
   protected void a(agg $$0, bcc $$1) {
      bcx<?> $$2 = $$1.dy();
      baw $$3 = $$1.eh();
      if ($$3 != null) {
         $$2.a(bku.x, $$1.eh());
         bbn $$4 = $$3.m();
         if ($$4 instanceof bcc) {
            $$2.a(bku.y, (bcc)$$4);
         }
      } else {
         $$2.b(bku.x);
      }

      $$2.c(bku.y).ifPresent($$2x -> {
         if (!$$2x.bo() || $$2x.s != $$0) {
            $$2.b(bku.y);
         }

      });
   }
}
