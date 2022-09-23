import java.util.Optional;
import javax.annotation.Nullable;

public class cke extends cjg implements cql {
   protected static final dxj a = cjt.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final cwf b = cwe.r;
   public static final cwf c = cwe.y;
   public static final cwf d = cwe.C;
   public static final cwi e = cwe.S;
   private static final dxj f = cjt.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int g = 5;
   private final boolean h;
   private final int i;

   public cke(boolean $$0, int $$1, cvn.c $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
      this.k(this.D.b().a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, gy.c));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cti $$6 = $$1.c_($$2);
      if ($$6 instanceof ctm $$7) {
         cax $$8 = $$3.b($$4);
         Optional<cdg> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.y && $$7.a($$3, $$3.fB().d ? $$8.o() : $$8, ((cdg)$$9.get()).e())) {
               $$3.a(akg.av);
               return baj.a;
            }

            return baj.b;
         }
      }

      return baj.d;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if ($$0.c(b) && $$3 instanceof bcc && !cet.j((bcc)$$3)) {
         $$3.a(baw.a, (float)this.i);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         cti $$5 = $$1.c_($$2);
         if ($$5 instanceof ctm) {
            baf.a($$1, $$2, ((ctm)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cgy $$1 = $$0.q();
      gt $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == dpw.c;
      return this.m().a(d, Boolean.valueOf($$3)).a(c, Boolean.valueOf(this.n($$1.a_($$2.c())))).a(b, Boolean.valueOf(!$$3)).a(e, $$0.g());
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$1 == gy.a ? $$0.a(c, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(cvo $$0) {
      return $$0.a(cju.hh);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ajw.cv, ajx.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.h && $$3.a(5) == 0) {
            for(int $$4 = 0; $$4 < $$3.a(1) + 1; ++$$4) {
               $$1.a(io.S, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }

      }
   }

   public static void a(@Nullable bbn $$0, cgy $$1, gt $$2, cvo $$3) {
      if ($$1.k_()) {
         for(int $$4 = 0; $$4 < 20; ++$$4) {
            a((cgx)$$1, $$2, $$3.c(c), true);
         }
      }

      cti $$5 = $$1.c_($$2);
      if ($$5 instanceof ctm) {
         ((ctm)$$5).f();
      }

      $$1.a($$0, czv.c, $$2);
   }

   @Override
   public boolean a(cgy $$0, gt $$1, cvo $$2, dpv $$3) {
      if (!$$2.c(cwe.C) && $$3.a() == dpw.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.k_()) {
               $$0.a(null, $$1, ajw.hp, ajx.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)).a(b, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      gt $$4 = $$2.a();
      if (!$$0.y && $$3.bH() && $$3.a($$0, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.a(cwe.r, Boolean.valueOf(true)), 11);
      }

   }

   public static void a(cgx $$0, gt $$1, boolean $$2, boolean $$3) {
      amn $$4 = $$0.r_();
      ir $$5 = $$2 ? io.an : io.am;
      $$0.b(
         $$5,
         true,
         (double)$$1.u() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         (double)$$1.v() + $$4.j() + $$4.j(),
         (double)$$1.w() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if ($$3) {
         $$0.a(
            io.Y,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }

   }

   public static boolean a(cgx $$0, gt $$1) {
      for(int $$2 = 1; $$2 <= 5; ++$$2) {
         gt $$3 = $$1.c($$2);
         cvo $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = dxg.c(f, $$4.b($$0, $$1, dwv.a()), dwu.i);
         if ($$5) {
            cvo $$6 = $$0.a_($$3.c());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(cvo $$0) {
      return $$0.b(b) && $$0.a(akl.aM) && $$0.c(b);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(d) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      if ($$0.y) {
         return $$1.c(b) ? a($$2, ctk.F, ctm::c) : null;
      } else {
         return $$1.c(b) ? a($$2, ctk.F, ctm::a) : a($$2, ctk.F, ctm::b);
      }
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   public static boolean h(cvo $$0) {
      return $$0.a(akl.aM, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
