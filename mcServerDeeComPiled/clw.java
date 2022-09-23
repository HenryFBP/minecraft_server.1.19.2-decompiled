import javax.annotation.Nullable;

public class clw extends cjg {
   protected clw(cvn.c $$0) {
      super($$0);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cup($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$2, ctk.u, $$0.y ? cup::a : cup::b);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      cti $$4 = $$1.c_($$2);
      if ($$4 instanceof cup) {
         int $$5 = ((cup)$$4).g();

         for(int $$6 = 0; $$6 < $$5; ++$$6) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(io.W, $$7, $$8, $$9, $$10, $$11, $$12);
         }

      }
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return cax.b;
   }

   @Override
   public boolean a(cvo $$0, dpu $$1) {
      return false;
   }
}
