public class cow extends clm {
   public static final cwf b = cwe.w;

   public cow(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.d).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(b)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cgy $$0, gt $$1) {
      if (!$$0.k_() && !$$0.K().a($$1, this)) {
         $$0.a($$1, this, 2);
      }

   }

   protected void a(cgx $$0, gt $$1, cvo $$2) {
      gy $$3 = $$2.c(a);
      gt $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(b) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.k_() && $$0.c(b) && !$$1.K().a($$2, this)) {
            cvo $$5 = $$0.a(b, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }

      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y && $$0.c(b) && $$1.K().a($$2, this)) {
            this.a($$1, $$2, $$0.a(b, Boolean.valueOf(false)));
         }

      }
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.d().g().g());
   }
}
