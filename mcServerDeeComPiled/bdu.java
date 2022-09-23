import com.google.common.collect.ImmutableMap;

public class bdu extends bdo<boq> {
   private static final int a = 60;
   private static final int d = 100;
   private int e;

   public bdu() {
      super(ImmutableMap.of(bku.m, bkv.b), 100);
   }

   protected boolean a(agg $$0, boq $$1) {
      return $$1.ak() == bco.a;
   }

   protected boolean a(agg $$0, boq $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(agg $$0, boq $$1, long $$2) {
      if (!$$1.aU() && !$$1.bf()) {
         $$1.b(bco.i);
         this.e = 0;
      }
   }

   protected void c(agg $$0, boq $$1, long $$2) {
      $$1.b(bco.a);
   }

   protected void d(agg $$0, boq $$1, long $$2) {
      ++this.e;
   }
}
