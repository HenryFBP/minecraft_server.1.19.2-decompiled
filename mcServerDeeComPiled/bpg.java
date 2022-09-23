import javax.annotation.Nullable;

public class bpg extends bpa {
   private final bph bX = new bph(this);
   private static final int cn = 18000;
   private boolean co;
   private int cp;

   public bpg(bbr<? extends bpg> $$0, cgx $$1) {
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
   protected void fR() {
   }

   @Override
   protected ajv r() {
      super.r();
      return this.a(akp.a) ? ajw.sO : ajw.sK;
   }

   @Override
   protected ajv x_() {
      super.x_();
      return ajw.sL;
   }

   @Override
   protected ajv c(baw $$0) {
      super.c($$0);
      return ajw.sM;
   }

   @Override
   protected ajv aG() {
      if (this.y) {
         if (!this.bJ()) {
            return ajw.sR;
         }

         ++this.cm;
         if (this.cm > 5 && this.cm % 3 == 0) {
            return ajw.sP;
         }

         if (this.cm <= 5) {
            return ajw.sR;
         }
      }

      return ajw.sN;
   }

   @Override
   protected void d(float $$0) {
      if (this.y) {
         super.d(0.3F);
      } else {
         super.d(Math.min(0.1F, $$0 * 25.0F));
      }

   }

   @Override
   protected void gj() {
      if (this.aR()) {
         this.a(ajw.sQ, 0.4F, 1.0F);
      } else {
         super.gj();
      }

   }

   @Override
   public bch ey() {
      return bch.b;
   }

   @Override
   public double bt() {
      return super.bt() - 0.1875;
   }

   @Override
   public void w_() {
      super.w_();
      if (this.t() && this.cp++ >= 18000) {
         this.ah();
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cp);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.v($$0.q("SkeletonTrap"));
      this.cp = $$0.h("SkeletonTrapTime");
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   protected float eJ() {
      return 0.96F;
   }

   public boolean t() {
      return this.co;
   }

   public void v(boolean $$0) {
      if ($$0 != this.co) {
         this.co = $$0;
         if ($$0) {
            this.bS.a(1, this.bX);
         } else {
            this.bS.a(this.bX);
         }

      }
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      return bbr.aF.a((cgx)$$0);
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
}
