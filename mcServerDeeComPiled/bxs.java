public class bxs extends bwm {
   protected static final int k = 0;
   protected static final int l = 1;
   protected static final int m = 2;
   private static final int n = 3;
   private static final int o = 30;
   private static final int p = 30;
   private static final int q = 39;
   private static final int r = 136;
   private static final int s = 162;
   private static final int t = 220;
   private static final int u = 37;
   private final cfu v;
   private final bxr w;
   private int x;
   private boolean y;
   private boolean z;

   public bxs(int $$0, bub $$1) {
      this($$0, $$1, new btm($$1.l));
   }

   public bxs(int $$0, bub $$1, cfu $$2) {
      super(bxq.s, $$0);
      this.v = $$2;
      this.w = new bxr($$2);
      this.a(new byd(this.w, 0, 136, 37));
      this.a(new byd(this.w, 1, 162, 37));
      this.a(new bxt($$1.l, $$2, this.w, 2, 220, 37));

      for(int $$3 = 0; $$3 < 3; ++$$3) {
         for(int $$4 = 0; $$4 < 9; ++$$4) {
            this.a(new byd($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for(int $$5 = 0; $$5 < 9; ++$$5) {
         this.a(new byd($$1, $$5, 108 + $$5 * 18, 142));
      }

   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bac $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(buc $$0) {
      return this.v.fK() == $$0;
   }

   public int l() {
      return this.v.fJ();
   }

   public int m() {
      return this.w.h();
   }

   public void f(int $$0) {
      this.v.t($$0);
   }

   public int n() {
      return this.x;
   }

   public void g(int $$0) {
      this.x = $$0;
   }

   public void b(boolean $$0) {
      this.z = $$0;
   }

   public boolean o() {
      return this.z;
   }

   @Override
   public boolean a(cax $$0, byd $$1) {
      return false;
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
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
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

   private void r() {
      if (!this.v.fS()) {
         bbn $$0 = (bbn)this.v;
         $$0.W().a($$0.df(), $$0.dh(), $$0.dl(), this.v.fO(), ajx.g, 1.0F, 1.0F, false);
      }

   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.v.e(null);
      if (!this.v.fS()) {
         if (!$$0.bo() || $$0 instanceof agh && ((agh)$$0).t()) {
            cax $$1 = this.w.b(0);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof agh) {
            $$0.fA().f(this.w.b(0));
            $$0.fA().f(this.w.b(1));
         }

      }
   }

   public void h(int $$0) {
      if (this.p().size() > $$0) {
         cax $$1 = this.w.a(0);
         if (!$$1.b()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cax $$2 = this.w.a(1);
         if (!$$2.b()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).b() && this.w.a(1).b()) {
            cax $$3 = ((cfv)this.p().get($$0)).b();
            this.c(0, $$3);
            cax $$4 = ((cfv)this.p().get($$0)).c();
            this.c(1, $$4);
         }

      }
   }

   private void c(int $$0, cax $$1) {
      if (!$$1.b()) {
         for(int $$2 = 3; $$2 < 39; ++$$2) {
            cax $$3 = this.i.get($$2).e();
            if (!$$3.b() && cax.e($$1, $$3)) {
               cax $$4 = this.w.a($$0);
               int $$5 = $$4.b() ? 0 : $$4.K();
               int $$6 = Math.min($$1.f() - $$5, $$3.K());
               cax $$7 = $$3.o();
               int $$8 = $$5 + $$6;
               $$3.g($$6);
               $$7.e($$8);
               this.w.a($$0, $$7);
               if ($$8 >= $$1.f()) {
                  break;
               }
            }
         }
      }

   }

   public void a(cfw $$0) {
      this.v.a($$0);
   }

   public cfw p() {
      return this.v.fM();
   }

   public boolean q() {
      return this.y;
   }
}
