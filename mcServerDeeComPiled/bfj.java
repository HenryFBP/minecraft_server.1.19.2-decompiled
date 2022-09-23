import com.google.common.collect.ImmutableMap;

public class bfj extends bdo<bcc> {
   public bfj() {
      super(ImmutableMap.of());
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      return $$0.w.a(20) == 0;
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      bvj $$4 = $$0.c($$1.da());
      if ($$4 == null || $$4.d() || $$4.f()) {
         $$3.b(bvn.b);
         $$3.a($$0.V(), $$0.U());
      }

   }
}
