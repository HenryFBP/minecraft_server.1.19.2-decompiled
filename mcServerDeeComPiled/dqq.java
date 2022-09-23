import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class dqq extends dqk {
   public static final double j = 0.5;
   protected float k;
   private final Long2ObjectMap<dqh> l = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<dwl> m = new Object2BooleanOpenHashMap();

   @Override
   public void a(chk $$0, bce $$1) {
      super.a($$0, $$1);
      this.k = $$1.a(dqh.j);
   }

   @Override
   public void b() {
      this.b.a(dqh.j, this.k);
      this.l.clear();
      this.m.clear();
      super.b();
   }

   @Nullable
   @Override
   public dqj a() {
      gt.a $$0 = new gt.a();
      int $$1 = this.b.dg();
      cvo $$2 = this.a.a_($$0.c(this.b.df(), (double)$$1, this.b.dl()));
      if (!this.b.a($$2.p())) {
         if (this.f() && this.b.aR()) {
            while(true) {
               if (!$$2.a(cju.C) && $$2.p() != dpw.c.a(false)) {
                  --$$1;
                  break;
               }

               $$2 = this.a.a_($$0.c(this.b.df(), (double)(++$$1), this.b.dl()));
            }
         } else if (this.b.aw()) {
            $$1 = ami.b(this.b.dh() + 0.5);
         } else {
            gt $$3 = this.b.da();

            while((this.a.a_($$3).h() || this.a.a_($$3).a(this.a, $$3, dqm.a)) && $$3.v() > this.b.s.u_()) {
               $$3 = $$3.c();
            }

            $$1 = $$3.b().v();
         }
      } else {
         while(this.b.a($$2.p())) {
            $$2 = this.a.a_($$0.c(this.b.df(), (double)(++$$1), this.b.dl()));
         }

         --$$1;
      }

      gt $$4 = this.b.da();
      dqh $$5 = this.a(this.b, $$4.u(), $$1, $$4.w());
      if (this.b.a($$5) < 0.0F) {
         dwl $$6 = this.b.cy();
         if (this.d($$0.c($$6.a, (double)$$1, $$6.c))
            || this.d($$0.c($$6.a, (double)$$1, $$6.f))
            || this.d($$0.c($$6.d, (double)$$1, $$6.c))
            || this.d($$0.c($$6.d, (double)$$1, $$6.f))) {
            return this.c($$0);
         }
      }

      return this.c(new gt($$4.u(), $$1, $$4.w()));
   }

   @Nullable
   protected dqj c(gt $$0) {
      dqj $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.l = this.a(this.b, $$1.a());
         $$1.k = this.b.a($$1.l);
      }

      return $$1;
   }

   private boolean d(gt $$0) {
      dqh $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Nullable
   @Override
   public dqp a(double $$0, double $$1, double $$2) {
      return this.a(this.a(ami.b($$0), ami.b($$1), ami.b($$2)));
   }

   @Override
   public int a(dqj[] $$0, dqj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      dqh $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      dqh $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != dqh.y) {
         $$3 = ami.d(Math.max(1.0F, this.b.P));
      }

      double $$6 = this.a(new gt($$1.a, $$1.b, $$1.c));
      dqj $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, gy.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      dqj $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, gy.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      dqj $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, gy.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      dqj $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, gy.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      dqj $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, gy.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      dqj $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, gy.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      dqj $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, gy.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      dqj $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, gy.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable dqj $$0, dqj $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(dqj $$0, @Nullable dqj $$1, @Nullable dqj $$2, @Nullable dqj $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != dqh.d && $$2.l != dqh.d && $$3.l != dqh.d) {
         boolean $$4 = $$2.l == dqh.h && $$1.l == dqh.h && (double)this.b.cW() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(dqh $$0) {
      return $$0 == dqh.h || $$0 == dqh.u || $$0 == dqh.v;
   }

   private boolean b(dqj $$0) {
      dwl $$1 = this.b.cy();
      dwq $$2 = new dwq((double)$$0.a - this.b.df() + $$1.b() / 2.0, (double)$$0.b - this.b.dh() + $$1.c() / 2.0, (double)$$0.c - this.b.dl() + $$1.d() / 2.0);
      int $$3 = ami.e($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for(int $$4 = 1; $$4 <= $$3; ++$$4) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double a(gt $$0) {
      return a(this.a, $$0);
   }

   public static double a(cgd $$0, gt $$1) {
      gt $$2 = $$1.c();
      dxj $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.b() ? 0.0 : $$3.c(gy.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected dqj a(int $$0, int $$1, int $$2, int $$3, double $$4, gy $$5, dqh $$6) {
      dqj $$7 = null;
      gt.a $$8 = new gt.a();
      double $$9 = this.a($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > 1.125) {
         return null;
      } else {
         dqh $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.cW() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != dqh.c && (!this.c() || $$10 != dqh.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && $$10 != dqh.h && $$10 != dqh.m && $$10 != dqh.e && $$10 != dqh.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == dqh.b || $$7.l == dqh.c) && this.b.cW() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  dwl $$15 = new dwl(
                     $$13 - $$12,
                     a(this.a, (gt)$$8.c($$13, (double)($$1 + 1), $$14)) + 0.001,
                     $$14 - $$12,
                     $$13 + $$12,
                     (double)this.b.cX() + a(this.a, (gt)$$8.c((double)$$7.a, (double)$$7.b, (double)$$7.c)) - 0.002,
                     $$14 + $$12
                  );
                  if (this.a($$15)) {
                     $$7 = null;
                  }
               }
            }

            if (!this.c() && $$10 == dqh.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != dqh.j) {
                  return $$7;
               }

               while($$1 > this.b.s.u_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != dqh.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == dqh.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while($$10 == dqh.b) {
                  if (--$$1 < this.b.s.u_()) {
                     return this.b($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cl()) {
                     return this.b($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != dqh.b && $$11 >= 0.0F) {
                     $$7 = this.a($$0, $$1, $$2, $$10, $$11);
                     break;
                  }

                  if ($$11 < 0.0F) {
                     return this.b($$0, $$1, $$2);
                  }
               }
            }

            if (a($$10)) {
               $$7 = this.a($$0, $$1, $$2);
               if ($$7 != null) {
                  $$7.i = true;
                  $$7.l = $$10;
                  $$7.k = $$10.a();
               }
            }

            return $$7;
         } else {
            return $$7;
         }
      }
   }

   @Nullable
   private dqj a(int $$0, int $$1, int $$2, dqh $$3, float $$4) {
      dqj $$5 = this.a($$0, $$1, $$2);
      if ($$5 != null) {
         $$5.l = $$3;
         $$5.k = Math.max($$5.k, $$4);
      }

      return $$5;
   }

   @Nullable
   private dqj b(int $$0, int $$1, int $$2) {
      dqj $$3 = this.a($$0, $$1, $$2);
      if ($$3 != null) {
         $$3.l = dqh.a;
         $$3.k = -1.0F;
      }

      return $$3;
   }

   private boolean a(dwl $$0) {
      return this.m.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public dqh a(cgd $$0, int $$1, int $$2, int $$3, bce $$4, int $$5, int $$6, int $$7, boolean $$8, boolean $$9) {
      EnumSet<dqh> $$10 = EnumSet.noneOf(dqh.class);
      dqh $$11 = dqh.a;
      gt $$12 = $$4.da();
      $$11 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
      if ($$10.contains(dqh.h)) {
         return dqh.h;
      } else if ($$10.contains(dqh.m)) {
         return dqh.m;
      } else {
         dqh $$13 = dqh.a;

         for(dqh $$14 : $$10) {
            if ($$4.a($$14) < 0.0F) {
               return $$14;
            }

            if ($$4.a($$14) >= $$4.a($$13)) {
               $$13 = $$14;
            }
         }

         return $$11 == dqh.b && $$4.a($$13) == 0.0F && $$5 <= 1 ? dqh.b : $$13;
      }
   }

   public dqh a(cgd $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8, EnumSet<dqh> $$9, dqh $$10, gt $$11) {
      for(int $$12 = 0; $$12 < $$4; ++$$12) {
         for(int $$13 = 0; $$13 < $$5; ++$$13) {
            for(int $$14 = 0; $$14 < $$6; ++$$14) {
               int $$15 = $$12 + $$1;
               int $$16 = $$13 + $$2;
               int $$17 = $$14 + $$3;
               dqh $$18 = this.a($$0, $$15, $$16, $$17);
               $$18 = this.a($$0, $$7, $$8, $$11, $$18);
               if ($$12 == 0 && $$13 == 0 && $$14 == 0) {
                  $$10 = $$18;
               }

               $$9.add($$18);
            }
         }
      }

      return $$10;
   }

   protected dqh a(cgd $$0, boolean $$1, boolean $$2, gt $$3, dqh $$4) {
      if ($$4 == dqh.u && $$1 && $$2) {
         $$4 = dqh.d;
      }

      if ($$4 == dqh.t && !$$2) {
         $$4 = dqh.a;
      }

      if ($$4 == dqh.l && !($$0.a_($$3).b() instanceof cjj) && !($$0.a_($$3.c()).b() instanceof cjj)) {
         $$4 = dqh.m;
      }

      if ($$4 == dqh.x) {
         $$4 = dqh.a;
      }

      return $$4;
   }

   private dqh a(bce $$0, gt $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected dqh a(bce $$0, int $$1, int $$2, int $$3) {
      return (dqh)this.l.computeIfAbsent(gt.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0, this.d, this.e, this.f, this.e(), this.d()));
   }

   @Override
   public dqh a(cgd $$0, int $$1, int $$2, int $$3) {
      return a($$0, new gt.a($$1, $$2, $$3));
   }

   public static dqh a(cgd $$0, gt.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      dqh $$5 = b($$0, $$1);
      if ($$5 == dqh.b && $$3 >= $$0.u_() + 1) {
         dqh $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != dqh.c && $$6 != dqh.b && $$6 != dqh.j && $$6 != dqh.i ? dqh.c : dqh.b;
         if ($$6 == dqh.o) {
            $$5 = dqh.o;
         }

         if ($$6 == dqh.q) {
            $$5 = dqh.q;
         }

         if ($$6 == dqh.s) {
            $$5 = dqh.s;
         }

         if ($$6 == dqh.y) {
            $$5 = dqh.y;
         }

         if ($$6 == dqh.f) {
            $$5 = dqh.g;
         }
      }

      if ($$5 == dqh.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static dqh a(cgd $$0, gt.a $$1, dqh $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for(int $$6 = -1; $$6 <= 1; ++$$6) {
         for(int $$7 = -1; $$7 <= 1; ++$$7) {
            for(int $$8 = -1; $$8 <= 1; ++$$8) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  cvo $$9 = $$0.a_($$1);
                  if ($$9.a(cju.cZ)) {
                     return dqh.p;
                  }

                  if ($$9.a(cju.mT)) {
                     return dqh.r;
                  }

                  if (a($$9)) {
                     return dqh.n;
                  }

                  if ($$0.b_($$1).a(akp.a)) {
                     return dqh.k;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static dqh b(cgd $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      cjt $$3 = $$2.b();
      dpz $$4 = $$2.d();
      if ($$2.h()) {
         return dqh.b;
      } else if ($$2.a(akl.L) || $$2.a(cju.et) || $$2.a(cju.ql)) {
         return dqh.e;
      } else if ($$2.a(cju.pn)) {
         return dqh.f;
      } else if ($$2.a(cju.cZ)) {
         return dqh.q;
      } else if ($$2.a(cju.mT)) {
         return dqh.s;
      } else if ($$2.a(cju.nR)) {
         return dqh.y;
      } else if ($$2.a(cju.eJ)) {
         return dqh.z;
      } else {
         dpv $$5 = $$0.b_($$1);
         if ($$5.a(akp.b)) {
            return dqh.i;
         } else if (a($$2)) {
            return dqh.o;
         } else if (clp.n($$2) && !$$2.c(clp.b)) {
            return dqh.u;
         } else if ($$3 instanceof clp && $$4 == dpz.K && !$$2.c(clp.b)) {
            return dqh.v;
         } else if ($$3 instanceof clp && $$2.c(clp.b)) {
            return dqh.t;
         } else if ($$3 instanceof cjj) {
            return dqh.l;
         } else if ($$3 instanceof cnt) {
            return dqh.x;
         } else if (!$$2.a(akl.O) && !$$2.a(akl.H) && (!($$3 instanceof cmh) || $$2.c(cmh.a))) {
            if (!$$2.a($$0, $$1, dqm.a)) {
               return dqh.a;
            } else {
               return $$5.a(akp.a) ? dqh.j : dqh.b;
            }
         } else {
            return dqh.h;
         }
      }
   }

   public static boolean a(cvo $$0) {
      return $$0.a(akl.aB) || $$0.a(cju.D) || $$0.a(cju.jv) || cke.g($$0) || $$0.a(cju.eC);
   }
}
