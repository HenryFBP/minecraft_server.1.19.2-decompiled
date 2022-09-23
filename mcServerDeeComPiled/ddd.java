import com.mojang.serialization.Codec;

public class ddd extends ddt<dge> {
   public ddd(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      gt $$1 = $$0.e();
      chp $$2 = $$0.b();
      amn $$3 = $$0.d();
      if ($$1.v() > $$2.m_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(cju.C) && !$$2.a_($$1.c()).a(cju.C)) {
         return false;
      } else {
         boolean $$4 = false;

         for(gy $$5 : gy.values()) {
            if ($$5 != gy.a && $$2.a_($$1.a($$5)).a(cju.hA)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, cju.lH.m(), 2);

            for(int $$6 = 0; $$6 < 200; ++$$6) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  gt $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  cvo $$10 = $$2.a_($$9);
                  if ($$10.d() == dpz.a || $$10.a(cju.C) || $$10.a(cju.hA) || $$10.a(cju.cX)) {
                     for(gy $$11 : gy.values()) {
                        cvo $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(cju.lH)) {
                           $$2.a($$9, cju.lH.m(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
