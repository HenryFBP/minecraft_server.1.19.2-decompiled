import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bir extends bjl {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bir(bcl $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected dwq h() {
      float $$0 = this.b.s.w.i();
      if (this.b.s.w.i() < 0.3F) {
         return this.k();
      } else {
         dwq $$1;
         if ($$0 < 0.7F) {
            $$1 = this.l();
            if ($$1 == null) {
               $$1 = this.m();
            }
         } else {
            $$1 = this.m();
            if ($$1 == null) {
               $$1 = this.l();
            }
         }

         return $$1 == null ? this.k() : $$1;
      }
   }

   @Nullable
   private dwq k() {
      return bmm.a(this.b, 10, 7);
   }

   @Nullable
   private dwq l() {
      agg $$0 = (agg)this.b.s;
      List<btp> $$1 = $$0.a(bbr.aZ, this.b.cy().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         btp $$2 = (btp)$$1.get(this.b.s.w.a($$1.size()));
         dwq $$3 = $$2.cY();
         return bmm.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private dwq m() {
      hq $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         gt $$1 = this.a($$0);
         return $$1 == null ? null : bmm.a(this.b, 10, 7, dwq.c($$1));
      }
   }

   @Nullable
   private hq n() {
      agg $$0 = (agg)this.b.s;
      List<hq> $$1 = (List)hq.a(hq.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : (hq)$$1.get($$0.w.a($$1.size()));
   }

   @Nullable
   private gt a(hq $$0) {
      agg $$1 = (agg)this.b.s;
      bms $$2 = $$1.x();
      List<gt> $$3 = (List)$$2.c($$0x -> true, $$0.q(), 8, bms.b.b).map(bmt::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : (gt)$$3.get($$1.w.a($$3.size()));
   }

   private boolean a(btp $$0) {
      return $$0.a(this.b.s.U());
   }
}
