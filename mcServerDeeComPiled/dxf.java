import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class dxf extends AbstractDoubleList {
   private final DoubleList a;
   private final double b;

   public dxf(DoubleList $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public double getDouble(int $$0) {
      return this.a.getDouble($$0) + this.b;
   }

   public int size() {
      return this.a.size();
   }
}
