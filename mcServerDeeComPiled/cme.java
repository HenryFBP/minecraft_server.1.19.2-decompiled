public class cme extends cjt implements cmd {
   public cme(cvn.c $$0) {
      super($$0);
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      $$1.a($$2, this, this.c());
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      $$3.a($$4, this, this.c());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (h($$1.a_($$2.c())) && $$2.v() >= $$1.u_()) {
         bqu $$4 = bqu.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(bqu $$0) {
   }

   protected int c() {
      return 2;
   }

   public static boolean h(cvo $$0) {
      dpz $$1 = $$0.d();
      return $$0.h() || $$0.a(akl.aB) || $$1.a() || $$1.e();
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$3.a(16) == 0) {
         gt $$4 = $$2.c();
         if (h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ig(io.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }

   }

   public int d(cvo $$0, cgd $$1, gt $$2) {
      return -16777216;
   }
}
