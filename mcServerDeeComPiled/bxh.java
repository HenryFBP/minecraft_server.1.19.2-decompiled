public class bxh extends byd {
   private final buc a;
   private int b;

   public bxh(buc $$0, bac $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cax $$0) {
      return false;
   }

   @Override
   public cax a(int $$0) {
      if (this.f()) {
         this.b += Math.min($$0, this.e().K());
      }

      return super.a($$0);
   }

   @Override
   public void a(buc $$0, cax $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cax $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cax $$0) {
      $$0.a(this.a.s, this.a, this.b);
      if (this.a instanceof agh && this.d instanceof csx) {
         ((csx)this.d).a((agh)this.a);
      }

      this.b = 0;
   }
}
