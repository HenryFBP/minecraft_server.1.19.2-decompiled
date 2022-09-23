import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;

public class dws extends dxj {
   private final DoubleList b;
   private final DoubleList c;
   private final DoubleList d;

   protected dws(dwz $$0, double[] $$1, double[] $$2, double[] $$3) {
      this(
         $$0,
         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf($$1, $$0.b() + 1)),
         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf($$2, $$0.c() + 1)),
         (DoubleList)DoubleArrayList.wrap(Arrays.copyOf($$3, $$0.d() + 1))
      );
   }

   dws(dwz $$0, DoubleList $$1, DoubleList $$2, DoubleList $$3) {
      super($$0);
      int $$4 = $$0.b() + 1;
      int $$5 = $$0.c() + 1;
      int $$6 = $$0.d() + 1;
      if ($$4 == $$1.size() && $$5 == $$2.size() && $$6 == $$3.size()) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      } else {
         throw (IllegalArgumentException)ad.c(new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
      }
   }

   @Override
   protected DoubleList a(gy.a $$0) {
      switch($$0) {
         case a:
            return this.b;
         case b:
            return this.c;
         case c:
            return this.d;
         default:
            throw new IllegalArgumentException();
      }
   }
}
