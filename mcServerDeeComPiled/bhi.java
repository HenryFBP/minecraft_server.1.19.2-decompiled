import com.google.common.collect.ImmutableMap;

public class bhi extends bdo<btg> {
   public bhi() {
      super(ImmutableMap.of(bku.ax, bkv.c, bku.aw, bkv.c, bku.o, bkv.b));
   }

   protected boolean a(agg $$0, btg $$1) {
      return $$1.dy().a(bku.ax) || $$1.dy().a(bku.aw);
   }

   protected void a(agg $$0, btg $$1, long $$2) {
      gt $$3 = (gt)$$1.dy().c(bku.aw).map(bbn::da).or(() -> $$1.dy().c(bku.ax)).get();
      $$1.dy().a(bku.n, new bdq($$3));
   }
}
