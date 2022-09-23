import com.google.common.collect.ImmutableMap;
import java.util.function.Function;

public class bdl<E extends bbk> extends bdo<E> {
   private final azu a;
   private final Function<bcc, Float> d;

   public bdl(azu $$0, float $$1) {
      this($$0, $$1x -> $$1);
   }

   public bdl(azu $$0, Function<bcc, Float> $$1) {
      super(ImmutableMap.of(bku.J, bkv.a, bku.m, bkv.b));
      this.a = $$0;
      this.d = $$1;
   }

   protected boolean a(agg $$0, E $$1) {
      if (!$$1.y_()) {
         return false;
      } else {
         bbk $$2 = this.a($$1);
         return $$1.a($$2, (double)(this.a.b() + 1)) && !$$1.a($$2, (double)this.a.a());
      }
   }

   protected void a(agg $$0, E $$1, long $$2) {
      bdp.a($$1, this.a($$1), this.d.apply($$1), this.a.a() - 1);
   }

   private bbk a(E $$0) {
      return (bbk)$$0.dy().c(bku.J).get();
   }
}
