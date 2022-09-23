import com.google.common.collect.ImmutableMap;

public class bgu extends bdo<btp> {
   private static final int a = 36;

   public bgu() {
      super(ImmutableMap.of());
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      boolean $$3 = bgx.b($$1) || bgx.a($$1) || a($$1);
      if (!$$3) {
         $$1.dy().b(bku.x);
         $$1.dy().b(bku.y);
         $$1.dy().a($$0.V(), $$0.U());
      }

   }

   private static boolean a(btp $$0) {
      return $$0.dy().c(bku.y).filter($$1 -> $$1.f($$0) <= 36.0).isPresent();
   }
}
