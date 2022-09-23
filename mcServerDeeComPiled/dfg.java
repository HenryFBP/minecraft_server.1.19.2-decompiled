import com.mojang.serialization.Codec;

public class dfg extends ddt<dgu> {
   public dfg(Codec<dgu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgu> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         amn $$3 = $$0.d();
         dgu $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         gt.a $$8 = new gt.a();

         for(int $$9 = 0; $$9 < $$5 * $$5; ++$$9) {
            $$8.g($$2).e(ami.a($$3, -$$5, $$5), ami.a($$3, -$$6, $$6), ami.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (gt)$$8)) {
               int $$10 = ami.a($$3, 1, $$7);
               if ($$3.a(6) == 0) {
                  $$10 *= 2;
               }

               if ($$3.a(5) == 0) {
                  $$10 = 1;
               }

               int $$11 = 17;
               int $$12 = 25;
               a($$1, $$3, $$8, $$10, 17, 25);
            }
         }

         return true;
      }
   }

   private static boolean a(cgy $$0, gt.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.v($$1)) {
            return false;
         }
      } while($$0.a_($$1).h());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(cgy $$0, amn $$1, gt.a $$2, int $$3, int $$4, int $$5) {
      for(int $$6 = 1; $$6 <= $$3; ++$$6) {
         if ($$0.x($$2)) {
            if ($$6 == $$3 || !$$0.x($$2.b())) {
               $$0.a($$2, cju.nm.m().a(cmz.d, Integer.valueOf(ami.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cju.nn.m(), 2);
         }

         $$2.c(gy.b);
      }

   }

   private static boolean a(cgy $$0, gt $$1) {
      if (!$$0.x($$1)) {
         return true;
      } else {
         cvo $$2 = $$0.a_($$1.c());
         return !$$2.a(cju.df) && !$$2.a(cju.mY) && !$$2.a(cju.na);
      }
   }
}
