import com.mojang.serialization.Codec;

public class der extends ddt<dgk> {
   public der(Codec<dgk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgk> $$0) {
      dgk $$1 = $$0.f();
      amn $$2 = $$0.d();
      gt $$3 = $$0.e();
      chp $$4 = $$0.b();
      int $$5 = 0;
      gt.a $$6 = new gt.a();
      int $$7 = $$1.b() + 1;
      int $$8 = $$1.c() + 1;

      for(int $$9 = 0; $$9 < $$1.a(); ++$$9) {
         $$6.a($$3, $$2.a($$7) - $$2.a($$7), $$2.a($$8) - $$2.a($$8), $$2.a($$7) - $$2.a($$7));
         if (((dkg)$$1.d().a()).a($$4, $$0.c(), $$2, $$6)) {
            ++$$5;
         }
      }

      return $$5 > 0;
   }
}
