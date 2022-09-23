import javax.annotation.Nullable;

public class bmj {
   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2) {
      boolean $$3 = bmk.a($$0, $$1);
      return bmn.a($$0, () -> {
         gt $$4 = bmn.a($$0.dQ(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2, dwq $$3, double $$4) {
      dwq $$5 = $$3.a($$0.df(), $$0.dh(), $$0.dl());
      boolean $$6 = bmk.a($$0, $$1);
      return bmn.a($$0, () -> {
         gt $$6x = bmn.a($$0.dQ(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2, dwq $$3) {
      dwq $$4 = $$0.cY().d($$3);
      boolean $$5 = bmk.a($$0, $$1);
      return bmn.a($$0, () -> {
         gt $$5x = bmn.a($$0.dQ(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gt a(bcl $$0, int $$1, boolean $$2, gt $$3) {
      gt $$4 = bmn.a($$0, $$1, $$0.dQ(), $$3);
      return !bmk.a($$4, $$0) && !bmk.a($$2, $$0, $$4) && !bmk.a($$0.D(), $$4) && !bmk.b($$0, $$4) ? $$4 : null;
   }
}
