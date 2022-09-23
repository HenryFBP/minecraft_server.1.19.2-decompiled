import com.google.common.collect.ImmutableMap;

public class bfi extends bdo<btp> {
   public bfi() {
      super(ImmutableMap.of(bku.c, bkv.b));
   }

   protected boolean a(agg $$0, btp $$1) {
      btq $$2 = $$1.fU();
      return $$2.b() != bts.b && $$2.b() != bts.m && $$1.fJ() == 0 && $$2.c() <= 1;
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      $$1.a($$1.fU().a(bts.b));
      $$1.c($$0);
   }
}
