import com.google.common.collect.Lists;
import java.util.List;

public class chl {
   private final List<chl.a> a = Lists.newArrayList();

   public void a(gt $$0, double $$1) {
      if ($$1 != 0.0) {
         this.a.add(new chl.a($$0, $$1));
      }

   }

   public double b(gt $$0, double $$1) {
      if ($$1 == 0.0) {
         return 0.0;
      } else {
         double $$2 = 0.0;

         for(chl.a $$3 : this.a) {
            $$2 += $$3.a($$0);
         }

         return $$2 * $$1;
      }
   }

   static class a {
      private final gt a;
      private final double b;

      public a(gt $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public double a(gt $$0) {
         double $$1 = this.a.j($$0);
         return $$1 == 0.0 ? Double.POSITIVE_INFINITY : this.b / Math.sqrt($$1);
      }
   }
}
