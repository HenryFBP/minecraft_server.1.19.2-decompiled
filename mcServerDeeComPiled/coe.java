import javax.annotation.Nullable;

public class coe extends cpy implements cql {
   public static final cwo a = cwe.at;
   public static final int b = 4;
   private static final dxj[] g = new dxj[]{
      cjt.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cjt.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cjt.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cjt.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cjt.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final cwf h = cwe.C;
   public static final cwf c = cwe.j;
   private static final float i = 0.85F;

   public coe(cvn.c $$0) {
      super(new cvb(0.85F), $$0);
      this.k(this.D.b().a(d, Integer.valueOf(0)).a(a, Integer.valueOf(0)).a(h, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d).a(a).a(h).a(c);
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cju.da);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == dpw.c;
      return super.a($$0).a(h, Boolean.valueOf($$2)).a(a, Integer.valueOf(4));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      dwq $$4 = $$0.n($$1, $$2);
      dxj $$5;
      if (!$$0.c(c)) {
         $$5 = g[4];
      } else {
         $$5 = g[$$0.c(a)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return h($$0) ? $$1.a_($$2.b()).a(cju.ay) : super.a($$0, $$1, $$2);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$1 == gy.b && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(h) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!h($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }

      } else {
         if (!n($$0)) {
            $$1.a($$2, $$0.a(a), 2);
         }

      }
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(a), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }

   }

   private static boolean h(cvo $$0) {
      return $$0.c(c);
   }

   private static boolean n(cvo $$0) {
      return $$0.c(a) == 4;
   }

   public static cvo c() {
      return b(0);
   }

   public static cvo b(int $$0) {
      return cju.A.m().a(c, Boolean.valueOf(true)).a(a, Integer.valueOf($$0));
   }
}
