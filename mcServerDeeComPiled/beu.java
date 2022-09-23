import com.google.common.collect.ImmutableMap;

public class beu extends bdo<btp> {
   private final float a;

   public beu(float $$0) {
      super(ImmutableMap.of(bku.m, bkv.c, bku.n, bkv.c), Integer.MAX_VALUE);
      this.a = $$0;
   }

   protected boolean a(agg $$0, btp $$1) {
      buc $$2 = $$1.fK();
      return $$1.bo() && $$2 != null && !$$1.aR() && !$$1.D && $$1.f($$2) <= 16.0 && $$2.bU != null;
   }

   protected boolean a(agg $$0, btp $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(agg $$0, btp $$1, long $$2) {
      this.a($$1);
   }

   protected void c(agg $$0, btp $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      $$3.b(bku.m);
      $$3.b(bku.n);
   }

   protected void d(agg $$0, btp $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(btp $$0) {
      bcx<?> $$1 = $$0.dy();
      $$1.a(bku.m, new bkx(new bdy($$0.fK(), false), this.a, 2));
      $$1.a(bku.n, new bdy($$0.fK(), true));
   }
}
