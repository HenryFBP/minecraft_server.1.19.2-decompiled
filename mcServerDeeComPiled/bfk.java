import com.google.common.collect.ImmutableMap;

public class bfk extends bdo<bcc> {
   private static final float d = 0.95F;
   public static final int a = 3;

   public bfk() {
      super(ImmutableMap.of(bku.e, bkv.a));
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      return $$0.w.i() > 0.95F;
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      gt $$4 = ((hb)$$3.c(bku.e).get()).b();
      if ($$4.a($$1.da(), 3.0)) {
         cvo $$5 = $$0.a_($$4);
         if ($$5.a(cju.mO)) {
            cjp $$6 = (cjp)$$5.b();
            $$6.a($$1, $$0, $$4, null);
         }
      }

   }
}
