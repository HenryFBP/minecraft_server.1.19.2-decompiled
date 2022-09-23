import javax.annotation.Nullable;

public class bpk extends bpa {
   public bpk(bbr<? extends bpk> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public static bdc.a q() {
      return ge().a(bdd.a, 15.0).a(bdd.d, 0.2F);
   }

   @Override
   protected void a(amn $$0) {
      this.a(bdd.m).a(this.c($$0));
   }

   @Override
   public bch ey() {
      return bch.b;
   }

   @Override
   protected ajv r() {
      super.r();
      return ajw.xZ;
   }

   @Override
   protected ajv x_() {
      super.x_();
      return ajw.ya;
   }

   @Override
   protected ajv c(baw $$0) {
      super.c($$0);
      return ajw.yb;
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      return bbr.bk.a((cgx)$$0);
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (!this.fS()) {
         return baj.d;
      } else if (this.y_()) {
         return super.b($$0, $$1);
      } else if ($$0.fo()) {
         this.b($$0);
         return baj.a(this.s.y);
      } else if (this.bJ()) {
         return super.b($$0, $$1);
      } else {
         if (!$$2.b()) {
            if ($$2.a(caz.mn) && !this.d()) {
               this.b($$0);
               return baj.a(this.s.y);
            }

            baj $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         this.e($$0);
         return baj.a(this.s.y);
      }
   }

   @Override
   protected void fR() {
   }
}
