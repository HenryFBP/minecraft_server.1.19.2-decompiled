import javax.annotation.Nullable;

public class crv extends cnf implements cql {
   public static final cwf a = cwe.u;
   public static final cwm<cwn> b = cwe.af;
   public static final cwf c = cwe.w;
   public static final cwf d = cwe.C;
   protected static final int e = 3;
   protected static final dxj f = cjt.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final dxj g = cjt.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final dxj h = cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final dxj i = cjt.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final dxj j = cjt.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final dxj k = cjt.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);

   protected crv(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(aD, gy.c).a(a, Boolean.valueOf(false)).a(b, cwn.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      if (!$$0.c(a)) {
         return $$0.c(b) == cwn.a ? k : j;
      } else {
         switch((gy)$$0.c(aD)) {
            case c:
            default:
               return i;
            case d:
               return h;
            case e:
               return g;
            case f:
               return f;
         }
      }
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      switch($$3) {
         case a:
            return $$0.c(a);
         case b:
            return $$0.c(d);
         case c:
            return $$0.c(a);
         default:
            return false;
      }
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if (this.aF == dpz.K) {
         return baj.d;
      } else {
         $$0 = $$0.a(a);
         $$1.a($$2, $$0, 2);
         if ($$0.c(d)) {
            $$1.a($$2, dpw.c, dpw.c.a($$1));
         }

         this.a($$3, $$1, $$2, $$0.c(a));
         return baj.a($$1.y);
      }
   }

   protected void a(@Nullable buc $$0, cgx $$1, gt $$2, boolean $$3) {
      if ($$3) {
         int $$4 = this.aF == dpz.K ? 1037 : 1007;
         $$1.a($$0, $$4, $$2, 0);
      } else {
         int $$5 = this.aF == dpz.K ? 1036 : 1013;
         $$1.a($$0, $$5, $$2, 0);
      }

      $$1.a($$0, $$3 ? czv.h : czv.d, $$2);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if (!$$1.y) {
         boolean $$6 = $$1.r($$2);
         if ($$6 != $$0.c(c)) {
            if ($$0.c(a) != $$6) {
               $$0 = $$0.a(a, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 2);
            if ($$0.c(d)) {
               $$1.a($$2, dpw.c, dpw.c.a($$1));
            }
         }

      }
   }

   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = this.m();
      dpv $$2 = $$0.q().b_($$0.a());
      gy $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aD, $$3).a(b, $$0.l().d - (double)$$0.a().v() > 0.5 ? cwn.a : cwn.b);
      } else {
         $$1 = $$1.a(aD, $$0.g().g()).a(b, $$3 == gy.b ? cwn.b : cwn.a);
      }

      if ($$0.q().r($$0.a())) {
         $$1 = $$1.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
      }

      return $$1.a(d, Boolean.valueOf($$2.a() == dpw.c));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(aD, a, b, c, d);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(d) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
