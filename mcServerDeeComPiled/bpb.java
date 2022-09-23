import javax.annotation.Nullable;

public class bpb extends boz {
   public bpb(bbr<? extends bpb> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected ajv r() {
      super.r();
      return ajw.eA;
   }

   @Override
   protected ajv gd() {
      super.gd();
      return ajw.eB;
   }

   @Override
   protected ajv x_() {
      super.x_();
      return ajw.eD;
   }

   @Nullable
   @Override
   protected ajv gc() {
      return ajw.eE;
   }

   @Override
   protected ajv c(baw $$0) {
      super.c($$0);
      return ajw.eF;
   }

   @Override
   public boolean a(bne $$0) {
      if ($$0 == this) {
         return false;
      } else if (!($$0 instanceof bpb) && !($$0 instanceof bpc)) {
         return false;
      } else {
         return this.gk() && ((bpa)$$0).gk();
      }
   }

   @Override
   public bbk a(agg $$0, bbk $$1) {
      bbr<? extends bpa> $$2 = $$1 instanceof bpc ? bbr.aj : bbr.s;
      bpa $$3 = $$2.a((cgx)$$0);
      this.a($$1, $$3);
      return $$3;
   }
}
