import javax.annotation.Nullable;

public abstract class ciq extends cjg implements ccp {
   private final cqm.a a;

   public ciq(cqm.a $$0, cvn.c $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cul($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return !$$0.y || !$$1.a(cju.fR) && !$$1.a(cju.fS) ? null : a($$2, ctk.o, cul::a);
   }

   public cqm.a b() {
      return this.a;
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
