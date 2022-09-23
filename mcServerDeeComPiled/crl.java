public class crl extends cjt {
   public static final cwo a = cwe.aw;
   protected static final float b = 6.0F;
   protected static final dxj c = cjt.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected crl(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }

   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.x($$2.b())) {
         int $$4 = 1;

         while($$1.a_($$2.c($$4)).a(this)) {
            ++$$4;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(a);
            if ($$5 == 15) {
               $$1.b($$2.b(), this.m());
               $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2.c());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(akl.ac) || $$3.a(cju.E) || $$3.a(cju.F)) {
            gt $$4 = $$2.c();

            for(gy $$5 : gy.c.a) {
               cvo $$6 = $$1.a_($$4.a($$5));
               dpv $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(akp.a) || $$6.a(cju.ju)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }
}
