import com.mojang.serialization.Codec;

public class dif extends dhw {
   public static final Codec<dif> b = cvo.b.fieldOf("state").xmap(dif::new, $$0 -> $$0.c).codec();
   private final cvo c;

   protected dif(cvo $$0) {
      this.c = $$0;
   }

   @Override
   protected dhx<?> a() {
      return dhx.a;
   }

   @Override
   public cvo a(amn $$0, gt $$1) {
      return this.c;
   }
}
