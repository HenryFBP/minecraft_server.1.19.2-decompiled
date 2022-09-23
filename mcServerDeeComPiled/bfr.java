import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class bfr extends bdo<bcc> {
   private final bbr<?> a;
   private final int d;
   private final Predicate<bcc> e;
   private final Predicate<bcc> f;

   public bfr(bbr<?> $$0, int $$1, Predicate<bcc> $$2, Predicate<bcc> $$3) {
      super(ImmutableMap.of(bku.n, bkv.c, bku.q, bkv.b, bku.h, bkv.a));
      this.a = $$0;
      this.d = $$1 * $$1;
      this.e = $$3;
      this.f = $$2;
   }

   public bfr(bbr<?> $$0, int $$1) {
      this($$0, $$1, $$0x -> true, $$0x -> true);
   }

   @Override
   public boolean a(agg $$0, bcc $$1) {
      return this.f.test($$1) && this.b($$1).d(this::a);
   }

   @Override
   public void a(agg $$0, bcc $$1, long $$2) {
      super.a($$0, $$1, $$2);
      bcx<?> $$3 = $$1.dy();
      $$3.c(bku.h).flatMap($$1x -> $$1x.a($$1xx -> $$1xx.f((bbn)$$1) <= (double)this.d && this.a($$1xx))).ifPresent($$1x -> {
         $$3.a(bku.q, $$1x);
         $$3.a(bku.n, new bdy($$1x, true));
      });
   }

   private boolean a(bcc $$0) {
      return this.a.equals($$0.ad()) && this.e.test($$0);
   }

   private bkw b(bcc $$0) {
      return (bkw)$$0.dy().c(bku.h).get();
   }
}
