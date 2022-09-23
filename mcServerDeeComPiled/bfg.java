import javax.annotation.Nullable;

public class bfg extends bff {
   public static final int[][] e = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public bfg(float $$0) {
      super($$0);
   }

   @Override
   protected boolean a(agg $$0, bcl $$1) {
      return $$1.aU();
   }

   @Nullable
   @Override
   protected dwq a(bcl $$0) {
      dwq $$1 = null;
      dwq $$2 = null;

      for(int[] $$3 : e) {
         if ($$1 == null) {
            $$2 = bdp.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.cY().e($$0.cY().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.s.b_(new gt($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }
}
