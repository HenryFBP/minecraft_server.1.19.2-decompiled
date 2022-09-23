import javax.annotation.Nullable;

public class bml {
   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bmk.a($$0, $$1);
      return bmn.a($$0, () -> {
         gt $$9 = bmn.a($$0.dQ(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            gt $$10 = bmm.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bmn.a($$10, $$0.dQ().a($$6 - $$7 + 1) + $$7, $$0.s.ah(), $$1xx -> bmk.c($$0, $$1xx));
               return !bmk.a($$0, $$10) && !bmk.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}
