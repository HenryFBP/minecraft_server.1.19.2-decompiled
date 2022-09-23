public class cnw extends cmc {
   public static final cwf a = cwe.w;
   protected static final int b = 6;
   protected static final int c = 6;
   protected static final int d = 8;
   protected static final dxj e = cjt.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final dxj f = cjt.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final dxj g = cjt.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final dxj h = cjt.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final dxj i = cjt.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final dxj j = cjt.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final dxj k = cjt.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final dxj l = cjt.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   protected cnw(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(aD, gy.c).a(a, Boolean.valueOf(false)).a(J, cwa.b));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch((cwa)$$0.c(J)) {
         case a:
            switch(((gy)$$0.c(aD)).o()) {
               case a:
                  return j;
               case c:
               default:
                  return i;
            }
         case b:
            switch((gy)$$0.c(aD)) {
               case f:
                  return h;
               case e:
                  return g;
               case d:
                  return f;
               case c:
               default:
                  return e;
            }
         case c:
         default:
            switch(((gy)$$0.c(aD)).o()) {
               case a:
                  return l;
               case c:
               default:
                  return k;
            }
      }
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         cvo $$6 = $$0.a(a);
         if ($$6.c(a)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return baj.a;
      } else {
         cvo $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(a) ? 0.6F : 0.5F;
         $$1.a(null, $$2, ajw.ku, ajx.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(a) ? czv.a : czv.e, $$2);
         return baj.b;
      }
   }

   public cvo d(cvo $$0, cgx $$1, gt $$2) {
      $$0 = $$0.a(a);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(cvo $$0, cgy $$1, gt $$2, float $$3) {
      gy $$4 = ((gy)$$0.c(aD)).g();
      gy $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ii(ii.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(a) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   private void e(cvo $$0, cgx $$1, gt $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(J, aD, a);
   }
}
