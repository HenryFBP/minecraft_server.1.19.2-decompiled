import javax.annotation.Nullable;

public class cqx extends cjg {
   protected cqx(cvn.c $$0) {
      super($$0);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cun($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$2, ctk.i, $$0.y ? cun::a : cun::b);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, cax $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.w.a(15) + $$1.w.a(15);
         this.a($$1, $$2, $$5);
      }

   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return cax.b;
   }
}
