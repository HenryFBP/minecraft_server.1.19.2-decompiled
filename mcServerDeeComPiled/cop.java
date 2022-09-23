public class cop extends cjt {
   public static final cwm<gy.a> a = cwe.I;
   protected static final int b = 2;
   protected static final dxj c = cjt.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final dxj d = cjt.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public cop(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.a.a));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch((gy.a)$$0.c(a)) {
         case c:
            return d;
         case a:
         default:
            return c;
      }
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.q_().j() && $$1.W().b(cgt.e) && $$3.a(2000) < $$1.ag().a()) {
         while($$1.a_($$2).a(this)) {
            $$2 = $$2.c();
         }

         if ($$1.a_($$2).a($$1, $$2, bbr.bm)) {
            bbn $$4 = bbr.bm.a($$1, null, null, null, $$2.b(), bcg.d, false, false);
            if ($$4 != null) {
               $$4.ap();
            }
         }
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      gy.a $$6 = $$1.o();
      gy.a $$7 = $$0.c(a);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new dqu($$3, $$4, $$7).c() ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$3.bI() && !$$3.bJ() && $$3.ck()) {
         $$3.d($$2);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ajw.qn, ajx.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for(int $$4 = 0; $$4 < 4; ++$$4) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.f()).a(this) && !$$1.a_($$2.g()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(io.W, $$5, $$6, $$7, $$8, $$9, $$10);
      }

   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return cax.b;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      switch($$1) {
         case d:
         case b:
            switch((gy.a)$$0.c(a)) {
               case c:
                  return $$0.a(a, gy.a.a);
               case a:
                  return $$0.a(a, gy.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }
}
