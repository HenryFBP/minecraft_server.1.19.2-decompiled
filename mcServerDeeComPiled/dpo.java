import java.util.Locale;
import org.apache.commons.lang3.mutable.MutableInt;

public final class dpo extends dpj<dpp.a, dpp> {
   private static final gy[] f = gy.values();
   private static final gy[] g = new gy[]{gy.c, gy.d, gy.e, gy.f};

   public dpo(cxv $$0) {
      super($$0, chg.a, new dpp($$0));
   }

   @Override
   protected int b(long $$0, long $$1, int $$2) {
      if ($$1 == Long.MAX_VALUE || $$0 == Long.MAX_VALUE) {
         return 15;
      } else if ($$2 >= 15) {
         return $$2;
      } else {
         MutableInt $$3 = new MutableInt();
         cvo $$4 = this.a($$1, $$3);
         if ($$3.getValue() >= 15) {
            return 15;
         } else {
            int $$5 = gt.a($$0);
            int $$6 = gt.b($$0);
            int $$7 = gt.c($$0);
            int $$8 = gt.a($$1);
            int $$9 = gt.b($$1);
            int $$10 = gt.c($$1);
            int $$11 = Integer.signum($$8 - $$5);
            int $$12 = Integer.signum($$9 - $$6);
            int $$13 = Integer.signum($$10 - $$7);
            gy $$14 = gy.a($$11, $$12, $$13);
            if ($$14 == null) {
               throw new IllegalStateException(String.format(Locale.ROOT, "Light was spread in illegal direction %d, %d, %d", $$11, $$12, $$13));
            } else {
               cvo $$15 = this.a($$0, null);
               dxj $$16 = this.a($$15, $$0, $$14);
               dxj $$17 = this.a($$4, $$1, $$14.g());
               if (dxg.b($$16, $$17)) {
                  return 15;
               } else {
                  boolean $$18 = $$5 == $$8 && $$7 == $$10;
                  boolean $$19 = $$18 && $$6 > $$9;
                  return $$19 && $$2 == 0 && $$3.getValue() == 0 ? 0 : $$2 + Math.max(1, $$3.getValue());
               }
            }
         }
      }
   }

   @Override
   protected void a(long $$0, int $$1, boolean $$2) {
      long $$3 = hq.e($$0);
      int $$4 = gt.b($$0);
      int $$5 = hq.b($$4);
      int $$6 = hq.a($$4);
      int $$7;
      if ($$5 != 0) {
         $$7 = 0;
      } else {
         int $$8 = 0;

         while(!this.d.g(hq.a($$3, 0, -$$8 - 1, 0)) && this.d.a($$6 - $$8 - 1)) {
            ++$$8;
         }

         $$7 = $$8;
      }

      long $$10 = gt.a($$0, 0, -1 - $$7 * 16, 0);
      long $$11 = hq.e($$10);
      if ($$3 == $$11 || this.d.g($$11)) {
         this.b($$0, $$10, $$1, $$2);
      }

      long $$12 = gt.a($$0, gy.b);
      long $$13 = hq.e($$12);
      if ($$3 == $$13 || this.d.g($$13)) {
         this.b($$0, $$12, $$1, $$2);
      }

      for(gy $$14 : g) {
         int $$15 = 0;

         while(true) {
            long $$16 = gt.a($$0, $$14.j(), -$$15, $$14.l());
            long $$17 = hq.e($$16);
            if ($$3 == $$17) {
               this.b($$0, $$16, $$1, $$2);
               break;
            }

            if (this.d.g($$17)) {
               long $$18 = gt.a($$0, 0, -$$15, 0);
               this.b($$18, $$16, $$1, $$2);
            }

            if (++$$15 > $$7 * 16) {
               break;
            }
         }
      }

   }

   @Override
   protected int a(long $$0, long $$1, int $$2) {
      int $$3 = $$2;
      long $$4 = hq.e($$0);
      cxo $$5 = this.d.a($$4, true);

      for(gy $$6 : f) {
         long $$7 = gt.a($$0, $$6);
         if ($$7 != $$1) {
            long $$8 = hq.e($$7);
            cxo $$9;
            if ($$4 == $$8) {
               $$9 = $$5;
            } else {
               $$9 = this.d.a($$8, true);
            }

            int $$11;
            if ($$9 != null) {
               $$11 = this.a($$9, $$7);
            } else {
               if ($$6 == gy.a) {
                  continue;
               }

               $$11 = 15 - this.d.e($$7, true);
            }

            int $$13 = this.b($$7, $$0, $$11);
            if ($$3 > $$13) {
               $$3 = $$13;
            }

            if ($$3 == 0) {
               return $$3;
            }
         }
      }

      return $$3;
   }

   @Override
   protected void f(long $$0) {
      this.d.d();
      long $$1 = hq.e($$0);
      if (this.d.g($$1)) {
         super.f($$0);
      } else {
         for($$0 = gt.e($$0); !this.d.g($$1) && !this.d.m($$1); $$0 = gt.a($$0, 0, 16, 0)) {
            $$1 = hq.a($$1, gy.b);
         }

         if (this.d.g($$1)) {
            super.f($$0);
         }
      }

   }

   @Override
   public String b(long $$0) {
      return super.b($$0) + (this.d.m($$0) ? "*" : "");
   }
}
