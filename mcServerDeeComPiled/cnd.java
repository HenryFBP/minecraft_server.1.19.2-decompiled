public class cnd extends cna {
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double d = 0.05;
   private static final int e = 20;
   protected static final dxj a = cjt.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public cnd(cvn.c $$0) {
      super($$0);
   }

   private static boolean c(bbn $$0) {
      return $$0 instanceof bcc || $$0 instanceof bvt || $$0 instanceof bqw || $$0 instanceof bvv;
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   public void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, float $$4) {
      $$3.a(ajw.ja, 1.0F, 1.0F);
      if (!$$0.y) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, baw.k)) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(gt $$0, bbn $$1) {
      if ($$1.aw()) {
         return false;
      } else if ($$1.dh() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dd().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.df());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dl());
         double $$4 = 0.4375 + (double)($$1.cW() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bbn $$0, gt $$1) {
      if ($$0 instanceof agh && $$0.s.U() % 20L == 0L) {
         aj.J.a((agh)$$0, $$0.s.a_($$1));
      }

   }

   private void d(bbn $$0) {
      dwq $$1 = $$0.dd();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.f(new dwq($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.f(new dwq($$1.c, -0.05, $$1.e));
      }

      $$0.m();
   }

   private void a(cgx $$0, bbn $$1) {
      if (c($$1)) {
         if ($$0.w.a(5) == 0) {
            $$1.a(ajw.ja, 1.0F, 1.0F);
         }

         if (!$$0.y && $$0.w.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }

   }

   public static void a(bbn $$0) {
      a($$0, 5);
   }

   public static void b(bbn $$0) {
      a($$0, 10);
   }

   private static void a(bbn $$0, int $$1) {
      if ($$0.s.y) {
         cvo $$2 = cju.nR.m();

         for(int $$3 = 0; $$3 < $$1; ++$$3) {
            $$0.s.a(new ig(io.c, $$2), $$0.df(), $$0.dh(), $$0.dl(), 0.0, 0.0, 0.0);
         }

      }
   }
}
