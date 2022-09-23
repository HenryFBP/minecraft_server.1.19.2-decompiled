public class hy implements hz {
   @Override
   public final cax dispense(gu $$0, cax $$1) {
      cax $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.e().c(clo.a));
      return $$2;
   }

   protected cax a(gu $$0, cax $$1) {
      gy $$2 = $$0.e().c(clo.a);
      hj $$3 = clo.a($$0);
      cax $$4 = $$1.a(1);
      a($$0.g(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(cgx $$0, cax $$1, int $$2, gy $$3, hj $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == gy.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      bqv $$8 = new bqv($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.w.j() * 0.1 + 0.2;
      $$8.n(
         $$0.w.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.w.a(0.2, 0.0172275 * (double)$$2),
         $$0.w.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(gu $$0) {
      $$0.g().c(1000, $$0.d(), 0);
   }

   protected void a(gu $$0, gy $$1) {
      $$0.g().c(2000, $$0.d(), $$1.d());
   }
}
