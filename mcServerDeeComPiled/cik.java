import javax.annotation.Nullable;

public abstract class cik extends cjg {
   private final bzq a;

   protected cik(bzq $$0, cvn.c $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boolean Y_() {
      return true;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new csy($$0, $$1, this.a);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
      if ($$0.y) {
         $$0.a($$1, ctk.s).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.z()) {
         $$0.a($$1, ctk.s).ifPresent($$1x -> $$1x.a($$4.x()));
      }

   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      cti $$3 = $$0.c_($$1);
      return $$3 instanceof csy ? ((csy)$$3).f() : super.a($$0, $$1, $$2);
   }

   public bzq b() {
      return this.a;
   }
}
