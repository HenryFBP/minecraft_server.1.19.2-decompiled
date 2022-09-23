import javax.annotation.Nullable;

public class cpm extends cjt {
   public static final cwf a = cpn.a;

   public cpm(cvn.c $$0) {
      super($$0);
      this.k(this.m().a(a, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, Boolean.valueOf($$0.q().r($$0.a())));
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if (!$$1.y) {
         boolean $$6 = $$0.c(a);
         if ($$6 != $$1.r($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(a), 2);
            }
         }

      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(a) && !$$1.r($$2)) {
         $$1.a($$2, $$0.a(a), 2);
      }

   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }
}
