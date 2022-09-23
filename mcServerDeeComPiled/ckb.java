import java.util.List;
import javax.annotation.Nullable;

public abstract class ckb extends cmc {
   public static final cwf a = cwe.w;
   private static final int K = 1;
   private static final int L = 2;
   protected static final int b = 2;
   protected static final int c = 3;
   protected static final dxj d = cjt.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final dxj e = cjt.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final dxj f = cjt.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final dxj g = cjt.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final dxj h = cjt.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final dxj i = cjt.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final dxj j = cjt.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final dxj k = cjt.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final dxj l = cjt.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final dxj m = cjt.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final dxj n = cjt.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final dxj E = cjt.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final dxj F = cjt.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final dxj G = cjt.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final dxj H = cjt.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final dxj I = cjt.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final boolean M;

   protected ckb(boolean $$0, cvn.c $$1) {
      super($$1);
      this.k(this.D.b().a(aD, gy.c).a(a, Boolean.valueOf(false)).a(J, cwa.b));
      this.M = $$0;
   }

   private int b() {
      return this.M ? 30 : 20;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      gy $$4 = $$0.c(aD);
      boolean $$5 = $$0.c(a);
      switch((cwa)$$0.c(J)) {
         case a:
            if ($$4.o() == gy.a.a) {
               return $$5 ? n : f;
            }

            return $$5 ? E : g;
         case b:
            switch($$4) {
               case f:
                  return $$5 ? I : k;
               case e:
                  return $$5 ? H : j;
               case d:
                  return $$5 ? G : i;
               case c:
               default:
                  return $$5 ? F : h;
            }
         case c:
         default:
            if ($$4.o() == gy.a.a) {
               return $$5 ? l : d;
            } else {
               return $$5 ? m : e;
            }
      }
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$0.c(a)) {
         return baj.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, czv.a, $$2);
         return baj.a($$1.y);
      }
   }

   public void d(cvo $$0, cgx $$1, gt $$2) {
      $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.b());
   }

   protected void a(@Nullable buc $$0, cgy $$1, gt $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), ajx.e, 0.3F, $$3 ? 0.6F : 0.5F);
   }

   protected abstract ajv a(boolean var1);

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(a)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(a) ? 15 : 0;
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(a) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(a)) {
         if (this.M) {
            this.e($$0, $$1, $$2);
         } else {
            $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
            this.f($$0, $$1, $$2);
            this.a(null, $$1, $$2, false);
            $$1.a(null, czv.e, $$2);
         }

      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$1.y && this.M && !$$0.c(a)) {
         this.e($$0, $$1, $$2);
      }
   }

   private void e(cvo $$0, cgx $$1, gt $$2) {
      List<? extends bbn> $$3 = $$1.a(bui.class, $$0.j($$1, $$2).a().a($$2));
      boolean $$4 = !$$3.isEmpty();
      boolean $$5 = $$0.c(a);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a((bbn)$$3.stream().findFirst().orElse(null), $$4 ? czv.a : czv.e, $$2);
      }

      if ($$4) {
         $$1.a(new gt($$2), this, this.b());
      }

   }

   private void f(cvo $$0, cgx $$1, gt $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(aD, a, J);
   }
}
