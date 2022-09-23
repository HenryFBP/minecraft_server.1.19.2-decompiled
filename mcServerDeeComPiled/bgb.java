import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bgb<E extends bce> extends bdo<E> {
   private final Predicate<E> a;
   private final Function<E, Optional<? extends bcc>> d;

   public bgb(Predicate<E> $$0, Function<E, Optional<? extends bcc>> $$1) {
      this($$0, $$1, 60);
   }

   public bgb(Predicate<E> $$0, Function<E, Optional<? extends bcc>> $$1, int $$2) {
      super(ImmutableMap.of(bku.o, bkv.b, bku.E, bkv.c), $$2);
      this.a = $$0;
      this.d = $$1;
   }

   public bgb(Function<E, Optional<? extends bcc>> $$0) {
      this($$0x -> true, $$0);
   }

   protected boolean a(agg $$0, E $$1) {
      if (!this.a.test($$1)) {
         return false;
      } else {
         Optional<? extends bcc> $$2 = (Optional)this.d.apply($$1);
         return $$2.isPresent() ? $$1.c((bcc)$$2.get()) : false;
      }
   }

   protected void a(agg $$0, E $$1, long $$2) {
      ((Optional)this.d.apply($$1)).ifPresent($$1x -> a($$1, $$1x));
   }

   public static <E extends bce> void a(E $$0, bcc $$1) {
      $$0.dy().a(bku.o, $$1);
      $$0.dy().b(bku.E);
   }
}
