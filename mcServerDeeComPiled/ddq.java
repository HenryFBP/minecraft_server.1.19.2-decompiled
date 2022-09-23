import com.mojang.serialization.Codec;

public class ddq extends ddt<dfw> {
   public ddq(Codec<dfw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dfw> $$0) {
      gt $$1 = $$0.e();
      chp $$2 = $$0.b();
      dfw $$3 = $$0.f();

      for(gt $$4 : gt.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            gt $$9 = $$4.h();
            this.a($$2, $$9, cju.jr.m());
            $$3.b().ifPresent($$3x -> {
               cti $$4x = $$2.c_($$9);
               if ($$4x instanceof cup $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }

            });
         } else if ($$6) {
            this.a($$2, $$4, cju.a.m());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, cju.B.m());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, cju.B.m());
         } else {
            this.a($$2, $$4, cju.a.m());
         }
      }

      return true;
   }
}
