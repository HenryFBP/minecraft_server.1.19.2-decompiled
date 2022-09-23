import com.google.common.collect.ImmutableMap;

public class bgx extends bdo<btp> {
   public bgx() {
      super(ImmutableMap.of());
   }

   protected boolean a(agg $$0, btp $$1, long $$2) {
      return b($$1) || a($$1);
   }

   protected void b(agg $$0, btp $$1, long $$2) {
      if (b($$1) || a($$1)) {
         bcx<?> $$3 = $$1.dy();
         if (!$$3.c(bvn.g)) {
            $$3.b(bku.t);
            $$3.b(bku.m);
            $$3.b(bku.n);
            $$3.b(bku.r);
            $$3.b(bku.q);
         }

         $$3.a(bvn.g);
      }

   }

   protected void c(agg $$0, btp $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }

   }

   public static boolean a(bcc $$0) {
      return $$0.dy().a(bku.A);
   }

   public static boolean b(bcc $$0) {
      return $$0.dy().a(bku.x);
   }
}
