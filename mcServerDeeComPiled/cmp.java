import javax.annotation.Nullable;

public class cmp extends cio {
   protected cmp(cvn.c $$0) {
      super($$0);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cty($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$0, $$2, ctk.a);
   }

   @Override
   protected void a(cgx $$0, gt $$1, buc $$2) {
      cti $$3 = $$0.c_($$1);
      if ($$3 instanceof cty) {
         $$2.a((bam)$$3);
         $$2.a(akg.am);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, ajw.hi, ajx.e, 1.0F, 1.0F, false);
         }

         gy $$7 = $$0.c(a);
         gy.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == gy.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == gy.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(io.Y, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(io.C, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
