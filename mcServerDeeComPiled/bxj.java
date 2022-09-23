public class bxj extends bwm {
   public static final int k = 5;
   private final bac l;

   public bxj(int $$0, bub $$1) {
      this($$0, $$1, new bao(5));
   }

   public bxj(int $$0, bub $$1, bac $$2) {
      super(bxq.p, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.l);
      int $$3 = 51;

      for(int $$4 = 0; $$4 < 5; ++$$4) {
         this.a(new byd($$2, $$4, 44 + $$4 * 18, 20));
      }

      for(int $$5 = 0; $$5 < 3; ++$$5) {
         for(int $$6 = 0; $$6 < 9; ++$$6) {
            this.a(new byd($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for(int $$7 = 0; $$7 < 9; ++$$7) {
         this.a(new byd($$1, $$7, 8 + $$7 * 18, 109));
      }

   }

   @Override
   public boolean a(buc $$0) {
      return this.l.a($$0);
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cax.b;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cax.b;
         }

         if ($$4.b()) {
            $$3.d(cax.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.l.c_($$0);
   }
}
