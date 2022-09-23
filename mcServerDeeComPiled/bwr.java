public class bwr extends bwm {
   private static final int k = 0;
   private static final int l = 2;
   private static final int m = 3;
   private static final int n = 4;
   private static final int o = 5;
   private static final int p = 2;
   private static final int q = 5;
   private static final int r = 32;
   private static final int s = 32;
   private static final int t = 41;
   private final bac u;
   private final bww v;
   private final byd w;

   public bwr(int $$0, bub $$1) {
      this($$0, $$1, new bao(5), new byc(2));
   }

   public bwr(int $$0, bub $$1, bac $$2, bww $$3) {
      super(bxq.k, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new bwr.c($$2, 0, 56, 51));
      this.a(new bwr.c($$2, 1, 79, 58));
      this.a(new bwr.c($$2, 2, 102, 51));
      this.w = this.a(new bwr.b($$2, 3, 79, 17));
      this.a(new bwr.a($$2, 4, 17, 17));
      this.a($$3);

      for(int $$4 = 0; $$4 < 3; ++$$4) {
         for(int $$5 = 0; $$5 < 9; ++$$5) {
            this.a(new byd($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for(int $$6 = 0; $$6 < 9; ++$$6) {
         this.a(new byd($$1, $$6, 8 + $$6 * 18, 142));
      }

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
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (bwr.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cax.b;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cax.b;
               }
            } else if (bwr.c.b($$2) && $$2.K() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cax.b;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cax.b;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cax.b;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cax.b;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
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

   public int l() {
      return this.v.a(1);
   }

   public int m() {
      return this.v.a(0);
   }

   static class a extends byd {
      public a(bac $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cax $$0) {
         return b($$0);
      }

      public static boolean b(cax $$0) {
         return $$0.a(caz.qw);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends byd {
      public b(bac $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cax $$0) {
         return cct.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends byd {
      public c(bac $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cax $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(buc $$0, cax $$1) {
         ccs $$2 = ccu.d($$1);
         if ($$0 instanceof agh) {
            aj.k.a((agh)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(cax $$0) {
         return $$0.a(caz.qs) || $$0.a(caz.ti) || $$0.a(caz.tl) || $$0.a(caz.qt);
      }
   }
}
