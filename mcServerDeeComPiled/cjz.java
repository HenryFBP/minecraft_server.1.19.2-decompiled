public class cjz extends cis {
   public static final int a = 5;
   private static final gy[] b = gy.values();

   public cjz(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$3.a(5) == 0) {
         gy $$4 = b[$$3.a(b.length)];
         gt $$5 = $$2.a($$4);
         cvo $$6 = $$1.a_($$5);
         cjt $$7 = null;
         if (g($$6)) {
            $$7 = cju.pj;
         } else if ($$6.a(cju.pj) && $$6.c(cit.b) == $$4) {
            $$7 = cju.pi;
         } else if ($$6.a(cju.pi) && $$6.c(cit.b) == $$4) {
            $$7 = cju.ph;
         } else if ($$6.a(cju.ph) && $$6.c(cit.b) == $$4) {
            $$7 = cju.pg;
         }

         if ($$7 != null) {
            cvo $$8 = $$7.m().a(cit.b, $$4).a(cit.a, Boolean.valueOf($$6.p().a() == dpw.c));
            $$1.b($$5, $$8);
         }

      }
   }

   public static boolean g(cvo $$0) {
      return $$0.h() || $$0.a(cju.C) && $$0.p().e() == 8;
   }
}
