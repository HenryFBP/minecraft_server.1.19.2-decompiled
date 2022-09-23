import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bha extends bdo<btp> {
   private static final int a = 300;
   private static final double d = 1.73;
   private long e;

   public bha() {
      super(ImmutableMap.of(bku.c, bkv.a, bku.n, bkv.c));
   }

   protected boolean b(agg $$0, btp $$1) {
      if ($$0.U() - this.e < 300L) {
         return false;
      } else if ($$0.w.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.U();
         hb $$2 = (hb)$$1.dy().c(bku.c).get();
         return $$2.a() == $$0.ab() && $$2.b().a($$1.cY(), 1.73);
      }
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      bcx<btp> $$3 = $$1.dy();
      $$3.a(bku.I, $$2);
      $$3.c(bku.c).ifPresent($$1x -> $$3.a(bku.n, new bdq($$1x.b())));
      $$1.fZ();
      this.a($$0, $$1);
      if ($$1.fY()) {
         $$1.fX();
      }

   }

   protected void a(agg $$0, btp $$1) {
   }

   protected boolean b(agg $$0, btp $$1, long $$2) {
      Optional<hb> $$3 = $$1.dy().c(bku.c);
      if (!$$3.isPresent()) {
         return false;
      } else {
         hb $$4 = (hb)$$3.get();
         return $$4.a() == $$0.ab() && $$4.b().a($$1.cY(), 1.73);
      }
   }
}
