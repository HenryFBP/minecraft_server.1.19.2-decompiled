import com.google.common.collect.ImmutableMap;

public class bhg extends bdo<btg> {
   private static final int a = 25;
   private static final int d = 20;

   public bhg() {
      super(ImmutableMap.of(bku.aw, bkv.a, bku.o, bkv.b, bku.aD, bkv.c, bku.aB, bkv.c), bth.b);
   }

   protected void a(agg $$0, btg $$1, long $$2) {
      bcx<btg> $$3 = $$1.dy();
      $$3.a(bku.aB, anf.a, 25L);
      $$3.b(bku.m);
      bcc $$4 = (bcc)$$1.dy().c(bku.aw).get();
      bdp.a($$1, $$4);
      $$1.b(bco.k);
      $$1.a($$4, 20, false);
   }

   protected boolean b(agg $$0, btg $$1, long $$2) {
      return true;
   }

   protected void c(agg $$0, btg $$1, long $$2) {
      if (!$$1.dy().a(bku.aB) && !$$1.dy().a(bku.aD)) {
         $$1.dy().a(bku.aD, anf.a, (long)(bth.b - 25));
         $$1.a(ajw.wH, 3.0F, 1.0F);
      }
   }

   protected void d(agg $$0, btg $$1, long $$2) {
      if ($$1.c(bco.k)) {
         $$1.b(bco.a);
      }

      $$1.dy().c(bku.aw).ifPresent($$1::k);
      $$1.dy().b(bku.aw);
   }
}
