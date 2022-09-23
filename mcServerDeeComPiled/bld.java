import javax.annotation.Nullable;

public class bld extends blb {
   @Nullable
   private gt p;

   public bld(bce $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   public dql a(gt $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public dql a(bbn $$0, int $$1) {
      this.p = $$0.da();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bbn $$0, double $$1) {
      dql $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.da();
         this.d = $$1;
         return true;
      }
   }

   @Override
   public void c() {
      if (!this.l()) {
         super.c();
      } else {
         if (this.p != null) {
            if (!this.p.a(this.a.cY(), (double)this.a.cW())
               && (!(this.a.dh() > (double)this.p.v()) || !new gt((double)this.p.u(), this.a.dh(), (double)this.p.w()).a(this.a.cY(), (double)this.a.cW()))) {
               this.a.A().a((double)this.p.u(), (double)this.p.v(), (double)this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }

      }
   }
}
