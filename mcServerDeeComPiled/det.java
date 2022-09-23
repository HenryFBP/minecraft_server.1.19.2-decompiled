import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class det extends ddt<dgm> {
   public det(Codec<dgm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgm> $$0) {
      dgm $$1 = $$0.f();
      chp $$2 = $$0.b();
      amn $$3 = $$0.d();
      cjt $$4 = $$1.b.b();
      gt $$5 = a($$2, $$0.e().i().a(gy.a.b, $$2.u_() + 1, $$2.ah() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for(gt $$11 : gt.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            cvo $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static gt a(cgy $$0, gt.a $$1, cjt $$2) {
      while($$1.v() > $$0.u_() + 1) {
         cvo $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(gy.a);
      }

      return null;
   }
}
