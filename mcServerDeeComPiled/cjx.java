import java.util.Optional;

public class cjx extends cjt implements cjy {
   public static final cwf a = cwe.e;
   private static final int b = 5;

   public cjx(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      cvo $$4 = $$1.a_($$2.b());
      if ($$4.h()) {
         $$3.k($$0.c(a));
         if (!$$1.y) {
            agg $$5 = (agg)$$1;

            for(int $$6 = 0; $$6 < 2; ++$$6) {
               $$5.a(io.af, (double)$$2.u() + $$1.w.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.w.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(io.e, (double)$$2.u() + $$1.w.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.w.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(a));
      }

   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.c()));
   }

   @Override
   public dpv c_(cvo $$0) {
      return dpw.c.a(false);
   }

   public static void b(cgy $$0, gt $$1, cvo $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cgy $$0, gt $$1, cvo $$2, cvo $$3) {
      if (h($$2)) {
         cvo $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         gt.a $$5 = $$1.i().c(gy.b);

         while(h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(gy.b);
         }

      }
   }

   private static boolean h(cvo $$0) {
      return $$0.a(cju.lO) || $$0.a(cju.C) && $$0.p().e() >= 8 && $$0.p().b();
   }

   private static cvo n(cvo $$0) {
      if ($$0.a(cju.lO)) {
         return $$0;
      } else if ($$0.a(cju.dg)) {
         return cju.lO.m().a(a, Boolean.valueOf(false));
      } else {
         return $$0.a(cju.jv) ? cju.lO.m().a(a, Boolean.valueOf(true)) : cju.C.m();
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(a)) {
         $$1.b(io.ai, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, ajw.bY, ajx.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(io.aj, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(io.aj, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, ajw.bW, ajx.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      $$3.a($$4, dpw.c, dpw.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == gy.a || $$1 == gy.b && !$$2.a(cju.lO) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2.c());
      return $$3.a(cju.lO) || $$3.a(cju.jv) || $$3.a(cju.dg);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return dxg.a();
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.a;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public cax c(cgy $$0, gt $$1, cvo $$2) {
      $$0.a($$1, cju.a.m(), 11);
      return new cax(caz.oI);
   }

   @Override
   public Optional<ajv> X_() {
      return dpw.c.k();
   }
}
