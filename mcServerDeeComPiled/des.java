import com.mojang.serialization.Codec;

public class des extends ddt<dgj> {
   public des(Codec<dgj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgj> $$0) {
      dgj $$1 = $$0.f();
      amn $$2 = $$0.d();
      chp $$3 = $$0.b();
      cxk $$4 = $$0.c();
      gt $$5 = $$0.e();

      for(dfn $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return ((dkg)$$1.c.a()).a($$3, $$4, $$2, $$5);
   }
}
