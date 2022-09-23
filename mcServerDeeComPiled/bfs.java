import com.google.common.collect.ImmutableMap;

public class bfs extends bdo<bcc> {
   public bfs() {
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
      if ($$4 != null) {
         if ($$4.c() && !$$4.b()) {
            $$3.b(bvn.h);
            $$3.a(bvn.h);
         } else {
            $$3.b(bvn.i);
            $$3.a(bvn.i);
         }
      }

   }
}
