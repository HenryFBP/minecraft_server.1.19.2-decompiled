import com.mojang.serialization.Codec;
import java.util.List;

public class del extends ddt<dgc> {
   public del(Codec<dgc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgc> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      amn $$3 = $$0.d();
      dgc $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<gy> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            gt.a $$6 = $$2.i();

            for(gy $$7 : $$5) {
               $$6.g($$2);
               List<gy> $$8 = $$4.a($$3, $$7.g());

               for(int $$9 = 0; $$9 < $$4.c; ++$$9) {
                  $$6.a($$2, $$7);
                  cvo $$10 = $$1.a_($$6);
                  if (!c($$10) && !$$10.a($$4.b)) {
                     break;
                  }

                  if (a($$1, $$6, $$10, $$4, $$3, $$8)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }

   public static boolean a(chp $$0, gt $$1, cvo $$2, dgc $$3, amn $$4, List<gy> $$5) {
      gt.a $$6 = $$1.i();

      for(gy $$7 : $$5) {
         cvo $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            cvo $$9 = $$3.b.c($$2, $$0, $$1, $$7);
            if ($$9 == null) {
               return false;
            }

            $$0.a($$1, $$9, 3);
            $$0.B($$1).e($$1);
            if ($$4.i() < $$3.g) {
               $$3.b.c().a($$9, $$0, $$1, $$7, $$4, true);
            }

            return true;
         }
      }

      return false;
   }

   private static boolean c(cvo $$0) {
      return $$0.h() || $$0.a(cju.C);
   }
}
