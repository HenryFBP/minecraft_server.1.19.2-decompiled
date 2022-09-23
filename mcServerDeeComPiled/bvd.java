import javax.annotation.Nullable;

public class bvd extends bva {
   public bvd(bbr<? extends bvd> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bvd(cgx $$0, bcc $$1) {
      super(bbr.aR, $$1, $$0);
   }

   @Override
   protected cat i() {
      return caz.qn;
   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      $$0.a().a(baw.b(this, this.x()), 0.0F);
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);

      for(int $$1 = 0; $$1 < 32; ++$$1) {
         this.s.a(io.W, this.df(), this.dh() + this.R.j() * 2.0, this.dl(), this.R.k(), 0.0, this.R.k());
      }

      if (!this.s.y && !this.dt()) {
         bbn $$2 = this.x();
         if ($$2 instanceof agh $$3) {
            if ($$3.b.a().h() && $$3.s == this.s && !$$3.fj()) {
               if (this.R.i() < 0.05F && this.s.W().b(cgt.e)) {
                  brh $$4 = bbr.z.a(this.s);
                  $$4.b($$2.df(), $$2.dh(), $$2.dl(), $$2.dq(), $$2.ds());
                  this.s.b($$4);
               }

               if ($$2.bI()) {
                  $$3.a(this.df(), this.dh(), this.dl());
               } else {
                  $$2.b(this.df(), this.dh(), this.dl());
               }

               $$2.m();
               $$2.a(baw.k, 5.0F);
            }
         } else if ($$2 != null) {
            $$2.b(this.df(), this.dh(), this.dl());
            $$2.m();
         }

         this.ah();
      }

   }

   @Override
   public void k() {
      bbn $$0 = this.x();
      if ($$0 instanceof buc && !$$0.bo()) {
         this.ah();
      } else {
         super.k();
      }

   }

   @Nullable
   @Override
   public bbn b(agg $$0) {
      bbn $$1 = this.x();
      if ($$1 != null && $$1.s.ab() != $$0.ab()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
