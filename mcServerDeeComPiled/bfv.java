import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bfv extends bdo<btp> {
   private final bku<hb> a;
   private final float d;
   private final int e;
   private final int f;
   private final int g;

   public bfv(bku<hb> $$0, float $$1, int $$2, int $$3, int $$4) {
      super(ImmutableMap.of(bku.E, bkv.c, bku.m, bkv.b, $$0, bkv.a));
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   private void a(btp $$0, long $$1) {
      bcx<?> $$2 = $$0.dy();
      $$0.a(this.a);
      $$2.b(this.a);
      $$2.a(bku.E, $$1);
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      $$3.c(this.a).ifPresent($$4 -> {
         if (this.a($$0, $$4) || this.a($$0, $$1)) {
            this.a($$1, $$2);
         } else if (this.a($$1, $$4)) {
            dwq $$5 = null;
            int $$6 = 0;

            for(int $$7 = 1000; $$6 < 1000 && ($$5 == null || this.a($$1, hb.a($$0.ab(), new gt($$5)))); ++$$6) {
               $$5 = bmj.a($$1, 15, 7, dwq.c($$4.b()), (float) (Math.PI / 2));
            }

            if ($$6 == 1000) {
               this.a($$1, $$2);
               return;
            }

            $$3.a(bku.m, new bkx($$5, this.d, this.e));
         } else if (!this.a($$0, $$1, $$4)) {
            $$3.a(bku.m, new bkx($$4.b(), this.d, this.e));
         }

      });
   }

   private boolean a(agg $$0, btp $$1) {
      Optional<Long> $$2 = $$1.dy().c(bku.E);
      if ($$2.isPresent()) {
         return $$0.U() - $$2.get() > (long)this.g;
      } else {
         return false;
      }
   }

   private boolean a(btp $$0, hb $$1) {
      return $$1.b().k($$0.da()) > this.f;
   }

   private boolean a(agg $$0, hb $$1) {
      return $$1.a() != $$0.ab();
   }

   private boolean a(agg $$0, btp $$1, hb $$2) {
      return $$2.a() == $$0.ab() && $$2.b().k($$1.da()) <= this.e;
   }
}
