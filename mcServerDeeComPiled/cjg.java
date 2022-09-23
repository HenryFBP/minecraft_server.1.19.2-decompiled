import javax.annotation.Nullable;

public abstract class cjg extends cjt implements cmb {
   protected cjg(cvn.c $$0) {
      super($$0);
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.a;
   }

   @Override
   public boolean a(cvo $$0, cgx $$1, gt $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cti $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bam b(cvo $$0, cgx $$1, gt $$2) {
      cti $$3 = $$1.c_($$2);
      return $$3 instanceof bam ? (bam)$$3 : null;
   }

   @Nullable
   protected static <E extends cti, A extends cti> ctj<A> a(ctk<A> $$0, ctk<E> $$1, ctj<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
