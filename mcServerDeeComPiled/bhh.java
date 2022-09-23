import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Function;

public class bhh<E extends btg> extends bdo<E> {
   private final Function<E, Optional<? extends bcc>> a;

   public bhh(Function<E, Optional<? extends bcc>> $$0) {
      super(ImmutableMap.of(bku.aw, bkv.b, bku.o, bkv.b, bku.E, bkv.c));
      this.a = $$0;
   }

   protected boolean a(agg $$0, E $$1) {
      return ((Optional)this.a.apply($$1)).filter($$1::a).isPresent();
   }

   protected void a(agg $$0, E $$1, long $$2) {
      ((Optional)this.a.apply($$1)).ifPresent($$1x -> {
         $$1.dy().a(bku.aw, $$1x);
         $$1.dy().b(bku.E);
      });
   }
}
