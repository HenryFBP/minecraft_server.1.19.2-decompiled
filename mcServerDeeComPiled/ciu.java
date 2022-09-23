import javax.annotation.Nullable;

public class ciu extends cme {
   public static final cwi a = cnf.aD;
   private static final dxj b = cjt.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final dxj c = cjt.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final dxj d = cjt.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final dxj e = cjt.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final dxj f = cjt.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final dxj g = cjt.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final dxj h = cjt.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final dxj i = dxg.a(b, c, d, e);
   private static final dxj j = dxg.a(b, f, g, h);
   private static final rq k = rq.c("container.repair");
   private static final float l = 2.0F;
   private static final int m = 40;

   public ciu(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c));
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.g().h());
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(akg.aC);
         return baj.b;
      }
   }

   @Nullable
   @Override
   public bam b(cvo $$0, cgx $$1, gt $$2) {
      return new bap(($$2x, $$3, $$4) -> new bwo($$2x, $$3, bwx.a($$1, $$2)), k);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      gy $$4 = $$0.c(a);
      return $$4.o() == gy.a.a ? i : j;
   }

   @Override
   protected void a(bqu $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, cvo $$3, bqu $$4) {
      if (!$$4.aM()) {
         $$0.c(1031, $$1, 0);
      }

   }

   @Override
   public void a(cgx $$0, gt $$1, bqu $$2) {
      if (!$$2.aM()) {
         $$0.c(1029, $$1, 0);
      }

   }

   @Override
   public baw b() {
      return baw.q;
   }

   @Nullable
   public static cvo e(cvo $$0) {
      if ($$0.a(cju.fT)) {
         return cju.fU.m().a(a, (gy)$$0.c(a));
      } else {
         return $$0.a(cju.fU) ? cju.fV.m().a(a, (gy)$$0.c(a)) : null;
      }
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   @Override
   public int d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
