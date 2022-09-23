import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class blu extends bly<bcc> {
   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.h, bku.g, bku.L, bku.ak, bku.as, bku.ai, new bku[]{bku.aj, bku.am, bku.al, bku.aq, bku.ar, bku.au});
   }

   @Override
   protected void a(agg $$0, bcc $$1) {
      bcx<?> $$2 = $$1.dy();
      $$2.a(bku.au, c($$0, $$1));
      Optional<bce> $$3 = Optional.empty();
      Optional<bsm> $$4 = Optional.empty();
      Optional<bsm> $$5 = Optional.empty();
      Optional<bss> $$6 = Optional.empty();
      Optional<bcc> $$7 = Optional.empty();
      Optional<buc> $$8 = Optional.empty();
      Optional<buc> $$9 = Optional.empty();
      int $$10 = 0;
      List<bsr> $$11 = Lists.newArrayList();
      List<bsr> $$12 = Lists.newArrayList();
      bkw $$13 = (bkw)$$2.c(bku.h).orElse(bkw.a());

      for(bcc $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof bsm $$15) {
            if ($$15.y_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.t()) {
               ++$$10;
               if ($$4.isEmpty() && $$15.fL()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof bsv $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof bss $$17) {
            if ($$17.y_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.fK()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof buc $$18) {
            if ($$8.isEmpty() && !bst.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.B_() && bst.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof bsh) && !($$14 instanceof bqj)) {
            if ($$7.isEmpty() && bst.a($$14.ad())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((bce)$$14);
         }
      }

      for(bcc $$20 : (List)$$2.c(bku.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof bsr $$21 && $$21.fK()) {
            $$12.add($$21);
         }
      }

      $$2.a(bku.L, $$3);
      $$2.a(bku.ai, $$4);
      $$2.a(bku.aj, $$5);
      $$2.a(bku.ap, $$7);
      $$2.a(bku.ak, $$8);
      $$2.a(bku.as, $$9);
      $$2.a(bku.al, $$12);
      $$2.a(bku.am, $$11);
      $$2.a(bku.aq, $$11.size());
      $$2.a(bku.ar, $$10);
   }

   private static Optional<gt> c(agg $$0, bcc $$1) {
      return gt.a($$1.da(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(agg $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(akl.R);
      return $$3 && $$2.a(cju.mS) ? cke.g($$2) : $$3;
   }
}
