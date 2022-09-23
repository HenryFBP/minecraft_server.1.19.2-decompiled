import java.util.Optional;

public class cal extends cat {
   private final bbr<? extends bqn> a;

   public cal(bbr<? extends bqn> $$0, cat.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public baj a(ccz $$0) {
      gt $$1 = $$0.a();
      gy $$2 = $$0.k();
      gt $$3 = $$1.a($$2);
      buc $$4 = $$0.o();
      cax $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return baj.e;
      } else {
         cgx $$6 = $$0.q();
         bqn $$8;
         if (this.a == bbr.am) {
            Optional<bqq> $$7 = bqq.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return baj.b;
            }

            $$8 = (bqn)$$7.get();
         } else if (this.a == bbr.U) {
            $$8 = new bqo($$6, $$3, $$2);
         } else {
            if (this.a != bbr.K) {
               return baj.a($$6.y);
            }

            $$8 = new bqm($$6, $$3, $$2);
         }

         pj $$12 = $$5.u();
         if ($$12 != null) {
            bbr.a($$6, $$4, $$8, $$12);
         }

         if ($$8.r()) {
            if (!$$6.y) {
               $$8.u();
               $$6.a($$4, czv.s, $$8.cY());
               $$6.b($$8);
            }

            $$5.g(1);
            return baj.a($$6.y);
         } else {
            return baj.b;
         }
      }
   }

   protected boolean a(buc $$0, gy $$1, cax $$2, gt $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }
}
