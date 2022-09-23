import javax.annotation.Nullable;

public class ckz extends cjg implements cql {
   public static final cwf a = cwe.C;
   private static final int c = 3;
   protected static final dxj b = cjt.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public ckz(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$2, ctk.y, $$0.y ? ctr::a : ctr::b);
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.b;
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(a) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof ctd) {
            ((ctd)$$5).a($$4.x());
         }
      }

   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      return this.m().a(a, Boolean.valueOf($$1.a(akp.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
