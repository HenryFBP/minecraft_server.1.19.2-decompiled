import com.mojang.serialization.Codec;

public class dea extends ddt<dge> {
   public dea(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      amn $$3 = $$0.d();
      if (!$$1.x($$2)) {
         return false;
      } else {
         cvo $$4 = $$1.a_($$2.b());
         if (!$$4.a(cju.df) && !$$4.a(cju.di) && !$$4.a(cju.oc)) {
            return false;
         } else {
            $$1.a($$2, cju.dm.m(), 2);

            for(int $$5 = 0; $$5 < 1500; ++$$5) {
               gt $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).h()) {
                  int $$7 = 0;

                  for(gy $$8 : gy.values()) {
                     if ($$1.a_($$6.a($$8)).a(cju.dm)) {
                        ++$$7;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cju.dm.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
