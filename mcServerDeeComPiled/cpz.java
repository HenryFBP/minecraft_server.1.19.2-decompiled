public class cpz extends cjt implements cql {
   private static final int e = 1;
   private static final dxj f;
   private static final dxj g;
   private static final dxj h = cjt.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final dxj i = dxg.b().a(0.0, -1.0, 0.0);
   public static final int a = 7;
   public static final cwo b = cwe.aW;
   public static final cwf c = cwe.C;
   public static final cwf d = cwe.b;

   protected cpz(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      if (!$$3.a($$0.b().l())) {
         return $$0.c(d) ? g : f;
      } else {
         return dxg.b();
      }
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2) {
      return dxg.b();
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      return $$1.n().a(this.l());
   }

   @Override
   public cvo a(ccx $$0) {
      gt $$1 = $$0.a();
      cgx $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().a(c, Boolean.valueOf($$2.b_($$1).a() == dpw.c)).a(b, Integer.valueOf($$3)).a(d, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$1.y) {
         $$1.a($$2, this, 1);
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      if (!$$3.k_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      int $$4 = a($$1, $$2);
      cvo $$5 = $$0.a(b, Integer.valueOf($$4)).a(d, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(b) == 7) {
         if ($$0.c(b) == 7) {
            bqu.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }

   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      if ($$3.a(dxg.b(), $$2, true) && !$$3.b()) {
         return f;
      } else {
         return $$0.c(b) != 0 && $$0.c(d) && $$3.a(i, $$2, true) ? h : dxg.a();
      }
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(c) ? dpw.c.a(false) : super.c_($$0);
   }

   private boolean a(cgd $$0, gt $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.c()).a(this);
   }

   public static int a(cgd $$0, gt $$1) {
      gt.a $$2 = $$1.i().c(gy.a);
      cvo $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cju.mD)) {
         $$4 = $$3.c(b);
      } else if ($$3.d($$0, $$2, gy.b)) {
         return 0;
      }

      for(gy $$5 : gy.c.a) {
         cvo $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cju.mD)) {
            $$4 = Math.min($$4, $$6.c(b) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      dxj $$0 = cjt.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      dxj $$1 = cjt.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      dxj $$2 = cjt.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      dxj $$3 = cjt.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      dxj $$4 = cjt.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      f = dxg.a($$0, $$1, $$2, $$3, $$4);
      dxj $$5 = cjt.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      dxj $$6 = cjt.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      dxj $$7 = cjt.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      dxj $$8 = cjt.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      g = dxg.a(cpz.h, f, $$6, $$5, $$8, $$7);
   }
}
