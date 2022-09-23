import javax.annotation.Nullable;

public class bja extends bjl {
   private static final int i = 10;
   private static final int j = 7;

   public bja(bcl $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      agg $$0 = (agg)this.b.s;
      gt $$1 = this.b.da();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected dwq h() {
      agg $$0 = (agg)this.b.s;
      gt $$1 = this.b.da();
      hq $$2 = hq.a($$1);
      hq $$3 = bdp.a($$0, $$2, 2);
      return $$3 != $$2 ? bmj.a(this.b, 10, 7, dwq.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
