import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bdi extends bdo<bne> {
   private static final int a = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bbr<? extends bne> f;
   private final float g;
   private long h;

   public bdi(bbr<? extends bne> $$0, float $$1) {
      super(ImmutableMap.of(bku.h, bkv.a, bku.r, bkv.b, bku.m, bkv.c, bku.n, bkv.c), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(agg $$0, bne $$1) {
      return $$1.fP() && this.c($$1).isPresent();
   }

   protected void a(agg $$0, bne $$1, long $$2) {
      bne $$3 = (bne)this.c($$1).get();
      $$1.dy().a(bku.r, $$3);
      $$3.dy().a(bku.r, $$1);
      bdp.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.dQ().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(agg $$0, bne $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bne $$3 = this.a($$1);
         return $$3.bo() && $$1.a($$3) && bdp.a($$1.dy(), $$3) && $$2 <= this.h;
      }
   }

   protected void c(agg $$0, bne $$1, long $$2) {
      bne $$3 = this.a($$1);
      bdp.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dy().b(bku.r);
            $$3.dy().b(bku.r);
         }

      }
   }

   protected void d(agg $$0, bne $$1, long $$2) {
      $$1.dy().b(bku.r);
      $$1.dy().b(bku.m);
      $$1.dy().b(bku.n);
      this.h = 0L;
   }

   private bne a(bne $$0) {
      return (bne)$$0.dy().c(bku.r).get();
   }

   private boolean b(bne $$0) {
      bcx<?> $$1 = $$0.dy();
      return $$1.a(bku.r) && ((bbk)$$1.c(bku.r).get()).ad() == this.f;
   }

   private Optional<? extends bne> c(bne $$0) {
      return ((bkw)$$0.dy().c(bku.h).get()).a($$1 -> {
         if ($$1.ad() == this.f && $$1 instanceof bne $$2 && $$0.a($$2)) {
            return true;
         }

         return false;
      }).map(bne.class::cast);
   }
}
