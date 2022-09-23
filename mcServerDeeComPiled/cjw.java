import javax.annotation.Nullable;

public class cjw extends cjg {
   public static final cwf[] a = new cwf[]{cwe.k, cwe.l, cwe.m};
   protected static final dxj b = dxg.a(cjt.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cjt.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public cjw(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return $$0.y ? null : a($$2, ctk.k, ctl::a);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         cti $$6 = $$1.c_($$2);
         if ($$6 instanceof ctl) {
            $$3.a((ctl)$$6);
            $$3.a(akg.aa);
         }

         return baj.b;
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof ctl) {
            ((ctl)$$5).a($$4.x());
         }
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(io.Y, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         cti $$5 = $$1.c_($$2);
         if ($$5 instanceof ctl) {
            baf.a($$1, $$2, (ctl)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return bwm.a($$1.c_($$2));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a[0], a[1], a[2]);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
