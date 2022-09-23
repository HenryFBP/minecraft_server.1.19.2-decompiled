import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cjm extends cnf implements cmb {
   public static final cwm<cwc> a = cwe.bc;
   public static final cwf b = cwe.t;
   protected static final int c = 9;
   protected static final dxj d = cjt.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int m = 3;
   protected static final dxj e = cjt.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final dxj f = cjt.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final dxj g = cjt.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final dxj h = cjt.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final dxj i = dxg.a(d, e, g);
   protected static final dxj j = dxg.a(d, f, h);
   protected static final dxj k = dxg.a(d, e, f);
   protected static final dxj l = dxg.a(d, g, h);
   private final bzq n;

   public cjm(bzq $$0, cvn.c $$1) {
      super($$1);
      this.n = $$0;
      this.k(this.D.b().a(a, cwc.b).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   public static gy a(cgd $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      return $$2.b() instanceof cjm ? $$2.c(aD) : null;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.b;
      } else {
         if ($$0.c(a) != cwc.a) {
            $$2 = $$2.a($$0.c(aD));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return baj.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            gt $$6 = $$2.a(((gy)$$0.c(aD)).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            $$1.a(null, baw.a(), null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 5.0F, true, cgp.a.c);
            return baj.a;
         } else if ($$0.c(b)) {
            if (!this.a($$1, $$2)) {
               $$3.a(rq.c("block.minecraft.bed.occupied"), true);
            }

            return baj.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }

            });
            return baj.a;
         }
      }
   }

   public static boolean a(cgx $$0) {
      return $$0.q_().l();
   }

   private boolean a(cgx $$0, gt $$1) {
      List<btp> $$2 = $$0.a(btp.class, new dwl($$1), bcc::fj);
      if ($$2.isEmpty()) {
         return false;
      } else {
         ((btp)$$2.get(0)).fk();
         return true;
      }
   }

   @Override
   public void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cgd $$0, bbn $$1) {
      if ($$1.bN()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }

   }

   private void a(bbn $$0) {
      dwq $$1 = $$0.dd();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bcc ? 1.0 : 0.8;
         $$0.n($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == a($$0.c(a), $$0.c(aD))) {
         return $$2.a(this) && $$2.c(a) != $$0.c(a) ? $$0.a(b, (Boolean)$$2.c(b)) : cju.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static gy a(cwc $$0, gy $$1) {
      return $$0 == cwc.b ? $$1 : $$1.g();
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$0.y && $$3.f()) {
         cwc $$4 = $$2.c(a);
         if ($$4 == cwc.b) {
            gt $$5 = $$1.a(a($$4, $$2.c(aD)));
            cvo $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(a) == cwc.a) {
               $$0.a($$5, cju.a.m(), 35);
               $$0.a($$3, 2001, $$5, cjt.i($$6));
            }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      gy $$1 = $$0.g();
      gt $$2 = $$0.a();
      gt $$3 = $$2.a($$1);
      cgx $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.p_().a($$3) ? this.m().a(aD, $$1) : null;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      gy $$4 = g($$0).g();
      switch($$4) {
         case c:
            return i;
         case d:
            return j;
         case e:
            return k;
         default:
            return l;
      }
   }

   public static gy g(cvo $$0) {
      gy $$1 = $$0.c(aD);
      return $$0.c(a) == cwc.a ? $$1.g() : $$1;
   }

   public static clq.a h(cvo $$0) {
      cwc $$1 = $$0.c(a);
      return $$1 == cwc.a ? clq.a.b : clq.a.c;
   }

   private static boolean b(cgd $$0, gt $$1) {
      return $$0.a_($$1.c()).b() instanceof cjm;
   }

   public static Optional<dwq> a(bbr<?> $$0, cgh $$1, gt $$2, float $$3) {
      gy $$4 = $$1.a_($$2).c(aD);
      gy $$5 = $$4.h();
      gy $$6 = $$5.a($$3) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$4, $$6);
      } else {
         int[][] $$7 = a($$4, $$6);
         Optional<dwq> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<dwq> a(bbr<?> $$0, cgh $$1, gt $$2, gy $$3, gy $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<dwq> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         gt $$7 = $$2.c();
         Optional<dwq> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<dwq> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<dwq> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<dwq> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<dwq> a(bbr<?> $$0, cgh $$1, gt $$2, int[][] $$3, boolean $$4) {
      gt.a $$5 = new gt.a();

      for(int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         dwq $$7 = bvy.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.b;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(aD, a, b);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cte($$0, $$1, this.n);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.y) {
         gt $$5 = $$1.a($$2.c(aD));
         $$0.a($$5, $$2.a(a, cwc.a), 3);
         $$0.b($$1, cju.a);
         $$2.a($$0, $$1, 3);
      }

   }

   public bzq b() {
      return this.n;
   }

   @Override
   public long a(cvo $$0, gt $$1) {
      gt $$2 = $$1.a($$0.c(aD), $$0.c(a) == cwc.a ? 0 : 1);
      return ami.c($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   private static int[][] a(gy $$0, gy $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(gy $$0, gy $$1) {
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$1.j() - $$0.j(), $$1.l() - $$0.l()},
         {$$1.j() - $$0.j() * 2, $$1.l() - $$0.l() * 2},
         {-$$0.j() * 2, -$$0.l() * 2},
         {-$$1.j() - $$0.j() * 2, -$$1.l() - $$0.l() * 2},
         {-$$1.j() - $$0.j(), -$$1.l() - $$0.l()},
         {-$$1.j(), -$$1.l()},
         {-$$1.j() + $$0.j(), -$$1.l() + $$0.l()},
         {$$0.j(), $$0.l()},
         {$$1.j() + $$0.j(), $$1.l() + $$0.l()}
      };
   }

   private static int[][] a(gy $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
