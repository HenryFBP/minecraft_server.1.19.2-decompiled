public class bwt extends bwm {
   private static final int k = 9;
   private final bac l;
   private final int m;

   private bwt(bxq<?> $$0, int $$1, bub $$2, int $$3) {
      this($$0, $$1, $$2, new bao(9 * $$3), $$3);
   }

   public static bwt a(int $$0, bub $$1) {
      return new bwt(bxq.a, $$0, $$1, 1);
   }

   public static bwt b(int $$0, bub $$1) {
      return new bwt(bxq.b, $$0, $$1, 2);
   }

   public static bwt c(int $$0, bub $$1) {
      return new bwt(bxq.c, $$0, $$1, 3);
   }

   public static bwt d(int $$0, bub $$1) {
      return new bwt(bxq.d, $$0, $$1, 4);
   }

   public static bwt e(int $$0, bub $$1) {
      return new bwt(bxq.e, $$0, $$1, 5);
   }

   public static bwt f(int $$0, bub $$1) {
      return new bwt(bxq.f, $$0, $$1, 6);
   }

   public static bwt a(int $$0, bub $$1, bac $$2) {
      return new bwt(bxq.c, $$0, $$1, $$2, 3);
   }

   public static bwt b(int $$0, bub $$1, bac $$2) {
      return new bwt(bxq.f, $$0, $$1, $$2, 6);
   }

   public bwt(bxq<?> $$0, int $$1, bub $$2, bac $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for(int $$6 = 0; $$6 < this.m; ++$$6) {
         for(int $$7 = 0; $$7 < 9; ++$$7) {
            this.a(new byd($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for(int $$8 = 0; $$8 < 3; ++$$8) {
         for(int $$9 = 0; $$9 < 9; ++$$9) {
            this.a(new byd($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for(int $$10 = 0; $$10 < 9; ++$$10) {
         this.a(new byd($$2, $$10, 8 + $$10 * 18, 161 + $$5));
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
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cax.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
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

   public bac l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
