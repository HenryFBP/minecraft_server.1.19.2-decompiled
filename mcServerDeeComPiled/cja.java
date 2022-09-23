import javax.annotation.Nullable;

public class cja extends cjg {
   public static final cwi a = cwe.Q;
   public static final cwf b = cwe.u;

   public cja(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         cti $$6 = $$1.c_($$2);
         if ($$6 instanceof ctb) {
            $$3.a((ctb)$$6);
            $$3.a(akg.ar);
            bst.a($$3, true);
         }

         return baj.b;
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         cti $$5 = $$1.c_($$2);
         if ($$5 instanceof bac) {
            baf.a($$1, $$2, (bac)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      cti $$4 = $$1.c_($$2);
      if ($$4 instanceof ctb) {
         ((ctb)$$4).i();
      }

   }

   @Nullable
   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctb($$0, $$1);
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof ctb) {
            ((ctb)$$5).a($$4.x());
         }
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
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.d().g());
   }
}
