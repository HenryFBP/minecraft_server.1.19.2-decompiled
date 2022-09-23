public class cmf extends cjt {
   public static final cwo a = cwe.aQ;
   protected static final dxj b = cjt.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int c = 7;

   protected cmf(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == gy.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2.b());
      return !$$3.d().b() || $$3.b() instanceof cmh || $$3.b() instanceof cvg;
   }

   @Override
   public cvo a(ccx $$0) {
      return !this.m().a((cha)$$0.q(), $$0.a()) ? cju.j.m() : super.a($$0);
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!$$0.a($$1, $$2)) {
         d($$0, $$1, $$2);
      }

   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      int $$4 = $$0.c(a);
      if (!a((cha)$$1, $$2) && !$$1.t($$2.b())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(a, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cgd)$$1, $$2)) {
            d($$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(7)), 2);
      }

   }

   @Override
   public void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, float $$4) {
      if (!$$0.y && $$0.w.i() < $$4 - 0.5F && $$3 instanceof bcc && ($$3 instanceof buc || $$0.W().b(cgt.c)) && $$3.cW() * $$3.cW() * $$3.cX() > 0.512F) {
         d($$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void d(cvo $$0, cgx $$1, gt $$2) {
      $$1.b($$2, a($$0, cju.j.m(), $$1, $$2));
   }

   private static boolean a(cgd $$0, gt $$1) {
      cjt $$2 = $$0.a_($$1.b()).b();
      return $$2 instanceof clf || $$2 instanceof crf || $$2 instanceof civ;
   }

   private static boolean a(cha $$0, gt $$1) {
      for(gt $$2 : gt.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(akp.a)) {
            return true;
         }
      }

      return false;
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
