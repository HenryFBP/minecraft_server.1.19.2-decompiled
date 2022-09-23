public class cqb extends clt implements cqa {
   public cqb(cvn.c $$0) {
      super($$0, azl.a(1));
   }

   @Override
   public int a(cqf.a $$0, cgy $$1, gt $$2, amn $$3, cqf $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         gt $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               gt $$10 = $$7.b();
               cvo $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.r().e(), ajx.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(cqf $$0, gt $$1, gt $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ami.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ami.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private cvo a(cgy $$0, gt $$1, amn $$2, boolean $$3) {
      cvo $$4;
      if ($$2.a(11) == 0) {
         $$4 = cju.ps.m().a(cqe.c, Boolean.valueOf($$3));
      } else {
         $$4 = cju.po.m();
      }

      return $$4.b(cwe.C) && !$$0.b_($$1).c() ? $$4.a(cwe.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cgy $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1.b());
      if ($$2.h() || $$2.a(cju.C) && $$2.p().b(dpw.c)) {
         int $$3 = 0;

         for(gt $$4 : gt.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            cvo $$5 = $$0.a_($$4);
            if ($$5.a(cju.po) || $$5.a(cju.ps)) {
               ++$$3;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b() {
      return false;
   }
}
