import javax.annotation.Nullable;

public class cix extends cjt implements cjv {
   protected static final float a = 3.0F;
   protected static final float b = 5.0F;
   protected static final float c = 1.5F;
   protected static final dxj d = cjt.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final dxj e = cjt.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final dxj f = cjt.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final cwo g = cwe.aq;
   public static final cwm<cwb> h = cwe.bl;
   public static final cwo i = cwe.aU;
   public static final int j = 16;
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 0;
   public static final int n = 1;

   public cix(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(g, Integer.valueOf(0)).a(h, cwb.a).a(i, Integer.valueOf(0)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(g, h, i);
   }

   @Override
   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return true;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      dxj $$4 = $$0.c(h) == cwb.c ? e : d;
      dwq $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      dwq $$4 = $$0.n($$1, $$2);
      return f.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(cvo $$0, cgd $$1, gt $$2) {
      return false;
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         cvo $$2 = $$0.q().a_($$0.a().c());
         if ($$2.a(akl.ap)) {
            if ($$2.a(cju.lJ)) {
               return this.m().a(g, Integer.valueOf(0));
            } else if ($$2.a(cju.lK)) {
               int $$3 = $$2.c(g) > 0 ? 1 : 0;
               return this.m().a(g, Integer.valueOf($$3));
            } else {
               cvo $$4 = $$0.q().a_($$0.a().b());
               return $$4.a(cju.lK) ? this.m().a(g, (Integer)$$4.c(g)) : cju.lJ.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }

   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.c(i) == 0;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(i) == 0) {
         if ($$3.a(3) == 0 && $$1.x($$2.b()) && $$1.b($$2.b(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }

      }
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return $$1.a_($$2.c()).a(akl.ap);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == gy.b && $$2.a(cju.lK) && $$2.c(g) > $$0.c(g)) {
         $$3.a($$4, $$0.a(g), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      int $$4 = this.a($$0, $$1);
      int $$5 = this.b($$0, $$1);
      return $$4 + $$5 + 1 < 16 && $$0.a_($$1.b($$4)).c(i) != 1;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for(int $$8 = 0; $$8 < $$7; ++$$8) {
         gt $$9 = $$2.b($$4);
         cvo $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(i) == 1 || !$$0.x($$9.b())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         ++$$4;
         ++$$6;
      }

   }

   @Override
   public float a(cvo $$0, buc $$1, cgd $$2, gt $$3) {
      return $$1.ez().c() instanceof ccf ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cvo $$0, cgx $$1, gt $$2, amn $$3, int $$4) {
      cvo $$5 = $$1.a_($$2.c());
      gt $$6 = $$2.c(2);
      cvo $$7 = $$1.a_($$6);
      cwb $$8 = cwb.a;
      if ($$4 >= 1) {
         if (!$$5.a(cju.lK) || $$5.c(h) == cwb.a) {
            $$8 = cwb.b;
         } else if ($$5.a(cju.lK) && $$5.c(h) != cwb.a) {
            $$8 = cwb.c;
            if ($$7.a(cju.lK)) {
               $$1.a($$2.c(), $$5.a(h, cwb.b), 3);
               $$1.a($$6, $$7.a(h, cwb.a), 3);
            }
         }
      }

      int $$9 = $$0.c(g) != 1 && !$$7.a(cju.lK) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.b(), this.m().a(g, Integer.valueOf($$9)).a(h, $$8).a(i, Integer.valueOf($$10)), 3);
   }

   protected int a(cgd $$0, gt $$1) {
      int $$2 = 0;

      while($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cju.lK)) {
         ++$$2;
      }

      return $$2;
   }

   protected int b(cgd $$0, gt $$1) {
      int $$2 = 0;

      while($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cju.lK)) {
         ++$$2;
      }

      return $$2;
   }
}
