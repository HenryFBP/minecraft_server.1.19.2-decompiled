import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class bej<E extends bcc> extends bdo<E> {
   private final Predicate<E> a;
   private final int d;
   private final float e;

   public bej(float $$0, boolean $$1, int $$2) {
      this($$0x -> true, $$0, $$1, $$2);
   }

   public bej(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      super(ImmutableMap.of(bku.n, bkv.c, bku.m, $$2 ? bkv.c : bkv.b, bku.K, bkv.a));
      this.a = $$0;
      this.d = $$3;
      this.e = $$1;
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      return !this.a($$1) && this.a.test($$1) && this.b($$1).a($$1, (double)this.d);
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      bdp.a($$1, this.b($$1), this.e, 0);
   }

   private boolean a(E $$0) {
      return $$0.dy().a(bku.aN, bkv.a);
   }

   private bqv b(E $$0) {
      return (bqv)$$0.dy().c(bku.K).get();
   }
}
