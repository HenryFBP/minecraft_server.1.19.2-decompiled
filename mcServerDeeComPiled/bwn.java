public abstract class bwn extends bxv<bac> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bac u;
   private final bww v;
   protected final cgx p;
   private final cds<? extends cdb> w;
   private final bxw x;

   protected bwn(bxq<?> $$0, cds<? extends cdb> $$1, bxw $$2, int $$3, bub $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bao(3), new byc(4));
   }

   protected bwn(bxq<?> $$0, cds<? extends cdb> $$1, bxw $$2, int $$3, bub $$4, bac $$5, bww $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.l.s;
      this.a(new byd($$5, 0, 56, 17));
      this.a(new bxf(this, $$5, 1, 56, 53));
      this.a(new bxh($$4.l, $$5, 2, 116, 35));

      for(int $$7 = 0; $$7 < 3; ++$$7) {
         for(int $$8 = 0; $$8 < 9; ++$$8) {
            this.a(new byd($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for(int $$9 = 0; $$9 < 9; ++$$9) {
         this.a(new byd($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(bug $$0) {
      if (this.u instanceof byg) {
         ((byg)this.u).a($$0);
      }

   }

   @Override
   public void l() {
      this.b(0).d(cax.b);
      this.b(2).d(cax.b);
   }

   @Override
   public boolean a(cdp<? super bac> $$0) {
      return $$0.a(this.u, this.p);
   }

   @Override
   public int m() {
      return 2;
   }

   @Override
   public int n() {
      return 1;
   }

   @Override
   public int o() {
      return 1;
   }

   @Override
   public int p() {
      return 3;
   }

   @Override
   public boolean a(buc $$0) {
      return this.u.a($$0);
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cax.b;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cax.b;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cax.b;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cax.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cax.b;
         }

         if ($$4.b()) {
            $$3.d(cax.b);
         } else {
            $$3.d();
         }

         if ($$4.K() == $$2.K()) {
            return cax.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cax $$0) {
      return this.p.q().a(this.w, new bao($$0), this.p).isPresent();
   }

   protected boolean d(cax $$0) {
      return csx.b($$0);
   }

   public int q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? $$0 * 24 / $$1 : 0;
   }

   public int r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return this.v.a(0) * 13 / $$0;
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public bxw t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
