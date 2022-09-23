public class crn extends cka implements cjv {
   private static final float c = 0.003F;
   public static final int a = 3;
   public static final cwo b = cwe.as;
   private static final dxj d = cjt.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final dxj e = cjt.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public crn(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(caz.ui);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      if ($$0.c(b) == 0) {
         return d;
      } else {
         return $$0.c(b) < 3 ? e : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.b(), 0) >= 9) {
         cvo $$5 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(czv.c, $$2, czv.a.a($$5));
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if ($$3 instanceof bcc && $$3.ad() != bbr.G && $$3.ad() != bbr.h) {
         $$3.a($$0, new dwq(0.8F, 0.75, 0.8F));
         if (!$$1.y && $$0.c(b) > 0 && ($$3.M != $$3.df() || $$3.O != $$3.dl())) {
            double $$4 = Math.abs($$3.df() - $$3.M);
            double $$5 = Math.abs($$3.dl() - $$3.O);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a(baw.u, 1.0F);
            }
         }

      }
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      int $$6 = $$0.c(b);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(caz.pH)) {
         return baj.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.w.a(2);
         a($$1, $$2, new cax(caz.ui, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, ajw.uD, ajx.e, 1.0F, 0.8F + $$1.w.i() * 0.4F);
         cvo $$9 = $$0.a(b, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(czv.c, $$2, czv.a.a($$3, $$9));
         return baj.a($$1.y);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return $$2.c(b) < 3;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      int $$4 = Math.min(3, $$3.c(b) + 1);
      $$0.a($$2, $$3.a(b, Integer.valueOf($$4)), 2);
   }
}
