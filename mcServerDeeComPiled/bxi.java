import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class bxi extends bwm {
   public static final int k = 35;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int o = 3;
   private static final int p = 30;
   private static final int q = 30;
   private static final int r = 39;
   private final bac s = new bxy();
   final bac t = new bao(2) {
      @Override
      public void e() {
         super.e();
         bxi.this.a(this);
      }
   };
   private final bwx u;

   public bxi(int $$0, bub $$1) {
      this($$0, $$1, bwx.a);
   }

   public bxi(int $$0, bub $$1, final bwx $$2) {
      super(bxq.o, $$0);
      this.u = $$2;
      this.a(new byd(this.t, 0, 49, 19) {
         @Override
         public boolean a(cax $$0) {
            return $$0.h() || $$0.a(caz.ss) || $$0.D();
         }
      });
      this.a(new byd(this.t, 1, 49, 40) {
         @Override
         public boolean a(cax $$0) {
            return $$0.h() || $$0.a(caz.ss) || $$0.D();
         }
      });
      this.a(new byd(this.s, 2, 129, 34) {
         @Override
         public boolean a(cax $$0) {
            return false;
         }

         @Override
         public void a(buc $$0, cax $$1) {
            $$2.a((BiConsumer<cgx, gt>)(($$0x, $$1x) -> {
               if ($$0x instanceof agg) {
                  bbt.a((agg)$$0x, dwq.a($$1x), this.a($$0x));
               }

               $$0x.c(1042, $$1x, 0);
            }));
            bxi.this.t.a(0, cax.b);
            bxi.this.t.a(1, cax.b);
         }

         private int a(cgx $$0) {
            int $$1 = 0;
            $$1 += this.g(bxi.this.t.a(0));
            $$1 += this.g(bxi.this.t.a(1));
            if ($$1 > 0) {
               int $$2 = (int)Math.ceil((double)$$1 / 2.0);
               return $$2 + $$0.w.a($$2);
            } else {
               return 0;
            }
         }

         private int g(cax $$0) {
            int $$1 = 0;
            Map<cer, Integer> $$2 = cet.a($$0);

            for(Entry<cer, Integer> $$3 : $$2.entrySet()) {
               cer $$4 = (cer)$$3.getKey();
               Integer $$5 = (Integer)$$3.getValue();
               if (!$$4.c()) {
                  $$1 += $$4.a($$5);
               }
            }

            return $$1;
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
   public void a(bac $$0) {
      super.a($$0);
      if ($$0 == this.t) {
         this.l();
      }

   }

   private void l() {
      cax $$0 = this.t.a(0);
      cax $$1 = this.t.a(1);
      boolean $$2 = !$$0.b() || !$$1.b();
      boolean $$3 = !$$0.b() && !$$1.b();
      if (!$$2) {
         this.s.a(0, cax.b);
      } else {
         boolean $$4 = !$$0.b() && !$$0.a(caz.ss) && !$$0.D() || !$$1.b() && !$$1.a(caz.ss) && !$$1.D();
         if ($$0.K() > 1 || $$1.K() > 1 || !$$3 && $$4) {
            this.s.a(0, cax.b);
            this.d();
            return;
         }

         int $$5 = 1;
         int $$10;
         cax $$11;
         if ($$3) {
            if (!$$0.a($$1.c())) {
               this.s.a(0, cax.b);
               this.d();
               return;
            }

            cat $$6 = $$0.c();
            int $$7 = $$6.n() - $$0.j();
            int $$8 = $$6.n() - $$1.j();
            int $$9 = $$7 + $$8 + $$6.n() * 5 / 100;
            $$10 = Math.max($$6.n() - $$9, 0);
            $$11 = this.a($$0, $$1);
            if (!$$11.h()) {
               if (!cax.b($$0, $$1)) {
                  this.s.a(0, cax.b);
                  this.d();
                  return;
               }

               $$5 = 2;
            }
         } else {
            boolean $$12 = !$$0.b();
            $$10 = $$12 ? $$0.j() : $$1.j();
            $$11 = $$12 ? $$0 : $$1;
         }

         this.s.a(0, this.a($$11, $$10, $$5));
      }

      this.d();
   }

   private cax a(cax $$0, cax $$1) {
      cax $$2 = $$0.o();
      Map<cer, Integer> $$3 = cet.a($$1);

      for(Entry<cer, Integer> $$4 : $$3.entrySet()) {
         cer $$5 = (cer)$$4.getKey();
         if (!$$5.c() || cet.a($$5, $$2) == 0) {
            $$2.a($$5, $$4.getValue());
         }
      }

      return $$2;
   }

   private cax a(cax $$0, int $$1, int $$2) {
      cax $$3 = $$0.o();
      $$3.c("Enchantments");
      $$3.c("StoredEnchantments");
      if ($$1 > 0) {
         $$3.b($$1);
      } else {
         $$3.c("Damage");
      }

      $$3.e($$2);
      Map<cer, Integer> $$4 = (Map)cet.a($$0)
         .entrySet()
         .stream()
         .filter($$0x -> ((cer)$$0x.getKey()).c())
         .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      cet.a($$4, $$3);
      $$3.c(0);
      if ($$3.a(caz.ss) && $$4.size() == 0) {
         $$3 = new cax(caz.oY);
         if ($$0.z()) {
            $$3.a($$0.x());
         }
      }

      for(int $$5 = 0; $$5 < $$4.size(); ++$$5) {
         $$3.c(bwo.e($$3.H()));
      }

      return $$3;
   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.u.a((BiConsumer<cgx, gt>)(($$1, $$2) -> this.a($$0, this.t)));
   }

   @Override
   public boolean a(buc $$0) {
      return a(this.u, $$0, cju.mK);
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         cax $$5 = this.t.a(0);
         cax $$6 = this.t.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.b() && !$$6.b()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return cax.b;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return cax.b;
               }
            } else if (!this.a($$4, 0, 2, false)) {
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
}
