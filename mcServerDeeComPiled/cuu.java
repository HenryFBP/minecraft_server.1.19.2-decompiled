import javax.annotation.Nullable;

public abstract class cuu extends cuv {
   @Override
   public boolean a(agg $$0, cxk $$1, gt $$2, cvo $$3, amn $$4) {
      for(int $$5 = 0; $$5 >= -1; --$$5) {
         for(int $$6 = 0; $$6 >= -1; --$$6) {
            if (a($$3, $$0, $$2, $$5, $$6)) {
               return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   protected abstract hc<? extends ddg<?, ?>> a(amn var1);

   public boolean a(agg $$0, cxk $$1, gt $$2, cvo $$3, amn $$4, int $$5, int $$6) {
      hc<? extends ddg<?, ?>> $$7 = this.a($$4);
      if ($$7 == null) {
         return false;
      } else {
         ddg<?, ?> $$8 = (ddg)$$7.a();
         cvo $$9 = cju.a.m();
         $$0.a($$2.b($$5, 0, $$6), $$9, 4);
         $$0.a($$2.b($$5 + 1, 0, $$6), $$9, 4);
         $$0.a($$2.b($$5, 0, $$6 + 1), $$9, 4);
         $$0.a($$2.b($$5 + 1, 0, $$6 + 1), $$9, 4);
         if ($$8.a($$0, $$1, $$4, $$2.b($$5, 0, $$6))) {
            return true;
         } else {
            $$0.a($$2.b($$5, 0, $$6), $$3, 4);
            $$0.a($$2.b($$5 + 1, 0, $$6), $$3, 4);
            $$0.a($$2.b($$5, 0, $$6 + 1), $$3, 4);
            $$0.a($$2.b($$5 + 1, 0, $$6 + 1), $$3, 4);
            return false;
         }
      }
   }

   public static boolean a(cvo $$0, cgd $$1, gt $$2, int $$3, int $$4) {
      cjt $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }
}
