import com.google.common.collect.ImmutableMap;

public class bmc extends bls {
   private static final ImmutableMap<bbr<?>, Float> a = ImmutableMap.builder()
      .put(bbr.u, 8.0F)
      .put(bbr.A, 12.0F)
      .put(bbr.Q, 8.0F)
      .put(bbr.R, 12.0F)
      .put(bbr.at, 15.0F)
      .put(bbr.ay, 12.0F)
      .put(bbr.aY, 8.0F)
      .put(bbr.ba, 10.0F)
      .put(bbr.bi, 10.0F)
      .put(bbr.bj, 8.0F)
      .put(bbr.bl, 8.0F)
      .build();

   @Override
   protected boolean a(bcc $$0, bcc $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bcc $$0, bcc $$1) {
      float $$2 = a.get($$1.ad());
      return $$1.f((bbn)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bku<bcc> b() {
      return bku.A;
   }

   private boolean b(bcc $$0) {
      return a.containsKey($$0.ad());
   }
}
