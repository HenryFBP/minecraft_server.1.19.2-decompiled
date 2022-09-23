import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bga extends bdo<bcc> {
   private static final float a = 0.3F;

   public bga() {
      super(ImmutableMap.of(bku.m, bkv.c, bku.n, bkv.c, bku.e, bkv.a, bku.h, bkv.a, bku.q, bkv.b));
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      bcx<?> $$2 = $$1.dy();
      Optional<hb> $$3 = $$2.c(bku.e);
      return $$0.r_().a(100) == 0
         && $$3.isPresent()
         && $$0.ab() == ((hb)$$3.get()).a()
         && ((hb)$$3.get()).b().a($$1.cY(), 4.0)
         && ((bkw)$$2.c(bku.h).get()).d($$0x -> bbr.aZ.equals($$0x.ad()));
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      $$3.c(bku.h).flatMap($$1x -> $$1x.a($$1xx -> bbr.aZ.equals($$1xx.ad()) && $$1xx.f((bbn)$$1) <= 32.0)).ifPresent($$1x -> {
         $$3.a(bku.q, $$1x);
         $$3.a(bku.n, new bdy($$1x, true));
         $$3.a(bku.m, new bkx(new bdy($$1x, false), 0.3F, 1));
      });
   }
}
