import com.google.common.collect.ImmutableMap;

public class bex<E extends bcc> extends bdo<E> {
   private static final int a = 1;
   private final float d;

   public bex(float $$0) {
      super(ImmutableMap.of(bku.n, bkv.c, bku.m, bkv.b, bku.s, bkv.a));
      this.d = $$0;
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      return !$$1.bI();
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         $$1.k(this.b($$1));
      } else {
         bdp.a($$1, this.b($$1), this.d, 1);
      }

   }

   private boolean a(E $$0) {
      return this.b($$0).a($$0, 1.0);
   }

   private bbn b(E $$0) {
      return (bbn)$$0.dy().c(bku.s).get();
   }
}
