public class bya extends bwm {
   private static final int k = 27;
   private final bac l;

   public bya(int $$0, bub $$1) {
      this($$0, $$1, new bao(27));
   }

   public bya(int $$0, bub $$1, bac $$2) {
      super(bxq.t, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.l);
      int $$3 = 3;
      int $$4 = 9;

      for(int $$5 = 0; $$5 < 3; ++$$5) {
         for(int $$6 = 0; $$6 < 9; ++$$6) {
            this.a(new byb($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for(int $$7 = 0; $$7 < 3; ++$$7) {
         for(int $$8 = 0; $$8 < 9; ++$$8) {
            this.a(new byd($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for(int $$9 = 0; $$9 < 9; ++$$9) {
         this.a(new byd($$1, $$9, 8 + $$9 * 18, 142));
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
