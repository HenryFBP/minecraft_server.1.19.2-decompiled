import com.mojang.serialization.Codec;

public class dju extends dki {
   private static final dju c = new dju();
   public static Codec<dju> a = Codec.unit(() -> c);

   private dju() {
   }

   public static dju a() {
      return c;
   }

   @Override
   protected boolean a(dkh $$0, amn $$1, gt $$2) {
      dkg $$3 = (dkg)$$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      hc<cht> $$4 = $$0.d().w($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dkk<?> b() {
      return dkk.e;
   }
}
