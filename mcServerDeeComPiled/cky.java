public class cky extends cme {
   private final cvo a;

   public cky(cjt $$0, cvn.c $$1) {
      super($$1);
      this.a = $$0.m();
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, cvo $$3, bqu $$4) {
      if (b($$0, $$1, $$3)) {
         $$0.a($$1, this.a, 3);
      }

   }

   @Override
   public cvo a(ccx $$0) {
      cgd $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      return b($$1, $$2, $$3) ? this.a : super.a($$0);
   }

   private static boolean b(cgd $$0, gt $$1, cvo $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cgd $$0, gt $$1) {
      boolean $$2 = false;
      gt.a $$3 = $$1.i();

      for(gy $$4 : gy.values()) {
         cvo $$5 = $$0.a_($$3);
         if ($$4 != gy.a || n($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (n($$5) && !$$5.d($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean n(cvo $$0) {
      return $$0.p().a(akp.a);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return a($$3, $$4) ? this.a : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
