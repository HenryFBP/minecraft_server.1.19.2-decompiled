import com.google.common.collect.ImmutableMap;

public class bhj<E extends btg> extends bdo<E> {
   private static final double a = 6.0;
   private static final double d = 20.0;

   public bhj(int $$0) {
      super(ImmutableMap.of(bku.az, bkv.a, bku.o, bkv.b, bku.m, bkv.b, bku.n, bkv.c, bku.B, bkv.c, bku.ax, bkv.c, bku.aE, bkv.c), $$0);
   }

   protected boolean a(agg $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(agg $$0, E $$1, long $$2) {
      $$1.a(ajw.wI, 5.0F, 1.0F);
   }

   protected void c(agg $$0, E $$1, long $$2) {
      if ($$1.c(bco.l)) {
         $$1.b(bco.a);
      }

      $$1.dy().b(bku.az);
      $$1.dy().c(bku.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dy().a(bku.ax)) {
            bth.a($$1, $$1x.da());
         }

      });
   }
}
