import com.google.common.collect.ImmutableMap;

public class bei<E extends bce> extends bdo<E> {
   private final bku<gt> a;
   private final int d;
   private final float e;

   public bei(bku<gt> $$0, int $$1, float $$2) {
      super(ImmutableMap.of($$0, bkv.a, bku.o, bkv.b, bku.m, bkv.b, bku.n, bkv.c));
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   protected void a(agg $$0, bce $$1, long $$2) {
      gt $$3 = this.a($$1);
      boolean $$4 = $$3.a($$1.da(), (double)this.d);
      if (!$$4) {
         bdp.a($$1, a($$1, $$3), this.e, this.d);
      }

   }

   private static gt a(bce $$0, gt $$1) {
      amn $$2 = $$0.s.w;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(amn $$0) {
      return $$0.a(3) - 1;
   }

   private gt a(bce $$0) {
      return (gt)$$0.dy().c(this.a).get();
   }
}
