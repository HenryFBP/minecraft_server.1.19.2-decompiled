import com.google.common.collect.ImmutableMap;

public class bsy<E extends bss> extends bdo<E> {
   private final int a;

   public bsy(int $$0) {
      super(ImmutableMap.of(bku.K, bkv.a, bku.ab, bkv.b, bku.ae, bkv.b, bku.ad, bkv.b));
      this.a = $$0;
   }

   protected boolean a(agg $$0, E $$1) {
      bqv $$2 = (bqv)$$1.dy().c(bku.K).get();
      return bst.a($$2.i());
   }

   protected void a(agg $$0, E $$1, long $$2) {
      $$1.dy().a(bku.ab, true, (long)this.a);
   }
}
