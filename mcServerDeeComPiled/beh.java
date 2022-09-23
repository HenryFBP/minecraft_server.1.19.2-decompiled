import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class beh extends bdo<btp> {
   private static final int d = 1200;
   final float a;

   public beh(float $$0) {
      super(ImmutableMap.of(bku.d, bkv.a), 1200);
      this.a = $$0;
   }

   protected boolean a(agg $$0, btp $$1) {
      return $$1.dy().f().map($$0x -> $$0x == bvn.b || $$0x == bvn.c || $$0x == bvn.d).orElse(true);
   }

   protected boolean a(agg $$0, btp $$1, long $$2) {
      return $$1.dy().a(bku.d);
   }

   protected void b(agg $$0, btp $$1, long $$2) {
      bdp.a($$1, ((hb)$$1.dy().c(bku.d).get()).b(), this.a, 1);
   }

   protected void c(agg $$0, btp $$1, long $$2) {
      Optional<hb> $$3 = $$1.dy().c(bku.d);
      $$3.ifPresent($$1x -> {
         gt $$2x = $$1x.b();
         agg $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bms $$4 = $$3x.x();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            xl.c($$0, $$2x);
         }
      });
      $$1.dy().b(bku.d);
   }
}
