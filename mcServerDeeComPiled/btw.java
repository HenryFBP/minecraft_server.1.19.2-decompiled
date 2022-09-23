import java.util.Optional;
import javax.annotation.Nullable;

public class btw implements cgk {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final amn h = amn.a();
   private final drv i;
   private int j;
   private int k;
   private int l;

   public btw(drv $$0) {
      this.i = $$0;
      this.j = 1200;
      this.k = $$0.v();
      this.l = $$0.w();
      if (this.k == 0 && this.l == 0) {
         this.k = 24000;
         $$0.g(this.k);
         this.l = 25;
         $$0.h(this.l);
      }

   }

   @Override
   public int a(agg $$0, boolean $$1, boolean $$2) {
      if (!$$0.W().b(cgt.G)) {
         return 0;
      } else if (--this.j > 0) {
         return 0;
      } else {
         this.j = 1200;
         this.k -= 1200;
         this.i.g(this.k);
         if (this.k > 0) {
            return 0;
         } else {
            this.k = 24000;
            if (!$$0.W().b(cgt.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = ami.a(this.l + 25, 25, 75);
               this.i.h(this.l);
               if (this.h.a(100) > $$3) {
                  return 0;
               } else if (this.a($$0)) {
                  this.l = 25;
                  return 1;
               } else {
                  return 0;
               }
            }
         }
      }
   }

   private boolean a(agg $$0) {
      buc $$1 = $$0.i();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         gt $$2 = $$1.da();
         int $$3 = 48;
         bms $$4 = $$0.x();
         Optional<gt> $$5 = $$4.d($$0x -> $$0x.a(bmw.o), $$0x -> true, $$2, 48, bms.b.c);
         gt $$6 = (gt)$$5.orElse($$2);
         gt $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.w($$7).a(akk.ad)) {
               return false;
            }

            btv $$8 = bbr.bb.a($$0, null, null, null, $$7, bcg.h, false, false);
            if ($$8 != null) {
               for(int $$9 = 0; $$9 < 2; ++$$9) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.co());
               $$8.u(48000);
               $$8.g($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(agg $$0, btv $$1, int $$2) {
      gt $$3 = this.a($$0, $$1.da(), $$2);
      if ($$3 != null) {
         bpi $$4 = bbr.aV.a($$0, null, null, null, $$3, bcg.h, false, false);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private gt a(cha $$0, gt $$1, int $$2) {
      gt $$3 = null;

      for(int $$4 = 0; $$4 < 10; ++$$4) {
         int $$5 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$6 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$0.a(dar.a.b, $$5, $$6);
         gt $$8 = new gt($$5, $$7, $$6);
         if (chi.a(bcv.c.a, $$0, $$8, bbr.bb)) {
            $$3 = $$8;
            break;
         }
      }

      return $$3;
   }

   private boolean a(cgd $$0, gt $$1) {
      for(gt $$2 : gt.a($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).k($$0, $$2).b()) {
            return false;
         }
      }

      return true;
   }
}
