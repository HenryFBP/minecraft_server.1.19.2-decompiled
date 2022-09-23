import java.util.Optional;

public abstract class cmy extends cmx implements cjv {
   protected cmy(cvn.c $$0, gy $$1, dxj $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected cvo a(cvo $$0, cvo $$1) {
      return $$1;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cmz $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, dpw.c, dpw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(this.c());
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      Optional<gt> $$4 = this.a($$0, $$1, $$2.b());
      return $$4.isPresent() && this.c().g($$0.a_(((gt)$$4.get()).a(this.a)));
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      Optional<gt> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         cvo $$5 = $$0.a_((gt)$$4.get());
         ((cmz)$$5.b()).a($$0, $$1, (gt)$$4.get(), $$5);
      }

   }

   private Optional<gt> a(cgd $$0, gt $$1, cjt $$2) {
      return n.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().l()) ? false : $$2;
   }

   @Override
   protected cjt b() {
      return this;
   }
}
