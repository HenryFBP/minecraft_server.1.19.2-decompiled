public class cnl extends cjt implements cmb, cmq {
   public static final cwm<ha> a = cwe.T;

   protected cnl(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, ha.k));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public cvo a(ccx $$0) {
      gy $$1 = $$0.k();
      gy $$2;
      if ($$1.o() == gy.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = gy.b;
      }

      return this.m().a(a, ha.a($$1, $$2));
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cub($$0, $$1);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cti $$6 = $$1.c_($$2);
      if ($$6 instanceof cub && $$3.fY()) {
         $$3.a((cub)$$6);
         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   public static boolean a(dot.c $$0, dot.c $$1) {
      gy $$2 = h($$0.b);
      gy $$3 = h($$1.b);
      gy $$4 = n($$0.b);
      gy $$5 = n($$1.b);
      cub.a $$6 = (cub.a)cub.a.a($$0.c.l("joint")).orElseGet(() -> $$2.o().d() ? cub.a.b : cub.a.a);
      boolean $$7 = $$6 == cub.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c.l("target").equals($$1.c.l("name"));
   }

   public static gy h(cvo $$0) {
      return ((ha)$$0.c(a)).a();
   }

   public static gy n(cvo $$0) {
      return ((ha)$$0.c(a)).b();
   }
}
