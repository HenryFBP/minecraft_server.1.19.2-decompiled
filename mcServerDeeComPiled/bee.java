import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bee<E extends bcc & btn> extends bdo<E> {
   private static final int a = 3;
   private static final int d = 60;
   private final Function<bcc, Optional<bfc>> e;
   private final float f;

   public bee(Function<bcc, Optional<bfc>> $$0, float $$1) {
      super(Map.of(bku.n, bkv.c, bku.m, bkv.c, bku.aN, bkv.c));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      return this.a($$1);
   }

   @Override
   protected boolean b(agg $$0, E $$1, long $$2) {
      return this.a($$1);
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      ((Optional)this.e.apply($$1)).ifPresent($$1x -> bdp.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void d(agg $$0, E $$1, long $$2) {
      Optional<bfc> $$3 = (Optional)this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bfc $$4 = (bfc)$$3.get();
         double $$5 = $$4.a().f($$1.bj());
         if ($$5 < 3.0) {
            cax $$6 = $$1.t().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof boi $$7) {
                  boj.a((bcc)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dy().a(bku.aN, 60);
            }
         }

      }
   }

   private void a(bfc $$0, cax $$1, agh $$2) {
      gt $$3 = $$0.b().c();
      aj.X.a($$2, $$3, $$1);
   }

   private boolean a(E $$0) {
      if ($$0.t().c()) {
         return false;
      } else {
         Optional<bfc> $$1 = (Optional)this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static dwq a(bfc $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bcc $$0, cax $$1, dwq $$2) {
      dwq $$3 = new dwq(0.2F, 0.3F, 0.2F);
      bdp.a($$0, $$1, $$2, $$3, 0.2F);
      cgx $$4 = $$0.s;
      if ($$4.U() % 7L == 0L && $$4.w.j() < 0.9) {
         float $$5 = ad.a((List)boi.d, $$4.r_());
         $$4.a(null, $$0, ajw.g, ajx.g, 1.0F, $$5);
      }

   }
}
