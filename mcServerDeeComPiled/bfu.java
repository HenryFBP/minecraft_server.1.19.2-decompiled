import com.google.common.collect.ImmutableMap;
import java.util.function.Function;

public class bfu extends bdo<bce> {
   private static final int a = 1;
   private final Function<bcc, Float> d;

   public bfu(float $$0) {
      this($$1 -> $$0);
   }

   public bfu(Function<bcc, Float> $$0) {
      super(ImmutableMap.of(bku.m, bkv.c, bku.n, bkv.c, bku.o, bkv.a, bku.h, bkv.c));
      this.d = $$0;
   }

   protected void a(agg $$0, bce $$1, long $$2) {
      bcc $$3 = (bcc)$$1.dy().c(bku.o).get();
      if (bdp.b($$1, $$3) && bdp.a($$1, $$3, 1)) {
         this.a($$1);
      } else {
         this.a($$1, $$3);
      }

   }

   private void a(bcc $$0, bcc $$1) {
      bcx<?> $$2 = $$0.dy();
      $$2.a(bku.n, new bdy($$1, true));
      bkx $$3 = new bkx(new bdy($$1, false), this.d.apply($$0), 0);
      $$2.a(bku.m, $$3);
   }

   private void a(bcc $$0) {
      $$0.dy().b(bku.m);
   }
}
