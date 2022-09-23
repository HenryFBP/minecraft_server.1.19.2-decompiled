public class csm extends crd implements csj {
   private final csj.a G;

   public csm(csj.a $$0, cvo $$1, cvn.c $$2) {
      super($$1, $$2);
      this.G = $$0;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(cvo $$0) {
      return csj.c($$0.b()).isPresent();
   }

   public csj.a q() {
      return this.G;
   }
}
