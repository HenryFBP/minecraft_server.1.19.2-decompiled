import java.util.Optional;

public class amu {
   public static <T extends bce> Optional<T> a(bbr<T> $$0, bcg $$1, agg $$2, gt $$3, int $$4, int $$5, int $$6, amu.a $$7) {
      gt.a $$8 = $$3.i();

      for(int $$9 = 0; $$9 < $$4; ++$$9) {
         int $$10 = ami.b($$2.w, -$$5, $$5);
         int $$11 = ami.b($$2.w, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.p_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = $$0.b($$2, null, null, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a((cha)$$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.ah();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(agg $$0, int $$1, gt.a $$2, amu.a $$3) {
      gt.a $$4 = new gt.a().g($$2);
      cvo $$5 = $$0.a_($$4);

      for(int $$6 = $$1; $$6 >= -$$1; --$$6) {
         $$2.c(gy.a);
         $$4.a($$2, gy.b);
         cvo $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(gy.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      amu.a a = ($$0, $$1, $$2, $$3, $$4) -> ($$4.h() || $$4.d().a()) && $$2.d().f();
      amu.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).b() && cjt.a($$2.k($$0, $$1), gy.b);

      boolean canSpawnOn(agg var1, gt var2, cvo var3, gt var4, cvo var5);
   }
}
