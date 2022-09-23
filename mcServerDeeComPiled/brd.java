import javax.annotation.Nullable;

public interface brd extends bru {
   void b(boolean var1);

   void a(bcc var1, cax var2, buu var3, float var4);

   @Nullable
   bcc G();

   void a();

   default void b(bcc $$0, float $$1) {
      bai $$2 = buv.a($$0, caz.tM);
      cax $$3 = $$0.b($$2);
      if ($$0.b(caz.tM)) {
         bzk.a($$0.s, $$0, $$2, $$3, $$1, (float)(14 - $$0.s.ag().a() * 4));
      }

      this.a();
   }

   default void a(bcc $$0, bcc $$1, buu $$2, float $$3, float $$4) {
      double $$6 = $$1.df() - $$0.df();
      double $$7 = $$1.dl() - $$0.dl();
      double $$8 = Math.sqrt($$6 * $$6 + $$7 * $$7);
      double $$9 = $$1.e(0.3333333333333333) - $$2.dh() + $$8 * 0.2F;
      k $$10 = this.a($$0, new dwq($$6, $$9, $$7), $$3);
      $$2.c((double)$$10.a(), (double)$$10.b(), (double)$$10.c(), $$4, (float)(14 - $$0.s.ag().a() * 4));
      $$0.a(ajw.dX, 1.0F, 1.0F / ($$0.dQ().i() * 0.4F + 0.8F));
   }

   default k a(bcc $$0, dwq $$1, float $$2) {
      dwq $$3 = $$1.d();
      dwq $$4 = $$3.c(new dwq(0.0, 1.0, 0.0));
      if ($$4.g() <= 1.0E-7) {
         $$4 = $$3.c($$0.h(1.0F));
      }

      g $$5 = new g(new k($$4), 90.0F, true);
      k $$6 = new k($$3);
      $$6.a($$5);
      g $$7 = new g($$6, $$2, true);
      k $$8 = new k($$3);
      $$8.a($$7);
      return $$8;
   }
}
