import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class dev extends ddt<dgn> {
   public dev(Codec<dgn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgn> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      if (!$$1.a_($$2).h()) {
         return false;
      } else {
         amn $$3 = $$0.d();
         gt $$4 = $$0.e();
         dgn $$5 = $$0.f();
         gt.a $$6 = $$4.i();
         if (a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            a($$1, $$5, $$3, $$4, $$6);
         }

         return true;
      }
   }

   private static boolean a(chp $$0, dgn $$1, gt $$2) {
      gt.a $$3 = $$2.i();

      for(int $$4 = 1; $$4 <= $$1.c; ++$$4) {
         $$3.c(gy.b);
         cvo $$5 = $$0.a_($$3);
         if (!a($$5, $$4, $$1.n)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cvo $$0, int $$1, int $$2) {
      if ($$0.h()) {
         return true;
      } else {
         int $$3 = $$1 + 1;
         return $$3 <= $$2 && $$0.p().a(akp.a);
      }
   }

   private static boolean a(chp $$0, cxk $$1, dgn $$2, amn $$3, gt.a $$4, gt $$5) {
      for(int $$6 = 0; $$6 < $$2.h; ++$$6) {
         $$4.c(gy.b);
         if ($$2.o.test($$0, $$4) && a($$0, $$2, $$4)) {
            gt $$7 = $$4.c();
            if ($$0.b_($$7).a(akp.b) || !$$0.a_($$7).d().b()) {
               return false;
            }

            if (((dkg)$$2.b.a()).a($$0, $$1, $$3, $$4)) {
               a($$5, $$5.v() + $$6, $$0, $$2, $$3);
               return true;
            }
         }
      }

      return false;
   }

   private static void a(gt $$0, int $$1, chp $$2, dgn $$3, amn $$4) {
      int $$5 = $$0.u();
      int $$6 = $$0.w();
      gt.a $$7 = $$0.i();

      for(int $$8 = $$0.v(); $$8 < $$1; ++$$8) {
         a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
      }

   }

   private static void a(chp $$0, dgn $$1, amn $$2, int $$3, int $$4, gt.a $$5) {
      int $$6 = $$1.d;
      Predicate<cvo> $$7 = $$1x -> $$1x.a($$1.e);

      for(int $$8 = 0; $$8 < $$1.g; ++$$8) {
         $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
         if ($$7.test($$0.a_($$5))) {
            $$0.a($$5, $$1.f.a($$2, $$5), 2);
         }

         $$5.p($$3);
         $$5.r($$4);
      }

   }

   private static void a(chp $$0, dgn $$1, amn $$2, gt $$3, gt.a $$4) {
      int $$5 = $$1.i;
      int $$6 = $$1.j;

      for(int $$7 = 0; $$7 < $$1.l; ++$$7) {
         $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
         if ($$0.x($$4)) {
            cvo $$8 = $$1.k.a($$2, $$4);
            if ($$8.a($$0, $$4) && $$0.a_($$4.b()).d($$0, $$4, gy.a)) {
               $$0.a($$4, $$8, 2);
            }
         }
      }

   }
}
