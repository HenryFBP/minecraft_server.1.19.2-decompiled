public class bxt extends byd {
   private final bxr a;
   private final buc b;
   private int c;
   private final cfu h;

   public bxt(buc $$0, cfu $$1, bxr $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cax $$0) {
      return false;
   }

   @Override
   public cax a(int $$0) {
      if (this.f()) {
         this.c += Math.min($$0, this.e().K());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cax $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cax $$0) {
      $$0.a(this.b.s, this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(buc $$0, cax $$1) {
      this.b_($$1);
      cfv $$2 = this.a.g();
      if ($$2 != null) {
         cax $$3 = this.a.a(0);
         cax $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(akg.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.fJ() + $$2.o());
      }

   }
}
