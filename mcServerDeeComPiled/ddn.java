import com.mojang.serialization.Codec;

public class ddn extends ddt<dfu> {
   public ddn(Codec<dfu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dfu> $$0) {
      dfu $$1 = $$0.f();
      gt $$2 = $$0.e();
      chp $$3 = $$0.b();
      amn $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      gt.a $$10 = new gt.a();

      for(gt $$11 : gt.a($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(dfu $$0, chp $$1, amn $$2, int $$3, int $$4, gt.a $$5) {
      boolean $$6 = false;
      cvo $$7 = null;

      for(int $$8 = $$3; $$8 > $$4; --$$8) {
         $$5.q($$8);
         if ($$0.b().test($$1, $$5)) {
            cvo $$9 = $$0.a().a($$1, $$2, $$5);
            $$1.a($$5, $$9, 2);
            this.a($$1, $$5);
            $$6 = true;
         }
      }

      return $$6;
   }
}
