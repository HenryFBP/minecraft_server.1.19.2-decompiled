import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpa extends cjt implements cmd, cql {
   public static final cwi a = cwe.bn;
   public static final cwm<cwl> b = cwe.bo;
   public static final cwf c = cwe.C;
   private static final int d = 11;
   private static final int e = 2;
   private static final float f = 0.02F;
   private static final float g = 0.12F;
   private static final int h = 11;
   private static final float i = 0.17578125F;
   private static final float j = 0.05859375F;
   private static final double k = 0.6;
   private static final float l = 1.0F;
   private static final int m = 40;
   private static final int n = 6;
   private static final float E = 2.0F;
   private static final int F = 2;
   private static final float G = 5.0F;
   private static final float H = 0.011377778F;
   private static final int I = 7;
   private static final int J = 10;
   private static final float K = 0.6875F;
   private static final dxj L = cjt.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final dxj M = cjt.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final dxj N = cjt.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final dxj O = cjt.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final dxj P = cjt.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final dxj Q = cjt.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float R = 0.125F;
   private static final dxj S = cjt.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   public cpa(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.b).a(b, cwl.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return c($$1, $$2, $$0.c(a));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      if ($$1 != gy.b && $$1 != gy.a) {
         return $$0;
      } else {
         gy $$6 = $$0.c(a);
         if ($$6 == gy.a && $$3.K().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cha)$$3, $$4)) {
            if ($$6 == gy.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(b) == cwl.a;
            cwl $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(b, $$8);
         }
      }
   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      gt $$4 = $$2.a();
      if (!$$0.y && $$3.a($$0, $$4) && $$3 instanceof bvg && $$3.dd().f() > 0.6) {
         $$0.b($$4, true);
      }

   }

   @Override
   public void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, float $$4) {
      if ($$1.c(a) == gy.b && $$1.c(b) == cwl.b) {
         $$3.a($$4 + 2.0F, 2.0F, baw.x);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (o($$0) && !this.a($$0, (cha)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }

   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cha)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }

   }

   @VisibleForTesting
   public static void a(cvo $$0, agg $$1, gt $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cha)$$1, $$2)) {
            Optional<cpa.a> $$4 = b((cgx)$$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               dpu $$5 = ((cpa.a)$$4.get()).b;
               float $$6;
               if ($$5 == dpw.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != dpw.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  gt $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if (((cpa.a)$$4.get()).c.a(cju.qq) && $$5 == dpw.c) {
                        cvo $$10 = cju.da.m();
                        $$1.b(((cpa.a)$$4.get()).a, $$10);
                        cjt.a(((cpa.a)$$4.get()).c, $$10, $$1, ((cpa.a)$$4.get()).a);
                        $$1.a(czv.c, ((cpa.a)$$4.get()).a, czv.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        gt $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           cvo $$14 = $$1.a_($$11);
                           $$1.a($$11, $$14.b(), $$13);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cgy $$1 = $$0.q();
      gt $$2 = $$0.a();
      gy $$3 = $$0.e().g();
      gy $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         cwl $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().a(a, $$4).a(b, $$6).a(c, Boolean.valueOf($$1.b_($$2).a() == dpw.c));
      }
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(c) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public dxj b_(cvo $$0, cgd $$1, gt $$2) {
      return dxg.a();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      cwl $$4 = $$0.c(b);
      dxj $$5;
      if ($$4 == cwl.a) {
         $$5 = L;
      } else if ($$4 == cwl.b) {
         if ($$0.c(a) == gy.a) {
            $$5 = N;
         } else {
            $$5 = M;
         }
      } else if ($$4 == cwl.c) {
         $$5 = O;
      } else if ($$4 == cwl.d) {
         $$5 = P;
      } else {
         $$5 = Q;
      }

      dwq $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(cvo $$0, cgd $$1, gt $$2) {
      return false;
   }

   @Override
   public float V_() {
      return 0.125F;
   }

   @Override
   public void a(cgx $$0, gt $$1, bqu $$2) {
      if (!$$2.aM()) {
         $$0.c(1045, $$1, 0);
      }

   }

   @Override
   public baw b() {
      return baw.w;
   }

   @Override
   public Predicate<bbn> W_() {
      return bbq.e.and(bbq.b);
   }

   private static void a(cvo $$0, agg $$1, gt $$2) {
      gt.a $$3 = $$2.i();

      for(cvo $$4 = $$0; n($$4); $$4 = $$1.a_($$3)) {
         bqu $$5 = bqu.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(gy.a);
      }

   }

   @VisibleForTesting
   public static void c(cvo $$0, agg $$1, gt $$2, amn $$3) {
      cvo $$4 = $$1.a_($$2.b(1));
      cvo $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         gt $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            cvo $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, gy.a);
               } else {
                  b($$1, $$6);
               }

            }
         }
      }
   }

   private static void b(agg $$0, gt $$1) {
      gt.a $$2 = $$1.i();

      for(int $$3 = 0; $$3 < 10; ++$$3) {
         $$2.c(gy.a);
         cvo $$4 = $$0.a_($$2);
         if (!$$4.p().c()) {
            return;
         }

         if (a($$4, gy.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, gy.b);
            return;
         }

         if (c($$0, $$2, gy.b) && !$$0.C($$2.c())) {
            a($$0, $$2.c(), gy.b);
            return;
         }

         if (!b((cgd)$$0, $$2, $$4)) {
            return;
         }
      }

   }

   private static void a(agg $$0, gt $$1, gy $$2) {
      gt $$3 = $$1.a($$2);
      cvo $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cgy)$$0, $$3);
      } else if ($$4.h() || $$4.a(cju.C)) {
         a($$0, $$3, $$2, cwl.b);
      }

   }

   private static void a(cgy $$0, gt $$1, gy $$2, cwl $$3) {
      cvo $$4 = cju.qc.m().a(a, $$2).a(b, $$3).a(c, Boolean.valueOf($$0.b_($$1).a() == dpw.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(cvo $$0, cgy $$1, gt $$2) {
      gt $$4;
      gt $$3;
      if ($$0.c(a) == gy.b) {
         $$3 = $$2;
         $$4 = $$2.b();
      } else {
         $$4 = $$2;
         $$3 = $$2.c();
      }

      a($$1, $$4, gy.a, cwl.a);
      a($$1, $$3, gy.b, cwl.a);
   }

   public static void a(cgx $$0, gt $$1, cvo $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cgx $$0, gt $$1, cvo $$2, dpu $$3) {
      dwq $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      dpu $$9 = a($$0, $$3);
      im $$10 = $$9.a(akp.b) ? io.aE : io.aG;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static gt a(cvo $$0, cgy $$1, gt $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         gy $$5 = $$0.c(a);
         BiPredicate<gt, cvo> $$6 = ($$1x, $$2x) -> $$2x.a(cju.qc) && $$2x.c(a) == $$5;
         return (gt)a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static gy b(cha $$0, gt $$1, gy $$2) {
      gy $$3;
      if (c($$0, $$1, $$2)) {
         $$3 = $$2;
      } else {
         if (!c($$0, $$1, $$2.g())) {
            return null;
         }

         $$3 = $$2.g();
      }

      return $$3;
   }

   private static cwl a(cha $$0, gt $$1, gy $$2, boolean $$3) {
      gy $$4 = $$2.g();
      cvo $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(b) != cwl.a ? cwl.b : cwl.a;
      } else if (!b($$5, $$2)) {
         return cwl.b;
      } else {
         cwl $$6 = $$5.c(b);
         if ($$6 != cwl.b && $$6 != cwl.a) {
            cvo $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? cwl.e : cwl.d;
         } else {
            return cwl.c;
         }
      }
   }

   public static boolean h(cvo $$0) {
      return n($$0) && $$0.c(b) == cwl.b && !$$0.c(c);
   }

   private static boolean b(cvo $$0, agg $$1, gt $$2) {
      gy $$3 = $$0.c(a);
      gt $$4 = $$2.a($$3);
      cvo $$5 = $$1.a_($$4);
      if (!$$5.p().c()) {
         return false;
      } else {
         return $$5.h() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<gt> a(cgx $$0, gt $$1, cvo $$2, int $$3) {
      gy $$4 = $$2.c(a);
      BiPredicate<gt, cvo> $$5 = ($$1x, $$2x) -> $$2x.a(cju.qc) && $$2x.c(a) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cju.qc), $$3);
   }

   private static boolean c(cha $$0, gt $$1, gy $$2) {
      gt $$3 = $$1.a($$2.g());
      cvo $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(cvo $$0, boolean $$1) {
      if (!$$0.a(cju.qc)) {
         return false;
      } else {
         cwl $$2 = $$0.c(b);
         return $$2 == cwl.b || $$1 && $$2 == cwl.a;
      }
   }

   private static boolean a(cvo $$0, gy $$1) {
      return a($$0, false) && $$0.c(a) == $$1;
   }

   private static boolean n(cvo $$0) {
      return b($$0, gy.a);
   }

   private static boolean o(cvo $$0) {
      return b($$0, gy.b);
   }

   private static boolean b(cvo $$0, cha $$1, gt $$2) {
      return n($$0) && !$$1.a_($$2.b()).a(cju.qc);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   private static boolean b(cvo $$0, gy $$1) {
      return $$0.a(cju.qc) && $$0.c(a) == $$1;
   }

   @Nullable
   private static gt a(cgx $$0, gt $$1, dpu $$2) {
      Predicate<cvo> $$3 = $$1x -> $$1x.b() instanceof cim && ((cim)$$1x.b()).a($$2);
      BiPredicate<gt, cvo> $$4 = ($$1x, $$2x) -> b((cgd)$$0, $$1x, $$2x);
      return (gt)a($$0, $$1, gy.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static gt a(cgx $$0, gt $$1) {
      BiPredicate<gt, cvo> $$2 = ($$1x, $$2x) -> b((cgd)$$0, $$1x, $$2x);
      return (gt)a($$0, $$1, gy.b.f(), $$2, cpa::h, 11).orElse(null);
   }

   public static dpu a(agg $$0, gt $$1) {
      return (dpu)b((cgx)$$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(cpa::a).orElse(dpw.a);
   }

   private static Optional<cpa.a> b(cgx $$0, gt $$1, cvo $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         gt $$2x = $$1x.b();
         cvo $$3 = $$0.a_($$2x);
         dpu $$4;
         if ($$3.a(cju.qq) && !$$0.q_().i()) {
            $$4 = dpw.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new cpa.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(dpu $$0) {
      return $$0 == dpw.e || $$0 == dpw.c;
   }

   private static boolean a(cvo $$0, cvo $$1) {
      return $$0.a(cju.qd) && $$1.a(cju.C) && $$1.p().b();
   }

   private static dpu a(cgx $$0, dpu $$1) {
      if ($$1.a(dpw.a)) {
         return $$0.q_().i() ? dpw.e : dpw.c;
      } else {
         return $$1;
      }
   }

   private static Optional<gt> a(cgy $$0, gt $$1, gy.b $$2, BiPredicate<gt, cvo> $$3, Predicate<cvo> $$4, int $$5) {
      gy $$6 = gy.a($$2, gy.a.b);
      gt.a $$7 = $$1.i();

      for(int $$8 = 1; $$8 < $$5; ++$$8) {
         $$7.c($$6);
         cvo $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.h());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean b(cgd $$0, gt $$1, cvo $$2) {
      if ($$2.h()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.p().c()) {
         return false;
      } else {
         dxj $$3 = $$2.k($$0, $$1);
         return !dxg.c(S, $$3, dwu.i);
      }
   }

   static record a(gt a, dpu b, cvo c) {
      final gt a;
      final dpu b;
      final cvo c;
   }
}
