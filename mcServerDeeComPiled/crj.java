import javax.annotation.Nullable;

public class crj extends cjg implements cmq {
   public static final cwm<cwx> a = cwe.bk;

   protected crj(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, cwx.b));
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cuo($$0, $$1);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cti $$6 = $$1.c_($$2);
      if ($$6 instanceof cuo) {
         return ((cuo)$$6).a($$3) ? baj.a($$1.y) : baj.d;
      } else {
         return baj.d;
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
      if (!$$0.y) {
         if ($$3 != null) {
            cti $$5 = $$0.c_($$1);
            if ($$5 instanceof cuo) {
               ((cuo)$$5).a($$3);
            }
         }

      }
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if ($$1 instanceof agg) {
         cti $$6 = $$1.c_($$2);
         if ($$6 instanceof cuo) {
            cuo $$7 = (cuo)$$6;
            boolean $$8 = $$1.r($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((agg)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }

         }
      }
   }

   private void a(agg $$0, cuo $$1) {
      switch($$1.y()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.a($$0, false);
            break;
         case c:
            $$1.E();
         case d:
      }

   }
}
