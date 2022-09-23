import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.BiConsumer;

public class bxo extends bwm {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final bwx p;
   final bxc q = bxc.a();
   private List<hc<csz>> r = List.of();
   Runnable s = () -> {
   };
   final byd t;
   final byd u;
   private final byd v;
   private final byd w;
   long x;
   private final bac y = new bao(3) {
      @Override
      public void e() {
         super.e();
         bxo.this.a(this);
         bxo.this.s.run();
      }
   };
   private final bac z = new bao(1) {
      @Override
      public void e() {
         super.e();
         bxo.this.s.run();
      }
   };

   public bxo(int $$0, bub $$1) {
      this($$0, $$1, bwx.a);
   }

   public bxo(int $$0, bub $$1, final bwx $$2) {
      super(bxq.r, $$0);
      this.p = $$2;
      this.t = this.a(new byd(this.y, 0, 13, 26) {
         @Override
         public boolean a(cax $$0) {
            return $$0.c() instanceof byu;
         }
      });
      this.u = this.a(new byd(this.y, 1, 33, 26) {
         @Override
         public boolean a(cax $$0) {
            return $$0.c() instanceof bzr;
         }
      });
      this.v = this.a(new byd(this.y, 2, 23, 45) {
         @Override
         public boolean a(cax $$0) {
            return $$0.c() instanceof byv;
         }
      });
      this.w = this.a(new byd(this.z, 0, 143, 58) {
         @Override
         public boolean a(cax $$0) {
            return false;
         }

         @Override
         public void a(buc $$0, cax $$1) {
            bxo.this.t.a(1);
            bxo.this.u.a(1);
            if (!bxo.this.t.f() || !bxo.this.u.f()) {
               bxo.this.q.a(-1);
            }

            $$2.a((BiConsumer<cgx, gt>)(($$0x, $$1x) -> {
               long $$2 = $$0x.U();
               if (bxo.this.x != $$2) {
                  $$0x.a(null, $$1x, ajw.vu, ajx.e, 1.0F, 1.0F);
                  bxo.this.x = $$2;
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

      this.a(this.q);
   }

   @Override
   public boolean a(buc $$0) {
      return a(this.p, $$0, cju.mE);
   }

   @Override
   public boolean b(buc $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a((hc<csz>)this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<hc<csz>> c(cax $$0) {
      if ($$0.b()) {
         return (List<hc<csz>>)hm.bO.c(akj.a).map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         cat var3 = $$0.c();
         return var3 instanceof byv $$1 ? (List)hm.bO.c($$1.b()).map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bac $$0) {
      cax $$1 = this.t.e();
      cax $$2 = this.u.e();
      cax $$3 = this.v.e();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<hc<csz>> $$6 = this.r;
         this.r = this.c($$3);
         hc<csz> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = (hc)this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            hc<csz> $$9 = (hc)$$6.get($$4);
            int $$10 = this.r.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.q.a($$10);
            } else {
               $$7 = null;
               this.q.a(-1);
            }
         }

         if ($$7 != null) {
            pj $$13 = byx.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.d(cax.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.d(cax.b);
         }

         this.d();
      } else {
         this.w.d(cax.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<hc<csz>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.c() instanceof byu) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cax.b;
               }
            } else if ($$4.c() instanceof bzr) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cax.b;
               }
            } else if ($$4.c() instanceof byv) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cax.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cax.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cax.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
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

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.p.a((BiConsumer<cgx, gt>)(($$1, $$2) -> this.a($$0, this.y)));
   }

   private void a(hc<csz> $$0) {
      cax $$1 = this.t.e();
      cax $$2 = this.u.e();
      cax $$3 = cax.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.o();
         $$3.e(1);
         bzq $$4 = ((bzr)$$2.c()).d();
         pj $$5 = byx.a($$3);
         pp $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new pp();
            if ($$5 == null) {
               $$5 = new pj();
            }

            $$5.a("Patterns", (qc)$$6);
         }

         pj $$8 = new pj();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         byx.a($$3, ctk.s, $$5);
      }

      if (!cax.b($$3, this.w.e())) {
         this.w.d($$3);
      }

   }

   public byd n() {
      return this.t;
   }

   public byd o() {
      return this.u;
   }

   public byd p() {
      return this.v;
   }

   public byd q() {
      return this.w;
   }
}
