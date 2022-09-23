import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class csc extends cjt {
   public static final cwf a = cox.e;
   public static final cwf b = cox.a;
   public static final cwf c = cox.b;
   public static final cwf d = cox.c;
   public static final cwf e = cox.d;
   public static final Map<gy, cwf> f = (Map<gy, cwf>)cox.g.entrySet().stream().filter($$0 -> $$0.getKey() != gy.a).collect(ad.a());
   protected static final float g = 1.0F;
   private static final dxj h = cjt.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final dxj i = cjt.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final dxj j = cjt.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final dxj k = cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final dxj l = cjt.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<cvo, dxj> m;

   public csc(cvn.c $$0) {
      super($$0);
      this.k(
         this.D
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.m = ImmutableMap.copyOf((Map)this.D.a().stream().collect(Collectors.toMap(Function.identity(), csc::h)));
   }

   private static dxj h(cvo $$0) {
      dxj $$1 = dxg.a();
      if ($$0.c(a)) {
         $$1 = h;
      }

      if ($$0.c(b)) {
         $$1 = dxg.a($$1, k);
      }

      if ($$0.c(d)) {
         $$1 = dxg.a($$1, l);
      }

      if ($$0.c(c)) {
         $$1 = dxg.a($$1, j);
      }

      if ($$0.c(e)) {
         $$1 = dxg.a($$1, i);
      }

      return $$1.b() ? dxg.b() : $$1;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)this.m.get($$0);
   }

   @Override
   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return true;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return this.n(this.i($$0, $$1, $$2));
   }

   private boolean n(cvo $$0) {
      return this.o($$0) > 0;
   }

   private int o(cvo $$0) {
      int $$1 = 0;

      for(cwf $$2 : f.values()) {
         if ($$0.c($$2)) {
            ++$$1;
         }
      }

      return $$1;
   }

   private boolean b(cgd $$0, gt $$1, gy $$2) {
      if ($$2 == gy.a) {
         return false;
      } else {
         gt $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == gy.a.b) {
            return false;
         } else {
            cwf $$4 = (cwf)f.get($$2);
            cvo $$5 = $$0.a_($$1.b());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(cgd $$0, gt $$1, gy $$2) {
      return cok.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private cvo i(cvo $$0, cgd $$1, gt $$2) {
      gt $$3 = $$2.b();
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(a($$1, $$3, gy.a)));
      }

      cvo $$4 = null;

      for(gy $$5 : gy.c.a) {
         cwf $$6 = a($$5);
         if ($$0.c($$6)) {
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
               if ($$4 == null) {
                  $$4 = $$1.a_($$3);
               }

               $$7 = $$4.a(this) && $$4.c($$6);
            }

            $$0 = $$0.a($$6, Boolean.valueOf($$7));
         }
      }

      return $$0;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == gy.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         cvo $$6 = this.i($$0, $$3, $$4);
         return !this.n($$6) ? cju.a.m() : $$6;
      }
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$3.a(4) == 0) {
         gy $$4 = gy.b($$3);
         gt $$5 = $$2.b();
         if ($$4.o().d() && !$$0.c(a($$4))) {
            if (this.a($$1, $$2)) {
               gt $$6 = $$2.a($$4);
               cvo $$7 = $$1.a_($$6);
               if ($$7.h()) {
                  gy $$8 = $$4.h();
                  gy $$9 = $$4.i();
                  boolean $$10 = $$0.c(a($$8));
                  boolean $$11 = $$0.c(a($$9));
                  gt $$12 = $$6.a($$8);
                  gt $$13 = $$6.a($$9);
                  if ($$10 && a($$1, $$12, $$8)) {
                     $$1.a($$6, this.m().a(a($$8), Boolean.valueOf(true)), 2);
                  } else if ($$11 && a($$1, $$13, $$9)) {
                     $$1.a($$6, this.m().a(a($$9), Boolean.valueOf(true)), 2);
                  } else {
                     gy $$14 = $$4.g();
                     if ($$10 && $$1.x($$12) && a($$1, $$2.a($$8), $$14)) {
                        $$1.a($$12, this.m().a(a($$14), Boolean.valueOf(true)), 2);
                     } else if ($$11 && $$1.x($$13) && a($$1, $$2.a($$9), $$14)) {
                        $$1.a($$13, this.m().a(a($$14), Boolean.valueOf(true)), 2);
                     } else if ((double)$$3.i() < 0.05 && a($$1, $$6.b(), gy.b)) {
                        $$1.a($$6, this.m().a(a, Boolean.valueOf(true)), 2);
                     }
                  }
               } else if (a($$1, $$6, $$4)) {
                  $$1.a($$2, $$0.a(a($$4), Boolean.valueOf(true)), 2);
               }

            }
         } else {
            if ($$4 == gy.b && $$2.v() < $$1.ah() - 1) {
               if (this.b($$1, $$2, $$4)) {
                  $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 2);
                  return;
               }

               if ($$1.x($$5)) {
                  if (!this.a($$1, $$2)) {
                     return;
                  }

                  cvo $$15 = $$0;

                  for(gy $$16 : gy.c.a) {
                     if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                        $$15 = $$15.a(a($$16), Boolean.valueOf(false));
                     }
                  }

                  if (this.p($$15)) {
                     $$1.a($$5, $$15, 2);
                  }

                  return;
               }
            }

            if ($$2.v() > $$1.u_()) {
               gt $$17 = $$2.c();
               cvo $$18 = $$1.a_($$17);
               if ($$18.h() || $$18.a(this)) {
                  cvo $$19 = $$18.h() ? this.m() : $$18;
                  cvo $$20 = this.a($$0, $$19, $$3);
                  if ($$19 != $$20 && this.p($$20)) {
                     $$1.a($$17, $$20, 2);
                  }
               }
            }

         }
      }
   }

   private cvo a(cvo $$0, cvo $$1, amn $$2) {
      for(gy $$3 : gy.c.a) {
         if ($$2.h()) {
            cwf $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.a($$4, Boolean.valueOf(true));
            }
         }
      }

      return $$1;
   }

   private boolean p(cvo $$0) {
      return $$0.c(b) || $$0.c(c) || $$0.c(d) || $$0.c(e);
   }

   private boolean a(cgd $$0, gt $$1) {
      int $$2 = 4;
      Iterable<gt> $$3 = gt.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for(gt $$5 : $$3) {
         if ($$0.a_($$5).a(this) && --$$4 <= 0) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      cvo $$2 = $$1.q().a_($$1.a());
      if ($$2.a(this)) {
         return this.o($$2) < f.size();
      } else {
         return super.a($$0, $$1);
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      cvo $$3 = $$2 ? $$1 : this.m();

      for(gy $$4 : $$0.f()) {
         if ($$4 != gy.a) {
            cwf $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.a($$5, Boolean.valueOf(true));
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      switch($$1) {
         case c:
            return $$0.a(b, (Boolean)$$0.c(d)).a(c, (Boolean)$$0.c(e)).a(d, (Boolean)$$0.c(b)).a(e, (Boolean)$$0.c(c));
         case d:
            return $$0.a(b, (Boolean)$$0.c(c)).a(c, (Boolean)$$0.c(d)).a(d, (Boolean)$$0.c(e)).a(e, (Boolean)$$0.c(b));
         case b:
            return $$0.a(b, (Boolean)$$0.c(e)).a(c, (Boolean)$$0.c(b)).a(d, (Boolean)$$0.c(c)).a(e, (Boolean)$$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      switch($$1) {
         case b:
            return $$0.a(b, (Boolean)$$0.c(d)).a(d, (Boolean)$$0.c(b));
         case c:
            return $$0.a(c, (Boolean)$$0.c(e)).a(e, (Boolean)$$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   public static cwf a(gy $$0) {
      return (cwf)f.get($$0);
   }
}
