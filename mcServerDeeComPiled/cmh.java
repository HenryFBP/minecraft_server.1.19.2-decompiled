public class cmh extends cnf {
   public static final cwf a = cwe.u;
   public static final cwf b = cwe.w;
   public static final cwf c = cwe.q;
   protected static final dxj d = cjt.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final dxj e = cjt.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final dxj f = cjt.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final dxj g = cjt.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final dxj h = cjt.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final dxj i = cjt.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final dxj j = dxg.a(cjt.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cjt.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final dxj k = dxg.a(cjt.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cjt.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final dxj l = dxg.a(cjt.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cjt.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final dxj m = dxg.a(cjt.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cjt.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));

   public cmh(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      if ($$0.c(c)) {
         return ((gy)$$0.c(aD)).o() == gy.a.a ? g : f;
      } else {
         return ((gy)$$0.c(aD)).o() == gy.a.a ? e : d;
      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      gy.a $$6 = $$1.o();
      if (((gy)$$0.c(aD)).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(c, Boolean.valueOf($$7));
      }
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      if ($$0.c(a)) {
         return dxg.a();
      } else {
         return ((gy)$$0.c(aD)).o() == gy.a.c ? h : i;
      }
   }

   @Override
   public dxj b_(cvo $$0, cgd $$1, gt $$2) {
      if ($$0.c(c)) {
         return ((gy)$$0.c(aD)).o() == gy.a.a ? m : l;
      } else {
         return ((gy)$$0.c(aD)).o() == gy.a.a ? k : j;
      }
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      switch($$3) {
         case a:
            return $$0.c(a);
         case b:
            return false;
         case c:
            return $$0.c(a);
         default:
            return false;
      }
   }

   @Override
   public cvo a(ccx $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      boolean $$3 = $$1.r($$2);
      gy $$4 = $$0.g();
      gy.a $$5 = $$4.o();
      boolean $$6 = $$5 == gy.a.c && (this.h($$1.a_($$2.f())) || this.h($$1.a_($$2.g())))
         || $$5 == gy.a.a && (this.h($$1.a_($$2.d())) || this.h($$1.a_($$2.e())));
      return this.m().a(aD, $$4).a(a, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$6));
   }

   private boolean h(cvo $$0) {
      return $$0.a(akl.H);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         gy $$6 = $$3.cv();
         if ($$0.c(aD) == $$6.g()) {
            $$0 = $$0.a(aD, $$6);
         }

         $$0 = $$0.a(a, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(a);
      $$1.a($$3, $$7 ? 1008 : 1014, $$2, 0);
      $$1.a($$3, $$7 ? czv.h : czv.d, $$2);
      return baj.a($$1.y);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if (!$$1.y) {
         boolean $$6 = $$1.r($$2);
         if ($$0.c(b) != $$6) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)).a(a, Boolean.valueOf($$6)), 2);
            if ($$0.c(a) != $$6) {
               $$1.a(null, $$6 ? 1008 : 1014, $$2, 0);
               $$1.a(null, $$6 ? czv.h : czv.d, $$2);
            }
         }

      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(aD, a, b, c);
   }

   public static boolean a(cvo $$0, gy $$1) {
      return ((gy)$$0.c(aD)).o() == $$1.h().o();
   }
}
