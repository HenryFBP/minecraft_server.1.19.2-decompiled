import com.mojang.serialization.Codec;

public class deg extends ddt<dfq> {
   public deg(Codec<dfq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dfq> $$0) {
      gt $$1 = $$0.e();
      chp $$2 = $$0.b();
      $$1 = new gt($$1.u(), $$0.c().f(), $$1.w());
      amn $$3 = $$0.d();
      boolean $$4 = $$3.j() > 0.7;
      cvo $$5 = $$0.f().b;
      double $$6 = $$3.j() * 2.0 * Math.PI;
      int $$7 = 11 - $$3.a(5);
      int $$8 = 3 + $$3.a(3);
      boolean $$9 = $$3.j() > 0.7;
      int $$10 = 11;
      int $$11 = $$9 ? $$3.a(6) + 6 : $$3.a(15) + 3;
      if (!$$9 && $$3.j() > 0.9) {
         $$11 += $$3.a(19) + 7;
      }

      int $$12 = Math.min($$11 + $$3.a(11), 18);
      int $$13 = Math.min($$11 + $$3.a(7) - $$3.a(5), 11);
      int $$14 = $$9 ? $$7 : 11;

      for(int $$15 = -$$14; $$15 < $$14; ++$$15) {
         for(int $$16 = -$$14; $$16 < $$14; ++$$16) {
            for(int $$17 = 0; $$17 < $$11; ++$$17) {
               int $$18 = $$9 ? this.b($$17, $$11, $$13) : this.a($$3, $$17, $$11, $$13);
               if ($$9 || $$15 < $$18) {
                  this.a($$2, $$3, $$1, $$11, $$15, $$17, $$16, $$18, $$14, $$9, $$8, $$6, $$4, $$5);
               }
            }
         }
      }

      this.a($$2, $$1, $$13, $$11, $$9, $$7);

      for(int $$19 = -$$14; $$19 < $$14; ++$$19) {
         for(int $$20 = -$$14; $$20 < $$14; ++$$20) {
            for(int $$21 = -1; $$21 > -$$12; --$$21) {
               int $$22 = $$9 ? ami.f((float)$$14 * (1.0F - (float)Math.pow((double)$$21, 2.0) / ((float)$$12 * 8.0F))) : $$14;
               int $$23 = this.b($$3, -$$21, $$12, $$13);
               if ($$19 < $$23) {
                  this.a($$2, $$3, $$1, $$12, $$19, $$21, $$20, $$23, $$22, $$9, $$8, $$6, $$4, $$5);
               }
            }
         }
      }

      boolean $$24 = $$9 ? $$3.j() > 0.1 : $$3.j() > 0.7;
      if ($$24) {
         this.a($$3, $$2, $$13, $$11, $$1, $$9, $$7, $$6, $$8);
      }

      return true;
   }

   private void a(amn $$0, cgy $$1, int $$2, int $$3, gt $$4, boolean $$5, int $$6, double $$7, int $$8) {
      int $$9 = $$0.h() ? -1 : 1;
      int $$10 = $$0.h() ? -1 : 1;
      int $$11 = $$0.a(Math.max($$2 / 2 - 2, 1));
      if ($$0.h()) {
         $$11 = $$2 / 2 + 1 - $$0.a(Math.max($$2 - $$2 / 2 - 1, 1));
      }

      int $$12 = $$0.a(Math.max($$2 / 2 - 2, 1));
      if ($$0.h()) {
         $$12 = $$2 / 2 + 1 - $$0.a(Math.max($$2 - $$2 / 2 - 1, 1));
      }

      if ($$5) {
         $$11 = $$12 = $$0.a(Math.max($$6 - 5, 1));
      }

      gt $$13 = new gt($$9 * $$11, 0, $$10 * $$12);
      double $$14 = $$5 ? $$7 + Math.PI / 2 : $$0.j() * 2.0 * Math.PI;

      for(int $$15 = 0; $$15 < $$3 - 3; ++$$15) {
         int $$16 = this.a($$0, $$15, $$3, $$2);
         this.a($$16, $$15, $$4, $$1, false, $$14, $$13, $$6, $$8);
      }

      for(int $$17 = -1; $$17 > -$$3 + $$0.a(5); --$$17) {
         int $$18 = this.b($$0, -$$17, $$3, $$2);
         this.a($$18, $$17, $$4, $$1, true, $$14, $$13, $$6, $$8);
      }

   }

   private void a(int $$0, int $$1, gt $$2, cgy $$3, boolean $$4, double $$5, gt $$6, int $$7, int $$8) {
      int $$9 = $$0 + 1 + $$7 / 3;
      int $$10 = Math.min($$0 - 3, 3) + $$8 / 2 - 1;

      for(int $$11 = -$$9; $$11 < $$9; ++$$11) {
         for(int $$12 = -$$9; $$12 < $$9; ++$$12) {
            double $$13 = this.a($$11, $$12, $$6, $$9, $$10, $$5);
            if ($$13 < 0.0) {
               gt $$14 = $$2.b($$11, $$1, $$12);
               cvo $$15 = $$3.a_($$14);
               if (c($$15) || $$15.a(cju.cY)) {
                  if ($$4) {
                     this.a($$3, $$14, cju.C.m());
                  } else {
                     this.a($$3, $$14, cju.a.m());
                     this.a($$3, $$14);
                  }
               }
            }
         }
      }

   }

   private void a(cgy $$0, gt $$1) {
      if ($$0.a_($$1.b()).a(cju.cW)) {
         this.a($$0, $$1.b(), cju.a.m());
      }

   }

