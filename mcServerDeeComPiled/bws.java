import java.util.function.BiConsumer;

public class bws extends bwm {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bwx s;
   long t;
   public final bac n = new bao(2) {
      @Override
      public void e() {
         bws.this.a(this);
         super.e();
      }
   };
   private final bxy u = new bxy() {
      @Override
      public void e() {
         bws.this.a(this);
         super.e();
      }
   };

   public bws(int $$0, bub $$1) {
      this($$0, $$1, bwx.a);
   }

   public bws(int $$0, bub $$1, final bwx $$2) {
      super(bxq.w, $$0);
      this.s = $$2;
      this.a(new byd(this.n, 0, 15, 15) {
         @Override
         public boolean a(cax $$0) {
            return $$0.a(caz.qc);
         }
      });
      this.a(new byd(this.n, 1, 15, 52) {
         @Override
         public boolean a(cax $$0) {
            return $$0.a(caz.oX) || $$0.a(caz.sg) || $$0.a(caz.fa);
         }
      });
      this.a(new byd(this.u, 2, 145, 39) {
         @Override
         public boolean a(cax $$0) {
            return false;
         }

         @Override
         public void a(buc $$0, cax $$1) {
            bws.this.i.get(0).a(1);
            bws.this.i.get(1).a(1);
            $$1.c().b($$1, $$0.s, $$0);
            $$2.a((BiConsumer<cgx, gt>)(($$0x, $$1x) -> {
               long $$2 = $$0x.U();
               if (bws.this.t != $$2) {
                  $$0x.a(null, $$1x, ajw.vv, ajx.e, 1.0F, 1.0F);
                  bws.this.t = $$2;
               }

            }));
            super.a($$0, $$1);
         }
      });

      for(int $$3 = 0; $$3 < 3; ++$$3) {
         for(int $$4 = 0; $$4 < 9; ++$$4) {
            this.a(new byd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for(int $$5 = 0; $$5 < 9; ++$$5) {
         this.a(new byd($$1, $$5, 8 + $$5 * 18, 142));
      }

   }

   @Override
   public boolean a(buc $$0) {
      return a(this.s, $$0, cju.mI);
   }

   @Override
   public void a(bac $$0) {
      cax $$1 = this.n.a(0);
      cax $$2 = this.n.a(1);
      cax $$3 = this.u.a(2);
      if ($$3.b() || !$$1.b() && !$$2.b()) {
         if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.u.b(2);
      }

   }

   private void a(cax $$0, cax $$1, cax $$2) {
      this.s.a((BiConsumer<cgx, gt>)(($$3, $$4) -> {
         drg $$5 = cbd.a($$0, $$3);
         if ($$5 != null) {
            cax $$6;
            if ($$1.a(caz.oX) && !$$5.h && $$5.f < 4) {
               $$6 = $$0.o();
               $$6.e(1);
               $$6.v().a("map_scale_direction", 1);
               this.d();
            } else if ($$1.a(caz.fa) && !$$5.h) {
               $$6 = $$0.o();
               $$6.e(1);
               $$6.v().a("map_to_lock", true);
               this.d();
            } else {
               if (!$$1.a(caz.sg)) {
                  this.u.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.o();
               $$6.e(2);
               this.d();
            }

            if (!cax.b($$6, $$2)) {
               this.u.a(2, $$6);
               this.d();
            }

         }
      }));
   }

   @Override
   public boolean a(cax $$0, byd $$1) {
      return $$1.d != this.u && super.a($$0, $$1);
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         if ($$1 == 2) {
            $$4.c().b($$4, $$0.s, $$0);
            if (!this.a($$4, 3, 39, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.a(caz.qc)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cax.b;
               }
            } else if (!$$4.a(caz.oX) && !$$4.a(caz.sg) && !$$4.a(caz.fa)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cax.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cax.b;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return cax.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cax.b;
         }

         if ($$4.b()) {
            $$3.d(cax.b);
         }

         $$3.d();
         if ($$4.K() == $$2.K()) {
            return cax.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.u.b(2);
      this.s.a((BiConsumer<cgx, gt>)(($$1, $$2) -> this.a($$0, this.n)));
   }
}
