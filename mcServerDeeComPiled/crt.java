import javax.annotation.Nullable;

public class crt extends cjt {
   public static final cwf a = cwe.B;

   public crt(cvn.c $$0) {
      super($$0);
      this.k(this.m().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.r($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }

      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if ($$1.r($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }

   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$0.k_() && !$$3.f() && $$2.c(a)) {
         a($$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cgx $$0, gt $$1, cgp $$2) {
      if (!$$0.y) {
         bqw $$3 = new bqw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.d());
         int $$4 = $$3.i();
         $$3.a((short)($$0.w.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cgx $$0, gt $$1) {
      a($$0, $$1, null);
   }

   private static void a(cgx $$0, gt $$1, @Nullable bcc $$2) {
      if (!$$0.y) {
         bqw $$3 = new bqw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.df(), $$3.dh(), $$3.dl(), ajw.uJ, ajx.e, 1.0F, 1.0F);
         $$0.a($$2, czv.K, $$1);
      }
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      if (!$$6.a(caz.mO) && !$$6.a(caz.rW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cju.a.m(), 11);
         cat $$7 = $$6.c();
         if (!$$3.f()) {
            if ($$6.a(caz.mO)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.g(1);
            }
         }

         $$3.b(akg.c.b($$7));
         return baj.a($$1.y);
      }
   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      if (!$$0.y) {
         gt $$4 = $$2.a();
         bbn $$5 = $$3.x();
         if ($$3.bH() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bcc ? (bcc)$$5 : null);
            $$0.a($$4, false);
         }
      }

   }

   @Override
   public boolean a(cgp $$0) {
      return false;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }
}
