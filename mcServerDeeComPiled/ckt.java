public class ckt extends cox {
   protected ckt(cvn.c $$0) {
      super(0.3125F, $$0);
      this.k(
         this.D
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
      );
   }

   @Override
   public cvo a(ccx $$0) {
      return this.a($$0.q(), $$0.a());
   }

   public cvo a(cgd $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1.c());
      cvo $$3 = $$0.a_($$1.b());
      cvo $$4 = $$0.a_($$1.d());
      cvo $$5 = $$0.a_($$1.g());
      cvo $$6 = $$0.a_($$1.e());
      cvo $$7 = $$0.a_($$1.f());
      return this.m()
         .a(f, Boolean.valueOf($$2.a(this) || $$2.a(cju.jk) || $$2.a(cju.eG)))
         .a(e, Boolean.valueOf($$3.a(this) || $$3.a(cju.jk)))
         .a(a, Boolean.valueOf($$4.a(this) || $$4.a(cju.jk)))
         .a(b, Boolean.valueOf($$5.a(this) || $$5.a(cju.jk)))
         .a(c, Boolean.valueOf($$6.a(this) || $$6.a(cju.jk)))
         .a(d, Boolean.valueOf($$7.a(this) || $$7.a(cju.jk)));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cju.jk) || $$1 == gy.a && $$2.a(cju.eG);
         return $$0.a((cwr)g.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }

   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2.c());
      boolean $$4 = !$$1.a_($$2.b()).h() && !$$3.h();

      for(gy $$5 : gy.c.a) {
         gt $$6 = $$2.a($$5);
         cvo $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            cvo $$8 = $$1.a_($$6.c());
            if ($$8.a(this) || $$8.a(cju.eG)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cju.eG);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c, d, e, f);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
