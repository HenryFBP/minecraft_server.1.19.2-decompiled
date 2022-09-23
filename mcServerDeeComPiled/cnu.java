import javax.annotation.Nullable;

public class cnu extends cjg {
   public static final cwi a = cnf.aD;
   public static final cwf b = cwe.w;
   public static final cwf c = cwe.o;
   public static final dxj d = cjt.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dxj e = cjt.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final dxj f = dxg.a(d, e);
   public static final dxj g = cjt.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final dxj h = dxg.a(f, g);
   public static final dxj i = dxg.a(
      cjt.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cjt.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cjt.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), f
   );
   public static final dxj j = dxg.a(
      cjt.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cjt.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cjt.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), f
   );
   public static final dxj k = dxg.a(
      cjt.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cjt.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cjt.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), f
   );
   public static final dxj l = dxg.a(
      cjt.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cjt.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cjt.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), f
   );
   private static final int m = 2;

   protected cnu(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public dxj b_(cvo $$0, cgd $$1, gt $$2) {
      return f;
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public cvo a(ccx $$0) {
      cgx $$1 = $$0.q();
      cax $$2 = $$0.n();
      buc $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.y && $$3 != null && $$3.fY()) {
         pj $$5 = byx.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.m().a(a, $$0.g().g()).a(c, Boolean.valueOf($$4));
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return h;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch((gy)$$0.c(a)) {
         case c:
            return j;
         case d:
            return l;
         case f:
            return k;
         case e:
            return i;
         default:
            return f;
      }
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cud($$0, $$1);
   }

   public static boolean a(@Nullable buc $$0, cgx $$1, gt $$2, cvo $$3, cax $$4) {
      if (!$$3.c(c)) {
         if (!$$1.y) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable buc $$0, cgx $$1, gt $$2, cvo $$3, cax $$4) {
      cti $$5 = $$1.c_($$2);
      if ($$5 instanceof cud $$6) {
         $$6.a($$4.a(1));
         a($$1, $$2, $$3, true);
         $$1.a(null, $$2, ajw.bP, ajx.e, 1.0F, 1.0F);
         $$1.a($$0, czv.c, $$2);
      }

   }

   public static void a(cgx $$0, gt $$1, cvo $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   public static void a(cgx $$0, gt $$1, cvo $$2) {
      b($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void b(cgx $$0, gt $$1, cvo $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cgx $$0, gt $$1, cvo $$2) {
      $$0.a($$1.c(), $$2.b());
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      b($$1, $$2, $$0, false);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(b)) {
            $$1.a($$2.c(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(cvo $$0, cgx $$1, gt $$2) {
      cti $$3 = $$1.c_($$2);
      if ($$3 instanceof cud $$4) {
         gy $$5 = $$0.c(a);
         cax $$6 = $$4.c().o();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         bqv $$9 = new bqv($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.o();
         $$1.b($$9);
         $$4.a();
      }

   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$3 == gy.b && $$0.c(b) ? 15 : 0;
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      if ($$0.c(c)) {
         cti $$3 = $$1.c_($$2);
         if ($$3 instanceof cud) {
            return ((cud)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$0.c(c)) {
         if (!$$1.y) {
            this.a($$1, $$2, $$3);
         }

         return baj.a($$1.y);
      } else {
         cax $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(aks.aq) ? baj.b : baj.d;
      }
   }

   @Nullable
   @Override
   public bam b(cvo $$0, cgx $$1, gt $$2) {
      return !$$0.c(c) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cgx $$0, gt $$1, buc $$2) {
      cti $$3 = $$0.c_($$1);
      if ($$3 instanceof cud) {
         $$2.a((cud)$$3);
         $$2.a(akg.au);
      }

   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
