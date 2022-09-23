import com.mojang.serialization.Codec;

public class dcx extends ddt<dgh> {
   private static final cvo a = cju.lK.m().a(cix.g, Integer.valueOf(1)).a(cix.h, cwb.a).a(cix.i, Integer.valueOf(0));
   private static final cvo b = a.a(cix.h, cwb.c).a(cix.i, Integer.valueOf(1));
   private static final cvo c = a.a(cix.h, cwb.c);
   private static final cvo d = a.a(cix.h, cwb.b);

   public dcx(Codec<dgh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgh> $$0) {
      int $$1 = 0;
      gt $$2 = $$0.e();
      chp $$3 = $$0.b();
      amn $$4 = $$0.d();
      dgh $$5 = $$0.f();
      gt.a $$6 = $$2.i();
      gt.a $$7 = $$2.i();
      if ($$3.x($$6)) {
         if (cju.lK.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for(int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; ++$$10) {
                  for(int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; ++$$11) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dar.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cju.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for(int $$14 = 0; $$14 < $$8 && $$3.x($$6); ++$$14) {
               $$3.a($$6, a, 2);
               $$6.c(gy.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(gy.a, 1), c, 2);
               $$3.a($$6.c(gy.a, 1), d, 2);
            }
         }

         ++$$1;
      }

      return $$1 > 0;
   }
}
