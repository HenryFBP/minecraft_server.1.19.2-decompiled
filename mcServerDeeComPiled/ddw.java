import com.mojang.serialization.Codec;

public class ddw extends ddt<dgb> {
   public ddw(Codec<dgb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgb> $$0) {
      gt $$1 = $$0.e();
      dgb $$2 = $$0.f();
      chp $$3 = $$0.b();
      gt.a $$4 = new gt.a();

      for(int $$5 = 0; $$5 < 16; ++$$5) {
         for(int $$6 = 0; $$6 < 16; ++$$6) {
            int $$7 = $$1.u() + $$5;
            int $$8 = $$1.w() + $$6;
            int $$9 = $$3.u_() + $$2.b;
            $$4.d($$7, $$9, $$8);
            if ($$3.a_($$4).h()) {
               $$3.a($$4, $$2.c, 2);
            }
         }
      }

      return true;
   }
}
