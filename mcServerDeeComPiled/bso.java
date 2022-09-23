public interface bso {
   int i_ = 10;

   int fJ();

   static boolean a(bcc $$0, bcc $$1) {
      float $$2 = (float)$$0.b(bdd.f);
      float $$3;
      if (!$$0.y_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.s.w.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      boolean $$5 = $$1.a(baw.c($$0), $$3);
      if ($$5) {
         $$0.a($$0, $$1);
         if (!$$0.y_()) {
            b($$0, $$1);
         }
      }

      return $$5;
   }

   static void b(bcc $$0, bcc $$1) {
      double $$2 = $$0.b(bdd.g);
      double $$3 = $$1.b(bdd.c);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.df() - $$0.df();
         double $$6 = $$1.dl() - $$0.dl();
         float $$7 = (float)($$0.s.w.a(21) - 10);
         double $$8 = $$4 * (double)($$0.s.w.i() * 0.5F + 0.2F);
         dwq $$9 = new dwq($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.s.w.i() * 0.5;
         $$1.i($$9.c, $$10, $$9.e);
         $$1.D = true;
      }
   }
}
