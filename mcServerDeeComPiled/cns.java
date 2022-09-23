import java.util.Map;
import java.util.function.Predicate;

public class cns extends cim {
   public static final int c = 1;
   public static final int d = 3;
   public static final cwo e = cwe.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   public static final Predicate<cht.c> f = $$0 -> $$0 == cht.c.b;
   public static final Predicate<cht.c> g = $$0 -> $$0 == cht.c.c;
   private final Predicate<cht.c> j;

   public cns(cvn.c $$0, Predicate<cht.c> $$1, Map<cat, hu> $$2) {
      super($$0, $$2);
      this.j = $$1;
      this.k(this.D.b().a(e, Integer.valueOf(1)));
   }

   @Override
   public boolean c(cvo $$0) {
      return $$0.c(e) == 3;
   }

   @Override
   protected boolean a(dpu $$0) {
      return $$0 == dpw.c && this.j == f;
   }

   @Override
   protected double a(cvo $$0) {
      return (6.0 + (double)((Integer)$$0.c(e)).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$1.y && $$3.bH() && this.a($$0, $$2, $$3)) {
         $$3.au();
         if ($$3.a($$1, $$2)) {
            this.d($$0, $$1, $$2);
         }
      }

   }

   protected void d(cvo $$0, cgx $$1, gt $$2) {
      e($$0, $$1, $$2);
   }

   public static void e(cvo $$0, cgx $$1, gt $$2) {
      int $$3 = $$0.c(e) - 1;
      cvo $$4 = $$3 == 0 ? cju.eA.m() : $$0.a(e, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(czv.c, $$2, czv.a.a($$4));
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cht.c $$3) {
      if (ckl.a($$1, $$3) && $$0.c(e) != 3 && this.j.test($$3)) {
         cvo $$4 = $$0.a(e);
         $$1.b($$2, $$4);
         $$1.a(czv.c, $$2, czv.a.a($$4));
      }
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(e);
   }

   @Override
   protected void a(cvo $$0, cgx $$1, gt $$2, dpu $$3) {
      if (!this.c($$0)) {
         cvo $$4 = $$0.a(e, Integer.valueOf($$0.c(e) + 1));
         $$1.b($$2, $$4);
         $$1.a(czv.c, $$2, czv.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
