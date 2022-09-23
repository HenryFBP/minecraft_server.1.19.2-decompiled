import com.mojang.serialization.Codec;

public class dfa extends ddt<dgp> {
   public dfa(Codec<dgp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgp> $$0) {
      dgp $$1 = $$0.f();
      chp $$2 = $$0.b();
      gt $$3 = $$0.e();
      cvo $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof clr) {
            if (!$$2.x($$3.b())) {
               return false;
            }

            clr.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
