import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class blt extends bly<bcc> {
   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.h, bku.L, bku.al);
   }

   @Override
   protected void a(agg $$0, bcc $$1) {
      bcx<?> $$2 = $$1.dy();
      List<bsr> $$3 = Lists.newArrayList();
      bkw $$4 = (bkw)$$2.c(bku.h).orElse(bkw.a());
      Optional<bce> $$5 = $$4.a($$0x -> $$0x instanceof bsh || $$0x instanceof bqj).map(bce.class::cast);

      for(bcc $$7 : (List)$$2.c(bku.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof bsr && ((bsr)$$7).fK()) {
            $$3.add((bsr)$$7);
         }
      }

      $$2.a(bku.L, $$5);
      $$2.a(bku.al, $$3);
   }
}
