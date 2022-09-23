import java.util.Optional;

public class cgn extends cgq {
   private final bbn a;

   public cgn(bbn $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cgp $$0, cgd $$1, gt $$2, cvo $$3, dpv $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cgp $$0, cgd $$1, gt $$2, cvo $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
