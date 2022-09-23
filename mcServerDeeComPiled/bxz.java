public class bxz extends byd {
   private final bxa a;
   private final buc b;
   private int c;

   public bxz(buc $$0, bxa $$1, bac $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
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
   protected void b(int $$0) {
      this.c += $$0;
   }

   @Override
   protected void b_(cax $$0) {
      if (this.c > 0) {
         $$0.a(this.b.s, this.b, this.c);
      }

      if (this.d instanceof bxx) {
         ((bxx)this.d).b(this.b);
      }

      this.c = 0;
   }

   @Override
   public void a(buc $$0, cax $$1) {
      this.b_($$1);
      hi<cax> $$2 = $$0.s.q().c(cds.a, this.a, $$0.s);

      for(int $$3 = 0; $$3 < $$2.size(); ++$$3) {
         cax $$4 = this.a.a($$3);
         cax $$5 = $$2.get($$3);
         if (!$$4.b()) {
            this.a.a($$3, 1);
            $$4 = this.a.a($$3);
         }

         if (!$$5.b()) {
            if ($$4.b()) {
               this.a.a($$3, $$5);
            } else if (cax.c($$4, $$5) && cax.a($$4, $$5)) {
               $$5.f($$4.K());
               this.a.a($$3, $$5);
            } else if (!this.b.fA().e($$5)) {
               this.b.a($$5, false);
            }
         }
      }

   }
}
