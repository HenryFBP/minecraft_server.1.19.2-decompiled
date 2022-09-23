import com.mojang.serialization.Codec;

public class dfj extends ddt<dge> {
   public dfj(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      $$0.f();
      if (!$$1.x($$2)) {
         return false;
      } else {
         for(gy $$3 : gy.values()) {
            if ($$3 != gy.a && csc.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cju.em.m().a(csc.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
