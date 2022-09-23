import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class blm extends bly<bsm> {
   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.h, bku.au, bku.ao, bku.an, bku.aq, bku.ar, new bku[0]);
   }

   protected void a(agg $$0, bsm $$1) {
      bcx<?> $$2 = $$1.dy();
      $$2.a(bku.au, this.b($$0, $$1));
      Optional<bss> $$3 = Optional.empty();
      int $$4 = 0;
      List<bsm> $$5 = Lists.newArrayList();
      bkw $$6 = (bkw)$$2.c(bku.h).orElse(bkw.a());

      for(bcc $$7 : $$6.b($$0x -> !$$0x.y_() && ($$0x instanceof bss || $$0x instanceof bsm))) {
         if ($$7 instanceof bss $$8) {
            ++$$4;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof bsm $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bku.ao, $$3);
      $$2.a(bku.an, $$5);
      $$2.a(bku.aq, $$4);
      $$2.a(bku.ar, $$5.size());
   }

   private Optional<gt> b(agg $$0, bsm $$1) {
      return gt.a($$1.da(), 8, 4, $$1x -> $$0.a_($$1x).a(akl.aJ));
   }
}
