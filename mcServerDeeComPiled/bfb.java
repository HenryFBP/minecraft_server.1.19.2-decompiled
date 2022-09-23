import com.google.common.collect.ImmutableMap;

public class bfb extends bdo<btp> {
   final bts a;

   public bfb(bts $$0) {
      super(ImmutableMap.of(bku.c, bkv.a, bku.g, bkv.a));
      this.a = $$0;
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      hb $$3 = (hb)$$1.dy().c(bku.c).get();
      $$0.x().c($$3.b()).ifPresent($$2x -> bdp.a($$1, $$2xx -> this.a($$3, $$2x, $$2xx)).reduce($$1, bfb::a));
   }

   private static btp a(btp $$0, btp $$1) {
      btp $$2;
      btp $$3;
      if ($$0.fJ() > $$1.fJ()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.dy().b(bku.c);
      return $$2;
   }

   private boolean a(hb $$0, hc<bmv> $$1, btp $$2) {
      return this.a($$2) && $$0.equals($$2.dy().c(bku.c).get()) && this.a($$1, $$2.fU().b());
   }

   private boolean a(hc<bmv> $$0, bts $$1) {
      return $$1.b().test($$0);
   }

   private boolean a(btp $$0) {
      return $$0.dy().c(bku.c).isPresent();
   }
}
