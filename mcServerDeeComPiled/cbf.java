public class cbf extends cat {
   private static final hz a = new hy() {
      private final hy c = new hy();

      @Override
      public cax a(gu $$0, cax $$1) {
         gy $$2 = $$0.e().c(clo.a);
         cgx $$3 = $$0.g();
         double $$4 = $$0.a() + (double)$$2.j() * 1.125;
         double $$5 = Math.floor($$0.b()) + (double)$$2.k();
         double $$6 = $$0.c() + (double)$$2.l() * 1.125;
         gt $$7 = $$0.d().a($$2);
         cvo $$8 = $$3.a_($$7);
         cws $$9 = $$8.b() instanceof cjj ? $$8.c(((cjj)$$8.b()).c()) : cws.a;
         double $$10;
         if ($$8.a(akl.J)) {
            if ($$9.b()) {
               $$10 = 0.6;
            } else {
               $$10 = 0.1;
            }
         } else {
            if (!$$8.h() || !$$3.a_($$7.c()).a(akl.J)) {
               return this.c.dispense($$0, $$1);
            }

            cvo $$12 = $$3.a_($$7.c());
            cws $$13 = $$12.b() instanceof cjj ? $$12.c(((cjj)$$12.b()).c()) : cws.a;
            if ($$2 != gy.a && $$13.b()) {
               $$10 = -0.4;
            } else {
               $$10 = -0.9;
            }
         }

         bvt $$17 = bvt.a($$3, $$4, $$5 + $$10, $$6, ((cbf)$$1.c()).b);
         if ($$1.z()) {
            $$17.b($$1.x());
         }

         $$3.b($$17);
         $$1.g(1);
         return $$1;
      }

      @Override
      protected void a(gu $$0) {
         $$0.g().c(1000, $$0.d(), 0);
      }
   };
   final bvt.a b;

   public cbf(bvt.a $$0, cat.a $$1) {
      super($$1);
      this.b = $$0;
      clo.a(this, a);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      if (!$$3.a(akl.J)) {
         return baj.e;
      } else {
         cax $$4 = $$0.n();
         if (!$$1.y) {
            cws $$5 = $$3.b() instanceof cjj ? $$3.c(((cjj)$$3.b()).c()) : cws.a;
            double $$6 = 0.0;
            if ($$5.b()) {
               $$6 = 0.5;
            }

            bvt $$7 = bvt.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.z()) {
               $$7.b($$4.x());
            }

            $$1.b($$7);
            $$1.a(czv.s, $$2, czv.a.a($$0.o(), $$1.a_($$2.c())));
         }

         $$4.g(1);
         return baj.a($$1.y);
      }
   }
}
