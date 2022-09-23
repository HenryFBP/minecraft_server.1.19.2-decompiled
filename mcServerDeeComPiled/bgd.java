import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bgd<E extends bcc> extends bdo<E> {
   private final Function<bcc, Optional<bfc>> a;
   private final int d;
   private final int e;
   private final float f;

   public bgd(Function<bcc, Optional<bfc>> $$0, int $$1, int $$2, float $$3) {
      super(Map.of(bku.m, bkv.b));
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      Optional<bfc> $$2 = (Optional)this.a.apply($$1);
      if ($$2.isEmpty()) {
         return false;
      } else {
         bfc $$3 = (bfc)$$2.get();
         return !$$1.cY().a((hj)$$3.a(), (double)this.e);
      }
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      bdp.a($$1, (bfc)((Optional)this.a.apply($$1)).get(), this.f, this.d);
   }
}
