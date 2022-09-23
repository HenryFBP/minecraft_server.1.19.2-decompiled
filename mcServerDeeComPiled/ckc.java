public class ckc extends cjt {
   public static final cwo a = cwe.aw;
   public static final int b = 15;
   protected static final int c = 1;
   protected static final dxj d = cjt.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final dxj e = cjt.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   protected ckc(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }

   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      gt $$4 = $$2.b();
      if ($$1.x($$4)) {
         int $$5 = 1;

         while($$1.a_($$2.c($$5)).a(this)) {
            ++$$5;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(a);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               cvo $$7 = $$0.a(a, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$6 + 1)), 4);
            }

         }
      }
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return d;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return e;
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
      for(gy $$3 : gy.c.a) {
         cvo $$4 = $$1.a_($$2.a($$3));
         dpz $$5 = $$4.d();
         if ($$5.b() || $$1.b_($$2.a($$3)).a(akp.b)) {
            return false;
         }
      }

      cvo $$6 = $$1.a_($$2.c());
      return ($$6.a(cju.cZ) || $$6.a(cju.E) || $$6.a(cju.F)) && !$$1.a_($$2.b()).d().a();
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      $$3.a(baw.j, 1.0F);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
