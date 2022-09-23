import javax.annotation.Nullable;

public class bmh {
   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bmk.a($$0, $$1);
      return bmn.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gt a(bcl $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gt $$8 = bmn.a($$0.dQ(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gt $$9 = bmn.a($$0, $$1, $$0.dQ(), $$8);
         if (!bmk.a($$9, $$0) && !bmk.a($$7, $$0, $$9)) {
            $$9 = bmn.a($$9, $$0.s.ah(), $$1x -> bmk.c($$0, $$1x));
            return bmk.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
