public class hx extends hy {
   private final hy c = new hy();
   private final bvv.b d;
   private final boolean e;

   public hx(bvv.b $$0) {
      this($$0, false);
   }

   public hx(bvv.b $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public cax a(gu $$0, cax $$1) {
      gy $$2 = $$0.e().c(clo.a);
      cgx $$3 = $$0.g();
      double $$4 = $$0.a() + (double)((float)$$2.j() * 1.125F);
      double $$5 = $$0.b() + (double)((float)$$2.k() * 1.125F);
      double $$6 = $$0.c() + (double)((float)$$2.l() * 1.125F);
      gt $$7 = $$0.d().a($$2);
      double $$8;
      if ($$3.b_($$7).a(akp.a)) {
         $$8 = 1.0;
      } else {
         if (!$$3.a_($$7).h() || !$$3.b_($$7.c()).a(akp.a)) {
            return this.c.dispense($$0, $$1);
         }

         $$8 = 0.0;
      }

      bvv $$11 = (bvv)(this.e ? new bvw($$3, $$4, $$5 + $$8, $$6) : new bvv($$3, $$4, $$5 + $$8, $$6));
      $$11.a(this.d);
      $$11.o($$2.p());
      $$3.b($$11);
      $$1.g(1);
      return $$1;
   }

   @Override
   protected void a(gu $$0) {
      $$0.g().c(1000, $$0.d(), 0);
   }
}
