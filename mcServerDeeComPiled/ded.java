import com.mojang.serialization.Codec;

public class ded extends ddt<dec> {
   private static final float a = 0.06F;

   public ded(Codec<dec> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dec> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      amn $$3 = $$0.d();
      cxk $$4 = $$0.c();
      dec $$5 = $$0.f();
      cjt $$6 = $$5.b.b();
      gt $$7 = null;
      cvo $$8 = $$1.a_($$2.c());
      if ($$8.a($$6)) {
         $$7 = $$2;
      }

      if ($$7 == null) {
         return false;
      } else {
         int $$9 = ami.a($$3, 4, 13);
         if ($$3.a(12) == 0) {
            $$9 *= 2;
         }

         if (!$$5.f) {
            int $$10 = $$4.e();
            if ($$7.v() + $$9 + 1 >= $$10) {
               return false;
            }
         }

         boolean $$11 = !$$5.f && $$3.i() < 0.06F;
         $$1.a($$2, cju.a.m(), 4);
         this.a($$1, $$3, $$5, $$7, $$9, $$11);
         this.b($$1, $$3, $$5, $$7, $$9, $$11);
         return true;
      }
   }

   private static boolean a(cgy $$0, gt $$1, boolean $$2) {
      return $$0.a($$1, $$1x -> {
         dpz $$2x = $$1x.d();
         return $$1x.d().e() || $$2 && $$2x == dpz.e;
      });
   }

   private void a(cgy $$0, amn $$1, dec $$2, gt $$3, int $$4, boolean $$5) {
      gt.a $$6 = new gt.a();
      cvo $$7 = $$2.c;
      int $$8 = $$5 ? 1 : 0;

      for(int $$9 = -$$8; $$9 <= $$8; ++$$9) {
         for(int $$10 = -$$8; $$10 <= $$8; ++$$10) {
            boolean $$11 = $$5 && ami.a($$9) == $$8 && ami.a($$10) == $$8;

            for(int $$12 = 0; $$12 < $$4; ++$$12) {
               $$6.a($$3, $$9, $$12, $$10);
               if (a($$0, $$6, true)) {
                  if ($$2.f) {
                     if (!$$0.a_($$6.c()).h()) {
                        $$0.b($$6, true);
                     }

                     $$0.a($$6, $$7, 3);
                  } else if ($$11) {
                     if ($$1.i() < 0.1F) {
                        this.a($$0, $$6, $$7);
                     }
                  } else {
                     this.a($$0, $$6, $$7);
                  }
               }
            }
         }
      }

   }

   private void b(cgy $$0, amn $$1, dec $$2, gt $$3, int $$4, boolean $$5) {
      gt.a $$6 = new gt.a();
      boolean $$7 = $$2.d.a(cju.jw);
      int $$8 = Math.min($$1.a(1 + $$4 / 3) + 5, $$4);
      int $$9 = $$4 - $$8;

      for(int $$10 = $$9; $$10 <= $$4; ++$$10) {
         int $$11 = $$10 < $$4 - $$1.a(3) ? 2 : 1;
         if ($$8 > 8 && $$10 < $$9 + 4) {
            $$11 = 3;
         }

         if ($$5) {
            ++$$11;
         }

         for(int $$12 = -$$11; $$12 <= $$11; ++$$12) {
            for(int $$13 = -$$11; $$13 <= $$11; ++$$13) {
               boolean $$14 = $$12 == -$$11 || $$12 == $$11;
               boolean $$15 = $$13 == -$$11 || $$13 == $$11;
               boolean $$16 = !$$14 && !$$15 && $$10 != $$4;
               boolean $$17 = $$14 && $$15;
               boolean $$18 = $$10 < $$9 + 3;
               $$6.a($$3, $$12, $$10, $$13);
               if (a($$0, $$6, false)) {
                  if ($$2.f && !$$0.a_($$6.c()).h()) {
                     $$0.b($$6, true);
                  }

                  if ($$18) {
                     if (!$$16) {
                        this.a($$0, $$1, $$6, $$2.d, $$7);
                     }
                  } else if ($$16) {
                     this.a($$0, $$1, $$2, $$6, 0.1F, 0.2F, $$7 ? 0.1F : 0.0F);
                  } else if ($$17) {
                     this.a($$0, $$1, $$2, $$6, 0.01F, 0.7F, $$7 ? 0.083F : 0.0F);
                  } else {
                     this.a($$0, $$1, $$2, $$6, 5.0E-4F, 0.98F, $$7 ? 0.07F : 0.0F);
                  }
               }
            }
         }
      }

   }

   private void a(cgy $$0, amn $$1, dec $$2, gt.a $$3, float $$4, float $$5, float $$6) {
      if ($$1.i() < $$4) {
         this.a($$0, $$3, $$2.e);
      } else if ($$1.i() < $$5) {
         this.a($$0, $$3, $$2.d);
         if ($$1.i() < $$6) {
            a($$3, $$0, $$1);
         }
      }

   }

   private void a(cgy $$0, amn $$1, gt $$2, cvo $$3, boolean $$4) {
      if ($$0.a_($$2.c()).a($$3.b())) {
         this.a($$0, $$2, $$3);
      } else if ((double)$$1.i() < 0.15) {
         this.a($$0, $$2, $$3);
         if ($$4 && $$1.a(11) == 0) {
            a($$2, $$0, $$1);
         }
      }

   }

   private static void a(gt $$0, cgy $$1, amn $$2) {
      gt.a $$3 = $$0.i().c(gy.a);
      if ($$1.x($$3)) {
         int $$4 = ami.a($$2, 1, 5);
         if ($$2.a(7) == 0) {
            $$4 *= 2;
         }

         int $$5 = 23;
         int $$6 = 25;
         dfm.a($$1, $$2, $$3, $$4, 23, 25);
      }
   }
}
