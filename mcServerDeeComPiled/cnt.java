public class cnt extends cjt implements cql {
   public static final int a = 7;
   public static final cwo b = cwe.aC;
   public static final cwf c = cwe.v;
   public static final cwf d = cwe.C;
   private static final int e = 1;

   public cnt(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dxj f(cvo $$0, cgd $$1, gt $$2) {
      return dxg.a();
   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }

   }

   protected boolean h(cvo $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(cvo $$0, cgd $$1, gt $$2) {
      return 1;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      int $$6 = n($$2) + 1;
      if ($$6 != 1 || $$0.c(b) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static cvo a(cvo $$0, cgy $$1, gt $$2) {
      int $$3 = 7;
      gt.a $$4 = new gt.a();

      for(gy $$5 : gy.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, n($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(b, Integer.valueOf($$3));
   }

   private static int n(cvo $$0) {
      if ($$0.a(akl.s)) {
         return 0;
      } else {
         return $$0.b() instanceof cnt ? $$0.c(b) : 7;
      }
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(d) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$1.t($$2.b())) {
         if ($$3.a(15) == 1) {
            gt $$4 = $$2.c();
            cvo $$5 = $$1.a_($$4);
            if (!$$5.m() || !$$5.d($$1, $$4, gy.b)) {
               double $$6 = (double)$$2.u() + $$3.j();
               double $$7 = (double)$$2.v() - 0.05;
               double $$8 = (double)$$2.w() + $$3.j();
               $$1.a(io.m, $$6, $$7, $$8, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      cvo $$2 = this.m().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf($$1.a() == dpw.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
