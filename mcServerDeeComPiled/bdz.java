import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class bdz<E extends bcc> extends bdo<E> {
   private final Predicate<E> a;
   private final bku<?> d;

   public bdz(Predicate<E> $$0, bku<?> $$1) {
      super(ImmutableMap.of($$1, bkv.a));
      this.a = $$0;
      this.d = $$1;
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      return this.a.test($$1);
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      $$1.dy().b(this.d);
   }
}
