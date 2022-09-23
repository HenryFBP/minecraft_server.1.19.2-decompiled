import com.google.common.collect.ImmutableMap;

public class bgj extends bdo<bce> {
   private final float a;

   public bgj(float $$0) {
      super(ImmutableMap.of());
      this.a = $$0;
   }

   protected boolean a(agg $$0, bce $$1) {
      return $$1.aR() && $$1.b(akp.a) > $$1.cV() || $$1.bf();
   }

   protected boolean a(agg $$0, bce $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(agg $$0, bce $$1, long $$2) {
      if ($$1.dQ().i() < this.a) {
         $$1.C().a();
      }

   }
}
