public class cld extends cjf {
   private final cjt b;

   protected cld(cjt $$0, cvn.c $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      this.a($$0, (cgy)$$1, $$2);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.b.m().a(c, Boolean.valueOf(false)).a(a, (gy)$$0.c(a)), 2);
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return cju.a.m();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, dpw.c, dpw.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
