import com.mojang.serialization.Codec;

public class dfm extends ddt<dge> {
   private static final gy[] a = gy.values();

   public dfm(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      amn $$3 = $$0.d();
      if (!$$1.x($$2)) {
         return false;
      } else {
         cvo $$4 = $$1.a_($$2.b());
         if (!$$4.a(cju.df) && !$$4.a(cju.jw)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(cgy $$0, amn $$1, gt $$2) {
      $$0.a($$2, cju.jw.m(), 2);
      gt.a $$3 = new gt.a();
      gt.a $$4 = new gt.a();

      for(int $$5 = 0; $$5 < 200; ++$$5) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.x($$3)) {
            int $$6 = 0;

            for(gy $$7 : a) {
               cvo $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(cju.df) || $$8.a(cju.jw)) {
                  ++$$6;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, cju.jw.m(), 2);
            }
         }
      }

   }

   private void b(cgy $$0, amn $$1, gt $$2) {
      gt.a $$3 = new gt.a();

      for(int $$4 = 0; $$4 < 100; ++$$4) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.x($$3)) {
            cvo $$5 = $$0.a_($$3.b());
            if ($$5.a(cju.df) || $$5.a(cju.jw)) {
               int $$6 = ami.a($$1, 1, 8);
               if ($$1.a(6) == 0) {
                  $$6 *= 2;
               }

               if ($$1.a(5) == 0) {
                  $$6 = 1;
               }

               int $$7 = 17;
               int $$8 = 25;
               a($$0, $$1, $$3, $$6, 17, 25);
            }
         }
      }

   }

   public static void a(cgy $$0, amn $$1, gt.a $$2, int $$3, int $$4, int $$5) {
      for(int $$6 = 0; $$6 <= $$3; ++$$6) {
         if ($$0.x($$2)) {
            if ($$6 == $$3 || !$$0.x($$2.c())) {
               $$0.a($$2, cju.nk.m().a(cmz.d, Integer.valueOf(ami.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, cju.nl.m(), 2);
         }

         $$2.c(gy.a);
      }

   }
}
