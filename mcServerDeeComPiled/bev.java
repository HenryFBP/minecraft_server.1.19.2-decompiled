import com.google.common.collect.ImmutableMap;

public class bev extends bdo<bce> {
   public bev(int $$0, int $$1) {
      super(ImmutableMap.of(bku.n, bkv.a), $$0, $$1);
   }

   protected boolean a(agg $$0, bce $$1, long $$2) {
      return $$1.dy().c(bku.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(agg $$0, bce $$1, long $$2) {
      $$1.dy().b(bku.n);
   }

   protected void c(agg $$0, bce $$1, long $$2) {
      $$1.dy().c(bku.n).ifPresent($$1x -> $$1.z().a($$1x.a()));
   }
}
