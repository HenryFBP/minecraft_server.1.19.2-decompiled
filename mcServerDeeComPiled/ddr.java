import com.mojang.serialization.Codec;

public class ddr extends ddt<dge> {
   public ddr(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      chp $$1 = $$0.b();
      amn $$2 = $$0.d();
      gt $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for(int $$5 = 0; $$4 > 0.5F; --$$5) {
         for(int $$6 = ami.d(-$$4); $$6 <= ami.f($$4); ++$$6) {
            for(int $$7 = ami.d(-$$4); $$7 <= ami.f($$4); ++$$7) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), cju.eG.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
