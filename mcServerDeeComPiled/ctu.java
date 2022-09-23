public class ctu extends cuf {
   public static final int b = 9;
   private hi<cax> c = hi.a(9, cax.b);

   protected ctu(ctk<?> $$0, gt $$1, cvo $$2) {
      super($$0, $$1, $$2);
   }

   public ctu(gt $$0, cvo $$1) {
      this(ctk.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(amn $$0) {
      this.e(null);
      int $$1 = -1;
      int $$2 = 1;

      for(int $$3 = 0; $$3 < this.c.size(); ++$$3) {
         if (!this.c.get($$3).b() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(cax $$0) {
      for(int $$1 = 0; $$1 < this.c.size(); ++$$1) {
         if (this.c.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected rq g() {
      return rq.c("container.dispenser");
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.c = hi.a(this.b(), cax.b);
      if (!this.d($$0)) {
         bad.b($$0, this.c);
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bad.a($$0, this.c);
      }

   }

   @Override
   protected hi<cax> f() {
      return this.c;
   }

   @Override
   protected void a(hi<cax> $$0) {
      this.c = $$0;
   }

   @Override
   protected bwm a(int $$0, bub $$1) {
      return new bxd($$0, $$1, this);
   }
}
