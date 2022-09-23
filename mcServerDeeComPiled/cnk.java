public class cnk extends clg {
   protected cnk(cvn.c $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.k(
         this.D
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cvo a(ccx $$0) {
      cgd $$1 = $$0.q();
      gt $$2 = $$0.a();
      dpv $$3 = $$0.q().b_($$0.a());
      gt $$4 = $$2.d();
      gt $$5 = $$2.e();
      gt $$6 = $$2.f();
      gt $$7 = $$2.g();
      cvo $$8 = $$1.a_($$4);
      cvo $$9 = $$1.a_($$5);
      cvo $$10 = $$1.a_($$6);
      cvo $$11 = $$1.a_($$7);
      return this.m()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, gy.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, gy.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, gy.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, gy.e))))
         .a(e, Boolean.valueOf($$3.a() == dpw.c));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$1.o().d() ? $$0.a((cwr)f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dxj b(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return dxg.a();
   }

   @Override
   public boolean a(cvo $$0, cvo $$1, gy $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c((cwr)f.get($$2)) && $$1.c((cwr)f.get($$2.g()))) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public final boolean a(cvo $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof cnk || $$0.a(akl.H);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
