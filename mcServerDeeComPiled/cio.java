import javax.annotation.Nullable;

public abstract class cio extends cjg {
   public static final cwi a = cnf.aD;
   public static final cwf b = cwe.r;

   protected cio(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         this.a($$1, $$2, $$3);
         return baj.b;
      }
   }

   protected abstract void a(cgx var1, gt var2, buc var3);

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.g().g());
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof csx) {
            ((csx)$$5).a($$4.x());
         }
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         cti $$5 = $$1.c_($$2);
         if ($$5 instanceof csx) {
            if ($$1 instanceof agg) {
               baf.a($$1, $$2, (csx)$$5);
               ((csx)$$5).a((agg)$$1, dwq.a($$2));
            }

            $$1.c($$2, this);
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
   public cpp b_(cvo $$0) {
      return cpp.c;
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

   @Nullable
   protected static <T extends cti> ctj<T> a(cgx $$0, ctk<T> $$1, ctk<? extends csx> $$2) {
      return $$0.y ? null : a($$1, $$2, csx::a);
   }
}
