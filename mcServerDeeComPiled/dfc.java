import com.mojang.serialization.Codec;

public class dfc extends ddt<dge> {
   public dfc(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      gt.a $$3 = new gt.a();
      gt.a $$4 = new gt.a();

      for(int $$5 = 0; $$5 < 16; ++$$5) {
         for(int $$6 = 0; $$6 < 16; ++$$6) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dar.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(gy.a, 1);
            cht $$10 = $$1.w($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, cju.cX.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, cju.cW.m(), 2);
               cvo $$11 = $$1.a_($$4);
               if ($$11.b(cqt.a)) {
                  $$1.a($$4, $$11.a(cqt.a, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
