import com.google.common.collect.ImmutableMap;

public class bon extends bdo<bol> {
   public bon() {
      super(ImmutableMap.of(bku.M, bkv.a, bku.y, bkv.a), 200);
   }

   protected boolean a(agg $$0, bol $$1) {
      return $$1.aU();
   }

   protected boolean a(agg $$0, bol $$1, long $$2) {
      return $$1.aU() && $$1.dy().a(bku.M);
   }

   protected void b(agg $$0, bol $$1, long $$2) {
      bcx<bol> $$3 = $$1.dy();
      $$3.b(bku.m);
      $$3.b(bku.n);
      $$1.b(new bbg(bbi.j, 200, 0));
   }
}
