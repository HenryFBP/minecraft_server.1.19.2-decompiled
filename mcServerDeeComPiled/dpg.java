import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dpg extends dpl<dpg.a> {
   protected dpg(cxv $$0) {
      super(chg.b, $$0, new dpg.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int d(long $$0) {
      long $$1 = hq.e($$0);
      cxo $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hq.b(gt.a($$0)), hq.b(gt.b($$0)), hq.b(gt.c($$0)));
   }

   protected static final class a extends dph<dpg.a> {
      public a(Long2ObjectOpenHashMap<cxo> $$0) {
         super($$0);
      }

      public dpg.a a() {
         return new dpg.a(this.a.clone());
      }
   }
}
