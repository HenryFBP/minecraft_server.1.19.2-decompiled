public class beq extends bep {
   public beq(int $$0, float $$1) {
      super($$0, $$1, 1);
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      bvj $$2 = $$0.c($$1.da());
      return super.a($$0, $$1) && $$2 != null && $$2.v() && !$$2.e() && !$$2.f();
   }
}
