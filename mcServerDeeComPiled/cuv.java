import javax.annotation.Nullable;

public abstract class cuv {
   @Nullable
   protected abstract hc<? extends ddg<?, ?>> a(amn var1, boolean var2);

   public boolean a(agg $$0, cxk $$1, gt $$2, cvo $$3, amn $$4) {
      hc<? extends ddg<?, ?>> $$5 = this.a($$4, this.a($$0, $$2));
      if ($$5 == null) {
         return false;
      } else {
         ddg<?, ?> $$6 = (ddg)$$5.a();
         cvo $$7 = $$0.b_($$2).g();
         $$0.a($$2, $$7, 4);
         if ($$6.a($$0, $$1, $$4, $$2)) {
            if ($$0.a_($$2) == $$7) {
               $$0.a($$2, $$3, $$7, 2);
            }

            return true;
         } else {
            $$0.a($$2, $$3, 4);
            return false;
         }
      }
   }

   private boolean a(cgy $$0, gt $$1) {
      for(gt $$2 : gt.a.a($$1.c().d(2).f(2), $$1.b().e(2).g(2))) {
         if ($$0.a_($$2).a(akl.Q)) {
            return true;
         }
      }

      return false;
   }
}
