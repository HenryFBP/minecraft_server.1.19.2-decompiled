import com.google.common.collect.ImmutableMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class bfw extends bdo<bcc> {
   private final Function<bcc, Float> a;
   private final int d;
   private final Predicate<bcc> e;

   public bfw(float $$0, int $$1) {
      this($$0x -> true, $$1x -> $$0, $$1);
   }

   public bfw(Predicate<bcc> $$0, Function<bcc, Float> $$1, int $$2) {
      super(ImmutableMap.of(bku.m, bkv.b, bku.n, bkv.a));
      this.a = $$1;
      this.d = $$2;
      this.e = $$0;
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      return this.e.test($$1);
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      bfc $$4 = (bfc)$$3.c(bku.n).get();
      $$3.a(bku.m, new bkx($$4, this.a.apply($$1), this.d));
   }
}