   private void a(cgy $$0, amn $$1, gt $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, boolean $$9, int $$10, double $$11, boolean $$12, cvo $$13) {
      double $$14 = $$9 ? this.a($$4, $$6, gt.b, $$8, this.a($$5, $$3, $$10), $$11) : this.a($$4, $$6, gt.b, $$7, $$1);
      if ($$14 < 0.0) {
         gt $$15 = $$2.b($$4, $$5, $$6);
         double $$16 = $$9 ? -0.5 : (double)(-6 - $$1.a(3));
         if ($$14 > $$16 && $$1.j() > 0.9) {
            return;
         }

         this.a($$15, $$0, $$1, $$3 - $$5, $$3, $$9, $$12, $$13);
      }

   }

   private void a(gt $$0, cgy $$1, amn $$2, int $$3, int $$4, boolean $$5, boolean $$6, cvo $$7) {
      cvo $$8 = $$1.a_($$0);
      if ($$8.d() == dpz.a || $$8.a(cju.cY) || $$8.a(cju.cX) || $$8.a(cju.C)) {
         boolean $$9 = !$$5 || $$2.j() > 0.05;
         int $$10 = $$5 ? 3 : 2;
         if ($$6 && !$$8.a(cju.C) && (double)$$3 <= (double)$$2.a(Math.max(1, $$4 / $$10)) + (double)$$4 * 0.6 && $$9) {
            this.a($$1, $$0, cju.cY.m());
         } else {
            this.a($$1, $$0, $$7);
         }
      }

   }

   private int a(int $$0, int $$1, int $$2) {
      int $$3 = $$2;
      if ($$0 > 0 && $$1 - $$0 <= 3) {
         $$3 = $$2 - (4 - ($$1 - $$0));
      }

      return $$3;
   }

   private double a(int $$0, int $$1, gt $$2, int $$3, amn $$4) {
      float $$5 = 10.0F * ami.a($$4.i(), 0.2F, 0.8F) / (float)$$3;
      return (double)$$5 + Math.pow((double)($$0 - $$2.u()), 2.0) + Math.pow((double)($$1 - $$2.w()), 2.0) - Math.pow((double)$$3, 2.0);
   }

   private double a(int $$0, int $$1, gt $$2, int $$3, int $$4, double $$5) {
      return Math.pow(((double)($$0 - $$2.u()) * Math.cos($$5) - (double)($$1 - $$2.w()) * Math.sin($$5)) / (double)$$3, 2.0)
         + Math.pow(((double)($$0 - $$2.u()) * Math.sin($$5) + (double)($$1 - $$2.w()) * Math.cos($$5)) / (double)$$4, 2.0)
         - 1.0;
   }

   private int a(amn $$0, int $$1, int $$2, int $$3) {
      float $$4 = 3.5F - $$0.i();
      float $$5 = (1.0F - (float)Math.pow((double)$$1, 2.0) / ((float)$$2 * $$4)) * (float)$$3;
      if ($$2 > 15 + $$0.a(5)) {
         int $$6 = $$1 < 3 + $$0.a(6) ? $$1 / 2 : $$1;
         $$5 = (1.0F - (float)$$6 / ((float)$$2 * $$4 * 0.4F)) * (float)$$3;
      }

      return ami.f($$5 / 2.0F);
   }

   private int b(int $$0, int $$1, int $$2) {
      float $$3 = 1.0F;
      float $$4 = (1.0F - (float)Math.pow((double)$$0, 2.0) / ((float)$$1 * 1.0F)) * (float)$$2;
      return ami.f($$4 / 2.0F);
   }

   private int b(amn $$0, int $$1, int $$2, int $$3) {
      float $$4 = 1.0F + $$0.i() / 2.0F;
      float $$5 = (1.0F - (float)$$1 / ((float)$$2 * $$4)) * (float)$$3;
      return ami.f($$5 / 2.0F);
   }

   private static boolean c(cvo $$0) {
      return $$0.a(cju.hA) || $$0.a(cju.cY) || $$0.a(cju.lH);
   }

   private boolean a(cgd $$0, gt $$1) {
      return $$0.a_($$1.c()).d() == dpz.a;
   }

   private void a(cgy $$0, gt $$1, int $$2, int $$3, boolean $$4, int $$5) {
      int $$6 = $$4 ? $$5 : $$2 / 2;

      for(int $$7 = -$$6; $$7 <= $$6; ++$$7) {
         for(int $$8 = -$$6; $$8 <= $$6; ++$$8) {
            for(int $$9 = 0; $$9 <= $$3; ++$$9) {
               gt $$10 = $$1.b($$7, $$9, $$8);
               cvo $$11 = $$0.a_($$10);
               if (c($$11) || $$11.a(cju.cW)) {
                  if (this.a((cgd)$$0, $$10)) {
                     this.a($$0, $$10, cju.a.m());
                     this.a($$0, $$10.b(), cju.a.m());
                  } else if (c($$11)) {
                     cvo[] $$12 = new cvo[]{$$0.a_($$10.f()), $$0.a_($$10.g()), $$0.a_($$10.d()), $$0.a_($$10.e())};
                     int $$13 = 0;

                     for(cvo $$14 : $$12) {
                        if (!c($$14)) {
                           ++$$13;
                        }
                     }

                     if ($$13 >= 3) {
                        this.a($$0, $$10, cju.a.m());
                     }
                  }
               }
            }
         }
      }

   }
}
