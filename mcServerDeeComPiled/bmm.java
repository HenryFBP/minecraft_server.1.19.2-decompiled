import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bmm {
   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::f);
   }

   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2, ToDoubleFunction<gt> $$3) {
      boolean $$4 = bmk.a($$0, $$1);
      return bmn.a(() -> {
         gt $$4x = bmn.a($$0.dQ(), $$1, $$2);
         gt $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2, dwq $$3) {
      dwq $$4 = $$3.a($$0.df(), $$0.dh(), $$0.dl());
      boolean $$5 = bmk.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static dwq b(bcl $$0, int $$1, int $$2, dwq $$3) {
      dwq $$4 = $$0.cY().d($$3);
      boolean $$5 = bmk.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static dwq a(bcl $$0, int $$1, int $$2, dwq $$3, boolean $$4) {
      return bmn.a($$0, () -> {
         gt $$5 = bmn.a($$0.dQ(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            gt $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static gt a(bcl $$0, gt $$1) {
      $$1 = bmn.a($$1, $$0.s.ah(), $$1x -> bmk.c($$0, $$1x));
      return !bmk.a($$0, $$1) && !bmk.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gt a(bcl $$0, int $$1, boolean $$2, gt $$3) {
      gt $$4 = bmn.a($$0, $$1, $$0.dQ(), $$3);
      return !bmk.a($$4, $$0) && !bmk.a($$2, $$0, $$4) && !bmk.a($$0.D(), $$4) ? $$4 : null;
   }
}
