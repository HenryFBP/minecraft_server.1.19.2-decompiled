import com.google.common.collect.ImmutableMap;

public class bdv<E extends bce & brd, T extends bcc> extends bdo<E> {
   private static final int a = 1200;
   private int d;
   private bdv.a e = bdv.a.a;

   public bdv() {
      super(ImmutableMap.of(bku.n, bkv.c, bku.o, bkv.a), 1200);
   }

   protected boolean a(agg $$0, E $$1) {
      bcc $$2 = a($$1);
      return $$1.b(caz.tM) && bdp.b($$1, $$2) && bdp.a($$1, $$2, 0);
   }

   protected boolean a(agg $$0, E $$1, long $$2) {
      return $$1.dy().a(bku.o) && this.a($$0, $$1);
   }

   protected void b(agg $$0, E $$1, long $$2) {
      bcc $$3 = a($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(agg $$0, E $$1, long $$2) {
      if ($$1.eT()) {
         $$1.eZ();
      }

      if ($$1.b(caz.tM)) {
         $$1.b(false);
         bzk.a($$1.eV(), false);
      }

   }

   private void a(E $$0, bcc $$1) {
      if (this.e == bdv.a.a) {
         $$0.c(buv.a($$0, caz.tM));
         this.e = bdv.a.b;
         $$0.b(true);
      } else if (this.e == bdv.a.b) {
         if (!$$0.eT()) {
            this.e = bdv.a.a;
         }

         int $$2 = $$0.eX();
         cax $$3 = $$0.eV();
         if ($$2 >= bzk.k($$3)) {
            $$0.eY();
            this.e = bdv.a.c;
            this.d = 20 + $$0.dQ().a(20);
            $$0.b(false);
         }
      } else if (this.e == bdv.a.c) {
         --this.d;
         if (this.d == 0) {
            this.e = bdv.a.d;
         }
      } else if (this.e == bdv.a.d) {
         $$0.a($$1, 1.0F);
         cax $$4 = $$0.b(buv.a($$0, caz.tM));
         bzk.a($$4, false);
         this.e = bdv.a.a;
      }

   }

   private void b(bce $$0, bcc $$1) {
      $$0.dy().a(bku.n, new bdy($$1, true));
   }

   private static bcc a(bcc $$0) {
      return (bcc)$$0.dy().c(bku.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
