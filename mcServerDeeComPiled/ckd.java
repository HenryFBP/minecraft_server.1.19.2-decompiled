public class ckd extends cjt {
   public static final int a = 6;
   public static final cwo b = cwe.ay;
   public static final int c = b(0);
   protected static final float d = 1.0F;
   protected static final float e = 2.0F;
   protected static final dxj[] f = new dxj[]{
      cjt.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cjt.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cjt.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cjt.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cjt.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cjt.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cjt.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected ckd(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return f[$$0.c(b)];
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      cat $$7 = $$6.c();
      if ($$6.a(aks.ae) && $$0.c(b) == 0) {
         cjt $$8 = cjt.a($$7);
         if ($$8 instanceof ckf) {
            if (!$$3.f()) {
               $$6.g(1);
            }

            $$1.a(null, $$2, ajw.cp, ajx.e, 1.0F, 1.0F);
            $$1.b($$2, ckg.a($$8));
            $$1.a($$3, czv.c, $$2);
            $$3.b(akg.c.b($$7));
            return baj.a;
         }
      }

      if ($$1.y) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return baj.a;
         }

         if ($$6.b()) {
            return baj.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static baj a(cgy $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$3.s(false)) {
         return baj.d;
      } else {
         $$3.a(akg.U);
         $$3.fL().a(2, 0.1F);
         int $$4 = $$2.c(b);
         $$0.a($$3, czv.n, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(b, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, czv.f, $$1);
         }

         return baj.a;
      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == gy.a && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return $$1.a_($$2.c()).d().b();
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return b($$0.c(b));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
