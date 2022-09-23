import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class beb extends bdo<bcl> {
   public static final int a = 100;
   public static final double d = 2.5;
   private final Function<bcc, Float> e;

   public beb(Function<bcc, Float> $$0) {
      super(ad.a((Supplier<Map<bku<?>, bkv>>)(() -> {
         Builder<bku<?>, bkv> $$0x = ImmutableMap.builder();
         $$0x.put(bku.n, bkv.c);
         $$0x.put(bku.m, bkv.c);
         $$0x.put(bku.O, bkv.b);
         $$0x.put(bku.P, bkv.c);
         $$0x.put(bku.N, bkv.a);
         $$0x.put(bku.r, bkv.b);
         $$0x.put(bku.X, bkv.b);
         return $$0x.build();
      })));
      this.e = $$0;
   }

   protected float a(bcl $$0) {
      return this.e.apply($$0);
   }

   private Optional<buc> b(bcl $$0) {
      return $$0.dy().c(bku.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(agg $$0, bcl $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dy().a(bku.r) && !$$1.dy().a(bku.X);
   }

   protected void b(agg $$0, bcl $$1, long $$2) {
      $$1.dy().a(bku.P, true);
   }

   protected void c(agg $$0, bcl $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      $$3.a(bku.O, 100);
      $$3.a(bku.P, false);
      $$3.b(bku.m);
      $$3.b(bku.n);
   }

   protected void d(agg $$0, bcl $$1, long $$2) {
      buc $$3 = (buc)this.b($$1).get();
      bcx<?> $$4 = $$1.dy();
      $$4.a(bku.n, new bdy($$3, true));
      if ($$1.f($$3) < 6.25) {
         $$4.b(bku.m);
      } else {
         $$4.a(bku.m, new bkx(new bdy($$3, false), this.a($$1), 2));
      }

   }
}
