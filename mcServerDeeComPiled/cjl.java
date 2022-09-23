import javax.annotation.Nullable;

public class cjl extends cjg implements cjk {
   public cjl(cvn.c $$0) {
      super($$0);
   }

   @Override
   public bzq a() {
      return bzq.a;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$2, ctk.n, ctd::a);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         cti $$6 = $$1.c_($$2);
         if ($$6 instanceof ctd) {
            $$3.a((ctd)$$6);
            $$3.a(akg.ab);
         }

         return baj.b;
      }
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof ctd) {
            ((ctd)$$5).a($$4.x());
         }
      }

   }
}
