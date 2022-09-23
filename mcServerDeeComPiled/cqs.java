import javax.annotation.Nullable;

public class cqs extends cjt {
   public static final int a = 8;
   public static final cwo b = cwe.aF;
   protected static final dxj[] c = new dxj[]{
      dxg.a(),
      cjt.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int d = 5;

   protected cqs(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(1)));
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      switch($$3) {
         case a:
            return $$0.c(b) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c[$$0.c(b) - 1];
   }

   @Override
   public dxj f(cvo $$0, cgd $$1, gt $$2) {
      return c[$$0.c(b)];
   }

   @Override
   public dxj b(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public float b(cvo $$0, cgd $$1, gt $$2) {
      return $$0.c(b) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2.c());
      if ($$3.a(akl.bU)) {
         return false;
      } else if ($$3.a(akl.bV)) {
         return true;
      } else {
         return cjt.a($$3.k($$1, $$2.c()), gy.b) || $$3.a(this) && $$3.c(b) == 8;
      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.a(chg.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }

   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      int $$2 = $$0.c(b);
      if (!$$1.n().a(this.l()) || $$2 >= 8) {
         return $$2 == 1;
      } else if ($$1.c()) {
         return $$1.k() == gy.b;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(b);
         return $$1.a(b, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }
}
