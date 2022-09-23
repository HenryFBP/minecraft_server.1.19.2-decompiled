import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class bds<E extends bce, T> extends bdo<E> {
   private final Predicate<E> a;
   private final bku<? extends T> d;
   private final bku<T> e;
   private final azu f;

   public bds(Predicate<E> $$0, bku<? extends T> $$1, bku<T> $$2, azu $$3) {
      super(ImmutableMap.of($$1, bkv.a, $$2, bkv.b));
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   protected boolean a(agg $$0, E $$1) {
      return this.a.test($$1);
   }

   protected void a(agg $$0, E $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      $$3.a(this.e, (T)$$3.c(this.d).get(), (long)this.f.a($$0.w));
   }
}
