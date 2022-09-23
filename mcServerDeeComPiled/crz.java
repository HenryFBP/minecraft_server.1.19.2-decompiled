import javax.annotation.Nullable;

public class crz extends cjt {
   public static final int a = 2;
   public static final int b = 1;
   public static final int c = 4;
   private static final dxj f = cjt.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final dxj g = cjt.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final cwo d = cwe.aE;
   public static final cwo e = cwe.aD;

   public crz(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(d, Integer.valueOf(0)).a(e, Integer.valueOf(1)));
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bbn $$3) {
      if (!$$3.bM()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, float $$4) {
      if (!($$3 instanceof bsj)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.y && $$0.w.a($$4) == 0 && $$1.a(cju.kR)) {
            this.a($$0, $$2, $$1);
         }

      }
   }

   private void a(cgx $$0, gt $$1, cvo $$2) {
      $$0.a(null, $$1, ajw.vj, ajx.e, 0.7F, 0.9F + $$0.w.i() * 0.2F);
      int $$3 = $$2.c(e);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(e, Integer.valueOf($$3 - 1)), 2);
         $$0.a(czv.f, $$1, czv.a.a($$2));
         $$0.c(2001, $$1, cjt.i($$2));
      }

   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(d);
         if ($$4 < 2) {
            $$1.a(null, $$2, ajw.vk, ajx.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(d, Integer.valueOf($$4 + 1)), 2);
         } else {
            $$1.a(null, $$2, ajw.vl, ajx.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);

            for(int $$5 = 0; $$5 < $$0.c(e); ++$$5) {
               $$1.c(2001, $$2, cjt.i($$0));
               bof $$6 = bbr.aX.a((cgx)$$1);
               $$6.b_(-24000);
               $$6.g($$2);
               $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
               $$1.b($$6);
            }
         }
      }

   }

   public static boolean a(cgd $$0, gt $$1) {
      return b($$0, $$1.c());
   }

   public static boolean b(cgd $$0, gt $$1) {
      return $$0.a_($$1).a(akl.E);
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.y) {
         $$1.c(2005, $$2, 0);
      }

   }

   private boolean a(cgx $$0) {
      float $$1 = $$0.f(1.0F);
      if ((double)$$1 < 0.69 && (double)$$1 > 0.65) {
         return true;
      } else {
         return $$0.w.a(500) == 0;
      }
   }

   @Override
   public void a(cgx $$0, buc $$1, gt $$2, cvo $$3, @Nullable cti $$4, cax $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      return !$$1.h() && $$1.n().a(this.l()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : super.a($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return $$0.c(e) > 1 ? g : f;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d, e);
   }

   private boolean a(cgx $$0, bbn $$1) {
      if ($$1 instanceof bof || $$1 instanceof bmz) {
         return false;
      } else if (!($$1 instanceof bcc)) {
         return false;
      } else {
         return $$1 instanceof buc || $$0.W().b(cgt.c);
      }
   }
}
