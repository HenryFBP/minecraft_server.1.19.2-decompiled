import com.mojang.serialization.Codec;

public class deh extends ddt<dge> {
   public deh(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      int $$1 = 0;
      chp $$2 = $$0.b();
      gt $$3 = $$0.e();
      amn $$4 = $$0.d();
      int $$5 = $$2.a(dar.a.d, $$3.u(), $$3.w());
      gt $$6 = new gt($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(cju.C)) {
         cvo $$7 = cju.kO.m();
         cvo $$8 = cju.kP.m();
         int $$9 = 1 + $$4.a(10);

         for(int $$10 = 0; $$10 <= $$9; ++$$10) {
            if ($$2.a_($$6).a(cju.C) && $$2.a_($$6.b()).a(cju.C) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(cnn.d, Integer.valueOf($$4.a(4) + 20)), 2);
                  ++$$1;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               gt $$11 = $$6.c();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.c()).a(cju.kO)) {
                  $$2.a($$11, $$7.a(cnn.d, Integer.valueOf($$4.a(4) + 20)), 2);
                  ++$$1;
               }
               break;
            }

            $$6 = $$6.b();
         }
      }

      return $$1 > 0;
   }
}
