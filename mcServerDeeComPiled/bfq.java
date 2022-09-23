import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bfq extends bdo<bcc> {
   private static final int a = 300;
   private final int d;
   private final int e;
   private int f;

   public bfq(int $$0, int $$1) {
      super(ImmutableMap.of(bku.C, bkv.a, bku.D, bkv.a));
      this.e = $$0 * 20;
      this.f = 0;
      this.d = $$1;
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      Optional<Long> $$4 = $$3.c(bku.D);
      boolean $$5 = $$4.get() + 300L <= $$2;
      if (this.f <= this.e && !$$5) {
         gt $$6 = ((hb)$$3.c(bku.C).get()).b();
         if ($$6.a($$1.da(), (double)this.d)) {
            ++this.f;
         }

      } else {
         $$3.b(bku.D);
         $$3.b(bku.C);
         $$3.a($$0.V(), $$0.U());
         this.f = 0;
      }
   }
}
