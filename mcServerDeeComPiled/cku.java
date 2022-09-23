import javax.annotation.Nullable;

public class cku extends cnf implements cjv {
   public static final int a = 2;
   public static final cwo b = cwe.ar;
   protected static final int c = 4;
   protected static final int d = 5;
   protected static final int e = 2;
   protected static final int f = 6;
   protected static final int g = 7;
   protected static final int h = 3;
   protected static final int i = 8;
   protected static final int j = 9;
   protected static final int k = 4;
   protected static final dxj[] l = new dxj[]{
      cjt.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cjt.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cjt.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final dxj[] m = new dxj[]{
      cjt.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cjt.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cjt.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final dxj[] n = new dxj[]{
      cjt.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cjt.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cjt.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final dxj[] E = new dxj[]{
      cjt.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cjt.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cjt.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public cku(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(aD, gy.c).a(b, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.c(b) < 2;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.w.a(5) == 0) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 + 1)), 2);
         }
      }

   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2.a($$0.c(aD)));
      return $$3.a(akl.x);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      int $$4 = $$0.c(b);
      switch((gy)$$0.c(aD)) {
         case d:
            return E[$$4];
         case c:
         default:
            return n[$$4];
         case e:
            return m[$$4];
         case f:
            return l[$$4];
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = this.m();
      cha $$2 = $$0.q();
      gt $$3 = $$0.a();

      for(gy $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aD, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == $$0.c(aD) && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return $$2.c(b) < 2;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      $$0.a($$2, $$3.a(b, Integer.valueOf($$3.c(b) + 1)), 2);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(aD, b);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
