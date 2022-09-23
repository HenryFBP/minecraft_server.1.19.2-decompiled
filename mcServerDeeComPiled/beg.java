import com.google.common.collect.ImmutableMap;

public class beg extends bdo<btp> {
   private final float a;
   private final int d;

   public beg(float $$0, int $$1) {
      super(ImmutableMap.of(bku.m, bkv.b));
      this.a = $$0;
      this.d = $$1;
   }

   protected boolean a(agg $$0, btp $$1) {
      return !$$0.b($$1.da());
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      bms $$3 = $$0.x();
      int $$4 = $$3.a(hq.a($$1.da()));
      dwq $$5 = null;

      for(int $$6 = 0; $$6 < 5; ++$$6) {
         dwq $$7 = bmm.a($$1, 15, 7, $$1x -> (double)(-$$3.a(hq.a($$1x))));
         if ($$7 != null) {
            int $$8 = $$3.a(hq.a(new gt($$7)));
            if ($$8 < $$4) {
               $$5 = $$7;
               break;
            }

            if ($$8 == $$4) {
               $$5 = $$7;
            }
         }
      }

      if ($$5 != null) {
         $$1.dy().a(bku.m, new bkx($$5, this.a, this.d));
      }

   }
}
