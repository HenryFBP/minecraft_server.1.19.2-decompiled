import com.mojang.serialization.Codec;

public class dew extends ddt<dgf> {
   private static final int a = 7;

   dew(Codec<dgf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgf> $$0) {
      chp $$1 = $$0.b();
      amn $$2 = $$0.d();
      dgf $$3 = $$0.f();
      gt $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      gt.a $$6 = new gt.a();

      for(int $$7 = 0; $$7 < $$5; ++$$7) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         cvo $$8 = $$1.a_($$6);

         for(dgf.a $$9 : $$3.b) {
            if (deo.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(gt.a $$0, amn $$1, gt $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(amn $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
