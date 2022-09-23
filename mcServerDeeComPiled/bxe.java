import java.util.List;
import java.util.function.BiConsumer;

public class bxe extends bwm {
   private final bac n = new bao(2) {
      @Override
      public void e() {
         super.e();
         bxe.this.a(this);
      }
   };
   private final bwx o;
   private final amn p = amn.a();
   private final bxc q = bxc.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public bxe(int $$0, bub $$1) {
      this($$0, $$1, bwx.a);
   }

   public bxe(int $$0, bub $$1, bwx $$2) {
      super(bxq.m, $$0);
      this.o = $$2;
      this.a(new byd(this.n, 0, 15, 47) {
         @Override
         public boolean a(cax $$0) {
            return true;
         }

         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new byd(this.n, 1, 35, 47) {
         @Override
         public boolean a(cax $$0) {
            return $$0.a(caz.mW);
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

      this.a(bxc.a(this.k, 0));
      this.a(bxc.a(this.k, 1));
      this.a(bxc.a(this.k, 2));
      this.a(this.q).a($$1.l.fI());
      this.a(bxc.a(this.l, 0));
      this.a(bxc.a(this.l, 1));
      this.a(bxc.a(this.l, 2));
      this.a(bxc.a(this.m, 0));
      this.a(bxc.a(this.m, 1));
      this.a(bxc.a(this.m, 2));
   }

   @Override
   public void a(bac $$0) {
      if ($$0 == this.n) {
         cax $$1 = $$0.a(0);
         if (!$$1.b() && $$1.C()) {
            this.o.a((BiConsumer<cgx, gt>)(($$1x, $$2x) -> {
               int $$3 = 0;

               for(gt $$4 : clv.b) {
                  if (clv.a($$1x, $$2x, $$4)) {
                     ++$$3;
                  }
               }

               this.p.b((long)this.q.b());

               for(int $$5 = 0; $$5 < 3; ++$$5) {
                  this.k[$$5] = cet.a(this.p, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for(int $$6 = 0; $$6 < 3; ++$$6) {
                  if (this.k[$$6] > 0) {
                     List<ceu> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        ceu $$8 = (ceu)$$7.get(this.p.a($$7.size()));
                        this.l[$$6] = hm.W.a($$8.a);
                        this.m[$$6] = $$8.b;
                     }
                  }
               }

               this.d();
            }));
         } else {
            for(int $$2 = 0; $$2 < 3; ++$$2) {
               this.k[$$2] = 0;
               this.l[$$2] = -1;
               this.m[$$2] = -1;
            }
         }
      }

   }

   @Override
   public boolean b(buc $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cax $$2 = this.n.a(0);
         cax $$3 = this.n.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.K() < $$4) && !$$0.fB().d) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.ci < $$4 || $$0.ci < this.k[$$1]) && !$$0.fB().d) {
            return false;
         } else {
            this.o.a((BiConsumer<cgx, gt>)(($$5, $$6) -> {
               cax $$7 = $$2;
               List<ceu> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  boolean $$9 = $$2.a(caz.oY);
                  if ($$9) {
                     $$7 = new cax(caz.ss);
                     pj $$10 = $$2.u();
                     if ($$10 != null) {
                        $$7.c($$10.g());
                     }

                     this.n.a(0, $$7);
                  }

                  for(int $$11 = 0; $$11 < $$8.size(); ++$$11) {
                     ceu $$12 = (ceu)$$8.get($$11);
                     if ($$9) {
                        bzy.a($$7, $$12);
                     } else {
                        $$7.a($$12.a, $$12.b);
                     }
                  }

                  if (!$$0.fB().d) {
                     $$3.g($$4);
                     if ($$3.b()) {
                        this.n.a(1, cax.b);
                     }
                  }

                  $$0.a(akg.ak);
                  if ($$0 instanceof agh) {
                     aj.i.a((agh)$$0, $$7, $$4);
                  }

                  this.n.e();
                  this.q.a($$0.fI());
                  this.a(this.n);
                  $$5.a(null, $$6, ajw.fr, ajx.e, 1.0F, $$5.w.i() * 0.1F + 0.9F);
               }

            }));
            return true;
         }
      } else {
         ad.a($$0.X() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<ceu> a(cax $$0, int $$1, int $$2) {
      this.p.b((long)(this.q.b() + $$1));
      List<ceu> $$3 = cet.b(this.p, $$0, $$2, false);
      if ($$0.a(caz.oY) && $$3.size() > 1) {
         $$3.remove(this.p.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cax $$0 = this.n.a(1);
      return $$0.b() ? 0 : $$0.K();
   }

   public int m() {
      return this.q.b();
   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.o.a((BiConsumer<cgx, gt>)(($$1, $$2) -> this.a($$0, this.n)));
   }

   @Override
   public boolean a(buc $$0) {
      return a(this.o, $$0, cju.ey);
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cax.b;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cax.b;
            }
         } else if ($$4.a(caz.mW)) {
            if (!this.a($$4, 1, 2, true)) {
               return cax.b;
            }
         } else {
            if (this.i.get(0).f() || !this.i.get(0).a($$4)) {
               return cax.b;
            }

            cax $$5 = $$4.o();
            $$5.e(1);
            $$4.g(1);
            this.i.get(0).d($$5);
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
