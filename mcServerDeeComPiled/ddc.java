import com.mojang.serialization.Codec;

public class ddc extends ddt<dfp> {
   public ddc(Codec<dfp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dfp> $$0) {
      gt $$1 = $$0.e();
      chp $$2 = $$0.b();
      amn $$3 = $$0.d();
      dfp $$4 = $$0.f();
      if ($$1.v() < $$2.u_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for(gt $$7 : gt.a($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
            int $$8 = $$1.u() - $$7.u();
            int $$9 = $$1.w() - $$7.w();
            if ((float)($$8 * $$8 + $$9 * $$9) <= $$3.i() * 10.0F - $$3.i() * 6.0F) {
               this.a($$2, $$7, $$3, $$4);
            } else if ((double)$$3.i() < 0.031) {
               this.a($$2, $$7, $$3, $$4);
            }
         }

         return true;
      }
   }

   private boolean a(cgy $$0, gt $$1, amn $$2) {
      gt $$3 = $$1.c();
      cvo $$4 = $$0.a_($$3);
      return $$4.a(cju.jq) ? $$2.h() : $$4.d($$0, $$3, gy.b);
   }

   private void a(cgy $$0, gt $$1, amn $$2, dfp $$3) {
      if ($$0.x($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }

   }
}
