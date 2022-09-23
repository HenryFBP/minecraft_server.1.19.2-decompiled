import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bgz extends bha {
   private static final List<cat> a = ImmutableList.of(caz.nR, caz.tf);

   @Override
   protected void a(agg $$0, btp $$1) {
      Optional<hb> $$2 = $$1.dy().c(bku.c);
      if ($$2.isPresent()) {
         hb $$3 = (hb)$$2.get();
         cvo $$4 = $$0.a_($$3.b());
         if ($$4.a(cju.nN)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }

      }
   }

   private void a(agg $$0, btp $$1, hb $$2, cvo $$3) {
      gt $$4 = $$2.b();
      if ($$3.c(ckx.d) == 8) {
         $$3 = ckx.d($$3, $$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[a.size()];
      bao $$8 = $$1.t();
      int $$9 = $$8.b();
      cvo $$10 = $$3;

      for(int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; --$$11) {
         cax $$12 = $$8.a($$11);
         int $$13 = a.indexOf($$12.c());
         if ($$13 != -1) {
            int $$14 = $$12.K();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for(int $$17 = 0; $$17 < $$16; ++$$17) {
                  $$10 = ckx.a($$10, $$0, $$12, $$4);
                  if ($$10.c(ckx.d) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(agg $$0, cvo $$1, gt $$2, cvo $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(btp $$0) {
      bao $$1 = $$0.t();
      if ($$1.a_(caz.nT) <= 36) {
         int $$2 = $$1.a_(caz.nS);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(caz.nS, $$6);
            cax $$7 = $$1.a(new cax(caz.nT, $$5));
            if (!$$7.b()) {
               $$0.a($$7, 0.5F);
            }

         }
      }
   }
}
