import com.mojang.datafixers.util.Pair;

public class bxl extends bxv<bxa> {
   public static final int k = 0;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 5;
   public static final int o = 5;
   public static final int p = 9;
   public static final int q = 9;
   public static final int r = 36;
   public static final int s = 36;
   public static final int t = 45;
   public static final int u = 45;
   public static final abb v = new abb("textures/atlas/blocks.png");
   public static final abb w = new abb("item/empty_armor_slot_helmet");
   public static final abb x = new abb("item/empty_armor_slot_chestplate");
   public static final abb y = new abb("item/empty_armor_slot_leggings");
   public static final abb z = new abb("item/empty_armor_slot_boots");
   public static final abb A = new abb("item/empty_armor_slot_shield");
   static final abb[] C = new abb[]{z, y, x, w};
   private static final bbs[] D = new bbs[]{bbs.f, bbs.e, bbs.d, bbs.c};
   private final bxa E = new bxa(this, 2, 2);
   private final bxy F = new bxy();
   public final boolean B;
   private final buc G;

   public bxl(bub $$0, boolean $$1, final buc $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new bxz($$0.l, this.E, this.F, 0, 154, 28));

      for(int $$3 = 0; $$3 < 2; ++$$3) {
         for(int $$4 = 0; $$4 < 2; ++$$4) {
            this.a(new byd(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for(int $$5 = 0; $$5 < 4; ++$$5) {
         final bbs $$6 = D[$$5];
         this.a(new byd($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void d(cax $$0) {
               cax $$1 = this.e();
               super.d($$0);
               $$2.a($$6, $$1, $$0);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cax $$0) {
               return $$6 == bce.i($$0);
            }

            @Override
            public boolean a(buc $$0) {
               cax $$1 = this.e();
               return !$$1.b() && !$$0.f() && cet.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<abb, abb> c() {
               return Pair.of(bxl.v, bxl.C[$$6.b()]);
            }
         });
      }

      for(int $$7 = 0; $$7 < 3; ++$$7) {
         for(int $$8 = 0; $$8 < 9; ++$$8) {
            this.a(new byd($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for(int $$9 = 0; $$9 < 9; ++$$9) {
         this.a(new byd($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new byd($$0, 40, 77, 62) {
         @Override
         public Pair<abb, abb> c() {
            return Pair.of(bxl.v, bxl.A);
         }
      });
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bug $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cdp<? super bxa> $$0) {
      return $$0.a(this.E, this.G.s);
   }

   @Override
   public void a(bac $$0) {
      bxb.a(this, this.G.s, this.G, this.E, this.F);
   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.s.y) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(buc $$0) {
      return true;
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         bbs $$5 = bce.i($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cax.b;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cax.b;
            }
         } else if ($$5.a() == bbs.a.b && !this.i.get(8 - $$5.b()).f()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cax.b;
            }
         } else if ($$5 == bbs.b && !this.i.get(45).f()) {
            if (!this.a($$4, 45, 46, false)) {
               return cax.b;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cax.b;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cax.b;
            }
         } else if (!this.a($$4, 9, 45, false)) {
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
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cax $$0, byd $$1) {
      return $$1.d != this.F && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.E.g();
   }

   @Override
   public int o() {
      return this.E.f();
   }

   @Override
   public int p() {
      return 5;
   }

   public bxa q() {
      return this.E;
   }

   @Override
   public bxw t() {
      return bxw.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
