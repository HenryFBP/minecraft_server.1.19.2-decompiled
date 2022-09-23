public class csr extends cjt {
   protected csr(cvn.c $$0) {
      super($$0);
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if ($$1.q_().i()) {
         $$1.a($$2, cju.aB.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, ajw.go, ajx.e, 1.0F, (1.0F + $$1.r_().i() * 0.2F) * 0.7F);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      gy $$4 = gy.b($$3);
      if ($$4 != gy.b) {
         gt $$5 = $$2.a($$4);
         cvo $$6 = $$1.a_($$5);
         if (!$$0.m() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == gy.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == gy.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == gy.f) {
                     ++$$7;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == gy.d) {
                     ++$$9;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(io.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
