import javax.annotation.Nullable;

public class cbq extends byx {
   public cbq(cjt $$0, cat.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public ccx b(ccx $$0) {
      gt $$1 = $$0.a();
      cgx $$2 = $$0.q();
      cvo $$3 = $$2.a_($$1);
      cjt $$4 = this.e();
      if (!$$3.a($$4)) {
         return cpz.a($$2, $$1) == 7 ? null : $$0;
      } else {
         gy $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == gy.b ? $$0.g() : gy.b;
         }

         int $$7 = 0;
         gt.a $$8 = $$1.i().c($$5);

         while($$7 < 7) {
            if (!$$2.y && !$$2.j($$8)) {
               buc $$9 = $$0.o();
               int $$10 = $$2.ah();
               if ($$9 instanceof agh && $$8.v() >= $$10) {
                  ((agh)$$9).b(rq.a("build.tooHigh", $$10 - 1).a(p.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.e())) {
               if ($$3.a($$0)) {
                  return ccx.a($$0, $$8, $$5);
               }
               break;
            }

            $$8.c($$5);
            if ($$5.o().d()) {
               ++$$7;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean d() {
      return false;
   }
}
