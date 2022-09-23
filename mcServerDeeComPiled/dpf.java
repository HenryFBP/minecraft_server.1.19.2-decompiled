import org.apache.commons.lang3.mutable.MutableInt;

public final class dpf extends dpj<dpg.a, dpg> {
   private static final gy[] f = gy.values();
   private final gt.a g = new gt.a();

   public dpf(cxv $$0) {
      super($$0, chg.b, new dpg($$0));
   }

   private int d(long $$0) {
      int $$1 = gt.a($$0);
      int $$2 = gt.b($$0);
      int $$3 = gt.c($$0);
      cgd $$4 = this.b.c(hq.a($$1), hq.a($$3));
      return $$4 != null ? $$4.h(this.g.d($$1, $$2, $$3)) : 0;
   }

   @Override
   protected int b(long $$0, long $$1, int $$2) {
      if ($$1 == Long.MAX_VALUE) {
         return 15;
      } else if ($$0 == Long.MAX_VALUE) {
         return $$2 + 15 - this.d($$1);
      } else if ($$2 >= 15) {
         return $$2;
      } else {
         int $$3 = Integer.signum(gt.a($$1) - gt.a($$0));
         int $$4 = Integer.signum(gt.b($$1) - gt.b($$0));
         int $$5 = Integer.signum(gt.c($$1) - gt.c($$0));
         gy $$6 = gy.a($$3, $$4, $$5);
         if ($$6 == null) {
            return 15;
         } else {
            MutableInt $$7 = new MutableInt();
            cvo $$8 = this.a($$1, $$7);
            if ($$7.getValue() >= 15) {
               return 15;
            } else {
               cvo $$9 = this.a($$0, null);
               dxj $$10 = this.a($$9, $$0, $$6);
               dxj $$11 = this.a($$8, $$1, $$6.g());
               return dxg.b($$10, $$11) ? 15 : $$2 + Math.max(1, $$7.getValue());
            }
         }
      }
   }

   @Override
   protected void a(long $$0, int $$1, boolean $$2) {
      long $$3 = hq.e($$0);

      for(gy $$4 : f) {
         long $$5 = gt.a($$0, $$4);
         long $$6 = hq.e($$5);
         if ($$3 == $$6 || this.d.g($$6)) {
            this.b($$0, $$5, $$1, $$2);
         }
      }

   }

   @Override
   protected int a(long $$0, long $$1, int $$2) {
      int $$3 = $$2;
      if (Long.MAX_VALUE != $$1) {
         int $$4 = this.b(Long.MAX_VALUE, $$0, 0);
         if ($$2 > $$4) {
            $$3 = $$4;
         }

         if ($$3 == 0) {
            return $$3;
         }
      }

      long $$5 = hq.e($$0);
      cxo $$6 = this.d.a($$5, true);

      for(gy $$7 : f) {
         long $$8 = gt.a($$0, $$7);
         if ($$8 != $$1) {
            long $$9 = hq.e($$8);
            cxo $$10;
            if ($$5 == $$9) {
               $$10 = $$6;
            } else {
               $$10 = this.d.a($$9, true);
            }

            if ($$10 != null) {
               int $$12 = this.b($$8, $$0, this.a($$10, $$8));
               if ($$3 > $$12) {
                  $$3 = $$12;
               }

               if ($$3 == 0) {
                  return $$3;
               }
            }
         }
      }

      return $$3;
   }

   @Override
   public void a(gt $$0, int $$1) {
      this.d.d();
      this.a(Long.MAX_VALUE, $$0.a(), 15 - $$1, true);
   }
}
