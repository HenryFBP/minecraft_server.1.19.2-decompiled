import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;

public class bfp extends bdo<bcc> {
   private final Predicate<bcc> a;
   private final float d;
   private Optional<bcc> e = Optional.empty();

   public bfp(akz<bbr<?>> $$0, float $$1) {
      this($$1x -> $$1x.ad().a($$0), $$1);
   }

   public bfp(bcf $$0, float $$1) {
      this($$1x -> $$0.equals($$1x.ad().f()), $$1);
   }

   public bfp(bbr<?> $$0, float $$1) {
      this($$1x -> $$0.equals($$1x.ad()), $$1);
   }

   public bfp(float $$0) {
      this($$0x -> true, $$0);
   }

   public bfp(Predicate<bcc> $$0, float $$1) {
      super(ImmutableMap.of(bku.n, bkv.b, bku.h, bkv.a));
      this.a = $$0;
      this.d = $$1 * $$1;
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      bkw $$2 = (bkw)$$1.dy().c(bku.h).get();
      this.e = $$2.a(this.a.and($$1x -> $$1x.f((bbn)$$1) <= (double)this.d));
      return this.e.isPresent();
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      $$1.dy().a(bku.n, new bdy((bbn)this.e.get(), true));
      this.e = Optional.empty();
   }
}
