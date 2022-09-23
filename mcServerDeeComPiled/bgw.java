import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bgw extends bdo<btp> {
   private static final int a = 5;
   private static final float d = 0.5F;
   private long e;

   public bgw() {
      super(ImmutableMap.of(bku.r, bkv.a, bku.h, bkv.a), 350, 350);
   }

   protected boolean a(agg $$0, btp $$1) {
      return this.a($$1);
   }

   protected boolean a(agg $$0, btp $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(agg $$0, btp $$1, long $$2) {
      bbk $$3 = (bbk)$$1.dy().c(bku.r).get();
      bdp.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dQ().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(agg $$0, btp $$1, long $$2) {
      btp $$3 = (btp)$$1.dy().c(bku.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bdp.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gb();
            $$3.gb();
            this.a($$0, $$1, $$3);
         } else if ($$1.dQ().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }

      }
   }

   private void a(agg $$0, btp $$1, btp $$2) {
      Optional<gt> $$3 = this.b($$0, $$1);
      if (!$$3.isPresent()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<btp> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, (btp)$$4.get(), (gt)$$3.get());
         } else {
            $$0.x().b((gt)$$3.get());
            xl.c($$0, (gt)$$3.get());
         }
      }

   }

   protected void d(agg $$0, btp $$1, long $$2) {
      $$1.dy().b(bku.r);
   }

   private boolean a(btp $$0) {
      bcx<btp> $$1 = $$0.dy();
      Optional<bbk> $$2 = $$1.c(bku.r).filter($$0x -> $$0x.ad() == bbr.aZ);
      if (!$$2.isPresent()) {
         return false;
      } else {
         return bdp.a($$1, bku.r, bbr.aZ) && $$0.g() && ((bbk)$$2.get()).g();
      }
   }

   private Optional<gt> b(agg $$0, btp $$1) {
      return $$0.x().a($$0x -> $$0x.a(bmw.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.da(), 48);
   }

   private boolean a(btp $$0, gt $$1, hc<bmv> $$2) {
      dql $$3 = $$0.D().a($$1, ((bmv)$$2.a()).c());
      return $$3 != null && $$3.j();
   }

   private Optional<btp> b(agg $$0, btp $$1, btp $$2) {
      btp $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.b_(6000);
         $$2.b_(6000);
         $$3.b_(-24000);
         $$3.b($$1.df(), $$1.dh(), $$1.dl(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(agg $$0, btp $$1, gt $$2) {
      hb $$3 = hb.a($$0.ab(), $$2);
      $$1.dy().a(bku.b, $$3);
   }
}
