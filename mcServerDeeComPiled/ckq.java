import java.util.Optional;

public interface ckq<T extends Enum<T>> {
   int t_ = 4;

   Optional<cvo> a(cvo var1);

   float a();

   default void a_(cvo $$0, agg $$1, gt $$2, amn $$3) {
      float $$4 = 0.05688889F;
      if ($$3.i() < 0.05688889F) {
         this.c($$0, $$1, $$2, $$3);
      }

   }

   T b();

   default void c(cvo $$0, agg $$1, gt $$2, amn $$3) {
      int $$4 = this.b().ordinal();
      int $$5 = 0;
      int $$6 = 0;

      for(gt $$7 : gt.a($$2, 4, 4, 4)) {
         int $$8 = $$7.k($$2);
         if ($$8 > 4) {
            break;
         }

         if (!$$7.equals($$2)) {
            cvo $$9 = $$1.a_($$7);
            cjt $$10 = $$9.b();
            if ($$10 instanceof ckq) {
               Enum<?> $$11 = ((ckq)$$10).b();
               if (this.b().getClass() == $$11.getClass()) {
                  int $$12 = $$11.ordinal();
                  if ($$12 < $$4) {
                     return;
                  }

                  if ($$12 > $$4) {
                     ++$$6;
                  } else {
                     ++$$5;
                  }
               }
            }
         }
      }

      float $$13 = (float)($$6 + 1) / (float)($$6 + $$5 + 1);
      float $$14 = $$13 * $$13 * this.a();
      if ($$3.i() < $$14) {
         this.a($$0).ifPresent($$2x -> $$1.b($$2, $$2x));
      }

   }
}
