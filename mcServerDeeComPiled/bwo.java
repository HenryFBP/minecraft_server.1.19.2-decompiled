import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class bwo extends bxm {
   private static final Logger s = LogUtils.getLogger();
   private static final boolean t = false;
   public static final int k = 50;
   private int u;
   private String v;
   private final bxc w = bxc.a();
   private static final int x = 0;
   private static final int y = 1;
   private static final int z = 1;
   private static final int A = 1;
   private static final int B = 2;
   private static final int C = 1;
   private static final int D = 1;

   public bwo(int $$0, bub $$1) {
      this($$0, $$1, bwx.a);
   }

   public bwo(int $$0, bub $$1, bwx $$2) {
      super(bxq.h, $$0, $$1, $$2);
      this.a(this.w);
   }

   @Override
   protected boolean a(cvo $$0) {
      return $$0.a(akl.I);
   }

   @Override
   protected boolean a(buc $$0, boolean $$1) {
      return ($$0.fB().d || $$0.ci >= this.w.b()) && this.w.b() > 0;
   }

   @Override
   protected void a(buc $$0, cax $$1) {
      if (!$$0.fB().d) {
         $$0.c(-this.w.b());
      }

      this.p.a(0, cax.b);
      if (this.u > 0) {
         cax $$2 = this.p.a(1);
         if (!$$2.b() && $$2.K() > this.u) {
            $$2.g(this.u);
            this.p.a(1, $$2);
         } else {
            this.p.a(1, cax.b);
         }
      } else {
         this.p.a(1, cax.b);
      }

      this.w.a(0);
      this.q.a((BiConsumer<cgx, gt>)(($$1x, $$2x) -> {
         cvo $$3 = $$1x.a_($$2x);
         if (!$$0.fB().d && $$3.a(akl.I) && $$0.dQ().i() < 0.12F) {
            cvo $$4 = ciu.e($$3);
            if ($$4 == null) {
               $$1x.a($$2x, false);
               $$1x.c(1029, $$2x, 0);
            } else {
               $$1x.a($$2x, $$4, 2);
               $$1x.c(1030, $$2x, 0);
            }
         } else {
            $$1x.c(1030, $$2x, 0);
         }

      }));
   }

   @Override
   public void l() {
      cax $$0 = this.p.a(0);
      this.w.a(1);
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      if ($$0.b()) {
         this.o.a(0, cax.b);
         this.w.a(0);
      } else {
         cax $$4 = $$0.o();
         cax $$5 = this.p.a(1);
         Map<cer, Integer> $$6 = cet.a($$4);
         $$2 += $$0.H() + ($$5.b() ? 0 : $$5.H());
         this.u = 0;
         if (!$$5.b()) {
            boolean $$7 = $$5.a(caz.ss) && !bzy.d($$5).isEmpty();
            if ($$4.h() && $$4.c().a($$0, $$5)) {
               int $$8 = Math.min($$4.j(), $$4.k() / 4);
               if ($$8 <= 0) {
                  this.o.a(0, cax.b);
                  this.w.a(0);
                  return;
               }

               int $$9;
               for($$9 = 0; $$8 > 0 && $$9 < $$5.K(); ++$$9) {
                  int $$10 = $$4.j() - $$8;
                  $$4.b($$10);
                  ++$$1;
                  $$8 = Math.min($$4.j(), $$4.k() / 4);
               }

               this.u = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.c()) || !$$4.h())) {
                  this.o.a(0, cax.b);
                  this.w.a(0);
                  return;
               }

               if ($$4.h() && !$$7) {
                  int $$11 = $$0.k() - $$0.j();
                  int $$12 = $$5.k() - $$5.j();
                  int $$13 = $$12 + $$4.k() * 12 / 100;
                  int $$14 = $$11 + $$13;
                  int $$15 = $$4.k() - $$14;
                  if ($$15 < 0) {
                     $$15 = 0;
                  }

                  if ($$15 < $$4.j()) {
                     $$4.b($$15);
                     $$1 += 2;
                  }
               }

               Map<cer, Integer> $$16 = cet.a($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for(cer $$19 : $$16.keySet()) {
                  if ($$19 != null) {
                     int $$20 = $$6.getOrDefault($$19, 0);
                     int $$21 = $$16.get($$19);
                     $$21 = $$20 == $$21 ? $$21 + 1 : Math.max($$21, $$20);
                     boolean $$22 = $$19.a($$0);
                     if (this.r.fB().d || $$0.a(caz.ss)) {
                        $$22 = true;
                     }

                     for(cer $$23 : $$6.keySet()) {
                        if ($$23 != $$19 && !$$19.b($$23)) {
                           $$22 = false;
                           ++$$1;
                        }
                     }

                     if (!$$22) {
                        $$18 = true;
                     } else {
                        $$17 = true;
                        if ($$21 > $$19.a()) {
                           $$21 = $$19.a();
                        }

                        $$6.put($$19, $$21);
                        int $$24 = 0;
                        switch($$19.d()) {
                           case a:
                              $$24 = 1;
                              break;
                           case b:
                              $$24 = 2;
                              break;
                           case c:
                              $$24 = 4;
                              break;
                           case d:
                              $$24 = 8;
                        }

                        if ($$7) {
                           $$24 = Math.max(1, $$24 / 2);
                        }

                        $$1 += $$24 * $$21;
                        if ($$0.K() > 1) {
                           $$1 = 40;
                        }
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.o.a(0, cax.b);
                  this.w.a(0);
                  return;
               }
            }
         }

         if (StringUtils.isBlank(this.v)) {
            if ($$0.z()) {
               $$3 = 1;
               $$1 += $$3;
               $$4.y();
            }
         } else if (!this.v.equals($$0.x().getString())) {
            $$3 = 1;
            $$1 += $$3;
            $$4.a(rq.b(this.v));
         }

         this.w.a($$2 + $$1);
         if ($$1 <= 0) {
            $$4 = cax.b;
         }

         if ($$3 == $$1 && $$3 > 0 && this.w.b() >= 40) {
            this.w.a(39);
         }

         if (this.w.b() >= 40 && !this.r.fB().d) {
            $$4 = cax.b;
         }

         if (!$$4.b()) {
            int $$25 = $$4.H();
            if (!$$5.b() && $$25 < $$5.H()) {
               $$25 = $$5.H();
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$25 = e($$25);
            }

            $$4.c($$25);
            cet.a($$6, $$4);
         }

         this.o.a(0, $$4);
         this.d();
      }
   }

   public static int e(int $$0) {
      return $$0 * 2 + 1;
   }

   public void a(String $$0) {
      this.v = $$0;
      if (this.b(2).f()) {
         cax $$1 = this.b(2).e();
         if (StringUtils.isBlank($$0)) {
            $$1.y();
         } else {
            $$1.a(rq.b(this.v));
         }
      }

      this.l();
   }

   public int m() {
      return this.w.b();
   }
}
