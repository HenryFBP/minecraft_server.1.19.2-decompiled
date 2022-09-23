import javax.annotation.Nullable;

public class cqr extends cio {
   protected cqr(cvn.c $$0) {
      super($$0);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cum($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$0, $$2, ctk.A);
   }

   @Override
   protected void a(cgx $$0, gt $$1, buc $$2) {
      cti $$3 = $$0.c_($$1);
      if ($$3 instanceof cum) {
         $$2.a((bam)$$3);
         $$2.a(akg.at);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, ajw.tQ, ajx.e, 1.0F, 1.0F, false);
         }

         $$1.a(io.Y, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
