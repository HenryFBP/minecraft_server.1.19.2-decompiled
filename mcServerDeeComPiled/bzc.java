import java.util.function.Predicate;

public class bzc extends cbm implements cco {
   public static final int a = 20;
   public static final int b = 15;

   public bzc(cat.a $$0) {
      super($$0);
   }

   @Override
   public void a(cax $$0, cgx $$1, bcc $$2, int $$3) {
      if ($$2 instanceof buc) {
         buc $$4 = (buc)$$2;
         boolean $$5 = $$4.fB().d || cet.a(cev.B, $$0) > 0;
         cax $$6 = $$4.h($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cax(caz.mR);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(caz.mR);
               if (!$$1.y) {
                  bys $$10 = (bys)($$6.c() instanceof bys ? $$6.c() : caz.mR);
                  bui $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.ds(), $$4.dq(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cet.a(cev.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.n() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cet.a(cev.z, $$0);
                  if ($$13 > 0) {
                     $$11.a($$13);
                  }

                  if (cet.a(cev.A, $$0) > 0) {
                     $$11.f(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.eU()));
                  if ($$9 || $$4.fB().d && ($$6.a(caz.tj) || $$6.a(caz.tk))) {
                     $$11.d = bui.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.df(), $$4.dh(), $$4.dl(), ajw.aq, ajx.h, 1.0F, 1.0F / ($$1.r_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fB().d) {
                  $$6.g(1);
                  if ($$6.b()) {
                     $$4.fA().g($$6);
                  }
               }

               $$4.b(akg.c.b(this));
            }
         }
      }
   }

   public static float a(int $$0) {
      float $$1 = (float)$$0 / 20.0F;
      $$1 = ($$1 * $$1 + $$1 * 2.0F) / 3.0F;
      if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return $$1;
   }

   @Override
   public int b(cax $$0) {
      return 72000;
   }

   @Override
   public ccn c(cax $$0) {
      return ccn.e;
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      boolean $$4 = !$$1.h($$3).b();
      if (!$$1.fB().d && !$$4) {
         return bak.d($$3);
      } else {
         $$1.c($$2);
         return bak.b($$3);
      }
   }

   @Override
   public Predicate<cax> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
