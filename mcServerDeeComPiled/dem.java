import com.mojang.serialization.Codec;

public class dem extends ddt<dgd> {
   public dem(Codec<dgd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgd> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      cvo $$3 = $$1.a_($$2.c());
      dgd $$4 = $$0.f();
      amn $$5 = $$0.d();
      if (!$$3.a(akl.aC)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.u_() + 1 && $$6 + 1 < $$1.ah()) {
            int $$7 = 0;

            for(int $$8 = 0; $$8 < $$4.d * $$4.d; ++$$8) {
               gt $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               cvo $$10 = $$4.b.a($$5, $$9);
               if ($$1.x($$9) && $$9.v() > $$1.u_() && $$10.a($$1, $$9)) {
                  $$1.a($$9, $$10, 2);
                  ++$$7;
               }
            }

            return $$7 > 0;
         } else {
            return false;
         }
      }
   }
}
