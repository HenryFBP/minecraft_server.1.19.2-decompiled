public class coc extends cjt {
   private static final int a = 20;

   public coc(cvn.c $$0) {
      super($$0);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bbn $$3) {
      if (!$$3.bM() && $$3 instanceof bcc && !cet.j((bcc)$$3)) {
         $$3.a(baw.e, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      cjx.b($$1, $$2.b(), $$0);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == gy.b && $$2.a(cju.C)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      gt $$4 = $$2.b();
      if ($$1.b_($$2).a(akp.a)) {
         $$1.a(null, $$2, ajw.go, ajx.e, 0.5F, 2.6F + ($$1.w.i() - $$1.w.i()) * 0.8F);
         $$1.a(io.R, (double)$$4.u() + 0.5, (double)$$4.v() + 0.25, (double)$$4.w() + 0.5, 8, 0.5, 0.25, 0.5, 0.0);
      }

   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
