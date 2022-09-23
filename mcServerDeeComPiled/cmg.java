public class cmg extends clg {
   private final dxj[] i;

   public cmg(cvn.c $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.k(
         this.D
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.i = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public dxj b_(cvo $$0, cgd $$1, gt $$2) {
      return this.i[this.g($$0)];
   }

   @Override
   public dxj b(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   public boolean a(cvo $$0, boolean $$1, gy $$2) {
      cjt $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cmh && cmh.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(cvo $$0) {
      return $$0.a(akl.O) && $$0.a(akl.j) == this.m().a(akl.j);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         cax $$6 = $$3.b($$4);
         return $$6.a(caz.sG) ? baj.a : baj.d;
      } else {
         return cbb.a($$3, $$1, $$2);
      }
   }

   @Override
   public cvo a(ccx $$0) {
      cgd $$1 = $$0.q();
      gt $$2 = $$0.a();
      dpv $$3 = $$0.q().b_($$0.a());
      gt $$4 = $$2.d();
      gt $$5 = $$2.g();
      gt $$6 = $$2.e();
      gt $$7 = $$2.f();
      cvo $$8 = $$1.a_($$4);
      cvo $$9 = $$1.a_($$5);
      cvo $$10 = $$1.a_($$6);
      cvo $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, gy.d), gy.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, gy.e), gy.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, gy.c), gy.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, gy.f), gy.f)))
         .a(e, Boolean.valueOf($$3.a() == dpw.c));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$1.o().e() == gy.c.a
         ? $$0.a((cwr)f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g())))
         : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
