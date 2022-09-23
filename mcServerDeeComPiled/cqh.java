import javax.annotation.Nullable;

public class cqh extends cka implements cjv, cql {
   public static final int a = 4;
   public static final cwo b = cwe.aS;
   public static final cwf c = cwe.C;
   protected static final dxj d = cjt.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final dxj e = cjt.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final dxj f = cjt.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final dxj g = cjt.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   protected cqh(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(1)).a(c, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(b, Integer.valueOf(Math.min(4, $$1.c(b) + 1)));
      } else {
         dpv $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == dpw.c;
         return super.a($$0).a(c, Boolean.valueOf($$3));
      }
   }

   public static boolean h(cvo $$0) {
      return !$$0.c(c);
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return !$$0.k($$1, $$2).a(gy.b).b() || $$0.d($$1, $$2, gy.b);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if (!$$0.a($$3, $$4)) {
         return cju.a.m();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, dpw.c, dpw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      return !$$1.h() && $$1.n().a(this.l()) && $$0.c(b) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch($$0.c(b)) {
         case 1:
         default:
            return d;
         case 2:
            return e;
         case 3:
            return f;
         case 4:
            return g;
      }
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(c) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      if (!h($$3) && $$0.a_($$2.c()).a(akl.al)) {
         int $$4 = 5;
         int $$5 = 1;
         int $$6 = 2;
         int $$7 = 0;
         int $$8 = $$2.u() - 2;
         int $$9 = 0;

         for(int $$10 = 0; $$10 < 5; ++$$10) {
            for(int $$11 = 0; $$11 < $$5; ++$$11) {
               int $$12 = 2 + $$2.v() - 1;

               for(int $$13 = $$12 - 2; $$13 < $$12; ++$$13) {
                  gt $$14 = new gt($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cju.C)) {
                     cvo $$15 = $$0.a_($$14.c());
                     if ($$15.a(akl.al)) {
                        $$0.a($$14, cju.lG.m().a(b, Integer.valueOf($$1.a(4) + 1)), 3);
                     }
                  }
               }
            }

            if ($$7 < 2) {
               $$5 += 2;
               ++$$9;
            } else {
               $$5 -= 2;
               --$$9;
            }

            ++$$7;
         }

         $$0.a($$2, $$3.a(b, Integer.valueOf(4)), 2);
      }

   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
