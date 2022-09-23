import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bep extends bdo<bcc> {
   private final float a;
   private final int d;
   private final int e;
   private Optional<gt> f = Optional.empty();

   public bep(int $$0, float $$1, int $$2) {
      super(ImmutableMap.of(bku.m, bkv.b, bku.b, bkv.c, bku.C, bkv.c));
      this.d = $$0;
      this.a = $$1;
      this.e = $$2;
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      Optional<gt> $$2 = $$0.x().d($$0x -> $$0x.a(bmw.n), $$0x -> true, $$1.da(), this.e + 1, bms.b.c);
      if ($$2.isPresent() && ((gt)$$2.get()).a($$1.cY(), (double)this.e)) {
         this.f = $$2;
      } else {
         this.f = Optional.empty();
      }

      return true;
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      Optional<gt> $$4 = this.f;
      if ($$4.isEmpty()) {
         $$4 = $$0.x().a($$0x -> $$0x.a(bmw.n), $$0x -> true, bms.b.c, $$1.da(), this.d, $$1.dQ());
         if ($$4.isEmpty()) {
            Optional<hb> $$5 = $$3.c(bku.b);
            if ($$5.isPresent()) {
               $$4 = Optional.of(((hb)$$5.get()).b());
            }
         }
      }

      if ($$4.isPresent()) {
         $$3.b(bku.t);
         $$3.b(bku.n);
         $$3.b(bku.r);
         $$3.b(bku.q);
         $$3.a(bku.C, hb.a($$0.ab(), (gt)$$4.get()));
         if (!((gt)$$4.get()).a($$1.cY(), (double)this.e)) {
            $$3.a(bku.m, new bkx((gt)$$4.get(), this.a, this.e));
         }
      }

   }
}
