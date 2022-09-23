import com.google.common.collect.ImmutableMap;

public class bsz<E extends bss> extends bdo<E> {
   public bsz() {
      super(ImmutableMap.of(bku.ai, bkv.a, bku.Z, bkv.b, bku.af, bkv.b, bku.am, bkv.c));
   }

   protected boolean a(agg $$0, bss $$1) {
      return !$$1.y_() && !bst.d($$1);
   }

   protected void a(agg $$0, E $$1, long $$2) {
      bsm $$3 = (bsm)$$1.dy().c(bku.ai).get();
      bst.c($$1, $$3);
      bst.c((bsr)$$1);
      bst.b($$1, $$3);
      bst.e($$1);
   }
}
