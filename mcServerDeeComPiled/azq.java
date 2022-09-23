import java.util.Arrays;

public class azq implements azr {
   private final azr[] a;

   public azq(azr... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(amn $$0) {
      float $$1 = 1.0F;

      for(int $$2 = 0; $$2 < this.a.length; ++$$2) {
         $$1 *= this.a[$$2].a($$0);
      }

      return $$1;
   }

   public String toString() {
      return "MultipliedFloats" + Arrays.toString(this.a);
   }
}
