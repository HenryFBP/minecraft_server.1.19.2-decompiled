import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class bdw<E extends bcc, T extends bbn> extends bdo<E> {
   private final int a;
   private final BiPredicate<E, bbn> d;

   public bdw(int $$0, BiPredicate<E, bbn> $$1) {
      super(ImmutableMap.of(bku.s, bkv.c));
      this.a = $$0;
      this.d = $$1;
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      bbn $$2 = $$1.cQ();
      bbn $$3 = (bbn)$$1.dy().c(bku.s).orElse(null);
      if ($$2 == null && $$3 == null) {
         return false;
      } else {
         bbn $$4 = $$2 == null ? $$3 : $$2;
         return !this.a($$1, $$4) || this.d.test($$1, $$4);
      }
   }

   private boolean a(E $$0, bbn $$1) {
      return $$1.bo() && $$1.a($$0, (double)this.a) && $$1.s == $$0.s;
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      $$1.p();
      $$1.dy().b(bku.s);
   }
}
