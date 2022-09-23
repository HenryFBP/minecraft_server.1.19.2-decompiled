import com.mojang.serialization.Codec;

public class dez extends ddt<dgh> {
   public dez(Codec<dgh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgh> $$0) {
      boolean $$1 = false;
      amn $$2 = $$0.d();
      chp $$3 = $$0.b();
      gt $$4 = $$0.e();
      dgh $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dar.a.d, $$4.u() + $$6, $$4.w() + $$7);
      gt $$9 = new gt($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(cju.C)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         cvo $$11 = $$10 ? cju.bk.m() : cju.bj.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               cvo $$12 = $$11.a(crq.b, cwk.a);
               gt $$13 = $$9.b();
               if ($$3.a_($$13).a(cju.C)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
