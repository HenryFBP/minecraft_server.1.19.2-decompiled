import javax.annotation.Nullable;

public class cks extends cjt {
   public static final int a = 5;
   public static final cwo b = cwe.au;
   private final ckt c;

   protected cks(ckt $$0, cvn.c $$1) {
      super($$1);
      this.c = $$0;
      this.k(this.D.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }

   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.c(b) < 5;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      gt $$4 = $$2.b();
      if ($$1.x($$4) && $$4.v() < $$1.ah()) {
         int $$5 = $$0.c(b);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            cvo $$8 = $$1.a_($$2.c());
            if ($$8.a(cju.eG)) {
               $$6 = true;
            } else if ($$8.a(this.c)) {
               int $$9 = 1;

               for(int $$10 = 0; $$10 < 4; ++$$10) {
                  cvo $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.c)) {
                     if ($$11.a(cju.eG)) {
                        $$7 = true;
                     }
                     break;
                  }

                  ++$$9;
               }

               if ($$9 < 2 || $$9 <= $$3.a($$7 ? 5 : 4)) {
                  $$6 = true;
               }
            } else if ($$8.h()) {
               $$6 = true;
            }

            if ($$6 && b($$1, $$4, null) && $$1.x($$2.b(2))) {
               $$1.a($$2, this.c.a($$1, $$2), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  ++$$12;
               }

               boolean $$13 = false;

               for(int $$14 = 0; $$14 < $$12; ++$$14) {
                  gy $$15 = gy.c.a.a($$3);
                  gt $$16 = $$2.a($$15);
                  if ($$1.x($$16) && $$1.x($$16.c()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, this.c.a($$1, $$2), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }

         }
      }
   }

   private void a(cgx $$0, gt $$1, int $$2) {
      $$0.a($$1, this.m().a(b, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(cgx $$0, gt $$1) {
      $$0.a($$1, this.m().a(b, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(cha $$0, gt $$1, @Nullable gy $$2) {
      for(gy $$3 : gy.c.a) {
         if ($$3 != $$2 && !$$0.x($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 != gy.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2.c());
      if (!$$3.a(this.c) && !$$3.a(cju.eG)) {
         if (!$$3.h()) {
            return false;
         } else {
            boolean $$4 = false;

            for(gy $$5 : gy.c.a) {
               cvo $$6 = $$1.a_($$2.a($$5));
               if ($$6.a(this.c)) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (!$$6.h()) {
                  return false;
               }
            }

            return $$4;
         }
      } else {
         return true;
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   public static void a(cgy $$0, gt $$1, amn $$2, int $$3) {
      $$0.a($$1, ((ckt)cju.jj).a($$0, $$1), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(cgy $$0, gt $$1, amn $$2, gt $$3, int $$4, int $$5) {
      ckt $$6 = (ckt)cju.jj;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         ++$$7;
      }

      for(int $$8 = 0; $$8 < $$7; ++$$8) {
         gt $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, $$6.a($$0, $$9), 2);
         $$0.a($$9.c(), $$6.a($$0, $$9.c()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            ++$$11;
         }

         for(int $$12 = 0; $$12 < $$11; ++$$12) {
            gy $$13 = gy.c.a.a($$2);
            gt $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.x($$14) && $$0.x($$14.c()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, $$6.a($$0, $$14), 2);
               $$0.a($$14.a($$13.g()), $$6.a($$0, $$14.a($$13.g())), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), cju.jk.m().a(b, Integer.valueOf(5)), 2);
      }

   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      gt $$4 = $$2.a();
      if (!$$0.y && $$3.a($$0, $$4) && $$3.ad().a(akn.e)) {
         $$0.a($$4, true, $$3);
      }

   }
}
