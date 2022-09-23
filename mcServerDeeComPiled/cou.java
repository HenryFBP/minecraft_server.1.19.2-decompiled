import javax.annotation.Nullable;

public class cou extends cjt {
   public static final cwm<cwp> a = cwe.bg;
   public static final cwf b = cwe.w;
   public static final cwo c = cwe.aR;

   public cou(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, cwp.a).a(c, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, cwp.a($$0.q().a_($$0.a().c())));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == gy.a ? $$0.a(a, cwp.a($$2)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      boolean $$6 = $$1.r($$2);
      if ($$6 != $$0.c(b)) {
         if ($$6) {
            this.a(null, $$1, $$2);
         }

         $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)), 3);
      }

   }

   private void a(@Nullable bbn $$0, cgx $$1, gt $$2) {
      if ($$1.a_($$2.b()).h()) {
         $$1.a($$2, this, 0, 0);
         $$1.a($$0, czv.H, $$2);
      }
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$1, $$2);
         $$3.a(akg.ag);
         return baj.b;
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
      if (!$$1.y) {
         this.a($$3, $$1, $$2);
         $$3.a(akg.af);
      }
   }

   @Override
   public boolean a(cvo $$0, cgx $$1, gt $$2, int $$3, int $$4) {
      int $$5 = $$0.c(c);
      float $$6 = (float)Math.pow(2.0, (double)($$5 - 12) / 12.0);
      $$1.a(null, $$2, ((cwp)$$0.c(a)).a(), ajx.c, 3.0F, $$6);
      $$1.a(io.U, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$5 / 24.0, 0.0, 0.0);
      return true;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c);
   }
}
