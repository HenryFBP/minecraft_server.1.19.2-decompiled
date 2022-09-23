import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bta<E extends bss> extends bdo<E> {
   private final int a;

   public bta(int $$0) {
      super(ImmutableMap.of(bku.ab, bkv.a, bku.K, bkv.c));
      this.a = $$0;
   }

   protected boolean a(agg $$0, E $$1) {
      if (!$$1.eA().b()) {
         return false;
      } else {
         Optional<bqv> $$2 = $$1.dy().c(bku.K);
         if (!$$2.isPresent()) {
            return true;
         } else {
            return !((bqv)$$2.get()).a($$1, (double)this.a);
         }
      }
   }

   protected void a(agg $$0, E $$1, long $$2) {
      $$1.dy().b(bku.ab);
   }
}
