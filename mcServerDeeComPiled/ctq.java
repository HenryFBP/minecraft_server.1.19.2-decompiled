public class ctq extends cti {
   private int a;

   public ctq(gt $$0, cvo $$1) {
      super(ctk.r, $$0, $$1);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a = $$0.h("OutputSignal");
   }

   public int c() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
